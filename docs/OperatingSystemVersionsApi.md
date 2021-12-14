# OperatingSystemVersionsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOperatingSystemVersion**](OperatingSystemVersionsApi.md#findOperatingSystemVersion) | **GET** /operating-system-versions | Retrieve all operating system versions


<a name="findOperatingSystemVersion"></a>
# **findOperatingSystemVersion**
> OperatingSystemList findOperatingSystemVersion()

Retrieve all operating system versions

Provides a listing of available operating system versions.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.OperatingSystemVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OperatingSystemVersionsApi apiInstance = new OperatingSystemVersionsApi();
try {
    OperatingSystemList result = apiInstance.findOperatingSystemVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperatingSystemVersionsApi#findOperatingSystemVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OperatingSystemList**](OperatingSystemList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

