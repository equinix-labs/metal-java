# DevicesApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBgpSession**](DevicesApi.md#createBgpSession) | **POST** /devices/{id}/bgp/sessions | Create a BGP session |
| [**createDevice**](DevicesApi.md#createDevice) | **POST** /projects/{id}/devices | Create a device |
| [**createIPAssignment**](DevicesApi.md#createIPAssignment) | **POST** /devices/{id}/ips | Create an ip assignment |
| [**deleteDevice**](DevicesApi.md#deleteDevice) | **DELETE** /devices/{id} | Delete the device |
| [**findBgpSessions**](DevicesApi.md#findBgpSessions) | **GET** /devices/{id}/bgp/sessions | Retrieve all BGP sessions |
| [**findDeviceById**](DevicesApi.md#findDeviceById) | **GET** /devices/{id} | Retrieve a device |
| [**findDeviceCustomdata**](DevicesApi.md#findDeviceCustomdata) | **GET** /devices/{id}/customdata | Retrieve the custom metadata of an instance |
| [**findDeviceMetadataByID**](DevicesApi.md#findDeviceMetadataByID) | **GET** /devices/{id}/metadata | Retrieve metadata |
| [**findDeviceUserdataByID**](DevicesApi.md#findDeviceUserdataByID) | **GET** /devices/{id}/userdata | Retrieve userdata |
| [**findIPAssignmentCustomdata**](DevicesApi.md#findIPAssignmentCustomdata) | **GET** /devices/{instance_id}/ips/{id}/customdata | Retrieve the custom metadata of an IP Assignment |
| [**findIPAssignments**](DevicesApi.md#findIPAssignments) | **GET** /devices/{id}/ips | Retrieve all ip assignments |
| [**findInstanceBandwidth**](DevicesApi.md#findInstanceBandwidth) | **GET** /devices/{id}/bandwidth | Retrieve an instance bandwidth |
| [**findOrganizationDevices**](DevicesApi.md#findOrganizationDevices) | **GET** /organizations/{id}/devices | Retrieve all devices of an organization |
| [**findProjectDevices**](DevicesApi.md#findProjectDevices) | **GET** /projects/{id}/devices | Retrieve all devices of a project |
| [**findTraffic**](DevicesApi.md#findTraffic) | **GET** /devices/{id}/traffic | Retrieve device traffic |
| [**getBgpNeighborData**](DevicesApi.md#getBgpNeighborData) | **GET** /devices/{id}/bgp/neighbors | Retrieve BGP neighbor data for this device |
| [**performAction**](DevicesApi.md#performAction) | **POST** /devices/{id}/actions | Perform an action |
| [**updateDevice**](DevicesApi.md#updateDevice) | **PUT** /devices/{id} | Update the device |


<a name="createBgpSession"></a>
# **createBgpSession**
> BgpSession createBgpSession(id, bgPSessionInput)

Create a BGP session

Creates a BGP session.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    BGPSessionInput bgPSessionInput = new BGPSessionInput(); // BGPSessionInput | BGP session to create
    try {
      BgpSession result = apiInstance.createBgpSession(id, bgPSessionInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#createBgpSession");
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
| **id** | **UUID**| Device UUID | |
| **bgPSessionInput** | [**BGPSessionInput**](BGPSessionInput.md)| BGP session to create | |

### Return type

[**BgpSession**](BgpSession.md)

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
| **422** | unprocessable entity |  -  |

<a name="createDevice"></a>
# **createDevice**
> Device createDevice(id, createDeviceRequest, include, exclude)

Create a device

Creates a new device and provisions it in the specified location.  Device type-specific options are accepted.  For example, &#x60;baremetal&#x60; devices accept &#x60;operating_system&#x60;, &#x60;hostname&#x60;, and &#x60;plan&#x60;. These parameters may not be accepted for other device types. The default device type is &#x60;baremetal&#x60;.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    CreateDeviceRequest createDeviceRequest = new CreateDeviceRequest(); // CreateDeviceRequest | Device to create
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      Device result = apiInstance.createDevice(id, createDeviceRequest, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#createDevice");
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
| **createDeviceRequest** | [**CreateDeviceRequest**](CreateDeviceRequest.md)| Device to create | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**Device**](Device.md)

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

<a name="createIPAssignment"></a>
# **createIPAssignment**
> IPAssignment createIPAssignment(id, ipAssignmentInput, include, exclude)

Create an ip assignment

Creates an ip assignment for a device.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    IPAssignmentInput ipAssignmentInput = new IPAssignmentInput(); // IPAssignmentInput | IPAssignment to create
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      IPAssignment result = apiInstance.createIPAssignment(id, ipAssignmentInput, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#createIPAssignment");
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
| **id** | **UUID**| Device UUID | |
| **ipAssignmentInput** | [**IPAssignmentInput**](IPAssignmentInput.md)| IPAssignment to create | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**IPAssignment**](IPAssignment.md)

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

<a name="deleteDevice"></a>
# **deleteDevice**
> deleteDevice(id, forceDelete)

Delete the device

Deletes a device and deprovisions it in our datacenter.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    Boolean forceDelete = true; // Boolean | Force the deletion of the device, by detaching any storage volume still active.
    try {
      apiInstance.deleteDevice(id, forceDelete);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#deleteDevice");
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
| **id** | **UUID**| Device UUID | |
| **forceDelete** | **Boolean**| Force the deletion of the device, by detaching any storage volume still active. | [optional] |

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
| **422** | unprocessable entity |  -  |

<a name="findBgpSessions"></a>
# **findBgpSessions**
> BgpSessionList findBgpSessions(id)

Retrieve all BGP sessions

Provides a listing of available BGP sessions for the device.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    try {
      BgpSessionList result = apiInstance.findBgpSessions(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findBgpSessions");
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
| **id** | **UUID**| Device UUID | |

### Return type

[**BgpSessionList**](BgpSessionList.md)

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

<a name="findDeviceById"></a>
# **findDeviceById**
> Device findDeviceById(id, include, exclude)

Retrieve a device

Type-specific options (such as facility for baremetal devices) will be included as part of the main data structure.                          State value can be one of: active inactive queued or provisioning

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      Device result = apiInstance.findDeviceById(id, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findDeviceById");
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
| **id** | **UUID**| Device UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**Device**](Device.md)

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

<a name="findDeviceCustomdata"></a>
# **findDeviceCustomdata**
> findDeviceCustomdata(id)

Retrieve the custom metadata of an instance

Provides the custom metadata stored for this instance in json format

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Instance UUID
    try {
      apiInstance.findDeviceCustomdata(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findDeviceCustomdata");
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
| **id** | **UUID**| Instance UUID | |

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

<a name="findDeviceMetadataByID"></a>
# **findDeviceMetadataByID**
> Metadata findDeviceMetadataByID(id)

Retrieve metadata

Retrieve device metadata

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    try {
      Metadata result = apiInstance.findDeviceMetadataByID(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findDeviceMetadataByID");
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
| **id** | **UUID**| Device UUID | |

### Return type

[**Metadata**](Metadata.md)

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
| **422** | unprocessable entity |  -  |

<a name="findDeviceUserdataByID"></a>
# **findDeviceUserdataByID**
> Userdata findDeviceUserdataByID(id)

Retrieve userdata

Retrieve device userdata

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    try {
      Userdata result = apiInstance.findDeviceUserdataByID(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findDeviceUserdataByID");
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
| **id** | **UUID**| Device UUID | |

### Return type

[**Userdata**](Userdata.md)

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
| **422** | unprocessable entity |  -  |

<a name="findIPAssignmentCustomdata"></a>
# **findIPAssignmentCustomdata**
> findIPAssignmentCustomdata(instanceId, id)

Retrieve the custom metadata of an IP Assignment

Provides the custom metadata stored for this IP Assignment in json format

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID
    UUID id = UUID.randomUUID(); // UUID | Ip Assignment UUID
    try {
      apiInstance.findIPAssignmentCustomdata(instanceId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findIPAssignmentCustomdata");
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
| **instanceId** | **UUID**| Instance UUID | |
| **id** | **UUID**| Ip Assignment UUID | |

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

<a name="findIPAssignments"></a>
# **findIPAssignments**
> IPAssignmentList findIPAssignments(id, include, exclude)

Retrieve all ip assignments

Returns all ip assignments for a device.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      IPAssignmentList result = apiInstance.findIPAssignments(id, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findIPAssignments");
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
| **id** | **UUID**| Device UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**IPAssignmentList**](IPAssignmentList.md)

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

<a name="findInstanceBandwidth"></a>
# **findInstanceBandwidth**
> findInstanceBandwidth(id, from, until)

Retrieve an instance bandwidth

Retrieve an instance bandwidth for a given period of time.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    String from = "from_example"; // String | Timestamp from range
    String until = "until_example"; // String | Timestamp to range
    try {
      apiInstance.findInstanceBandwidth(id, from, until);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findInstanceBandwidth");
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
| **id** | **UUID**| Device UUID | |
| **from** | **String**| Timestamp from range | |
| **until** | **String**| Timestamp to range | |

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
| **403** | forbidden |  -  |
| **404** | not found |  -  |

<a name="findOrganizationDevices"></a>
# **findOrganizationDevices**
> DeviceList findOrganizationDevices(id, categories, facility, hostname, reserved, tag, type, hasTerminationTime, include, exclude, page, perPage)

Retrieve all devices of an organization

Provides a collection of devices for a given organization.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Organization UUID
    List<String> categories = Arrays.asList(); // List<String> | Filter by plan category
    String facility = "facility_example"; // String | Filter by device facility
    String hostname = "hostname_example"; // String | Filter by partial hostname
    Boolean reserved = true; // Boolean | Filter only reserved instances. When set to true, only include reserved instances. When set to false, only include on-demand instances.
    String tag = "tag_example"; // String | Filter by device tag
    String type = "type_example"; // String | Filter by instance type (ondemand,spot,reserved)
    Boolean hasTerminationTime = true; // Boolean | Filter only instances marked for termination. When set to true, only include instances that have a termination time. When set to false, only include instances that do not have a termination time.
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    Integer page = 1; // Integer | Page to return
    Integer perPage = 10; // Integer | Items returned per page
    try {
      DeviceList result = apiInstance.findOrganizationDevices(id, categories, facility, hostname, reserved, tag, type, hasTerminationTime, include, exclude, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findOrganizationDevices");
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
| **categories** | [**List&lt;String&gt;**](String.md)| Filter by plan category | [optional] [enum: compute, storage] |
| **facility** | **String**| Filter by device facility | [optional] |
| **hostname** | **String**| Filter by partial hostname | [optional] |
| **reserved** | **Boolean**| Filter only reserved instances. When set to true, only include reserved instances. When set to false, only include on-demand instances. | [optional] |
| **tag** | **String**| Filter by device tag | [optional] |
| **type** | **String**| Filter by instance type (ondemand,spot,reserved) | [optional] |
| **hasTerminationTime** | **Boolean**| Filter only instances marked for termination. When set to true, only include instances that have a termination time. When set to false, only include instances that do not have a termination time. | [optional] |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |
| **page** | **Integer**| Page to return | [optional] [default to 1] |
| **perPage** | **Integer**| Items returned per page | [optional] [default to 10] |

### Return type

[**DeviceList**](DeviceList.md)

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

<a name="findProjectDevices"></a>
# **findProjectDevices**
> DeviceList findProjectDevices(id, categories, facility, hostname, reserved, tag, type, hasTerminationTime, include, exclude, page, perPage)

Retrieve all devices of a project

Provides a collection of devices for a given project.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    List<String> categories = Arrays.asList(); // List<String> | Filter by plan category
    String facility = "facility_example"; // String | Filter by device facility
    String hostname = "hostname_example"; // String | Filter by partial hostname
    Boolean reserved = true; // Boolean | Filter only reserved instances. When set to true, only include reserved instances. When set to false, only include on-demand instances.
    String tag = "tag_example"; // String | Filter by device tag
    String type = "type_example"; // String | Filter by instance type (ondemand,spot,reserved)
    Boolean hasTerminationTime = true; // Boolean | Filter only instances marked for termination. When set to true, only include instances that have a termination time. When set to false, only include instances that do not have a termination time.
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    Integer page = 1; // Integer | Page to return
    Integer perPage = 10; // Integer | Items returned per page
    try {
      DeviceList result = apiInstance.findProjectDevices(id, categories, facility, hostname, reserved, tag, type, hasTerminationTime, include, exclude, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findProjectDevices");
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
| **categories** | [**List&lt;String&gt;**](String.md)| Filter by plan category | [optional] [enum: compute, storage] |
| **facility** | **String**| Filter by device facility | [optional] |
| **hostname** | **String**| Filter by partial hostname | [optional] |
| **reserved** | **Boolean**| Filter only reserved instances. When set to true, only include reserved instances. When set to false, only include on-demand instances. | [optional] |
| **tag** | **String**| Filter by device tag | [optional] |
| **type** | **String**| Filter by instance type (ondemand,spot,reserved) | [optional] |
| **hasTerminationTime** | **Boolean**| Filter only instances marked for termination. When set to true, only include instances that have a termination time. When set to false, only include instances that do not have a termination time. | [optional] |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |
| **page** | **Integer**| Page to return | [optional] [default to 1] |
| **perPage** | **Integer**| Items returned per page | [optional] [default to 10] |

### Return type

[**DeviceList**](DeviceList.md)

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

<a name="findTraffic"></a>
# **findTraffic**
> findTraffic(id, direction, interval, bucket, timeframe)

Retrieve device traffic

Returns traffic for a specific device.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    String direction = "inbound"; // String | Traffic direction
    String interval = "minute"; // String | Traffic interval
    String bucket = "internal"; // String | Traffic bucket
    FindTrafficTimeframeParameter timeframe = new HashMap(); // FindTrafficTimeframeParameter | 
    try {
      apiInstance.findTraffic(id, direction, interval, bucket, timeframe);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#findTraffic");
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
| **id** | **UUID**| Device UUID | |
| **direction** | **String**| Traffic direction | [enum: inbound, outbound] |
| **interval** | **String**| Traffic interval | [optional] [enum: minute, hour, day, week, month, year, hour_of_day, day_of_week, day_of_month, month_of_year] |
| **bucket** | **String**| Traffic bucket | [optional] [enum: internal, external] |
| **timeframe** | [**FindTrafficTimeframeParameter**](.md)|  | [optional] |

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

<a name="getBgpNeighborData"></a>
# **getBgpNeighborData**
> BgpSessionNeighbors getBgpNeighborData(id)

Retrieve BGP neighbor data for this device

Provides a summary of the BGP neighbor data associated to the BGP sessions for this device.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    try {
      BgpSessionNeighbors result = apiInstance.getBgpNeighborData(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#getBgpNeighborData");
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
| **id** | **UUID**| Device UUID | |

### Return type

[**BgpSessionNeighbors**](BgpSessionNeighbors.md)

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

<a name="performAction"></a>
# **performAction**
> performAction(id, deviceActionInput)

Perform an action

Performs an action for the given device.  Possible actions include: power_on, power_off, reboot, reinstall, and rescue (reboot the device into rescue OS.)

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    DeviceActionInput deviceActionInput = new DeviceActionInput(); // DeviceActionInput | Action to perform
    try {
      apiInstance.performAction(id, deviceActionInput);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#performAction");
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
| **id** | **UUID**| Device UUID | |
| **deviceActionInput** | [**DeviceActionInput**](DeviceActionInput.md)| Action to perform | |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | accepted |  -  |
| **401** | unauthorized |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

<a name="updateDevice"></a>
# **updateDevice**
> Device updateDevice(id, deviceUpdateInput)

Update the device

Updates the device.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Device UUID
    DeviceUpdateInput deviceUpdateInput = new DeviceUpdateInput(); // DeviceUpdateInput | Facility to update
    try {
      Device result = apiInstance.updateDevice(id, deviceUpdateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#updateDevice");
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
| **id** | **UUID**| Device UUID | |
| **deviceUpdateInput** | [**DeviceUpdateInput**](DeviceUpdateInput.md)| Facility to update | |

### Return type

[**Device**](Device.md)

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
| **403** | forbidden |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

