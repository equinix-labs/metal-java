import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.JSON;
import com.equinix.openapi.auth.ApiKeyAuth;
import com.equinix.openapi.metal.v1.model.VirtualCircuit;
import com.equinix.openapi.metal.v1.model.VrfVirtualCircuit;
import com.equinix.openapi.metal.v1.model.VlanVirtualCircuit;
import com.equinix.openapi.metal.v1.model.InterconnectionPort;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

public class ValidateVirtualCircuit {
   public static void main(String[] args) {
      String vrfVcString = "{\"id\": \"22A111DD-5EE3-4188-9163-78284363CA73\",\"name\": \"SDDC-2-pop_vpc-VC-primary\",\"status\": \"active\",\"bill\": true,\"nni_vnid\": 264,\"nni_vlan\": 264,\"project\": {\"href\": \"/metal/v1/projects/11CCA184-DB21-4659-A029-B704CDC8D5BA\"},\"vrf\": {\"href\": \"/metal/v1/vrfs/E3DEC139-F2A7-401F-BA12-890F206EF3FD\"},\"type\": \"vrf\",\"vnid\": null}";
      String vlanVcString = "{\"id\": \"22A111DD-5EE3-4188-9163-78284363CA73\",\"name\": \"SDDC-2-pop_vpc-VC-primary\",\"status\": \"active\",\"bill\": true,\"nni_vnid\": 264,\"nni_vlan\": 264,\"project\": {\"href\": \"/metal/v1/projects/11CCA184-DB21-4659-A029-B704CDC8D5BA\"},\"vrf\": {\"href\": \"/metal/v1/vrfs/E3DEC139-F2A7-401F-BA12-890F206EF3FD\"},\"type\": \"vlan\",\"vnid\": null}";
      String connectionPortString = "{\"virtual_circuits\":[" + vrfVcString + "," + vlanVcString + "]}";
      
      JSON json = new JSON();
      Type localVarReturnType = new TypeToken<InterconnectionPort>(){}.getType();
      JSON.deserialize(connectionPortString, localVarReturnType);
      System.out.println("no error from VirtualCircuit when deserializing ports");

      // no error from oneOf
      localVarReturnType = new TypeToken<VirtualCircuit>(){}.getType();
      JSON.deserialize(vlanVcString, localVarReturnType);
      JSON.deserialize(vrfVcString, localVarReturnType);
      System.out.println("no error when deserializing VirtualCircuit oneOf directly");

      try{
        localVarReturnType = new TypeToken<VrfVirtualCircuit>(){}.getType();
        JSON.deserialize(vlanVcString, localVarReturnType);
      } catch (Exception e) {
        System.out.println("validation error from vrf vc when type is vlan");
         System.out.println(String.format("Exception message : %s", e.getMessage()));
         e.printStackTrace();
      }

      try{
        localVarReturnType = new TypeToken<VlanVirtualCircuit>(){}.getType();
        JSON.deserialize(vrfVcString, localVarReturnType);
      } catch (Exception e) {
        System.out.println("validation error from vlan vc when type is vrf");
         System.out.println(String.format("Exception message : %s", e.getMessage()));
         e.printStackTrace();
      }


      try{
        localVarReturnType = new TypeToken<VirtualCircuit>(){}.getType();
        JSON.deserialize(vlanVcString, localVarReturnType);
        JSON.deserialize(vrfVcString, localVarReturnType);
      } catch (Exception e) {
         System.out.println(String.format("Exception message : %s", e.getMessage()));
         e.printStackTrace();
      }
   }
}
