

# Device


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alwaysPxe** | **Boolean** |  |  [optional] |
|**billingCycle** | **String** |  |  [optional] |
|**bondingMode** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**createdBy** | [**DeviceCreatedBy**](DeviceCreatedBy.md) |  |  [optional] |
|**customdata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**facility** | [**Facility**](Facility.md) |  |  [optional] |
|**firmwareSetId** | **UUID** | The UUID of the firmware set to associate with the device. |  [optional] |
|**hardwareReservation** | [**HardwareReservation**](HardwareReservation.md) |  |  [optional] |
|**hostname** | **String** |  |  [optional] |
|**href** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**imageUrl** | **String** |  |  [optional] |
|**ipAddresses** | [**List&lt;IPAssignment&gt;**](IPAssignment.md) |  |  [optional] |
|**ipxeScriptUrl** | **String** |  |  [optional] |
|**iqn** | **String** |  |  [optional] |
|**locked** | **Boolean** | Prevents accidental deletion of this resource when set to true. |  [optional] |
|**metro** | [**DeviceMetro**](DeviceMetro.md) |  |  [optional] |
|**networkFrozen** | **Boolean** | Whether network mode changes such as converting to/from Layer2 or Layer3 networking, bonding or disbonding network interfaces are permitted for the device. |  [optional] |
|**networkPorts** | [**List&lt;Port&gt;**](Port.md) | By default, servers at Equinix Metal are configured in a “bonded” mode using LACP (Link Aggregation Control Protocol). Each 2-NIC server is configured with a single bond (namely bond0) with both interfaces eth0 and eth1 as members of the bond in a default Layer 3 mode. Some device plans may have a different number of ports and bonds available. |  [optional] |
|**operatingSystem** | [**OperatingSystem**](OperatingSystem.md) |  |  [optional] |
|**actions** | [**List&lt;DeviceActionsInner&gt;**](DeviceActionsInner.md) | Actions supported by the device instance. |  [optional] |
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
|**state** | [**StateEnum**](#StateEnum) | The current state the instance is in.  * When an instance is initially created it will be in the &#x60;queued&#x60; state until it is picked up by the provisioner. * Once provisioning has begun on the instance it&#39;s state will move to &#x60;provisioning&#x60;. * When an instance is deleted, it will move to &#x60;deprovisioning&#x60; state until the deprovision is completed and the instance state moves to &#x60;deleted&#x60;. * If an instance fails to provision or deprovision it will move to &#x60;failed&#x60; state. * Once an instance has completed provisioning it will move to &#x60;active&#x60; state. * If an instance is currently powering off or powering on it will move to &#x60;powering_off&#x60; or &#x60;powering_on&#x60; states respectively.  * When the instance is powered off completely it will move to the &#x60;inactive&#x60; state. * When an instance is powered on completely it will move to the &#x60;active&#x60; state. * Using the reinstall action to install a new OS on the instance will cause the instance state to change to &#x60;reinstalling&#x60;. * When the reinstall action is complete the instance will move to &#x60;active&#x60; state. |  [optional] |
|**storage** | [**Storage**](Storage.md) |  |  [optional] |
|**switchUuid** | **String** | Switch short id. This can be used to determine if two devices are connected to the same switch, for example. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**terminationTime** | **OffsetDateTime** | When the device will be terminated. If you don&#39;t supply timezone info, the timestamp is assumed to be in UTC.  This is commonly set in advance for ephemeral spot market instances but this field may also be set with on-demand and reservation instances to automatically delete the resource at a given time. The termination time can also be used to release a hardware reservation instance at a given time, keeping the reservation open for other uses.  On a spot market device, the termination time will be set automatically when outbid. |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**user** | **String** |  |  [optional] |
|**userdata** | **String** |  |  [optional] |
|**volumes** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |
|**sos** | **String** | Hostname used to connect to the instance via the SOS (Serial over SSH) out-of-band console. |  [optional] |



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



