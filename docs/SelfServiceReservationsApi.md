# SelfServiceReservationsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSelfServiceReservation**](SelfServiceReservationsApi.md#createSelfServiceReservation) | **POST** /projects/{project_id}/self-service/reservations | Create a reservation
[**findSelfServiceReservation**](SelfServiceReservationsApi.md#findSelfServiceReservation) | **GET** /projects/{project_id}/self-service/reservations/{id} | Retrieve a reservation
[**findSelfServiceReservations**](SelfServiceReservationsApi.md#findSelfServiceReservations) | **GET** /projects/{project_id}/self-service/reservations | Retrieve all reservations


<a name="createSelfServiceReservation"></a>
# **createSelfServiceReservation**
> InlineResponse20049Reservations createSelfServiceReservation(projectId, body)

Create a reservation

Creates a reservation.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SelfServiceReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SelfServiceReservationsApi apiInstance = new SelfServiceReservationsApi();
UUID projectId = new UUID(); // UUID | Project UUID
Body36 body = new Body36(); // Body36 | reservation to create
try {
    InlineResponse20049Reservations result = apiInstance.createSelfServiceReservation(projectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfServiceReservationsApi#createSelfServiceReservation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)| Project UUID |
 **body** | [**Body36**](Body36.md)| reservation to create |

### Return type

[**InlineResponse20049Reservations**](InlineResponse20049Reservations.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSelfServiceReservation"></a>
# **findSelfServiceReservation**
> InlineResponse20049Reservations findSelfServiceReservation(id, projectId)

Retrieve a reservation

Returns a reservation

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SelfServiceReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SelfServiceReservationsApi apiInstance = new SelfServiceReservationsApi();
UUID id = new UUID(); // UUID | Reservation short_id
UUID projectId = new UUID(); // UUID | Project UUID
try {
    InlineResponse20049Reservations result = apiInstance.findSelfServiceReservation(id, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfServiceReservationsApi#findSelfServiceReservation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Reservation short_id |
 **projectId** | [**UUID**](.md)| Project UUID |

### Return type

[**InlineResponse20049Reservations**](InlineResponse20049Reservations.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findSelfServiceReservations"></a>
# **findSelfServiceReservations**
> InlineResponse20049 findSelfServiceReservations(projectId, page, perPage)

Retrieve all reservations

Returns all reservations.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SelfServiceReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SelfServiceReservationsApi apiInstance = new SelfServiceReservationsApi();
UUID projectId = new UUID(); // UUID | Project UUID
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    InlineResponse20049 result = apiInstance.findSelfServiceReservations(projectId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfServiceReservationsApi#findSelfServiceReservations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)| Project UUID |
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

