# MetrosApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findMetros**](MetrosApi.md#findMetros) | **GET** /locations/metros | Retrieve all metros
[**getMetro**](MetrosApi.md#getMetro) | **GET** /locations/metros/{id} | Retrieve a specific Metro&#39;s details


<a name="findMetros"></a>
# **findMetros**
> MetroList findMetros()

Retrieve all metros

Provides a listing of available metros

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.MetrosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MetrosApi apiInstance = new MetrosApi();
try {
    MetroList result = apiInstance.findMetros();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetrosApi#findMetros");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MetroList**](MetroList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMetro"></a>
# **getMetro**
> Metro getMetro(id)

Retrieve a specific Metro&#39;s details

Show the details for a metro, including name, code, and country.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.MetrosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MetrosApi apiInstance = new MetrosApi();
UUID id = new UUID(); // UUID | Metro UUID
try {
    Metro result = apiInstance.getMetro(id);
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

[**Metro**](Metro.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

