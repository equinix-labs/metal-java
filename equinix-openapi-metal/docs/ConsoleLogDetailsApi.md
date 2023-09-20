# ConsoleLogDetailsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**captureScreenshot**](ConsoleLogDetailsApi.md#captureScreenshot) | **GET** /devices/{id}/diagnostics/screenshot |  |


<a id="captureScreenshot"></a>
# **captureScreenshot**
> File captureScreenshot(id)



Capture a screenshot from the device, if supported, via the BMC.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConsoleLogDetailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConsoleLogDetailsApi apiInstance = new ConsoleLogDetailsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    try {
      File result = apiInstance.captureScreenshot(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsoleLogDetailsApi#captureScreenshot");
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

### Return type

[**File**](File.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jpeg, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An image file |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |
| **501** | not implemented for device |  -  |

