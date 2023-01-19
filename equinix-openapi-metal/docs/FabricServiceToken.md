

# FabricServiceToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expiresAt** | **OffsetDateTime** | The expiration date and time of the Fabric service token. Once a service token is expired, it is no longer redeemable. |  [optional] |
|**id** | **UUID** | The UUID that can be used on the Fabric Portal to redeem either an A-Side or Z-Side Service Token. For Fabric VCs (Metal Billed), this UUID will represent an A-Side Service Token, which will allow interconnections to be made from Equinix Metal to other Service Providers on Fabric. For Fabric VCs (Fabric Billed), this UUID will represent a Z-Side Service Token, which will allow interconnections to be made to connect an owned Fabric Port or  Virtual Device to Equinix Metal. |  [optional] |
|**maxAllowedSpeed** | **Integer** | The maximum speed that can be selected on the Fabric Portal when configuring a interconnection with either  an A-Side or Z-Side Service Token. For Fabric VCs (Metal Billed), this is what the billing is based off of, and can be one of the following options, &#39;50mbps&#39;, &#39;200mbps&#39;, &#39;500mbps&#39;, &#39;1gbps&#39;, &#39;2gbps&#39;, &#39;5gbps&#39; or &#39;10gbps&#39;. For Fabric VCs (Fabric Billed), this will default to 10Gbps. |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | Either primary or secondary, depending on which interconnection the service token is associated to. |  [optional] |
|**serviceTokenType** | [**ServiceTokenTypeEnum**](#ServiceTokenTypeEnum) | Either &#39;a_side&#39; or &#39;z_side&#39;, depending on which type of Fabric VC was requested. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of the service token that corresponds with the service token state on Fabric. An &#39;inactive&#39; state refers to a token that has not been redeemed yet on the Fabric side, an &#39;active&#39; state refers to a token that has already been redeemed, and an &#39;expired&#39; state refers to a token that has reached its expiry time. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| SECONDARY | &quot;secondary&quot; |



## Enum: ServiceTokenTypeEnum

| Name | Value |
|---- | -----|
| A_SIDE | &quot;a_side&quot; |
| Z_SIDE | &quot;z_side&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| INACTIVE | &quot;inactive&quot; |
| ACTIVE | &quot;active&quot; |
| EXPIRED | &quot;expired&quot; |



