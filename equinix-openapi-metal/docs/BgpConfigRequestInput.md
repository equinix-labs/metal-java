

# BgpConfigRequestInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asn** | **Integer** | Autonomous System Number for local BGP deployment. |  |
|**deploymentType** | [**DeploymentTypeEnum**](#DeploymentTypeEnum) | Wether the BGP deployment is local or global. Local deployments are configured immediately. Global deployments will need to be reviewed by Equinix Metal engineers. |  |
|**md5** | **String** | The plaintext password to share between BGP neighbors as an MD5 checksum: * must be 10-20 characters long * may not include punctuation * must be a combination of numbers and letters * must contain at least one lowercase, uppercase, and digit character  |  [optional] |
|**useCase** | **String** | A use case explanation (necessary for global BGP request review). |  [optional] |



## Enum: DeploymentTypeEnum

| Name | Value |
|---- | -----|
| LOCAL | &quot;local&quot; |
| GLOBAL | &quot;global&quot; |



