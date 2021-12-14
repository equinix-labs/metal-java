# UserVerificationTokensApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consumeVerificationRequest**](UserVerificationTokensApi.md#consumeVerificationRequest) | **PUT** /verify-email | Verify a user using an email verification token
[**createValidationRequest**](UserVerificationTokensApi.md#createValidationRequest) | **POST** /verify-email | Create an email verification request


<a name="consumeVerificationRequest"></a>
# **consumeVerificationRequest**
> consumeVerificationRequest(token)

Verify a user using an email verification token

Consumes an email verification token and verifies the user associated with it.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.UserVerificationTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

UserVerificationTokensApi apiInstance = new UserVerificationTokensApi();
String token = "token_example"; // String | User verification token
try {
    apiInstance.consumeVerificationRequest(token);
} catch (ApiException e) {
    System.err.println("Exception when calling UserVerificationTokensApi#consumeVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User verification token |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createValidationRequest"></a>
# **createValidationRequest**
> createValidationRequest(login)

Create an email verification request

Creates an email verification request

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.UserVerificationTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

UserVerificationTokensApi apiInstance = new UserVerificationTokensApi();
String login = "login_example"; // String | Email for verification request
try {
    apiInstance.createValidationRequest(login);
} catch (ApiException e) {
    System.err.println("Exception when calling UserVerificationTokensApi#createValidationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**| Email for verification request |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

