
# ProjectsiddevicesbatchBatches

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **List&lt;String&gt;** |  |  [optional]
**alwaysPxe** | **Boolean** |  |  [optional]
**billingCycle** | **String** |  |  [optional]
**customdata** | **Object** |  |  [optional]
**description** | **String** |  |  [optional]
**facility** | **List&lt;String&gt;** | Array of facility codes the batch can use for provisioning. This param also takes a string if you want the batch to be fulfilled in only one facility. Cannot be set if the metro is already set. |  [optional]
**features** | **List&lt;String&gt;** |  |  [optional]
**hostname** | **String** |  |  [optional]
**hostnames** | **List&lt;String&gt;** |  |  [optional]
**ipAddresses** | [**List&lt;ProjectsiddevicesbatchIpAddresses&gt;**](ProjectsiddevicesbatchIpAddresses.md) |  |  [optional]
**locked** | **Boolean** |  |  [optional]
**metro** | **String** | The metro ID or code the batch can use for provisioning. Cannot be set if the facility is already set. |  [optional]
**noSshKeys** | **Boolean** |  |  [optional]
**operatingSystem** | **String** |  |  [optional]
**plan** | **String** |  |  [optional]
**projectSshKeys** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**terminationTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**userSshKeys** | [**List&lt;UUID&gt;**](UUID.md) | The UUIDs of users whose SSH keys should be included on the provisioned device. |  [optional]
**userdata** | **String** |  |  [optional]



