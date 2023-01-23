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

import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.model.CreateInterconnectionPortVirtualCircuit201Response;
import com.equinix.openapi.metal.v1.model.CreateInterconnectionPortVirtualCircuitRequest;
import com.equinix.openapi.metal.v1.model.Error;
import com.equinix.openapi.metal.v1.model.Interconnection;
import com.equinix.openapi.metal.v1.model.InterconnectionCreateInput;
import com.equinix.openapi.metal.v1.model.InterconnectionList;
import com.equinix.openapi.metal.v1.model.InterconnectionPort;
import com.equinix.openapi.metal.v1.model.InterconnectionPortList;
import com.equinix.openapi.metal.v1.model.InterconnectionUpdateInput;
import java.util.UUID;
import com.equinix.openapi.metal.v1.model.UpdateVirtualCircuitRequest;
import com.equinix.openapi.metal.v1.model.VirtualCircuitList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InterconnectionsApi
 */
@Disabled
public class InterconnectionsApiTest {

    private final InterconnectionsApi api = new InterconnectionsApi();

    /**
     * Create a new Virtual Circuit
     *
     * Create a new Virtual Circuit on a Dedicated Port. To create a regular Virtual Circuit, specify a Virtual Network record and an NNI VLAN value. To create a VRF-based Virtual Circuit, specify the VRF ID and subnet, along with the NNI VLAN value.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInterconnectionPortVirtualCircuitTest() throws ApiException {
        UUID connectionId = null;
        UUID portId = null;
        CreateInterconnectionPortVirtualCircuitRequest createInterconnectionPortVirtualCircuitRequest = null;
        CreateInterconnectionPortVirtualCircuit201Response response = api.createInterconnectionPortVirtualCircuit(connectionId, portId, createInterconnectionPortVirtualCircuitRequest);
        // TODO: test validations
    }

    /**
     * Request a new interconnection for the organization
     *
     * Creates a new interconnection request. A Project ID must be specified in the request body for connections on shared ports.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrganizationInterconnectionTest() throws ApiException {
        UUID organizationId = null;
        InterconnectionCreateInput interconnectionCreateInput = null;
        Interconnection response = api.createOrganizationInterconnection(organizationId, interconnectionCreateInput);
        // TODO: test validations
    }

    /**
     * Request a new interconnection for the project&#39;s organization
     *
     * Creates a new interconnection request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectInterconnectionTest() throws ApiException {
        UUID projectId = null;
        InterconnectionCreateInput interconnectionCreateInput = null;
        Interconnection response = api.createProjectInterconnection(projectId, interconnectionCreateInput);
        // TODO: test validations
    }

    /**
     * Delete interconnection
     *
     * Delete a interconnection, its associated ports and virtual circuits.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteInterconnectionTest() throws ApiException {
        UUID connectionId = null;
        Interconnection response = api.deleteInterconnection(connectionId);
        // TODO: test validations
    }

    /**
     * Delete a virtual circuit
     *
     * Delete a virtual circuit from a Dedicated Port.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVirtualCircuitTest() throws ApiException {
        UUID id = null;
        CreateInterconnectionPortVirtualCircuit201Response response = api.deleteVirtualCircuit(id);
        // TODO: test validations
    }

    /**
     * Get interconnection
     *
     * Get the details of a interconnection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInterconnectionTest() throws ApiException {
        UUID connectionId = null;
        Interconnection response = api.getInterconnection(connectionId);
        // TODO: test validations
    }

    /**
     * Get a interconnection port
     *
     * Get the details of an interconnection port.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInterconnectionPortTest() throws ApiException {
        UUID connectionId = null;
        UUID id = null;
        InterconnectionPort response = api.getInterconnectionPort(connectionId, id);
        // TODO: test validations
    }

    /**
     * Get a virtual circuit
     *
     * Get the details of a virtual circuit
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVirtualCircuitTest() throws ApiException {
        UUID id = null;
        CreateInterconnectionPortVirtualCircuit201Response response = api.getVirtualCircuit(id);
        // TODO: test validations
    }

    /**
     * List a interconnection port&#39;s virtual circuits
     *
     * List the virtual circuit record(s) associatiated with a particular interconnection port.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listInterconnectionPortVirtualCircuitsTest() throws ApiException {
        UUID connectionId = null;
        UUID portId = null;
        VirtualCircuitList response = api.listInterconnectionPortVirtualCircuits(connectionId, portId);
        // TODO: test validations
    }

    /**
     * List a interconnection&#39;s ports
     *
     * List the ports associated to an interconnection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listInterconnectionPortsTest() throws ApiException {
        UUID connectionId = null;
        InterconnectionPortList response = api.listInterconnectionPorts(connectionId);
        // TODO: test validations
    }

    /**
     * List organization connections
     *
     * List the connections belonging to the organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void organizationListInterconnectionsTest() throws ApiException {
        UUID organizationId = null;
        InterconnectionList response = api.organizationListInterconnections(organizationId);
        // TODO: test validations
    }

    /**
     * List project connections
     *
     * List the connections belonging to the project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void projectListInterconnectionsTest() throws ApiException {
        UUID projectId = null;
        InterconnectionList response = api.projectListInterconnections(projectId);
        // TODO: test validations
    }

    /**
     * Update interconnection
     *
     * Update the details of a interconnection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateInterconnectionTest() throws ApiException {
        UUID connectionId = null;
        InterconnectionUpdateInput interconnectionUpdateInput = null;
        Interconnection response = api.updateInterconnection(connectionId, interconnectionUpdateInput);
        // TODO: test validations
    }

    /**
     * Update a virtual circuit
     *
     * Update the details of a virtual circuit.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVirtualCircuitTest() throws ApiException {
        UUID id = null;
        UpdateVirtualCircuitRequest updateVirtualCircuitRequest = null;
        CreateInterconnectionPortVirtualCircuit201Response response = api.updateVirtualCircuit(id, updateVirtualCircuitRequest);
        // TODO: test validations
    }

}
