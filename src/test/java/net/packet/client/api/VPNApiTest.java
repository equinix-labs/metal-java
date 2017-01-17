/**
 * Packet API
 * This is the API for Packet. Interact with your devices, user account, and projects.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: help@packet.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.packet.client.api;

import net.packet.client.ApiException;
import net.packet.client.model.VPNConfig;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VPNApi
 */
public class VPNApiTest {

    private final VPNApi api = new VPNApi();

    
    /**
     * Retrieve the client vpn config for current user
     *
     * Returns the client vpn config for the currently logged-in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCurrentUserVpnConfigTest() throws ApiException {
        String id = null;
        String code = null;
        // VPNConfig response = api.findCurrentUserVpnConfig(id, code);

        // TODO: test validations
    }
    
    /**
     * Turn off vpn for the current user
     *
     * Turns off vpn for the currently logged-in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void turnOffCurrentUserVpnTest() throws ApiException {
        // api.turnOffCurrentUserVpn();

        // TODO: test validations
    }
    
    /**
     * Turn on vpn for the current user
     *
     * Turns on vpn for the currently logged-in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void turnOnCurrentUserVpnTest() throws ApiException {
        // api.turnOnCurrentUserVpn();

        // TODO: test validations
    }
    
}
