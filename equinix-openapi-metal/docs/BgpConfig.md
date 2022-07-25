

# BgpConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asn** | **Integer** | Autonomous System Number. ASN is required with Global BGP. With Local BGP the private ASN, 65000, is assigned. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**deploymentType** | [**DeploymentTypeEnum**](#DeploymentTypeEnum) | In a Local BGP deployment, a customer uses an internal ASN to control routes within a single Equinix Metal datacenter. This means that the routes are never advertised to the global Internet. Global BGP, on the other hand, requires a customer to have a registered ASN and IP space.  |  [optional] |
|**href** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**maxPrefix** | **Integer** | The maximum number of route filters allowed per server |  [optional] |
|**md5** | **String** | (Optional) Password for BGP session in plaintext (not a checksum) |  [optional] |
|**project** | [**Href**](Href.md) |  |  [optional] |
|**ranges** | [**List&lt;GlobalBgpRange&gt;**](GlobalBgpRange.md) | The IP block ranges associated to the ASN (Populated in Global BGP only) |  [optional] |
|**requestedAt** | **OffsetDateTime** |  |  [optional] |
|**routeObject** | **String** | Specifies AS-MACRO (aka AS-SET) to use when building client route filters |  [optional] |
|**sessions** | [**List&lt;BgpSession&gt;**](BgpSession.md) | The direct connections between neighboring routers that want to exchange routing information. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the BGP Config. Status \&quot;requested\&quot; is valid only with the \&quot;global\&quot; deployment_type. |  [optional] |



## Enum: DeploymentTypeEnum

| Name | Value |
|---- | -----|
| GLOBAL | &quot;global&quot; |
| LOCAL | &quot;local&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;requested&quot; |
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |



