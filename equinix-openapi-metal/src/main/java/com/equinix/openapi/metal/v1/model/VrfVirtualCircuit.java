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
import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.Vrf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
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
 * VrfVirtualCircuit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VrfVirtualCircuit {
  public static final String SERIALIZED_NAME_CUSTOMER_IP = "customer_ip";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_IP)
  private String customerIp;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5;

  public static final String SERIALIZED_NAME_METAL_IP = "metal_ip";
  @SerializedName(SERIALIZED_NAME_METAL_IP)
  private String metalIp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Href port;

  public static final String SERIALIZED_NAME_NNI_VLAN = "nni_vlan";
  @SerializedName(SERIALIZED_NAME_NNI_VLAN)
  private Integer nniVlan;

  public static final String SERIALIZED_NAME_PEER_ASN = "peer_asn";
  @SerializedName(SERIALIZED_NAME_PEER_ASN)
  private Integer peerAsn;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Href project;

  public static final String SERIALIZED_NAME_SPEED = "speed";
  @SerializedName(SERIALIZED_NAME_SPEED)
  private Integer speed;

  /**
   * The status changes of a VRF virtual circuit are generally the same as Virtual Circuits that aren&#39;t in a VRF. However, for VRF Virtual Circuits on Fabric VCs, the status will change to &#39;waiting_on_peering_details&#39; once the Fabric service token associated with the virtual circuit has been redeemed on Fabric, and Metal has found the associated Fabric connection. At this point, users can update the subnet, MD5 password, customer IP and/or metal IP accordingly. For VRF Virtual Circuits on Dedicated Ports, we require all peering details to be set on creation of a VRF Virtual Circuit. The status will change to &#x60;changing_peering_details&#x60; whenever an active VRF Virtual Circuit has any of its peering details updated.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    WAITING_ON_PEERING_DETAILS("waiting_on_peering_details"),
    
    ACTIVATING("activating"),
    
    CHANGING_PEERING_DETAILS("changing_peering_details"),
    
    DEACTIVATING("deactivating"),
    
    DELETING("deleting"),
    
    ACTIVE("active"),
    
    EXPIRED("expired"),
    
    ACTIVATION_FAILED("activation_failed"),
    
    CHANGING_PEERING_DETAILS_FAILED("changing_peering_details_failed"),
    
    DEACTIVATION_FAILED("deactivation_failed"),
    
    DELETE_FAILED("delete_failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SUBNET = "subnet";
  @SerializedName(SERIALIZED_NAME_SUBNET)
  private String subnet;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_VRF = "vrf";
  @SerializedName(SERIALIZED_NAME_VRF)
  private Vrf vrf;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public VrfVirtualCircuit() {
  }

  public VrfVirtualCircuit customerIp(String customerIp) {
    
    this.customerIp = customerIp;
    return this;
  }

   /**
   * An IP address from the subnet that will be used on the Customer side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Metal IP. By default, the last usable IP address in the subnet will be used.
   * @return customerIp
  **/
  @javax.annotation.Nullable
  public String getCustomerIp() {
    return customerIp;
  }


  public void setCustomerIp(String customerIp) {
    this.customerIp = customerIp;
  }


  public VrfVirtualCircuit description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VrfVirtualCircuit id(UUID id) {
    
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


  public VrfVirtualCircuit md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * The MD5 password for the BGP peering in plaintext (not a checksum).
   * @return md5
  **/
  @javax.annotation.Nullable
  public String getMd5() {
    return md5;
  }


  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public VrfVirtualCircuit metalIp(String metalIp) {
    
    this.metalIp = metalIp;
    return this;
  }

   /**
   * An IP address from the subnet that will be used on the Metal side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Customer IP. By default, the first usable IP address in the subnet will be used.
   * @return metalIp
  **/
  @javax.annotation.Nullable
  public String getMetalIp() {
    return metalIp;
  }


  public void setMetalIp(String metalIp) {
    this.metalIp = metalIp;
  }


  public VrfVirtualCircuit name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VrfVirtualCircuit port(Href port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  public Href getPort() {
    return port;
  }


  public void setPort(Href port) {
    this.port = port;
  }


  public VrfVirtualCircuit nniVlan(Integer nniVlan) {
    
    this.nniVlan = nniVlan;
    return this;
  }

   /**
   * Get nniVlan
   * @return nniVlan
  **/
  @javax.annotation.Nullable
  public Integer getNniVlan() {
    return nniVlan;
  }


  public void setNniVlan(Integer nniVlan) {
    this.nniVlan = nniVlan;
  }


  public VrfVirtualCircuit peerAsn(Integer peerAsn) {
    
    this.peerAsn = peerAsn;
    return this;
  }

   /**
   * The peer ASN that will be used with the VRF on the Virtual Circuit.
   * @return peerAsn
  **/
  @javax.annotation.Nullable
  public Integer getPeerAsn() {
    return peerAsn;
  }


  public void setPeerAsn(Integer peerAsn) {
    this.peerAsn = peerAsn;
  }


  public VrfVirtualCircuit project(Href project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  public Href getProject() {
    return project;
  }


  public void setProject(Href project) {
    this.project = project;
  }


  public VrfVirtualCircuit speed(Integer speed) {
    
    this.speed = speed;
    return this;
  }

   /**
   * integer representing bps speed
   * @return speed
  **/
  @javax.annotation.Nullable
  public Integer getSpeed() {
    return speed;
  }


  public void setSpeed(Integer speed) {
    this.speed = speed;
  }


  public VrfVirtualCircuit status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status changes of a VRF virtual circuit are generally the same as Virtual Circuits that aren&#39;t in a VRF. However, for VRF Virtual Circuits on Fabric VCs, the status will change to &#39;waiting_on_peering_details&#39; once the Fabric service token associated with the virtual circuit has been redeemed on Fabric, and Metal has found the associated Fabric connection. At this point, users can update the subnet, MD5 password, customer IP and/or metal IP accordingly. For VRF Virtual Circuits on Dedicated Ports, we require all peering details to be set on creation of a VRF Virtual Circuit. The status will change to &#x60;changing_peering_details&#x60; whenever an active VRF Virtual Circuit has any of its peering details updated.
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public VrfVirtualCircuit subnet(String subnet) {
    
    this.subnet = subnet;
    return this;
  }

   /**
   * The /30 or /31 subnet of one of the VRF IP Blocks that will be used with the VRF for the Virtual Circuit. This subnet does not have to be an existing VRF IP reservation, as we will create the VRF IP reservation on creation if it does not exist. The Metal IP and Customer IP must be IPs from this subnet. For /30 subnets, the network and broadcast IPs cannot be used as the Metal or Customer IP.
   * @return subnet
  **/
  @javax.annotation.Nullable
  public String getSubnet() {
    return subnet;
  }


  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }


  public VrfVirtualCircuit tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public VrfVirtualCircuit addTagsItem(String tagsItem) {
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


  public VrfVirtualCircuit vrf(Vrf vrf) {
    
    this.vrf = vrf;
    return this;
  }

   /**
   * Get vrf
   * @return vrf
  **/
  @javax.annotation.Nonnull
  public Vrf getVrf() {
    return vrf;
  }


  public void setVrf(Vrf vrf) {
    this.vrf = vrf;
  }


  public VrfVirtualCircuit createdAt(OffsetDateTime createdAt) {
    
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


  public VrfVirtualCircuit updatedAt(OffsetDateTime updatedAt) {
    
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
   * @return the VrfVirtualCircuit instance itself
   */
  public VrfVirtualCircuit putAdditionalProperty(String key, Object value) {
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
    VrfVirtualCircuit vrfVirtualCircuit = (VrfVirtualCircuit) o;
    return Objects.equals(this.customerIp, vrfVirtualCircuit.customerIp) &&
        Objects.equals(this.description, vrfVirtualCircuit.description) &&
        Objects.equals(this.id, vrfVirtualCircuit.id) &&
        Objects.equals(this.md5, vrfVirtualCircuit.md5) &&
        Objects.equals(this.metalIp, vrfVirtualCircuit.metalIp) &&
        Objects.equals(this.name, vrfVirtualCircuit.name) &&
        Objects.equals(this.port, vrfVirtualCircuit.port) &&
        Objects.equals(this.nniVlan, vrfVirtualCircuit.nniVlan) &&
        Objects.equals(this.peerAsn, vrfVirtualCircuit.peerAsn) &&
        Objects.equals(this.project, vrfVirtualCircuit.project) &&
        Objects.equals(this.speed, vrfVirtualCircuit.speed) &&
        Objects.equals(this.status, vrfVirtualCircuit.status) &&
        Objects.equals(this.subnet, vrfVirtualCircuit.subnet) &&
        Objects.equals(this.tags, vrfVirtualCircuit.tags) &&
        Objects.equals(this.vrf, vrfVirtualCircuit.vrf) &&
        Objects.equals(this.createdAt, vrfVirtualCircuit.createdAt) &&
        Objects.equals(this.updatedAt, vrfVirtualCircuit.updatedAt)&&
        Objects.equals(this.additionalProperties, vrfVirtualCircuit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerIp, description, id, md5, metalIp, name, port, nniVlan, peerAsn, project, speed, status, subnet, tags, vrf, createdAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VrfVirtualCircuit {\n");
    sb.append("    customerIp: ").append(toIndentedString(customerIp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    metalIp: ").append(toIndentedString(metalIp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    nniVlan: ").append(toIndentedString(nniVlan)).append("\n");
    sb.append("    peerAsn: ").append(toIndentedString(peerAsn)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vrf: ").append(toIndentedString(vrf)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("customer_ip");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("md5");
    openapiFields.add("metal_ip");
    openapiFields.add("name");
    openapiFields.add("port");
    openapiFields.add("nni_vlan");
    openapiFields.add("peer_asn");
    openapiFields.add("project");
    openapiFields.add("speed");
    openapiFields.add("status");
    openapiFields.add("subnet");
    openapiFields.add("tags");
    openapiFields.add("vrf");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vrf");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VrfVirtualCircuit
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VrfVirtualCircuit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VrfVirtualCircuit is not found in the empty JSON string", VrfVirtualCircuit.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VrfVirtualCircuit.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customer_ip") != null && !jsonObj.get("customer_ip").isJsonNull()) && !jsonObj.get("customer_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_ip").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("md5") != null && !jsonObj.get("md5").isJsonNull()) && !jsonObj.get("md5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5").toString()));
      }
      if ((jsonObj.get("metal_ip") != null && !jsonObj.get("metal_ip").isJsonNull()) && !jsonObj.get("metal_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metal_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metal_ip").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `port`
      if (jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) {
        Href.validateJsonElement(jsonObj.get("port"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Href.validateJsonElement(jsonObj.get("project"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("subnet") != null && !jsonObj.get("subnet").isJsonNull()) && !jsonObj.get("subnet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subnet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subnet").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // validate the required field `vrf`
      Vrf.validateJsonElement(jsonObj.get("vrf"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VrfVirtualCircuit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VrfVirtualCircuit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VrfVirtualCircuit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VrfVirtualCircuit.class));

       return (TypeAdapter<T>) new TypeAdapter<VrfVirtualCircuit>() {
           @Override
           public void write(JsonWriter out, VrfVirtualCircuit value) throws IOException {
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
           public VrfVirtualCircuit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VrfVirtualCircuit instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VrfVirtualCircuit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VrfVirtualCircuit
  * @throws IOException if the JSON string is invalid with respect to VrfVirtualCircuit
  */
  public static VrfVirtualCircuit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VrfVirtualCircuit.class);
  }

 /**
  * Convert an instance of VrfVirtualCircuit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

