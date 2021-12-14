# MarketApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findMetroSpotMarketPrices**](MarketApi.md#findMetroSpotMarketPrices) | **GET** /market/spot/prices/metros | Get current spot market prices for metros
[**findSpotMarketPrices**](MarketApi.md#findSpotMarketPrices) | **GET** /market/spot/prices | Get current spot market prices
[**findSpotMarketPricesHistory**](MarketApi.md#findSpotMarketPricesHistory) | **GET** /market/spot/prices/history | Get spot market prices for a given period of time


<a name="findMetroSpotMarketPrices"></a>
# **findMetroSpotMarketPrices**
> SpotMarketPricesPerMetroList findMetroSpotMarketPrices(metro, plan)

Get current spot market prices for metros

Get Equinix Metal current spot market prices for all metros.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.MarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MarketApi apiInstance = new MarketApi();
String metro = "metro_example"; // String | Metro to filter spot market prices
String plan = "plan_example"; // String | Plan to filter spot market prices
try {
    SpotMarketPricesPerMetroList result = apiInstance.findMetroSpotMarketPrices(metro, plan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#findMetroSpotMarketPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metro** | **String**| Metro to filter spot market prices | [optional]
 **plan** | **String**| Plan to filter spot market prices | [optional]

### Return type

[**SpotMarketPricesPerMetroList**](SpotMarketPricesPerMetroList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSpotMarketPrices"></a>
# **findSpotMarketPrices**
> SpotMarketPricesList findSpotMarketPrices(facility, plan)

Get current spot market prices

Get Equinix Metal current spot market prices.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.MarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MarketApi apiInstance = new MarketApi();
String facility = "facility_example"; // String | Facility to check spot market prices
String plan = "plan_example"; // String | Plan to check spot market prices
try {
    SpotMarketPricesList result = apiInstance.findSpotMarketPrices(facility, plan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#findSpotMarketPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facility** | **String**| Facility to check spot market prices | [optional]
 **plan** | **String**| Plan to check spot market prices | [optional]

### Return type

[**SpotMarketPricesList**](SpotMarketPricesList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSpotMarketPricesHistory"></a>
# **findSpotMarketPricesHistory**
> SpotPricesHistoryReport findSpotMarketPricesHistory(facility, plan, from, until, metro)

Get spot market prices for a given period of time

Get spot market prices for a given plan and facility in a fixed period of time  *Note: In the &#x60;200&#x60; response, the property &#x60;datapoints&#x60; contains arrays of &#x60;[float, integer]&#x60;.*

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.MarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

MarketApi apiInstance = new MarketApi();
String facility = "facility_example"; // String | Facility to check spot market prices
String plan = "plan_example"; // String | Plan to check spot market prices
String from = "from_example"; // String | Timestamp from range
String until = "until_example"; // String | Timestamp to range
String metro = "metro_example"; // String | Metro to check spot market price history
try {
    SpotPricesHistoryReport result = apiInstance.findSpotMarketPricesHistory(facility, plan, from, until, metro);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#findSpotMarketPricesHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facility** | **String**| Facility to check spot market prices |
 **plan** | **String**| Plan to check spot market prices |
 **from** | **String**| Timestamp from range |
 **until** | **String**| Timestamp to range |
 **metro** | **String**| Metro to check spot market price history | [optional]

### Return type

[**SpotPricesHistoryReport**](SpotPricesHistoryReport.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

