

# IPReservationListIpAddressesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addon** | **Boolean** |  |  [optional] |
|**address** | **String** |  |  [optional] |
|**addressFamily** | **Integer** |  |  [optional] |
|**assignments** | [**List&lt;IPAssignment&gt;**](IPAssignment.md) |  |  [optional] |
|**available** | **String** |  |  [optional] |
|**bill** | **Boolean** |  |  [optional] |
|**cidr** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**customdata** | **Object** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**details** | **String** |  |  [optional] |
|**facility** | [**IPReservationFacility**](IPReservationFacility.md) |  |  [optional] |
|**gateway** | **String** |  |  [optional] |
|**globalIp** | **Boolean** |  |  [optional] |
|**href** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**manageable** | **Boolean** |  |  [optional] |
|**management** | **Boolean** |  |  [optional] |
|**metalGateway** | [**MetalGatewayLite**](MetalGatewayLite.md) |  |  [optional] |
|**metro** | [**Metro**](Metro.md) |  |  [optional] |
|**netmask** | **String** |  |  [optional] |
|**network** | **String** |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**projectLite** | [**Project**](Project.md) |  |  [optional] |
|**requestedBy** | [**Href**](Href.md) |  |  [optional] |
|**_public** | **Boolean** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**createdBy** | [**Href**](Href.md) |  |  [optional] |
|**vrf** | [**Vrf**](Vrf.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GLOBAL_IPV4 | &quot;global_ipv4&quot; |
| PUBLIC_IPV4 | &quot;public_ipv4&quot; |
| PRIVATE_IPV4 | &quot;private_ipv4&quot; |
| PUBLIC_IPV6 | &quot;public_ipv6&quot; |
| VRF | &quot;vrf&quot; |



