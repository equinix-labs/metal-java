package com.equinix.workflow;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;
import com.equinix.openapi.metal.v1.model.CreateMetalGatewayRequest;
import com.equinix.openapi.metal.v1.model.MetalGateway;
import com.equinix.openapi.metal.v1.model.MetalGateway.StateEnum;
import com.equinix.openapi.metal.v1.model.MetalGatewayInput;
import com.equinix.openapi.metal.v1.model.VirtualNetwork;
import com.equinix.workflow.helpers.VlanHelper;

public class MetalGatewayOperator {
    private MetalGatewaysApi metalGatewaysApi;
    private VlanHelper vlanHelper;
    private final List<StateEnum> targetState= Arrays.asList(StateEnum.ACTIVE, StateEnum.READY);

    public MetalGatewayOperator(ApiClient apiClient) {
        this.metalGatewaysApi = new MetalGatewaysApi(apiClient);
        this.vlanHelper = new VlanHelper(apiClient);
    }

    // Returns the metal gateway queried by its id
    public MetalGateway getMetalGateway(UUID metalGatewayId, List<String> include, List<String> exclude) throws ApiException {
        return metalGatewaysApi.findMetalGatewayById(metalGatewayId, include, exclude);
    }

    // Returns the vlan associated with the metal gateway queried by its id
    public VirtualNetwork getVlanOfMetalGateway(UUID metalGatewayId) throws ApiException {
        MetalGateway metalGateway = getMetalGateway(metalGatewayId, Collections.singletonList("virtual_network"), null);
        return metalGateway.getVirtualNetwork();
    }

    // Creates a Metal Gateway with a private IPv4 block specified for the associated Virtual Network
    public MetalGateway createMetalGatewayWithPrivateIpBlockAndPoll(UUID projectId, String metro, Integer vxlan, Integer privateIpv4SubnetSize, int retries, Duration wait)
            throws ApiException, InterruptedException {

        VirtualNetwork vlan = vlanHelper.getVlanByVxlanInProjectMetro(projectId, metro, vxlan);
        if (vlan==null)
            vlan = vlanHelper.createVlan(projectId, metro, vxlan);

        MetalGatewayInput metalGatewayInput = new MetalGatewayInput()
                .privateIpv4SubnetSize(privateIpv4SubnetSize)
                .virtualNetworkId(vlan.getId());

        CreateMetalGatewayRequest createMetalGatewayRequest = new CreateMetalGatewayRequest(metalGatewayInput);
        MetalGateway metalGateway  = metalGatewaysApi.createMetalGateway(projectId, createMetalGatewayRequest,1, 10);
        return metalGatewayCreatedAndPoll(metalGateway, retries, wait);
    }

    // Poll until state of metal gateway becomes "active" or "ready"
    private MetalGateway metalGatewayCreatedAndPoll(MetalGateway metalGateway, int retries, Duration wait)
            throws ApiException, InterruptedException {

        UUID metalGatewayId;
        for (int i=0; i<retries && !targetState.contains(metalGateway.getState()); i++) {
            metalGatewayId = metalGateway.getId();
            Thread.sleep(wait.toMillis());
            metalGateway = getMetalGateway(metalGatewayId, null, null);
        }
        return metalGateway;
    }

    // Delete metal gateway by id
    public void deleteMetalGateway(UUID metalGatewayId)
            throws ApiException {
        metalGatewaysApi.deleteMetalGateway(metalGatewayId);
    }

    // Delete the vlan and associated metal gateway
    public void deleteVlanAndMetalGateway(UUID metalGatewayId) throws ApiException {

        VirtualNetwork vlan = getVlanOfMetalGateway(metalGatewayId);
        if (vlan!=null)
            vlanHelper.deleteVlan(vlan.getId());    // deleting vlan also deletes the associated metal gateways
        else
            deleteMetalGateway(metalGatewayId);
    }
}