

# PortVlanAssignmentBatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**errorMessages** | **List&lt;String&gt;** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**port** | [**Port**](Port.md) |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**vlanAssignments** | [**List&lt;PortVlanAssignmentBatchVlanAssignmentsInner&gt;**](PortVlanAssignmentBatchVlanAssignmentsInner.md) |  |  [optional] |
|**project** | [**Href**](Href.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |



