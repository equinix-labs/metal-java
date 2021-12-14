
# Facility

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**name** | **String** |  |  [optional]
**code** | **String** |  |  [optional]
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) |  |  [optional]
**ipRanges** | **List&lt;String&gt;** | IP ranges registered in facility. Can be used for GeoIP location |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**metro** | [**AuthTokenUser**](AuthTokenUser.md) |  |  [optional]


<a name="List<FeaturesEnum>"></a>
## Enum: List&lt;FeaturesEnum&gt;
Name | Value
---- | -----
BAREMETAL | &quot;baremetal&quot;
BACKEND_TRANSFER | &quot;backend_transfer&quot;
LAYER_2 | &quot;layer_2&quot;
GLOBAL_IPV4 | &quot;global_ipv4&quot;
IBX | &quot;ibx&quot;



