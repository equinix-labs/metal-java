# ConnectionsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnectionPortVirtualCircuit**](ConnectionsApi.md#createConnectionPortVirtualCircuit) | **POST** /connections/{connection_id}/ports/{port_id}/virtual-circuits | Create a new Virtual Circuit
[**createOrganizationInterconnection**](ConnectionsApi.md#createOrganizationInterconnection) | **POST** /organizations/{organization_id}/connections | Request a new connection for the organization
[**createProjectInterconnection**](ConnectionsApi.md#createProjectInterconnection) | **POST** /projects/{project_id}/connections | Request a new connection for the project&#39;s organization
[**deleteInterconnection**](ConnectionsApi.md#deleteInterconnection) | **DELETE** /connections/{connection_id} | Delete connection
[**deleteVirtualCircuit**](ConnectionsApi.md#deleteVirtualCircuit) | **DELETE** /virtual-circuits/{id} | Delete a virtual circuit
[**findConnectionEvents**](ConnectionsApi.md#findConnectionEvents) | **GET** /connections/{connection_id}/events | Retrieve connection events
[**findConnectionPortEvents**](ConnectionsApi.md#findConnectionPortEvents) | **GET** /connections/{connection_id}/ports/{id}/events | Retrieve connection port events
[**findVirtualCircuitEvents**](ConnectionsApi.md#findVirtualCircuitEvents) | **GET** /virtual-circuit/{id}/events | Retrieve connection events
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
> VirtualCircuitList createConnectionPortVirtualCircuit(connectionId, portId, virtualCircuit)

Create a new Virtual Circuit

Create a new Virtual Circuit on a dedicated connection using a Virtual Network record and an NNI VLAN value.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | UUID of the connection
UUID portId = new UUID(); // UUID | UUID of the connection port
VirtualCircuitCreateInput virtualCircuit = new VirtualCircuitCreateInput(); // VirtualCircuitCreateInput | Virtual Circuit details
try {
    VirtualCircuitList result = apiInstance.createConnectionPortVirtualCircuit(connectionId, portId, virtualCircuit);
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
 **virtualCircuit** | [**VirtualCircuitCreateInput**](VirtualCircuitCreateInput.md)| Virtual Circuit details |

### Return type

[**VirtualCircuitList**](VirtualCircuitList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrganizationInterconnection"></a>
# **createOrganizationInterconnection**
> Interconnection createOrganizationInterconnection(organizationId, connection)

Request a new connection for the organization

Creates a new connection request. A Project ID must be specified in the request body for connections on shared ports.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID organizationId = new UUID(); // UUID | UUID of the organization
InterconnectionCreateInput connection = new InterconnectionCreateInput(); // InterconnectionCreateInput | Connection details
try {
    Interconnection result = apiInstance.createOrganizationInterconnection(organizationId, connection);
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
 **connection** | [**InterconnectionCreateInput**](InterconnectionCreateInput.md)| Connection details |

### Return type

[**Interconnection**](Interconnection.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProjectInterconnection"></a>
# **createProjectInterconnection**
> Interconnection createProjectInterconnection(projectId, connection)

Request a new connection for the project&#39;s organization

Creates a new connection request

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID projectId = new UUID(); // UUID | UUID of the project
InterconnectionCreateInput connection = new InterconnectionCreateInput(); // InterconnectionCreateInput | Connection details
try {
    Interconnection result = apiInstance.createProjectInterconnection(projectId, connection);
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
 **connection** | [**InterconnectionCreateInput**](InterconnectionCreateInput.md)| Connection details |

### Return type

[**Interconnection**](Interconnection.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInterconnection"></a>
# **deleteInterconnection**
> Interconnection deleteInterconnection(connectionId)

Delete connection

Delete a connection, its associated ports and virtual circuits.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | Connection UUID
try {
    Interconnection result = apiInstance.deleteInterconnection(connectionId);
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

[**Interconnection**](Interconnection.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVirtualCircuit"></a>
# **deleteVirtualCircuit**
> VirtualCircuit deleteVirtualCircuit(id)

Delete a virtual circuit

Delete a virtual circuit from a dedicated port.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID id = new UUID(); // UUID | Virtual Circuit UUID
try {
    VirtualCircuit result = apiInstance.deleteVirtualCircuit(id);
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

[**VirtualCircuit**](VirtualCircuit.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findConnectionEvents"></a>
# **findConnectionEvents**
> Event findConnectionEvents(connectionId, include, exclude, page, perPage)

Retrieve connection events

Returns a list of the connection events

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | Connection UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    Event result = apiInstance.findConnectionEvents(connectionId, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#findConnectionEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**UUID**](.md)| Connection UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**Event**](Event.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findConnectionPortEvents"></a>
# **findConnectionPortEvents**
> Event findConnectionPortEvents(connectionId, id, include, exclude, page, perPage)

Retrieve connection port events

Returns a list of the connection port events

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | Connection UUID
UUID id = new UUID(); // UUID | Connection Port UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    Event result = apiInstance.findConnectionPortEvents(connectionId, id, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#findConnectionPortEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**UUID**](.md)| Connection UUID |
 **id** | [**UUID**](.md)| Connection Port UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**Event**](Event.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findVirtualCircuitEvents"></a>
# **findVirtualCircuitEvents**
> Event findVirtualCircuitEvents(id, include, exclude, page, perPage)

Retrieve connection events

Returns a list of the virtual circuit events

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID id = new UUID(); // UUID | Virtual Circuit UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    Event result = apiInstance.findVirtualCircuitEvents(id, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#findVirtualCircuitEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Virtual Circuit UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**Event**](Event.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConnectionPort"></a>
# **getConnectionPort**
> InterconnectionPort getConnectionPort(connectionId, id)

Get a connection port

Get the details of an connection port.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

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
    InterconnectionPort result = apiInstance.getConnectionPort(connectionId, id);
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

[**InterconnectionPort**](InterconnectionPort.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInterconnection"></a>
# **getInterconnection**
> Interconnection getInterconnection(connectionId)

Get connection

Get the details of a connection

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | Connection UUID
try {
    Interconnection result = apiInstance.getInterconnection(connectionId);
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

[**Interconnection**](Interconnection.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVirtualCircuit"></a>
# **getVirtualCircuit**
> VirtualCircuit getVirtualCircuit(id)

Get a virtual circuit

Get the details of a virtual circuit

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID id = new UUID(); // UUID | Virtual Circuit UUID
try {
    VirtualCircuit result = apiInstance.getVirtualCircuit(id);
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

[**VirtualCircuit**](VirtualCircuit.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listConnectionPortVirtualCircuits"></a>
# **listConnectionPortVirtualCircuits**
> VirtualCircuitList listConnectionPortVirtualCircuits(connectionId, portId)

List a connection port&#39;s virtual circuits

List the virtual circuit record(s) associatiated with a particular connection port.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

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
    VirtualCircuitList result = apiInstance.listConnectionPortVirtualCircuits(connectionId, portId);
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

[**VirtualCircuitList**](VirtualCircuitList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listConnectionPorts"></a>
# **listConnectionPorts**
> InterconnectionPortList listConnectionPorts(connectionId)

List a connection&#39;s ports

List the ports associated to an connection.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | UUID of the connection
try {
    InterconnectionPortList result = apiInstance.listConnectionPorts(connectionId);
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

[**InterconnectionPortList**](InterconnectionPortList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="organizationListInterconnections"></a>
# **organizationListInterconnections**
> InterconnectionList organizationListInterconnections(organizationId)

List organization connections

List the connections belonging to the organization

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID organizationId = new UUID(); // UUID | UUID of the organization
try {
    InterconnectionList result = apiInstance.organizationListInterconnections(organizationId);
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

[**InterconnectionList**](InterconnectionList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="projectListInterconnections"></a>
# **projectListInterconnections**
> InterconnectionList projectListInterconnections(projectId)

List project connections

List the connections belonging to the project

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID projectId = new UUID(); // UUID | UUID of the project
try {
    InterconnectionList result = apiInstance.projectListInterconnections(projectId);
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

[**InterconnectionList**](InterconnectionList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInterconnection"></a>
# **updateInterconnection**
> Interconnection updateInterconnection(connectionId, connection)

Update connection

Update the details of a connection

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID connectionId = new UUID(); // UUID | Connection UUID
InterconnectionUpdateInput connection = new InterconnectionUpdateInput(); // InterconnectionUpdateInput | Updated connection details
try {
    Interconnection result = apiInstance.updateInterconnection(connectionId, connection);
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
 **connection** | [**InterconnectionUpdateInput**](InterconnectionUpdateInput.md)| Updated connection details |

### Return type

[**Interconnection**](Interconnection.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVirtualCircuit"></a>
# **updateVirtualCircuit**
> VirtualCircuit updateVirtualCircuit(id, virtualCircuit)

Update a virtual circuit

Update the details of a virtual circuit.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

ConnectionsApi apiInstance = new ConnectionsApi();
UUID id = new UUID(); // UUID | Virtual Circuit UUID
VirtualCircuitUpdateInput virtualCircuit = new VirtualCircuitUpdateInput(); // VirtualCircuitUpdateInput | Updated Virtual Circuit details
try {
    VirtualCircuit result = apiInstance.updateVirtualCircuit(id, virtualCircuit);
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
 **virtualCircuit** | [**VirtualCircuitUpdateInput**](VirtualCircuitUpdateInput.md)| Updated Virtual Circuit details |

### Return type

[**VirtualCircuit**](VirtualCircuit.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

