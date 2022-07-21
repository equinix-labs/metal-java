# ConnectionsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnectionPortVirtualCircuit**](ConnectionsApi.md#createConnectionPortVirtualCircuit) | **POST** /connections/{connection_id}/ports/{port_id}/virtual-circuits | Create a new Virtual Circuit
[**createOrganizationInterconnection**](ConnectionsApi.md#createOrganizationInterconnection) | **POST** /organizations/{organization_id}/connections | Request a new connection for the organization
[**createProjectInterconnection**](ConnectionsApi.md#createProjectInterconnection) | **POST** /projects/{project_id}/connections | Request a new connection for the project&#39;s organization
[**deleteInterconnection**](ConnectionsApi.md#deleteInterconnection) | **DELETE** /connections/{connection_id} | Delete connection
[**deleteVirtualCircuit**](ConnectionsApi.md#deleteVirtualCircuit) | **DELETE** /virtual-circuits/{id} | Delete a virtual circuit
[**getConnectionPort**](ConnectionsApi.md#getConnectionPort) | **GET** /connections/{connection_id}/ports/{id} | Get a connection port
[**getInterconnection**](ConnectionsApi.md#getInterconnection) | **GET** /connections/{connection_id} | Get connection
[**getVirtualCircuit**](ConnectionsApi.md#getVirtualCircuit) | **GET** /virtual-circuits/{id} | Get a virtual circuit
[**listConnectionPortVirtualCircuits**](ConnectionsApi.md#listConnectionPortVirtualCircuits) | **GET** /connections/{connection_id}/ports/{port_id}/virtual-circuits | List a connection port&#39;s virtual circuits
[**listConnectionPorts**](ConnectionsApi.md#listConnectionPorts) | **GET** /connections/{connection_id}/ports | List a connection&#39;s ports
[**organizationListInterconnections**](ConnectionsApi.md#organizationListInterconnections) | **GET** /organizations/{organization_id}/connections | List organization connections
[**projectListInterconnections**](ConnectionsApi.md#projectListInterconnections) | **GET** /projects/{project_id}/connections | List project connections
[**updateInterconnection**](ConnectionsApi.md#updateInterconnection) | **PUT** /connections/{connection_id} | Update connection
[**updateVirtualCircuit**](ConnectionsApi.md#updateVirtualCircuit) | **PUT** /virtual-circuits/{id} | Update a virtual circuit


<a name="createConnectionPortVirtualCircuit"></a>
# **createConnectionPortVirtualCircuit**
> Object createConnectionPortVirtualCircuit(connectionId, portId, body)

Create a new Virtual Circuit

Create a new Virtual Circuit on a dedicated connection. To create a regular Virtual Circuit, specify a Virtual Network record and an NNI VLAN value. To create a VRF-based Virtual Circuit, specify the VRF ID and subnet, along with the NNI VLAN value.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | UUID of the connection
UUID portId = new UUID(); // UUID | UUID of the connection port
Object body = null; // Object | Virtual Circuit details
try {
    Object result = apiInstance.createConnectionPortVirtualCircuit(connectionId, portId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#createConnectionPortVirtualCircuit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**UUID**](.md)| UUID of the connection |
 **portId** | [**UUID**](.md)| UUID of the connection port |
 **body** | **Object**| Virtual Circuit details |

### Return type

**Object**

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrganizationInterconnection"></a>
# **createOrganizationInterconnection**
> InlineResponse2006 createOrganizationInterconnection(organizationId, body)

Request a new connection for the organization

Creates a new connection request. A Project ID must be specified in the request body for connections on shared ports.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID organizationId = new UUID(); // UUID | UUID of the organization
Body16 body = new Body16(); // Body16 | Connection details
try {
    InlineResponse2006 result = apiInstance.createOrganizationInterconnection(organizationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#createOrganizationInterconnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | [**UUID**](.md)| UUID of the organization |
 **body** | [**Body16**](Body16.md)| Connection details |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProjectInterconnection"></a>
# **createProjectInterconnection**
> InlineResponse2006 createProjectInterconnection(projectId, body)

Request a new connection for the project&#39;s organization

Creates a new connection request

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID projectId = new UUID(); // UUID | UUID of the project
Body34 body = new Body34(); // Body34 | Connection details
try {
    InlineResponse2006 result = apiInstance.createProjectInterconnection(projectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#createProjectInterconnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)| UUID of the project |
 **body** | [**Body34**](Body34.md)| Connection details |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInterconnection"></a>
# **deleteInterconnection**
> InlineResponse2006 deleteInterconnection(connectionId)

Delete connection

Delete a connection, its associated ports and virtual circuits.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | Connection UUID
try {
    InlineResponse2006 result = apiInstance.deleteInterconnection(connectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#deleteInterconnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**UUID**](.md)| Connection UUID |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVirtualCircuit"></a>
# **deleteVirtualCircuit**
> Object deleteVirtualCircuit(id)

Delete a virtual circuit

Delete a virtual circuit from a dedicated port.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID id = new UUID(); // UUID | Virtual Circuit UUID
try {
    Object result = apiInstance.deleteVirtualCircuit(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#deleteVirtualCircuit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Virtual Circuit UUID |

### Return type

**Object**

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionPort"></a>
# **getConnectionPort**
> InlineResponse2006Ports getConnectionPort(connectionId, id)

Get a connection port

Get the details of an connection port.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | UUID of the connection
UUID id = new UUID(); // UUID | Port UUID
try {
    InlineResponse2006Ports result = apiInstance.getConnectionPort(connectionId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#getConnectionPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**UUID**](.md)| UUID of the connection |
 **id** | [**UUID**](.md)| Port UUID |

### Return type

[**InlineResponse2006Ports**](InlineResponse2006Ports.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInterconnection"></a>
# **getInterconnection**
> InlineResponse2006 getInterconnection(connectionId)

Get connection

Get the details of a connection

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | Connection UUID
try {
    InlineResponse2006 result = apiInstance.getInterconnection(connectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#getInterconnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**UUID**](.md)| Connection UUID |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVirtualCircuit"></a>
# **getVirtualCircuit**
> Object getVirtualCircuit(id)

Get a virtual circuit

Get the details of a virtual circuit

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID id = new UUID(); // UUID | Virtual Circuit UUID
try {
    Object result = apiInstance.getVirtualCircuit(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#getVirtualCircuit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Virtual Circuit UUID |

### Return type

**Object**

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listConnectionPortVirtualCircuits"></a>
# **listConnectionPortVirtualCircuits**
> InlineResponse2006VirtualCircuits listConnectionPortVirtualCircuits(connectionId, portId)

List a connection port&#39;s virtual circuits

List the virtual circuit record(s) associatiated with a particular connection port.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | UUID of the connection
UUID portId = new UUID(); // UUID | UUID of the connection port
try {
    InlineResponse2006VirtualCircuits result = apiInstance.listConnectionPortVirtualCircuits(connectionId, portId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#listConnectionPortVirtualCircuits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**UUID**](.md)| UUID of the connection |
 **portId** | [**UUID**](.md)| UUID of the connection port |

### Return type

[**InlineResponse2006VirtualCircuits**](InlineResponse2006VirtualCircuits.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listConnectionPorts"></a>
# **listConnectionPorts**
> InlineResponse2008 listConnectionPorts(connectionId)

List a connection&#39;s ports

List the ports associated to an connection.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | UUID of the connection
try {
    InlineResponse2008 result = apiInstance.listConnectionPorts(connectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#listConnectionPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**UUID**](.md)| UUID of the connection |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="organizationListInterconnections"></a>
# **organizationListInterconnections**
> InlineResponse20032 organizationListInterconnections(organizationId)

List organization connections

List the connections belonging to the organization

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID organizationId = new UUID(); // UUID | UUID of the organization
try {
    InlineResponse20032 result = apiInstance.organizationListInterconnections(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#organizationListInterconnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | [**UUID**](.md)| UUID of the organization |

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="projectListInterconnections"></a>
# **projectListInterconnections**
> InlineResponse20032 projectListInterconnections(projectId)

List project connections

List the connections belonging to the project

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID projectId = new UUID(); // UUID | UUID of the project
try {
    InlineResponse20032 result = apiInstance.projectListInterconnections(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#projectListInterconnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)| UUID of the project |

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInterconnection"></a>
# **updateInterconnection**
> InlineResponse2006 updateInterconnection(connectionId, body)

Update connection

Update the details of a connection

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | Connection UUID
Body2 body = new Body2(); // Body2 | Updated connection details
try {
    InlineResponse2006 result = apiInstance.updateInterconnection(connectionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#updateInterconnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**UUID**](.md)| Connection UUID |
 **body** | [**Body2**](Body2.md)| Updated connection details |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVirtualCircuit"></a>
# **updateVirtualCircuit**
> Object updateVirtualCircuit(id, body)

Update a virtual circuit

Update the details of a virtual circuit.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID id = new UUID(); // UUID | Virtual Circuit UUID
Object body = null; // Object | Updated Virtual Circuit details
try {
    Object result = apiInstance.updateVirtualCircuit(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#updateVirtualCircuit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Virtual Circuit UUID |
 **body** | **Object**| Updated Virtual Circuit details |

### Return type

**Object**

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

