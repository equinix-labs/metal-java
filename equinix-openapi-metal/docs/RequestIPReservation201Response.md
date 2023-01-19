

# RequestIPReservation201Response


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
|**metro** | [**IPReservationMetro**](IPReservationMetro.md) |  |  [optional] |
|**netmask** | **String** |  |  [optional] |
|**network** | **String** |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**projectLite** | [**Href**](Href.md) |  |  [optional] |
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
| VRF | &quot;vrf&quot; |



