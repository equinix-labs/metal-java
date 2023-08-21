

# InterconnectionPort


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**organization** | [**Href**](Href.md) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | Either &#39;primary&#39; or &#39;secondary&#39;. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | For both Fabric VCs and Dedicated Ports, this will be &#39;requested&#39; on creation and &#39;deleting&#39; on deletion. Once the Fabric VC has found its corresponding Fabric connection, this will turn to &#39;active&#39;. For Dedicated Ports, once the dedicated port is associated, this will also turn to &#39;active&#39;. For Fabric VCs, this can turn into an &#39;expired&#39; state if the service token associated is expired. |  [optional] |
|**switchId** | **String** | A switch &#39;short ID&#39; |  [optional] |
|**virtualCircuits** | [**List&lt;VirtualCircuit&gt;**](VirtualCircuit.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**speed** | **Integer** |  |  [optional] |
|**linkStatus** | **String** |  |  [optional] |
|**href** | **String** |  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| SECONDARY | &quot;secondary&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;requested&quot; |
| ACTIVE | &quot;active&quot; |
| DELETING | &quot;deleting&quot; |
| EXPIRED | &quot;expired&quot; |



