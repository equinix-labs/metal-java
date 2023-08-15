

# VrfRoute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier for the newly-created resource |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the route. Potential values are \&quot;pending\&quot;, \&quot;active\&quot;, \&quot;deleting\&quot;, and \&quot;error\&quot;, representing various lifecycle states of the route and whether or not it has been successfully configured on the network |  [optional] [readonly] |
|**prefix** | **String** | The IPv4 prefix for the route, in CIDR-style notation |  [optional] |
|**nextHop** | **String** | The next-hop IPv4 address for the route |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | VRF route type, like &#39;bgp&#39;, &#39;connected&#39;, and &#39;static&#39;. Currently, only static routes are supported |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**metalGateway** | [**VrfMetalGateway**](VrfMetalGateway.md) |  |  [optional] |
|**virtualNetwork** | [**VirtualNetwork**](VirtualNetwork.md) |  |  [optional] |
|**vrf** | [**Vrf**](Vrf.md) |  |  [optional] |
|**href** | **String** |  |  [optional] [readonly] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| ACTIVE | &quot;active&quot; |
| DELETING | &quot;deleting&quot; |
| ERROR | &quot;error&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;static&quot; |



