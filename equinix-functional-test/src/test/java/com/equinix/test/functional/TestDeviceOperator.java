package com.equinix.functional.test;

import com.equinix.workflow.DeviceOperator;
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.ApiKeyAuth;
import com.equinix.openapi.metal.v1.model.Device;
import com.equinix.openapi.metal.v1.model.DeviceCreateInput;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestDeviceOperator {

   private static final Logger logger = LoggerFactory.getLogger(TestDeviceOperator.class);
   
   private final String propFilename = "src/test/resources/device-test.properties";
   private final String sysTokenKey = "FUNCTIONAL_TEST_TOKEN";
   private final String sysProjUuidKey = "FUNCTIONAL_TEST_PROJECT_UUID";

   private HashMap<String, String> props;
   private DeviceOperator deviceOperator;

   @Before
   public void setup() {
      logger.info("Executing TestDeviceOperator setup...");
      props = TestUtilis.ReadPropertiesFile(propFilename);

      // This properties needs to be added dynamically before test execution.
      String token = System.getenv(sysTokenKey);

      ApiClient defaultClient = Configuration.getDefaultApiClient();
      // Configure API key authorization: x_auth_token
      ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
      x_auth_token.setApiKey(token);

      deviceOperator = new DeviceOperator(defaultClient);
   }

   @Test
   public void testDeviceCreationAndPolling() throws ApiException, InterruptedException {
      logger.info("Executing Test: testDeviceCreationAndPolling");
      UUID projId = UUID.fromString(System.getenv(sysProjUuidKey));

      DeviceCreateInput inp = new DeviceCreateInput()
                                    .metro(props.get("metro"))
                                    .operatingSystem(props.get("os"))
                                    .plan(props.get("plan"))
                                    .alwaysPxe(null)
                                    .hardwareReservationId(null);

      int retries = 2;
      Duration wait = Duration.ofSeconds(20);
      logger.info("Provisioning device ...");

      Device device = deviceOperator.createDeviceAndPoll(inp, projId, retries, wait);
      logger.info(String.format("Device creation and ready completion status: %f", device.getProvisioningPercentage()));

      retries = 120;
      wait = Duration.ofSeconds(10);
      if (device.getProvisioningPercentage() != null) {
         device = deviceOperator.deviceReadyAndPoll(device.getId(), retries, wait);
      }
      logger.info(String.format("Device ready completion status: %s", device.getProvisioningPercentage() == null));

      // After device get's deployed we get provisioning percentage as `null`
      Assert.assertNull(device.getProvisioningPercentage());

      deviceOperator.deleteDevice(device.getId(), false);
   }
}