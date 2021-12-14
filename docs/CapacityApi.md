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
> CapacityCheckPerFacilityList checkCapacityForFacility(facility)

Check capacity

Validates if a deploy can be fulfilled.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
CapacityInput facility = new CapacityInput(); // CapacityInput | Facility to check capacity in
try {
    CapacityCheckPerFacilityList result = apiInstance.checkCapacityForFacility(facility);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CapacityApi#checkCapacityForFacility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facility** | [**CapacityInput**](CapacityInput.md)| Facility to check capacity in |

### Return type

[**CapacityCheckPerFacilityList**](CapacityCheckPerFacilityList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkCapacityForMetro"></a>
# **checkCapacityForMetro**
> CapacityCheckPerMetroList checkCapacityForMetro(servers)

Check capacity for a metro

Validates if a deploy can be fulfilled in a metro.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
CapacityPerMetroInput servers = new CapacityPerMetroInput(); // CapacityPerMetroInput | Metro to check capacity in
try {
    CapacityCheckPerMetroList result = apiInstance.checkCapacityForMetro(servers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CapacityApi#checkCapacityForMetro");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **servers** | [**CapacityPerMetroInput**](CapacityPerMetroInput.md)| Metro to check capacity in |

### Return type

[**CapacityCheckPerMetroList**](CapacityCheckPerMetroList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findCapacityForFacility"></a>
# **findCapacityForFacility**
> CapacityList findCapacityForFacility()

View capacity

Returns a list of facilities and plans with their current capacity.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
try {
    CapacityList result = apiInstance.findCapacityForFacility();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CapacityApi#findCapacityForFacility");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CapacityList**](CapacityList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findCapacityForMetro"></a>
# **findCapacityForMetro**
> MetroCapacityList findCapacityForMetro()

View capacity for metros

Returns a list of metros and plans with their current capacity.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
try {
    MetroCapacityList result = apiInstance.findCapacityForMetro();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CapacityApi#findCapacityForMetro");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MetroCapacityList**](MetroCapacityList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findOrganizationCapacityPerFacility"></a>
# **findOrganizationCapacityPerFacility**
> CapacityList findOrganizationCapacityPerFacility(id)

View available hardware plans per Facility for given organization

Returns a list of facilities and plans with their current capacity.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
UUID id = new UUID(); // UUID | Organization UUID
try {
    CapacityList result = apiInstance.findOrganizationCapacityPerFacility(id);
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

[**CapacityList**](CapacityList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findOrganizationCapacityPerMetro"></a>
# **findOrganizationCapacityPerMetro**
> MetroCapacityList findOrganizationCapacityPerMetro(id)

View available hardware plans per Metro for given organization

Returns a list of metros and plans with their current capacity.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.CapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

CapacityApi apiInstance = new CapacityApi();
UUID id = new UUID(); // UUID | Organization UUID
try {
    MetroCapacityList result = apiInstance.findOrganizationCapacityPerMetro(id);
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

[**MetroCapacityList**](MetroCapacityList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

