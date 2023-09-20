/*
 * Metal API
 * # Introduction Equinix Metal provides a RESTful HTTP API which can be reached at <https://api.equinix.com/metal/v1>. This document describes the API and how to use it.  The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account. Every feature of the Equinix Metal web interface is accessible through the API.  The API docs are generated from the Equinix Metal OpenAPI specification and are officially hosted at <https://metal.equinix.com/developers/api>.  # Common Parameters  The Equinix Metal API uses a few methods to minimize network traffic and improve throughput. These parameters are not used in all API calls, but are used often enough to warrant their own section. Look for these parameters in the documentation for the API calls that support them.  ## Pagination  Pagination is used to limit the number of results returned in a single request. The API will return a maximum of 100 results per page. To retrieve additional results, you can use the `page` and `per_page` query parameters.  The `page` parameter is used to specify the page number. The first page is `1`. The `per_page` parameter is used to specify the number of results per page. The maximum number of results differs by resource type.  ## Sorting  Where offered, the API allows you to sort results by a specific field. To sort results use the `sort_by` query parameter with the root level field name as the value. The `sort_direction` parameter is used to specify the sort direction, either either `asc` (ascending) or `desc` (descending).  ## Filtering  Filtering is used to limit the results returned in a single request. The API supports filtering by certain fields in the response. To filter results, you can use the field as a query parameter.  For example, to filter the IP list to only return public IPv4 addresses, you can filter by the `type` field, as in the following request:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/projects/id/ips?type=public_ipv4 ```  Only IP addresses with the `type` field set to `public_ipv4` will be returned.  ## Searching  Searching is used to find matching resources using multiple field comparissons. The API supports searching in resources that define this behavior. Currently the search parameter is only available on devices, ssh_keys, api_keys and memberships endpoints.  To search resources you can use the `search` query parameter.  ## Include and Exclude  For resources that contain references to other resources, sucha as a Device that refers to the Project it resides in, the Equinix Metal API will returns `href` values (API links) to the associated resource.  ```json {   ...   \"project\": {     \"href\": \"/metal/v1/projects/f3f131c8-f302-49ef-8c44-9405022dc6dd\"   } } ```  If you're going need the project details, you can avoid a second API request.  Specify the contained `href` resources and collections that you'd like to have included in the response using the `include` query parameter.  For example:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=projects ```  The `include` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests where `href` resources are presented.  To have multiple resources include, use a comma-separated list (e.g. `?include=emails,projects,memberships`).  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=emails,projects,memberships ```  You may also include nested associations up to three levels deep using dot notation (`?include=memberships.projects`):  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=memberships.projects ```  To exclude resources, and optimize response delivery, use the `exclude` query parameter. The `exclude` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests for fields with nested object responses. When excluded, these fields will be replaced with an object that contains only an `href` field. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.Organization;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * AuthTokenProject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthTokenProject {
  public static final String SERIALIZED_NAME_BGP_CONFIG = "bgp_config";
  @SerializedName(SERIALIZED_NAME_BGP_CONFIG)
  private Href bgpConfig;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CUSTOMDATA = "customdata";
  @SerializedName(SERIALIZED_NAME_CUSTOMDATA)
  private Object customdata;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<Href> devices;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INVITATIONS = "invitations";
  @SerializedName(SERIALIZED_NAME_INVITATIONS)
  private List<Href> invitations;

  public static final String SERIALIZED_NAME_MAX_DEVICES = "max_devices";
  @SerializedName(SERIALIZED_NAME_MAX_DEVICES)
  private Object maxDevices;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<Href> members;

  public static final String SERIALIZED_NAME_MEMBERSHIPS = "memberships";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIPS)
  private List<Href> memberships;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK_STATUS = "network_status";
  @SerializedName(SERIALIZED_NAME_NETWORK_STATUS)
  private Object networkStatus;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private Organization organization;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private Href paymentMethod;

  public static final String SERIALIZED_NAME_SSH_KEYS = "ssh_keys";
  @SerializedName(SERIALIZED_NAME_SSH_KEYS)
  private List<Href> sshKeys;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<Href> volumes;

  /**
   * The type of the project. Projects of type &#x60;vmce&#x60; are part of an in development feature and not available to all customers.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DEFAULT("default"),
    
    VMCE("vmce");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public AuthTokenProject() {
  }

  public AuthTokenProject bgpConfig(Href bgpConfig) {
    
    this.bgpConfig = bgpConfig;
    return this;
  }

   /**
   * Get bgpConfig
   * @return bgpConfig
  **/
  @javax.annotation.Nullable
  public Href getBgpConfig() {
    return bgpConfig;
  }


  public void setBgpConfig(Href bgpConfig) {
    this.bgpConfig = bgpConfig;
  }


  public AuthTokenProject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AuthTokenProject customdata(Object customdata) {
    
    this.customdata = customdata;
    return this;
  }

   /**
   * Get customdata
   * @return customdata
  **/
  @javax.annotation.Nullable
  public Object getCustomdata() {
    return customdata;
  }


  public void setCustomdata(Object customdata) {
    this.customdata = customdata;
  }


  public AuthTokenProject devices(List<Href> devices) {
    
    this.devices = devices;
    return this;
  }

  public AuthTokenProject addDevicesItem(Href devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  public List<Href> getDevices() {
    return devices;
  }


  public void setDevices(List<Href> devices) {
    this.devices = devices;
  }


  public AuthTokenProject id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public AuthTokenProject invitations(List<Href> invitations) {
    
    this.invitations = invitations;
    return this;
  }

  public AuthTokenProject addInvitationsItem(Href invitationsItem) {
    if (this.invitations == null) {
      this.invitations = new ArrayList<>();
    }
    this.invitations.add(invitationsItem);
    return this;
  }

   /**
   * Get invitations
   * @return invitations
  **/
  @javax.annotation.Nullable
  public List<Href> getInvitations() {
    return invitations;
  }


  public void setInvitations(List<Href> invitations) {
    this.invitations = invitations;
  }


  public AuthTokenProject maxDevices(Object maxDevices) {
    
    this.maxDevices = maxDevices;
    return this;
  }

   /**
   * Get maxDevices
   * @return maxDevices
  **/
  @javax.annotation.Nullable
  public Object getMaxDevices() {
    return maxDevices;
  }


  public void setMaxDevices(Object maxDevices) {
    this.maxDevices = maxDevices;
  }


  public AuthTokenProject members(List<Href> members) {
    
    this.members = members;
    return this;
  }

  public AuthTokenProject addMembersItem(Href membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @javax.annotation.Nullable
  public List<Href> getMembers() {
    return members;
  }


  public void setMembers(List<Href> members) {
    this.members = members;
  }


  public AuthTokenProject memberships(List<Href> memberships) {
    
    this.memberships = memberships;
    return this;
  }

  public AuthTokenProject addMembershipsItem(Href membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new ArrayList<>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

   /**
   * Get memberships
   * @return memberships
  **/
  @javax.annotation.Nullable
  public List<Href> getMemberships() {
    return memberships;
  }


  public void setMemberships(List<Href> memberships) {
    this.memberships = memberships;
  }


  public AuthTokenProject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the project. Cannot contain characters encoded in greater than 3 bytes such as emojis.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AuthTokenProject networkStatus(Object networkStatus) {
    
    this.networkStatus = networkStatus;
    return this;
  }

   /**
   * Get networkStatus
   * @return networkStatus
  **/
  @javax.annotation.Nullable
  public Object getNetworkStatus() {
    return networkStatus;
  }


  public void setNetworkStatus(Object networkStatus) {
    this.networkStatus = networkStatus;
  }


  public AuthTokenProject organization(Organization organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  public Organization getOrganization() {
    return organization;
  }


  public void setOrganization(Organization organization) {
    this.organization = organization;
  }


  public AuthTokenProject paymentMethod(Href paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  public Href getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(Href paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public AuthTokenProject sshKeys(List<Href> sshKeys) {
    
    this.sshKeys = sshKeys;
    return this;
  }

  public AuthTokenProject addSshKeysItem(Href sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Get sshKeys
   * @return sshKeys
  **/
  @javax.annotation.Nullable
  public List<Href> getSshKeys() {
    return sshKeys;
  }


  public void setSshKeys(List<Href> sshKeys) {
    this.sshKeys = sshKeys;
  }


  public AuthTokenProject updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public AuthTokenProject volumes(List<Href> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public AuthTokenProject addVolumesItem(Href volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @javax.annotation.Nullable
  public List<Href> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<Href> volumes) {
    this.volumes = volumes;
  }


  public AuthTokenProject type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the project. Projects of type &#x60;vmce&#x60; are part of an in development feature and not available to all customers.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AuthTokenProject tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public AuthTokenProject addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AuthTokenProject instance itself
   */
  public AuthTokenProject putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthTokenProject authTokenProject = (AuthTokenProject) o;
    return Objects.equals(this.bgpConfig, authTokenProject.bgpConfig) &&
        Objects.equals(this.createdAt, authTokenProject.createdAt) &&
        Objects.equals(this.customdata, authTokenProject.customdata) &&
        Objects.equals(this.devices, authTokenProject.devices) &&
        Objects.equals(this.id, authTokenProject.id) &&
        Objects.equals(this.invitations, authTokenProject.invitations) &&
        Objects.equals(this.maxDevices, authTokenProject.maxDevices) &&
        Objects.equals(this.members, authTokenProject.members) &&
        Objects.equals(this.memberships, authTokenProject.memberships) &&
        Objects.equals(this.name, authTokenProject.name) &&
        Objects.equals(this.networkStatus, authTokenProject.networkStatus) &&
        Objects.equals(this.organization, authTokenProject.organization) &&
        Objects.equals(this.paymentMethod, authTokenProject.paymentMethod) &&
        Objects.equals(this.sshKeys, authTokenProject.sshKeys) &&
        Objects.equals(this.updatedAt, authTokenProject.updatedAt) &&
        Objects.equals(this.volumes, authTokenProject.volumes) &&
        Objects.equals(this.type, authTokenProject.type) &&
        Objects.equals(this.tags, authTokenProject.tags)&&
        Objects.equals(this.additionalProperties, authTokenProject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgpConfig, createdAt, customdata, devices, id, invitations, maxDevices, members, memberships, name, networkStatus, organization, paymentMethod, sshKeys, updatedAt, volumes, type, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthTokenProject {\n");
    sb.append("    bgpConfig: ").append(toIndentedString(bgpConfig)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    maxDevices: ").append(toIndentedString(maxDevices)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkStatus: ").append(toIndentedString(networkStatus)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("bgp_config");
    openapiFields.add("created_at");
    openapiFields.add("customdata");
    openapiFields.add("devices");
    openapiFields.add("id");
    openapiFields.add("invitations");
    openapiFields.add("max_devices");
    openapiFields.add("members");
    openapiFields.add("memberships");
    openapiFields.add("name");
    openapiFields.add("network_status");
    openapiFields.add("organization");
    openapiFields.add("payment_method");
    openapiFields.add("ssh_keys");
    openapiFields.add("updated_at");
    openapiFields.add("volumes");
    openapiFields.add("type");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthTokenProject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthTokenProject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthTokenProject is not found in the empty JSON string", AuthTokenProject.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `bgp_config`
      if (jsonObj.get("bgp_config") != null && !jsonObj.get("bgp_config").isJsonNull()) {
        Href.validateJsonObject(jsonObj.getAsJsonObject("bgp_config"));
      }
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        JsonArray jsonArraydevices = jsonObj.getAsJsonArray("devices");
        if (jsonArraydevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("devices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
          }

          // validate the optional field `devices` (array)
          for (int i = 0; i < jsonArraydevices.size(); i++) {
            Href.validateJsonObject(jsonArraydevices.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("invitations") != null && !jsonObj.get("invitations").isJsonNull()) {
        JsonArray jsonArrayinvitations = jsonObj.getAsJsonArray("invitations");
        if (jsonArrayinvitations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("invitations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `invitations` to be an array in the JSON string but got `%s`", jsonObj.get("invitations").toString()));
          }

          // validate the optional field `invitations` (array)
          for (int i = 0; i < jsonArrayinvitations.size(); i++) {
            Href.validateJsonObject(jsonArrayinvitations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull()) {
        JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
        if (jsonArraymembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
          }

          // validate the optional field `members` (array)
          for (int i = 0; i < jsonArraymembers.size(); i++) {
            Href.validateJsonObject(jsonArraymembers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("memberships") != null && !jsonObj.get("memberships").isJsonNull()) {
        JsonArray jsonArraymemberships = jsonObj.getAsJsonArray("memberships");
        if (jsonArraymemberships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("memberships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `memberships` to be an array in the JSON string but got `%s`", jsonObj.get("memberships").toString()));
          }

          // validate the optional field `memberships` (array)
          for (int i = 0; i < jsonArraymemberships.size(); i++) {
            Href.validateJsonObject(jsonArraymemberships.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `organization`
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) {
        Organization.validateJsonObject(jsonObj.getAsJsonObject("organization"));
      }
      // validate the optional field `payment_method`
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) {
        Href.validateJsonObject(jsonObj.getAsJsonObject("payment_method"));
      }
      if (jsonObj.get("ssh_keys") != null && !jsonObj.get("ssh_keys").isJsonNull()) {
        JsonArray jsonArraysshKeys = jsonObj.getAsJsonArray("ssh_keys");
        if (jsonArraysshKeys != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ssh_keys").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ssh_keys` to be an array in the JSON string but got `%s`", jsonObj.get("ssh_keys").toString()));
          }

          // validate the optional field `ssh_keys` (array)
          for (int i = 0; i < jsonArraysshKeys.size(); i++) {
            Href.validateJsonObject(jsonArraysshKeys.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("volumes") != null && !jsonObj.get("volumes").isJsonNull()) {
        JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("volumes");
        if (jsonArrayvolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumes` to be an array in the JSON string but got `%s`", jsonObj.get("volumes").toString()));
          }

          // validate the optional field `volumes` (array)
          for (int i = 0; i < jsonArrayvolumes.size(); i++) {
            Href.validateJsonObject(jsonArrayvolumes.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthTokenProject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthTokenProject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthTokenProject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthTokenProject.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthTokenProject>() {
           @Override
           public void write(JsonWriter out, AuthTokenProject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthTokenProject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthTokenProject instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthTokenProject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthTokenProject
  * @throws IOException if the JSON string is invalid with respect to AuthTokenProject
  */
  public static AuthTokenProject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthTokenProject.class);
  }

 /**
  * Convert an instance of AuthTokenProject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

