# VlansApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVirtualNetwork**](VlansApi.md#createVirtualNetwork) | **POST** /projects/{id}/virtual-networks | Create a virtual network |
| [**deleteVirtualNetwork**](VlansApi.md#deleteVirtualNetwork) | **DELETE** /virtual-networks/{id} | Delete a virtual network |
| [**findVirtualNetworks**](VlansApi.md#findVirtualNetworks) | **GET** /projects/{id}/virtual-networks | Retrieve all virtual networks |
| [**getVirtualNetwork**](VlansApi.md#getVirtualNetwork) | **GET** /virtual-networks/{id} | Get a virtual network |


<a name="createVirtualNetwork"></a>
# **createVirtualNetwork**
> VirtualNetwork createVirtualNetwork(id, virtualNetworkCreateInput, include, exclude)

Create a virtual network

Creates an virtual network.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.VlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    VlansApi apiInstance = new VlansApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    VirtualNetworkCreateInput virtualNetworkCreateInput = new VirtualNetworkCreateInput(); // VirtualNetworkCreateInput | Virtual Network to create
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      VirtualNetwork result = apiInstance.createVirtualNetwork(id, virtualNetworkCreateInput, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VlansApi#createVirtualNetwork");
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
| **virtualNetworkCreateInput** | [**VirtualNetworkCreateInput**](VirtualNetworkCreateInput.md)| Virtual Network to create | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**VirtualNetwork**](VirtualNetwork.md)

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
| **403** | forbidden |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

<a name="deleteVirtualNetwork"></a>
# **deleteVirtualNetwork**
> VirtualNetwork deleteVirtualNetwork(id)

Delete a virtual network

Deletes a virtual network.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.VlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    VlansApi apiInstance = new VlansApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Virtual Network UUID
    try {
      VirtualNetwork result = apiInstance.deleteVirtualNetwork(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VlansApi#deleteVirtualNetwork");
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
| **id** | **UUID**| Virtual Network UUID | |

### Return type

[**VirtualNetwork**](VirtualNetwork.md)

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
| **403** | forbidden |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

<a name="findVirtualNetworks"></a>
# **findVirtualNetworks**
> VirtualNetworkList findVirtualNetworks(id, include, exclude, facility, metro)

Retrieve all virtual networks

Provides a list of virtual networks for a single project.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.VlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    VlansApi apiInstance = new VlansApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    String facility = "facility_example"; // String | Filter by Facility ID (uuid) or Facility Code
    String metro = "metro_example"; // String | Filter by Metro ID (uuid) or Metro Code
    try {
      VirtualNetworkList result = apiInstance.findVirtualNetworks(id, include, exclude, facility, metro);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VlansApi#findVirtualNetworks");
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
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |
| **facility** | **String**| Filter by Facility ID (uuid) or Facility Code | [optional] |
| **metro** | **String**| Filter by Metro ID (uuid) or Metro Code | [optional] |

### Return type

[**VirtualNetworkList**](VirtualNetworkList.md)

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
| **403** | forbidden |  -  |
| **404** | not found |  -  |

<a name="getVirtualNetwork"></a>
# **getVirtualNetwork**
> VirtualNetwork getVirtualNetwork(id)

Get a virtual network

Get a virtual network.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.VlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    VlansApi apiInstance = new VlansApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Virtual Network UUID
    try {
      VirtualNetwork result = apiInstance.getVirtualNetwork(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VlansApi#getVirtualNetwork");
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
| **id** | **UUID**| Virtual Network UUID | |

### Return type

[**VirtualNetwork**](VirtualNetwork.md)

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
| **403** | forbidden |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

