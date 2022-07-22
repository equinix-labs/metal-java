

# Facility


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | [**Address**](Address.md) |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**ipRanges** | **List&lt;String&gt;** | IP ranges registered in facility. Can be used for GeoIP location |  [optional] |
|**metro** | [**DeviceMetro**](DeviceMetro.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |



## Enum: List&lt;FeaturesEnum&gt;

| Name | Value |
|---- | -----|
| BAREMETAL | &quot;baremetal&quot; |
| BACKEND_TRANSFER | &quot;backend_transfer&quot; |
| LAYER_2 | &quot;layer_2&quot; |
| GLOBAL_IPV4 | &quot;global_ipv4&quot; |
| IBX | &quot;ibx&quot; |



