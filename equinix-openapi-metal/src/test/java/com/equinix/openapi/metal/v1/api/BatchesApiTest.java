/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
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
import com.equinix.openapi.metal.v1.model.Batch;
import com.equinix.openapi.metal.v1.model.BatchesList;
import com.equinix.openapi.metal.v1.model.Error;
import com.equinix.openapi.metal.v1.model.InstancesBatchCreateInput;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BatchesApi
 */
@Disabled
public class BatchesApiTest {

    private final BatchesApi api = new BatchesApi();

    /**
     * Create a devices batch
     *
     * Creates new devices in batch and provisions them in our datacenter.  Type-specific options (such as operating_system for baremetal devices) should be included in the main data structure alongside hostname and plan.  The features attribute allows you to optionally specify what features your server should have.  For example, if you require a server with a TPM chip, you may specify &#x60;{ \&quot;features\&quot;: { \&quot;tpm\&quot;: \&quot;required\&quot; } }&#x60; (or &#x60;{ \&quot;features\&quot;: [\&quot;tpm\&quot;] }&#x60; in shorthand).  The request will fail if there are no available servers matching your criteria. Alternatively, if you do not require a certain feature, but would prefer to be assigned a server with that feature if there are any available, you may specify that feature with a preferred value (see the example request below).  The request will not fail if we have no servers with that feature in our inventory.  The facilities attribute specifies in what datacenter you wish to create the device.  You can either specify a single facility &#x60;{ \&quot;facility\&quot;: \&quot;f1\&quot; }&#x60; , or you can instruct to create the device in the best available datacenter &#x60;{ \&quot;facility\&quot;: \&quot;any\&quot; }&#x60;. Additionally it is possible to set a prioritized location selection.  For example &#x60;{ \&quot;facility\&quot;: [\&quot;f3\&quot;, \&quot;f2\&quot;, \&quot;any\&quot;] }&#x60; will try to assign to the facility f3, if there are no available f2, and so on. If \&quot;any\&quot; is not specified for \&quot;facility\&quot;, the request will fail unless it can assign in the selected locations.  With &#x60;{ \&quot;facility\&quot;: \&quot;any\&quot; }&#x60; you have the option to diversify to indicate how many facilities you are willing to be spread across. For this purpose use parameter: &#x60;facility_diversity_level &#x3D; N&#x60;.  For example:  &#x60;{ \&quot;facilities\&quot;: [\&quot;sjc1\&quot;, \&quot;ewr1\&quot;, \&quot;any\&quot;] ,  \&quot;facility_diversity_level\&quot; &#x3D; 1, \&quot;quantity\&quot; &#x3D; 10 }&#x60; will assign 10 devices into the same facility, trying first in \&quot;sjc1\&quot;, and if there aren’t available, it will try in  \&quot;ewr1\&quot;, otherwise any other.  The &#x60;ip_addresses&#x60; attribute will allow you to specify the addresses you want created with your device.  To maintain backwards compatibility, If the attribute is not sent in the request, it will be treated as if &#x60;{ \&quot;ip_addresses\&quot;: [{ \&quot;address_family\&quot;: 4, \&quot;public\&quot;: true }, { \&quot;address_family\&quot;: 4, \&quot;public\&quot;: false }, { \&quot;address_family\&quot;: 6, \&quot;public\&quot;: true }] }&#x60; was sent.  The private IPv4 address is required and always need to be sent in the array. Not all operating systems support no public IPv4 address, so in those cases you will receive an error message.  For example, to only configure your server with a private IPv4 address, you can send &#x60;{ \&quot;ip_addresses\&quot;: [{ \&quot;address_family\&quot;: 4, \&quot;public\&quot;: false }] }&#x60;.  Note: when specifying a subnet size larger than a /30, you will need to supply the UUID(s) of existing ip_reservations in your project to assign IPs from.  For example, &#x60;{ \&quot;ip_addresses\&quot;: [..., {\&quot;address_family\&quot;: 4, \&quot;public\&quot;: true, \&quot;ip_reservations\&quot;: [\&quot;uuid1\&quot;, \&quot;uuid2\&quot;]}] }&#x60;  To access a server without public IPs, you can use our Out-of-Band console access (SOS) or use another server with public IPs as a proxy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDeviceBatchTest() throws ApiException {
        UUID id = null;
        InstancesBatchCreateInput instancesBatchCreateInput = null;
        BatchesList response = api.createDeviceBatch(id, instancesBatchCreateInput);
        // TODO: test validations
    }

    /**
     * Delete the Batch
     *
     * Deletes the Batch.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteBatchTest() throws ApiException {
        UUID id = null;
        Boolean removeAssociatedInstances = null;
        api.deleteBatch(id, removeAssociatedInstances);
        // TODO: test validations
    }

    /**
     * Retrieve a Batch
     *
     * Returns a Batch
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findBatchByIdTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        Batch response = api.findBatchById(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve all batches by project
     *
     * Returns all batches for the given project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findBatchesByProjectTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        BatchesList response = api.findBatchesByProject(id, include, exclude);
        // TODO: test validations
    }

}
