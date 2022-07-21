
# InlineResponse2001

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressFamily** | [**AddressFamilyEnum**](#AddressFamilyEnum) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**defaultRoute** | **Boolean** |  |  [optional]
**device** | [**InlineResponse200Devices**](InlineResponse200Devices.md) |  |  [optional]
**href** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**learnedRoutes** | **List&lt;String&gt;** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  The status of the BGP Session. Multiple status values may be reported when the device is connected to multiple switches, one value per switch. Each status will start with \&quot;unknown\&quot; and progress to \&quot;up\&quot; or \&quot;down\&quot; depending on the connected device. Subsequent \&quot;unknown\&quot; values indicate a problem acquiring status from the switch.  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="AddressFamilyEnum"></a>
## Enum: AddressFamilyEnum
Name | Value
---- | -----
IPV4 | &quot;ipv4&quot;
IPV6 | &quot;ipv6&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
UP | &quot;up&quot;
DOWN | &quot;down&quot;



