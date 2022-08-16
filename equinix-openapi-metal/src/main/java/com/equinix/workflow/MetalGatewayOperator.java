package com.equinix.workflow;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;
import com.equinix.openapi.metal.v1.api.VlansApi;
import com.equinix.openapi.metal.v1.model.CreateMetalGatewayRequest;
import com.equinix.openapi.metal.v1.model.FindMetalGatewayById200Response;
import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.MetalGateway;
import com.equinix.openapi.metal.v1.model.MetalGateway.StateEnum;
import com.equinix.openapi.metal.v1.model.MetalGatewayInput;
import com.equinix.openapi.metal.v1.model.VirtualNetwork;
import com.equinix.openapi.metal.v1.model.VirtualNetworkCreateInput;

public class MetalGatewayOperator {
    private MetalGatewaysApi metalGatewaysApi;
    private VlansApi vlansApi;
    private final List<StateEnum> targetState= Arrays.asList(StateEnum.ACTIVE, StateEnum.READY);

    public MetalGatewayOperator(ApiClient apiClient) {
        this.metalGatewaysApi = new MetalGatewaysApi(apiClient);
        this.vlansApi = new VlansApi(apiClient);
    }

    // Returns the metal gateway queried by its id
    public MetalGateway getMetalGateway(UUID metalGatewayId, List<String> include, List<String> exclude) throws ApiException {
        FindMetalGatewayById200Response response = metalGatewaysApi.findMetalGatewayById(metalGatewayId, include, exclude);
        return response.getMetalGateway();
    }

    // Returns the vlan queried by its id
    public VirtualNetwork getVlan(UUID vlanId) throws ApiException {
        return vlansApi.getVirtualNetwork(vlanId);
    }

    // Returns the vlan associated with the metal gateway queried by its id
    public VirtualNetwork getVlanOfMetalGateway(UUID metalGatewayId) throws ApiException {
        MetalGateway metalGateway = getMetalGateway(metalGatewayId, Collections.singletonList("virtual_network"), null);
        return metalGateway.getVirtualNetwork();
    }

    // Returns a vlan in a project metro by its vxlan identifier
    public VirtualNetwork getVlanByVxlanInProjectMetro(UUID projectId, String metro, Integer vxlan) throws ApiException {
        VirtualNetwork vlan = null;
        List<VirtualNetwork> vlanList = vlansApi.findVirtualNetworks(projectId, null, null, null, metro).getVirtualNetworks();
        if (vlanList!=null && !vlanList.isEmpty()) {
            Optional<VirtualNetwork> requiredVlan = vlanList.stream()
                    .filter(vlanObj -> Objects.equals(vlanObj.getVxlan(), vxlan))
                    .findFirst();
            if (requiredVlan.isPresent())
                vlan = requiredVlan.get();
        }
        return vlan;
    }

    // Create a vlan
    public VirtualNetwork createVlan(UUID projectId, String metro, Integer vxlan) throws ApiException {
        VirtualNetworkCreateInput vlanInput=new VirtualNetworkCreateInput()
                .metro(metro)
                .projectId(projectId)
                .vxlan(vxlan);
        return vlansApi.createVirtualNetwork(projectId, vlanInput);
    }

    // Metal Gateway creation workflow
    public MetalGateway createMetalGatewayWithPrivateIpBlockAndPoll(UUID projectId, String metro, Integer vxlan, Integer privateIpv4SubnetSize, int retries, Duration wait)
            throws ApiException, InterruptedException {

        VirtualNetwork vlan = getVlanByVxlanInProjectMetro(projectId, metro, vxlan);
        if (vlan==null)
            vlan = createVlan(projectId, metro, vxlan);

        MetalGatewayInput metalGatewayInput = new MetalGatewayInput()
                .privateIpv4SubnetSize(privateIpv4SubnetSize)
                .virtualNetworkId(vlan.getId());

        CreateMetalGatewayRequest createMetalGatewayRequest = new CreateMetalGatewayRequest(metalGatewayInput);
        FindMetalGatewayById200Response response = metalGatewaysApi.createMetalGateway(projectId, createMetalGatewayRequest,1, 10);
        MetalGateway metalGateway = response.getMetalGateway();
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

    // Delete vlan by id
    public void deleteVlan(UUID vlanId) throws ApiException {
        vlansApi.deleteVirtualNetwork(vlanId);
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
            deleteVlan(vlan.getId());    // deleting vlan also deletes the associated metal gateways
        else
            deleteMetalGateway(metalGatewayId);
    }
}