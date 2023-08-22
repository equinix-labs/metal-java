# SpotMarketApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSpotMarketRequest**](SpotMarketApi.md#createSpotMarketRequest) | **POST** /projects/{id}/spot-market-requests | Create a spot market request |
| [**deleteSpotMarketRequest**](SpotMarketApi.md#deleteSpotMarketRequest) | **DELETE** /spot-market-requests/{id} | Delete the spot market request |
| [**findMetroSpotMarketPrices**](SpotMarketApi.md#findMetroSpotMarketPrices) | **GET** /market/spot/prices/metros | Get current spot market prices for metros |
| [**findSpotMarketPrices**](SpotMarketApi.md#findSpotMarketPrices) | **GET** /market/spot/prices | Get current spot market prices |
| [**findSpotMarketPricesHistory**](SpotMarketApi.md#findSpotMarketPricesHistory) | **GET** /market/spot/prices/history | Get spot market prices for a given period of time |
| [**findSpotMarketRequestById**](SpotMarketApi.md#findSpotMarketRequestById) | **GET** /spot-market-requests/{id} | Retrieve a spot market request |
| [**listSpotMarketRequests**](SpotMarketApi.md#listSpotMarketRequests) | **GET** /projects/{id}/spot-market-requests | List spot market requests |


<a id="createSpotMarketRequest"></a>
# **createSpotMarketRequest**
> SpotMarketRequest createSpotMarketRequest(id, spotMarketRequestCreateInput)

Create a spot market request

Creates a new spot market request.  Type-specific options (such as operating_system for baremetal devices) should be included in the main data structure alongside hostname and plan.  The features attribute allows you to optionally specify what features your server should have. For example, if you require a server with a TPM chip, you may specify &#x60;{ \&quot;features\&quot;: { \&quot;tpm\&quot;: \&quot;required\&quot; } }&#x60; (or &#x60;{ \&quot;features\&quot;: [\&quot;tpm\&quot;] }&#x60; in shorthand).  The request will fail if there are no available servers matching your criteria. Alternatively, if you do not require a certain feature, but would prefer to be assigned a server with that feature if there are any available, you may specify that feature with a preferred value (see the example request below).  The request will not fail if we have no servers with that feature in our inventory.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.SpotMarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    SpotMarketApi apiInstance = new SpotMarketApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    SpotMarketRequestCreateInput spotMarketRequestCreateInput = new SpotMarketRequestCreateInput(); // SpotMarketRequestCreateInput | Spot Market Request to create
    try {
      SpotMarketRequest result = apiInstance.createSpotMarketRequest(id, spotMarketRequestCreateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotMarketApi#createSpotMarketRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Project UUID | |
| **spotMarketRequestCreateInput** | [**SpotMarketRequestCreateInput**](SpotMarketRequestCreateInput.md)| Spot Market Request to create | |

### Return type

[**SpotMarketRequest**](SpotMarketRequest.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  -  |
| **401** | unauthorized |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

<a id="deleteSpotMarketRequest"></a>
# **deleteSpotMarketRequest**
> deleteSpotMarketRequest(id, forceTermination)

Delete the spot market request

Deletes the spot market request.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.SpotMarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    SpotMarketApi apiInstance = new SpotMarketApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | SpotMarketRequest UUID
    Boolean forceTermination = true; // Boolean | Terminate associated spot instances
    try {
      apiInstance.deleteSpotMarketRequest(id, forceTermination);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotMarketApi#deleteSpotMarketRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| SpotMarketRequest UUID | |
| **forceTermination** | **Boolean**| Terminate associated spot instances | [optional] |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |
| **401** | unauthorized |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |

<a id="findMetroSpotMarketPrices"></a>
# **findMetroSpotMarketPrices**
> SpotMarketPricesPerMetroList findMetroSpotMarketPrices(metro, plan)

Get current spot market prices for metros

Get Equinix Metal current spot market prices for all metros.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.SpotMarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    SpotMarketApi apiInstance = new SpotMarketApi(defaultClient);
    String metro = "metro_example"; // String | Metro to filter spot market prices
    String plan = "plan_example"; // String | Plan to filter spot market prices
    try {
      SpotMarketPricesPerMetroList result = apiInstance.findMetroSpotMarketPrices(metro, plan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotMarketApi#findMetroSpotMarketPrices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metro** | **String**| Metro to filter spot market prices | [optional] |
| **plan** | **String**| Plan to filter spot market prices | [optional] |

### Return type

[**SpotMarketPricesPerMetroList**](SpotMarketPricesPerMetroList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **422** | unprocessable entity |  -  |

<a id="findSpotMarketPrices"></a>
# **findSpotMarketPrices**
> SpotMarketPricesList findSpotMarketPrices(facility, plan)

Get current spot market prices

Get Equinix Metal current spot market prices.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.SpotMarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    SpotMarketApi apiInstance = new SpotMarketApi(defaultClient);
    String facility = "facility_example"; // String | Facility to check spot market prices
    String plan = "plan_example"; // String | Plan to check spot market prices
    try {
      SpotMarketPricesList result = apiInstance.findSpotMarketPrices(facility, plan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotMarketApi#findSpotMarketPrices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **facility** | **String**| Facility to check spot market prices | [optional] |
| **plan** | **String**| Plan to check spot market prices | [optional] |

### Return type

[**SpotMarketPricesList**](SpotMarketPricesList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **422** | unprocessable entity |  -  |

<a id="findSpotMarketPricesHistory"></a>
# **findSpotMarketPricesHistory**
> SpotPricesHistoryReport findSpotMarketPricesHistory(facility, plan, from, until, metro)

Get spot market prices for a given period of time

Get spot market prices for a given plan and facility in a fixed period of time  *Note: In the &#x60;200&#x60; response, the property &#x60;datapoints&#x60; contains arrays of &#x60;[float, integer]&#x60;.*

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.SpotMarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    SpotMarketApi apiInstance = new SpotMarketApi(defaultClient);
    String facility = "facility_example"; // String | Facility to check spot market prices
    String plan = "plan_example"; // String | Plan to check spot market prices
    String from = "from_example"; // String | Timestamp from range
    String until = "until_example"; // String | Timestamp to range
    String metro = "metro_example"; // String | Metro to check spot market price history
    try {
      SpotPricesHistoryReport result = apiInstance.findSpotMarketPricesHistory(facility, plan, from, until, metro);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotMarketApi#findSpotMarketPricesHistory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **facility** | **String**| Facility to check spot market prices | |
| **plan** | **String**| Plan to check spot market prices | |
| **from** | **String**| Timestamp from range | |
| **until** | **String**| Timestamp to range | |
| **metro** | **String**| Metro to check spot market price history | [optional] |

### Return type

[**SpotPricesHistoryReport**](SpotPricesHistoryReport.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **422** | unprocessable entity |  -  |

<a id="findSpotMarketRequestById"></a>
# **findSpotMarketRequestById**
> SpotMarketRequest findSpotMarketRequestById(id, include)

Retrieve a spot market request

Returns a single spot market request

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.SpotMarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    SpotMarketApi apiInstance = new SpotMarketApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | SpotMarketRequest UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      SpotMarketRequest result = apiInstance.findSpotMarketRequestById(id, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotMarketApi#findSpotMarketRequestById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| SpotMarketRequest UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**SpotMarketRequest**](SpotMarketRequest.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |

<a id="listSpotMarketRequests"></a>
# **listSpotMarketRequests**
> SpotMarketRequestList listSpotMarketRequests(id)

List spot market requests

View all spot market requests for a given project.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.SpotMarketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    SpotMarketApi apiInstance = new SpotMarketApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    try {
      SpotMarketRequestList result = apiInstance.listSpotMarketRequests(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpotMarketApi#listSpotMarketRequests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Project UUID | |

### Return type

[**SpotMarketRequestList**](SpotMarketRequestList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **404** | not found |  -  |

