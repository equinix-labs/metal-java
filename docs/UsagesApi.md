# UsagesApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findDeviceUsages**](UsagesApi.md#findDeviceUsages) | **GET** /devices/{id}/usages | Retrieve all usages for device
[**findProjectUsage**](UsagesApi.md#findProjectUsage) | **GET** /projects/{id}/usages | Retrieve all usages for project


<a name="findDeviceUsages"></a>
# **findDeviceUsages**
> InlineResponse20015 findDeviceUsages(id, createdAfter, createdBefore)

Retrieve all usages for device

Returns all usages for a device.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.UsagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

UsagesApi apiInstance = new UsagesApi();
UUID id = new UUID(); // UUID | Device UUID
String createdAfter = "createdAfter_example"; // String | Filter usages created after this date
String createdBefore = "createdBefore_example"; // String | Filter usages created before this date
try {
    InlineResponse20015 result = apiInstance.findDeviceUsages(id, createdAfter, createdBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsagesApi#findDeviceUsages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **createdAfter** | **String**| Filter usages created after this date | [optional]
 **createdBefore** | **String**| Filter usages created before this date | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findProjectUsage"></a>
# **findProjectUsage**
> InlineResponse20044 findProjectUsage(id, createdAfter, createdBefore)

Retrieve all usages for project

Returns all usages for a project.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.UsagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

UsagesApi apiInstance = new UsagesApi();
UUID id = new UUID(); // UUID | Project UUID
String createdAfter = "createdAfter_example"; // String | Filter usages created after this date
String createdBefore = "createdBefore_example"; // String | Filter usages created before this date
try {
    InlineResponse20044 result = apiInstance.findProjectUsage(id, createdAfter, createdBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsagesApi#findProjectUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **createdAfter** | **String**| Filter usages created after this date | [optional]
 **createdBefore** | **String**| Filter usages created before this date | [optional]

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

