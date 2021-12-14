
# SpotMarketRequestCreateInputInstanceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plan** | **String** |  |  [optional]
**hostname** | **String** |  |  [optional]
**hostnames** | **List&lt;String&gt;** |  |  [optional]
**description** | **String** |  |  [optional]
**billingCycle** | **String** |  |  [optional]
**operatingSystem** | **String** |  |  [optional]
**alwaysPxe** | **Boolean** |  |  [optional]
**userdata** | **String** |  |  [optional]
**locked** | **Boolean** |  |  [optional]
**terminationTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**projectSshKeys** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**userSshKeys** | [**List&lt;UUID&gt;**](UUID.md) | The UUIDs of users whose SSH keys should be included on the provisioned device. |  [optional]
**noSshKeys** | **Boolean** |  |  [optional]
**features** | **List&lt;String&gt;** |  |  [optional]
**customdata** | **Object** |  |  [optional]
**publicIpv4SubnetSize** | **Integer** |  |  [optional]
**privateIpv4SubnetSize** | **Integer** |  |  [optional]



