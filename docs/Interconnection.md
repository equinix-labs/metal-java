
# Interconnection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **List&lt;String&gt;** |  |  [optional]
**contactEmail** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**facility** | [**InlineResponse200Devices**](InlineResponse200Devices.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**metro** | [**InlineResponse2006Metro**](InlineResponse2006Metro.md) |  |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | The mode of the connection (only relevant to dedicated connections). Shared connections won&#39;t have this field. Can be either &#39;standard&#39; or &#39;tunnel&#39;.   The default mode of a dedicated connection is &#39;standard&#39;. The mode can only be changed when there are no associated virtual circuits on the connection.   In tunnel mode, an 802.1q tunnel is added to a port to send/receive double tagged packets from server instances. |  [optional]
**name** | **String** |  |  [optional]
**organization** | [**InlineResponse200Devices**](InlineResponse200Devices.md) |  |  [optional]
**ports** | [**List&lt;InlineResponse2006Ports&gt;**](InlineResponse2006Ports.md) |  |  [optional]
**redundancy** | **String** |  |  [optional]
**serviceTokens** | [**List&lt;InlineResponse2006ServiceTokens&gt;**](InlineResponse2006ServiceTokens.md) |  |  [optional]
**speed** | **Integer** | The connection&#39;s speed in bps. |  [optional]
**status** | **String** |  |  [optional]
**type** | **String** |  |  [optional]


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
STANDARD | &quot;standard&quot;
TUNNEL | &quot;tunnel&quot;



