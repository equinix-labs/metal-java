# DevicesApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBgpSession**](DevicesApi.md#createBgpSession) | **POST** /devices/{id}/bgp/sessions | Create a BGP session
[**createDevice**](DevicesApi.md#createDevice) | **POST** /projects/{id}/devices | Create a device
[**createIPAssignment**](DevicesApi.md#createIPAssignment) | **POST** /devices/{id}/ips | Create an ip assignment
[**deleteDevice**](DevicesApi.md#deleteDevice) | **DELETE** /devices/{id} | Delete the device
[**findBgpSessions**](DevicesApi.md#findBgpSessions) | **GET** /devices/{id}/bgp/sessions | Retrieve all BGP sessions
[**findDeviceById**](DevicesApi.md#findDeviceById) | **GET** /devices/{id} | Retrieve a device
[**findDeviceCustomdata**](DevicesApi.md#findDeviceCustomdata) | **GET** /devices/{id}/customdata | Retrieve the custom metadata of an instance
[**findIPAssignmentCustomdata**](DevicesApi.md#findIPAssignmentCustomdata) | **GET** /devices/{instance_id}/ips/{id}/customdata | Retrieve the custom metadata of an IP Assignment
[**findIPAssignments**](DevicesApi.md#findIPAssignments) | **GET** /devices/{id}/ips | Retrieve all ip assignments
[**findInstanceBandwidth**](DevicesApi.md#findInstanceBandwidth) | **GET** /devices/{id}/bandwidth | Retrieve an instance bandwidth
[**findOrganizationDevices**](DevicesApi.md#findOrganizationDevices) | **GET** /organizations/{id}/devices | Retrieve all devices of an organization
[**findProjectDevices**](DevicesApi.md#findProjectDevices) | **GET** /projects/{id}/devices | Retrieve all devices of a project
[**findTraffic**](DevicesApi.md#findTraffic) | **GET** /devices/{id}/traffic | Retrieve device traffic
[**getBgpNeighborData**](DevicesApi.md#getBgpNeighborData) | **GET** /devices/{id}/bgp/neighbors | Retrieve BGP neighbor data for this device
[**performAction**](DevicesApi.md#performAction) | **POST** /devices/{id}/actions | Perform an action
[**updateDevice**](DevicesApi.md#updateDevice) | **PUT** /devices/{id} | Update the device


<a name="createBgpSession"></a>
# **createBgpSession**
> InlineResponse2001 createBgpSession(id, body)

Create a BGP session

Creates a BGP session.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
Body4 body = new Body4(); // Body4 | BGP session to create
try {
    InlineResponse2001 result = apiInstance.createBgpSession(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#createBgpSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **body** | [**Body4**](Body4.md)| BGP session to create |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDevice"></a>
# **createDevice**
> InlineResponse2009 createDevice(id, body)

Create a device

Creates a new device and provisions it in the specified location.  Device type-specific options are accepted.  For example, &#x60;baremetal&#x60; devices accept &#x60;operating_system&#x60;, &#x60;hostname&#x60;, and &#x60;plan&#x60;. These parameters may not be accepted for other device types. The default device type is &#x60;baremetal&#x60;.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Project UUID
object body = new object(); // object | Device to create
try {
    InlineResponse2009 result = apiInstance.createDevice(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#createDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **body** | [**object**](.md)| Device to create |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIPAssignment"></a>
# **createIPAssignment**
> InlineResponse2009IpAddresses createIPAssignment(id, body)

Create an ip assignment

Creates an ip assignment for a device.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
Body5 body = new Body5(); // Body5 | IPAssignment to create
try {
    InlineResponse2009IpAddresses result = apiInstance.createIPAssignment(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#createIPAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **body** | [**Body5**](Body5.md)| IPAssignment to create |

### Return type

[**InlineResponse2009IpAddresses**](InlineResponse2009IpAddresses.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDevice"></a>
# **deleteDevice**
> deleteDevice(id, forceDelete)

Delete the device

Deletes a device and deprovisions it in our datacenter.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
Boolean forceDelete = true; // Boolean | Force the deletion of the device, by detaching any storage volume still active.
try {
    apiInstance.deleteDevice(id, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#deleteDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **forceDelete** | **Boolean**| Force the deletion of the device, by detaching any storage volume still active. | [optional]

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findBgpSessions"></a>
# **findBgpSessions**
> InlineResponse20011 findBgpSessions(id)

Retrieve all BGP sessions

Provides a listing of available BGP sessions for the device.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
try {
    InlineResponse20011 result = apiInstance.findBgpSessions(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findBgpSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findDeviceById"></a>
# **findDeviceById**
> InlineResponse2009 findDeviceById(id, include, exclude)

Retrieve a device

Type-specific options (such as facility for baremetal devices) will be included as part of the main data structure.                          State value can be one of: active inactive queued or provisioning

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse2009 result = apiInstance.findDeviceById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findDeviceById");
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

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findDeviceCustomdata"></a>
# **findDeviceCustomdata**
> findDeviceCustomdata(id)

Retrieve the custom metadata of an instance

Provides the custom metadata stored for this instance in json format

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Instance UUID
try {
    apiInstance.findDeviceCustomdata(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findDeviceCustomdata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Instance UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findIPAssignmentCustomdata"></a>
# **findIPAssignmentCustomdata**
> findIPAssignmentCustomdata(instanceId, id)

Retrieve the custom metadata of an IP Assignment

Provides the custom metadata stored for this IP Assignment in json format

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID instanceId = new UUID(); // UUID | Instance UUID
UUID id = new UUID(); // UUID | Ip Assignment UUID
try {
    apiInstance.findIPAssignmentCustomdata(instanceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findIPAssignmentCustomdata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceId** | [**UUID**](.md)| Instance UUID |
 **id** | [**UUID**](.md)| Ip Assignment UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findIPAssignments"></a>
# **findIPAssignments**
> InlineResponse20013 findIPAssignments(id, include, exclude)

Retrieve all ip assignments

Returns all ip assignments for a device.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20013 result = apiInstance.findIPAssignments(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findIPAssignments");
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

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findInstanceBandwidth"></a>
# **findInstanceBandwidth**
> findInstanceBandwidth(id, from, until)

Retrieve an instance bandwidth

Retrieve an instance bandwidth for a given period of time.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
String from = "from_example"; // String | Timestamp from range
String until = "until_example"; // String | Timestamp to range
try {
    apiInstance.findInstanceBandwidth(id, from, until);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findInstanceBandwidth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **from** | **String**| Timestamp from range |
 **until** | **String**| Timestamp to range |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrganizationDevices"></a>
# **findOrganizationDevices**
> InlineResponse20027 findOrganizationDevices(id, facility, hostname, reserved, tag, type, include, exclude, page, perPage)

Retrieve all devices of an organization

Provides a collection of devices for a given organization.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Organization UUID
String facility = "facility_example"; // String | Filter by device facility
String hostname = "hostname_example"; // String | Filter by partial hostname
Boolean reserved = true; // Boolean | Filter only reserved instances
String tag = "tag_example"; // String | Filter by device tag
String type = "type_example"; // String | Filter by instance type (ondemand,spot,reserved)
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    InlineResponse20027 result = apiInstance.findOrganizationDevices(id, facility, hostname, reserved, tag, type, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findOrganizationDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **facility** | **String**| Filter by device facility | [optional]
 **hostname** | **String**| Filter by partial hostname | [optional]
 **reserved** | **Boolean**| Filter only reserved instances | [optional]
 **tag** | **String**| Filter by device tag | [optional]
 **type** | **String**| Filter by instance type (ondemand,spot,reserved) | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findProjectDevices"></a>
# **findProjectDevices**
> InlineResponse20027 findProjectDevices(id, facility, hostname, reserved, tag, type, include, exclude, page, perPage)

Retrieve all devices of a project

Provides a collection of devices for a given project.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Project UUID
String facility = "facility_example"; // String | Filter by device facility
String hostname = "hostname_example"; // String | Filter by partial hostname
Boolean reserved = true; // Boolean | Filter only reserved instances
String tag = "tag_example"; // String | Filter by device tag
String type = "type_example"; // String | Filter by instance type (ondemand,spot,reserved)
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    InlineResponse20027 result = apiInstance.findProjectDevices(id, facility, hostname, reserved, tag, type, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findProjectDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **facility** | **String**| Filter by device facility | [optional]
 **hostname** | **String**| Filter by partial hostname | [optional]
 **reserved** | **Boolean**| Filter only reserved instances | [optional]
 **tag** | **String**| Filter by device tag | [optional]
 **type** | **String**| Filter by instance type (ondemand,spot,reserved) | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTraffic"></a>
# **findTraffic**
> findTraffic(id, direction, body, interval, bucket)

Retrieve device traffic

Returns traffic for a specific device.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
String direction = "direction_example"; // String | Traffic direction
Body6 body = new Body6(); // Body6 | Traffic timeframe
String interval = "interval_example"; // String | Traffic interval
String bucket = "bucket_example"; // String | Traffic bucket
try {
    apiInstance.findTraffic(id, direction, body, interval, bucket);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findTraffic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **direction** | **String**| Traffic direction | [enum: inbound, outbound]
 **body** | [**Body6**](Body6.md)| Traffic timeframe |
 **interval** | **String**| Traffic interval | [optional] [enum: minute, hour, day, week, month, year, hour_of_day, day_of_week, day_of_month, month_of_year]
 **bucket** | **String**| Traffic bucket | [optional] [enum: internal, external]

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBgpNeighborData"></a>
# **getBgpNeighborData**
> InlineResponse20010 getBgpNeighborData(id)

Retrieve BGP neighbor data for this device

Provides a summary of the BGP neighbor data associated to the BGP sessions for this device.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
try {
    InlineResponse20010 result = apiInstance.getBgpNeighborData(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#getBgpNeighborData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="performAction"></a>
# **performAction**
> performAction(id, type)

Perform an action

Performs an action for the given device.  Possible actions include: power_on, power_off, reboot, reinstall, and rescue (reboot the device into rescue OS.)

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
String type = "type_example"; // String | Action to perform
try {
    apiInstance.performAction(id, type);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#performAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **type** | **String**| Action to perform | [enum: power_on, power_off, reboot, rescue, reinstall]

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDevice"></a>
# **updateDevice**
> InlineResponse2009 updateDevice(id, body)

Update the device

Updates the device.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
Body3 body = new Body3(); // Body3 | Facility to update
try {
    InlineResponse2009 result = apiInstance.updateDevice(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#updateDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **body** | [**Body3**](Body3.md)| Facility to update |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

