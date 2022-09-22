

# VirtualNetworkCreateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**facility** | **String** | The UUID (or facility code) for the Facility in which to create this Virtual network. |  [optional] |
|**metro** | **String** | The UUID (or metro code) for the Metro in which to create this Virtual Network. |  [optional] |
|**vxlan** | **Integer** | VLAN ID between 2-3999. Must be unique for the project within the Metro in which this Virtual Network is being created. If no value is specified, the next-available VLAN ID in the range 1000-1999 will be automatically selected. |  [optional] |



