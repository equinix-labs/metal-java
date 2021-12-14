
# MetalGatewayInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**virtualNetworkId** | [**UUID**](UUID.md) | The UUID of a metro virtual network that belongs to the same project as where the metal gateway will be created in. | 
**ipReservationId** | [**UUID**](UUID.md) | The UUID of an IP reservation that belongs to the same project as where the metal gateway will be created in. This field is required unless the private IPv4 subnet size is specified. |  [optional]
**privateIpv4SubnetSize** | **Integer** | The subnet size (8, 16, 32, 64, or 128) of the private IPv4 reservation that will be created for the metal gateway. This field is required unless a project IP reservation was specified.           Please keep in mind that the number of private metal gateway ranges are limited per project. If you would like to increase the limit per project, please contact support for assistance. |  [optional]



