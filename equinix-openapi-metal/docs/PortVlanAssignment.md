

# PortVlanAssignment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**_native** | **Boolean** |  |  [optional] |
|**port** | [**Href**](Href.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**virtualNetwork** | [**Href**](Href.md) |  |  [optional] |
|**vlan** | **Integer** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ASSIGNED | &quot;assigned&quot; |
| UNASSIGNING | &quot;unassigning&quot; |



