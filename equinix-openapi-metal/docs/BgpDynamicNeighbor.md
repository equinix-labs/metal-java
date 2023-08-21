

# BgpDynamicNeighbor


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier for the resource |  [optional] [readonly] |
|**bgpNeighborAsn** | **Integer** | The ASN of the dynamic BGP neighbor |  [optional] |
|**bgpNeighborRange** | **String** | Network range of the dynamic BGP neighbor in CIDR format |  [optional] |
|**metalGateway** | [**VrfMetalGateway**](VrfMetalGateway.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] [readonly] |
|**href** | **String** |  |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**createdBy** | [**UserLimited**](UserLimited.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| DELETING | &quot;deleting&quot; |
| PENDING | &quot;pending&quot; |
| READY | &quot;ready&quot; |



