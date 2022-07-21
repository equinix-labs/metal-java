# VrFsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVrf**](VrFsApi.md#createVrf) | **POST** /projects/{id}/vrfs | Create a new VRF in the specified project
[**deleteVrf**](VrFsApi.md#deleteVrf) | **DELETE** /vrfs/{id} | Delete the VRF
[**findVrfById**](VrFsApi.md#findVrfById) | **GET** /vrfs/{id} | Retrieve a VRF
[**findVrfIpReservations**](VrFsApi.md#findVrfIpReservations) | **GET** /vrfs/{id}/ips | Retrieve all VRF IP Reservations in the VRF
[**findVrfs**](VrFsApi.md#findVrfs) | **GET** /projects/{id}/vrfs | Retrieve all VRFs in the project
[**updateVrf**](VrFsApi.md#updateVrf) | **PUT** /vrfs/{id} | Update the VRF


<a name="createVrf"></a>
# **createVrf**
> InlineResponse20046Vrfs createVrf(id, body)

Create a new VRF in the specified project

Creates a new VRF in the specified project

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.VrFsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VrFsApi apiInstance = new VrFsApi();
UUID id = new UUID(); // UUID | Project UUID
Body33 body = new Body33(); // Body33 | VRF to create
try {
    InlineResponse20046Vrfs result = apiInstance.createVrf(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VrFsApi#createVrf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **body** | [**Body33**](Body33.md)| VRF to create |

### Return type

[**InlineResponse20046Vrfs**](InlineResponse20046Vrfs.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVrf"></a>
# **deleteVrf**
> deleteVrf(id)

Delete the VRF

Deletes the VRF

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.VrFsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VrFsApi apiInstance = new VrFsApi();
UUID id = new UUID(); // UUID | VRF UUID
try {
    apiInstance.deleteVrf(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VrFsApi#deleteVrf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| VRF UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findVrfById"></a>
# **findVrfById**
> InlineResponse20046Vrfs findVrfById(id, include, exclude)

Retrieve a VRF

Returns a single VRF resource

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.VrFsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VrFsApi apiInstance = new VrFsApi();
UUID id = new UUID(); // UUID | VRF UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20046Vrfs result = apiInstance.findVrfById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VrFsApi#findVrfById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| VRF UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20046Vrfs**](InlineResponse20046Vrfs.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findVrfIpReservations"></a>
# **findVrfIpReservations**
> InlineResponse20052 findVrfIpReservations(id, include, exclude)

Retrieve all VRF IP Reservations in the VRF

Returns the list of VRF IP Reservations for the VRF.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.VrFsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VrFsApi apiInstance = new VrFsApi();
UUID id = new UUID(); // UUID | VRF UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20052 result = apiInstance.findVrfIpReservations(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VrFsApi#findVrfIpReservations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| VRF UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findVrfs"></a>
# **findVrfs**
> InlineResponse20046 findVrfs(id, include, exclude, metro)

Retrieve all VRFs in the project

Returns the list of VRFs for a single project.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.VrFsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VrFsApi apiInstance = new VrFsApi();
UUID id = new UUID(); // UUID | Project UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
String metro = "metro_example"; // String | Filter by Metro ID (uuid) or Metro Code
try {
    InlineResponse20046 result = apiInstance.findVrfs(id, include, exclude, metro);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VrFsApi#findVrfs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **metro** | **String**| Filter by Metro ID (uuid) or Metro Code | [optional]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVrf"></a>
# **updateVrf**
> InlineResponse20046Vrfs updateVrf(id, body)

Update the VRF

Updates the VRF.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.VrFsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VrFsApi apiInstance = new VrFsApi();
UUID id = new UUID(); // UUID | VRF UUID
Body43 body = new Body43(); // Body43 | VRF to update
try {
    InlineResponse20046Vrfs result = apiInstance.updateVrf(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VrFsApi#updateVrf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| VRF UUID |
 **body** | [**Body43**](Body43.md)| VRF to update |

### Return type

[**InlineResponse20046Vrfs**](InlineResponse20046Vrfs.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

