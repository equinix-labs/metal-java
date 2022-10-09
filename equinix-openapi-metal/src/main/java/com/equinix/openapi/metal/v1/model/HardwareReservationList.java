/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
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
import com.equinix.openapi.metal.v1.model.HardwareReservation;
import com.equinix.openapi.metal.v1.model.Meta;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * HardwareReservationList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HardwareReservationList {
  public static final String SERIALIZED_NAME_HARDWARE_RESERVATIONS = "hardware_reservations";
  @SerializedName(SERIALIZED_NAME_HARDWARE_RESERVATIONS)
  private List<HardwareReservation> hardwareReservations = null;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Meta meta;

  public HardwareReservationList() {
  }

  public HardwareReservationList hardwareReservations(List<HardwareReservation> hardwareReservations) {
    
    this.hardwareReservations = hardwareReservations;
    return this;
  }

  public HardwareReservationList addHardwareReservationsItem(HardwareReservation hardwareReservationsItem) {
    if (this.hardwareReservations == null) {
      this.hardwareReservations = new ArrayList<>();
    }
    this.hardwareReservations.add(hardwareReservationsItem);
    return this;
  }

   /**
   * Get hardwareReservations
   * @return hardwareReservations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HardwareReservation> getHardwareReservations() {
    return hardwareReservations;
  }


  public void setHardwareReservations(List<HardwareReservation> hardwareReservations) {
    this.hardwareReservations = hardwareReservations;
  }


  public HardwareReservationList meta(Meta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
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
   */
  public HardwareReservationList putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
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
    HardwareReservationList hardwareReservationList = (HardwareReservationList) o;
    return Objects.equals(this.hardwareReservations, hardwareReservationList.hardwareReservations) &&
        Objects.equals(this.meta, hardwareReservationList.meta)&&
        Objects.equals(this.additionalProperties, hardwareReservationList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hardwareReservations, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HardwareReservationList {\n");
    sb.append("    hardwareReservations: ").append(toIndentedString(hardwareReservations)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("hardware_reservations");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HardwareReservationList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HardwareReservationList.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HardwareReservationList is not found in the empty JSON string", HardwareReservationList.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("hardware_reservations") != null && !jsonObj.get("hardware_reservations").isJsonNull()) {
        JsonArray jsonArrayhardwareReservations = jsonObj.getAsJsonArray("hardware_reservations");
        if (jsonArrayhardwareReservations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hardware_reservations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hardware_reservations` to be an array in the JSON string but got `%s`", jsonObj.get("hardware_reservations").toString()));
          }

          // validate the optional field `hardware_reservations` (array)
          for (int i = 0; i < jsonArrayhardwareReservations.size(); i++) {
            HardwareReservation.validateJsonObject(jsonArrayhardwareReservations.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        Meta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HardwareReservationList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HardwareReservationList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HardwareReservationList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HardwareReservationList.class));

       return (TypeAdapter<T>) new TypeAdapter<HardwareReservationList>() {
           @Override
           public void write(JsonWriter out, HardwareReservationList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
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
           public HardwareReservationList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             HardwareReservationList instance = thisAdapter.fromJsonTree(jsonObj);
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
                 } else { // non-primitive type
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
  * Create an instance of HardwareReservationList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HardwareReservationList
  * @throws IOException if the JSON string is invalid with respect to HardwareReservationList
  */
  public static HardwareReservationList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HardwareReservationList.class);
  }

 /**
  * Convert an instance of HardwareReservationList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

