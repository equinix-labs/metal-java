
# InterconnectionCreateInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**facility** | **String** | A Facility ID or code. | 
**metro** | **String** | A Metro ID or code. Required for creating a connection, unless creating with facility. |  [optional]
**type** | **String** | Either &#39;shared&#39; or &#39;dedicated&#39;. | 
**redundancy** | **String** | Either &#39;primary&#39; or &#39;redundant&#39;. | 
**contactEmail** | **String** |  |  [optional]
**project** | **String** |  |  [optional]
**speed** | **String** | A connection speed, in bps, mbps, or gbps. Ex: &#39;100000000&#39; or &#39;100 mbps&#39;. |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | The mode of the connection (only relevant to dedicated connections). Shared connections won&#39;t have this field. Can be either &#39;standard&#39; or &#39;tunnel&#39;.   The default mode of a dedicated connection is &#39;standard&#39;. The mode can only be changed when there are no associated virtual circuits on the connection.   In tunnel mode, an 802.1q tunnel is added to a port to send/receive double tagged packets from server instances. |  [optional]


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
STANDARD | &quot;standard&quot;
TUNNEL | &quot;tunnel&quot;



