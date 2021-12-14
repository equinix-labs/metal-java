# PortsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignNativeVlan**](PortsApi.md#assignNativeVlan) | **POST** /ports/{id}/native-vlan | Assign a native VLAN
[**assignPort**](PortsApi.md#assignPort) | **POST** /ports/{id}/assign | Assign a port to virtual network
[**bondPort**](PortsApi.md#bondPort) | **POST** /ports/{id}/bond | Enabling bonding
[**convertLayer2**](PortsApi.md#convertLayer2) | **POST** /ports/{id}/convert/layer-2 | Convert to Layer 2
[**convertLayer3**](PortsApi.md#convertLayer3) | **POST** /ports/{id}/convert/layer-3 | Convert to Layer 3
[**createPortVlanAssignmentBatch**](PortsApi.md#createPortVlanAssignmentBatch) | **POST** /ports/{id}/vlan-assignments/batches | Create a new Port-VLAN Assignment management batch
[**deleteNativeVlan**](PortsApi.md#deleteNativeVlan) | **DELETE** /ports/{id}/native-vlan | Remove native VLAN
[**disbondPort**](PortsApi.md#disbondPort) | **POST** /ports/{id}/disbond | Disabling bonding
[**findPortById**](PortsApi.md#findPortById) | **GET** /ports/{id} | Retrieve a port
[**findPortVlanAssignmentBatchByPortIdAndBatchId**](PortsApi.md#findPortVlanAssignmentBatchByPortIdAndBatchId) | **GET** /ports/{id}/vlan-assignments/batches/{batch_id} | Retrieve a VLAN Assignment Batch&#39;s details
[**findPortVlanAssignmentBatches**](PortsApi.md#findPortVlanAssignmentBatches) | **GET** /ports/{id}/vlan-assignments/batches | List the VLAN Assignment Batches for a port
[**findPortVlanAssignmentByPortIdAndAssignmentId**](PortsApi.md#findPortVlanAssignmentByPortIdAndAssignmentId) | **GET** /ports/{id}/vlan-assignments/{assignment_id} | Show a particular Port VLAN assignment&#39;s details
[**findPortVlanAssignments**](PortsApi.md#findPortVlanAssignments) | **GET** /ports/{id}/vlan-assignments | List Current VLAN assignments for a port
[**unassignPort**](PortsApi.md#unassignPort) | **POST** /ports/{id}/unassign | Unassign a port


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
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
String vnid = "vnid_example"; // String | Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: '1001').
try {
    Port result = apiInstance.assignNativeVlan(id, vnid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#assignNativeVlan");
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
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
PortAssignInput vnid = new PortAssignInput(); // PortAssignInput | Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: '1001').
try {
    Port result = apiInstance.assignPort(id, vnid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#assignPort");
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

<a name="bondPort"></a>
# **bondPort**
> Port bondPort(id, bulkEnable)

Enabling bonding

Enabling bonding for one or all ports

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
Boolean bulkEnable = true; // Boolean | enable both ports
try {
    Port result = apiInstance.bondPort(id, bulkEnable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#bondPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **bulkEnable** | **Boolean**| enable both ports | [optional]

### Return type

[**Port**](Port.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="convertLayer2"></a>
# **convertLayer2**
> Port convertLayer2(id, vnid)

Convert to Layer 2

Converts a bond port to Layer 2. IP assignments of the port will be removed.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
PortAssignInput vnid = new PortAssignInput(); // PortAssignInput | Virtual Network ID
try {
    Port result = apiInstance.convertLayer2(id, vnid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#convertLayer2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **vnid** | [**PortAssignInput**](PortAssignInput.md)| Virtual Network ID | [optional]

### Return type

[**Port**](Port.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="convertLayer3"></a>
# **convertLayer3**
> Port convertLayer3(id, requestIps)

Convert to Layer 3

Converts a bond port to Layer 3. VLANs must first be unassigned.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
PortConvertLayer3Input requestIps = new PortConvertLayer3Input(); // PortConvertLayer3Input | IPs to request
try {
    Port result = apiInstance.convertLayer3(id, requestIps);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#convertLayer3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **requestIps** | [**PortConvertLayer3Input**](PortConvertLayer3Input.md)| IPs to request | [optional]

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
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
PortVlanAssignmentBatchCreateInput vlanAssignments = new PortVlanAssignmentBatchCreateInput(); // PortVlanAssignmentBatchCreateInput | VLAN Assignment batch details
try {
    PortVlanAssignmentBatch result = apiInstance.createPortVlanAssignmentBatch(id, vlanAssignments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#createPortVlanAssignmentBatch");
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
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
try {
    Port result = apiInstance.deleteNativeVlan(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#deleteNativeVlan");
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

<a name="disbondPort"></a>
# **disbondPort**
> Port disbondPort(id, bulkDisable)

Disabling bonding

Disabling bonding for one or all ports

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
Boolean bulkDisable = true; // Boolean | disable both ports
try {
    Port result = apiInstance.disbondPort(id, bulkDisable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#disbondPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **bulkDisable** | **Boolean**| disable both ports | [optional]

### Return type

[**Port**](Port.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPortById"></a>
# **findPortById**
> Port findPortById(id, include, exclude)

Retrieve a port

Returns a port

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    Port result = apiInstance.findPortById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#findPortById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Port UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**Port**](Port.md)

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
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
UUID batchId = new UUID(); // UUID | Batch ID
try {
    PortVlanAssignmentBatch result = apiInstance.findPortVlanAssignmentBatchByPortIdAndBatchId(id, batchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#findPortVlanAssignmentBatchByPortIdAndBatchId");
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
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
try {
    PortVlanAssignmentBatchList result = apiInstance.findPortVlanAssignmentBatches(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#findPortVlanAssignmentBatches");
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
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
UUID assignmentId = new UUID(); // UUID | Assignment ID
List<String> include = Arrays.asList("[\"port\",\"virtual_network\"]"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    PortVlanAssignment result = apiInstance.findPortVlanAssignmentByPortIdAndAssignmentId(id, assignmentId, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#findPortVlanAssignmentByPortIdAndAssignmentId");
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
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
List<String> include = Arrays.asList("[\"port\",\"virtual_network\"]"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    PortVlanAssignmentList result = apiInstance.findPortVlanAssignments(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#findPortVlanAssignments");
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
//import net.packet.client.api.PortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PortsApi apiInstance = new PortsApi();
UUID id = new UUID(); // UUID | Port UUID
PortAssignInput vnid = new PortAssignInput(); // PortAssignInput | Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: '1001').
try {
    Port result = apiInstance.unassignPort(id, vnid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortsApi#unassignPort");
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

