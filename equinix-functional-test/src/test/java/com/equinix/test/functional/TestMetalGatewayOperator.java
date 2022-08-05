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
import com.equinix.openapi.metal.v1.api.VlansApi;
import com.equinix.openapi.metal.v1.model.MetalGateway;
import com.equinix.openapi.metal.v1.model.MetalGatewayInput;
import com.equinix.openapi.metal.v1.model.VirtualNetwork;
import com.equinix.openapi.metal.v1.model.VirtualNetworkCreateInput;
import com.equinix.workflow.MetalGatewayOperator;

public class TestMetalGatewayOperator {
    private static final Logger logger = LoggerFactory.getLogger(TestDeviceOperator.class);

    private final String propFilename = "src/test/resources/metalgateway-test.properties";
    private final String sysTokenKey = "FUNCTIONAL_TEST_TOKEN";
    private final String sysProjUuidKey = "FUNCTIONAL_TEST_PROJECT_UUID";

    private HashMap<String, String> props;
    private MetalGatewayOperator metalGatewayOperator;
    private VlansApi vlansApi;

    @Before
    public void setup() {
        logger.info("Executing TestDMetalGatewayOperator setup...");
        props = TestUtilis.ReadPropertiesFile(propFilename);

        // These properties need to be added dynamically before test execution.
        String token = System.getenv(sysTokenKey);

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure API key authorization: x_auth_token
        ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
        x_auth_token.setApiKey(token);
        metalGatewayOperator = new MetalGatewayOperator(defaultClient);
        vlansApi = new VlansApi(defaultClient);
    }

    public VirtualNetwork createVlan(UUID projectId) throws ApiException {
        VirtualNetworkCreateInput vlanInput=new VirtualNetworkCreateInput()
                .metro(props.get("metro"))
                .projectId(projectId)
                .vxlan(Integer.valueOf(props.get("vxlan")));
        return vlansApi.createVirtualNetwork(projectId, vlanInput);
    }

    public void deleteVlan(UUID vlanId) throws ApiException {
        vlansApi.deleteVirtualNetwork(vlanId);
    }

    @Test
    public void testMetalGatewayCreationAndPolling() throws ApiException, InterruptedException {
        logger.info("Executing Test: testMetalGatewayCreationAndPolling");
        UUID projectId = UUID.fromString(System.getenv(sysProjUuidKey));

        logger.info("Creating vlan ...");
        VirtualNetwork vlan = createVlan(projectId);

        MetalGatewayInput metalGatewayInput = new MetalGatewayInput()
                .privateIpv4SubnetSize(Integer.valueOf(props.get("privateIpv4SubnetSize")))
                .virtualNetworkId(vlan.getId());

        int retries = 10;
        Duration wait = Duration.ofSeconds(5);
        logger.info("Provisioning metal gateway with the vlan attached to it...");
        MetalGateway metalGateway = metalGatewayOperator.createMetalGatewayAndPoll(metalGatewayInput, projectId, retries, wait);

        UUID metalGatewayId=metalGateway.getId();
        Assert.assertNotNull(metalGateway.getState());
        logger.info(String.format("Metal Gateway state : %s and ID : %s", metalGateway.getState(), metalGatewayId.toString()));

        String[] vlanHrefLink = metalGateway.getVirtualNetwork().getHref().split("/");
        String vlanId = vlanHrefLink[vlanHrefLink.length-1];
        Assert.assertEquals(vlan.getId().toString(), vlanId);
        logger.info(String.format("ID of associated VLAN: %s", vlanId));

        logger.info("Deprovisioning metal gateway ...");
        metalGatewayOperator.deleteMetalGateway(metalGatewayId);
        Assert.assertThrows(ApiException.class, () -> metalGatewayOperator.findMetalGateway(metalGatewayId));

        logger.info("Deleting vlan ...");
        deleteVlan(vlan.getId());
    }
}
