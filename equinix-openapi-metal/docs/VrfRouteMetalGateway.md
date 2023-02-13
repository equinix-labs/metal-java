

# VrfRouteMetalGateway

A link to the Metal Gateway to which this VRF Route is associated

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**createdBy** | [**Href**](Href.md) |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**ipReservation** | [**IPReservationOrHref**](IPReservationOrHref.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The current state of the Metal Gateway. &#39;Ready&#39; indicates the gateway record has been configured, but is currently not active on the network. &#39;Active&#39; indicates the gateway has been configured on the network. &#39;Deleting&#39; is a temporary state used to indicate that the gateway is in the process of being un-configured from the network, after which the gateway record will be deleted. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**virtualNetwork** | [**VirtualNetwork**](VirtualNetwork.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| ACTIVE | &quot;active&quot; |
| DELETING | &quot;deleting&quot; |



