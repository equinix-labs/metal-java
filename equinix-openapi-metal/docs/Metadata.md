

# Metadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**propertyClass** | **String** |  |  [optional] |
|**customdata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**facility** | **String** | The facility code of the instance |  [optional] |
|**hostname** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**iqn** | **String** |  |  [optional] |
|**metro** | **String** | The metro code of the instance |  [optional] |
|**network** | [**MetadataNetwork**](MetadataNetwork.md) |  |  [optional] |
|**operatingSystem** | **Object** |  |  [optional] |
|**plan** | **String** | The plan slug of the instance |  [optional] |
|**privateSubnets** | **List&lt;String&gt;** | An array of the private subnets |  [optional] |
|**reserved** | **Boolean** |  |  [optional] |
|**specs** | **Object** | The specs of the plan version of the instance |  [optional] |
|**sshKeys** | **List&lt;String&gt;** |  |  [optional] |
|**switchShortId** | **String** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The current state the instance is in.  * When an instance is initially created it will be in the &#x60;queued&#x60; state until it is picked up by the provisioner. * Once provisioning has begun on the instance it&#39;s state will move to &#x60;provisioning&#x60;. * When an instance is deleted, it will move to &#x60;deprovisioning&#x60; state until the deprovision is completed and the instance state moves to &#x60;deleted&#x60;. * If an instance fails to provision or deprovision it will move to &#x60;failed&#x60; state. * Once an instance has completed provisioning it will move to &#x60;active&#x60; state. * If an instance is currently powering off or powering on it will move to &#x60;powering_off&#x60; or &#x60;powering_on&#x60; states respectively.  * When the instance is powered off completely it will move to the &#x60;inactive&#x60; state. * When an instance is powered on completely it will move to the &#x60;active&#x60; state. * Using the reinstall action to install a new OS on the instance will cause the instance state to change to &#x60;reinstalling&#x60;. * When the reinstall action is complete the instance will move to &#x60;active&#x60; state. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**volumes** | **List&lt;String&gt;** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| PROVISIONING | &quot;provisioning&quot; |
| DEPROVISIONING | &quot;deprovisioning&quot; |
| REINSTALLING | &quot;reinstalling&quot; |
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| FAILED | &quot;failed&quot; |
| POWERING_ON | &quot;powering_on&quot; |
| POWERING_OFF | &quot;powering_off&quot; |
| DELETED | &quot;deleted&quot; |



