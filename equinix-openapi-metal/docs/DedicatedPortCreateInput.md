

# DedicatedPortCreateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactEmail** | **String** | The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key. |  [optional] |
|**description** | **String** |  |  [optional] |
|**metro** | **String** | A Metro ID or code. For interconnections with Dedicated Ports, this will be the location of the issued Dedicated Ports. |  |
|**mode** | [**ModeEnum**](#ModeEnum) | The mode of the interconnection (only relevant to Dedicated Ports). Fabric VCs won&#39;t have this field. Can be either &#39;standard&#39; or &#39;tunnel&#39;.   The default mode of an interconnection on a Dedicated Port is &#39;standard&#39;. The mode can only be changed when there are no associated virtual circuits on the interconnection.   In tunnel mode, an 802.1q tunnel is added to a port to send/receive double tagged packets from server instances. |  [optional] |
|**name** | **String** |  |  |
|**project** | **String** |  |  [optional] |
|**redundancy** | **String** | Either &#39;primary&#39; or &#39;redundant&#39;. |  |
|**speed** | **Integer** | A interconnection speed, in bps, mbps, or gbps. For Dedicated Ports, this can be 10Gbps or 100Gbps. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | When requesting for a dedicated port, the value of this field should be &#39;dedicated&#39;. |  |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| TUNNEL | &quot;tunnel&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEDICATED | &quot;dedicated&quot; |



