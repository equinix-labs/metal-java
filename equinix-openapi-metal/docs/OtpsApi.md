# OtpsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findEnsureOtp**](OtpsApi.md#findEnsureOtp) | **POST** /user/otp/verify/{otp} | Verify user by providing an OTP |
| [**findRecoveryCodes**](OtpsApi.md#findRecoveryCodes) | **GET** /user/otp/recovery-codes | Retrieve my recovery codes |
| [**receiveCodes**](OtpsApi.md#receiveCodes) | **POST** /user/otp/sms/receive | Receive an OTP per sms |
| [**regenerateCodes**](OtpsApi.md#regenerateCodes) | **POST** /user/otp/recovery-codes | Generate new recovery codes |


<a id="findEnsureOtp"></a>
# **findEnsureOtp**
> findEnsureOtp(otp)

Verify user by providing an OTP

It verifies the user once a valid OTP is provided. It gives back a session token, essentially logging in the user.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.OtpsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    OtpsApi apiInstance = new OtpsApi(defaultClient);
    String otp = "otp_example"; // String | OTP
    try {
      apiInstance.findEnsureOtp(otp);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpsApi#findEnsureOtp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otp** | **String**| OTP | |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |
| **400** | bad request |  -  |
| **401** | unauthorized |  -  |

<a id="findRecoveryCodes"></a>
# **findRecoveryCodes**
> RecoveryCodeList findRecoveryCodes()

Retrieve my recovery codes

Returns my recovery codes.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.OtpsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    OtpsApi apiInstance = new OtpsApi(defaultClient);
    try {
      RecoveryCodeList result = apiInstance.findRecoveryCodes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpsApi#findRecoveryCodes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RecoveryCodeList**](RecoveryCodeList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

<a id="receiveCodes"></a>
# **receiveCodes**
> receiveCodes()

Receive an OTP per sms

Sends an OTP to the user&#39;s mobile phone.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.OtpsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    OtpsApi apiInstance = new OtpsApi(defaultClient);
    try {
      apiInstance.receiveCodes();
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpsApi#receiveCodes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |
| **400** | bad request |  -  |
| **401** | unauthorized |  -  |
| **422** | unprocessable entity |  -  |
| **500** | internal server error |  -  |

<a id="regenerateCodes"></a>
# **regenerateCodes**
> RecoveryCodeList regenerateCodes()

Generate new recovery codes

Generate a new set of recovery codes.

### Example
```java
// Import classes:
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.*;
import com.equinix.openapi.models.*;
import com.equinix.openapi.metal.v1.api.OtpsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com/metal/v1");
    
    // Configure API key authorization: x_auth_token
    ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
    x_auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x_auth_token.setApiKeyPrefix("Token");

    OtpsApi apiInstance = new OtpsApi(defaultClient);
    try {
      RecoveryCodeList result = apiInstance.regenerateCodes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpsApi#regenerateCodes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RecoveryCodeList**](RecoveryCodeList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **401** | unauthorized |  -  |
| **404** | not found |  -  |
| **422** | unprocessable entity |  -  |

