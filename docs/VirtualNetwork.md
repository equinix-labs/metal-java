
# VirtualNetwork

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**description** | [**UUID**](UUID.md) |  |  [optional]
**vxlan** | **Integer** |  |  [optional]
**facility** | [**Href**](Href.md) |  |  [optional]
**instances** | [**List&lt;Href&gt;**](Href.md) | A list of instances with ports currently associated to this Virtual Network. |  [optional]
**metroCode** | **String** | The Metro code of the metro in which this Virtual Network is defined. |  [optional]
**metro** | [**Href**](Href.md) |  |  [optional]
**assignedToVirtualCircuit** | **Boolean** | True if the virtual network is attached to a virtual circuit. False if not. |  [optional]
**assignedTo** | [**Href**](Href.md) |  |  [optional]
**href** | **String** |  |  [optional]



