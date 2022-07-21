# PaymentMethodsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePaymentMethod**](PaymentMethodsApi.md#deletePaymentMethod) | **DELETE** /payment-methods/{id} | Delete the payment method
[**findPaymentMethodById**](PaymentMethodsApi.md#findPaymentMethodById) | **GET** /payment-methods/{id} | Retrieve a payment method
[**updatePaymentMethod**](PaymentMethodsApi.md#updatePaymentMethod) | **PUT** /payment-methods/{id} | Update the payment method


<a name="deletePaymentMethod"></a>
# **deletePaymentMethod**
> deletePaymentMethod(id)

Delete the payment method

Deletes the payment method.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.PaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PaymentMethodsApi apiInstance = new PaymentMethodsApi();
UUID id = new UUID(); // UUID | Payment Method UUID
try {
    apiInstance.deletePaymentMethod(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#deletePaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Payment Method UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPaymentMethodById"></a>
# **findPaymentMethodById**
> InlineResponse20028PaymentMethods findPaymentMethodById(id, include, exclude)

Retrieve a payment method

Returns a payment method

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.PaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PaymentMethodsApi apiInstance = new PaymentMethodsApi();
UUID id = new UUID(); // UUID | Payment Method UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20028PaymentMethods result = apiInstance.findPaymentMethodById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#findPaymentMethodById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Payment Method UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20028PaymentMethods**](InlineResponse20028PaymentMethods.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePaymentMethod"></a>
# **updatePaymentMethod**
> InlineResponse20028PaymentMethods updatePaymentMethod(id, body)

Update the payment method

Updates the payment method.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.PaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

PaymentMethodsApi apiInstance = new PaymentMethodsApi();
UUID id = new UUID(); // UUID | Payment Method UUID
Body17 body = new Body17(); // Body17 | Payment Method to update
try {
    InlineResponse20028PaymentMethods result = apiInstance.updatePaymentMethod(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#updatePaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Payment Method UUID |
 **body** | [**Body17**](Body17.md)| Payment Method to update |

### Return type

[**InlineResponse20028PaymentMethods**](InlineResponse20028PaymentMethods.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

