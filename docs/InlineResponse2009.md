
# InlineResponse2009

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **List&lt;String&gt;** |  |  [optional]
**alwaysPxe** | **Boolean** |  |  [optional]
**billingCycle** | **String** |  |  [optional]
**bondingMode** | **Integer** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdBy** | [**InlineResponse2006Metro**](InlineResponse2006Metro.md) |  |  [optional]
**customdata** | **Object** |  |  [optional]
**description** | **String** |  |  [optional]
**facility** | [**InlineResponse2009Facility**](InlineResponse2009Facility.md) |  |  [optional]
**hardwareReservation** | [**InlineResponse200Devices**](InlineResponse200Devices.md) |  |  [optional]
**hostname** | **String** |  |  [optional]
**href** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**imageUrl** | **String** |  |  [optional]
**ipAddresses** | [**List&lt;InlineResponse2009IpAddresses&gt;**](InlineResponse2009IpAddresses.md) |  |  [optional]
**ipxeScriptUrl** | **String** |  |  [optional]
**iqn** | **String** |  |  [optional]
**locked** | **Boolean** |  |  [optional]
**metro** | [**InlineResponse2006Metro**](InlineResponse2006Metro.md) |  |  [optional]
**networkPorts** | [**InlineResponse2006Metro**](InlineResponse2006Metro.md) |  |  [optional]
**operatingSystem** | [**InlineResponse2009OperatingSystem**](InlineResponse2009OperatingSystem.md) |  |  [optional]
**plan** | [**InlineResponse2009Plan**](InlineResponse2009Plan.md) |  |  [optional]
**project** | [**InlineResponse2006Metro**](InlineResponse2006Metro.md) |  |  [optional]
**projectLite** | [**InlineResponse2006Metro**](InlineResponse2006Metro.md) |  |  [optional]
**provisioningEvents** | [**List&lt;InlineResponse2007&gt;**](InlineResponse2007.md) |  |  [optional]
**provisioningPercentage** | **Float** | Only visible while device provisioning |  [optional]
**rootPassword** | **String** | Root password is automatically generated when server is provisioned and it is removed after 24 hours |  [optional]
**shortId** | **String** |  |  [optional]
**spotInstance** | **Boolean** | Whether or not the device is a spot instance. |  [optional]
**spotPriceMax** | **Float** | The maximum price per hour you are willing to pay to keep this spot instance.  If you are outbid, the termination will be set allowing two minutes before shutdown. |  [optional]
**sshKeys** | [**List&lt;InlineResponse200Devices&gt;**](InlineResponse200Devices.md) |  |  [optional]
**state** | **String** |  |  [optional]
**switchUuid** | **String** | Switch short id. This can be used to determine if two devices are connected to the same switch, for example. |  [optional]
**terminationTime** | [**OffsetDateTime**](OffsetDateTime.md) | When the device will be terminated. This is commonly set in advance for ephemeral spot market instances but this field may also be set with on-demand and reservation instances to automatically delete the resource at a given time. The termination time can also be used to release a hardware reservation instance at a given time, keeping the reservation open for other uses.  On a spot market device, the termination time will be set automatically when outbid. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**user** | **String** |  |  [optional]
**userdata** | **String** |  |  [optional]
**volumes** | [**List&lt;InlineResponse200Devices&gt;**](InlineResponse200Devices.md) |  |  [optional]



