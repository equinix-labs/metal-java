# BgpApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBgpSession**](BgpApi.md#createBgpSession) | **POST** /devices/{id}/bgp/sessions | Create a BGP session
[**deleteBgpSession**](BgpApi.md#deleteBgpSession) | **DELETE** /bgp/sessions/{id} | Delete the BGP session
[**findBgpConfigByProject**](BgpApi.md#findBgpConfigByProject) | **GET** /projects/{id}/bgp-config | Retrieve a bgp config
[**findBgpSessionById**](BgpApi.md#findBgpSessionById) | **GET** /bgp/sessions/{id} | Retrieve a BGP session
[**findBgpSessions**](BgpApi.md#findBgpSessions) | **GET** /devices/{id}/bgp/sessions | Retrieve all BGP sessions
[**findProjectBgpSessions**](BgpApi.md#findProjectBgpSessions) | **GET** /projects/{id}/bgp/sessions | Retrieve all BGP sessions for project
[**getBgpNeighborData**](BgpApi.md#getBgpNeighborData) | **GET** /devices/{id}/bgp/neighbors | Retrieve BGP neighbor data for this device
[**requestBgpConfig**](BgpApi.md#requestBgpConfig) | **POST** /projects/{id}/bgp-configs | Requesting bgp config
[**updateBgpSession**](BgpApi.md#updateBgpSession) | **PUT** /bgp/sessions/{id} | Update the BGP session


<a name="createBgpSession"></a>
# **createBgpSession**
> BgpSession createBgpSession(id, bgpSession)

Create a BGP session

Creates a BGP session.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | Device UUID
BGPSessionInput bgpSession = new BGPSessionInput(); // BGPSessionInput | BGP session to create
try {
    BgpSession result = apiInstance.createBgpSession(id, bgpSession);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#createBgpSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |
 **bgpSession** | [**BGPSessionInput**](BGPSessionInput.md)| BGP session to create |

### Return type

[**BgpSession**](BgpSession.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBgpSession"></a>
# **deleteBgpSession**
> deleteBgpSession(id)

Delete the BGP session

Deletes the BGP session.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.BgpApi;

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBgpConfigByProject"></a>
# **findBgpConfigByProject**
> BgpConfig findBgpConfigByProject(id, include, exclude)

Retrieve a bgp config

Returns a bgp config

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.BgpApi;

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
    BgpConfig result = apiInstance.findBgpConfigByProject(id, include, exclude);
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

[**BgpConfig**](BgpConfig.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBgpSessionById"></a>
# **findBgpSessionById**
> BgpSession findBgpSessionById(id, include, exclude)

Retrieve a BGP session

Returns a BGP session

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.BgpApi;

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
    BgpSession result = apiInstance.findBgpSessionById(id, include, exclude);
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

[**BgpSession**](BgpSession.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBgpSessions"></a>
# **findBgpSessions**
> BgpSessionList findBgpSessions(id)

Retrieve all BGP sessions

Provides a listing of available BGP sessions for the device.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | Device UUID
try {
    BgpSessionList result = apiInstance.findBgpSessions(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#findBgpSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |

### Return type

[**BgpSessionList**](BgpSessionList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProjectBgpSessions"></a>
# **findProjectBgpSessions**
> BgpSessionList findProjectBgpSessions(id)

Retrieve all BGP sessions for project

Provides a listing of available BGP sessions for the project.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | Project UUID
try {
    BgpSessionList result = apiInstance.findProjectBgpSessions(id);
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

[**BgpSessionList**](BgpSessionList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBgpNeighborData"></a>
# **getBgpNeighborData**
> BgpSessionNeighbors getBgpNeighborData(id)

Retrieve BGP neighbor data for this device

Provides a summary of the BGP neighbor data associated to the BGP sessions for this device.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | Device UUID
try {
    BgpSessionNeighbors result = apiInstance.getBgpNeighborData(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#getBgpNeighborData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Device UUID |

### Return type

[**BgpSessionNeighbors**](BgpSessionNeighbors.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestBgpConfig"></a>
# **requestBgpConfig**
> requestBgpConfig(id, bgpConfigRequest)

Requesting bgp config

Requests to enable bgp configuration for a project.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | Project UUID
BgpConfigRequestInput bgpConfigRequest = new BgpConfigRequestInput(); // BgpConfigRequestInput | BGP config Request to create
try {
    apiInstance.requestBgpConfig(id, bgpConfigRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#requestBgpConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Project UUID |
 **bgpConfigRequest** | [**BgpConfigRequestInput**](BgpConfigRequestInput.md)| BGP config Request to create |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBgpSession"></a>
# **updateBgpSession**
> updateBgpSession(id, defaultRoute)

Update the BGP session

Updates the BGP session by either enabling or disabling the default route functionality.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.BgpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

BgpApi apiInstance = new BgpApi();
UUID id = new UUID(); // UUID | BGP session UUID
Boolean defaultRoute = true; // Boolean | Default route
try {
    apiInstance.updateBgpSession(id, defaultRoute);
} catch (ApiException e) {
    System.err.println("Exception when calling BgpApi#updateBgpSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| BGP session UUID |
 **defaultRoute** | **Boolean**| Default route |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

