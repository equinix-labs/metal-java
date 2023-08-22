# UsagesApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findDeviceUsages**](UsagesApi.md#findDeviceUsages) | **GET** /devices/{id}/usages | Retrieve all usages for device |
| [**findProjectUsage**](UsagesApi.md#findProjectUsage) | **GET** /projects/{id}/usages | Retrieve all usages for project |


<a id="findDeviceUsages"></a>
# **findDeviceUsages**
> DeviceUsageList findDeviceUsages(id, createdAfter, createdBefore)

Retrieve all usages for device

Returns all usages for a device.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.UsagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    UsagesApi apiInstance = new UsagesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    String createdAfter = "createdAfter_example"; // String | Filter usages created after this date
    String createdBefore = "createdBefore_example"; // String | Filter usages created before this date
    try {
      DeviceUsageList result = apiInstance.findDeviceUsages(id, createdAfter, createdBefore);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsagesApi#findDeviceUsages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Device UUID | |
| **createdAfter** | **String**| Filter usages created after this date | [optional] |
| **createdBefore** | **String**| Filter usages created before this date | [optional] |

### Return type

[**DeviceUsageList**](DeviceUsageList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **404** | not found |  -  |

<a id="findProjectUsage"></a>
# **findProjectUsage**
> ProjectUsageList findProjectUsage(id, createdAfter, createdBefore)

Retrieve all usages for project

Returns all usages for a project.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.UsagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    UsagesApi apiInstance = new UsagesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    String createdAfter = "createdAfter_example"; // String | Filter usages created after this date
    String createdBefore = "createdBefore_example"; // String | Filter usages created before this date
    try {
      ProjectUsageList result = apiInstance.findProjectUsage(id, createdAfter, createdBefore);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsagesApi#findProjectUsage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Project UUID | |
| **createdAfter** | **String**| Filter usages created after this date | [optional] |
| **createdBefore** | **String**| Filter usages created before this date | [optional] |

### Return type

[**ProjectUsageList**](ProjectUsageList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **404** | not found |  -  |

