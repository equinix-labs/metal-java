
# HardwareReservation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**customRate** | **Float** | Amount that will be charged for every billing_cycle. |  [optional]
**device** | [**InlineResponse2009**](InlineResponse2009.md) |  |  [optional]
**facility** | [**InlineResponse2009Facility**](InlineResponse2009Facility.md) |  |  [optional]
**href** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**needOfService** | **Boolean** | Whether this Device requires assistance from Metal Equinix. |  [optional]
**plan** | [**InlineResponse2009Plan**](InlineResponse2009Plan.md) |  |  [optional]
**project** | [**InlineResponse2011Project**](InlineResponse2011Project.md) |  |  [optional]
**provisionable** | **Boolean** | Whether the reserved server is provisionable or not. Spare devices can&#39;t be provisioned unless they are activated first. |  [optional]
**shortId** | **String** | Short version of the ID. |  [optional]
**spare** | **Boolean** | Whether the Hardware Reservation is a spare. Spare Hardware Reservations are used when a Hardware Reservations requires service from Metal Equinix |  [optional]
**switchUuid** | **String** | Switch short id. This can be used to determine if two devices are connected to the same switch, for example. |  [optional]



