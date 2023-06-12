/*
 * Metal API
 * # Introduction Equinix Metal provides a RESTful HTTP API which can be reached at <https://api.equinix.com/metal/v1>. This document describes the API and how to use it.  The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account. Every feature of the Equinix Metal web interface is accessible through the API.  The API docs are generated from the Equinix Metal OpenAPI specification and are officially hosted at <https://metal.equinix.com/developers/api>.  # Common Parameters  The Equinix Metal API uses a few methods to minimize network traffic and improve throughput. These parameters are not used in all API calls, but are used often enough to warrant their own section. Look for these parameters in the documentation for the API calls that support them.  ## Pagination  Pagination is used to limit the number of results returned in a single request. The API will return a maximum of 100 results per page. To retrieve additional results, you can use the `page` and `per_page` query parameters.  The `page` parameter is used to specify the page number. The first page is `1`. The `per_page` parameter is used to specify the number of results per page. The maximum number of results differs by resource type.  ## Sorting  Where offered, the API allows you to sort results by a specific field. To sort results use the `sort_by` query parameter with the root level field name as the value. The `sort_direction` parameter is used to specify the sort direction, either either `asc` (ascending) or `desc` (descending).  ## Filtering  Filtering is used to limit the results returned in a single request. The API supports filtering by certain fields in the response. To filter results, you can use the field as a query parameter.  For example, to filter the IP list to only return public IPv4 addresses, you can filter by the `type` field, as in the following request:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/projects/id/ips?type=public_ipv4 ```  Only IP addresses with the `type` field set to `public_ipv4` will be returned.  ## Searching  Searching is used to find matching resources using multiple field comparissons. The API supports searching in resources that define this behavior. The fields available for search differ by resource, as does the search strategy.  To search resources you can use the `search` query parameter.  ## Include and Exclude  For resources that contain references to other resources, sucha as a Device that refers to the Project it resides in, the Equinix Metal API will returns `href` values (API links) to the associated resource.  ```json {   ...   \"project\": {     \"href\": \"/metal/v1/projects/f3f131c8-f302-49ef-8c44-9405022dc6dd\"   } } ```  If you're going need the project details, you can avoid a second API request.  Specify the contained `href` resources and collections that you'd like to have included in the response using the `include` query parameter.  For example:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=projects ```  The `include` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests where `href` resources are presented.  To have multiple resources include, use a comma-separated list (e.g. `?include=emails,projects,memberships`).  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=emails,projects,memberships ```  You may also include nested associations up to three levels deep using dot notation (`?include=memberships.projects`):  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=memberships.projects ```  To exclude resources, and optimize response delivery, use the `exclude` query parameter. The `exclude` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests for fields with nested object responses. When excluded, these fields will be replaced with an object that contains only an `href` field. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.api;

import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.model.BgpDynamicNeighbor;
import com.equinix.openapi.metal.v1.model.BgpDynamicNeighborCreateInput;
import com.equinix.openapi.metal.v1.model.BgpDynamicNeighborList;
import com.equinix.openapi.metal.v1.model.Error;
import java.util.UUID;
import com.equinix.openapi.metal.v1.model.Vrf;
import com.equinix.openapi.metal.v1.model.VrfCreateInput;
import com.equinix.openapi.metal.v1.model.VrfIpReservation;
import com.equinix.openapi.metal.v1.model.VrfIpReservationList;
import com.equinix.openapi.metal.v1.model.VrfList;
import com.equinix.openapi.metal.v1.model.VrfRoute;
import com.equinix.openapi.metal.v1.model.VrfRouteCreateInput;
import com.equinix.openapi.metal.v1.model.VrfRouteList;
import com.equinix.openapi.metal.v1.model.VrfRouteUpdateInput;
import com.equinix.openapi.metal.v1.model.VrfUpdateInput;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VrfsApi
 */
@Disabled
public class VrfsApiTest {

    private final VrfsApi api = new VrfsApi();

