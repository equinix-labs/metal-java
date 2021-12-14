
# Organization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**website** | **String** |  |  [optional]
**twitter** | **String** |  |  [optional]
**logo** | **byte[]** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**projects** | [**List&lt;Href&gt;**](Href.md) |  |  [optional]
**members** | [**List&lt;Href&gt;**](Href.md) |  |  [optional]
**memberships** | [**List&lt;Href&gt;**](Href.md) |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**entitlement** | [**Entitlement**](Entitlement.md) |  |  [optional]
**terms** | **Integer** |  |  [optional]
**creditAmount** | **Float** |  |  [optional]
**customdata** | **Object** |  |  [optional]
**enforce2faAt** | [**OffsetDateTime**](OffsetDateTime.md) | Force to all members to have enabled the two factor authentication after that date, unless the value is null |  [optional]



