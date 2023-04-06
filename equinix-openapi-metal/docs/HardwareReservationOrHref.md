

# HardwareReservationOrHref


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**customRate** | **Float** | Amount that will be charged for every billing_cycle. |  [optional] |
|**device** | [**Device**](Device.md) |  |  [optional] |
|**facility** | [**Facility**](Facility.md) |  |  [optional] |
|**href** | **String** |  |  |
|**id** | **UUID** |  |  [optional] |
|**needOfService** | **Boolean** | Whether this Device requires assistance from Equinix Metal. |  [optional] |
|**plan** | [**Plan**](Plan.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**provisionable** | **Boolean** | Whether the reserved server is provisionable or not. Spare devices can&#39;t be provisioned unless they are activated first. |  [optional] |
|**shortId** | **String** | Short version of the ID. |  [optional] |
|**spare** | **Boolean** | Whether the Hardware Reservation is a spare. Spare Hardware Reservations are used when a Hardware Reservations requires service from Equinix Metal |  [optional] |
|**switchUuid** | **String** | Switch short id. This can be used to determine if two devices are connected to the same switch, for example. |  [optional] |
|**terminationTime** | **OffsetDateTime** | Expiration date for the reservation. |  [optional] |



