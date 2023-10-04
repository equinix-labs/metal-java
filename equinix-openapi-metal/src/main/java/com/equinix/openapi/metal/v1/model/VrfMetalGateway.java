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
import com.equinix.openapi.metal.v1.model.Project;
import com.equinix.openapi.metal.v1.model.VirtualNetwork;
import com.equinix.openapi.metal.v1.model.Vrf;
import com.equinix.openapi.metal.v1.model.VrfIpReservationOrHref;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * VrfMetalGateway
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VrfMetalGateway {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Href createdBy;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IP_RESERVATION = "ip_reservation";
  @SerializedName(SERIALIZED_NAME_IP_RESERVATION)
  private VrfIpReservationOrHref ipReservation;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  /**
   * The current state of the Metal Gateway. &#39;Ready&#39; indicates the gateway record has been configured, but is currently not active on the network. &#39;Active&#39; indicates the gateway has been configured on the network. &#39;Deleting&#39; is a temporary state used to indicate that the gateway is in the process of being un-configured from the network, after which the gateway record will be deleted.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    READY("ready"),
    
    ACTIVE("active"),
    
    DELETING("deleting");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VIRTUAL_NETWORK = "virtual_network";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NETWORK)
  private VirtualNetwork virtualNetwork;

  public static final String SERIALIZED_NAME_VRF = "vrf";
  @SerializedName(SERIALIZED_NAME_VRF)
  private Vrf vrf;

  public VrfMetalGateway() {
  }

  public VrfMetalGateway createdAt(OffsetDateTime createdAt) {
    
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


  public VrfMetalGateway createdBy(Href createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  public Href getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Href createdBy) {
    this.createdBy = createdBy;
  }


  public VrfMetalGateway href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public VrfMetalGateway id(UUID id) {
    
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


  public VrfMetalGateway ipReservation(VrfIpReservationOrHref ipReservation) {
    
    this.ipReservation = ipReservation;
    return this;
  }

   /**
   * Get ipReservation
   * @return ipReservation
  **/
  @javax.annotation.Nullable
  public VrfIpReservationOrHref getIpReservation() {
    return ipReservation;
  }


  public void setIpReservation(VrfIpReservationOrHref ipReservation) {
    this.ipReservation = ipReservation;
  }


  public VrfMetalGateway project(Project project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  public Project getProject() {
    return project;
  }


  public void setProject(Project project) {
    this.project = project;
  }


  public VrfMetalGateway state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The current state of the Metal Gateway. &#39;Ready&#39; indicates the gateway record has been configured, but is currently not active on the network. &#39;Active&#39; indicates the gateway has been configured on the network. &#39;Deleting&#39; is a temporary state used to indicate that the gateway is in the process of being un-configured from the network, after which the gateway record will be deleted.
   * @return state
  **/
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public VrfMetalGateway updatedAt(OffsetDateTime updatedAt) {
    
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


  public VrfMetalGateway virtualNetwork(VirtualNetwork virtualNetwork) {
    
    this.virtualNetwork = virtualNetwork;
    return this;
  }

   /**
   * Get virtualNetwork
   * @return virtualNetwork
  **/
  @javax.annotation.Nullable
  public VirtualNetwork getVirtualNetwork() {
    return virtualNetwork;
  }


  public void setVirtualNetwork(VirtualNetwork virtualNetwork) {
    this.virtualNetwork = virtualNetwork;
  }


  public VrfMetalGateway vrf(Vrf vrf) {
    
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
   * @return the VrfMetalGateway instance itself
   */
  public VrfMetalGateway putAdditionalProperty(String key, Object value) {
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
    VrfMetalGateway vrfMetalGateway = (VrfMetalGateway) o;
    return Objects.equals(this.createdAt, vrfMetalGateway.createdAt) &&
        Objects.equals(this.createdBy, vrfMetalGateway.createdBy) &&
        Objects.equals(this.href, vrfMetalGateway.href) &&
        Objects.equals(this.id, vrfMetalGateway.id) &&
        Objects.equals(this.ipReservation, vrfMetalGateway.ipReservation) &&
        Objects.equals(this.project, vrfMetalGateway.project) &&
        Objects.equals(this.state, vrfMetalGateway.state) &&
        Objects.equals(this.updatedAt, vrfMetalGateway.updatedAt) &&
        Objects.equals(this.virtualNetwork, vrfMetalGateway.virtualNetwork) &&
        Objects.equals(this.vrf, vrfMetalGateway.vrf)&&
        Objects.equals(this.additionalProperties, vrfMetalGateway.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, href, id, ipReservation, project, state, updatedAt, virtualNetwork, vrf, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VrfMetalGateway {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipReservation: ").append(toIndentedString(ipReservation)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    virtualNetwork: ").append(toIndentedString(virtualNetwork)).append("\n");
    sb.append("    vrf: ").append(toIndentedString(vrf)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("created_by");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("ip_reservation");
    openapiFields.add("project");
    openapiFields.add("state");
    openapiFields.add("updated_at");
    openapiFields.add("virtual_network");
    openapiFields.add("vrf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vrf");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VrfMetalGateway
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VrfMetalGateway.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VrfMetalGateway is not found in the empty JSON string", VrfMetalGateway.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VrfMetalGateway.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        Href.validateJsonElement(jsonObj.get("created_by"));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `ip_reservation`
      if (jsonObj.get("ip_reservation") != null && !jsonObj.get("ip_reservation").isJsonNull()) {
        VrfIpReservationOrHref.validateJsonElement(jsonObj.get("ip_reservation"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonElement(jsonObj.get("project"));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `virtual_network`
      if (jsonObj.get("virtual_network") != null && !jsonObj.get("virtual_network").isJsonNull()) {
        VirtualNetwork.validateJsonElement(jsonObj.get("virtual_network"));
      }
      // validate the required field `vrf`
      Vrf.validateJsonElement(jsonObj.get("vrf"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VrfMetalGateway.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VrfMetalGateway' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VrfMetalGateway> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VrfMetalGateway.class));

       return (TypeAdapter<T>) new TypeAdapter<VrfMetalGateway>() {
           @Override
           public void write(JsonWriter out, VrfMetalGateway value) throws IOException {
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
           public VrfMetalGateway read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VrfMetalGateway instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VrfMetalGateway given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VrfMetalGateway
  * @throws IOException if the JSON string is invalid with respect to VrfMetalGateway
  */
  public static VrfMetalGateway fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VrfMetalGateway.class);
  }

 /**
  * Convert an instance of VrfMetalGateway to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

