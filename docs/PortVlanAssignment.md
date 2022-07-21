
# PortVlanAssignment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**_native** | **Boolean** |  |  [optional]
**port** | [**InlineResponse200Devices**](InlineResponse200Devices.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**virtualNetwork** | [**InlineResponse200Devices**](InlineResponse200Devices.md) |  |  [optional]
**vlan** | **Integer** |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ASSIGNED | &quot;assigned&quot;
UNASSIGNING | &quot;unassigning&quot;



