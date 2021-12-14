# DevicesApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBgpSession**](DevicesApi.md#createBgpSession) | **POST** /devices/{id}/bgp/sessions | Create a BGP session
[**createDevice**](DevicesApi.md#createDevice) | **POST** /projects/{id}/devices | Create a device
[**createDeviceBatch**](DevicesApi.md#createDeviceBatch) | **POST** /projects/{id}/devices/batch | Create a devices batch
[**createIPAssignment**](DevicesApi.md#createIPAssignment) | **POST** /devices/{id}/ips | Create an ip assignment
[**deleteDevice**](DevicesApi.md#deleteDevice) | **DELETE** /devices/{id} | Delete the device
[**findBgpSessions**](DevicesApi.md#findBgpSessions) | **GET** /devices/{id}/bgp/sessions | Retrieve all BGP sessions
[**findDeviceById**](DevicesApi.md#findDeviceById) | **GET** /devices/{id} | Retrieve a device
[**findDeviceCustomdata**](DevicesApi.md#findDeviceCustomdata) | **GET** /devices/{id}/customdata | Retrieve the custom metadata of an instance
[**findDeviceEvents**](DevicesApi.md#findDeviceEvents) | **GET** /devices/{id}/events | Retrieve device&#39;s events
[**findDeviceUsages**](DevicesApi.md#findDeviceUsages) | **GET** /devices/{id}/usages | Retrieve all usages for device
[**findIPAssignmentCustomdata**](DevicesApi.md#findIPAssignmentCustomdata) | **GET** /devices/{instance_id}/ips/{id}/customdata | Retrieve the custom metadata of an IP Assignment
[**findIPAssignments**](DevicesApi.md#findIPAssignments) | **GET** /devices/{id}/ips | Retrieve all ip assignments
[**findInstanceBandwidth**](DevicesApi.md#findInstanceBandwidth) | **GET** /devices/{id}/bandwidth | Retrieve an instance bandwidth
[**findOrganizationDevices**](DevicesApi.md#findOrganizationDevices) | **GET** /organizations/{id}/devices | Retrieve all devices of an organization
[**findProjectDevices**](DevicesApi.md#findProjectDevices) | **GET** /projects/{id}/devices | Retrieve all devices of a project
[**findProjectUsage**](DevicesApi.md#findProjectUsage) | **GET** /projects/{id}/usages | Retrieve all usages for project
[**findTraffic**](DevicesApi.md#findTraffic) | **GET** /devices/{id}/traffic | Retrieve device traffic
[**getBgpNeighborData**](DevicesApi.md#getBgpNeighborData) | **GET** /devices/{id}/bgp/neighbors | Retrieve BGP neighbor data for this device
[**performAction**](DevicesApi.md#performAction) | **POST** /devices/{id}/actions | Perform an action
[**updateDevice**](DevicesApi.md#updateDevice) | **PUT** /devices/{id} | Update the device


<a name="createBgpSession"></a>
# **createBgpSession**
> BgpSession createBgpSession(id, bgpSession)

Create a BGP session

Creates a BGP session.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
BGPSessionInput bgpSession = new BGPSessionInput(); // BGPSessionInput | BGP session to create
try {
    BgpSession result = apiInstance.createBgpSession(id, bgpSession);
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
 **bgpSession** | [**BGPSessionInput**](BGPSessionInput.md)| BGP session to create |

### Return type

[**BgpSession**](BgpSession.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDevice"></a>
# **createDevice**
> Device createDevice(id, device)

Create a device

Creates a new device and provisions it in the specified location.        Device type-specific options are accepted.  For example, &#x60;baremetal&#x60; devices accept &#x60;operating_system&#x60;, &#x60;hostname&#x60;, and &#x60;plan&#x60;. These parameters may not be accepted for other device types. The default device type is &#x60;baremetal&#x60;.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Project UUID
DeviceCreateInput device = new DeviceCreateInput(); // DeviceCreateInput | Device to create
try {
    Device result = apiInstance.createDevice(id, device);
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
 **device** | [**DeviceCreateInput**](DeviceCreateInput.md)| Device to create |

### Return type

[**Device**](Device.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDeviceBatch"></a>
# **createDeviceBatch**
> BatchesList createDeviceBatch(id, batch)

Create a devices batch

Creates new devices in batch and provisions them in our datacenter.  Type-specific options (such as operating_system for baremetal devices) should be included in the main data structure alongside hostname and plan.  The features attribute allows you to optionally specify what features your server should have.  For example, if you require a server with a TPM chip, you may specify &#x60;{ \&quot;features\&quot;: { \&quot;tpm\&quot;: \&quot;required\&quot; } }&#x60; (or &#x60;{ \&quot;features\&quot;: [\&quot;tpm\&quot;] }&#x60; in shorthand).  The request will fail if there are no available servers matching your criteria. Alternatively, if you do not require a certain feature, but would prefer to be assigned a server with that feature if there are any available, you may specify that feature with a preferred value (see the example request below).  The request will not fail if we have no servers with that feature in our inventory.  The facilities attribute specifies in what datacenter you wish to create the device.  You can either specify a single facility &#x60;{ \&quot;facility\&quot;: \&quot;f1\&quot; }&#x60; , or you can instruct to create the device in the best available datacenter &#x60;{ \&quot;facility\&quot;: \&quot;any\&quot; }&#x60;. Additionally it is possible to set a prioritized location selection.  For example &#x60;{ \&quot;facility\&quot;: [\&quot;f3\&quot;, \&quot;f2\&quot;, \&quot;any\&quot;] }&#x60; will try to assign to the facility f3, if there are no available f2, and so on. If \&quot;any\&quot; is not specified for \&quot;facility\&quot;, the request will fail unless it can assign in the selected locations.  With &#x60;{ \&quot;facility\&quot;: \&quot;any\&quot; }&#x60; you have the option to diversify to indicate how many facilities you are willing to be spread across. For this purpose use parameter: &#x60;facility_diversity_level &#x3D; N&#x60;.  For example:  &#x60;{ \&quot;facilities\&quot;: [\&quot;sjc1\&quot;, \&quot;ewr1\&quot;, \&quot;any\&quot;] ,  \&quot;facility_diversity_level\&quot; &#x3D; 1, \&quot;quantity\&quot; &#x3D; 10 }&#x60; will assign 10 devices into the same facility, trying first in \&quot;sjc1\&quot;, and if there aren’t available, it will try in  \&quot;ewr1\&quot;, otherwise any other.  The &#x60;ip_addresses&#x60; attribute will allow you to specify the addresses you want created with your device.  To maintain backwards compatibility, If the attribute is not sent in the request, it will be treated as if &#x60;{ \&quot;ip_addresses\&quot;: [{ \&quot;address_family\&quot;: 4, \&quot;public\&quot;: true }, { \&quot;address_family\&quot;: 4, \&quot;public\&quot;: false }, { \&quot;address_family\&quot;: 6, \&quot;public\&quot;: true }] }&#x60; was sent.  The private IPv4 address is required and always need to be sent in the array. Not all operating systems support no public IPv4 address, so in those cases you will receive an error message.  For example, to only configure your server with a private IPv4 address, you can send &#x60;{ \&quot;ip_addresses\&quot;: [{ \&quot;address_family\&quot;: 4, \&quot;public\&quot;: false }] }&#x60;.  Note: when specifying a subnet size larger than a /30, you will need to supply the UUID(s) of existing ip_reservations in your project to assign IPs from.  For example, &#x60;{ \&quot;ip_addresses\&quot;: [..., {\&quot;address_family\&quot;: 4, \&quot;public\&quot;: true, \&quot;ip_reservations\&quot;: [\&quot;uuid1\&quot;, \&quot;uuid2\&quot;]}] }&#x60;  To access a server without public IPs, you can use our Out-of-Band console access (SOS) or use another server with public IPs as a proxy.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Project UUID
InstancesBatchCreateInput batch = new InstancesBatchCreateInput(); // InstancesBatchCreateInput | Batches to create
try {
    BatchesList result = apiInstance.createDeviceBatch(id, batch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#createDeviceBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **batch** | [**InstancesBatchCreateInput**](InstancesBatchCreateInput.md)| Batches to create |

### Return type

[**BatchesList**](BatchesList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
IPAssignmentInput ipAssignment = new IPAssignmentInput(); // IPAssignmentInput | IPAssignment to create
try {
    IPAssignment result = apiInstance.createIPAssignment(id, ipAssignment);
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
 **ipAssignment** | [**IPAssignmentInput**](IPAssignmentInput.md)| IPAssignment to create |

### Return type

[**IPAssignment**](IPAssignment.md)

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
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBgpSessions"></a>
# **findBgpSessions**
> BgpSessionList findBgpSessions(id)

Retrieve all BGP sessions

Provides a listing of available BGP sessions for the device.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
try {
    BgpSessionList result = apiInstance.findBgpSessions(id);
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

[**BgpSessionList**](BgpSessionList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findDeviceById"></a>
# **findDeviceById**
> Device findDeviceById(id, include, exclude)

Retrieve a device

Type-specific options (such as facility for baremetal devices) will be included as part of the main data structure.                          State value can be one of: active inactive queued or provisioning

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

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
    Device result = apiInstance.findDeviceById(id, include, exclude);
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

[**Device**](Device.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findDeviceCustomdata"></a>
# **findDeviceCustomdata**
> findDeviceCustomdata(id)

Retrieve the custom metadata of an instance

Provides the custom metadata stored for this instance in json format

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findDeviceEvents"></a>
# **findDeviceEvents**
> EventList findDeviceEvents(id, include, exclude, page, perPage)

Retrieve device&#39;s events

Returns a list of events pertaining to a specific device

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

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
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    EventList result = apiInstance.findDeviceEvents(id, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findDeviceEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**EventList**](EventList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findDeviceUsages"></a>
# **findDeviceUsages**
> DeviceUsageList findDeviceUsages(id, createdAfter, createdBefore)

Retrieve all usages for device

Returns all usages for a device.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
String createdAfter = "createdAfter_example"; // String | Filter usages created after this date
String createdBefore = "createdBefore_example"; // String | Filter usages created before this date
try {
    DeviceUsageList result = apiInstance.findDeviceUsages(id, createdAfter, createdBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findDeviceUsages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **createdAfter** | **String**| Filter usages created after this date | [optional]
 **createdBefore** | **String**| Filter usages created before this date | [optional]

### Return type

[**DeviceUsageList**](DeviceUsageList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findIPAssignmentCustomdata"></a>
# **findIPAssignmentCustomdata**
> findIPAssignmentCustomdata(instanceId, id)

Retrieve the custom metadata of an IP Assignment

Provides the custom metadata stored for this IP Assignment in json format

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

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
//import net.packet.client.api.DevicesApi;

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
    IPAssignmentList result = apiInstance.findIPAssignments(id, include, exclude);
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

[**IPAssignmentList**](IPAssignmentList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findInstanceBandwidth"></a>
# **findInstanceBandwidth**
> findInstanceBandwidth(id, from, until)

Retrieve an instance bandwidth

Retrieve an instance bandwidth for a given period of time.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findOrganizationDevices"></a>
# **findOrganizationDevices**
> DeviceList findOrganizationDevices(id, include, exclude, page, perPage)

Retrieve all devices of an organization

Provides a collection of devices for a given organization.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Organization UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    DeviceList result = apiInstance.findOrganizationDevices(id, include, exclude, page, perPage);
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
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**DeviceList**](DeviceList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProjectDevices"></a>
# **findProjectDevices**
> DeviceList findProjectDevices(id, include, exclude, page, perPage)

Retrieve all devices of a project

Provides a collection of devices for a given project.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Project UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    DeviceList result = apiInstance.findProjectDevices(id, include, exclude, page, perPage);
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
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**DeviceList**](DeviceList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProjectUsage"></a>
# **findProjectUsage**
> ProjectUsageList findProjectUsage(id, createdAfter, createdBefore)

Retrieve all usages for project

Returns all usages for a project.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Project UUID
String createdAfter = "createdAfter_example"; // String | Filter usages created after this date
String createdBefore = "createdBefore_example"; // String | Filter usages created before this date
try {
    ProjectUsageList result = apiInstance.findProjectUsage(id, createdAfter, createdBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#findProjectUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **createdAfter** | **String**| Filter usages created after this date | [optional]
 **createdBefore** | **String**| Filter usages created before this date | [optional]

### Return type

[**ProjectUsageList**](ProjectUsageList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findTraffic"></a>
# **findTraffic**
> findTraffic(id, direction, timeframe, interval, bucket)

Retrieve device traffic

Returns traffic for a specific device.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
String direction = "direction_example"; // String | Traffic direction
Timeframe timeframe = new Timeframe(); // Timeframe | Traffic timeframe
String interval = "interval_example"; // String | Traffic interval
String bucket = "bucket_example"; // String | Traffic bucket
try {
    apiInstance.findTraffic(id, direction, timeframe, interval, bucket);
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
 **timeframe** | [**Timeframe**](Timeframe.md)| Traffic timeframe |
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
> BgpSessionNeighbors getBgpNeighborData(id)

Retrieve BGP neighbor data for this device

Provides a summary of the BGP neighbor data associated to the BGP sessions for this device.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
try {
    BgpSessionNeighbors result = apiInstance.getBgpNeighborData(id);
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

[**BgpSessionNeighbors**](BgpSessionNeighbors.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="performAction"></a>
# **performAction**
> performAction(id, type)

Perform an action

Performs an action for the given device.  Possible actions include: power_on, power_off, reboot, reinstall, and rescue (reboot the device into rescue OS.)

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDevice"></a>
# **updateDevice**
> Device updateDevice(id, device)

Update the device

Updates the device.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

DevicesApi apiInstance = new DevicesApi();
UUID id = new UUID(); // UUID | Device UUID
DeviceUpdateInput device = new DeviceUpdateInput(); // DeviceUpdateInput | Facility to update
try {
    Device result = apiInstance.updateDevice(id, device);
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
 **device** | [**DeviceUpdateInput**](DeviceUpdateInput.md)| Facility to update |

### Return type

[**Device**](Device.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