    /**
     * Retrieve a BGP Dynamic Neighbor
     *
     * Return a single BGP Dynamic Neighbor resource
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bgpDynamicNeighborsIdGetTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        BgpDynamicNeighbor response = api.bgpDynamicNeighborsIdGet(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Create a VRF BGP Dynamic Neighbor range
     *
     * Create a VRF BGP Dynamic Neighbor range.  BGP Dynamic Neighbor records are limited to 2 per Virtual Network.  Notice: VRFs are a test feature currently under active development, and only available to certain users. Please contact Customer Success for more information. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBgpDynamicNeighborTest() throws ApiException {
        UUID id = null;
        BgpDynamicNeighborCreateInput bgpDynamicNeighborCreateInput = null;
        List<String> include = null;
        List<String> exclude = null;
        BgpDynamicNeighbor response = api.createBgpDynamicNeighbor(id, bgpDynamicNeighborCreateInput, include, exclude);
        // TODO: test validations
    }

    /**
     * Create a new VRF in the specified project
     *
     * Creates a new VRF in the specified project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createVrfTest() throws ApiException {
        UUID id = null;
        VrfCreateInput vrfCreateInput = null;
        Vrf response = api.createVrf(id, vrfCreateInput);
        // TODO: test validations
    }

    /**
     * Create a VRF route
     *
     * Create a route in a VRF. Currently only static default routes are supported.  Notice: VRFs are a test feature currently under active development, and only available to certain users. Please contact Customer Success for more information. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createVrfRouteTest() throws ApiException {
        UUID id = null;
        VrfRouteCreateInput vrfRouteCreateInput = null;
        VrfRoute response = api.createVrfRoute(id, vrfRouteCreateInput);
        // TODO: test validations
    }

    /**
     * Delete a VRF BGP Dynamic Neighbor
     *
     * Trigger the removal of a BGP Neighbor range from a VRF
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteBgpDynamicNeighborByIdTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        BgpDynamicNeighbor response = api.deleteBgpDynamicNeighborById(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Delete the VRF
     *
     * Deletes the VRF
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVrfTest() throws ApiException {
        UUID id = null;
        api.deleteVrf(id);
        // TODO: test validations
    }

    /**
     * Delete a VRF Route
     *
     * Trigger the deletion of a VRF Route resource. The status of the route will update to &#39;deleting&#39;, and the route resource will remain accessible while background operations remove the route from the network. Once the route has been removed from the network, the resource will be fully deleted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVrfRouteByIdTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        VrfRoute response = api.deleteVrfRouteById(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve a VRF
     *
     * Returns a single VRF resource
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findVrfByIdTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        Vrf response = api.findVrfById(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve all VRF IP Reservations in the VRF
     *
     * Returns the IP Reservation for the VRF.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findVrfIpReservationTest() throws ApiException {
        UUID vrfId = null;
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        VrfIpReservation response = api.findVrfIpReservation(vrfId, id, include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve all VRF IP Reservations in the VRF
     *
     * Returns the list of VRF IP Reservations for the VRF.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findVrfIpReservationsTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        VrfIpReservationList response = api.findVrfIpReservations(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve a VRF Route
     *
     * Returns a single VRF Route resource
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findVrfRouteByIdTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        VrfRoute response = api.findVrfRouteById(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve all VRFs in the project
     *
     * Returns the list of VRFs for a single project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findVrfsTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        String metro = null;
        VrfList response = api.findVrfs(id, include, exclude, metro);
        // TODO: test validations
    }

    /**
     * List BGP Dynamic Neighbors
     *
     * Returns the list of VRF BGP Dynamic Neighbors for this Metal Gateway
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBgpDynamicNeighborsTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        BgpDynamicNeighborList response = api.getBgpDynamicNeighbors(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve all routes in the VRF
     *
     * Returns the list of routes for the VRF
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVrfRoutesTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        VrfRouteList response = api.getVrfRoutes(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Update the VRF
     *
     * Updates the VRF.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVrfTest() throws ApiException {
        UUID id = null;
        VrfUpdateInput vrfUpdateInput = null;
        Vrf response = api.updateVrf(id, vrfUpdateInput);
        // TODO: test validations
    }

    /**
     * Update a VRF Route
     *
     * Requests a VRF Route be redeployed across the network. Updating the prefix or next-hop address on a route is not currently supported.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVrfRouteByIdTest() throws ApiException {
        UUID id = null;
        VrfRouteUpdateInput vrfRouteUpdateInput = null;
        List<String> include = null;
        List<String> exclude = null;
        VrfRoute response = api.updateVrfRouteById(id, vrfRouteUpdateInput, include, exclude);
        // TODO: test validations
    }

}
