
# Device

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**shortId** | **String** |  |  [optional]
**hostname** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**state** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**imageUrl** | **String** |  |  [optional]
**billingCycle** | **String** |  |  [optional]
**user** | **String** |  |  [optional]
**iqn** | **String** |  |  [optional]
**locked** | **Boolean** |  |  [optional]
**bondingMode** | **Integer** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**spotInstance** | **Boolean** | Whether or not the device is a spot instance. |  [optional]
**spotPriceMax** | **Float** | The maximum price per hour you are willing to pay to keep this spot instance.  If you are outbid, the termination will be set allowing two minutes before shutdown. |  [optional]
**terminationTime** | [**OffsetDateTime**](OffsetDateTime.md) | When the device will be terminated. This is commonly set in advance for ephemeral spot market instances but this field may also be set with on-demand and reservation instances to automatically delete the resource at a given time. The termination time can also be used to release a hardware reservation instance at a given time, keeping the reservation open for other uses.  On a spot market device, the termination time will be set automatically when outbid. |  [optional]
**customdata** | **Object** |  |  [optional]
**provisioningPercentage** | **Float** | Only visible while device provisioning |  [optional]
**operatingSystem** | [**OperatingSystem**](OperatingSystem.md) |  |  [optional]
**alwaysPxe** | **Boolean** |  |  [optional]
**ipxeScriptUrl** | **String** |  |  [optional]
**facility** | [**Facility**](Facility.md) |  |  [optional]
**metro** | [**AuthTokenUser**](AuthTokenUser.md) |  |  [optional]
**plan** | [**Plan**](Plan.md) |  |  [optional]
**userdata** | **String** |  |  [optional]
**rootPassword** | **String** | Root password is automatically generated when server is provisioned and it is removed after 24 hours |  [optional]
**switchUuid** | **String** | Switch short id. This can be used to determine if two devices are connected to the same switch, for example. |  [optional]
**networkPorts** | [**AuthTokenUser**](AuthTokenUser.md) |  |  [optional]
**href** | **String** |  |  [optional]
**project** | [**AuthTokenUser**](AuthTokenUser.md) |  |  [optional]
**projectLite** | [**AuthTokenUser**](AuthTokenUser.md) |  |  [optional]
**volumes** | [**List&lt;Href&gt;**](Href.md) |  |  [optional]
**hardwareReservation** | [**Href**](Href.md) |  |  [optional]
**sshKeys** | [**List&lt;Href&gt;**](Href.md) |  |  [optional]
**ipAddresses** | [**List&lt;IPAssignment&gt;**](IPAssignment.md) |  |  [optional]
**provisioningEvents** | [**List&lt;Event&gt;**](Event.md) |  |  [optional]



