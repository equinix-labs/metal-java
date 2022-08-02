import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.ApiKeyAuth;
import com.equinix.openapi.metal.v1.api.IpAddressesApi;
import com.equinix.openapi.metal.v1.model.IPReservationRequestInput;
import com.equinix.openapi.metal.v1.model.RequestIPReservationRequest;

import java.util.UUID;

public class ReserveIpAddresses {
   public static void main(String[] args) {
      ApiClient defaultClient = Configuration.getDefaultApiClient();

      // Spec is maintaing base path hence dont have to set it explicitly
      // defaultClient.setBasePath("<Metal API base path>");

      // Configure API key authorization: x_auth_token
      ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
      x_auth_token.setApiKey(args[0]);

      IpAddressesApi ipAddressesApiInst = new IpAddressesApi(defaultClient);
      try {

         UUID uuid = UUID.fromString(args[1]);
         IPReservationRequestInput iPReservationRequestInput = new IPReservationRequestInput();
         iPReservationRequestInput.setType("public_ipv4");
         iPReservationRequestInput.setQuantity(4);
         iPReservationRequestInput.setMetro("DA");
         RequestIPReservationRequest requestIPReservationRequest = new RequestIPReservationRequest(iPReservationRequestInput);

         System.out.println(ipAddressesApiInst.requestIPReservation(uuid, requestIPReservationRequest));
      } catch (ApiException e) {
         System.out.println(String.format("Response HTTP status code : %s", e.getCode()));
         System.out.println(String.format("Response HTTP headers : %s", e.getResponseHeaders()));
         System.out.println(String.format("Response HTTP body : %s", e.getResponseBody()));
         System.out.println(String.format("Exception message : %s", e.getMessage()));
         e.printStackTrace();
      }
   }
}
