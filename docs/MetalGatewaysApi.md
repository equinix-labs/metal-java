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
> MetalGateway createMetalGateway(projectId, metalGateway, page, perPage)

Create a metal gateway

Create a metal gateway in a project

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.MetalGatewaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MetalGatewaysApi apiInstance = new MetalGatewaysApi();
UUID projectId = new UUID(); // UUID | Project UUID
MetalGatewayInput metalGateway = new MetalGatewayInput(); // MetalGatewayInput | Metal Gateway to create
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    MetalGateway result = apiInstance.createMetalGateway(projectId, metalGateway, page, perPage);
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
 **metalGateway** | [**MetalGatewayInput**](MetalGatewayInput.md)| Metal Gateway to create |
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**MetalGateway**](MetalGateway.md)

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
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.MetalGatewaysApi;

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findMetalGatewayById"></a>
# **findMetalGatewayById**
> MetalGateway findMetalGatewayById(id)

Returns the metal gateway

Returns a specific metal gateway

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.MetalGatewaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MetalGatewaysApi apiInstance = new MetalGatewaysApi();
UUID id = new UUID(); // UUID | Metal Gateway UUID
try {
    MetalGateway result = apiInstance.findMetalGatewayById(id);
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

[**MetalGateway**](MetalGateway.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findMetalGatewaysByProject"></a>
# **findMetalGatewaysByProject**
> MetalGatewayList findMetalGatewaysByProject(projectId, page, perPage)

Returns all metal gateways for a project

Return all metal gateways for a project

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.MetalGatewaysApi;

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
    MetalGatewayList result = apiInstance.findMetalGatewaysByProject(projectId, page, perPage);
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

[**MetalGatewayList**](MetalGatewayList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

