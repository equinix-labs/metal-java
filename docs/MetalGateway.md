
# MetalGateway

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The current state of the Metal Gateway. &#39;Ready&#39; indicates the gateway record has been configured, but is currently not active on the network. &#39;Active&#39; indicates the gateway has been configured on the network. &#39;Deleting&#39; is a temporary state used to indicate that the gateway is in the process of being un-configured from the network, after which the gateway record will be deleted. |  [optional]
**project** | [**Href**](Href.md) |  |  [optional]
**virtualNetwork** | [**Href**](Href.md) |  |  [optional]
**ipReservation** | [**Href**](Href.md) |  |  [optional]
**href** | **String** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdBy** | [**Href**](Href.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
READY | &quot;ready&quot;
ACTIVE | &quot;active&quot;
DELETING | &quot;deleting&quot;



