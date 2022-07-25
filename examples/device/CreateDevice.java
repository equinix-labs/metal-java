import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.ApiKeyAuth;
import com.equinix.openapi.metal.v1.api.DevicesApi;
import com.equinix.openapi.metal.v1.model.DeviceCreateInput;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class CreateDevice {
   public static void main(String[] args) {
      ApiClient defaultClient = Configuration.getDefaultApiClient();

      // Spec is maintaing base path hence dont have to set it explicitly
      // defaultClient.setBasePath("<Metal API base path>");

      // Configure API key authorization: x_auth_token
      ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
      x_auth_token.setApiKey(args[0]);

      DevicesApi deviceApiInst = new DevicesApi(defaultClient);
      try {
         UUID projUUID = UUID.fromString(args[1]);

         DeviceCreateInput inp = new DeviceCreateInput();
         inp.metro("DA")
            .operatingSystem("debian_11")
            .plan("c3.small.x86")
            .alwaysPxe(null)
            .hardwareReservationId(null);

         System.out.println(deviceApiInst.createDevice(projUUID, inp));
      } catch (ApiException e) {
         System.out.println(String.format("Response HTTP status code : %s", e.getCode()));
         System.out.println(String.format("Response HTTP headers : %s", e.getResponseHeaders()));
         System.out.println(String.format("Response HTTP body : %s", e.getResponseBody()));
         System.out.println(String.format("Exception message : %s", e.getMessage()));
         e.printStackTrace();
      }
   }
}