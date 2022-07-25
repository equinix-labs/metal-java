import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.ApiKeyAuth;
import com.equinix.openapi.metal.v1.api.MetrosApi;

public class ListMetros {
   public static void main(String[] args) {
      ApiClient defaultClient = Configuration.getDefaultApiClient();

      // Spec is maintaing base path hence dont have to set it explicitly
      // defaultClient.setBasePath("<Metal API base path>");

      // Configure API key authorization: x_auth_token
      ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
      x_auth_token.setApiKey(args[0]);

      MetrosApi metroApiInst = new MetrosApi(defaultClient);
      try {
         System.out.println(metroApiInst.findMetros());
      } catch (ApiException e) {
         System.out.println(String.format("Response HTTP status code : %s", e.getCode()));
         System.out.println(String.format("Response HTTP headers : %s", e.getResponseHeaders()));
         System.out.println(String.format("Response HTTP body : %s", e.getResponseBody()));
         System.out.println(String.format("Exception message : %s", e.getMessage()));
         e.printStackTrace();
      }
   }
}
