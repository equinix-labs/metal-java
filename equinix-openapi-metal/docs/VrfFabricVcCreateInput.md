

# VrfFabricVcCreateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactEmail** | **String** | The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key. |  [optional] |
|**description** | **String** |  |  [optional] |
|**metro** | **String** | A Metro ID or code. When creating Fabric VCs (Metal Billed), this is where interconnection will be originating from, as we pre-authorize the use of one of our shared ports as the origin of the interconnection using A-Side service tokens. We only allow local connections for Fabric VCs (Metal Billed), so the destination location must be the same as the origin. For Fabric VCs (Fabric Billed), or shared connections, this will be the destination of the interconnection. We allow remote connections for Fabric VCs (Fabric Billed), so the origin of the interconnection can be a different metro set here. |  |
|**name** | **String** |  |  |
|**project** | **String** |  |  [optional] |
|**redundancy** | **String** | Either &#39;primary&#39; or &#39;redundant&#39;. |  |
|**serviceTokenType** | [**ServiceTokenTypeEnum**](#ServiceTokenTypeEnum) | Either &#39;a_side&#39; or &#39;z_side&#39;. Setting this field to &#39;a_side&#39; will create an interconnection with Fabric VCs (Metal Billed). Setting this field to &#39;z_side&#39; will create an interconnection with Fabric VCs (Fabric Billed). This is required when the &#39;type&#39; is &#39;shared&#39;, but this is not applicable when the &#39;type&#39; is &#39;dedicated&#39;. This parameter is included in the specification as a developer preview and is generally unavailable. Please contact our Support team for more details. |  |
|**speed** | **Integer** | A interconnection speed, in bps, mbps, or gbps. For Fabric VCs, this represents the maximum speed of the interconnection. For Fabric VCs (Metal Billed), this can only be one of the following:  &#39;&#39;50mbps&#39;&#39;, &#39;&#39;200mbps&#39;&#39;, &#39;&#39;500mbps&#39;&#39;, &#39;&#39;1gbps&#39;&#39;, &#39;&#39;2gbps&#39;&#39;, &#39;&#39;5gbps&#39;&#39; or &#39;&#39;10gbps&#39;&#39;, and is required for creation. For Fabric VCs (Fabric Billed), this field will always default to &#39;&#39;10gbps&#39;&#39; even if it is not provided. For example, &#39;&#39;500000000&#39;&#39;, &#39;&#39;50m&#39;&#39;, or&#39; &#39;&#39;500mbps&#39;&#39; will all work as valid inputs. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | When requesting for a Fabric VC, the value of this field should be &#39;shared&#39;. |  |
|**vrfs** | **List&lt;UUID&gt;** | This field holds a list of VRF UUIDs that will be set automatically on the virtual circuits of Fabric VCs on creation, and can hold up to two UUIDs. Two UUIDs are required when requesting redundant Fabric VCs. The first UUID will be set on the primary virtual circuit, while the second UUID will be set on the secondary. The two UUIDs can be the same if both the primary and secondary virtual circuits will be in the same VRF. This parameter is included in the specification as a developer preview and is generally unavailable. Please contact our Support team for more details. |  |



## Enum: ServiceTokenTypeEnum

| Name | Value |
|---- | -----|
| A_SIDE | &quot;a_side&quot; |
| Z_SIDE | &quot;z_side&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHARED | &quot;shared&quot; |



