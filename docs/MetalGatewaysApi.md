# MetalGatewaysApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMetalGateway**](MetalGatewaysApi.md#createMetalGateway) | **POST** /projects/{project_id}/metal-gateways | Create a metal gateway
[**deleteMetalGateway**](MetalGatewaysApi.md#deleteMetalGateway) | **DELETE** /metal-gateways/{id} | Deletes the metal gateway
[**findMetalGatewayById**](MetalGatewaysApi.md#findMetalGatewayById) | **GET** /metal-gateways/{id} | Returns the metal gateway
[**findMetalGatewaysByProject**](MetalGatewaysApi.md#findMetalGatewaysByProject) | **GET** /projects/{project_id}/metal-gateways | Returns all metal gateways for a project


<a name="createMetalGateway"></a>
# **createMetalGateway**
> Object createMetalGateway(projectId, body, page, perPage)

Create a metal gateway

Create a metal gateway in a project

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MetalGatewaysApi apiInstance = new MetalGatewaysApi();
UUID projectId = new UUID(); // UUID | Project UUID
Object body = null; // Object | Metal Gateway to create
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    Object result = apiInstance.createMetalGateway(projectId, body, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetalGatewaysApi#createMetalGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)| Project UUID |
 **body** | **Object**| Metal Gateway to create |
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

**Object**

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMetalGateway"></a>
# **deleteMetalGateway**
> deleteMetalGateway(id)

Deletes the metal gateway

Deletes a specific metal gateway

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MetalGatewaysApi apiInstance = new MetalGatewaysApi();
UUID id = new UUID(); // UUID | Metal Gateway UUID
try {
    apiInstance.deleteMetalGateway(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MetalGatewaysApi#deleteMetalGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Metal Gateway UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findMetalGatewayById"></a>
# **findMetalGatewayById**
> Object findMetalGatewayById(id)

Returns the metal gateway

Returns a specific metal gateway

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MetalGatewaysApi apiInstance = new MetalGatewaysApi();
UUID id = new UUID(); // UUID | Metal Gateway UUID
try {
    Object result = apiInstance.findMetalGatewayById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetalGatewaysApi#findMetalGatewayById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Metal Gateway UUID |

### Return type

**Object**

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findMetalGatewaysByProject"></a>
# **findMetalGatewaysByProject**
> InlineResponse20048 findMetalGatewaysByProject(projectId, page, perPage)

Returns all metal gateways for a project

Return all metal gateways for a project

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MetalGatewaysApi apiInstance = new MetalGatewaysApi();
UUID projectId = new UUID(); // UUID | Project UUID
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    InlineResponse20048 result = apiInstance.findMetalGatewaysByProject(projectId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetalGatewaysApi#findMetalGatewaysByProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)| Project UUID |
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

