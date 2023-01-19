

# FindMetalGatewayById200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**createdBy** | [**Href**](Href.md) |  |  [optional] |
|**href** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**ipReservation** | [**VrfIpReservation**](VrfIpReservation.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The current state of the Metal Gateway. &#39;Ready&#39; indicates the gateway record has been configured, but is currently not active on the network. &#39;Active&#39; indicates the gateway has been configured on the network. &#39;Deleting&#39; is a temporary state used to indicate that the gateway is in the process of being un-configured from the network, after which the gateway record will be deleted. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**virtualNetwork** | [**VirtualNetwork**](VirtualNetwork.md) |  |  [optional] |
|**vrf** | [**Vrf**](Vrf.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| ACTIVE | &quot;active&quot; |
| DELETING | &quot;deleting&quot; |



