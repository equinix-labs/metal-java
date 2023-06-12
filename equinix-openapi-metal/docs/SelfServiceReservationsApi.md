# SelfServiceReservationsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSelfServiceReservation**](SelfServiceReservationsApi.md#createSelfServiceReservation) | **POST** /projects/{project_id}/self-service/reservations | Create a reservation |
| [**findSelfServiceReservation**](SelfServiceReservationsApi.md#findSelfServiceReservation) | **GET** /projects/{project_id}/self-service/reservations/{id} | Retrieve a reservation |
| [**findSelfServiceReservations**](SelfServiceReservationsApi.md#findSelfServiceReservations) | **GET** /projects/{project_id}/self-service/reservations | Retrieve all reservations |


<a name="createSelfServiceReservation"></a>
# **createSelfServiceReservation**
> SelfServiceReservationResponse createSelfServiceReservation(projectId, createSelfServiceReservationRequest)

Create a reservation

Creates a reservation.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.SelfServiceReservationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    SelfServiceReservationsApi apiInstance = new SelfServiceReservationsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | Project UUID
    CreateSelfServiceReservationRequest createSelfServiceReservationRequest = new CreateSelfServiceReservationRequest(); // CreateSelfServiceReservationRequest | reservation to create
    try {
      SelfServiceReservationResponse result = apiInstance.createSelfServiceReservation(projectId, createSelfServiceReservationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServiceReservationsApi#createSelfServiceReservation");
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
| **projectId** | **UUID**| Project UUID | |
| **createSelfServiceReservationRequest** | [**CreateSelfServiceReservationRequest**](CreateSelfServiceReservationRequest.md)| reservation to create | |

### Return type

[**SelfServiceReservationResponse**](SelfServiceReservationResponse.md)

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
| **422** | unprocessable entity |  -  |

<a name="findSelfServiceReservation"></a>
# **findSelfServiceReservation**
> SelfServiceReservationResponse findSelfServiceReservation(id, projectId)

Retrieve a reservation

Returns a reservation

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.SelfServiceReservationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    SelfServiceReservationsApi apiInstance = new SelfServiceReservationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Reservation short_id
    UUID projectId = UUID.randomUUID(); // UUID | Project UUID
    try {
      SelfServiceReservationResponse result = apiInstance.findSelfServiceReservation(id, projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServiceReservationsApi#findSelfServiceReservation");
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
| **id** | **UUID**| Reservation short_id | |
| **projectId** | **UUID**| Project UUID | |

### Return type

[**SelfServiceReservationResponse**](SelfServiceReservationResponse.md)

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

<a name="findSelfServiceReservations"></a>
# **findSelfServiceReservations**
> SelfServiceReservationList findSelfServiceReservations(projectId, page, perPage, categories)

Retrieve all reservations

Returns all reservations.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.SelfServiceReservationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    SelfServiceReservationsApi apiInstance = new SelfServiceReservationsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | Project UUID
    Integer page = 1; // Integer | Page to return
    Integer perPage = 10; // Integer | Items returned per page
    List<String> categories = Arrays.asList(); // List<String> | Filter reservations by items category
    try {
      SelfServiceReservationList result = apiInstance.findSelfServiceReservations(projectId, page, perPage, categories);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfServiceReservationsApi#findSelfServiceReservations");
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
| **projectId** | **UUID**| Project UUID | |
| **page** | **Integer**| Page to return | [optional] [default to 1] |
| **perPage** | **Integer**| Items returned per page | [optional] [default to 10] |
| **categories** | [**List&lt;String&gt;**](String.md)| Filter reservations by items category | [optional] [enum: compute, storage] |

### Return type

[**SelfServiceReservationList**](SelfServiceReservationList.md)

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

