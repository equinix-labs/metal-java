# SpotMarketRequestApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpotMarketRequest**](SpotMarketRequestApi.md#createSpotMarketRequest) | **POST** /projects/{id}/spot-market-requests | Create a spot market request
[**deleteSpotMarketRequest**](SpotMarketRequestApi.md#deleteSpotMarketRequest) | **DELETE** /spot-market-requests/{id} | Delete the spot market request
[**findSpotMarketRequestById**](SpotMarketRequestApi.md#findSpotMarketRequestById) | **GET** /spot-market-requests/{id} | Retrieve a spot market request
[**listSpotMarketRequests**](SpotMarketRequestApi.md#listSpotMarketRequests) | **GET** /projects/{id}/spot-market-requests | List spot market requests


<a name="createSpotMarketRequest"></a>
# **createSpotMarketRequest**
> SpotMarketRequest createSpotMarketRequest(id, spotMarketRequest)

Create a spot market request

Creates a new spot market request.  Type-specific options (such as operating_system for baremetal devices) should be included in the main data structure alongside hostname and plan.  The features attribute allows you to optionally specify what features your server should have. For example, if you require a server with a TPM chip, you may specify &#x60;{ \&quot;features\&quot;: { \&quot;tpm\&quot;: \&quot;required\&quot; } }&#x60; (or &#x60;{ \&quot;features\&quot;: [\&quot;tpm\&quot;] }&#x60; in shorthand).  The request will fail if there are no available servers matching your criteria. Alternatively, if you do not require a certain feature, but would prefer to be assigned a server with that feature if there are any available, you may specify that feature with a preferred value (see the example request below).  The request will not fail if we have no servers with that feature in our inventory.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SpotMarketRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketRequestApi apiInstance = new SpotMarketRequestApi();
UUID id = new UUID(); // UUID | Project UUID
SpotMarketRequestCreateInput spotMarketRequest = new SpotMarketRequestCreateInput(); // SpotMarketRequestCreateInput | Spot Market Request to create
try {
    SpotMarketRequest result = apiInstance.createSpotMarketRequest(id, spotMarketRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketRequestApi#createSpotMarketRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **spotMarketRequest** | [**SpotMarketRequestCreateInput**](SpotMarketRequestCreateInput.md)| Spot Market Request to create |

### Return type

[**SpotMarketRequest**](SpotMarketRequest.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSpotMarketRequest"></a>
# **deleteSpotMarketRequest**
> deleteSpotMarketRequest(id, forceTermination)

Delete the spot market request

Deletes the spot market request.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SpotMarketRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketRequestApi apiInstance = new SpotMarketRequestApi();
UUID id = new UUID(); // UUID | SpotMarketRequest UUID
Boolean forceTermination = true; // Boolean | Terminate associated spot instances
try {
    apiInstance.deleteSpotMarketRequest(id, forceTermination);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketRequestApi#deleteSpotMarketRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| SpotMarketRequest UUID |
 **forceTermination** | **Boolean**| Terminate associated spot instances | [optional]

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSpotMarketRequestById"></a>
# **findSpotMarketRequestById**
> SpotMarketRequest findSpotMarketRequestById(id, include, exclude)

Retrieve a spot market request

Returns a single spot market request

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SpotMarketRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketRequestApi apiInstance = new SpotMarketRequestApi();
UUID id = new UUID(); // UUID | SpotMarketRequest UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    SpotMarketRequest result = apiInstance.findSpotMarketRequestById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketRequestApi#findSpotMarketRequestById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| SpotMarketRequest UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**SpotMarketRequest**](SpotMarketRequest.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSpotMarketRequests"></a>
# **listSpotMarketRequests**
> SpotMarketRequestList listSpotMarketRequests(id)

List spot market requests

View all spot market requests for a given project.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SpotMarketRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketRequestApi apiInstance = new SpotMarketRequestApi();
UUID id = new UUID(); // UUID | Project UUID
try {
    SpotMarketRequestList result = apiInstance.listSpotMarketRequests(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketRequestApi#listSpotMarketRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |

### Return type

[**SpotMarketRequestList**](SpotMarketRequestList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

