# IpAddressesApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIPAssignment**](IpAddressesApi.md#createIPAssignment) | **POST** /devices/{id}/ips | Create an ip assignment
[**createSelfServiceReservation**](IpAddressesApi.md#createSelfServiceReservation) | **POST** /projects/{project_id}/self-service/reservations | Create a reservation
[**deleteIPAddress**](IpAddressesApi.md#deleteIPAddress) | **DELETE** /ips/{id} | Unassign an ip address
[**findIPAddressById**](IpAddressesApi.md#findIPAddressById) | **GET** /ips/{id} | Retrieve an ip address
[**findIPAddressCustomdata**](IpAddressesApi.md#findIPAddressCustomdata) | **GET** /ips/{id}/customdata | Retrieve the custom metadata of an IP Reservation or IP Assignment
[**findIPAssignments**](IpAddressesApi.md#findIPAssignments) | **GET** /devices/{id}/ips | Retrieve all ip assignments
[**findIPAvailabilities**](IpAddressesApi.md#findIPAvailabilities) | **GET** /ips/{id}/available | Retrieve all available subnets of a particular reservation
[**findIPReservations**](IpAddressesApi.md#findIPReservations) | **GET** /projects/{id}/ips | Retrieve all ip reservations
[**findSelfServiceReservation**](IpAddressesApi.md#findSelfServiceReservation) | **GET** /projects/{project_id}/self-service/reservations/{id} | Retrieve a reservation
[**findSelfServiceReservations**](IpAddressesApi.md#findSelfServiceReservations) | **GET** /projects/{project_id}/self-service/reservations | Retrieve all reservations
[**requestIPReservation**](IpAddressesApi.md#requestIPReservation) | **POST** /projects/{id}/ips | Requesting IP reservations
[**updateIPAddress**](IpAddressesApi.md#updateIPAddress) | **PATCH** /ips/{id} | Update an ip address


<a name="createIPAssignment"></a>
# **createIPAssignment**
> IPAssignment createIPAssignment(id, ipAssignment)

Create an ip assignment

Creates an ip assignment for a device.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID id = new UUID(); // UUID | Device UUID
IPAssignmentInput ipAssignment = new IPAssignmentInput(); // IPAssignmentInput | IPAssignment to create
try {
    IPAssignment result = apiInstance.createIPAssignment(id, ipAssignment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#createIPAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **ipAssignment** | [**IPAssignmentInput**](IPAssignmentInput.md)| IPAssignment to create |

### Return type

[**IPAssignment**](IPAssignment.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
CreateSelfServiceReservationRequest reservation = new CreateSelfServiceReservationRequest(); // CreateSelfServiceReservationRequest | reservation to create
UUID projectId = new UUID(); // UUID | Project UUID
try {
    SelfServiceReservationResponse result = apiInstance.createSelfServiceReservation(reservation, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#createSelfServiceReservation");
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

<a name="deleteIPAddress"></a>
# **deleteIPAddress**
> deleteIPAddress(id)

Unassign an ip address

Note! This call can be used to un-assign an IP assignment or delete an IP reservation. Un-assign an IP address record. Use the assignment UUID you get after attaching the IP. This will remove the relationship between an IP and the device and will make the IP address available to be assigned to another device. Delete and IP reservation. Use the reservation UUID you get after adding the IP to the project. This will permanently delete the IP block reservation from the project.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID id = new UUID(); // UUID | IP Address UUID
try {
    apiInstance.deleteIPAddress(id);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#deleteIPAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| IP Address UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findIPAddressById"></a>
# **findIPAddressById**
> IPAssignment findIPAddressById(id, include, exclude)

Retrieve an ip address

Returns a single ip address if the user has access.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID id = new UUID(); // UUID | IP Address UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    IPAssignment result = apiInstance.findIPAddressById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#findIPAddressById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| IP Address UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**IPAssignment**](IPAssignment.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findIPAddressCustomdata"></a>
# **findIPAddressCustomdata**
> findIPAddressCustomdata(id)

Retrieve the custom metadata of an IP Reservation or IP Assignment

Provides the custom metadata stored for this IP Reservation or IP Assignment in json format

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID id = new UUID(); // UUID | Ip Reservation UUID
try {
    apiInstance.findIPAddressCustomdata(id);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#findIPAddressCustomdata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Ip Reservation UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findIPAssignments"></a>
# **findIPAssignments**
> IPAssignmentList findIPAssignments(id, include, exclude)

Retrieve all ip assignments

Returns all ip assignments for a device.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID id = new UUID(); // UUID | Device UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    IPAssignmentList result = apiInstance.findIPAssignments(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#findIPAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**IPAssignmentList**](IPAssignmentList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findIPAvailabilities"></a>
# **findIPAvailabilities**
> IPAvailabilitiesList findIPAvailabilities(id, cidr)

Retrieve all available subnets of a particular reservation

Provides a list of IP resevations for a single project.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID id = new UUID(); // UUID | IP Reservation UUID
String cidr = "cidr_example"; // String | Size of subnets in bits
try {
    IPAvailabilitiesList result = apiInstance.findIPAvailabilities(id, cidr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#findIPAvailabilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| IP Reservation UUID |
 **cidr** | **String**| Size of subnets in bits | [enum: 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128]

### Return type

[**IPAvailabilitiesList**](IPAvailabilitiesList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findIPReservations"></a>
# **findIPReservations**
> IPReservationList findIPReservations(id, include, exclude)

Retrieve all ip reservations

Provides a list of IP resevations for a single project.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID id = new UUID(); // UUID | Project UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    IPReservationList result = apiInstance.findIPReservations(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#findIPReservations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**IPReservationList**](IPReservationList.md)

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
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID id = new UUID(); // UUID | Reservation short_id
UUID projectId = new UUID(); // UUID | Project UUID
try {
    SelfServiceReservationResponse result = apiInstance.findSelfServiceReservation(id, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#findSelfServiceReservation");
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
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID projectId = new UUID(); // UUID | Project UUID
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    SelfServiceReservationList result = apiInstance.findSelfServiceReservations(projectId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#findSelfServiceReservations");
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

<a name="requestIPReservation"></a>
# **requestIPReservation**
> IPReservation requestIPReservation(id, ipReservationRequest)

Requesting IP reservations

Request more IP space for a project in order to have additional IP addresses to assign to devices.  If the request is within the max quota, an IP reservation will be created. If the project will exceed its IP quota, a request will be submitted for review, and will return an IP Reservation with a &#x60;state&#x60; of &#x60;pending&#x60;. You can automatically have the request fail with HTTP status 422 instead of triggering the review process by providing the &#x60;fail_on_approval_required&#x60; parameter set to &#x60;true&#x60; in the request.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID id = new UUID(); // UUID | Project UUID
IPReservationRequestInput ipReservationRequest = new IPReservationRequestInput(); // IPReservationRequestInput | IP Reservation Request to create
try {
    IPReservation result = apiInstance.requestIPReservation(id, ipReservationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#requestIPReservation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **ipReservationRequest** | [**IPReservationRequestInput**](IPReservationRequestInput.md)| IP Reservation Request to create |

### Return type

[**IPReservation**](IPReservation.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIPAddress"></a>
# **updateIPAddress**
> IPAssignment updateIPAddress(id, details, customdata)

Update an ip address

Update details about an ip address

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.IpAddressesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

IpAddressesApi apiInstance = new IpAddressesApi();
UUID id = new UUID(); // UUID | IP Address UUID
String details = "details_example"; // String | Notes for this IP Assignment
String customdata = "customdata_example"; // String | Provides the custom metadata stored for this IP Assignment in json format
try {
    IPAssignment result = apiInstance.updateIPAddress(id, details, customdata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressesApi#updateIPAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| IP Address UUID |
 **details** | **String**| Notes for this IP Assignment |
 **customdata** | **String**| Provides the custom metadata stored for this IP Assignment in json format |

### Return type

[**IPAssignment**](IPAssignment.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

