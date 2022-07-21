# BgpApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBgpSession**](BgpApi.md#deleteBgpSession) | **DELETE** /bgp/sessions/{id} | Delete the BGP session
[**findBgpConfigByProject**](BgpApi.md#findBgpConfigByProject) | **GET** /projects/{id}/bgp-config | Retrieve a bgp config
[**findBgpSessionById**](BgpApi.md#findBgpSessionById) | **GET** /bgp/sessions/{id} | Retrieve a BGP session
[**findGlobalBgpRanges**](BgpApi.md#findGlobalBgpRanges) | **GET** /projects/{id}/global-bgp-ranges | Retrieve all global bgp ranges
[**findProjectBgpSessions**](BgpApi.md#findProjectBgpSessions) | **GET** /projects/{id}/bgp/sessions | Retrieve all BGP sessions for project
[**requestBgpConfig**](BgpApi.md#requestBgpConfig) | **POST** /projects/{id}/bgp-configs | Requesting bgp config
[**updateBgpSession**](BgpApi.md#updateBgpSession) | **PUT** /bgp/sessions/{id} | Update the BGP session


<a name="deleteBgpSession"></a>
# **deleteBgpSession**
> deleteBgpSession(id)

Delete the BGP session

Deletes the BGP session.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | BGP session UUID
try {
    apiInstance.deleteBgpSession(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#deleteBgpSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| BGP session UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findBgpConfigByProject"></a>
# **findBgpConfigByProject**
> InlineResponse20038 findBgpConfigByProject(id, include, exclude)

Retrieve a bgp config

Returns a bgp config

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | Project UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20038 result = apiInstance.findBgpConfigByProject(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#findBgpConfigByProject");
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

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findBgpSessionById"></a>
# **findBgpSessionById**
> InlineResponse2001 findBgpSessionById(id, include, exclude)

Retrieve a BGP session

Returns a BGP session

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | BGP session UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse2001 result = apiInstance.findBgpSessionById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#findBgpSessionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| BGP session UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findGlobalBgpRanges"></a>
# **findGlobalBgpRanges**
> InlineResponse20039 findGlobalBgpRanges(id)

Retrieve all global bgp ranges

Returns all global bgp ranges for a project

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | Project UUID
try {
    InlineResponse20039 result = apiInstance.findGlobalBgpRanges(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#findGlobalBgpRanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findProjectBgpSessions"></a>
# **findProjectBgpSessions**
> InlineResponse20011 findProjectBgpSessions(id)

Retrieve all BGP sessions for project

Provides a listing of available BGP sessions for the project.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | Project UUID
try {
    InlineResponse20011 result = apiInstance.findProjectBgpSessions(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#findProjectBgpSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestBgpConfig"></a>
# **requestBgpConfig**
> requestBgpConfig(id, body)

Requesting bgp config

Requests to enable bgp configuration for a project.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | Project UUID
Body26 body = new Body26(); // Body26 | BGP config Request to create
try {
    apiInstance.requestBgpConfig(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#requestBgpConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **body** | [**Body26**](Body26.md)| BGP config Request to create |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBgpSession"></a>
# **updateBgpSession**
> updateBgpSession(id, body)

Update the BGP session

Updates the BGP session by either enabling or disabling the default route functionality.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | BGP session UUID
Boolean body = true; // Boolean | Default route
try {
    apiInstance.updateBgpSession(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#updateBgpSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| BGP session UUID |
 **body** | **Boolean**| Default route |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

