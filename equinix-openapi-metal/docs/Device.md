

# Device


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alwaysPxe** | **Boolean** |  |  [optional] |
|**billingCycle** | **String** |  |  [optional] |
|**bondingMode** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**createdBy** | [**DeviceCreatedBy**](DeviceCreatedBy.md) |  |  [optional] |
|**customdata** | **Object** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**facility** | [**Facility**](Facility.md) |  |  [optional] |
|**hardwareReservation** | [**Href**](Href.md) |  |  [optional] |
|**hostname** | **String** |  |  [optional] |
|**href** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**imageUrl** | **String** |  |  [optional] |
|**ipAddresses** | [**List&lt;IPAssignment&gt;**](IPAssignment.md) |  |  [optional] |
|**ipxeScriptUrl** | **String** |  |  [optional] |
|**iqn** | **String** |  |  [optional] |
|**locked** | **Boolean** |  |  [optional] |
|**metro** | [**DeviceMetro**](DeviceMetro.md) |  |  [optional] |
|**networkPorts** | [**List&lt;Port&gt;**](Port.md) |  |  [optional] |
|**operatingSystem** | [**OperatingSystem**](OperatingSystem.md) |  |  [optional] |
|**actions** | [**List&lt;DeviceActionsInner&gt;**](DeviceActionsInner.md) |  |  [optional] |
|**plan** | [**Plan**](Plan.md) |  |  [optional] |
|**project** | [**DeviceProject**](DeviceProject.md) |  |  [optional] |
|**projectLite** | [**DeviceProjectLite**](DeviceProjectLite.md) |  |  [optional] |
|**provisioningEvents** | [**List&lt;Event&gt;**](Event.md) |  |  [optional] |
|**provisioningPercentage** | **Float** | Only visible while device provisioning |  [optional] |
|**rootPassword** | **String** | Root password is automatically generated when server is provisioned and it is removed after 24 hours |  [optional] |
|**shortId** | **String** |  |  [optional] |
|**spotInstance** | **Boolean** | Whether or not the device is a spot instance. |  [optional] |
|**spotPriceMax** | **Float** | The maximum price per hour you are willing to pay to keep this spot instance.  If you are outbid, the termination will be set allowing two minutes before shutdown. |  [optional] |
|**sshKeys** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**switchUuid** | **String** | Switch short id. This can be used to determine if two devices are connected to the same switch, for example. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**terminationTime** | **OffsetDateTime** | When the device will be terminated. This is commonly set in advance for ephemeral spot market instances but this field may also be set with on-demand and reservation instances to automatically delete the resource at a given time. The termination time can also be used to release a hardware reservation instance at a given time, keeping the reservation open for other uses.  On a spot market device, the termination time will be set automatically when outbid. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**user** | **String** |  |  [optional] |
|**userdata** | **String** |  |  [optional] |
|**volumes** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| FAILED | &quot;failed&quot; |
| QUEUED | &quot;queued&quot; |
| PROVISIONING | &quot;provisioning&quot; |
| REINSTALLING | &quot;reinstalling&quot; |



