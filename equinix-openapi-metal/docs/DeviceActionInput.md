

# DeviceActionInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Action to perform. See Device.actions for possible actions. |  |
|**forceDelete** | **Boolean** | May be required to perform actions under certain conditions |  [optional] |
|**deprovisionFast** | **Boolean** | When type is &#x60;reinstall&#x60;, enabling fast deprovisioning will bypass full disk wiping. |  [optional] |
|**preserveData** | **Boolean** | When type is &#x60;reinstall&#x60;, preserve the existing data on all disks except the operating-system disk. |  [optional] |
|**operatingSystem** | **String** | When type is &#x60;reinstall&#x60;, use this &#x60;operating_system&#x60; (defaults to the current &#x60;operating system&#x60;) |  [optional] |
|**ipxeScriptUrl** | **String** | When type is &#x60;reinstall&#x60;, use this &#x60;ipxe_script_url&#x60; (&#x60;operating_system&#x60; must be &#x60;custom_ipxe&#x60;, defaults to the current &#x60;ipxe_script_url&#x60;) |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| POWER_ON | &quot;power_on&quot; |
| POWER_OFF | &quot;power_off&quot; |
| REBOOT | &quot;reboot&quot; |
| RESCUE | &quot;rescue&quot; |
| REINSTALL | &quot;reinstall&quot; |



