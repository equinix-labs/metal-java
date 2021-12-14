# SelfServiceReservationsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSelfServiceReservation**](SelfServiceReservationsApi.md#createSelfServiceReservation) | **POST** /projects/{project_id}/self-service/reservations | Create a reservation
[**findSelfServiceReservation**](SelfServiceReservationsApi.md#findSelfServiceReservation) | **GET** /projects/{project_id}/self-service/reservations/{id} | Retrieve a reservation
[**findSelfServiceReservations**](SelfServiceReservationsApi.md#findSelfServiceReservations) | **GET** /projects/{project_id}/self-service/reservations | Retrieve all reservations


<a name="createSelfServiceReservation"></a>
# **createSelfServiceReservation**
> SelfServiceReservationResponse createSelfServiceReservation(reservation, projectId)

Create a reservation

Creates a reservation.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SelfServiceReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SelfServiceReservationsApi apiInstance = new SelfServiceReservationsApi();
CreateSelfServiceReservationRequest reservation = new CreateSelfServiceReservationRequest(); // CreateSelfServiceReservationRequest | reservation to create
UUID projectId = new UUID(); // UUID | Project UUID
try {
    SelfServiceReservationResponse result = apiInstance.createSelfServiceReservation(reservation, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfServiceReservationsApi#createSelfServiceReservation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reservation** | [**CreateSelfServiceReservationRequest**](CreateSelfServiceReservationRequest.md)| reservation to create |
 **projectId** | [**UUID**](.md)| Project UUID |

### Return type

[**SelfServiceReservationResponse**](SelfServiceReservationResponse.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSelfServiceReservation"></a>
# **findSelfServiceReservation**
> SelfServiceReservationResponse findSelfServiceReservation(id, projectId)

Retrieve a reservation

Returns a reservation

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SelfServiceReservationsApi;

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
    SelfServiceReservationResponse result = apiInstance.findSelfServiceReservation(id, projectId);
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

[**SelfServiceReservationResponse**](SelfServiceReservationResponse.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSelfServiceReservations"></a>
# **findSelfServiceReservations**
> SelfServiceReservationList findSelfServiceReservations(projectId, page, perPage)

Retrieve all reservations

Returns all reservations.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SelfServiceReservationsApi;

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
    SelfServiceReservationList result = apiInstance.findSelfServiceReservations(projectId, page, perPage);
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

[**SelfServiceReservationList**](SelfServiceReservationList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

