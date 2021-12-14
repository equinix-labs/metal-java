
# PortVlanAssignmentBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**errorMessages** | **List&lt;String&gt;** |  |  [optional]
**quantity** | **Integer** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**port** | [**Port**](Port.md) |  |  [optional]
**vlanAssignments** | [**List&lt;PortVlanAssignmentBatchVlanAssignments&gt;**](PortVlanAssignmentBatchVlanAssignments.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
QUEUED | &quot;queued&quot;
IN_PROGRESS | &quot;in_progress&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;



