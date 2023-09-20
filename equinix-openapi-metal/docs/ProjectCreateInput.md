

# ProjectCreateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customdata** | **Object** |  |  [optional] |
|**name** | **String** | The name of the project. Cannot contain characters encoded in greater than 3 bytes such as emojis. |  |
|**paymentMethodId** | **UUID** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the project. If no type is specified the project type will automatically be &#x60;default&#x60; Projects of type &#39;vmce&#39; are part of an in development feature and not available to all customers. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| VMCE | &quot;vmce&quot; |



