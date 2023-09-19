

# Project


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bgpConfig** | [**Href**](Href.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**customdata** | **Object** |  |  [optional] |
|**devices** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**invitations** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |
|**maxDevices** | **Object** |  |  [optional] |
|**members** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |
|**memberships** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |
|**name** | **String** | The name of the project. Cannot contain characters encoded in greater than 3 bytes such as emojis. |  [optional] |
|**networkStatus** | **Object** |  |  [optional] |
|**organization** | [**Organization**](Organization.md) |  |  [optional] |
|**paymentMethod** | [**Href**](Href.md) |  |  [optional] |
|**sshKeys** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**volumes** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the project. Projects of type &#x60;vmce&#x60; are part of an in development feature and not available to all customers. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| VMCE | &quot;vmce&quot; |



