# ConnectionsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnectionPortVirtualCircuit**](ConnectionsApi.md#createConnectionPortVirtualCircuit) | **POST** /connections/{connection_id}/ports/{port_id}/virtual-circuits | Create a new Virtual Circuit |
| [**createOrganizationInterconnection**](ConnectionsApi.md#createOrganizationInterconnection) | **POST** /organizations/{organization_id}/connections | Request a new connection for the organization |
| [**createProjectInterconnection**](ConnectionsApi.md#createProjectInterconnection) | **POST** /projects/{project_id}/connections | Request a new connection for the project&#39;s organization |
| [**deleteInterconnection**](ConnectionsApi.md#deleteInterconnection) | **DELETE** /connections/{connection_id} | Delete connection |
| [**deleteVirtualCircuit**](ConnectionsApi.md#deleteVirtualCircuit) | **DELETE** /virtual-circuits/{id} | Delete a virtual circuit |
| [**getConnectionPort**](ConnectionsApi.md#getConnectionPort) | **GET** /connections/{connection_id}/ports/{id} | Get a connection port |
| [**getInterconnection**](ConnectionsApi.md#getInterconnection) | **GET** /connections/{connection_id} | Get connection |
| [**getVirtualCircuit**](ConnectionsApi.md#getVirtualCircuit) | **GET** /virtual-circuits/{id} | Get a virtual circuit |
| [**listConnectionPortVirtualCircuits**](ConnectionsApi.md#listConnectionPortVirtualCircuits) | **GET** /connections/{connection_id}/ports/{port_id}/virtual-circuits | List a connection port&#39;s virtual circuits |
| [**listConnectionPorts**](ConnectionsApi.md#listConnectionPorts) | **GET** /connections/{connection_id}/ports | List a connection&#39;s ports |
| [**organizationListInterconnections**](ConnectionsApi.md#organizationListInterconnections) | **GET** /organizations/{organization_id}/connections | List organization connections |
| [**projectListInterconnections**](ConnectionsApi.md#projectListInterconnections) | **GET** /projects/{project_id}/connections | List project connections |
| [**updateInterconnection**](ConnectionsApi.md#updateInterconnection) | **PUT** /connections/{connection_id} | Update connection |
| [**updateVirtualCircuit**](ConnectionsApi.md#updateVirtualCircuit) | **PUT** /virtual-circuits/{id} | Update a virtual circuit |


<a name="createConnectionPortVirtualCircuit"></a>
# **createConnectionPortVirtualCircuit**
> CreateConnectionPortVirtualCircuit201Response createConnectionPortVirtualCircuit(connectionId, portId, createConnectionPortVirtualCircuitRequest)

Create a new Virtual Circuit

Create a new Virtual Circuit on a dedicated connection. To create a regular Virtual Circuit, specify a Virtual Network record and an NNI VLAN value. To create a VRF-based Virtual Circuit, specify the VRF ID and subnet, along with the NNI VLAN value.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | UUID of the connection
    UUID portId = UUID.randomUUID(); // UUID | UUID of the connection port
    CreateConnectionPortVirtualCircuitRequest createConnectionPortVirtualCircuitRequest = new CreateConnectionPortVirtualCircuitRequest(); // CreateConnectionPortVirtualCircuitRequest | Virtual Circuit details
    try {
      CreateConnectionPortVirtualCircuit201Response result = apiInstance.createConnectionPortVirtualCircuit(connectionId, portId, createConnectionPortVirtualCircuitRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createConnectionPortVirtualCircuit");
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
| **connectionId** | **UUID**| UUID of the connection | |
| **portId** | **UUID**| UUID of the connection port | |
| **createConnectionPortVirtualCircuitRequest** | [**CreateConnectionPortVirtualCircuitRequest**](CreateConnectionPortVirtualCircuitRequest.md)| Virtual Circuit details | |

### Return type

[**CreateConnectionPortVirtualCircuit201Response**](CreateConnectionPortVirtualCircuit201Response.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | ok |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |

<a name="createOrganizationInterconnection"></a>
# **createOrganizationInterconnection**
> Interconnection createOrganizationInterconnection(organizationId, interconnectionCreateInput)

Request a new connection for the organization

Creates a new connection request. A Project ID must be specified in the request body for connections on shared ports.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | UUID of the organization
    InterconnectionCreateInput interconnectionCreateInput = new InterconnectionCreateInput(); // InterconnectionCreateInput | Connection details
    try {
      Interconnection result = apiInstance.createOrganizationInterconnection(organizationId, interconnectionCreateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createOrganizationInterconnection");
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
| **organizationId** | **UUID**| UUID of the organization | |
| **interconnectionCreateInput** | [**InterconnectionCreateInput**](InterconnectionCreateInput.md)| Connection details | |

### Return type

[**Interconnection**](Interconnection.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

<a name="createProjectInterconnection"></a>
# **createProjectInterconnection**
> Interconnection createProjectInterconnection(projectId, interconnectionCreateInput)

Request a new connection for the project&#39;s organization

Creates a new connection request

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | UUID of the project
    InterconnectionCreateInput interconnectionCreateInput = new InterconnectionCreateInput(); // InterconnectionCreateInput | Connection details
    try {
      Interconnection result = apiInstance.createProjectInterconnection(projectId, interconnectionCreateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createProjectInterconnection");
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
| **projectId** | **UUID**| UUID of the project | |
| **interconnectionCreateInput** | [**InterconnectionCreateInput**](InterconnectionCreateInput.md)| Connection details | |

### Return type

[**Interconnection**](Interconnection.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  -  |
| **403** | forbidden |  -  |
| **422** | unprocessable entity |  -  |

<a name="deleteInterconnection"></a>
# **deleteInterconnection**
> Interconnection deleteInterconnection(connectionId)

Delete connection

Delete a connection, its associated ports and virtual circuits.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | Connection UUID
    try {
      Interconnection result = apiInstance.deleteInterconnection(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#deleteInterconnection");
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
| **connectionId** | **UUID**| Connection UUID | |

### Return type

[**Interconnection**](Interconnection.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | accepted |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |

<a name="deleteVirtualCircuit"></a>
# **deleteVirtualCircuit**
> CreateConnectionPortVirtualCircuit201Response deleteVirtualCircuit(id)

Delete a virtual circuit

Delete a virtual circuit from a dedicated port.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Virtual Circuit UUID
    try {
      CreateConnectionPortVirtualCircuit201Response result = apiInstance.deleteVirtualCircuit(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#deleteVirtualCircuit");
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
| **id** | **UUID**| Virtual Circuit UUID | |

### Return type

[**CreateConnectionPortVirtualCircuit201Response**](CreateConnectionPortVirtualCircuit201Response.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | accepted |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |

<a name="getConnectionPort"></a>
# **getConnectionPort**
> InterconnectionPort getConnectionPort(connectionId, id)

Get a connection port

Get the details of an connection port.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | UUID of the connection
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    try {
      InterconnectionPort result = apiInstance.getConnectionPort(connectionId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#getConnectionPort");
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
| **connectionId** | **UUID**| UUID of the connection | |
| **id** | **UUID**| Port UUID | |

### Return type

[**InterconnectionPort**](InterconnectionPort.md)

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

<a name="getInterconnection"></a>
# **getInterconnection**
> Interconnection getInterconnection(connectionId)

Get connection

Get the details of a connection

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | Connection UUID
    try {
      Interconnection result = apiInstance.getInterconnection(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#getInterconnection");
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
| **connectionId** | **UUID**| Connection UUID | |

### Return type

[**Interconnection**](Interconnection.md)

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

<a name="getVirtualCircuit"></a>
# **getVirtualCircuit**
> CreateConnectionPortVirtualCircuit201Response getVirtualCircuit(id)

Get a virtual circuit

Get the details of a virtual circuit

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Virtual Circuit UUID
    try {
      CreateConnectionPortVirtualCircuit201Response result = apiInstance.getVirtualCircuit(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#getVirtualCircuit");
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
| **id** | **UUID**| Virtual Circuit UUID | |

### Return type

[**CreateConnectionPortVirtualCircuit201Response**](CreateConnectionPortVirtualCircuit201Response.md)

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

<a name="listConnectionPortVirtualCircuits"></a>
# **listConnectionPortVirtualCircuits**
> VirtualCircuitList listConnectionPortVirtualCircuits(connectionId, portId)

List a connection port&#39;s virtual circuits

List the virtual circuit record(s) associatiated with a particular connection port.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | UUID of the connection
    UUID portId = UUID.randomUUID(); // UUID | UUID of the connection port
    try {
      VirtualCircuitList result = apiInstance.listConnectionPortVirtualCircuits(connectionId, portId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#listConnectionPortVirtualCircuits");
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
| **connectionId** | **UUID**| UUID of the connection | |
| **portId** | **UUID**| UUID of the connection port | |

### Return type

[**VirtualCircuitList**](VirtualCircuitList.md)

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

<a name="listConnectionPorts"></a>
# **listConnectionPorts**
> InterconnectionPortList listConnectionPorts(connectionId)

List a connection&#39;s ports

List the ports associated to an connection.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | UUID of the connection
    try {
      InterconnectionPortList result = apiInstance.listConnectionPorts(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#listConnectionPorts");
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
| **connectionId** | **UUID**| UUID of the connection | |

### Return type

[**InterconnectionPortList**](InterconnectionPortList.md)

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

<a name="organizationListInterconnections"></a>
# **organizationListInterconnections**
> InterconnectionList organizationListInterconnections(organizationId)

List organization connections

List the connections belonging to the organization

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | UUID of the organization
    try {
      InterconnectionList result = apiInstance.organizationListInterconnections(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#organizationListInterconnections");
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
| **organizationId** | **UUID**| UUID of the organization | |

### Return type

[**InterconnectionList**](InterconnectionList.md)

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

<a name="projectListInterconnections"></a>
# **projectListInterconnections**
> InterconnectionList projectListInterconnections(projectId)

List project connections

List the connections belonging to the project

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | UUID of the project
    try {
      InterconnectionList result = apiInstance.projectListInterconnections(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#projectListInterconnections");
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
| **projectId** | **UUID**| UUID of the project | |

### Return type

[**InterconnectionList**](InterconnectionList.md)

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

<a name="updateInterconnection"></a>
# **updateInterconnection**
> Interconnection updateInterconnection(connectionId, interconnectionUpdateInput)

Update connection

Update the details of a connection

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | Connection UUID
    InterconnectionUpdateInput interconnectionUpdateInput = new InterconnectionUpdateInput(); // InterconnectionUpdateInput | Updated connection details
    try {
      Interconnection result = apiInstance.updateInterconnection(connectionId, interconnectionUpdateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#updateInterconnection");
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
| **connectionId** | **UUID**| Connection UUID | |
| **interconnectionUpdateInput** | [**InterconnectionUpdateInput**](InterconnectionUpdateInput.md)| Updated connection details | |

### Return type

[**Interconnection**](Interconnection.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |

<a name="updateVirtualCircuit"></a>
# **updateVirtualCircuit**
> CreateConnectionPortVirtualCircuit201Response updateVirtualCircuit(id, updateVirtualCircuitRequest)

Update a virtual circuit

Update the details of a virtual circuit.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Virtual Circuit UUID
    UpdateVirtualCircuitRequest updateVirtualCircuitRequest = new UpdateVirtualCircuitRequest(); // UpdateVirtualCircuitRequest | Updated Virtual Circuit details
    try {
      CreateConnectionPortVirtualCircuit201Response result = apiInstance.updateVirtualCircuit(id, updateVirtualCircuitRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#updateVirtualCircuit");
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
| **id** | **UUID**| Virtual Circuit UUID | |
| **updateVirtualCircuitRequest** | [**UpdateVirtualCircuitRequest**](UpdateVirtualCircuitRequest.md)| Updated Virtual Circuit details | |

### Return type

[**CreateConnectionPortVirtualCircuit201Response**](CreateConnectionPortVirtualCircuit201Response.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **202** | accepted |  -  |
| **403** | forbidden |  -  |
| **404** | not found |  -  |

