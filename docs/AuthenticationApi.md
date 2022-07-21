# AuthenticationApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAPIKey**](AuthenticationApi.md#createAPIKey) | **POST** /user/api-keys | Create a API key
[**createProjectAPIKey**](AuthenticationApi.md#createProjectAPIKey) | **POST** /projects/{id}/api-keys | Create an API key for a project.
[**deleteAPIKey**](AuthenticationApi.md#deleteAPIKey) | **DELETE** /api-keys/{id} | Delete the API key
[**deleteUserAPIKey**](AuthenticationApi.md#deleteUserAPIKey) | **DELETE** /user/api-keys/{id} | Delete the API key
[**findAPIKeys**](AuthenticationApi.md#findAPIKeys) | **GET** /user/api-keys | Retrieve all user API keys
[**findProjectAPIKeys**](AuthenticationApi.md#findProjectAPIKeys) | **GET** /projects/{id}/api-keys | Retrieve all API keys for the project.


<a name="createAPIKey"></a>
# **createAPIKey**
> InlineResponse20036ApiKeys createAPIKey(body)

Create a API key

Creates a API key for the current user.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
Body41 body = new Body41(); // Body41 | API key to create
try {
    InlineResponse20036ApiKeys result = apiInstance.createAPIKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#createAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body41**](Body41.md)| API key to create |

### Return type

[**InlineResponse20036ApiKeys**](InlineResponse20036ApiKeys.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProjectAPIKey"></a>
# **createProjectAPIKey**
> InlineResponse20036ApiKeys createProjectAPIKey(id, body)

Create an API key for a project.

Creates an API key for a project.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
UUID id = new UUID(); // UUID | Project UUID
Body25 body = new Body25(); // Body25 | API Key to create
try {
    InlineResponse20036ApiKeys result = apiInstance.createProjectAPIKey(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#createProjectAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **body** | [**Body25**](Body25.md)| API Key to create |

### Return type

[**InlineResponse20036ApiKeys**](InlineResponse20036ApiKeys.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAPIKey"></a>
# **deleteAPIKey**
> deleteAPIKey(id)

Delete the API key

Deletes the API key.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
UUID id = new UUID(); // UUID | API Key UUID
try {
    apiInstance.deleteAPIKey(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#deleteAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| API Key UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserAPIKey"></a>
# **deleteUserAPIKey**
> deleteUserAPIKey(id)

Delete the API key

Deletes the current user API key.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
UUID id = new UUID(); // UUID | API Key UUID
try {
    apiInstance.deleteUserAPIKey(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#deleteUserAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| API Key UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findAPIKeys"></a>
# **findAPIKeys**
> InlineResponse20036 findAPIKeys(include, exclude)

Retrieve all user API keys

Returns all API keys for the current user.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20036 result = apiInstance.findAPIKeys(include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#findAPIKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findProjectAPIKeys"></a>
# **findProjectAPIKeys**
> InlineResponse20036 findProjectAPIKeys(id, include, exclude)

Retrieve all API keys for the project.

Returns all API keys for a specific project.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
UUID id = new UUID(); // UUID | Project UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20036 result = apiInstance.findProjectAPIKeys(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#findProjectAPIKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

