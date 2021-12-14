
# InstancesBatchCreateInputBatches

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plan** | **String** |  |  [optional]
**hostname** | **String** |  |  [optional]
**hostnames** | **List&lt;String&gt;** |  |  [optional]
**facility** | **List&lt;String&gt;** | Array of facility codes the batch can use for provisioning. This param also takes a string if you want the batch to be fulfilled in only one facility. Cannot be set if the metro is already set. |  [optional]
**metro** | **String** | The metro ID or code the batch can use for provisioning. Cannot be set if the facility is already set. |  [optional]
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
**ipAddresses** | [**List&lt;InstancesBatchCreateInputIpAddresses&gt;**](InstancesBatchCreateInputIpAddresses.md) |  |  [optional]



