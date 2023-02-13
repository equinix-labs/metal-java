

# VrfIpReservationOrHref


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressFamily** | **Integer** |  |  [optional] |
|**cidr** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**createdBy** | [**Href**](Href.md) |  |  [optional] |
|**details** | **String** |  |  [optional] |
|**href** | **String** |  |  |
|**id** | **UUID** |  |  [optional] |
|**metalGateway** | [**MetalGatewayLite**](MetalGatewayLite.md) |  |  [optional] |
|**netmask** | **String** |  |  [optional] |
|**network** | **String** |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**vrf** | [**Vrf**](Vrf.md) |  |  |
|**_public** | **Boolean** |  |  [optional] |
|**management** | **Boolean** |  |  [optional] |
|**manageable** | **Boolean** |  |  [optional] |
|**customdata** | **Object** |  |  [optional] |
|**bill** | **Boolean** |  |  [optional] |
|**projectLite** | [**Project**](Project.md) |  |  [optional] |
|**address** | **String** |  |  [optional] |
|**gateway** | **String** |  |  [optional] |
|**metro** | [**Metro**](Metro.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VRF | &quot;vrf&quot; |



