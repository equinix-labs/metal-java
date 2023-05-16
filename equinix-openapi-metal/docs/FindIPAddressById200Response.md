

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
|**metro** | [**Metro**](Metro.md) |  |  [optional] |
|**netmask** | **String** |  |  [optional] |
|**network** | **String** |  |  [optional] |
|**parentBlock** | [**ParentBlock**](ParentBlock.md) |  |  [optional] |
|**_public** | **Boolean** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**nextHop** | **String** | Only set when this is a Metal Gateway Elastic IP Assignment.  The IP address within the Metal Gateway to which requests to the Elastic IP are forwarded.  |  [optional] |
|**addon** | **Boolean** |  |  [optional] |
|**assignments** | [**List&lt;IPAssignment&gt;**](IPAssignment.md) |  |  [optional] |
|**available** | **String** |  |  [optional] |
|**bill** | **Boolean** |  |  [optional] |
|**customdata** | **Object** |  |  [optional] |
|**details** | **String** |  |  [optional] |
|**facility** | [**IPReservationFacility**](IPReservationFacility.md) |  |  [optional] |
|**metalGateway** | [**MetalGatewayLite**](MetalGatewayLite.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**projectLite** | [**Project**](Project.md) |  |  [optional] |
|**requestedBy** | [**Href**](Href.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**createdBy** | [**Href**](Href.md) |  |  [optional] |
|**vrf** | [**Vrf**](Vrf.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VRF | &quot;vrf&quot; |



