
# PortVlanAssignment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**_native** | **Boolean** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**vlan** | **Integer** |  |  [optional]
**port** | [**Href**](Href.md) |  |  [optional]
**virtualNetwork** | [**Href**](Href.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ASSIGNED | &quot;assigned&quot;
UNASSIGNING | &quot;unassigning&quot;



