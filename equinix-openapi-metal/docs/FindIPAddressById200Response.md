

# FindIPAddressById200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** |  |  [optional] |
|**addressFamily** | **Integer** |  |  [optional] |
|**assignedTo** | [**Href**](Href.md) |  |  [optional] |
|**cidr** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**gateway** | **String** |  |  [optional] |
|**globalIp** | **Boolean** |  |  [optional] |
|**href** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**manageable** | **Boolean** |  |  [optional] |
|**management** | **Boolean** |  |  [optional] |
|**metro** | [**IPReservationMetro**](IPReservationMetro.md) |  |  [optional] |
|**netmask** | **String** |  |  [optional] |
|**network** | **String** |  |  [optional] |
|**parentBlock** | [**ParentBlock**](ParentBlock.md) |  |  [optional] |
|**_public** | **Boolean** |  |  [optional] |
|**addon** | **Boolean** |  |  [optional] |
|**assignments** | [**List&lt;IPAssignment&gt;**](IPAssignment.md) |  |  [optional] |
|**bill** | **Boolean** |  |  [optional] |
|**facility** | [**IPReservationFacility**](IPReservationFacility.md) |  |  [optional] |
|**metalGateway** | [**MetalGatewayLite**](MetalGatewayLite.md) |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**details** | **String** |  |  [optional] |
|**customdata** | **Object** |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**projectLite** | [**Href**](Href.md) |  |  [optional] |
|**requestedBy** | [**User**](User.md) |  |  [optional] |
|**available** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**createdBy** | [**Href**](Href.md) |  |  [optional] |
|**vrf** | [**Vrf**](Vrf.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VRF | &quot;vrf&quot; |



