package com.equinix.test.functional;

import java.time.Duration;
import java.util.HashMap;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.ApiKeyAuth;
import com.equinix.openapi.metal.v1.model.MetalGateway;
import com.equinix.openapi.metal.v1.model.VirtualNetwork;
import com.equinix.workflow.MetalGatewayOperator;
import com.equinix.workflow.helpers.VlanHelper;

public class TestMetalGatewayOperator {
    private static final Logger logger = LoggerFactory.getLogger(TestDeviceOperator.class);

    private final String propFilename = "src/test/resources/metalgateway-test.properties";
    private final String sysTokenKey = "FUNCTIONAL_TEST_TOKEN";
    private final String sysProjUuidKey = "FUNCTIONAL_TEST_PROJECT_UUID";

    private HashMap<String, String> props;
    private MetalGatewayOperator metalGatewayOperator;
    private VlanHelper vlanHelper;

    @Before
    public void setup() {
        logger.info("Executing TestMetalGatewayOperator setup...");
        props = TestUtilis.ReadPropertiesFile(propFilename);

        // These properties need to be added dynamically before test execution.
        String token = System.getenv(sysTokenKey);

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure API key authorization: x_auth_token
        ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
        x_auth_token.setApiKey(token);
        metalGatewayOperator = new MetalGatewayOperator(defaultClient);
        vlanHelper = new VlanHelper(defaultClient);
    }

    @Test
    public void testMetalGatewayCreationWithPrivateIpBlockAndPolling() throws ApiException, InterruptedException {

        logger.info("Executing Test: testMetalGatewayCreationAndPolling...");
        Integer vxlan = Integer.valueOf(props.get("vxlan"));
        String metro = props.get("metro");
        Integer privateIpv4SubnetSize = Integer.valueOf(props.get("privateIpv4SubnetSize"));
        UUID projectId = UUID.fromString(System.getenv(sysProjUuidKey));
        int retries = 10;
        Duration wait = Duration.ofSeconds(5);

        logger.info("Provisioning metal gateway with the vlan attached to it...");
        MetalGateway createdMetalGateway = metalGatewayOperator.createMetalGatewayWithPrivateIpBlockAndPoll(projectId, metro, vxlan, privateIpv4SubnetSize, retries, wait);

        UUID metalGatewayId = createdMetalGateway.getId();
        Assert.assertNotNull(createdMetalGateway.getState());
        logger.info(String.format("Metal Gateway state : %s", createdMetalGateway.getState()));

        VirtualNetwork vlanOfMetalGateway = metalGatewayOperator.getVlanOfMetalGateway(metalGatewayId);
        Assert.assertNotNull(vlanOfMetalGateway);
        // check by vxlan id
        Assert.assertEquals(vlanOfMetalGateway.getVxlan(), vxlan);
        VirtualNetwork checkVlan = vlanHelper.getVlanByVxlanInProjectMetro(projectId, metro, vxlan);
        Assert.assertNotNull(checkVlan);
        // check by vlan uuid
        Assert.assertEquals(checkVlan.getId(), vlanOfMetalGateway.getId());
        logger.info(String.format("Vxlan ID of associated VLAN: %s", vlanOfMetalGateway.getVxlan()));

        logger.info("Deleting vlan and metal gateway ...");
        metalGatewayOperator.deleteVlanAndMetalGateway(metalGatewayId);
        Assert.assertNull(vlanHelper.getVlanByVxlanInProjectMetro(projectId, metro, vxlan));
        Assert.assertThrows(ApiException.class, () -> metalGatewayOperator.getMetalGateway(metalGatewayId, null, null));
    }
}
