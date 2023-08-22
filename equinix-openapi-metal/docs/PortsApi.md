# PortsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignNativeVlan**](PortsApi.md#assignNativeVlan) | **POST** /ports/{id}/native-vlan | Assign a native VLAN |
| [**assignPort**](PortsApi.md#assignPort) | **POST** /ports/{id}/assign | Assign a port to virtual network |
| [**bondPort**](PortsApi.md#bondPort) | **POST** /ports/{id}/bond | Enabling bonding |
| [**convertLayer2**](PortsApi.md#convertLayer2) | **POST** /ports/{id}/convert/layer-2 | Convert to Layer 2 |
| [**convertLayer3**](PortsApi.md#convertLayer3) | **POST** /ports/{id}/convert/layer-3 | Convert to Layer 3 |
| [**createPortVlanAssignmentBatch**](PortsApi.md#createPortVlanAssignmentBatch) | **POST** /ports/{id}/vlan-assignments/batches | Create a new Port-VLAN Assignment management batch |
| [**deleteNativeVlan**](PortsApi.md#deleteNativeVlan) | **DELETE** /ports/{id}/native-vlan | Remove native VLAN |
| [**disbondPort**](PortsApi.md#disbondPort) | **POST** /ports/{id}/disbond | Disabling bonding |
| [**findPortById**](PortsApi.md#findPortById) | **GET** /ports/{id} | Retrieve a port |
| [**findPortVlanAssignmentBatchByPortIdAndBatchId**](PortsApi.md#findPortVlanAssignmentBatchByPortIdAndBatchId) | **GET** /ports/{id}/vlan-assignments/batches/{batch_id} | Retrieve a VLAN Assignment Batch&#39;s details |
| [**findPortVlanAssignmentBatches**](PortsApi.md#findPortVlanAssignmentBatches) | **GET** /ports/{id}/vlan-assignments/batches | List the VLAN Assignment Batches for a port |
| [**findPortVlanAssignmentByPortIdAndAssignmentId**](PortsApi.md#findPortVlanAssignmentByPortIdAndAssignmentId) | **GET** /ports/{id}/vlan-assignments/{assignment_id} | Show a particular Port VLAN assignment&#39;s details |
| [**findPortVlanAssignments**](PortsApi.md#findPortVlanAssignments) | **GET** /ports/{id}/vlan-assignments | List Current VLAN assignments for a port |
| [**unassignPort**](PortsApi.md#unassignPort) | **POST** /ports/{id}/unassign | Unassign a port |


<a id="assignNativeVlan"></a>
# **assignNativeVlan**
> Port assignNativeVlan(id, vnid, include)

Assign a native VLAN

Sets a virtual network on this port as a \&quot;native VLAN\&quot;. The VLAN must have already been assigned using the using the \&quot;Assign a port to a virtual network\&quot; operation.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    String vnid = "vnid_example"; // String | Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: '1001').
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      Port result = apiInstance.assignNativeVlan(id, vnid, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#assignNativeVlan");
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
| **id** | **UUID**| Port UUID | |
| **vnid** | **String**| Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: &#39;1001&#39;). | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**Port**](Port.md)

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

<a id="assignPort"></a>
# **assignPort**
> Port assignPort(id, portAssignInput, include)

Assign a port to virtual network

Assign a hardware port to a virtual network.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    PortAssignInput portAssignInput = new PortAssignInput(); // PortAssignInput | Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: '1001').
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      Port result = apiInstance.assignPort(id, portAssignInput, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#assignPort");
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
| **id** | **UUID**| Port UUID | |
| **portAssignInput** | [**PortAssignInput**](PortAssignInput.md)| Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: &#39;1001&#39;). | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**Port**](Port.md)

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

<a id="bondPort"></a>
# **bondPort**
> Port bondPort(id, bulkEnable, include)

Enabling bonding

Enabling bonding for one or all ports

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    Boolean bulkEnable = true; // Boolean | enable both ports
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      Port result = apiInstance.bondPort(id, bulkEnable, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#bondPort");
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
| **id** | **UUID**| Port UUID | |
| **bulkEnable** | **Boolean**| enable both ports | [optional] |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**Port**](Port.md)

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
| **422** | unprocessable entity |  -  |

<a id="convertLayer2"></a>
# **convertLayer2**
> Port convertLayer2(id, portAssignInput, include)

Convert to Layer 2

Converts a bond port to Layer 2. IP assignments of the port will be removed.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    PortAssignInput portAssignInput = new PortAssignInput(); // PortAssignInput | Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: '1001').
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      Port result = apiInstance.convertLayer2(id, portAssignInput, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#convertLayer2");
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
| **id** | **UUID**| Port UUID | |
| **portAssignInput** | [**PortAssignInput**](PortAssignInput.md)| Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: &#39;1001&#39;). | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**Port**](Port.md)

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

<a id="convertLayer3"></a>
# **convertLayer3**
> Port convertLayer3(id, include, portConvertLayer3Input)

Convert to Layer 3

Converts a bond port to Layer 3. VLANs must first be unassigned.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    PortConvertLayer3Input portConvertLayer3Input = new PortConvertLayer3Input(); // PortConvertLayer3Input | IPs to request
    try {
      Port result = apiInstance.convertLayer3(id, include, portConvertLayer3Input);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#convertLayer3");
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
| **id** | **UUID**| Port UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **portConvertLayer3Input** | [**PortConvertLayer3Input**](PortConvertLayer3Input.md)| IPs to request | [optional] |

### Return type

[**Port**](Port.md)

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

<a id="createPortVlanAssignmentBatch"></a>
# **createPortVlanAssignmentBatch**
> PortVlanAssignmentBatch createPortVlanAssignmentBatch(id, portVlanAssignmentBatchCreateInput, include)

Create a new Port-VLAN Assignment management batch

Create a new asynchronous batch request which handles adding and/or removing the VLANs to which the port is assigned.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    PortVlanAssignmentBatchCreateInput portVlanAssignmentBatchCreateInput = new PortVlanAssignmentBatchCreateInput(); // PortVlanAssignmentBatchCreateInput | VLAN Assignment batch details
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      PortVlanAssignmentBatch result = apiInstance.createPortVlanAssignmentBatch(id, portVlanAssignmentBatchCreateInput, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#createPortVlanAssignmentBatch");
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
| **id** | **UUID**| Port UUID | |
| **portVlanAssignmentBatchCreateInput** | [**PortVlanAssignmentBatchCreateInput**](PortVlanAssignmentBatchCreateInput.md)| VLAN Assignment batch details | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**PortVlanAssignmentBatch**](PortVlanAssignmentBatch.md)

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

<a id="deleteNativeVlan"></a>
# **deleteNativeVlan**
> Port deleteNativeVlan(id, include)

Remove native VLAN

Removes the native VLAN from this port

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      Port result = apiInstance.deleteNativeVlan(id, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#deleteNativeVlan");
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
| **id** | **UUID**| Port UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**Port**](Port.md)

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

<a id="disbondPort"></a>
# **disbondPort**
> Port disbondPort(id, bulkDisable, include)

Disabling bonding

Disabling bonding for one or all ports

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    Boolean bulkDisable = true; // Boolean | disable both ports
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      Port result = apiInstance.disbondPort(id, bulkDisable, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#disbondPort");
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
| **id** | **UUID**| Port UUID | |
| **bulkDisable** | **Boolean**| disable both ports | [optional] |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**Port**](Port.md)

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
| **422** | unprocessable entity |  -  |

<a id="findPortById"></a>
# **findPortById**
> Port findPortById(id, include)

Retrieve a port

Returns a port

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      Port result = apiInstance.findPortById(id, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#findPortById");
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
| **id** | **UUID**| Port UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**Port**](Port.md)

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

<a id="findPortVlanAssignmentBatchByPortIdAndBatchId"></a>
# **findPortVlanAssignmentBatchByPortIdAndBatchId**
> PortVlanAssignmentBatch findPortVlanAssignmentBatchByPortIdAndBatchId(id, batchId, include)

Retrieve a VLAN Assignment Batch&#39;s details

Returns the details of an existing Port-VLAN Assignment batch, including the list of VLANs to assign or unassign, and the current state of the batch.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    UUID batchId = UUID.randomUUID(); // UUID | Batch ID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      PortVlanAssignmentBatch result = apiInstance.findPortVlanAssignmentBatchByPortIdAndBatchId(id, batchId, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#findPortVlanAssignmentBatchByPortIdAndBatchId");
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
| **id** | **UUID**| Port UUID | |
| **batchId** | **UUID**| Batch ID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**PortVlanAssignmentBatch**](PortVlanAssignmentBatch.md)

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

<a id="findPortVlanAssignmentBatches"></a>
# **findPortVlanAssignmentBatches**
> PortVlanAssignmentBatchList findPortVlanAssignmentBatches(id)

List the VLAN Assignment Batches for a port

Show all the VLAN assignment batches that have been created for managing this port&#39;s VLAN assignments

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    try {
      PortVlanAssignmentBatchList result = apiInstance.findPortVlanAssignmentBatches(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#findPortVlanAssignmentBatches");
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
| **id** | **UUID**| Port UUID | |

### Return type

[**PortVlanAssignmentBatchList**](PortVlanAssignmentBatchList.md)

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

<a id="findPortVlanAssignmentByPortIdAndAssignmentId"></a>
# **findPortVlanAssignmentByPortIdAndAssignmentId**
> PortVlanAssignment findPortVlanAssignmentByPortIdAndAssignmentId(id, assignmentId, include)

Show a particular Port VLAN assignment&#39;s details

Show the details of a specific Port-VLAN assignment, including the current state and if the VLAN is set as native.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    UUID assignmentId = UUID.randomUUID(); // UUID | Assignment ID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      PortVlanAssignment result = apiInstance.findPortVlanAssignmentByPortIdAndAssignmentId(id, assignmentId, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#findPortVlanAssignmentByPortIdAndAssignmentId");
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
| **id** | **UUID**| Port UUID | |
| **assignmentId** | **UUID**| Assignment ID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**PortVlanAssignment**](PortVlanAssignment.md)

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

<a id="findPortVlanAssignments"></a>
# **findPortVlanAssignments**
> PortVlanAssignmentList findPortVlanAssignments(id, include)

List Current VLAN assignments for a port

Show the port&#39;s current VLAN assignments, including if this VLAN is set as native, and the current state of the assignment (ex. &#39;assigned&#39; or &#39;unassigning&#39;)

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      PortVlanAssignmentList result = apiInstance.findPortVlanAssignments(id, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#findPortVlanAssignments");
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
| **id** | **UUID**| Port UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**PortVlanAssignmentList**](PortVlanAssignmentList.md)

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

<a id="unassignPort"></a>
# **unassignPort**
> Port unassignPort(id, portAssignInput, include)

Unassign a port

Unassign a port for a hardware.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Port UUID
    PortAssignInput portAssignInput = new PortAssignInput(); // PortAssignInput | Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: '1001').
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    try {
      Port result = apiInstance.unassignPort(id, portAssignInput, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#unassignPort");
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
| **id** | **UUID**| Port UUID | |
| **portAssignInput** | [**PortAssignInput**](PortAssignInput.md)| Virtual Network ID. May be the UUID of the Virtual Network record, or the VLAN value itself (ex: &#39;1001&#39;). | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |

### Return type

[**Port**](Port.md)

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

