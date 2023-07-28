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
import com.equinix.openapi.metal.v1.model.Port;
import com.equinix.openapi.metal.v1.model.PortVlanAssignmentBatchVlanAssignmentsInner;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * PortVlanAssignmentBatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortVlanAssignmentBatch {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ERROR_MESSAGES = "error_messages";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGES)
  private List<String> errorMessages = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Port port;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    QUEUED("queued"),
    
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed"),
    
    FAILED("failed");

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

  public static final String SERIALIZED_NAME_VLAN_ASSIGNMENTS = "vlan_assignments";
  @SerializedName(SERIALIZED_NAME_VLAN_ASSIGNMENTS)
  private List<PortVlanAssignmentBatchVlanAssignmentsInner> vlanAssignments = null;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Href project;

  public PortVlanAssignmentBatch() {
  }

  public PortVlanAssignmentBatch createdAt(OffsetDateTime createdAt) {
    
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


  public PortVlanAssignmentBatch errorMessages(List<String> errorMessages) {
    
    this.errorMessages = errorMessages;
    return this;
  }

  public PortVlanAssignmentBatch addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<>();
    }
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

   /**
   * Get errorMessages
   * @return errorMessages
  **/
  @javax.annotation.Nullable

  public List<String> getErrorMessages() {
    return errorMessages;
  }


  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }


  public PortVlanAssignmentBatch id(UUID id) {
    
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


  public PortVlanAssignmentBatch port(Port port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable

  public Port getPort() {
    return port;
  }


  public void setPort(Port port) {
    this.port = port;
  }


  public PortVlanAssignmentBatch quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public PortVlanAssignmentBatch state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public PortVlanAssignmentBatch updatedAt(OffsetDateTime updatedAt) {
    
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


  public PortVlanAssignmentBatch vlanAssignments(List<PortVlanAssignmentBatchVlanAssignmentsInner> vlanAssignments) {
    
    this.vlanAssignments = vlanAssignments;
    return this;
  }

  public PortVlanAssignmentBatch addVlanAssignmentsItem(PortVlanAssignmentBatchVlanAssignmentsInner vlanAssignmentsItem) {
    if (this.vlanAssignments == null) {
      this.vlanAssignments = new ArrayList<>();
    }
    this.vlanAssignments.add(vlanAssignmentsItem);
    return this;
  }

   /**
   * Get vlanAssignments
   * @return vlanAssignments
  **/
  @javax.annotation.Nullable

  public List<PortVlanAssignmentBatchVlanAssignmentsInner> getVlanAssignments() {
    return vlanAssignments;
  }


  public void setVlanAssignments(List<PortVlanAssignmentBatchVlanAssignmentsInner> vlanAssignments) {
    this.vlanAssignments = vlanAssignments;
  }


  public PortVlanAssignmentBatch project(Href project) {
    
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
   * @return the PortVlanAssignmentBatch instance itself
   */
  public PortVlanAssignmentBatch putAdditionalProperty(String key, Object value) {
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
    PortVlanAssignmentBatch portVlanAssignmentBatch = (PortVlanAssignmentBatch) o;
    return Objects.equals(this.createdAt, portVlanAssignmentBatch.createdAt) &&
        Objects.equals(this.errorMessages, portVlanAssignmentBatch.errorMessages) &&
        Objects.equals(this.id, portVlanAssignmentBatch.id) &&
        Objects.equals(this.port, portVlanAssignmentBatch.port) &&
        Objects.equals(this.quantity, portVlanAssignmentBatch.quantity) &&
        Objects.equals(this.state, portVlanAssignmentBatch.state) &&
        Objects.equals(this.updatedAt, portVlanAssignmentBatch.updatedAt) &&
        Objects.equals(this.vlanAssignments, portVlanAssignmentBatch.vlanAssignments) &&
        Objects.equals(this.project, portVlanAssignmentBatch.project)&&
        Objects.equals(this.additionalProperties, portVlanAssignmentBatch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, errorMessages, id, port, quantity, state, updatedAt, vlanAssignments, project, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortVlanAssignmentBatch {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    vlanAssignments: ").append(toIndentedString(vlanAssignments)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
    openapiFields.add("error_messages");
    openapiFields.add("id");
    openapiFields.add("port");
    openapiFields.add("quantity");
    openapiFields.add("state");
    openapiFields.add("updated_at");
    openapiFields.add("vlan_assignments");
    openapiFields.add("project");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortVlanAssignmentBatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PortVlanAssignmentBatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortVlanAssignmentBatch is not found in the empty JSON string", PortVlanAssignmentBatch.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("error_messages") != null && !jsonObj.get("error_messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_messages` to be an array in the JSON string but got `%s`", jsonObj.get("error_messages").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `port`
      if (jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) {
        Port.validateJsonObject(jsonObj.getAsJsonObject("port"));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (jsonObj.get("vlan_assignments") != null && !jsonObj.get("vlan_assignments").isJsonNull()) {
        JsonArray jsonArrayvlanAssignments = jsonObj.getAsJsonArray("vlan_assignments");
        if (jsonArrayvlanAssignments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vlan_assignments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vlan_assignments` to be an array in the JSON string but got `%s`", jsonObj.get("vlan_assignments").toString()));
          }

          // validate the optional field `vlan_assignments` (array)
          for (int i = 0; i < jsonArrayvlanAssignments.size(); i++) {
            PortVlanAssignmentBatchVlanAssignmentsInner.validateJsonObject(jsonArrayvlanAssignments.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Href.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortVlanAssignmentBatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortVlanAssignmentBatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortVlanAssignmentBatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortVlanAssignmentBatch.class));

       return (TypeAdapter<T>) new TypeAdapter<PortVlanAssignmentBatch>() {
           @Override
           public void write(JsonWriter out, PortVlanAssignmentBatch value) throws IOException {
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
           public PortVlanAssignmentBatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PortVlanAssignmentBatch instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PortVlanAssignmentBatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortVlanAssignmentBatch
  * @throws IOException if the JSON string is invalid with respect to PortVlanAssignmentBatch
  */
  public static PortVlanAssignmentBatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortVlanAssignmentBatch.class);
  }

 /**
  * Convert an instance of PortVlanAssignmentBatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

