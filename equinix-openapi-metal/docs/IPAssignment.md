

# IPAssignment


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
|**metro** | [**IPAssignmentMetro**](IPAssignmentMetro.md) |  |  [optional] |
|**netmask** | **String** |  |  [optional] |
|**network** | **String** |  |  [optional] |
|**parentBlock** | [**ParentBlock**](ParentBlock.md) |  |  [optional] |
|**_public** | **Boolean** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Only set when this is a Metal Gateway Elastic IP Assignment.  Describes the current configuration state of this IP on the network.  |  [optional] |
|**nextHop** | **String** | Only set when this is a Metal Gateway Elastic IP Assignment.  The IP address within the Metal Gateway to which requests to the Elastic IP are forwarded.  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| ACTIVE | &quot;active&quot; |
| DELETING | &quot;deleting&quot; |



