# UserdataApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validateUserdata**](UserdataApi.md#validateUserdata) | **POST** /userdata/validate | Validate user data |


<a name="validateUserdata"></a>
# **validateUserdata**
> validateUserdata(userdata)

Validate user data

Validates user data (Userdata)

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.UserdataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    UserdataApi apiInstance = new UserdataApi(defaultClient);
    String userdata = "userdata_example"; // String | Userdata to validate
    try {
      apiInstance.validateUserdata(userdata);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserdataApi#validateUserdata");
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
| **userdata** | **String**| Userdata to validate | [optional] |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |
| **401** | unauthorized |  -  |
| **422** | unprocessable entity |  -  |

