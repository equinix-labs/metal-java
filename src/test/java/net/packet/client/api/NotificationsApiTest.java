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
import net.packet.client.model.Notification;
import net.packet.client.model.NotificationList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationsApi
 */
public class NotificationsApiTest {

    private final NotificationsApi api = new NotificationsApi();

    
    /**
     * Retrieve a notification
     *
     * Returns a single notification if the user has access
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findNotificationByIdTest() throws ApiException {
        String id = null;
        String include = null;
        // Notification response = api.findNotificationById(id, include);

        // TODO: test validations
    }
    
    /**
     * Retrieve all notifications
     *
     * Returns a collection of the current user’s notification.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findNotificationsTest() throws ApiException {
        Boolean all = null;
        String since = null;
        String include = null;
        Integer page = null;
        Integer perPage = null;
        // NotificationList response = api.findNotifications(all, since, include, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Update the notification
     *
     * Updates a single notification. Currently, the only supported operating is marking a notification as read.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNotificationTest() throws ApiException {
        String id = null;
        // Notification response = api.updateNotification(id);

        // TODO: test validations
    }
    
}
