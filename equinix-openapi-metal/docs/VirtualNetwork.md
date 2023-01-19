

# VirtualNetwork


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignedTo** | [**Href**](Href.md) |  |  [optional] |
|**assignedToVirtualCircuit** | **Boolean** | True if the virtual network is attached to a virtual circuit. False if not. |  [optional] |
|**description** | **String** |  |  [optional] |
|**facility** | [**Href**](Href.md) |  |  [optional] |
|**href** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**instances** | [**List&lt;Href&gt;**](Href.md) | A list of instances with ports currently associated to this Virtual Network. |  [optional] |
|**metalGateways** | [**List&lt;MetalGatewayLite&gt;**](MetalGatewayLite.md) | A list of metal gateways currently associated to this Virtual Network. |  [optional] |
|**metro** | [**Href**](Href.md) |  |  [optional] |
|**metroCode** | **String** | The Metro code of the metro in which this Virtual Network is defined. |  [optional] |
|**vxlan** | **Integer** |  |  [optional] |



