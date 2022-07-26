# BatchesApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeviceBatch**](BatchesApi.md#createDeviceBatch) | **POST** /projects/{id}/devices/batch | Create a devices batch |
| [**deleteBatch**](BatchesApi.md#deleteBatch) | **DELETE** /batches/{id} | Delete the Batch |
| [**findBatchById**](BatchesApi.md#findBatchById) | **GET** /batches/{id} | Retrieve a Batch |
| [**findBatchesByProject**](BatchesApi.md#findBatchesByProject) | **GET** /projects/{id}/batches | Retrieve all batches by project |


<a name="createDeviceBatch"></a>
# **createDeviceBatch**
> BatchesList createDeviceBatch(id, instancesBatchCreateInput)

Create a devices batch

Creates new devices in batch and provisions them in our datacenter.  Type-specific options (such as operating_system for baremetal devices) should be included in the main data structure alongside hostname and plan.  The features attribute allows you to optionally specify what features your server should have.  For example, if you require a server with a TPM chip, you may specify &#x60;{ \&quot;features\&quot;: { \&quot;tpm\&quot;: \&quot;required\&quot; } }&#x60; (or &#x60;{ \&quot;features\&quot;: [\&quot;tpm\&quot;] }&#x60; in shorthand).  The request will fail if there are no available servers matching your criteria. Alternatively, if you do not require a certain feature, but would prefer to be assigned a server with that feature if there are any available, you may specify that feature with a preferred value (see the example request below).  The request will not fail if we have no servers with that feature in our inventory.  The facilities attribute specifies in what datacenter you wish to create the device.  You can either specify a single facility &#x60;{ \&quot;facility\&quot;: \&quot;f1\&quot; }&#x60; , or you can instruct to create the device in the best available datacenter &#x60;{ \&quot;facility\&quot;: \&quot;any\&quot; }&#x60;. Additionally it is possible to set a prioritized location selection.  For example &#x60;{ \&quot;facility\&quot;: [\&quot;f3\&quot;, \&quot;f2\&quot;, \&quot;any\&quot;] }&#x60; will try to assign to the facility f3, if there are no available f2, and so on. If \&quot;any\&quot; is not specified for \&quot;facility\&quot;, the request will fail unless it can assign in the selected locations.  With &#x60;{ \&quot;facility\&quot;: \&quot;any\&quot; }&#x60; you have the option to diversify to indicate how many facilities you are willing to be spread across. For this purpose use parameter: &#x60;facility_diversity_level &#x3D; N&#x60;.  For example:  &#x60;{ \&quot;facilities\&quot;: [\&quot;sjc1\&quot;, \&quot;ewr1\&quot;, \&quot;any\&quot;] ,  \&quot;facility_diversity_level\&quot; &#x3D; 1, \&quot;quantity\&quot; &#x3D; 10 }&#x60; will assign 10 devices into the same facility, trying first in \&quot;sjc1\&quot;, and if there aren’t available, it will try in  \&quot;ewr1\&quot;, otherwise any other.  The &#x60;ip_addresses&#x60; attribute will allow you to specify the addresses you want created with your device.  To maintain backwards compatibility, If the attribute is not sent in the request, it will be treated as if &#x60;{ \&quot;ip_addresses\&quot;: [{ \&quot;address_family\&quot;: 4, \&quot;public\&quot;: true }, { \&quot;address_family\&quot;: 4, \&quot;public\&quot;: false }, { \&quot;address_family\&quot;: 6, \&quot;public\&quot;: true }] }&#x60; was sent.  The private IPv4 address is required and always need to be sent in the array. Not all operating systems support no public IPv4 address, so in those cases you will receive an error message.  For example, to only configure your server with a private IPv4 address, you can send &#x60;{ \&quot;ip_addresses\&quot;: [{ \&quot;address_family\&quot;: 4, \&quot;public\&quot;: false }] }&#x60;.  Note: when specifying a subnet size larger than a /30, you will need to supply the UUID(s) of existing ip_reservations in your project to assign IPs from.  For example, &#x60;{ \&quot;ip_addresses\&quot;: [..., {\&quot;address_family\&quot;: 4, \&quot;public\&quot;: true, \&quot;ip_reservations\&quot;: [\&quot;uuid1\&quot;, \&quot;uuid2\&quot;]}] }&#x60;  To access a server without public IPs, you can use our Out-of-Band console access (SOS) or use another server with public IPs as a proxy.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.BatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    BatchesApi apiInstance = new BatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    InstancesBatchCreateInput instancesBatchCreateInput = new InstancesBatchCreateInput(); // InstancesBatchCreateInput | Batches to create
    try {
      BatchesList result = apiInstance.createDeviceBatch(id, instancesBatchCreateInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#createDeviceBatch");
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
| **instancesBatchCreateInput** | [**InstancesBatchCreateInput**](InstancesBatchCreateInput.md)| Batches to create | |

### Return type

[**BatchesList**](BatchesList.md)

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

<a name="deleteBatch"></a>
# **deleteBatch**
> deleteBatch(id, removeAssociatedInstances)

Delete the Batch

Deletes the Batch.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.BatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    BatchesApi apiInstance = new BatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Batch UUID
    Boolean removeAssociatedInstances = false; // Boolean | Delete all instances created from this batch
    try {
      apiInstance.deleteBatch(id, removeAssociatedInstances);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#deleteBatch");
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
| **id** | **UUID**| Batch UUID | |
| **removeAssociatedInstances** | **Boolean**| Delete all instances created from this batch | [optional] [default to false] |

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
| **403** | forbidden |  -  |
| **404** | not found |  -  |

<a name="findBatchById"></a>
# **findBatchById**
> Batch findBatchById(id, include, exclude)

Retrieve a Batch

Returns a Batch

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.BatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    BatchesApi apiInstance = new BatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Batch UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      Batch result = apiInstance.findBatchById(id, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#findBatchById");
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
| **id** | **UUID**| Batch UUID | |
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**Batch**](Batch.md)

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

<a name="findBatchesByProject"></a>
# **findBatchesByProject**
> BatchesList findBatchesByProject(id, include, exclude)

Retrieve all batches by project

Returns all batches for the given project

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.BatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    BatchesApi apiInstance = new BatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Project UUID
    List<String> include = Arrays.asList(); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
    List<String> exclude = Arrays.asList(); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
    try {
      BatchesList result = apiInstance.findBatchesByProject(id, include, exclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#findBatchesByProject");
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
| **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional] |

### Return type

[**BatchesList**](BatchesList.md)

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

