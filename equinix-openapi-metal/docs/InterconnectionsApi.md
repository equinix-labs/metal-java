# InterconnectionsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInterconnectionPortVirtualCircuit**](InterconnectionsApi.md#createInterconnectionPortVirtualCircuit) | **POST** /connections/{connection_id}/ports/{port_id}/virtual-circuits | Create a new Virtual Circuit |
| [**createOrganizationInterconnection**](InterconnectionsApi.md#createOrganizationInterconnection) | **POST** /organizations/{organization_id}/connections | Request a new interconnection for the organization |
| [**createProjectInterconnection**](InterconnectionsApi.md#createProjectInterconnection) | **POST** /projects/{project_id}/connections | Request a new interconnection for the project&#39;s organization |
| [**deleteInterconnection**](InterconnectionsApi.md#deleteInterconnection) | **DELETE** /connections/{connection_id} | Delete interconnection |
| [**deleteVirtualCircuit**](InterconnectionsApi.md#deleteVirtualCircuit) | **DELETE** /virtual-circuits/{id} | Delete a virtual circuit |
| [**getInterconnection**](InterconnectionsApi.md#getInterconnection) | **GET** /connections/{connection_id} | Get interconnection |
| [**getInterconnectionPort**](InterconnectionsApi.md#getInterconnectionPort) | **GET** /connections/{connection_id}/ports/{id} | Get a interconnection port |
| [**getVirtualCircuit**](InterconnectionsApi.md#getVirtualCircuit) | **GET** /virtual-circuits/{id} | Get a virtual circuit |
| [**listInterconnectionPortVirtualCircuits**](InterconnectionsApi.md#listInterconnectionPortVirtualCircuits) | **GET** /connections/{connection_id}/ports/{port_id}/virtual-circuits | List a interconnection port&#39;s virtual circuits |
| [**listInterconnectionPorts**](InterconnectionsApi.md#listInterconnectionPorts) | **GET** /connections/{connection_id}/ports | List a interconnection&#39;s ports |
| [**listInterconnectionVirtualCircuits**](InterconnectionsApi.md#listInterconnectionVirtualCircuits) | **GET** /connections/{connection_id}/virtual-circuits | List a interconnection&#39;s virtual circuits |
| [**organizationListInterconnections**](InterconnectionsApi.md#organizationListInterconnections) | **GET** /organizations/{organization_id}/connections | List organization connections |
| [**projectListInterconnections**](InterconnectionsApi.md#projectListInterconnections) | **GET** /projects/{project_id}/connections | List project connections |
| [**updateInterconnection**](InterconnectionsApi.md#updateInterconnection) | **PUT** /connections/{connection_id} | Update interconnection |
| [**updateVirtualCircuit**](InterconnectionsApi.md#updateVirtualCircuit) | **PUT** /virtual-circuits/{id} | Update a virtual circuit |


<a name="createInterconnectionPortVirtualCircuit"></a>
# **createInterconnectionPortVirtualCircuit**
> CreateInterconnectionPortVirtualCircuit201Response createInterconnectionPortVirtualCircuit(connectionId, portId, createInterconnectionPortVirtualCircuitRequest)

Create a new Virtual Circuit

Create a new Virtual Circuit on a Dedicated Port. To create a regular Virtual Circuit, specify a Virtual Network record and an NNI VLAN value. To create a VRF-based Virtual Circuit, specify the VRF ID and subnet, along with the NNI VLAN value.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | UUID of the interconnection
    UUID portId = UUID.randomUUID(); // UUID | UUID of the interconnection port
    CreateInterconnectionPortVirtualCircuitRequest createInterconnectionPortVirtualCircuitRequest = new CreateInterconnectionPortVirtualCircuitRequest(); // CreateInterconnectionPortVirtualCircuitRequest | Virtual Circuit details
    try {
      CreateInterconnectionPortVirtualCircuit201Response result = apiInstance.createInterconnectionPortVirtualCircuit(connectionId, portId, createInterconnectionPortVirtualCircuitRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#createInterconnectionPortVirtualCircuit");
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
| **connectionId** | **UUID**| UUID of the interconnection | |
| **portId** | **UUID**| UUID of the interconnection port | |
| **createInterconnectionPortVirtualCircuitRequest** | [**CreateInterconnectionPortVirtualCircuitRequest**](CreateInterconnectionPortVirtualCircuitRequest.md)| Virtual Circuit details | |

### Return type

[**CreateInterconnectionPortVirtualCircuit201Response**](CreateInterconnectionPortVirtualCircuit201Response.md)

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

Request a new interconnection for the organization

Creates a new interconnection request. A Project ID must be specified in the request body for connections on shared ports.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | UUID of the organization
    InterconnectionCreateInput interconnectionCreateInput = new InterconnectionCreateInput(); // InterconnectionCreateInput | Interconnection details
    try {
      Interconnection result = apiInstance.createOrganizationInterconnection(organizationId, interconnectionCreateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#createOrganizationInterconnection");
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
| **interconnectionCreateInput** | [**InterconnectionCreateInput**](InterconnectionCreateInput.md)| Interconnection details | |

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

Request a new interconnection for the project&#39;s organization

Creates a new interconnection request

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | UUID of the project
    InterconnectionCreateInput interconnectionCreateInput = new InterconnectionCreateInput(); // InterconnectionCreateInput | Interconnection details
    try {
      Interconnection result = apiInstance.createProjectInterconnection(projectId, interconnectionCreateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#createProjectInterconnection");
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
| **interconnectionCreateInput** | [**InterconnectionCreateInput**](InterconnectionCreateInput.md)| Interconnection details | |

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

Delete interconnection

Delete a interconnection, its associated ports and virtual circuits.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | Interconnection UUID
    try {
      Interconnection result = apiInstance.deleteInterconnection(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#deleteInterconnection");
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
| **connectionId** | **UUID**| Interconnection UUID | |

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
> CreateInterconnectionPortVirtualCircuit201Response deleteVirtualCircuit(id)

Delete a virtual circuit

Delete a virtual circuit from a Dedicated Port.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Virtual Circuit UUID
    try {
      CreateInterconnectionPortVirtualCircuit201Response result = apiInstance.deleteVirtualCircuit(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#deleteVirtualCircuit");
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

[**CreateInterconnectionPortVirtualCircuit201Response**](CreateInterconnectionPortVirtualCircuit201Response.md)

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

<a name="getInterconnection"></a>
# **getInterconnection**
> Interconnection getInterconnection(connectionId)

Get interconnection

Get the details of a interconnection

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | Interconnection UUID
    try {
      Interconnection result = apiInstance.getInterconnection(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#getInterconnection");
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
| **connectionId** | **UUID**| Interconnection UUID | |

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

<a name="getInterconnectionPort"></a>
# **getInterconnectionPort**
> InterconnectionPort getInterconnectionPort(connectionId, id)

Get a interconnection port

Get the details of an interconnection port.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | UUID of the interconnection
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    try {
      InterconnectionPort result = apiInstance.getInterconnectionPort(connectionId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#getInterconnectionPort");
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
| **connectionId** | **UUID**| UUID of the interconnection | |
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

<a name="getVirtualCircuit"></a>
# **getVirtualCircuit**
> CreateInterconnectionPortVirtualCircuit201Response getVirtualCircuit(id)

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
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Virtual Circuit UUID
    try {
      CreateInterconnectionPortVirtualCircuit201Response result = apiInstance.getVirtualCircuit(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#getVirtualCircuit");
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

[**CreateInterconnectionPortVirtualCircuit201Response**](CreateInterconnectionPortVirtualCircuit201Response.md)

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

<a name="listInterconnectionPortVirtualCircuits"></a>
# **listInterconnectionPortVirtualCircuits**
> VirtualCircuitList listInterconnectionPortVirtualCircuits(connectionId, portId)

List a interconnection port&#39;s virtual circuits

List the virtual circuit record(s) associatiated with a particular interconnection port.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | UUID of the interconnection
    UUID portId = UUID.randomUUID(); // UUID | UUID of the interconnection port
    try {
      VirtualCircuitList result = apiInstance.listInterconnectionPortVirtualCircuits(connectionId, portId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#listInterconnectionPortVirtualCircuits");
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
| **connectionId** | **UUID**| UUID of the interconnection | |
| **portId** | **UUID**| UUID of the interconnection port | |

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

<a name="listInterconnectionPorts"></a>
# **listInterconnectionPorts**
> InterconnectionPortList listInterconnectionPorts(connectionId)

List a interconnection&#39;s ports

List the ports associated to an interconnection.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | UUID of the interconnection
    try {
      InterconnectionPortList result = apiInstance.listInterconnectionPorts(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#listInterconnectionPorts");
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
| **connectionId** | **UUID**| UUID of the interconnection | |

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

<a name="listInterconnectionVirtualCircuits"></a>
# **listInterconnectionVirtualCircuits**
> VirtualCircuitList listInterconnectionVirtualCircuits(connectionId)

List a interconnection&#39;s virtual circuits

List the virtual circuit record(s) associated with a particular interconnection id.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | UUID of the interconnection
    try {
      VirtualCircuitList result = apiInstance.listInterconnectionVirtualCircuits(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#listInterconnectionVirtualCircuits");
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
| **connectionId** | **UUID**| UUID of the interconnection | |

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
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | UUID of the organization
    try {
      InterconnectionList result = apiInstance.organizationListInterconnections(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#organizationListInterconnections");
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
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | UUID of the project
    try {
      InterconnectionList result = apiInstance.projectListInterconnections(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#projectListInterconnections");
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

Update interconnection

Update the details of a interconnection

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | Interconnection UUID
    InterconnectionUpdateInput interconnectionUpdateInput = new InterconnectionUpdateInput(); // InterconnectionUpdateInput | Updated interconnection details
    try {
      Interconnection result = apiInstance.updateInterconnection(connectionId, interconnectionUpdateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#updateInterconnection");
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
| **connectionId** | **UUID**| Interconnection UUID | |
| **interconnectionUpdateInput** | [**InterconnectionUpdateInput**](InterconnectionUpdateInput.md)| Updated interconnection details | |

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
> CreateInterconnectionPortVirtualCircuit201Response updateVirtualCircuit(id, updateVirtualCircuitRequest)

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
import com.equinix.openapi.metal.v1.api.InterconnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    InterconnectionsApi apiInstance = new InterconnectionsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Virtual Circuit UUID
    UpdateVirtualCircuitRequest updateVirtualCircuitRequest = new UpdateVirtualCircuitRequest(); // UpdateVirtualCircuitRequest | Updated Virtual Circuit details
    try {
      CreateInterconnectionPortVirtualCircuit201Response result = apiInstance.updateVirtualCircuit(id, updateVirtualCircuitRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterconnectionsApi#updateVirtualCircuit");
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

[**CreateInterconnectionPortVirtualCircuit201Response**](CreateInterconnectionPortVirtualCircuit201Response.md)

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

