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


package com.equinix.openapi.metal.v1.model;

import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.VirtualCircuit;
import com.equinix.openapi.metal.v1.model.Vrf;
import com.equinix.openapi.metal.v1.model.VrfVirtualCircuit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for CreateInterconnectionPortVirtualCircuit201Response
 */
public class CreateInterconnectionPortVirtualCircuit201ResponseTest {
    private final CreateInterconnectionPortVirtualCircuit201Response model = new CreateInterconnectionPortVirtualCircuit201Response();

    /**
     * Model tests for CreateInterconnectionPortVirtualCircuit201Response
     */
    @Test
    public void testCreateInterconnectionPortVirtualCircuit201Response() {
        // TODO: test CreateInterconnectionPortVirtualCircuit201Response
    }

    /**
     * Test the property 'bill'
     */
    @Test
    public void billTest() {
        // TODO: test bill
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'nniVlan'
     */
    @Test
    public void nniVlanTest() {
        // TODO: test nniVlan
    }

    /**
     * Test the property 'port'
     */
    @Test
    public void portTest() {
        // TODO: test port
    }

    /**
     * Test the property 'project'
     */
    @Test
    public void projectTest() {
        // TODO: test project
    }

    /**
     * Test the property 'speed'
     */
    @Test
    public void speedTest() {
        // TODO: test speed
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'virtualNetwork'
     */
    @Test
    public void virtualNetworkTest() {
        // TODO: test virtualNetwork
    }

    /**
     * Test the property 'vnid'
     */
    @Test
    public void vnidTest() {
        // TODO: test vnid
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

    /**
     * Test the property 'customerIp'
     */
    @Test
    public void customerIpTest() {
        // TODO: test customerIp
    }

    /**
     * Test the property 'md5'
     */
    @Test
    public void md5Test() {
        // TODO: test md5
    }

    /**
     * Test the property 'metalIp'
     */
    @Test
    public void metalIpTest() {
        // TODO: test metalIp
    }

    /**
     * Test the property 'peerAsn'
     */
    @Test
    public void peerAsnTest() {
        // TODO: test peerAsn
    }

    /**
     * Test the property 'subnet'
     */
    @Test
    public void subnetTest() {
        // TODO: test subnet
    }

    /**
     * Test the property 'vrf'
     */
    @Test
    public void vrfTest() {
        // TODO: test vrf
    }

}
