
# InterconnectionUpdateInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**redundancy** | **String** | Updating from &#39;redundant&#39; to &#39;primary&#39; will remove a secondary port, while updating from &#39;primary&#39; to &#39;redundant&#39; will add one. |  [optional]
**description** | **String** |  |  [optional]
**contactEmail** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | The mode of the connection (only relevant to dedicated connections). Shared connections won&#39;t have this field. Can be either &#39;standard&#39; or &#39;tunnel&#39;.   The default mode of a dedicated connection is &#39;standard&#39;. The mode can only be changed when there are no associated virtual circuits on the connection.   In tunnel mode, an 802.1q tunnel is added to a port to send/receive double tagged packets from server instances. |  [optional]


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
STANDARD | &quot;standard&quot;
TUNNEL | &quot;tunnel&quot;



