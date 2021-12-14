# UserdataApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validateUserdata**](UserdataApi.md#validateUserdata) | **POST** /userdata/validate | Validate user data


<a name="validateUserdata"></a>
# **validateUserdata**
> validateUserdata(userdata)

Validate user data

Validates user data (Userdata)

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.UserdataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

UserdataApi apiInstance = new UserdataApi();
String userdata = "userdata_example"; // String | Userdata to validate
try {
    apiInstance.validateUserdata(userdata);
} catch (ApiException e) {
    System.err.println("Exception when calling UserdataApi#validateUserdata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userdata** | **String**| Userdata to validate | [optional]

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

