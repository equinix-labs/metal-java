# CapacityApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkCapacityForFacility**](CapacityApi.md#checkCapacityForFacility) | **POST** /capacity | Check capacity |
| [**checkCapacityForMetro**](CapacityApi.md#checkCapacityForMetro) | **POST** /capacity/metros | Check capacity for a metro |
| [**findCapacityForFacility**](CapacityApi.md#findCapacityForFacility) | **GET** /capacity | View capacity |
| [**findCapacityForMetro**](CapacityApi.md#findCapacityForMetro) | **GET** /capacity/metros | View capacity for metros |
| [**findOrganizationCapacityPerFacility**](CapacityApi.md#findOrganizationCapacityPerFacility) | **GET** /organizations/{id}/capacity | View available hardware plans per Facility for given organization |
| [**findOrganizationCapacityPerMetro**](CapacityApi.md#findOrganizationCapacityPerMetro) | **GET** /organizations/{id}/capacity/metros | View available hardware plans per Metro for given organization |


<a name="checkCapacityForFacility"></a>
# **checkCapacityForFacility**
> CapacityCheckPerFacilityList checkCapacityForFacility(capacityInput)

Check capacity

Validates if a deploy can be fulfilled.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.CapacityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    CapacityApi apiInstance = new CapacityApi(defaultClient);
    CapacityInput capacityInput = new CapacityInput(); // CapacityInput | Facility to check capacity in
    try {
      CapacityCheckPerFacilityList result = apiInstance.checkCapacityForFacility(capacityInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapacityApi#checkCapacityForFacility");
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
| **capacityInput** | [**CapacityInput**](CapacityInput.md)| Facility to check capacity in | |

### Return type

[**CapacityCheckPerFacilityList**](CapacityCheckPerFacilityList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **422** | unprocessable entity |  -  |

<a name="checkCapacityForMetro"></a>
# **checkCapacityForMetro**
> CapacityCheckPerMetroList checkCapacityForMetro(capacityInput)

Check capacity for a metro

Validates if a deploy can be fulfilled in a metro.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.CapacityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    CapacityApi apiInstance = new CapacityApi(defaultClient);
    CapacityInput capacityInput = new CapacityInput(); // CapacityInput | Metro to check capacity in
    try {
      CapacityCheckPerMetroList result = apiInstance.checkCapacityForMetro(capacityInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapacityApi#checkCapacityForMetro");
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
| **capacityInput** | [**CapacityInput**](CapacityInput.md)| Metro to check capacity in | |

### Return type

[**CapacityCheckPerMetroList**](CapacityCheckPerMetroList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **422** | unprocessable entity |  -  |

<a name="findCapacityForFacility"></a>
# **findCapacityForFacility**
> CapacityList findCapacityForFacility()

View capacity

Returns a list of facilities and plans with their current capacity.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.CapacityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    CapacityApi apiInstance = new CapacityApi(defaultClient);
    try {
      CapacityList result = apiInstance.findCapacityForFacility();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapacityApi#findCapacityForFacility");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CapacityList**](CapacityList.md)

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

<a name="findCapacityForMetro"></a>
# **findCapacityForMetro**
> CapacityList findCapacityForMetro()

View capacity for metros

Returns a list of metros and plans with their current capacity.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.CapacityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    CapacityApi apiInstance = new CapacityApi(defaultClient);
    try {
      CapacityList result = apiInstance.findCapacityForMetro();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapacityApi#findCapacityForMetro");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CapacityList**](CapacityList.md)

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

<a name="findOrganizationCapacityPerFacility"></a>
# **findOrganizationCapacityPerFacility**
> CapacityList findOrganizationCapacityPerFacility(id)

View available hardware plans per Facility for given organization

Returns a list of facilities and plans with their current capacity.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.CapacityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    CapacityApi apiInstance = new CapacityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Organization UUID
    try {
      CapacityList result = apiInstance.findOrganizationCapacityPerFacility(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapacityApi#findOrganizationCapacityPerFacility");
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
| **id** | **UUID**| Organization UUID | |

### Return type

[**CapacityList**](CapacityList.md)

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

<a name="findOrganizationCapacityPerMetro"></a>
# **findOrganizationCapacityPerMetro**
> CapacityList findOrganizationCapacityPerMetro(id)

View available hardware plans per Metro for given organization

Returns a list of metros and plans with their current capacity.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.CapacityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    CapacityApi apiInstance = new CapacityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Organization UUID
    try {
      CapacityList result = apiInstance.findOrganizationCapacityPerMetro(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapacityApi#findOrganizationCapacityPerMetro");
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
| **id** | **UUID**| Organization UUID | |

### Return type

[**CapacityList**](CapacityList.md)

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

