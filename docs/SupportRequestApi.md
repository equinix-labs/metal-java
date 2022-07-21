# SupportRequestApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestSuppert**](SupportRequestApi.md#requestSuppert) | **POST** /support-requests | Create a support ticket


<a name="requestSuppert"></a>
# **requestSuppert**
> requestSuppert(body)

Create a support ticket

Support Ticket.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.SupportRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SupportRequestApi apiInstance = new SupportRequestApi();
Body39 body = new Body39(); // Body39 | Support Request to create
try {
    apiInstance.requestSuppert(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportRequestApi#requestSuppert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body39**](Body39.md)| Support Request to create |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

