# OrganizationsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrganization**](OrganizationsApi.md#createOrganization) | **POST** /organizations | Create an organization
[**createOrganizationInvitation**](OrganizationsApi.md#createOrganizationInvitation) | **POST** /organizations/{id}/invitations | Create an invitation for an organization
[**createOrganizationProject**](OrganizationsApi.md#createOrganizationProject) | **POST** /organizations/{id}/projects | Create a project for the organization
[**createPaymentMethod**](OrganizationsApi.md#createPaymentMethod) | **POST** /organizations/{id}/payment-methods | Create a payment method for the given organization
[**deleteOrganization**](OrganizationsApi.md#deleteOrganization) | **DELETE** /organizations/{id} | Delete the organization
[**findOperatingSystemsByOrganization**](OrganizationsApi.md#findOperatingSystemsByOrganization) | **GET** /organizations/{id}/operating-systems | Retrieve all operating systems visible by the organization
[**findOrganizationById**](OrganizationsApi.md#findOrganizationById) | **GET** /organizations/{id} | Retrieve an organization&#39;s details
[**findOrganizationCustomdata**](OrganizationsApi.md#findOrganizationCustomdata) | **GET** /organizations/{id}/customdata | Retrieve the custom metadata of an organization
[**findOrganizationInvitations**](OrganizationsApi.md#findOrganizationInvitations) | **GET** /organizations/{id}/invitations | Retrieve organization invitations
[**findOrganizationPaymentMethods**](OrganizationsApi.md#findOrganizationPaymentMethods) | **GET** /organizations/{id}/payment-methods | Retrieve all payment methods of an organization
[**findOrganizationProjects**](OrganizationsApi.md#findOrganizationProjects) | **GET** /organizations/{id}/projects | Retrieve all projects of an organization
[**findOrganizationTransfers**](OrganizationsApi.md#findOrganizationTransfers) | **GET** /organizations/{id}/transfers | Retrieve all project transfer requests from or to an organization
[**findOrganizations**](OrganizationsApi.md#findOrganizations) | **GET** /organizations | Retrieve all organizations
[**findPlansByOrganization**](OrganizationsApi.md#findPlansByOrganization) | **GET** /organizations/{id}/plans | Retrieve all plans visible by the organization
[**updateOrganization**](OrganizationsApi.md#updateOrganization) | **PUT** /organizations/{id} | Update the organization


<a name="createOrganization"></a>
# **createOrganization**
> InlineResponse20026Organizations createOrganization(body)

Create an organization

Creates an organization.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
Body11 body = new Body11(); // Body11 | Organization to create
try {
    InlineResponse20026Organizations result = apiInstance.createOrganization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#createOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body11**](Body11.md)| Organization to create |

### Return type

[**InlineResponse20026Organizations**](InlineResponse20026Organizations.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrganizationInvitation"></a>
# **createOrganizationInvitation**
> InlineResponse20018 createOrganizationInvitation(id, body)

Create an invitation for an organization

In order to add a user to an organization, they must first be invited. To invite to several projects the parameter &#x60;projects_ids:[a,b,c]&#x60; can be used

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
Body13 body = new Body13(); // Body13 | Invitation to create
try {
    InlineResponse20018 result = apiInstance.createOrganizationInvitation(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#createOrganizationInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **body** | [**Body13**](Body13.md)| Invitation to create |

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrganizationProject"></a>
# **createOrganizationProject**
> InlineResponse2011Project createOrganizationProject(id, body)

Create a project for the organization

Creates a new project for the organization

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
Body15 body = new Body15(); // Body15 | Project to create
try {
    InlineResponse2011Project result = apiInstance.createOrganizationProject(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#createOrganizationProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **body** | [**Body15**](Body15.md)| Project to create |

### Return type

[**InlineResponse2011Project**](InlineResponse2011Project.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPaymentMethod"></a>
# **createPaymentMethod**
> InlineResponse20028PaymentMethods createPaymentMethod(id, body)

Create a payment method for the given organization

Creates a payment method.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
Body14 body = new Body14(); // Body14 | Payment Method to create
try {
    InlineResponse20028PaymentMethods result = apiInstance.createPaymentMethod(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#createPaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **body** | [**Body14**](Body14.md)| Payment Method to create |

### Return type

[**InlineResponse20028PaymentMethods**](InlineResponse20028PaymentMethods.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrganization"></a>
# **deleteOrganization**
> deleteOrganization(id)

Delete the organization

Deletes the organization.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
try {
    apiInstance.deleteOrganization(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#deleteOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOperatingSystemsByOrganization"></a>
# **findOperatingSystemsByOrganization**
> InlineResponse20025 findOperatingSystemsByOrganization(id, include, exclude)

Retrieve all operating systems visible by the organization

Returns a listing of available operating systems for the given organization

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20025 result = apiInstance.findOperatingSystemsByOrganization(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOperatingSystemsByOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrganizationById"></a>
# **findOrganizationById**
> InlineResponse20026Organizations findOrganizationById(id, include, exclude)

Retrieve an organization&#39;s details

Returns a single organization&#39;s details, if the user is authorized to view it.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20026Organizations result = apiInstance.findOrganizationById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20026Organizations**](InlineResponse20026Organizations.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrganizationCustomdata"></a>
# **findOrganizationCustomdata**
> findOrganizationCustomdata(id)

Retrieve the custom metadata of an organization

Provides the custom metadata stored for this organization in json format

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
try {
    apiInstance.findOrganizationCustomdata(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizationCustomdata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrganizationInvitations"></a>
# **findOrganizationInvitations**
> InlineResponse20017 findOrganizationInvitations(id, include, exclude, page, perPage)

Retrieve organization invitations

Returns all invitations in an organization.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    InlineResponse20017 result = apiInstance.findOrganizationInvitations(id, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizationInvitations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrganizationPaymentMethods"></a>
# **findOrganizationPaymentMethods**
> InlineResponse20028 findOrganizationPaymentMethods(id, include, exclude, page, perPage)

Retrieve all payment methods of an organization

Returns all payment methods of an organization.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    InlineResponse20028 result = apiInstance.findOrganizationPaymentMethods(id, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizationPaymentMethods");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrganizationProjects"></a>
# **findOrganizationProjects**
> InlineResponse20030 findOrganizationProjects(id, include, exclude, page, perPage)

Retrieve all projects of an organization

Returns a collection of projects that belong to the organization.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    InlineResponse20030 result = apiInstance.findOrganizationProjects(id, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizationProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrganizationTransfers"></a>
# **findOrganizationTransfers**
> InlineResponse20031 findOrganizationTransfers(id, include, exclude)

Retrieve all project transfer requests from or to an organization

Provides a collection of project transfer requests from or to the organization.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20031 result = apiInstance.findOrganizationTransfers(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizationTransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrganizations"></a>
# **findOrganizations**
> InlineResponse20026 findOrganizations(personal, withoutProjects, include, exclude, page, perPage)

Retrieve all organizations

Returns a list of organizations that are accessible to the current user.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String personal = "personal_example"; // String | Include, exclude or show only personal organizations.
String withoutProjects = "withoutProjects_example"; // String | Include, exclude or show only organizations that have no projects.
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
Integer page = 1; // Integer | Page to return
Integer perPage = 10; // Integer | Items returned per page
try {
    InlineResponse20026 result = apiInstance.findOrganizations(personal, withoutProjects, include, exclude, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personal** | **String**| Include, exclude or show only personal organizations. | [optional] [enum: include, exclude, only]
 **withoutProjects** | **String**| Include, exclude or show only organizations that have no projects. | [optional] [enum: include, exclude, only]
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]
 **page** | **Integer**| Page to return | [optional] [default to 1]
 **perPage** | **Integer**| Items returned per page | [optional] [default to 10]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPlansByOrganization"></a>
# **findPlansByOrganization**
> InlineResponse20029 findPlansByOrganization(id, include, exclude)

Retrieve all plans visible by the organization

Returns a listing of available plans for the given organization

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    InlineResponse20029 result = apiInstance.findPlansByOrganization(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findPlansByOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrganization"></a>
# **updateOrganization**
> InlineResponse20026Organizations updateOrganization(id, body)

Update the organization

Updates the organization.

### Example
```java
// Import classes:
//import com.equinix.openapi.metal.v1.ApiClient;
//import com.equinix.openapi.metal.v1.ApiException;
//import com.equinix.openapi.metal.v1.Configuration;
//import com.equinix.openapi.metal.v1.auth.*;
//import com.equinix.openapi.metal.v1.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
UUID id = new UUID(); // UUID | Organization UUID
Body12 body = new Body12(); // Body12 | Organization to update
try {
    InlineResponse20026Organizations result = apiInstance.updateOrganization(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#updateOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **body** | [**Body12**](Body12.md)| Organization to update |

### Return type

[**InlineResponse20026Organizations**](InlineResponse20026Organizations.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

