# SpotMarketApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpotMarketRequest**](SpotMarketApi.md#createSpotMarketRequest) | **POST** /projects/{id}/spot-market-requests | Create a spot market request
[**deleteSpotMarketRequest**](SpotMarketApi.md#deleteSpotMarketRequest) | **DELETE** /spot-market-requests/{id} | Delete the spot market request
[**findMetroSpotMarketPrices**](SpotMarketApi.md#findMetroSpotMarketPrices) | **GET** /market/spot/prices/metros | Get current spot market prices for metros
[**findSpotMarketPrices**](SpotMarketApi.md#findSpotMarketPrices) | **GET** /market/spot/prices | Get current spot market prices
[**findSpotMarketPricesHistory**](SpotMarketApi.md#findSpotMarketPricesHistory) | **GET** /market/spot/prices/history | Get spot market prices for a given period of time
[**findSpotMarketRequestById**](SpotMarketApi.md#findSpotMarketRequestById) | **GET** /spot-market-requests/{id} | Retrieve a spot market request
[**listSpotMarketRequests**](SpotMarketApi.md#listSpotMarketRequests) | **GET** /projects/{id}/spot-market-requests | List spot market requests


<a name="createSpotMarketRequest"></a>
# **createSpotMarketRequest**
> InlineResponse20043SpotMarketRequests createSpotMarketRequest(id, body)

Create a spot market request

Creates a new spot market request.  Type-specific options (such as operating_system for baremetal devices) should be included in the main data structure alongside hostname and plan.  The features attribute allows you to optionally specify what features your server should have. For example, if you require a server with a TPM chip, you may specify &#x60;{ \&quot;features\&quot;: { \&quot;tpm\&quot;: \&quot;required\&quot; } }&#x60; (or &#x60;{ \&quot;features\&quot;: [\&quot;tpm\&quot;] }&#x60; in shorthand).  The request will fail if there are no available servers matching your criteria. Alternatively, if you do not require a certain feature, but would prefer to be assigned a server with that feature if there are any available, you may specify that feature with a preferred value (see the example request below).  The request will not fail if we have no servers with that feature in our inventory.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SpotMarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketApi apiInstance = new SpotMarketApi();
UUID id = new UUID(); // UUID | Project UUID
Body29 body = new Body29(); // Body29 | Spot Market Request to create
try {
    InlineResponse20043SpotMarketRequests result = apiInstance.createSpotMarketRequest(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketApi#createSpotMarketRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **body** | [**Body29**](Body29.md)| Spot Market Request to create |

### Return type

[**InlineResponse20043SpotMarketRequests**](InlineResponse20043SpotMarketRequests.md)

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
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SpotMarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketApi apiInstance = new SpotMarketApi();
UUID id = new UUID(); // UUID | SpotMarketRequest UUID
Boolean forceTermination = true; // Boolean | Terminate associated spot instances
try {
    apiInstance.deleteSpotMarketRequest(id, forceTermination);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketApi#deleteSpotMarketRequest");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findMetroSpotMarketPrices"></a>
# **findMetroSpotMarketPrices**
> InlineResponse20024 findMetroSpotMarketPrices(metro, plan)

Get current spot market prices for metros

Get Equinix Metal current spot market prices for all metros.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SpotMarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketApi apiInstance = new SpotMarketApi();
String metro = "metro_example"; // String | Metro to filter spot market prices
String plan = "plan_example"; // String | Plan to filter spot market prices
try {
    InlineResponse20024 result = apiInstance.findMetroSpotMarketPrices(metro, plan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketApi#findMetroSpotMarketPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metro** | **String**| Metro to filter spot market prices | [optional]
 **plan** | **String**| Plan to filter spot market prices | [optional]

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findSpotMarketPrices"></a>
# **findSpotMarketPrices**
> InlineResponse20022 findSpotMarketPrices(facility, plan)

Get current spot market prices

Get Equinix Metal current spot market prices.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SpotMarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketApi apiInstance = new SpotMarketApi();
String facility = "facility_example"; // String | Facility to check spot market prices
String plan = "plan_example"; // String | Plan to check spot market prices
try {
    InlineResponse20022 result = apiInstance.findSpotMarketPrices(facility, plan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketApi#findSpotMarketPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facility** | **String**| Facility to check spot market prices | [optional]
 **plan** | **String**| Plan to check spot market prices | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findSpotMarketPricesHistory"></a>
# **findSpotMarketPricesHistory**
> InlineResponse20023 findSpotMarketPricesHistory(facility, plan, from, until, metro)

Get spot market prices for a given period of time

Get spot market prices for a given plan and facility in a fixed period of time  *Note: In the &#x60;200&#x60; response, the property &#x60;datapoints&#x60; contains arrays of &#x60;[float, integer]&#x60;.*

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SpotMarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketApi apiInstance = new SpotMarketApi();
String facility = "facility_example"; // String | Facility to check spot market prices
String plan = "plan_example"; // String | Plan to check spot market prices
String from = "from_example"; // String | Timestamp from range
String until = "until_example"; // String | Timestamp to range
String metro = "metro_example"; // String | Metro to check spot market price history
try {
    InlineResponse20023 result = apiInstance.findSpotMarketPricesHistory(facility, plan, from, until, metro);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketApi#findSpotMarketPricesHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facility** | **String**| Facility to check spot market prices |
 **plan** | **String**| Plan to check spot market prices |
 **from** | **String**| Timestamp from range |
 **until** | **String**| Timestamp to range |
 **metro** | **String**| Metro to check spot market price history | [optional]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findSpotMarketRequestById"></a>
# **findSpotMarketRequestById**
> InlineResponse20043SpotMarketRequests findSpotMarketRequestById(id, include, exclude)

Retrieve a spot market request

Returns a single spot market request

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SpotMarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketApi apiInstance = new SpotMarketApi();
UUID id = new UUID(); // UUID | SpotMarketRequest UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20043SpotMarketRequests result = apiInstance.findSpotMarketRequestById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketApi#findSpotMarketRequestById");
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

[**InlineResponse20043SpotMarketRequests**](InlineResponse20043SpotMarketRequests.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpotMarketRequests"></a>
# **listSpotMarketRequests**
> InlineResponse20043 listSpotMarketRequests(id)

List spot market requests

View all spot market requests for a given project.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SpotMarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SpotMarketApi apiInstance = new SpotMarketApi();
UUID id = new UUID(); // UUID | Project UUID
try {
    InlineResponse20043 result = apiInstance.listSpotMarketRequests(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpotMarketApi#listSpotMarketRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

