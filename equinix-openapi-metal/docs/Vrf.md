

# Vrf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** | Optional field that can be set to describe the VRF |  [optional] |
|**bill** | **Boolean** | True if the VRF is being billed. Usage will start when the first VRF Virtual Circuit is active, and will only stop when the VRF has been deleted. |  [optional] |
|**bgpDynamicNeighborsEnabled** | **Boolean** | Toggle to enable the dynamic bgp neighbors feature on the VRF |  [optional] |
|**bgpDynamicNeighborsExportRouteMap** | **Boolean** | Toggle to export the VRF route-map to the dynamic bgp neighbors |  [optional] |
|**bgpDynamicNeighborsBfdEnabled** | **Boolean** | Toggle BFD on dynamic bgp neighbors sessions |  [optional] |
|**localAsn** | **Integer** | A 4-byte ASN associated with the VRF. |  [optional] |
|**virtualCircuits** | [**List&lt;VrfVirtualCircuit&gt;**](VrfVirtualCircuit.md) | Virtual circuits that are in the VRF |  [optional] |
|**ipRanges** | **List&lt;String&gt;** | A list of CIDR network addresses. Like [\&quot;10.0.0.0/16\&quot;, \&quot;2001:d78::/56\&quot;]. |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**metro** | [**Metro**](Metro.md) |  |  [optional] |
|**createdBy** | [**User**](User.md) |  |  [optional] |
|**href** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



