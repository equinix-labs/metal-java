

# CreateMetalGatewayRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ipReservationId** | **UUID** | The UUID an a VRF IP Reservation that belongs to the same project as the one in which the Metal Gateway is to be created. Additionally, the VRF IP Reservation and the Virtual Network must reside in the same Metro. |  |
|**privateIpv4SubnetSize** | **Integer** | The subnet size (8, 16, 32, 64, or 128) of the private IPv4 reservation that will be created for the metal gateway. This field is required unless a project IP reservation was specified.           Please keep in mind that the number of private metal gateway ranges are limited per project. If you would like to increase the limit per project, please contact support for assistance. |  [optional] |
|**virtualNetworkId** | **UUID** | THe UUID of a Metro Virtual Network that belongs to the same project as the one in which the Metal Gateway is to be created. Additionally, the Virtual Network and the VRF IP Reservation must reside in the same metro. |  |



