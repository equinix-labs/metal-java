# GlobalBgpRangesApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findGlobalBgpRanges**](GlobalBgpRangesApi.md#findGlobalBgpRanges) | **GET** /projects/{id}/global-bgp-ranges | Retrieve all global bgp ranges


<a name="findGlobalBgpRanges"></a>
# **findGlobalBgpRanges**
> GlobalBgpRangeList findGlobalBgpRanges(id)

Retrieve all global bgp ranges

Returns all global bgp ranges for a project

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.GlobalBgpRangesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

GlobalBgpRangesApi apiInstance = new GlobalBgpRangesApi();
UUID id = new UUID(); // UUID | Project UUID
try {
    GlobalBgpRangeList result = apiInstance.findGlobalBgpRanges(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalBgpRangesApi#findGlobalBgpRanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |

### Return type

[**GlobalBgpRangeList**](GlobalBgpRangeList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

