# VlaNsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVirtualNetwork**](VlaNsApi.md#createVirtualNetwork) | **POST** /projects/{id}/virtual-networks | Create a virtual network
[**deleteVirtualNetwork**](VlaNsApi.md#deleteVirtualNetwork) | **DELETE** /virtual-networks/{id} | Delete a virtual network
[**findVirtualNetworks**](VlaNsApi.md#findVirtualNetworks) | **GET** /projects/{id}/virtual-networks | Retrieve all virtual networks
[**getVirtualNetwork**](VlaNsApi.md#getVirtualNetwork) | **GET** /virtual-networks/{id} | Get a virtual network


<a name="createVirtualNetwork"></a>
# **createVirtualNetwork**
> InlineResponse20045VirtualNetworks createVirtualNetwork(id, body)

Create a virtual network

Creates an virtual network.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Project UUID
Body32 body = new Body32(); // Body32 | Virtual Network to create
try {
    InlineResponse20045VirtualNetworks result = apiInstance.createVirtualNetwork(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#createVirtualNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **body** | [**Body32**](Body32.md)| Virtual Network to create |

### Return type

[**InlineResponse20045VirtualNetworks**](InlineResponse20045VirtualNetworks.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVirtualNetwork"></a>
# **deleteVirtualNetwork**
> InlineResponse20045VirtualNetworks deleteVirtualNetwork(id)

Delete a virtual network

Deletes a virtual network.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Virtual Network UUID
try {
    InlineResponse20045VirtualNetworks result = apiInstance.deleteVirtualNetwork(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#deleteVirtualNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Virtual Network UUID |

### Return type

[**InlineResponse20045VirtualNetworks**](InlineResponse20045VirtualNetworks.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findVirtualNetworks"></a>
# **findVirtualNetworks**
> InlineResponse20045 findVirtualNetworks(id, include, exclude, facility, metro)

Retrieve all virtual networks

Provides a list of virtual networks for a single project.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Project UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
String facility = "facility_example"; // String | Filter by Facility ID (uuid) or Facility Code
String metro = "metro_example"; // String | Filter by Metro ID (uuid) or Metro Code
try {
    InlineResponse20045 result = apiInstance.findVirtualNetworks(id, include, exclude, facility, metro);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#findVirtualNetworks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **facility** | **String**| Filter by Facility ID (uuid) or Facility Code | [optional]
 **metro** | **String**| Filter by Metro ID (uuid) or Metro Code | [optional]

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVirtualNetwork"></a>
# **getVirtualNetwork**
> InlineResponse20045VirtualNetworks getVirtualNetwork(id)

Get a virtual network

Get a virtual network.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Virtual Network UUID
try {
    InlineResponse20045VirtualNetworks result = apiInstance.getVirtualNetwork(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#getVirtualNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Virtual Network UUID |

### Return type

[**InlineResponse20045VirtualNetworks**](InlineResponse20045VirtualNetworks.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

