package com.equinix.workflow;

import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.api.DevicesApi;
import com.equinix.openapi.metal.v1.model.Device;
import com.equinix.openapi.metal.v1.model.DeviceCreateInput;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DeviceOperator {
   private DevicesApi deviceApiInstance;

   public DeviceOperator(ApiClient client) {
      this.deviceApiInstance = new DevicesApi(client);
   }

   public Device createDeviceAndPoll(DeviceCreateInput deviceCreateInput, UUID project, int retries, Duration wait) throws ApiException, InterruptedException {
      Device device = deviceApiInstance.createDevice(project, deviceCreateInput);

      return deviceAndPoll(device, retries, wait);
   }

   public Device deviceReadyAndPoll(UUID deviceId, int retries, Duration wait) throws ApiException, InterruptedException {
      List<String> empty = new ArrayList<>();
      Device device = deviceApiInstance.findDeviceById(deviceId, empty, empty);

      return deviceAndPoll(device, retries, wait);
   }

   private Device deviceAndPoll(Device device, int retries, Duration wait) throws ApiException, InterruptedException {
      UUID deviceId = null;

      List<String> empty = new ArrayList<>();
      // After device get's deployed we get provisioning percentage as `null`
      for(int i=0; (i < retries) && (device.getProvisioningPercentage() != null); i++) {
         deviceId = device.getId();
         Thread.sleep(wait.toMillis());
         device = deviceApiInstance.findDeviceById(deviceId, empty, empty);
      }
      return device;
   }

   public void deleteDevice(UUID id, Boolean forceDelete) throws ApiException {
      this.deviceApiInstance.deleteDevice(id, forceDelete);
   }
}