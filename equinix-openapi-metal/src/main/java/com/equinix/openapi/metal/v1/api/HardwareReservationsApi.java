/*
 * Metal API
 * # Introduction Equinix Metal provides a RESTful HTTP API which can be reached at <https://api.equinix.com/metal/v1>. This document describes the API and how to use it.  The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account. Every feature of the Equinix Metal web interface is accessible through the API.  The API docs are generated from the Equinix Metal OpenAPI specification and are officially hosted at <https://metal.equinix.com/developers/api>.  # Common Parameters  The Equinix Metal API uses a few methods to minimize network traffic and improve throughput. These parameters are not used in all API calls, but are used often enough to warrant their own section. Look for these parameters in the documentation for the API calls that support them.  ## Pagination  Pagination is used to limit the number of results returned in a single request. The API will return a maximum of 100 results per page. To retrieve additional results, you can use the `page` and `per_page` query parameters.  The `page` parameter is used to specify the page number. The first page is `1`. The `per_page` parameter is used to specify the number of results per page. The maximum number of results differs by resource type.  ## Sorting  Where offered, the API allows you to sort results by a specific field. To sort results use the `sort_by` query parameter with the root level field name as the value. The `sort_direction` parameter is used to specify the sort direction, either either `asc` (ascending) or `desc` (descending).  ## Filtering  Filtering is used to limit the results returned in a single request. The API supports filtering by certain fields in the response. To filter results, you can use the field as a query parameter.  For example, to filter the IP list to only return public IPv4 addresses, you can filter by the `type` field, as in the following request:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/projects/id/ips?type=public_ipv4 ```  Only IP addresses with the `type` field set to `public_ipv4` will be returned.  ## Searching  Searching is used to find matching resources using multiple field comparissons. The API supports searching in resources that define this behavior. The fields available for search differ by resource, as does the search strategy.  To search resources you can use the `search` query parameter.  ## Include and Exclude  For resources that contain references to other resources, sucha as a Device that refers to the Project it resides in, the Equinix Metal API will returns `href` values (API links) to the associated resource.  ```json {   ...   \"project\": {     \"href\": \"/metal/v1/projects/f3f131c8-f302-49ef-8c44-9405022dc6dd\"   } } ```  If you're going need the project details, you can avoid a second API request.  Specify the contained `href` resources and collections that you'd like to have included in the response using the `include` query parameter.  For example:    ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=projects ```  The `include` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests where `href` resources are presented.  To have multiple resources include, use a comma-separated list (e.g. `?include=emails,projects,memberships`).  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=emails,projects,memberships ```  You may also include nested associations up to three levels deep using dot notation (`?include=memberships.projects`):  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=memberships.projects ```  To exclude resources, and optimize response delivery, use the `exclude` query parameter. The `exclude` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests for fields with nested object responses. When excluded, these fields will be replaced with an object that contains only an `href` field. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.api;

import com.equinix.openapi.ApiCallback;
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.ApiResponse;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.Pair;
import com.equinix.openapi.ProgressRequestBody;
import com.equinix.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.equinix.openapi.metal.v1.model.Error;
import com.equinix.openapi.metal.v1.model.HardwareReservation;
import com.equinix.openapi.metal.v1.model.HardwareReservationList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class HardwareReservationsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public HardwareReservationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HardwareReservationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for findHardwareReservationById
     * @param id HardwareReservation UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findHardwareReservationByIdCall(UUID id, List<String> include, List<String> exclude, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/hardware-reservations/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (include != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "include", include));
        }

        if (exclude != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "exclude", exclude));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findHardwareReservationByIdValidateBeforeCall(UUID id, List<String> include, List<String> exclude, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling findHardwareReservationById(Async)");
        }

        return findHardwareReservationByIdCall(id, include, exclude, _callback);

    }

    /**
     * Retrieve a hardware reservation
     * Returns a single hardware reservation
     * @param id HardwareReservation UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @return HardwareReservation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public HardwareReservation findHardwareReservationById(UUID id, List<String> include, List<String> exclude) throws ApiException {
        ApiResponse<HardwareReservation> localVarResp = findHardwareReservationByIdWithHttpInfo(id, include, exclude);
        return localVarResp.getData();
    }

    /**
     * Retrieve a hardware reservation
     * Returns a single hardware reservation
     * @param id HardwareReservation UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @return ApiResponse&lt;HardwareReservation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HardwareReservation> findHardwareReservationByIdWithHttpInfo(UUID id, List<String> include, List<String> exclude) throws ApiException {
        okhttp3.Call localVarCall = findHardwareReservationByIdValidateBeforeCall(id, include, exclude, null);
        Type localVarReturnType = new TypeToken<HardwareReservation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a hardware reservation (asynchronously)
     * Returns a single hardware reservation
     * @param id HardwareReservation UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findHardwareReservationByIdAsync(UUID id, List<String> include, List<String> exclude, final ApiCallback<HardwareReservation> _callback) throws ApiException {

        okhttp3.Call localVarCall = findHardwareReservationByIdValidateBeforeCall(id, include, exclude, _callback);
        Type localVarReturnType = new TypeToken<HardwareReservation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findProjectHardwareReservations
     * @param id Project UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findProjectHardwareReservationsCall(UUID id, List<String> include, List<String> exclude, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{id}/hardware-reservations"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (include != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "include", include));
        }

        if (exclude != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "exclude", exclude));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findProjectHardwareReservationsValidateBeforeCall(UUID id, List<String> include, List<String> exclude, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling findProjectHardwareReservations(Async)");
        }

        return findProjectHardwareReservationsCall(id, include, exclude, page, perPage, _callback);

    }

    /**
     * Retrieve all hardware reservations for a given project
     * Provides a collection of hardware reservations for a given project.
     * @param id Project UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @return HardwareReservationList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public HardwareReservationList findProjectHardwareReservations(UUID id, List<String> include, List<String> exclude, Integer page, Integer perPage) throws ApiException {
        ApiResponse<HardwareReservationList> localVarResp = findProjectHardwareReservationsWithHttpInfo(id, include, exclude, page, perPage);
        return localVarResp.getData();
    }

    /**
     * Retrieve all hardware reservations for a given project
     * Provides a collection of hardware reservations for a given project.
     * @param id Project UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @return ApiResponse&lt;HardwareReservationList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HardwareReservationList> findProjectHardwareReservationsWithHttpInfo(UUID id, List<String> include, List<String> exclude, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = findProjectHardwareReservationsValidateBeforeCall(id, include, exclude, page, perPage, null);
        Type localVarReturnType = new TypeToken<HardwareReservationList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve all hardware reservations for a given project (asynchronously)
     * Provides a collection of hardware reservations for a given project.
     * @param id Project UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findProjectHardwareReservationsAsync(UUID id, List<String> include, List<String> exclude, Integer page, Integer perPage, final ApiCallback<HardwareReservationList> _callback) throws ApiException {

        okhttp3.Call localVarCall = findProjectHardwareReservationsValidateBeforeCall(id, include, exclude, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<HardwareReservationList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for moveHardwareReservation
     * @param id Hardware Reservation UUID (required)
     * @param body Project UUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call moveHardwareReservationCall(UUID id, UUID body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/hardware-reservations/{id}/move"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call moveHardwareReservationValidateBeforeCall(UUID id, UUID body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling moveHardwareReservation(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling moveHardwareReservation(Async)");
        }

        return moveHardwareReservationCall(id, body, _callback);

    }

    /**
     * Move a hardware reservation
     * Move a hardware reservation to another project
     * @param id Hardware Reservation UUID (required)
     * @param body Project UUID (required)
     * @return HardwareReservation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public HardwareReservation moveHardwareReservation(UUID id, UUID body) throws ApiException {
        ApiResponse<HardwareReservation> localVarResp = moveHardwareReservationWithHttpInfo(id, body);
        return localVarResp.getData();
    }

    /**
     * Move a hardware reservation
     * Move a hardware reservation to another project
     * @param id Hardware Reservation UUID (required)
     * @param body Project UUID (required)
     * @return ApiResponse&lt;HardwareReservation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HardwareReservation> moveHardwareReservationWithHttpInfo(UUID id, UUID body) throws ApiException {
        okhttp3.Call localVarCall = moveHardwareReservationValidateBeforeCall(id, body, null);
        Type localVarReturnType = new TypeToken<HardwareReservation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Move a hardware reservation (asynchronously)
     * Move a hardware reservation to another project
     * @param id Hardware Reservation UUID (required)
     * @param body Project UUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call moveHardwareReservationAsync(UUID id, UUID body, final ApiCallback<HardwareReservation> _callback) throws ApiException {

        okhttp3.Call localVarCall = moveHardwareReservationValidateBeforeCall(id, body, _callback);
        Type localVarReturnType = new TypeToken<HardwareReservation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
