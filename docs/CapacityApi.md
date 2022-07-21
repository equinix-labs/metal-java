# CapacityApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkCapacityForFacility**](CapacityApi.md#checkCapacityForFacility) | **POST** /capacity | Check capacity
[**checkCapacityForMetro**](CapacityApi.md#checkCapacityForMetro) | **POST** /capacity/metros | Check capacity for a metro
[**findCapacityForFacility**](CapacityApi.md#findCapacityForFacility) | **GET** /capacity | View capacity
[**findCapacityForMetro**](CapacityApi.md#findCapacityForMetro) | **GET** /capacity/metros | View capacity for metros
[**findOrganizationCapacityPerFacility**](CapacityApi.md#findOrganizationCapacityPerFacility) | **GET** /organizations/{id}/capacity | View available hardware plans per Facility for given organization
[**findOrganizationCapacityPerMetro**](CapacityApi.md#findOrganizationCapacityPerMetro) | **GET** /organizations/{id}/capacity/metros | View available hardware plans per Metro for given organization


<a name="checkCapacityForFacility"></a>
# **checkCapacityForFacility**
> InlineResponse2003 checkCapacityForFacility(body)

Check capacity

Validates if a deploy can be fulfilled.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
Body body = new Body(); // Body | Facility to check capacity in
try {
    InlineResponse2003 result = apiInstance.checkCapacityForFacility(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CapacityApi#checkCapacityForFacility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)| Facility to check capacity in |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkCapacityForMetro"></a>
# **checkCapacityForMetro**
> InlineResponse2005 checkCapacityForMetro(body)

Check capacity for a metro

Validates if a deploy can be fulfilled in a metro.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
Body1 body = new Body1(); // Body1 | Metro to check capacity in
try {
    InlineResponse2005 result = apiInstance.checkCapacityForMetro(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CapacityApi#checkCapacityForMetro");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body1**](Body1.md)| Metro to check capacity in |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findCapacityForFacility"></a>
# **findCapacityForFacility**
> InlineResponse2002 findCapacityForFacility()

View capacity

Returns a list of facilities and plans with their current capacity.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
try {
    InlineResponse2002 result = apiInstance.findCapacityForFacility();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CapacityApi#findCapacityForFacility");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findCapacityForMetro"></a>
# **findCapacityForMetro**
> InlineResponse2004 findCapacityForMetro()

View capacity for metros

Returns a list of metros and plans with their current capacity.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
try {
    InlineResponse2004 result = apiInstance.findCapacityForMetro();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CapacityApi#findCapacityForMetro");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrganizationCapacityPerFacility"></a>
# **findOrganizationCapacityPerFacility**
> InlineResponse2002 findOrganizationCapacityPerFacility(id)

View available hardware plans per Facility for given organization

Returns a list of facilities and plans with their current capacity.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
UUID id = new UUID(); // UUID | Organization UUID
try {
    InlineResponse2002 result = apiInstance.findOrganizationCapacityPerFacility(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CapacityApi#findOrganizationCapacityPerFacility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrganizationCapacityPerMetro"></a>
# **findOrganizationCapacityPerMetro**
> InlineResponse2004 findOrganizationCapacityPerMetro(id)

View available hardware plans per Metro for given organization

Returns a list of metros and plans with their current capacity.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
UUID id = new UUID(); // UUID | Organization UUID
try {
    InlineResponse2004 result = apiInstance.findOrganizationCapacityPerMetro(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CapacityApi#findOrganizationCapacityPerMetro");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

