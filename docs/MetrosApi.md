# MetrosApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findMetros**](MetrosApi.md#findMetros) | **GET** /locations/metros | Retrieve all metros
[**getMetro**](MetrosApi.md#getMetro) | **GET** /locations/metros/{id} | Retrieve a specific Metro&#39;s details


<a name="findMetros"></a>
# **findMetros**
> InlineResponse20021 findMetros()

Retrieve all metros

Provides a listing of available metros

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.MetrosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MetrosApi apiInstance = new MetrosApi();
try {
    InlineResponse20021 result = apiInstance.findMetros();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetrosApi#findMetros");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetro"></a>
# **getMetro**
> InlineResponse20021Metros getMetro(id)

Retrieve a specific Metro&#39;s details

Show the details for a metro, including name, code, and country.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.MetrosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MetrosApi apiInstance = new MetrosApi();
UUID id = new UUID(); // UUID | Metro UUID
try {
    InlineResponse20021Metros result = apiInstance.getMetro(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetrosApi#getMetro");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Metro UUID |

### Return type

[**InlineResponse20021Metros**](InlineResponse20021Metros.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

