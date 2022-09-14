# MetalGatewaysApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMetalGateway**](MetalGatewaysApi.md#createMetalGateway) | **POST** /projects/{project_id}/metal-gateways | Create a metal gateway |
| [**deleteMetalGateway**](MetalGatewaysApi.md#deleteMetalGateway) | **DELETE** /metal-gateways/{id} | Deletes the metal gateway |
| [**findMetalGatewayById**](MetalGatewaysApi.md#findMetalGatewayById) | **GET** /metal-gateways/{id} | Returns the metal gateway |
| [**findMetalGatewaysByProject**](MetalGatewaysApi.md#findMetalGatewaysByProject) | **GET** /projects/{project_id}/metal-gateways | Returns all metal gateways for a project |


<a name="createMetalGateway"></a>
# **createMetalGateway**
> MetalGateway createMetalGateway(projectId, createMetalGatewayRequest, page, perPage)

Create a metal gateway

Create a metal gateway in a project

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    MetalGatewaysApi apiInstance = new MetalGatewaysApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | Project UUID
    CreateMetalGatewayRequest createMetalGatewayRequest = new CreateMetalGatewayRequest(); // CreateMetalGatewayRequest | Metal Gateway to create
    Integer page = 1; // Integer | Page to return
    Integer perPage = 10; // Integer | Items returned per page
    try {
      MetalGateway result = apiInstance.createMetalGateway(projectId, createMetalGatewayRequest, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetalGatewaysApi#createMetalGateway");
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
| **projectId** | **UUID**| Project UUID | |
| **createMetalGatewayRequest** | [**CreateMetalGatewayRequest**](CreateMetalGatewayRequest.md)| Metal Gateway to create | |
| **page** | **Integer**| Page to return | [optional] [default to 1] |
| **perPage** | **Integer**| Items returned per page | [optional] [default to 10] |

### Return type

[**MetalGateway**](MetalGateway.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  -  |
| **401** | unauthorized |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

<a name="deleteMetalGateway"></a>
# **deleteMetalGateway**
> deleteMetalGateway(id)

Deletes the metal gateway

Deletes a specific metal gateway

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    MetalGatewaysApi apiInstance = new MetalGatewaysApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Metal Gateway UUID
    try {
      apiInstance.deleteMetalGateway(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetalGatewaysApi#deleteMetalGateway");
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
| **id** | **UUID**| Metal Gateway UUID | |

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
| **404** | not found |  -  |

<a name="findMetalGatewayById"></a>
# **findMetalGatewayById**
> MetalGateway findMetalGatewayById(id, include, exclude)

Returns the metal gateway

Returns a specific metal gateway

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    MetalGatewaysApi apiInstance = new MetalGatewaysApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Metal Gateway UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      MetalGateway result = apiInstance.findMetalGatewayById(id, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetalGatewaysApi#findMetalGatewayById");
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
| **id** | **UUID**| Metal Gateway UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**MetalGateway**](MetalGateway.md)

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

<a name="findMetalGatewaysByProject"></a>
# **findMetalGatewaysByProject**
> MetalGatewayList findMetalGatewaysByProject(projectId, page, perPage)

Returns all metal gateways for a project

Return all metal gateways for a project

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    MetalGatewaysApi apiInstance = new MetalGatewaysApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | Project UUID
    Integer page = 1; // Integer | Page to return
    Integer perPage = 10; // Integer | Items returned per page
    try {
      MetalGatewayList result = apiInstance.findMetalGatewaysByProject(projectId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetalGatewaysApi#findMetalGatewaysByProject");
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
| **projectId** | **UUID**| Project UUID | |
| **page** | **Integer**| Page to return | [optional] [default to 1] |
| **perPage** | **Integer**| Items returned per page | [optional] [default to 10] |

### Return type

[**MetalGatewayList**](MetalGatewayList.md)

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

