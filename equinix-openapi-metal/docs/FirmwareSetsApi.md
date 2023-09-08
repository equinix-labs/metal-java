# FirmwareSetsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrganizationFirmwareSets**](FirmwareSetsApi.md#getOrganizationFirmwareSets) | **GET** /organizations/{id}/firmware-sets | Get Organization&#39;s Firmware Sets |
| [**getProjectFirmwareSets**](FirmwareSetsApi.md#getProjectFirmwareSets) | **GET** /projects/{id}/firmware-sets | Get Project&#39;s Firmware Sets |


<a id="getOrganizationFirmwareSets"></a>
# **getOrganizationFirmwareSets**
> FirmwareSetListResponse getOrganizationFirmwareSets(id, page, perPage)

Get Organization&#39;s Firmware Sets

Returns all firmware sets associated with the organization.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.FirmwareSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    FirmwareSetsApi apiInstance = new FirmwareSetsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Organization UUID
    Integer page = 56; // Integer | page number to return
    Integer perPage = 56; // Integer | items returned per page.
    try {
      FirmwareSetListResponse result = apiInstance.getOrganizationFirmwareSets(id, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirmwareSetsApi#getOrganizationFirmwareSets");
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
| **id** | **UUID**| Organization UUID | |
| **page** | **Integer**| page number to return | [optional] |
| **perPage** | **Integer**| items returned per page. | [optional] |

### Return type

[**FirmwareSetListResponse**](FirmwareSetListResponse.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Error responses are included with 4xx and 5xx HTTP responses from the API service. Either \&quot;error\&quot; or \&quot;errors\&quot; will be set. |  -  |
| **404** | Error responses are included with 4xx and 5xx HTTP responses from the API service. Either \&quot;error\&quot; or \&quot;errors\&quot; will be set. |  -  |
| **500** | Internal Server Error |  -  |

<a id="getProjectFirmwareSets"></a>
# **getProjectFirmwareSets**
> FirmwareSetListResponse getProjectFirmwareSets(id, page, perPage)

Get Project&#39;s Firmware Sets

Returns all firmware sets associated with the project or organization.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.FirmwareSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    FirmwareSetsApi apiInstance = new FirmwareSetsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    Integer page = 56; // Integer | page number to return
    Integer perPage = 56; // Integer | items returned per page.
    try {
      FirmwareSetListResponse result = apiInstance.getProjectFirmwareSets(id, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirmwareSetsApi#getProjectFirmwareSets");
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
| **page** | **Integer**| page number to return | [optional] |
| **perPage** | **Integer**| items returned per page. | [optional] |

### Return type

[**FirmwareSetListResponse**](FirmwareSetListResponse.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Error responses are included with 4xx and 5xx HTTP responses from the API service. Either \&quot;error\&quot; or \&quot;errors\&quot; will be set. |  -  |
| **404** | Error responses are included with 4xx and 5xx HTTP responses from the API service. Either \&quot;error\&quot; or \&quot;errors\&quot; will be set. |  -  |
| **500** | Internal Server Error |  -  |

