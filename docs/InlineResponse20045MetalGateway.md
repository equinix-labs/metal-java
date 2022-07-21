
# InlineResponse20045MetalGateway

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**gatewayAddress** | **String** | The gateway address with subnet CIDR value for this Metal Gateway. For example, a Metal Gateway using an IP reservation with block 10.1.2.0/27 would have a gateway address of 10.1.2.1/27. |  [optional]
**href** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The current state of the Metal Gateway. &#39;Ready&#39; indicates the gateway record has been configured, but is currently not active on the network. &#39;Active&#39; indicates the gateway has been configured on the network. &#39;Deleting&#39; is a temporary state used to indicate that the gateway is in the process of being un-configured from the network, after which the gateway record will be deleted. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**vlan** | [**BigDecimal**](BigDecimal.md) | The VLAN id of the Virtual Network record associated to this Metal Gateway. Example: 1001. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
READY | &quot;ready&quot;
ACTIVE | &quot;active&quot;
DELETING | &quot;deleting&quot;



