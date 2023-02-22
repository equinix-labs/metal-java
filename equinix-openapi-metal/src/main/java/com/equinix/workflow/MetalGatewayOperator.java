package com.equinix.workflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.time.Duration;
import java.util.List;
import java.util.UUID;

import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;
import com.equinix.openapi.metal.v1.model.CreateMetalGatewayRequest;
import com.equinix.openapi.metal.v1.model.MetalGateway;
import com.equinix.openapi.metal.v1.model.MetalGateway.StateEnum;
import com.equinix.openapi.metal.v1.model.MetalGatewayCreateInput;
import com.equinix.openapi.metal.v1.model.VirtualNetwork;
import com.equinix.workflow.helpers.VlanHelper;

public class MetalGatewayOperator {
    private MetalGatewaysApi metalGatewaysApi;
    private VlanHelper vlanHelper;
    private static final Integer RESPONSE_PAGE = 1;
    private static final Integer RESPONSE_ITEMS_PER_PAGE = 10;
    private static final String VIRTUAL_NETWORK = "virtual_network";

    public MetalGatewayOperator(ApiClient apiClient) {
        this.metalGatewaysApi = new MetalGatewaysApi(apiClient);
        this.vlanHelper = new VlanHelper(apiClient);
    }

    // Returns the metal gateway queried by its id
    public MetalGateway getMetalGateway(UUID metalGatewayId, List<String> include, List<String> exclude) throws ApiException {
        return metalGatewaysApi.findMetalGatewayById(metalGatewayId, include, exclude).getMetalGateway();
    }

    // Returns the vlan associated with the metal gateway queried by its id
    public VirtualNetwork getVlanOfMetalGateway(UUID metalGatewayId) throws ApiException {
        MetalGateway metalGateway = getMetalGateway(metalGatewayId, Collections.singletonList(VIRTUAL_NETWORK), null);
        return metalGateway.getVirtualNetwork();
    }

    // Creates a Metal Gateway with a private IPv4 block specified for the associated Virtual Network
    public MetalGateway createMetalGatewayWithPrivateIpBlock(UUID projectId, String metro, Integer vxlan, Integer privateIpv4SubnetSize)
            throws ApiException, InterruptedException {

        VirtualNetwork vlan = vlanHelper.getVlanByVxlanInProjectMetro(projectId, metro, vxlan);
        if (vlan==null)
            vlan = vlanHelper.createVlan(projectId, metro, vxlan);

        MetalGatewayCreateInput metalGatewayCreateInput = new MetalGatewayCreateInput()
                .privateIpv4SubnetSize(privateIpv4SubnetSize)
                .virtualNetworkId(vlan.getId());

        CreateMetalGatewayRequest createMetalGatewayRequest = new CreateMetalGatewayRequest(metalGatewayCreateInput);
        return createMetalGateway(projectId, createMetalGatewayRequest);
    }

    /**
     * General wrapper to create metal gateway. Types of inputs supported in the request:
     * 1. MetalGatewayCreateInput: for a regular metal gateway with reserved or private ip block
     * 2. VrfMetalGatewayCreateInput: for a vrf metal gateway with a reserved ip block
     */
    public MetalGateway createMetalGateway(UUID projectId, CreateMetalGatewayRequest metalGatewayRequest)
            throws ApiException {
        return metalGatewaysApi.createMetalGateway(projectId, metalGatewayRequest, null, null, RESPONSE_PAGE, RESPONSE_ITEMS_PER_PAGE).getMetalGateway();
    }

    // Poll until metal gateway record is deleted when state is "deleting"
    private void metalGatewayDeletedAndPoll(MetalGateway metalGateway, int retries, Duration wait)
            throws InterruptedException, ApiException {

        UUID metalGatewayId = metalGateway.getId();
        for (int i=0; i<retries; i++) {
            try {
                metalGateway = getMetalGateway(metalGatewayId, null, null);
            }
            catch (ApiException e) {
                if (e.getCode()==404)
                    return;
                else
                    throw e;
            }
            metalGatewayId = metalGateway.getId();
            Thread.sleep(wait.toMillis());
        }
        throw new ApiException(500, "Polling timed out for metal gateway deletion, State: " + metalGateway.getState());
    }

    // Delete metal gateway by id
    public void deleteMetalGatewayAndPoll(UUID metalGatewayId, List<String> include, List<String> exclude, int retries, Duration wait)
            throws ApiException, InterruptedException {
        MetalGateway metalGateway = getMetalGateway(metalGatewayId, null, null);
        metalGatewaysApi.deleteMetalGateway(metalGatewayId, include, exclude);
        metalGatewayDeletedAndPoll(metalGateway, retries, wait);
    }

    // Delete the vlan and associated metal gateway
    public void deleteVlanAndMetalGateway(UUID metalGatewayId, int retries, Duration wait)
            throws ApiException, InterruptedException {

        MetalGateway metalGateway = getMetalGateway(metalGatewayId, Collections.singletonList(VIRTUAL_NETWORK), null);
        VirtualNetwork vlan = metalGateway.getVirtualNetwork();
        if (vlan!=null) {
            vlanHelper.deleteVlan(vlan.getId());    // deleting vlan also deletes the associated metal gateways
            metalGatewayDeletedAndPoll(metalGateway, retries, wait);
        }
        else
            deleteMetalGatewayAndPoll(metalGatewayId, new ArrayList<String>(), new ArrayList<String>(), retries, wait);
    }
}
