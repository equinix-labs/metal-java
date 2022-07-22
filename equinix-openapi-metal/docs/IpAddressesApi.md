# IpAddressesApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteIPAddress**](IpAddressesApi.md#deleteIPAddress) | **DELETE** /ips/{id} | Unassign an ip address |
| [**findIPAddressById**](IpAddressesApi.md#findIPAddressById) | **GET** /ips/{id} | Retrieve an ip address |
| [**findIPAddressCustomdata**](IpAddressesApi.md#findIPAddressCustomdata) | **GET** /ips/{id}/customdata | Retrieve the custom metadata of an IP Reservation or IP Assignment |
| [**findIPAvailabilities**](IpAddressesApi.md#findIPAvailabilities) | **GET** /ips/{id}/available | Retrieve all available subnets of a particular reservation |
| [**findIPReservations**](IpAddressesApi.md#findIPReservations) | **GET** /projects/{id}/ips | Retrieve all ip reservations |
| [**requestIPReservation**](IpAddressesApi.md#requestIPReservation) | **POST** /projects/{id}/ips | Requesting IP reservations |
| [**updateIPAddress**](IpAddressesApi.md#updateIPAddress) | **PATCH** /ips/{id} | Update an ip address |


<a name="deleteIPAddress"></a>
# **deleteIPAddress**
> deleteIPAddress(id)

Unassign an ip address

Note! This call can be used to un-assign an IP assignment or delete an IP reservation. Un-assign an IP address record. Use the assignment UUID you get after attaching the IP. This will remove the relationship between an IP and the device and will make the IP address available to be assigned to another device. Delete and IP reservation. Use the reservation UUID you get after adding the IP to the project. This will permanently delete the IP block reservation from the project.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.IpAddressesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | IP Address UUID
    try {
      apiInstance.deleteIPAddress(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressesApi#deleteIPAddress");
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
| **id** | **UUID**| IP Address UUID | |

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

<a name="findIPAddressById"></a>
# **findIPAddressById**
> FindIPAddressById200Response findIPAddressById(id, include, exclude)

Retrieve an ip address

Returns a single ip address if the user has access.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.IpAddressesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | IP Address UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      FindIPAddressById200Response result = apiInstance.findIPAddressById(id, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressesApi#findIPAddressById");
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
| **id** | **UUID**| IP Address UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**FindIPAddressById200Response**](FindIPAddressById200Response.md)

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

<a name="findIPAddressCustomdata"></a>
# **findIPAddressCustomdata**
> findIPAddressCustomdata(id)

Retrieve the custom metadata of an IP Reservation or IP Assignment

Provides the custom metadata stored for this IP Reservation or IP Assignment in json format

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.IpAddressesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Ip Reservation UUID
    try {
      apiInstance.findIPAddressCustomdata(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressesApi#findIPAddressCustomdata");
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
| **id** | **UUID**| Ip Reservation UUID | |

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
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |

<a name="findIPAvailabilities"></a>
# **findIPAvailabilities**
> IPAvailabilitiesList findIPAvailabilities(id, cidr)

Retrieve all available subnets of a particular reservation

Provides a list of IP resevations for a single project.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.IpAddressesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | IP Reservation UUID
    String cidr = "20"; // String | Size of subnets in bits
    try {
      IPAvailabilitiesList result = apiInstance.findIPAvailabilities(id, cidr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressesApi#findIPAvailabilities");
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
| **id** | **UUID**| IP Reservation UUID | |
| **cidr** | **String**| Size of subnets in bits | [enum: 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128] |

### Return type

[**IPAvailabilitiesList**](IPAvailabilitiesList.md)

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

<a name="findIPReservations"></a>
# **findIPReservations**
> IPReservationList findIPReservations(id, types, include, exclude)

Retrieve all ip reservations

Provides a paginated list of IP reservations for a single project.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.IpAddressesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    List<String> types = Arrays.asList(); // List<String> | Filter project IP reservations by reservation type
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      IPReservationList result = apiInstance.findIPReservations(id, types, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressesApi#findIPReservations");
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
| **types** | [**List&lt;String&gt;**](String.md)| Filter project IP reservations by reservation type | [optional] [enum: global_ipv4, private_ipv4, public_ipv4, public_ipv6, vrf] |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**IPReservationList**](IPReservationList.md)

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

<a name="requestIPReservation"></a>
# **requestIPReservation**
> RequestIPReservation201Response requestIPReservation(id, requestIPReservationRequest)

Requesting IP reservations

Request more IP space for a project in order to have additional IP addresses to assign to devices.  If the request is within the max quota, an IP reservation will be created. If the project will exceed its IP quota, a request will be submitted for review, and will return an IP Reservation with a &#x60;state&#x60; of &#x60;pending&#x60;. You can automatically have the request fail with HTTP status 422 instead of triggering the review process by providing the &#x60;fail_on_approval_required&#x60; parameter set to &#x60;true&#x60; in the request.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.IpAddressesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    RequestIPReservationRequest requestIPReservationRequest = new RequestIPReservationRequest(); // RequestIPReservationRequest | IP Reservation Request to create
    try {
      RequestIPReservation201Response result = apiInstance.requestIPReservation(id, requestIPReservationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressesApi#requestIPReservation");
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
| **requestIPReservationRequest** | [**RequestIPReservationRequest**](RequestIPReservationRequest.md)| IP Reservation Request to create | |

### Return type

[**RequestIPReservation201Response**](RequestIPReservation201Response.md)

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
| **403** | forbidden |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

<a name="updateIPAddress"></a>
# **updateIPAddress**
> FindIPAddressById200Response updateIPAddress(id, details, customdata)

Update an ip address

Update details about an ip address

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.IpAddressesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | IP Address UUID
    String details = "details_example"; // String | Notes for this IP Assignment
    String customdata = "customdata_example"; // String | Provides the custom metadata stored for this IP Assignment in json format
    try {
      FindIPAddressById200Response result = apiInstance.updateIPAddress(id, details, customdata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressesApi#updateIPAddress");
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
| **id** | **UUID**| IP Address UUID | |
| **details** | **String**| Notes for this IP Assignment | |
| **customdata** | **String**| Provides the custom metadata stored for this IP Assignment in json format | |

### Return type

[**FindIPAddressById200Response**](FindIPAddressById200Response.md)

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

