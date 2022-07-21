
# VrfMetalGateway

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdBy** | [**InlineResponse200Devices**](InlineResponse200Devices.md) |  |  [optional]
**href** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**ipReservation** | [**InlineResponse20052IpAddresses**](InlineResponse20052IpAddresses.md) |  |  [optional]
**project** | [**InlineResponse2011Project**](InlineResponse2011Project.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The current state of the Metal Gateway. &#39;Ready&#39; indicates the gateway record has been configured, but is currently not active on the network. &#39;Active&#39; indicates the gateway has been configured on the network. &#39;Deleting&#39; is a temporary state used to indicate that the gateway is in the process of being un-configured from the network, after which the gateway record will be deleted. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**virtualNetwork** | [**InlineResponse20045VirtualNetworks**](InlineResponse20045VirtualNetworks.md) |  |  [optional]
**vrf** | [**InlineResponse20046Vrfs**](InlineResponse20046Vrfs.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
READY | &quot;ready&quot;
ACTIVE | &quot;active&quot;
DELETING | &quot;deleting&quot;



