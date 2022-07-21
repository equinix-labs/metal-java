
# VirtualCircuit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **List&lt;String&gt;** |  | 
**bill** | **Boolean** | True if the Virtual Circuit is being billed. Currently, only Virtual Circuits that are created with A-side service tokens will be billed. Usage will start the first time the Virtual Circuit becomes active, and will not stop until it is deleted. | 
**description** | **String** |  | 
**id** | [**UUID**](UUID.md) |  | 
**name** | **String** |  | 
**nniVlan** | **Integer** |  | 
**port** | [**InlineResponse200Devices**](InlineResponse200Devices.md) |  | 
**project** | [**InlineResponse200Devices**](InlineResponse200Devices.md) |  | 
**speed** | **Integer** | integer representing bps speed |  [optional]
**status** | **String** |  | 
**virtualNetwork** | [**InlineResponse200Devices**](InlineResponse200Devices.md) |  | 
**vnid** | **Integer** |  | 



