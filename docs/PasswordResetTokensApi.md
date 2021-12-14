# PasswordResetTokensApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPasswordResetToken**](PasswordResetTokensApi.md#createPasswordResetToken) | **POST** /reset-password | Create a password reset token
[**resetPassword**](PasswordResetTokensApi.md#resetPassword) | **DELETE** /reset-password | Reset current user password


<a name="createPasswordResetToken"></a>
# **createPasswordResetToken**
> createPasswordResetToken(email)

Create a password reset token

Creates a password reset token

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.PasswordResetTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PasswordResetTokensApi apiInstance = new PasswordResetTokensApi();
String email = "email_example"; // String | Email of user to create password reset token
try {
    apiInstance.createPasswordResetToken(email);
} catch (ApiException e) {
    System.err.println("Exception when calling PasswordResetTokensApi#createPasswordResetToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Email of user to create password reset token |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetPassword"></a>
# **resetPassword**
> NewPassword resetPassword()

Reset current user password

Resets current user password.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.PasswordResetTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PasswordResetTokensApi apiInstance = new PasswordResetTokensApi();
try {
    NewPassword result = apiInstance.resetPassword();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PasswordResetTokensApi#resetPassword");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NewPassword**](NewPassword.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

