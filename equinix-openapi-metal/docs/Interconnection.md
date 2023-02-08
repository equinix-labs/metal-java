

# Interconnection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactEmail** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**facility** | [**Href**](Href.md) |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**metro** | [**InterconnectionMetro**](InterconnectionMetro.md) |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) | The mode of the interconnection (only relevant to Dedicated Ports). Shared connections won&#39;t have this field. Can be either &#39;standard&#39; or &#39;tunnel&#39;.   The default mode of an interconnection on a Dedicated Port is &#39;standard&#39;. The mode can only be changed when there are no associated virtual circuits on the interconnection.   In tunnel mode, an 802.1q tunnel is added to a port to send/receive double tagged packets from server instances. |  [optional] |
|**name** | **String** |  |  [optional] |
|**organization** | [**Href**](Href.md) |  |  [optional] |
|**ports** | [**List&lt;InterconnectionPort&gt;**](InterconnectionPort.md) | For Fabric VCs, these represent Virtual Port(s) created for the interconnection. For dedicated interconnections, these represent the Dedicated Port(s). |  [optional] |
|**redundancy** | [**RedundancyEnum**](#RedundancyEnum) | Either &#39;primary&#39;, meaning a single interconnection, or &#39;redundant&#39;, meaning a redundant interconnection. |  [optional] |
|**serviceTokens** | [**List&lt;FabricServiceToken&gt;**](FabricServiceToken.md) | For Fabric VCs (Metal Billed), this will show details of the A-Side service tokens issued for the interconnection. For Fabric VCs (Fabric Billed), this will show the details of the Z-Side service tokens issued for the interconnection. Dedicated interconnections will not have any service tokens issued. There will be one per interconnection, so for redundant interconnections, there should be two service tokens issued. |  [optional] |
|**speed** | **Integer** | For interconnections on Dedicated Ports and shared connections, this represents the interconnection&#39;s speed in bps. For Fabric VCs, this field refers to the maximum speed of the interconnection in bps. This value will default to 10Gbps for Fabric VCs (Fabric Billed). |  [optional] |
|**status** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**token** | **UUID** | This token is used for shared interconnections to be used as the Fabric Token. This field is entirely deprecated. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The &#39;shared&#39; type of interconnection refers to shared connections, or later also known as Fabric Virtual Connections (or Fabric VCs). The &#39;dedicated&#39; type of interconnection refers to interconnections created with Dedicated Ports. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**requestedBy** | [**Href**](Href.md) |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| TUNNEL | &quot;tunnel&quot; |



## Enum: RedundancyEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| REDUNDANT | &quot;redundant&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHARED | &quot;shared&quot; |
| DEDICATED | &quot;dedicated&quot; |



