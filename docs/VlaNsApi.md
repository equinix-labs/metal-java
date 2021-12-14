# VlaNsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignNativeVlan**](VlaNsApi.md#assignNativeVlan) | **POST** /ports/{id}/native-vlan | Assign a native VLAN
[**assignPort**](VlaNsApi.md#assignPort) | **POST** /ports/{id}/assign | Assign a port to virtual network
[**createPortVlanAssignmentBatch**](VlaNsApi.md#createPortVlanAssignmentBatch) | **POST** /ports/{id}/vlan-assignments/batches | Create a new Port-VLAN Assignment management batch
[**createVirtualNetwork**](VlaNsApi.md#createVirtualNetwork) | **POST** /projects/{id}/virtual-networks | Create a virtual network
[**deleteNativeVlan**](VlaNsApi.md#deleteNativeVlan) | **DELETE** /ports/{id}/native-vlan | Remove native VLAN
[**deleteVirtualNetwork**](VlaNsApi.md#deleteVirtualNetwork) | **DELETE** /virtual-networks/{id} | Delete a virtual network
[**findPortVlanAssignmentBatchByPortIdAndBatchId**](VlaNsApi.md#findPortVlanAssignmentBatchByPortIdAndBatchId) | **GET** /ports/{id}/vlan-assignments/batches/{batch_id} | Retrieve a VLAN Assignment Batch&#39;s details
[**findPortVlanAssignmentBatches**](VlaNsApi.md#findPortVlanAssignmentBatches) | **GET** /ports/{id}/vlan-assignments/batches | List the VLAN Assignment Batches for a port
[**findPortVlanAssignmentByPortIdAndAssignmentId**](VlaNsApi.md#findPortVlanAssignmentByPortIdAndAssignmentId) | **GET** /ports/{id}/vlan-assignments/{assignment_id} | Show a particular Port VLAN assignment&#39;s details
[**findPortVlanAssignments**](VlaNsApi.md#findPortVlanAssignments) | **GET** /ports/{id}/vlan-assignments | List Current VLAN assignments for a port
[**findVirtualNetworks**](VlaNsApi.md#findVirtualNetworks) | **GET** /projects/{id}/virtual-networks | Retrieve all virtual networks
[**getVirtualNetwork**](VlaNsApi.md#getVirtualNetwork) | **GET** /virtual-networks/{id} | Get a virtual network
[**unassignPort**](VlaNsApi.md#unassignPort) | **POST** /ports/{id}/unassign | Unassign a port


<a name="assignNativeVlan"></a>
# **assignNativeVlan**
> Port assignNativeVlan(id, vnid)

Assign a native VLAN

Sets a virtual network on this port as a \&quot;native VLAN\&quot;. The VLAN must have already been assigned using the using the \&quot;Assign a port to a virtual network\&quot; operation.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Port UUID
String vnid = "vnid_example"; // String | Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: '1001').
try {
    Port result = apiInstance.assignNativeVlan(id, vnid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#assignNativeVlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **vnid** | **String**| Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: &#39;1001&#39;). |

### Return type

[**Port**](Port.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assignPort"></a>
# **assignPort**
> Port assignPort(id, vnid)

Assign a port to virtual network

Assign a port for a hardware to virtual network.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Port UUID
PortAssignInput vnid = new PortAssignInput(); // PortAssignInput | Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: '1001').
try {
    Port result = apiInstance.assignPort(id, vnid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#assignPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **vnid** | [**PortAssignInput**](PortAssignInput.md)| Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: &#39;1001&#39;). |

### Return type

[**Port**](Port.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPortVlanAssignmentBatch"></a>
# **createPortVlanAssignmentBatch**
> PortVlanAssignmentBatch createPortVlanAssignmentBatch(id, vlanAssignments)

Create a new Port-VLAN Assignment management batch

Create a new asynchronous batch request which handles adding and/or removing the VLANs to which the port is assigned.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Port UUID
PortVlanAssignmentBatchCreateInput vlanAssignments = new PortVlanAssignmentBatchCreateInput(); // PortVlanAssignmentBatchCreateInput | VLAN Assignment batch details
try {
    PortVlanAssignmentBatch result = apiInstance.createPortVlanAssignmentBatch(id, vlanAssignments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#createPortVlanAssignmentBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **vlanAssignments** | [**PortVlanAssignmentBatchCreateInput**](PortVlanAssignmentBatchCreateInput.md)| VLAN Assignment batch details |

### Return type

[**PortVlanAssignmentBatch**](PortVlanAssignmentBatch.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createVirtualNetwork"></a>
# **createVirtualNetwork**
> VirtualNetwork createVirtualNetwork(id, virtualNetwork)

Create a virtual network

Creates an virtual network.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Project UUID
VirtualNetworkCreateInput virtualNetwork = new VirtualNetworkCreateInput(); // VirtualNetworkCreateInput | Virtual Network to create
try {
    VirtualNetwork result = apiInstance.createVirtualNetwork(id, virtualNetwork);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#createVirtualNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **virtualNetwork** | [**VirtualNetworkCreateInput**](VirtualNetworkCreateInput.md)| Virtual Network to create |

### Return type

[**VirtualNetwork**](VirtualNetwork.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNativeVlan"></a>
# **deleteNativeVlan**
> Port deleteNativeVlan(id)

Remove native VLAN

Removes the native VLAN from this port

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Port UUID
try {
    Port result = apiInstance.deleteNativeVlan(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#deleteNativeVlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |

### Return type

[**Port**](Port.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVirtualNetwork"></a>
# **deleteVirtualNetwork**
> VirtualNetwork deleteVirtualNetwork(id)

Delete a virtual network

Deletes a virtual network.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Virtual Network UUID
try {
    VirtualNetwork result = apiInstance.deleteVirtualNetwork(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#deleteVirtualNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Virtual Network UUID |

### Return type

[**VirtualNetwork**](VirtualNetwork.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPortVlanAssignmentBatchByPortIdAndBatchId"></a>
# **findPortVlanAssignmentBatchByPortIdAndBatchId**
> PortVlanAssignmentBatch findPortVlanAssignmentBatchByPortIdAndBatchId(id, batchId)

Retrieve a VLAN Assignment Batch&#39;s details

Returns the details of an existing Port-VLAN Assignment batch, including the list of VLANs to assign or unassign, and the current state of the batch.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Port UUID
UUID batchId = new UUID(); // UUID | Batch ID
try {
    PortVlanAssignmentBatch result = apiInstance.findPortVlanAssignmentBatchByPortIdAndBatchId(id, batchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#findPortVlanAssignmentBatchByPortIdAndBatchId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **batchId** | [**UUID**](.md)| Batch ID |

### Return type

[**PortVlanAssignmentBatch**](PortVlanAssignmentBatch.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPortVlanAssignmentBatches"></a>
# **findPortVlanAssignmentBatches**
> PortVlanAssignmentBatchList findPortVlanAssignmentBatches(id)

List the VLAN Assignment Batches for a port

Show all the VLAN assignment batches that have been created for managing this port&#39;s VLAN assignments

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Port UUID
try {
    PortVlanAssignmentBatchList result = apiInstance.findPortVlanAssignmentBatches(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#findPortVlanAssignmentBatches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |

### Return type

[**PortVlanAssignmentBatchList**](PortVlanAssignmentBatchList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPortVlanAssignmentByPortIdAndAssignmentId"></a>
# **findPortVlanAssignmentByPortIdAndAssignmentId**
> PortVlanAssignment findPortVlanAssignmentByPortIdAndAssignmentId(id, assignmentId, include, exclude)

Show a particular Port VLAN assignment&#39;s details

Show the details of a specific Port-VLAN assignment, including the current state and if the VLAN is set as native.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Port UUID
UUID assignmentId = new UUID(); // UUID | Assignment ID
List<String> include = Arrays.asList("[\"port\",\"virtual_network\"]"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    PortVlanAssignment result = apiInstance.findPortVlanAssignmentByPortIdAndAssignmentId(id, assignmentId, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#findPortVlanAssignmentByPortIdAndAssignmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **assignmentId** | [**UUID**](.md)| Assignment ID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] [default to [&quot;port&quot;,&quot;virtual_network&quot;]]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**PortVlanAssignment**](PortVlanAssignment.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPortVlanAssignments"></a>
# **findPortVlanAssignments**
> PortVlanAssignmentList findPortVlanAssignments(id, include, exclude)

List Current VLAN assignments for a port

Show the port&#39;s current VLAN assignments, including if this VLAN is set as native, and the current state of the assignment (ex. &#39;assigned&#39; or &#39;unassigning&#39;)

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Port UUID
List<String> include = Arrays.asList("[\"port\",\"virtual_network\"]"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    PortVlanAssignmentList result = apiInstance.findPortVlanAssignments(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#findPortVlanAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] [default to [&quot;port&quot;,&quot;virtual_network&quot;]]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**PortVlanAssignmentList**](PortVlanAssignmentList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findVirtualNetworks"></a>
# **findVirtualNetworks**
> VirtualNetworkList findVirtualNetworks(id, include, exclude, facility, metro)

Retrieve all virtual networks

Provides a list of virtual networks for a single project.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Project UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
String facility = "facility_example"; // String | Filter by Facility ID (uuid) or Facility Code
String metro = "metro_example"; // String | Filter by Metro ID (uuid) or Metro Code
try {
    VirtualNetworkList result = apiInstance.findVirtualNetworks(id, include, exclude, facility, metro);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#findVirtualNetworks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **facility** | **String**| Filter by Facility ID (uuid) or Facility Code | [optional]
 **metro** | **String**| Filter by Metro ID (uuid) or Metro Code | [optional]

### Return type

[**VirtualNetworkList**](VirtualNetworkList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVirtualNetwork"></a>
# **getVirtualNetwork**
> VirtualNetwork getVirtualNetwork(id)

Get a virtual network

Get a virtual network.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Virtual Network UUID
try {
    VirtualNetwork result = apiInstance.getVirtualNetwork(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#getVirtualNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Virtual Network UUID |

### Return type

[**VirtualNetwork**](VirtualNetwork.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unassignPort"></a>
# **unassignPort**
> Port unassignPort(id, vnid)

Unassign a port

Unassign a port for a hardware.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.VlaNsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

VlaNsApi apiInstance = new VlaNsApi();
UUID id = new UUID(); // UUID | Port UUID
PortAssignInput vnid = new PortAssignInput(); // PortAssignInput | Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: '1001').
try {
    Port result = apiInstance.unassignPort(id, vnid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VlaNsApi#unassignPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **vnid** | [**PortAssignInput**](PortAssignInput.md)| Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: &#39;1001&#39;). |

### Return type

[**Port**](Port.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

