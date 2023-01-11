# HardwareReservationsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findHardwareReservationById**](HardwareReservationsApi.md#findHardwareReservationById) | **GET** /hardware-reservations/{id} | Retrieve a hardware reservation |
| [**findProjectHardwareReservations**](HardwareReservationsApi.md#findProjectHardwareReservations) | **GET** /projects/{id}/hardware-reservations | Retrieve all hardware reservations for a given project |
| [**moveHardwareReservation**](HardwareReservationsApi.md#moveHardwareReservation) | **POST** /hardware-reservations/{id}/move | Move a hardware reservation |


<a name="findHardwareReservationById"></a>
# **findHardwareReservationById**
> HardwareReservation findHardwareReservationById(id, include, exclude)

Retrieve a hardware reservation

Returns a single hardware reservation

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.HardwareReservationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    HardwareReservationsApi apiInstance = new HardwareReservationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | HardwareReservation UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      HardwareReservation result = apiInstance.findHardwareReservationById(id, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HardwareReservationsApi#findHardwareReservationById");
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
| **id** | **UUID**| HardwareReservation UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**HardwareReservation**](HardwareReservation.md)

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

<a name="findProjectHardwareReservations"></a>
# **findProjectHardwareReservations**
> HardwareReservationList findProjectHardwareReservations(id, include, exclude, page, perPage)

Retrieve all hardware reservations for a given project

Provides a collection of hardware reservations for a given project.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.HardwareReservationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    HardwareReservationsApi apiInstance = new HardwareReservationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    Integer page = 1; // Integer | Page to return
    Integer perPage = 10; // Integer | Items returned per page
    try {
      HardwareReservationList result = apiInstance.findProjectHardwareReservations(id, include, exclude, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HardwareReservationsApi#findProjectHardwareReservations");
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
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |
| **page** | **Integer**| Page to return | [optional] [default to 1] |
| **perPage** | **Integer**| Items returned per page | [optional] [default to 10] |

### Return type

[**HardwareReservationList**](HardwareReservationList.md)

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

<a name="moveHardwareReservation"></a>
# **moveHardwareReservation**
> HardwareReservation moveHardwareReservation(id, body)

Move a hardware reservation

Move a hardware reservation to another project

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.HardwareReservationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    HardwareReservationsApi apiInstance = new HardwareReservationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Hardware Reservation UUID
    UUID body = UUID.randomUUID(); // UUID | Project UUID
    try {
      HardwareReservation result = apiInstance.moveHardwareReservation(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HardwareReservationsApi#moveHardwareReservation");
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
| **id** | **UUID**| Hardware Reservation UUID | |
| **body** | **UUID**| Project UUID | |

### Return type

[**HardwareReservation**](HardwareReservation.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | ok |  -  |
| **401** | unauthorized |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |

