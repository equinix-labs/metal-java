import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.ApiKeyAuth;
import com.equinix.openapi.metal.v1.api.OrganizationsApi;

import java.util.List;
import java.util.ArrayList;

public class ListOrganizations {
   public static void main(String[] args) {
      ApiClient defaultClient = Configuration.getDefaultApiClient();

      // Spec is maintaing base path hence dont have to set it explicitly
      // defaultClient.setBasePath("<Metal API base path>");

      // Configure API key authorization: x_auth_token
      ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
      x_auth_token.setApiKey(args[0]);

      OrganizationsApi orgApiInst = new OrganizationsApi(defaultClient);
      try {
         // Include, exclude or show only personal organizations.
         String personal = "only";

         // Include, exclude or show only organizations that have no projects.
         String withoutProjects = "only";

         List<String> include = new ArrayList<String>();
         List<String> exclude = new ArrayList<String>();

         /**
          * Params :
          * 1. personal orgs (include, exclude or only).
          * 2. orgs without projects (include, exclude or only).
          * 3. Array of nested attributes to include.
          * 4. Array of nested attributes to exclude.
          * 5. Page to return (optional) default value is 1 (range is 1 - 100000)
          * 5. Items returned per page (optional) default value is 10 (range is 1 - 1000)
          */
         System.out.println(orgApiInst.findOrganizations(personal, withoutProjects, include, exclude, null, null));
      } catch (ApiException e) {
         System.out.println(String.format("Response HTTP status code : %s", e.getCode()));
         System.out.println(String.format("Response HTTP headers : %s", e.getResponseHeaders()));
         System.out.println(String.format("Response HTTP body : %s", e.getResponseBody()));
         System.out.println(String.format("Exception message : %s", e.getMessage()));
         e.printStackTrace();
      }
   }
}
