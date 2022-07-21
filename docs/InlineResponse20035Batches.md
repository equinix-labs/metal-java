
# InlineResponse20035Batches

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**errorMessages** | **List&lt;String&gt;** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**port** | [**InlineResponse20033**](InlineResponse20033.md) |  |  [optional]
**quantity** | **Integer** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**vlanAssignments** | [**List&lt;InlineResponse20035VlanAssignments&gt;**](InlineResponse20035VlanAssignments.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
QUEUED | &quot;queued&quot;
IN_PROGRESS | &quot;in_progress&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;



