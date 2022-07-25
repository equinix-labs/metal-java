

# InterconnectionCreateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactEmail** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**metro** | **String** | A Metro ID or code. |  |
|**mode** | [**ModeEnum**](#ModeEnum) | The mode of the connection (only relevant to dedicated connections). Shared connections won&#39;t have this field. Can be either &#39;standard&#39; or &#39;tunnel&#39;.   The default mode of a dedicated connection is &#39;standard&#39;. The mode can only be changed when there are no associated virtual circuits on the connection.   In tunnel mode, an 802.1q tunnel is added to a port to send/receive double tagged packets from server instances. |  [optional] |
|**name** | **String** |  |  |
|**project** | **String** |  |  [optional] |
|**redundancy** | **String** | Either &#39;primary&#39; or &#39;redundant&#39;. |  |
|**serviceTokenType** | [**ServiceTokenTypeEnum**](#ServiceTokenTypeEnum) | Can only be set to &#39;a_side&#39; to create a shared connection with an A-side Fabric service token. This parameter is included in the specification as a developer preview and is generally unavailable. Please contact our Support team for more details. |  [optional] |
|**speed** | **String** | A connection speed, in bps, mbps, or gbps. Ex: &#39;100000000&#39; or &#39;100 mbps&#39;. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**type** | **String** | Either &#39;shared&#39; or &#39;dedicated&#39;. |  |
|**vlans** | **List&lt;Integer&gt;** | A list of one or two metro-based VLANs that will be set on the primary and/or secondary (if redundant) virtual circuits respectively when creating a shared connection. VLANs can also be set after the connection is created, but are required to activate the connection. This parameter is included in the specification as a developer preview and is generally unavailable. Please contact our Support team for more details. |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| TUNNEL | &quot;tunnel&quot; |



## Enum: ServiceTokenTypeEnum

| Name | Value |
|---- | -----|
| A_SIDE | &quot;a_side&quot; |



