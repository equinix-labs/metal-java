package com.equinix.functional.test;

import com.equinix.workflow.DeviceManager;
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

public class TestDeviceManager {
   
   private final String propFilename = "src/test/resources/device-test.properties";
   private final String sysTokenKey = "FUNCTIONAL_TEST_TOKEN";
   private final String sysProjUuidKey = "FUNCTIONAL_TEST_PROJECT_UUID";

   private HashMap<String, String> props;
   private DeviceManager deviceManager;

   @Before
   public void setup() {
      props = TestUtilis.ReadPropertiesFile(propFilename);

      // This properties needs to be added dynamically before test execution.
      String token = System.getenv(sysTokenKey);

      ApiClient defaultClient = Configuration.getDefaultApiClient();
      // Configure API key authorization: x_auth_token
      ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
      x_auth_token.setApiKey(token);

      deviceManager = new DeviceManager(defaultClient);
   }

   @Test
   public void testDeviceCreationAndPolling() throws ApiException, InterruptedException {
      UUID projId = UUID.fromString(System.getenv(sysProjUuidKey));

      DeviceCreateInput inp = new DeviceCreateInput()
                                    .metro(props.get("metro"))
                                    .operatingSystem(props.get("os"))
                                    .plan(props.get("plan"))
                                    .alwaysPxe(null)
                                    .hardwareReservationId(null);

      int retries = 2;
      Duration wait = Duration.ofSeconds(20);
      System.out.println("Provisioning device ...");

      Device device = deviceManager.createDeviceAndPoll(inp, projId, retries, wait);
      System.out.println(String.format("Device creation and ready completion status: %f", device.getProvisioningPercentage()));

      retries = 60;
      wait = Duration.ofSeconds(10);
      if (device.getProvisioningPercentage() != null) {
         device = deviceManager.deviceReadyAndPoll(device.getId(), retries, wait);
      }
      System.out.println(String.format("Device ready completion status: %s", device.getProvisioningPercentage() == null));

      // After device get's deployed we get provisioning percentage as `null`
      Assert.assertNull(device.getProvisioningPercentage());

      deviceManager.deleteDevice(device.getId(), false);
   }
}