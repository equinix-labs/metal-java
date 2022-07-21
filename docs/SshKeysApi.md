# SshKeysApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProjectSSHKey**](SshKeysApi.md#createProjectSSHKey) | **POST** /projects/{id}/ssh-keys | Create a ssh key for the given project
[**createSSHKey**](SshKeysApi.md#createSSHKey) | **POST** /ssh-keys | Create a ssh key for the current user
[**deleteSSHKey**](SshKeysApi.md#deleteSSHKey) | **DELETE** /ssh-keys/{id} | Delete the ssh key
[**findDeviceSSHKeys**](SshKeysApi.md#findDeviceSSHKeys) | **GET** /devices/{id}/ssh-keys | Retrieve a device&#39;s ssh keys
[**findProjectSSHKeys**](SshKeysApi.md#findProjectSSHKeys) | **GET** /projects/{id}/ssh-keys | Retrieve a project&#39;s ssh keys
[**findSSHKeyById**](SshKeysApi.md#findSSHKeyById) | **GET** /ssh-keys/{id} | Retrieve a ssh key
[**findSSHKeys**](SshKeysApi.md#findSSHKeys) | **GET** /ssh-keys | Retrieve all ssh keys
[**updateSSHKey**](SshKeysApi.md#updateSSHKey) | **PUT** /ssh-keys/{id} | Update the ssh key


<a name="createProjectSSHKey"></a>
# **createProjectSSHKey**
> InlineResponse20014SshKeys createProjectSSHKey(id, body)

Create a ssh key for the given project

Creates a ssh key.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
UUID id = new UUID(); // UUID | Project UUID
Body30 body = new Body30(); // Body30 | ssh key to create
try {
    InlineResponse20014SshKeys result = apiInstance.createProjectSSHKey(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeysApi#createProjectSSHKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **body** | [**Body30**](Body30.md)| ssh key to create |

### Return type

[**InlineResponse20014SshKeys**](InlineResponse20014SshKeys.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSSHKey"></a>
# **createSSHKey**
> InlineResponse20014SshKeys createSSHKey(body)

Create a ssh key for the current user

Creates a ssh key.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
Body37 body = new Body37(); // Body37 | ssh key to create
try {
    InlineResponse20014SshKeys result = apiInstance.createSSHKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeysApi#createSSHKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body37**](Body37.md)| ssh key to create |

### Return type

[**InlineResponse20014SshKeys**](InlineResponse20014SshKeys.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSSHKey"></a>
# **deleteSSHKey**
> deleteSSHKey(id)

Delete the ssh key

Deletes the ssh key.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
UUID id = new UUID(); // UUID | ssh key UUID
try {
    apiInstance.deleteSSHKey(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeysApi#deleteSSHKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| ssh key UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findDeviceSSHKeys"></a>
# **findDeviceSSHKeys**
> InlineResponse20014 findDeviceSSHKeys(id, searchString, include, exclude)

Retrieve a device&#39;s ssh keys

Returns a collection of the device&#39;s ssh keys.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
UUID id = new UUID(); // UUID | Project UUID
String searchString = "searchString_example"; // String | Search by key, label, or fingerprint
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20014 result = apiInstance.findDeviceSSHKeys(id, searchString, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeysApi#findDeviceSSHKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **searchString** | **String**| Search by key, label, or fingerprint | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findProjectSSHKeys"></a>
# **findProjectSSHKeys**
> InlineResponse20014 findProjectSSHKeys(id, searchString, include, exclude)

Retrieve a project&#39;s ssh keys

Returns a collection of the project&#39;s ssh keys.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
UUID id = new UUID(); // UUID | Project UUID
String searchString = "searchString_example"; // String | Search by key, label, or fingerprint
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20014 result = apiInstance.findProjectSSHKeys(id, searchString, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeysApi#findProjectSSHKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **searchString** | **String**| Search by key, label, or fingerprint | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findSSHKeyById"></a>
# **findSSHKeyById**
> InlineResponse20014SshKeys findSSHKeyById(id, include, exclude)

Retrieve a ssh key

Returns a single ssh key if the user has access

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
UUID id = new UUID(); // UUID | SSH Key UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20014SshKeys result = apiInstance.findSSHKeyById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeysApi#findSSHKeyById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| SSH Key UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20014SshKeys**](InlineResponse20014SshKeys.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findSSHKeys"></a>
# **findSSHKeys**
> InlineResponse20014 findSSHKeys(searchString, include, exclude)

Retrieve all ssh keys

Returns a collection of the user’s ssh keys.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
String searchString = "searchString_example"; // String | Search by key, label, or fingerprint
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20014 result = apiInstance.findSSHKeys(searchString, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeysApi#findSSHKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **String**| Search by key, label, or fingerprint | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSSHKey"></a>
# **updateSSHKey**
> InlineResponse20014SshKeys updateSSHKey(id, body)

Update the ssh key

Updates the ssh key.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
UUID id = new UUID(); // UUID | SSH Key UUID
Body38 body = new Body38(); // Body38 | ssh key to update
try {
    InlineResponse20014SshKeys result = apiInstance.updateSSHKey(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeysApi#updateSSHKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| SSH Key UUID |
 **body** | [**Body38**](Body38.md)| ssh key to update |

### Return type

[**InlineResponse20014SshKeys**](InlineResponse20014SshKeys.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

