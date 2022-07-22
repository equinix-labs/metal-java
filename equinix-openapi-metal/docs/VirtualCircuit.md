

# VirtualCircuit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bill** | **Boolean** | True if the Virtual Circuit is being billed. Currently, only Virtual Circuits that are created with A-side service tokens will be billed. Usage will start the first time the Virtual Circuit becomes active, and will not stop until it is deleted. |  |
|**description** | **String** |  |  |
|**id** | **UUID** |  |  |
|**name** | **String** |  |  |
|**nniVlan** | **Integer** |  |  |
|**port** | [**Href**](Href.md) |  |  |
|**project** | [**Href**](Href.md) |  |  |
|**speed** | **Integer** | integer representing bps speed |  [optional] |
|**status** | **String** |  |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**virtualNetwork** | [**Href**](Href.md) |  |  |
|**vnid** | **Integer** |  |  |



