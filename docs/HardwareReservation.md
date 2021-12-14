
# HardwareReservation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**shortId** | **String** | Short version of the ID. |  [optional]
**facility** | [**Facility**](Facility.md) |  |  [optional]
**plan** | [**Plan**](Plan.md) |  |  [optional]
**href** | **String** |  |  [optional]
**project** | [**Project**](Project.md) |  |  [optional]
**device** | [**Device**](Device.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**spare** | **Boolean** | Whether the Hardware Reservation is a spare. Spare Hardware Reservations are used when a Hardware Reservations requires service from Metal Equinix |  [optional]
**needOfService** | **Boolean** | Whether this Device requires assistance from Metal Equinix. |  [optional]
**provisionable** | **Boolean** | Whether the reserved server is provisionable or not. Spare devices can&#39;t be provisioned unless they are activated first. |  [optional]
**customRate** | **Float** | Amount that will be charged for every billing_cycle. |  [optional]
**switchUuid** | **String** | Switch short id. This can be used to determine if two devices are connected to the same switch, for example. |  [optional]



