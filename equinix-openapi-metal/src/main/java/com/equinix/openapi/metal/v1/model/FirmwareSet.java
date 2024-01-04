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
import com.equinix.openapi.metal.v1.model.Attribute;
import com.equinix.openapi.metal.v1.model.Component;
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
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * Represents a Firmware Set
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FirmwareSet {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<Attribute> attributes;

  public static final String SERIALIZED_NAME_COMPONENT_FIRMWARE = "component_firmware";
  @SerializedName(SERIALIZED_NAME_COMPONENT_FIRMWARE)
  private List<Component> componentFirmware;

  public FirmwareSet() {
  }

  
  public FirmwareSet(
     UUID uuid, 
     String name, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.uuid = uuid;
    this.name = name;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * Firmware Set UUID
   * @return uuid
  **/
  @javax.annotation.Nonnull
  public UUID getUuid() {
    return uuid;
  }




   /**
   * Firmware Set Name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }




   /**
   * Datetime when the block was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Datetime when the block was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  public FirmwareSet attributes(List<Attribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public FirmwareSet addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Represents a list of attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  public List<Attribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }


  public FirmwareSet componentFirmware(List<Component> componentFirmware) {
    
    this.componentFirmware = componentFirmware;
    return this;
  }

  public FirmwareSet addComponentFirmwareItem(Component componentFirmwareItem) {
    if (this.componentFirmware == null) {
      this.componentFirmware = new ArrayList<>();
    }
    this.componentFirmware.add(componentFirmwareItem);
    return this;
  }

   /**
   * List of components versions
   * @return componentFirmware
  **/
  @javax.annotation.Nullable
  public List<Component> getComponentFirmware() {
    return componentFirmware;
  }


  public void setComponentFirmware(List<Component> componentFirmware) {
    this.componentFirmware = componentFirmware;
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
   * @return the FirmwareSet instance itself
   */
  public FirmwareSet putAdditionalProperty(String key, Object value) {
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
    FirmwareSet firmwareSet = (FirmwareSet) o;
    return Objects.equals(this.uuid, firmwareSet.uuid) &&
        Objects.equals(this.name, firmwareSet.name) &&
        Objects.equals(this.createdAt, firmwareSet.createdAt) &&
        Objects.equals(this.updatedAt, firmwareSet.updatedAt) &&
        Objects.equals(this.attributes, firmwareSet.attributes) &&
        Objects.equals(this.componentFirmware, firmwareSet.componentFirmware)&&
        Objects.equals(this.additionalProperties, firmwareSet.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, createdAt, updatedAt, attributes, componentFirmware, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareSet {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    componentFirmware: ").append(toIndentedString(componentFirmware)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("name");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("attributes");
    openapiFields.add("component_firmware");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FirmwareSet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirmwareSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirmwareSet is not found in the empty JSON string", FirmwareSet.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FirmwareSet.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            Attribute.validateJsonElement(jsonArrayattributes.get(i));
          };
        }
      }
      if (jsonObj.get("component_firmware") != null && !jsonObj.get("component_firmware").isJsonNull()) {
        JsonArray jsonArraycomponentFirmware = jsonObj.getAsJsonArray("component_firmware");
        if (jsonArraycomponentFirmware != null) {
          // ensure the json data is an array
          if (!jsonObj.get("component_firmware").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `component_firmware` to be an array in the JSON string but got `%s`", jsonObj.get("component_firmware").toString()));
          }

          // validate the optional field `component_firmware` (array)
          for (int i = 0; i < jsonArraycomponentFirmware.size(); i++) {
            Component.validateJsonElement(jsonArraycomponentFirmware.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirmwareSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirmwareSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirmwareSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirmwareSet.class));

       return (TypeAdapter<T>) new TypeAdapter<FirmwareSet>() {
           @Override
           public void write(JsonWriter out, FirmwareSet value) throws IOException {
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
           public FirmwareSet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             FirmwareSet instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FirmwareSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirmwareSet
  * @throws IOException if the JSON string is invalid with respect to FirmwareSet
  */
  public static FirmwareSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirmwareSet.class);
  }

 /**
  * Convert an instance of FirmwareSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

