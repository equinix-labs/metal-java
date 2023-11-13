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
import com.equinix.openapi.metal.v1.model.SpotPricesPerFacility;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * SpotMarketPricesPerMetroReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpotMarketPricesPerMetroReport {
  public static final String SERIALIZED_NAME_AM = "am";
  @SerializedName(SERIALIZED_NAME_AM)
  private SpotPricesPerFacility am;

  public static final String SERIALIZED_NAME_CH = "ch";
  @SerializedName(SERIALIZED_NAME_CH)
  private SpotPricesPerFacility ch;

  public static final String SERIALIZED_NAME_DA = "da";
  @SerializedName(SERIALIZED_NAME_DA)
  private SpotPricesPerFacility da;

  public static final String SERIALIZED_NAME_LA = "la";
  @SerializedName(SERIALIZED_NAME_LA)
  private SpotPricesPerFacility la;

  public static final String SERIALIZED_NAME_NY = "ny";
  @SerializedName(SERIALIZED_NAME_NY)
  private SpotPricesPerFacility ny;

  public static final String SERIALIZED_NAME_SG = "sg";
  @SerializedName(SERIALIZED_NAME_SG)
  private SpotPricesPerFacility sg;

  public static final String SERIALIZED_NAME_SV = "sv";
  @SerializedName(SERIALIZED_NAME_SV)
  private SpotPricesPerFacility sv;

  public SpotMarketPricesPerMetroReport() {
  }

  public SpotMarketPricesPerMetroReport am(SpotPricesPerFacility am) {
    
    this.am = am;
    return this;
  }

   /**
   * Get am
   * @return am
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getAm() {
    return am;
  }


  public void setAm(SpotPricesPerFacility am) {
    this.am = am;
  }


  public SpotMarketPricesPerMetroReport ch(SpotPricesPerFacility ch) {
    
    this.ch = ch;
    return this;
  }

   /**
   * Get ch
   * @return ch
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getCh() {
    return ch;
  }


  public void setCh(SpotPricesPerFacility ch) {
    this.ch = ch;
  }


  public SpotMarketPricesPerMetroReport da(SpotPricesPerFacility da) {
    
    this.da = da;
    return this;
  }

   /**
   * Get da
   * @return da
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getDa() {
    return da;
  }


  public void setDa(SpotPricesPerFacility da) {
    this.da = da;
  }


  public SpotMarketPricesPerMetroReport la(SpotPricesPerFacility la) {
    
    this.la = la;
    return this;
  }

   /**
   * Get la
   * @return la
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getLa() {
    return la;
  }


  public void setLa(SpotPricesPerFacility la) {
    this.la = la;
  }


  public SpotMarketPricesPerMetroReport ny(SpotPricesPerFacility ny) {
    
    this.ny = ny;
    return this;
  }

   /**
   * Get ny
   * @return ny
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getNy() {
    return ny;
  }


  public void setNy(SpotPricesPerFacility ny) {
    this.ny = ny;
  }


  public SpotMarketPricesPerMetroReport sg(SpotPricesPerFacility sg) {
    
    this.sg = sg;
    return this;
  }

   /**
   * Get sg
   * @return sg
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getSg() {
    return sg;
  }


  public void setSg(SpotPricesPerFacility sg) {
    this.sg = sg;
  }


  public SpotMarketPricesPerMetroReport sv(SpotPricesPerFacility sv) {
    
    this.sv = sv;
    return this;
  }

   /**
   * Get sv
   * @return sv
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getSv() {
    return sv;
  }


  public void setSv(SpotPricesPerFacility sv) {
    this.sv = sv;
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
   * @return the SpotMarketPricesPerMetroReport instance itself
   */
  public SpotMarketPricesPerMetroReport putAdditionalProperty(String key, Object value) {
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
    SpotMarketPricesPerMetroReport spotMarketPricesPerMetroReport = (SpotMarketPricesPerMetroReport) o;
    return Objects.equals(this.am, spotMarketPricesPerMetroReport.am) &&
        Objects.equals(this.ch, spotMarketPricesPerMetroReport.ch) &&
        Objects.equals(this.da, spotMarketPricesPerMetroReport.da) &&
        Objects.equals(this.la, spotMarketPricesPerMetroReport.la) &&
        Objects.equals(this.ny, spotMarketPricesPerMetroReport.ny) &&
        Objects.equals(this.sg, spotMarketPricesPerMetroReport.sg) &&
        Objects.equals(this.sv, spotMarketPricesPerMetroReport.sv)&&
        Objects.equals(this.additionalProperties, spotMarketPricesPerMetroReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(am, ch, da, la, ny, sg, sv, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpotMarketPricesPerMetroReport {\n");
    sb.append("    am: ").append(toIndentedString(am)).append("\n");
    sb.append("    ch: ").append(toIndentedString(ch)).append("\n");
    sb.append("    da: ").append(toIndentedString(da)).append("\n");
    sb.append("    la: ").append(toIndentedString(la)).append("\n");
    sb.append("    ny: ").append(toIndentedString(ny)).append("\n");
    sb.append("    sg: ").append(toIndentedString(sg)).append("\n");
    sb.append("    sv: ").append(toIndentedString(sv)).append("\n");
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
    openapiFields.add("am");
    openapiFields.add("ch");
    openapiFields.add("da");
    openapiFields.add("la");
    openapiFields.add("ny");
    openapiFields.add("sg");
    openapiFields.add("sv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SpotMarketPricesPerMetroReport
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SpotMarketPricesPerMetroReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpotMarketPricesPerMetroReport is not found in the empty JSON string", SpotMarketPricesPerMetroReport.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `am`
      if (jsonObj.get("am") != null && !jsonObj.get("am").isJsonNull()) {
        SpotPricesPerFacility.validateJsonElement(jsonObj.get("am"));
      }
      // validate the optional field `ch`
      if (jsonObj.get("ch") != null && !jsonObj.get("ch").isJsonNull()) {
        SpotPricesPerFacility.validateJsonElement(jsonObj.get("ch"));
      }
      // validate the optional field `da`
      if (jsonObj.get("da") != null && !jsonObj.get("da").isJsonNull()) {
        SpotPricesPerFacility.validateJsonElement(jsonObj.get("da"));
      }
      // validate the optional field `la`
      if (jsonObj.get("la") != null && !jsonObj.get("la").isJsonNull()) {
        SpotPricesPerFacility.validateJsonElement(jsonObj.get("la"));
      }
      // validate the optional field `ny`
      if (jsonObj.get("ny") != null && !jsonObj.get("ny").isJsonNull()) {
        SpotPricesPerFacility.validateJsonElement(jsonObj.get("ny"));
      }
      // validate the optional field `sg`
      if (jsonObj.get("sg") != null && !jsonObj.get("sg").isJsonNull()) {
        SpotPricesPerFacility.validateJsonElement(jsonObj.get("sg"));
      }
      // validate the optional field `sv`
      if (jsonObj.get("sv") != null && !jsonObj.get("sv").isJsonNull()) {
        SpotPricesPerFacility.validateJsonElement(jsonObj.get("sv"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpotMarketPricesPerMetroReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpotMarketPricesPerMetroReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpotMarketPricesPerMetroReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpotMarketPricesPerMetroReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SpotMarketPricesPerMetroReport>() {
           @Override
           public void write(JsonWriter out, SpotMarketPricesPerMetroReport value) throws IOException {
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
           public SpotMarketPricesPerMetroReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SpotMarketPricesPerMetroReport instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SpotMarketPricesPerMetroReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpotMarketPricesPerMetroReport
  * @throws IOException if the JSON string is invalid with respect to SpotMarketPricesPerMetroReport
  */
  public static SpotMarketPricesPerMetroReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpotMarketPricesPerMetroReport.class);
  }

 /**
  * Convert an instance of SpotMarketPricesPerMetroReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

