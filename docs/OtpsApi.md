# OtpsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findEnsureOtp**](OtpsApi.md#findEnsureOtp) | **POST** /user/otp/verify/{otp} | Verify user by providing an OTP
[**findRecoveryCodes**](OtpsApi.md#findRecoveryCodes) | **GET** /user/otp/recovery-codes | Retrieve my recovery codes
[**receiveCodes**](OtpsApi.md#receiveCodes) | **POST** /user/otp/sms/receive | Receive an OTP per sms
[**regenerateCodes**](OtpsApi.md#regenerateCodes) | **POST** /user/otp/recovery-codes | Generate new recovery codes


<a name="findEnsureOtp"></a>
# **findEnsureOtp**
> findEnsureOtp(otp)

Verify user by providing an OTP

It verifies the user once a valid OTP is provided. It gives back a session token, essentially logging in the user.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.OtpsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OtpsApi apiInstance = new OtpsApi();
String otp = "otp_example"; // String | OTP
try {
    apiInstance.findEnsureOtp(otp);
} catch (ApiException e) {
    System.err.println("Exception when calling OtpsApi#findEnsureOtp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **otp** | **String**| OTP |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findRecoveryCodes"></a>
# **findRecoveryCodes**
> RecoveryCodeList findRecoveryCodes()

Retrieve my recovery codes

Returns my recovery codes.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.OtpsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OtpsApi apiInstance = new OtpsApi();
try {
    RecoveryCodeList result = apiInstance.findRecoveryCodes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtpsApi#findRecoveryCodes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RecoveryCodeList**](RecoveryCodeList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="receiveCodes"></a>
# **receiveCodes**
> receiveCodes()

Receive an OTP per sms

Sends an OTP to the user&#39;s mobile phone.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.OtpsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OtpsApi apiInstance = new OtpsApi();
try {
    apiInstance.receiveCodes();
} catch (ApiException e) {
    System.err.println("Exception when calling OtpsApi#receiveCodes");
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

<a name="regenerateCodes"></a>
# **regenerateCodes**
> RecoveryCodeList regenerateCodes()

Generate new recovery codes

Generate a new set of recovery codes.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.OtpsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OtpsApi apiInstance = new OtpsApi();
try {
    RecoveryCodeList result = apiInstance.regenerateCodes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtpsApi#regenerateCodes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RecoveryCodeList**](RecoveryCodeList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

