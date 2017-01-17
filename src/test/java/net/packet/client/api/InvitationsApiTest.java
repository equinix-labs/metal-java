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
import net.packet.client.model.Membership;
import net.packet.client.model.InvitationInput;
import net.packet.client.model.Invitation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvitationsApi
 */
public class InvitationsApiTest {

    private final InvitationsApi api = new InvitationsApi();

    
    /**
     * Accept an invitation
     *
     * Accept an invitation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptInvitationTest() throws ApiException {
        String id = null;
        // Membership response = api.acceptInvitation(id);

        // TODO: test validations
    }
    
    /**
     * Create an invitation
     *
     * In order to add a user to a project, they must first be invited.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInvitationTest() throws ApiException {
        String id = null;
        InvitationInput invitation = null;
        // Invitation response = api.createInvitation(id, invitation);

        // TODO: test validations
    }
    
    /**
     * Decline an invitation
     *
     * Decline an invitation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void declineInvitationTest() throws ApiException {
        String id = null;
        // api.declineInvitation(id);

        // TODO: test validations
    }
    
    /**
     * View an invitation
     *
     * Returns a single invitation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findInvitationByIdTest() throws ApiException {
        String id = null;
        String include = null;
        // Invitation response = api.findInvitationById(id, include);

        // TODO: test validations
    }
    
}
