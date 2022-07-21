# OperatingSystemsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOperatingSystemVersion**](OperatingSystemsApi.md#findOperatingSystemVersion) | **GET** /operating-system-versions | Retrieve all operating system versions
[**findOperatingSystems**](OperatingSystemsApi.md#findOperatingSystems) | **GET** /operating-systems | Retrieve all operating systems


<a name="findOperatingSystemVersion"></a>
# **findOperatingSystemVersion**
> InlineResponse20025 findOperatingSystemVersion()

Retrieve all operating system versions

Provides a listing of available operating system versions.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OperatingSystemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OperatingSystemsApi apiInstance = new OperatingSystemsApi();
try {
    InlineResponse20025 result = apiInstance.findOperatingSystemVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperatingSystemsApi#findOperatingSystemVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOperatingSystems"></a>
# **findOperatingSystems**
> InlineResponse20025 findOperatingSystems()

Retrieve all operating systems

Provides a listing of available operating systems to provision your new device with.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OperatingSystemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OperatingSystemsApi apiInstance = new OperatingSystemsApi();
try {
    InlineResponse20025 result = apiInstance.findOperatingSystems();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperatingSystemsApi#findOperatingSystems");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

