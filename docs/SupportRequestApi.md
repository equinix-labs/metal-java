# SupportRequestApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestSuppert**](SupportRequestApi.md#requestSuppert) | **POST** /support-requests | Create a support ticket


<a name="requestSuppert"></a>
# **requestSuppert**
> requestSuppert(supportRequest)

Create a support ticket

Support Ticket.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.SupportRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

SupportRequestApi apiInstance = new SupportRequestApi();
SupportRequestInput supportRequest = new SupportRequestInput(); // SupportRequestInput | Support Request to create
try {
    apiInstance.requestSuppert(supportRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportRequestApi#requestSuppert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportRequest** | [**SupportRequestInput**](SupportRequestInput.md)| Support Request to create |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

