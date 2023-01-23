

# Invitation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**href** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**invitation** | [**Href**](Href.md) |  |  [optional] |
|**invitedBy** | [**Href**](Href.md) |  |  [optional] |
|**invitee** | **String** |  |  [optional] |
|**nonce** | **String** |  |  [optional] |
|**organization** | [**Href**](Href.md) |  |  [optional] |
|**projects** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |
|**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: List&lt;RolesEnum&gt;

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| BILLING | &quot;billing&quot; |
| COLLABORATOR | &quot;collaborator&quot; |
| LIMITED_COLLABORATOR | &quot;limited_collaborator&quot; |



