# TwoFactorAuthApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableTfaApp**](TwoFactorAuthApi.md#disableTfaApp) | **DELETE** /user/otp/app | Disable two factor authentication
[**disableTfaSms**](TwoFactorAuthApi.md#disableTfaSms) | **DELETE** /user/otp/sms | Disable two factor authentication
[**enableTfaApp**](TwoFactorAuthApi.md#enableTfaApp) | **POST** /user/otp/app | Enable two factor auth using app
[**enableTfaSms**](TwoFactorAuthApi.md#enableTfaSms) | **POST** /user/otp/sms | Enable two factor auth using sms


<a name="disableTfaApp"></a>
# **disableTfaApp**
> disableTfaApp()

Disable two factor authentication

Disables two factor authentication.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.TwoFactorAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

TwoFactorAuthApi apiInstance = new TwoFactorAuthApi();
try {
    apiInstance.disableTfaApp();
} catch (ApiException e) {
    System.err.println("Exception when calling TwoFactorAuthApi#disableTfaApp");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableTfaSms"></a>
# **disableTfaSms**
> disableTfaSms()

Disable two factor authentication

Disables two factor authentication.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.TwoFactorAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

TwoFactorAuthApi apiInstance = new TwoFactorAuthApi();
try {
    apiInstance.disableTfaSms();
} catch (ApiException e) {
    System.err.println("Exception when calling TwoFactorAuthApi#disableTfaSms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableTfaApp"></a>
# **enableTfaApp**
> enableTfaApp()

Enable two factor auth using app

Enables two factor authentication using authenticator app.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.TwoFactorAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

TwoFactorAuthApi apiInstance = new TwoFactorAuthApi();
try {
    apiInstance.enableTfaApp();
} catch (ApiException e) {
    System.err.println("Exception when calling TwoFactorAuthApi#enableTfaApp");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableTfaSms"></a>
# **enableTfaSms**
> enableTfaSms()

Enable two factor auth using sms

Enables two factor authentication with sms.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.TwoFactorAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

TwoFactorAuthApi apiInstance = new TwoFactorAuthApi();
try {
    apiInstance.enableTfaSms();
} catch (ApiException e) {
    System.err.println("Exception when calling TwoFactorAuthApi#enableTfaSms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

