
# VrfMetalGatewayCreateInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipReservationId** | [**UUID**](UUID.md) | The UUID an a VRF IP Reservation that belongs to the same project as the one in which the Metal Gateway is to be created. Additionally, the VRF IP Reservation and the Virtual Network must reside in the same Metro. | 
**virtualNetworkId** | [**UUID**](UUID.md) | THe UUID of a Metro Virtual Network that belongs to the same project as the one in which the Metal Gateway is to be created. Additionally, the Virtual Network and the VRF IP Reservation must reside in the same metro. | 



