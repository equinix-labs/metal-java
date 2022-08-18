package com.equinix.workflow.helpers;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.api.VlansApi;
import com.equinix.openapi.metal.v1.model.VirtualNetwork;
import com.equinix.openapi.metal.v1.model.VirtualNetworkCreateInput;

// Helper class wrapping over auto generated Vlan APIs including some additional methods
public class VlanHelper {
    private VlansApi vlansApi;

    public VlanHelper(ApiClient apiClient) {
        this.vlansApi = new VlansApi(apiClient);
    }

    // Returns the vlan queried by its id
    public VirtualNetwork getVlan(UUID vlanId) throws ApiException {
        return vlansApi.getVirtualNetwork(vlanId);
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

    // Delete vlan by id
    public void deleteVlan(UUID vlanId) throws ApiException {
        vlansApi.deleteVirtualNetwork(vlanId);
    }

}
