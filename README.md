# packet-api-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>net.packet</groupId>
    <artifactId>packet-api-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "net.packet:packet-api-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/packet-api-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import net.packet.client.*;
import net.packet.client.auth.*;
import net.packet.client.model.*;
import net.packet.client.api.ActionsApi;

import java.io.File;
import java.util.*;

public class ActionsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: x_auth_token
        ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
        x_auth_token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x_auth_token.setApiKeyPrefix("Token");

        ActionsApi apiInstance = new ActionsApi();
        String id = "id_example"; // String | Device UUID
        String type = "type_example"; // String | Action to perform
        try {
            apiInstance.performAction(id, type);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#performAction");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.packet.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActionsApi* | [**performAction**](docs/ActionsApi.md#performAction) | **POST** /devices/{id}/actions | Perform an action
*BgpConfigsApi* | [**requestBgpConfig**](docs/BgpConfigsApi.md#requestBgpConfig) | **POST** /projects/{id}/bgp-config | Requesting bgp config
*BgpSessionsApi* | [**createBgpSession**](docs/BgpSessionsApi.md#createBgpSession) | **POST** /devices/{id}/bgp/sessions | Create a BGP session
*BgpSessionsApi* | [**deleteBgpSession**](docs/BgpSessionsApi.md#deleteBgpSession) | **DELETE** /bgp/sessions/{id} | Delete the BGP session
*BgpSessionsApi* | [**findBgpSessionById**](docs/BgpSessionsApi.md#findBgpSessionById) | **GET** /bgp/sessions/{id} | Retrieve a BGP session
*BgpSessionsApi* | [**findBgpSessions**](docs/BgpSessionsApi.md#findBgpSessions) | **GET** /devices/{id}/bgp/sessions | Retrieve all BGP sessions
*CapacityApi* | [**checkCapacity**](docs/CapacityApi.md#checkCapacity) | **POST** /capacity | Check capacity
*CapacityApi* | [**findCapacity**](docs/CapacityApi.md#findCapacity) | **GET** /capacity | View capacity
*DevicesApi* | [**createDevice**](docs/DevicesApi.md#createDevice) | **POST** /projects/{id}/devices | Create a device
*DevicesApi* | [**deleteDevice**](docs/DevicesApi.md#deleteDevice) | **DELETE** /devices/{id} | Delete the device
*DevicesApi* | [**findDeviceById**](docs/DevicesApi.md#findDeviceById) | **GET** /devices/{id} | Retrieve a device
*DevicesApi* | [**findDevices**](docs/DevicesApi.md#findDevices) | **GET** /projects/{id}/devices | Retrieve all devices
*DevicesApi* | [**updateDevice**](docs/DevicesApi.md#updateDevice) | **PUT** /devices/{id} | Update the device
*EmailsApi* | [**createEmail**](docs/EmailsApi.md#createEmail) | **POST** /emails | Create an email
*EmailsApi* | [**deleteEmail**](docs/EmailsApi.md#deleteEmail) | **DELETE** /emails/{id} | Delete the email
*EmailsApi* | [**findEmailById**](docs/EmailsApi.md#findEmailById) | **GET** /emails/{id} | Retrieve an email
*EmailsApi* | [**updateEmail**](docs/EmailsApi.md#updateEmail) | **PUT** /emails/{id} | Update the email
*EventsApi* | [**findDeviceEvents**](docs/EventsApi.md#findDeviceEvents) | **GET** /devices/{id}/events | Retrieve device&#39;s events
*EventsApi* | [**findEventById**](docs/EventsApi.md#findEventById) | **GET** /events/{id} | Retrieve an event
*EventsApi* | [**findEvents**](docs/EventsApi.md#findEvents) | **GET** /events | Retrieve current user&#39;s events
*EventsApi* | [**findProjectEvents**](docs/EventsApi.md#findProjectEvents) | **GET** /projects/{id}/events | Retrieve project&#39;s events
*EventsApi* | [**findVolumeEvents**](docs/EventsApi.md#findVolumeEvents) | **GET** /volumes/{id}/events | Retrieve volume&#39;s events
*FacilitiesApi* | [**findFacilities**](docs/FacilitiesApi.md#findFacilities) | **GET** /facilities | Retrieve all facilities
*IPAddressesApi* | [**deleteIPAddress**](docs/IPAddressesApi.md#deleteIPAddress) | **DELETE** /ips/{id} | Unassign an ip address
*IPAddressesApi* | [**findIPAddressById**](docs/IPAddressesApi.md#findIPAddressById) | **GET** /ips/{id} | Retrieve an ip address
*IPReservationsApi* | [**deleteIPReservation**](docs/IPReservationsApi.md#deleteIPReservation) | **DELETE** /ips/{reservation_id} | Delete the ip reservation
*IPReservationsApi* | [**findIPReservationById**](docs/IPReservationsApi.md#findIPReservationById) | **GET** /ips/{reservation_id} | Retrieve an ip reservation
*IPReservationsApi* | [**requestIPReservation**](docs/IPReservationsApi.md#requestIPReservation) | **POST** /projects/{id}/ips | Requesting ip reservations
*InvitationsApi* | [**acceptInvitation**](docs/InvitationsApi.md#acceptInvitation) | **PUT** /invitations/{id} | Accept an invitation
*InvitationsApi* | [**createInvitation**](docs/InvitationsApi.md#createInvitation) | **POST** /projects/{id}/invitations | Create an invitation
*InvitationsApi* | [**declineInvitation**](docs/InvitationsApi.md#declineInvitation) | **DELETE** /invitations/{id} | Decline an invitation
*InvitationsApi* | [**findInvitationById**](docs/InvitationsApi.md#findInvitationById) | **GET** /invitations/{id} | View an invitation
*MembershipsApi* | [**deleteMembership**](docs/MembershipsApi.md#deleteMembership) | **DELETE** /memberships/{id} | Delete the membership
*MembershipsApi* | [**findMembershipById**](docs/MembershipsApi.md#findMembershipById) | **GET** /memberships/{id} | Retrieve a membership
*MembershipsApi* | [**updateMembership**](docs/MembershipsApi.md#updateMembership) | **PUT** /memberships/{id} | Update the membership
*NotificationsApi* | [**findNotificationById**](docs/NotificationsApi.md#findNotificationById) | **GET** /notifications/{id} | Retrieve a notification
*NotificationsApi* | [**findNotifications**](docs/NotificationsApi.md#findNotifications) | **GET** /notifications | Retrieve all notifications
*NotificationsApi* | [**updateNotification**](docs/NotificationsApi.md#updateNotification) | **PUT** /notifications/{id} | Update the notification
*OperatingSystemsApi* | [**findOperatingSystems**](docs/OperatingSystemsApi.md#findOperatingSystems) | **GET** /operating-systems | Retrieve all operating systems
*PlansApi* | [**findPlans**](docs/PlansApi.md#findPlans) | **GET** /plans | Retrieve all plans
*ProjectsApi* | [**createProject**](docs/ProjectsApi.md#createProject) | **POST** /projects | Create a project
*ProjectsApi* | [**deleteProject**](docs/ProjectsApi.md#deleteProject) | **DELETE** /projects/{id} | Delete the project
*ProjectsApi* | [**findProjectById**](docs/ProjectsApi.md#findProjectById) | **GET** /projects/{id} | Retrieve a project
*ProjectsApi* | [**findProjects**](docs/ProjectsApi.md#findProjects) | **GET** /projects | Retrieve all projects
*ProjectsApi* | [**updateProject**](docs/ProjectsApi.md#updateProject) | **PUT** /projects/{id} | Update the project
*SSHKeysApi* | [**createSSHKey**](docs/SSHKeysApi.md#createSSHKey) | **POST** /projects/{id}/ssh-keys | Create a ssh key for the given project
*SSHKeysApi* | [**createSSHKey_0**](docs/SSHKeysApi.md#createSSHKey_0) | **POST** /ssh-keys | Create a ssh key for the current user
*SSHKeysApi* | [**deleteSSHKey**](docs/SSHKeysApi.md#deleteSSHKey) | **DELETE** /ssh-keys/{id} | Delete the ssh key
*SSHKeysApi* | [**findSSHKeyById**](docs/SSHKeysApi.md#findSSHKeyById) | **GET** /ssh-keys/{id} | Retrieve a ssh key
*SSHKeysApi* | [**findSSHKeys**](docs/SSHKeysApi.md#findSSHKeys) | **GET** /projects/{id}/ssh-keys | Retrieve a project&#39;s ssk keys
*SSHKeysApi* | [**findSSHKeys_0**](docs/SSHKeysApi.md#findSSHKeys_0) | **GET** /ssh-keys | Retrieve all ssk keys
*SSHKeysApi* | [**updateSSHKey**](docs/SSHKeysApi.md#updateSSHKey) | **PUT** /ssh-keys/{id} | Update the ssh key
*TrafficApi* | [**findTraffic**](docs/TrafficApi.md#findTraffic) | **GET** /devices/{id}/traffic | Retrieve device traffic
*TransferRequestsApi* | [**acceptTransferRequest**](docs/TransferRequestsApi.md#acceptTransferRequest) | **PUT** /transfers/{id} | Accept a transfer request
*TransferRequestsApi* | [**createTransferRequest**](docs/TransferRequestsApi.md#createTransferRequest) | **POST** /projects/{id}/transfers | Create a transfer request
*TransferRequestsApi* | [**declineTransferRequest**](docs/TransferRequestsApi.md#declineTransferRequest) | **DELETE** /transfers/{id} | Decline a transfer request
*TransferRequestsApi* | [**findTransferRequestById**](docs/TransferRequestsApi.md#findTransferRequestById) | **GET** /transfers/{id} | View a transfer request
*UsersApi* | [**findCurrentUser**](docs/UsersApi.md#findCurrentUser) | **GET** /user | Retrieve the current user
*UsersApi* | [**findUserById**](docs/UsersApi.md#findUserById) | **GET** /users/{id} | Retrieve a user
*UsersApi* | [**findUsers**](docs/UsersApi.md#findUsers) | **GET** /users | Retrieve all users
*UsersApi* | [**updateCurrentUser**](docs/UsersApi.md#updateCurrentUser) | **PUT** /user | Update the current user
*VPNApi* | [**findCurrentUserVpnConfig**](docs/VPNApi.md#findCurrentUserVpnConfig) | **GET** /user/vpn | Retrieve the client vpn config for current user
*VPNApi* | [**turnOffCurrentUserVpn**](docs/VPNApi.md#turnOffCurrentUserVpn) | **DELETE** /user/vpn | Turn off vpn for the current user
*VPNApi* | [**turnOnCurrentUserVpn**](docs/VPNApi.md#turnOnCurrentUserVpn) | **POST** /user/vpn | Turn on vpn for the current user
*VolumeAttachmentsApi* | [**createVolumeAttachment**](docs/VolumeAttachmentsApi.md#createVolumeAttachment) | **POST** /storage/{id}/attachments | Attach your volume
*VolumeAttachmentsApi* | [**deleteVolumeAttachment**](docs/VolumeAttachmentsApi.md#deleteVolumeAttachment) | **DELETE** /storage/attachments/{id} | Detach volume
*VolumeAttachmentsApi* | [**findVolumeAttachmentById**](docs/VolumeAttachmentsApi.md#findVolumeAttachmentById) | **GET** /storage/attachments/{id} | Retrieve an attachment
*VolumeAttachmentsApi* | [**findVolumeAttachments**](docs/VolumeAttachmentsApi.md#findVolumeAttachments) | **GET** /storage/{id}/attachments | Retrieve all volume attachment
*VolumeSnapshotPoliciesApi* | [**createVolumeSnapshotPolicy**](docs/VolumeSnapshotPoliciesApi.md#createVolumeSnapshotPolicy) | **POST** /storage/{id}/snapshot-policies | Create a volume snapshot policy
*VolumeSnapshotPoliciesApi* | [**deleteVolumeSnapshotPolicy**](docs/VolumeSnapshotPoliciesApi.md#deleteVolumeSnapshotPolicy) | **DELETE** /storage/snapshot-policies/{id} | Delete the volume snapshot policy
*VolumeSnapshotPoliciesApi* | [**updateVolumeSnapshotPolicy**](docs/VolumeSnapshotPoliciesApi.md#updateVolumeSnapshotPolicy) | **PUT** /storage/snapshot-policies/{id} | Update the volume snapshot policy
*VolumeSnapshotsApi* | [**createVolumeSnapshot**](docs/VolumeSnapshotsApi.md#createVolumeSnapshot) | **POST** /storage/{id}/snapshots | Create a volume snapshot
*VolumeSnapshotsApi* | [**deleteVolumeSnapshot**](docs/VolumeSnapshotsApi.md#deleteVolumeSnapshot) | **DELETE** /storage/{volume_id}/snapshots/{id} | Delete volume snapshot
*VolumeSnapshotsApi* | [**findVolumeSnapshots**](docs/VolumeSnapshotsApi.md#findVolumeSnapshots) | **GET** /storage/{id}/snapshots | Retrieve all volume snapshot
*VolumesApi* | [**cloneVolume**](docs/VolumesApi.md#cloneVolume) | **POST** /storage/{id}/clone | Clone volume/snapshot
*VolumesApi* | [**createVolume**](docs/VolumesApi.md#createVolume) | **POST** /projects/{id}/storage | Create a volume
*VolumesApi* | [**deleteVolume**](docs/VolumesApi.md#deleteVolume) | **DELETE** /storage/{id} | Delete the volume
*VolumesApi* | [**findVolumeById**](docs/VolumesApi.md#findVolumeById) | **GET** /storage/{id} | Retrieve a volume
*VolumesApi* | [**findVolumes**](docs/VolumesApi.md#findVolumes) | **GET** /projects/{id}/storage | Retrieve all volumes
*VolumesApi* | [**restoreVolume**](docs/VolumesApi.md#restoreVolume) | **POST** /storage/{id}/restore | Restore volume
*VolumesApi* | [**updateVolume**](docs/VolumesApi.md#updateVolume) | **PUT** /storage/{id} | Update the volume


## Documentation for Models

 - [BgpConfigRequestInput](docs/BgpConfigRequestInput.md)
 - [BgpSession](docs/BgpSession.md)
 - [BgpSessionList](docs/BgpSessionList.md)
 - [CapacityInput](docs/CapacityInput.md)
 - [CapacityList](docs/CapacityList.md)
 - [CapacityPerBaremetal](docs/CapacityPerBaremetal.md)
 - [CapacityPerFacility](docs/CapacityPerFacility.md)
 - [CapacityReport](docs/CapacityReport.md)
 - [Device](docs/Device.md)
 - [DeviceCreateInput](docs/DeviceCreateInput.md)
 - [DeviceList](docs/DeviceList.md)
 - [DeviceUpdateInput](docs/DeviceUpdateInput.md)
 - [Email](docs/Email.md)
 - [EmailInput](docs/EmailInput.md)
 - [Event](docs/Event.md)
 - [EventInput](docs/EventInput.md)
 - [EventList](docs/EventList.md)
 - [EventType](docs/EventType.md)
 - [EventTypeList](docs/EventTypeList.md)
 - [Facility](docs/Facility.md)
 - [FacilityList](docs/FacilityList.md)
 - [HardwareLocation](docs/HardwareLocation.md)
 - [Href](docs/Href.md)
 - [IPAssignment](docs/IPAssignment.md)
 - [IPReservation](docs/IPReservation.md)
 - [IPReservationList](docs/IPReservationList.md)
 - [IPReservationRequestInput](docs/IPReservationRequestInput.md)
 - [Invitation](docs/Invitation.md)
 - [InvitationInput](docs/InvitationInput.md)
 - [Membership](docs/Membership.md)
 - [MembershipInput](docs/MembershipInput.md)
 - [Meta](docs/Meta.md)
 - [Notification](docs/Notification.md)
 - [NotificationList](docs/NotificationList.md)
 - [OperatingSystem](docs/OperatingSystem.md)
 - [OperatingSystemList](docs/OperatingSystemList.md)
 - [Plan](docs/Plan.md)
 - [PlanList](docs/PlanList.md)
 - [Project](docs/Project.md)
 - [ProjectCreateInput](docs/ProjectCreateInput.md)
 - [ProjectList](docs/ProjectList.md)
 - [ProjectUpdateInput](docs/ProjectUpdateInput.md)
 - [SSHKey](docs/SSHKey.md)
 - [SSHKeyInput](docs/SSHKeyInput.md)
 - [SSHKeyList](docs/SSHKeyList.md)
 - [ServerInfo](docs/ServerInfo.md)
 - [SnapshotPolicy](docs/SnapshotPolicy.md)
 - [SnapshotPolicyInput](docs/SnapshotPolicyInput.md)
 - [SupportRequestInput](docs/SupportRequestInput.md)
 - [Timeframe](docs/Timeframe.md)
 - [TransferRequest](docs/TransferRequest.md)
 - [TransferRequestInput](docs/TransferRequestInput.md)
 - [User](docs/User.md)
 - [UserList](docs/UserList.md)
 - [UserUpdateInput](docs/UserUpdateInput.md)
 - [VPNConfig](docs/VPNConfig.md)
 - [Volume](docs/Volume.md)
 - [VolumeAttachment](docs/VolumeAttachment.md)
 - [VolumeAttachmentInput](docs/VolumeAttachmentInput.md)
 - [VolumeAttachmentList](docs/VolumeAttachmentList.md)
 - [VolumeCreateInput](docs/VolumeCreateInput.md)
 - [VolumeList](docs/VolumeList.md)
 - [VolumeSnapshot](docs/VolumeSnapshot.md)
 - [VolumeSnapshotInput](docs/VolumeSnapshotInput.md)
 - [VolumeSnapshotList](docs/VolumeSnapshotList.md)
 - [VolumeUpdateInput](docs/VolumeUpdateInput.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### x_auth_token

- **Type**: API key
- **API key parameter name**: X-Auth-Token
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

help@packet.net

