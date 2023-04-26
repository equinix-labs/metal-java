

# Plan


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availableIn** | [**List&lt;PlanAvailableInInner&gt;**](PlanAvailableInInner.md) | Shows which facilities the plan is available in, and the facility-based price if it is different from the default price. |  [optional] |
|**availableInMetros** | [**List&lt;PlanAvailableInMetrosInner&gt;**](PlanAvailableInMetrosInner.md) | Shows which metros the plan is available in, and the metro-based price if it is different from the default price. |  [optional] |
|**propertyClass** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**deploymentTypes** | [**Set&lt;DeploymentTypesEnum&gt;**](#Set&lt;DeploymentTypesEnum&gt;) |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**legacy** | **Boolean** | Deprecated. Always return false |  [optional] |
|**line** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**pricing** | **Object** |  |  [optional] |
|**slug** | **String** |  |  [optional] |
|**specs** | [**PlanSpecs**](PlanSpecs.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The plan type |  [optional] |



## Enum: Set&lt;DeploymentTypesEnum&gt;

| Name | Value |
|---- | -----|
| ON_DEMAND | &quot;on_demand&quot; |
| SPOT_MARKET | &quot;spot_market&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| WORKLOAD_OPTIMIZED | &quot;workload_optimized&quot; |
| CUSTOM | &quot;custom&quot; |



