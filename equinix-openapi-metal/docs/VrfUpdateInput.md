

# VrfUpdateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bgpDynamicNeighborsEnabled** | **Boolean** | Toggle to enable the dynamic bgp neighbors feature on the VRF |  [optional] |
|**bgpDynamicNeighborsExportRouteMap** | **Boolean** | Toggle to export the VRF route-map to the dynamic bgp neighbors |  [optional] |
|**bgpDynamicNeighborsBfdEnabled** | **Boolean** | Toggle BFD on dynamic bgp neighbors sessions |  [optional] |
|**description** | **String** |  |  [optional] |
|**ipRanges** | **List&lt;String&gt;** | A list of CIDR network addresses. Like [\&quot;10.0.0.0/16\&quot;, \&quot;2001:d78::/56\&quot;]. IPv4 blocks must be between /8 and /29 in size. IPv6 blocks must be between /56 and /64. A VRF\\&#39;s IP ranges must be defined in order to create VRF IP Reservations, which can then be used for Metal Gateways or Virtual Circuits. Adding a new CIDR address to the list will result in the creation of a new IP Range for this VRF. Removal of an existing CIDR address from the list will result in the deletion of an existing IP Range for this VRF. Deleting an IP Range will result in the deletion of any VRF IP Reservations contained within the IP Range, as well as the VRF IP Reservation\\&#39;s associated Metal Gateways or Virtual Circuits. If you do not wish to add or remove IP Ranges, either include the full existing list of IP Ranges in the update request, or do not specify the &#x60;ip_ranges&#x60; field in the update request. Specifying a value of &#x60;[]&#x60; will remove all existing IP Ranges from the VRF. |  [optional] |
|**localAsn** | **Integer** | The new &#x60;local_asn&#x60; value for the VRF. This field cannot be updated when there are active Interconnection Virtual Circuits associated to the VRF, or if any of the VLANs of the VRF&#39;s metal gateway has been assigned on an instance. |  [optional] |
|**name** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



