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
 * VlanVirtualCircuit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VlanVirtualCircuit {
  public static final String SERIALIZED_NAME_BILL = "bill";
  @SerializedName(SERIALIZED_NAME_BILL)
  private Boolean bill = false;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NNI_VLAN = "nni_vlan";
  @SerializedName(SERIALIZED_NAME_NNI_VLAN)
  private Integer nniVlan;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Href port;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Href project;

  public static final String SERIALIZED_NAME_SPEED = "speed";
  @SerializedName(SERIALIZED_NAME_SPEED)
  private Integer speed;

  /**
   * The status of a Virtual Circuit is always &#39;pending&#39; on creation. The status can turn to &#39;Waiting on Customer VLAN&#39; if a Metro VLAN was not set yet on the Virtual Circuit and is the last step needed for full activation. For Dedicated interconnections, as long as the Dedicated Port has been associated to the Virtual Circuit and a NNI VNID has been set, it will turn to &#39;waiting_on_customer_vlan&#39;. For Fabric VCs, it will only change to &#39;waiting_on_customer_vlan&#39; once the corresponding Fabric connection has been found on the Fabric side. If the Fabric service token associated with the Virtual Circuit hasn&#39;t been redeemed on Fabric within the expiry time, it will change to an &#x60;expired&#x60; status. Once a Metro VLAN is set on the Virtual Circuit (which for Fabric VCs, can be set on creation of a Fabric VC) and the necessary set up is done, it will turn into &#39;Activating&#39; status as it tries to activate the Virtual Circuit. Once the Virtual Circuit fully activates and is configured on the switch, it will turn to staus &#39;active&#39;. For Fabric VCs (Metal Billed), we will start billing the moment the status of the Virtual Circuit turns to &#39;active&#39;. If there are any changes to the VLAN after the Virtual Circuit is in an &#39;active&#39; status, the status will show &#39;changing_vlan&#39; if a new VLAN has been provided, or &#39;deactivating&#39; if we are removing the VLAN. When a deletion request is issued for the Virtual Circuit, it will move to a &#39;deleting&#39; status, and we will immediately unconfigure the switch for the Virtual Circuit and issue a deletion on any associated Fabric connections. Any associated Metro VLANs on the virtual circuit will also be unassociated after the switch has been successfully unconfigured. If there are any associated Fabric connections, we will only fully delete the Virtual Circuit once we have checked that the Fabric connection was fully deprovisioned on Fabric.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    WAITING_ON_CUSTOMER_VLAN("waiting_on_customer_vlan"),
    
    ACTIVATING("activating"),
    
    CHANGING_VLAN("changing_vlan"),
    
    DEACTIVATING("deactivating"),
    
    DELETING("deleting"),
    
    ACTIVE("active"),
    
    EXPIRED("expired"),
    
    ACTIVATION_FAILED("activation_failed"),
    
    CHANGING_VLAN_FAILED("changing_vlan_failed"),
    
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

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_VIRTUAL_NETWORK = "virtual_network";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NETWORK)
  private Href virtualNetwork;

  public static final String SERIALIZED_NAME_VNID = "vnid";
  @SerializedName(SERIALIZED_NAME_VNID)
  private Integer vnid;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public VlanVirtualCircuit() {
  }

  public VlanVirtualCircuit bill(Boolean bill) {
    
    this.bill = bill;
    return this;
  }

   /**
   * True if the Virtual Circuit is being billed. Currently, only Virtual Circuits of Fabric VCs (Metal Billed) will be billed. Usage will start the first time the Virtual Circuit becomes active, and will not stop until it is deleted from Metal.
   * @return bill
  **/
  @javax.annotation.Nonnull
  public Boolean getBill() {
    return bill;
  }


  public void setBill(Boolean bill) {
    this.bill = bill;
  }


  public VlanVirtualCircuit description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VlanVirtualCircuit id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public VlanVirtualCircuit name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VlanVirtualCircuit nniVlan(Integer nniVlan) {
    
    this.nniVlan = nniVlan;
    return this;
  }

   /**
   * Get nniVlan
   * @return nniVlan
  **/
  @javax.annotation.Nonnull
  public Integer getNniVlan() {
    return nniVlan;
  }


  public void setNniVlan(Integer nniVlan) {
    this.nniVlan = nniVlan;
  }


  public VlanVirtualCircuit port(Href port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nonnull
  public Href getPort() {
    return port;
  }


  public void setPort(Href port) {
    this.port = port;
  }


  public VlanVirtualCircuit project(Href project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nonnull
  public Href getProject() {
    return project;
  }


  public void setProject(Href project) {
    this.project = project;
  }


  public VlanVirtualCircuit speed(Integer speed) {
    
    this.speed = speed;
    return this;
  }

   /**
   * For Virtual Circuits on shared and dedicated connections, this speed should match the one set on their Interconnection Ports. For Virtual Circuits on Fabric VCs (both Metal and Fabric Billed) that have found their corresponding Fabric connection, this is the actual speed of the interconnection that was configured when setting up the interconnection on the Fabric Portal. Details on Fabric VCs are included in the specification as a developer preview and is generally unavailable. Please contact our Support team for more details.
   * @return speed
  **/
  @javax.annotation.Nullable
  public Integer getSpeed() {
    return speed;
  }


  public void setSpeed(Integer speed) {
    this.speed = speed;
  }


  public VlanVirtualCircuit status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of a Virtual Circuit is always &#39;pending&#39; on creation. The status can turn to &#39;Waiting on Customer VLAN&#39; if a Metro VLAN was not set yet on the Virtual Circuit and is the last step needed for full activation. For Dedicated interconnections, as long as the Dedicated Port has been associated to the Virtual Circuit and a NNI VNID has been set, it will turn to &#39;waiting_on_customer_vlan&#39;. For Fabric VCs, it will only change to &#39;waiting_on_customer_vlan&#39; once the corresponding Fabric connection has been found on the Fabric side. If the Fabric service token associated with the Virtual Circuit hasn&#39;t been redeemed on Fabric within the expiry time, it will change to an &#x60;expired&#x60; status. Once a Metro VLAN is set on the Virtual Circuit (which for Fabric VCs, can be set on creation of a Fabric VC) and the necessary set up is done, it will turn into &#39;Activating&#39; status as it tries to activate the Virtual Circuit. Once the Virtual Circuit fully activates and is configured on the switch, it will turn to staus &#39;active&#39;. For Fabric VCs (Metal Billed), we will start billing the moment the status of the Virtual Circuit turns to &#39;active&#39;. If there are any changes to the VLAN after the Virtual Circuit is in an &#39;active&#39; status, the status will show &#39;changing_vlan&#39; if a new VLAN has been provided, or &#39;deactivating&#39; if we are removing the VLAN. When a deletion request is issued for the Virtual Circuit, it will move to a &#39;deleting&#39; status, and we will immediately unconfigure the switch for the Virtual Circuit and issue a deletion on any associated Fabric connections. Any associated Metro VLANs on the virtual circuit will also be unassociated after the switch has been successfully unconfigured. If there are any associated Fabric connections, we will only fully delete the Virtual Circuit once we have checked that the Fabric connection was fully deprovisioned on Fabric.
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public VlanVirtualCircuit tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public VlanVirtualCircuit addTagsItem(String tagsItem) {
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
  @javax.annotation.Nonnull
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public VlanVirtualCircuit virtualNetwork(Href virtualNetwork) {
    
    this.virtualNetwork = virtualNetwork;
    return this;
  }

   /**
   * Get virtualNetwork
   * @return virtualNetwork
  **/
  @javax.annotation.Nonnull
  public Href getVirtualNetwork() {
    return virtualNetwork;
  }


  public void setVirtualNetwork(Href virtualNetwork) {
    this.virtualNetwork = virtualNetwork;
  }


  public VlanVirtualCircuit vnid(Integer vnid) {
    
    this.vnid = vnid;
    return this;
  }

   /**
   * Get vnid
   * @return vnid
  **/
  @javax.annotation.Nonnull
  public Integer getVnid() {
    return vnid;
  }


  public void setVnid(Integer vnid) {
    this.vnid = vnid;
  }


  public VlanVirtualCircuit createdAt(OffsetDateTime createdAt) {
    
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


  public VlanVirtualCircuit updatedAt(OffsetDateTime updatedAt) {
    
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
   * @return the VlanVirtualCircuit instance itself
   */
  public VlanVirtualCircuit putAdditionalProperty(String key, Object value) {
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
    VlanVirtualCircuit vlanVirtualCircuit = (VlanVirtualCircuit) o;
    return Objects.equals(this.bill, vlanVirtualCircuit.bill) &&
        Objects.equals(this.description, vlanVirtualCircuit.description) &&
        Objects.equals(this.id, vlanVirtualCircuit.id) &&
        Objects.equals(this.name, vlanVirtualCircuit.name) &&
        Objects.equals(this.nniVlan, vlanVirtualCircuit.nniVlan) &&
        Objects.equals(this.port, vlanVirtualCircuit.port) &&
        Objects.equals(this.project, vlanVirtualCircuit.project) &&
        Objects.equals(this.speed, vlanVirtualCircuit.speed) &&
        Objects.equals(this.status, vlanVirtualCircuit.status) &&
        Objects.equals(this.tags, vlanVirtualCircuit.tags) &&
        Objects.equals(this.virtualNetwork, vlanVirtualCircuit.virtualNetwork) &&
        Objects.equals(this.vnid, vlanVirtualCircuit.vnid) &&
        Objects.equals(this.createdAt, vlanVirtualCircuit.createdAt) &&
        Objects.equals(this.updatedAt, vlanVirtualCircuit.updatedAt)&&
        Objects.equals(this.additionalProperties, vlanVirtualCircuit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bill, description, id, name, nniVlan, port, project, speed, status, tags, virtualNetwork, vnid, createdAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VlanVirtualCircuit {\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nniVlan: ").append(toIndentedString(nniVlan)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    virtualNetwork: ").append(toIndentedString(virtualNetwork)).append("\n");
    sb.append("    vnid: ").append(toIndentedString(vnid)).append("\n");
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
    openapiFields.add("bill");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("nni_vlan");
    openapiFields.add("port");
    openapiFields.add("project");
    openapiFields.add("speed");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("virtual_network");
    openapiFields.add("vnid");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bill");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("nni_vlan");
    openapiRequiredFields.add("port");
    openapiRequiredFields.add("project");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("virtual_network");
    openapiRequiredFields.add("vnid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VlanVirtualCircuit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VlanVirtualCircuit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VlanVirtualCircuit is not found in the empty JSON string", VlanVirtualCircuit.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VlanVirtualCircuit.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `port`
      Href.validateJsonObject(jsonObj.getAsJsonObject("port"));
      // validate the required field `project`
      Href.validateJsonObject(jsonObj.getAsJsonObject("project"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // validate the required field `virtual_network`
      Href.validateJsonObject(jsonObj.getAsJsonObject("virtual_network"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VlanVirtualCircuit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VlanVirtualCircuit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VlanVirtualCircuit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VlanVirtualCircuit.class));

       return (TypeAdapter<T>) new TypeAdapter<VlanVirtualCircuit>() {
           @Override
           public void write(JsonWriter out, VlanVirtualCircuit value) throws IOException {
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
           public VlanVirtualCircuit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VlanVirtualCircuit instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VlanVirtualCircuit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VlanVirtualCircuit
  * @throws IOException if the JSON string is invalid with respect to VlanVirtualCircuit
  */
  public static VlanVirtualCircuit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VlanVirtualCircuit.class);
  }

 /**
  * Convert an instance of VlanVirtualCircuit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

