package com.equinix.workflow;

import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.api.DevicesApi;
import com.equinix.openapi.metal.v1.model.Device;
import com.equinix.openapi.metal.v1.model.CreateDeviceRequest;
import com.equinix.openapi.metal.v1.model.Device.StateEnum;

import java.time.Duration;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DeviceOperator {
   private DevicesApi deviceApiInstance;

   /**
    * After device get's deployed we get provisioning
    * percentage as `null`. But during provisioning,
    * percentage can be null even before provisioning
    * even starts. Hence we should look at device state.
    *
    * Target : active or failed.
    * Pending: queued, provisioning or reinstalling.
    */
   private final List<StateEnum> targetState = Arrays.asList(StateEnum.ACTIVE, StateEnum.FAILED);

   public DeviceOperator(ApiClient client) {
      this.deviceApiInstance = new DevicesApi(client);
   }

   public Device createDeviceAndPoll(CreateDeviceRequest createDeviceRequest, UUID project, int retries, Duration wait) throws ApiException, InterruptedException {
      Device device = deviceApiInstance.createDevice(project, createDeviceRequest, null, null);

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
      for(int i=0; (i < retries) && !targetState.contains(device.getState()); i++) {
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
