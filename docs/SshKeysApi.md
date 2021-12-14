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
> SSHKey createProjectSSHKey(id, sshKey)

Create a ssh key for the given project

Creates a ssh key.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
UUID id = new UUID(); // UUID | Project UUID
SSHKeyCreateInput sshKey = new SSHKeyCreateInput(); // SSHKeyCreateInput | ssh key to create
try {
    SSHKey result = apiInstance.createProjectSSHKey(id, sshKey);
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
 **sshKey** | [**SSHKeyCreateInput**](SSHKeyCreateInput.md)| ssh key to create |

### Return type

[**SSHKey**](SSHKey.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSSHKey"></a>
# **createSSHKey**
> SSHKey createSSHKey(sshKey)

Create a ssh key for the current user

Creates a ssh key.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
SSHKeyCreateInput sshKey = new SSHKeyCreateInput(); // SSHKeyCreateInput | ssh key to create
try {
    SSHKey result = apiInstance.createSSHKey(sshKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeysApi#createSSHKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sshKey** | [**SSHKeyCreateInput**](SSHKeyCreateInput.md)| ssh key to create |

### Return type

[**SSHKey**](SSHKey.md)

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
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SshKeysApi;

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findDeviceSSHKeys"></a>
# **findDeviceSSHKeys**
> SSHKeyList findDeviceSSHKeys(id, searchString, include, exclude)

Retrieve a device&#39;s ssh keys

Returns a collection of the device&#39;s ssh keys.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SshKeysApi;

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
    SSHKeyList result = apiInstance.findDeviceSSHKeys(id, searchString, include, exclude);
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

[**SSHKeyList**](SSHKeyList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProjectSSHKeys"></a>
# **findProjectSSHKeys**
> SSHKeyList findProjectSSHKeys(id, searchString, include, exclude)

Retrieve a project&#39;s ssh keys

Returns a collection of the project&#39;s ssh keys.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SshKeysApi;

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
    SSHKeyList result = apiInstance.findProjectSSHKeys(id, searchString, include, exclude);
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

[**SSHKeyList**](SSHKeyList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSSHKeyById"></a>
# **findSSHKeyById**
> SSHKey findSSHKeyById(id, include, exclude)

Retrieve a ssh key

Returns a single ssh key if the user has access

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SshKeysApi;

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
    SSHKey result = apiInstance.findSSHKeyById(id, include, exclude);
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

[**SSHKey**](SSHKey.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSSHKeys"></a>
# **findSSHKeys**
> SSHKeyList findSSHKeys(searchString, include, exclude)

Retrieve all ssh keys

Returns a collection of the user’s ssh keys.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SshKeysApi;

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
    SSHKeyList result = apiInstance.findSSHKeys(searchString, include, exclude);
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

[**SSHKeyList**](SSHKeyList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSSHKey"></a>
# **updateSSHKey**
> SSHKey updateSSHKey(id, sshKey)

Update the ssh key

Updates the ssh key.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SshKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SshKeysApi apiInstance = new SshKeysApi();
UUID id = new UUID(); // UUID | SSH Key UUID
SSHKeyInput sshKey = new SSHKeyInput(); // SSHKeyInput | ssh key to update
try {
    SSHKey result = apiInstance.updateSSHKey(id, sshKey);
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
 **sshKey** | [**SSHKeyInput**](SSHKeyInput.md)| ssh key to update |

### Return type

[**SSHKey**](SSHKey.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

