

# FabricServiceToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expiresAt** | **OffsetDateTime** | The expiration date and time of the Fabric service token. Once a service token is expired, it is no longer redeemable. |  [optional] |
|**id** | **UUID** | The service token UUID that can be used on the Fabric Portal to create an connection from Metal to another Fabric service provider. |  [optional] |
|**maxAllowedSpeed** | **String** | The maximum speed that can be selected on the Fabric Portal when configuring a connection with the service token. The speed is recorded in bps, but can be set by using any of the following units: &#39;bps&#39;, &#39;mbps&#39;, or &#39;gbps&#39;. This speed is automatically capped depending on the tier of the organization. If you would like to upgrade to another tier, please contact our Support team. |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | Either primary or redundant, depending on the role of the connection port the token is associated with. |  [optional] |
|**serviceTokenType** | [**ServiceTokenTypeEnum**](#ServiceTokenTypeEnum) | The type of service token that has been created. Currently, only A-side service tokens are available. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of the service token that corresponds with the service token state on Fabric. An inactive state refers to a token that has not been redeemed yet on the Fabric side, an active state refers to a token that has already been redeemed, and an expired state refers to a token that has reached its expiry time. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| REDUNDANT | &quot;redundant&quot; |



## Enum: ServiceTokenTypeEnum

| Name | Value |
|---- | -----|
| A_SIDE | &quot;a_side&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| INACTIVE | &quot;inactive&quot; |
| ACTIVE | &quot;active&quot; |
| EXPIRED | &quot;expired&quot; |



