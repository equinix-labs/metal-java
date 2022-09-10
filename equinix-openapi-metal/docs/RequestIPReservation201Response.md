

# RequestIPReservation201Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addon** | **Boolean** |  |  [optional] |
|**addressFamily** | **Integer** |  |  [optional] |
|**assignments** | [**List&lt;IPAssignment&gt;**](IPAssignment.md) |  |  [optional] |
|**bill** | **Boolean** |  |  [optional] |
|**cidr** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**facility** | [**IPReservationFacility**](IPReservationFacility.md) |  |  [optional] |
|**globalIp** | **Boolean** |  |  [optional] |
|**href** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**manageable** | **Boolean** |  |  [optional] |
|**management** | **Boolean** |  |  [optional] |
|**metalGateway** | [**MetalGatewayLite**](MetalGatewayLite.md) |  |  [optional] |
|**metro** | [**IPReservationMetro**](IPReservationMetro.md) |  |  [optional] |
|**netmask** | **String** |  |  [optional] |
|**network** | **String** |  |  [optional] |
|**_public** | **Boolean** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**details** | **String** |  |  [optional] |
|**customdata** | **Object** |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**projectLite** | [**Href**](Href.md) |  |  [optional] |
|**requestedBy** | [**User**](User.md) |  |  [optional] |
|**address** | **String** |  |  [optional] |
|**gateway** | **String** |  |  [optional] |
|**available** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**createdBy** | [**Href**](Href.md) |  |  [optional] |
|**vrf** | [**Vrf**](Vrf.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VRF | &quot;vrf&quot; |



