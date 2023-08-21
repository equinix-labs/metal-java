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
import com.equinix.openapi.metal.v1.model.SpotPricesPerFacility;
import com.equinix.openapi.metal.v1.model.SpotPricesPerNewFacility;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * SpotPricesReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpotPricesReport {
  public static final String SERIALIZED_NAME_AMS1 = "ams1";
  @SerializedName(SERIALIZED_NAME_AMS1)
  private SpotPricesPerFacility ams1;

  public static final String SERIALIZED_NAME_ATL1 = "atl1";
  @SerializedName(SERIALIZED_NAME_ATL1)
  private SpotPricesPerNewFacility atl1;

  public static final String SERIALIZED_NAME_DFW1 = "dfw1";
  @SerializedName(SERIALIZED_NAME_DFW1)
  private SpotPricesPerNewFacility dfw1;

  public static final String SERIALIZED_NAME_EWR1 = "ewr1";
  @SerializedName(SERIALIZED_NAME_EWR1)
  private SpotPricesPerFacility ewr1;

  public static final String SERIALIZED_NAME_FRA1 = "fra1";
  @SerializedName(SERIALIZED_NAME_FRA1)
  private SpotPricesPerNewFacility fra1;

  public static final String SERIALIZED_NAME_IAD1 = "iad1";
  @SerializedName(SERIALIZED_NAME_IAD1)
  private SpotPricesPerNewFacility iad1;

  public static final String SERIALIZED_NAME_LAX1 = "lax1";
  @SerializedName(SERIALIZED_NAME_LAX1)
  private SpotPricesPerNewFacility lax1;

  public static final String SERIALIZED_NAME_NRT1 = "nrt1";
  @SerializedName(SERIALIZED_NAME_NRT1)
  private SpotPricesPerFacility nrt1;

  public static final String SERIALIZED_NAME_ORD1 = "ord1";
  @SerializedName(SERIALIZED_NAME_ORD1)
  private SpotPricesPerNewFacility ord1;

  public static final String SERIALIZED_NAME_SEA1 = "sea1";
  @SerializedName(SERIALIZED_NAME_SEA1)
  private SpotPricesPerNewFacility sea1;

  public static final String SERIALIZED_NAME_SIN1 = "sin1";
  @SerializedName(SERIALIZED_NAME_SIN1)
  private SpotPricesPerNewFacility sin1;

  public static final String SERIALIZED_NAME_SJC1 = "sjc1";
  @SerializedName(SERIALIZED_NAME_SJC1)
  private SpotPricesPerFacility sjc1;

  public static final String SERIALIZED_NAME_SYD1 = "syd1";
  @SerializedName(SERIALIZED_NAME_SYD1)
  private SpotPricesPerNewFacility syd1;

  public static final String SERIALIZED_NAME_YYZ1 = "yyz1";
  @SerializedName(SERIALIZED_NAME_YYZ1)
  private SpotPricesPerNewFacility yyz1;

  public SpotPricesReport() {
  }

  public SpotPricesReport ams1(SpotPricesPerFacility ams1) {
    
    this.ams1 = ams1;
    return this;
  }

   /**
   * Get ams1
   * @return ams1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getAms1() {
    return ams1;
  }


  public void setAms1(SpotPricesPerFacility ams1) {
    this.ams1 = ams1;
  }


  public SpotPricesReport atl1(SpotPricesPerNewFacility atl1) {
    
    this.atl1 = atl1;
    return this;
  }

   /**
   * Get atl1
   * @return atl1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerNewFacility getAtl1() {
    return atl1;
  }


  public void setAtl1(SpotPricesPerNewFacility atl1) {
    this.atl1 = atl1;
  }


  public SpotPricesReport dfw1(SpotPricesPerNewFacility dfw1) {
    
    this.dfw1 = dfw1;
    return this;
  }

   /**
   * Get dfw1
   * @return dfw1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerNewFacility getDfw1() {
    return dfw1;
  }


  public void setDfw1(SpotPricesPerNewFacility dfw1) {
    this.dfw1 = dfw1;
  }


  public SpotPricesReport ewr1(SpotPricesPerFacility ewr1) {
    
    this.ewr1 = ewr1;
    return this;
  }

   /**
   * Get ewr1
   * @return ewr1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getEwr1() {
    return ewr1;
  }


  public void setEwr1(SpotPricesPerFacility ewr1) {
    this.ewr1 = ewr1;
  }


  public SpotPricesReport fra1(SpotPricesPerNewFacility fra1) {
    
    this.fra1 = fra1;
    return this;
  }

   /**
   * Get fra1
   * @return fra1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerNewFacility getFra1() {
    return fra1;
  }


  public void setFra1(SpotPricesPerNewFacility fra1) {
    this.fra1 = fra1;
  }


  public SpotPricesReport iad1(SpotPricesPerNewFacility iad1) {
    
    this.iad1 = iad1;
    return this;
  }

   /**
   * Get iad1
   * @return iad1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerNewFacility getIad1() {
    return iad1;
  }


  public void setIad1(SpotPricesPerNewFacility iad1) {
    this.iad1 = iad1;
  }


  public SpotPricesReport lax1(SpotPricesPerNewFacility lax1) {
    
    this.lax1 = lax1;
    return this;
  }

   /**
   * Get lax1
   * @return lax1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerNewFacility getLax1() {
    return lax1;
  }


  public void setLax1(SpotPricesPerNewFacility lax1) {
    this.lax1 = lax1;
  }


  public SpotPricesReport nrt1(SpotPricesPerFacility nrt1) {
    
    this.nrt1 = nrt1;
    return this;
  }

   /**
   * Get nrt1
   * @return nrt1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getNrt1() {
    return nrt1;
  }


  public void setNrt1(SpotPricesPerFacility nrt1) {
    this.nrt1 = nrt1;
  }


  public SpotPricesReport ord1(SpotPricesPerNewFacility ord1) {
    
    this.ord1 = ord1;
    return this;
  }

   /**
   * Get ord1
   * @return ord1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerNewFacility getOrd1() {
    return ord1;
  }


  public void setOrd1(SpotPricesPerNewFacility ord1) {
    this.ord1 = ord1;
  }


  public SpotPricesReport sea1(SpotPricesPerNewFacility sea1) {
    
    this.sea1 = sea1;
    return this;
  }

   /**
   * Get sea1
   * @return sea1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerNewFacility getSea1() {
    return sea1;
  }


  public void setSea1(SpotPricesPerNewFacility sea1) {
    this.sea1 = sea1;
  }


  public SpotPricesReport sin1(SpotPricesPerNewFacility sin1) {
    
    this.sin1 = sin1;
    return this;
  }

   /**
   * Get sin1
   * @return sin1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerNewFacility getSin1() {
    return sin1;
  }


  public void setSin1(SpotPricesPerNewFacility sin1) {
    this.sin1 = sin1;
  }


  public SpotPricesReport sjc1(SpotPricesPerFacility sjc1) {
    
    this.sjc1 = sjc1;
    return this;
  }

   /**
   * Get sjc1
   * @return sjc1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerFacility getSjc1() {
    return sjc1;
  }


  public void setSjc1(SpotPricesPerFacility sjc1) {
    this.sjc1 = sjc1;
  }


  public SpotPricesReport syd1(SpotPricesPerNewFacility syd1) {
    
    this.syd1 = syd1;
    return this;
  }

   /**
   * Get syd1
   * @return syd1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerNewFacility getSyd1() {
    return syd1;
  }


  public void setSyd1(SpotPricesPerNewFacility syd1) {
    this.syd1 = syd1;
  }


  public SpotPricesReport yyz1(SpotPricesPerNewFacility yyz1) {
    
    this.yyz1 = yyz1;
    return this;
  }

   /**
   * Get yyz1
   * @return yyz1
  **/
  @javax.annotation.Nullable
  public SpotPricesPerNewFacility getYyz1() {
    return yyz1;
  }


  public void setYyz1(SpotPricesPerNewFacility yyz1) {
    this.yyz1 = yyz1;
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
   * @return the SpotPricesReport instance itself
   */
  public SpotPricesReport putAdditionalProperty(String key, Object value) {
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
    SpotPricesReport spotPricesReport = (SpotPricesReport) o;
    return Objects.equals(this.ams1, spotPricesReport.ams1) &&
        Objects.equals(this.atl1, spotPricesReport.atl1) &&
        Objects.equals(this.dfw1, spotPricesReport.dfw1) &&
        Objects.equals(this.ewr1, spotPricesReport.ewr1) &&
        Objects.equals(this.fra1, spotPricesReport.fra1) &&
        Objects.equals(this.iad1, spotPricesReport.iad1) &&
        Objects.equals(this.lax1, spotPricesReport.lax1) &&
        Objects.equals(this.nrt1, spotPricesReport.nrt1) &&
        Objects.equals(this.ord1, spotPricesReport.ord1) &&
        Objects.equals(this.sea1, spotPricesReport.sea1) &&
        Objects.equals(this.sin1, spotPricesReport.sin1) &&
        Objects.equals(this.sjc1, spotPricesReport.sjc1) &&
        Objects.equals(this.syd1, spotPricesReport.syd1) &&
        Objects.equals(this.yyz1, spotPricesReport.yyz1)&&
        Objects.equals(this.additionalProperties, spotPricesReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ams1, atl1, dfw1, ewr1, fra1, iad1, lax1, nrt1, ord1, sea1, sin1, sjc1, syd1, yyz1, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpotPricesReport {\n");
    sb.append("    ams1: ").append(toIndentedString(ams1)).append("\n");
    sb.append("    atl1: ").append(toIndentedString(atl1)).append("\n");
    sb.append("    dfw1: ").append(toIndentedString(dfw1)).append("\n");
    sb.append("    ewr1: ").append(toIndentedString(ewr1)).append("\n");
    sb.append("    fra1: ").append(toIndentedString(fra1)).append("\n");
    sb.append("    iad1: ").append(toIndentedString(iad1)).append("\n");
    sb.append("    lax1: ").append(toIndentedString(lax1)).append("\n");
    sb.append("    nrt1: ").append(toIndentedString(nrt1)).append("\n");
    sb.append("    ord1: ").append(toIndentedString(ord1)).append("\n");
    sb.append("    sea1: ").append(toIndentedString(sea1)).append("\n");
    sb.append("    sin1: ").append(toIndentedString(sin1)).append("\n");
    sb.append("    sjc1: ").append(toIndentedString(sjc1)).append("\n");
    sb.append("    syd1: ").append(toIndentedString(syd1)).append("\n");
    sb.append("    yyz1: ").append(toIndentedString(yyz1)).append("\n");
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
    openapiFields.add("ams1");
    openapiFields.add("atl1");
    openapiFields.add("dfw1");
    openapiFields.add("ewr1");
    openapiFields.add("fra1");
    openapiFields.add("iad1");
    openapiFields.add("lax1");
    openapiFields.add("nrt1");
    openapiFields.add("ord1");
    openapiFields.add("sea1");
    openapiFields.add("sin1");
    openapiFields.add("sjc1");
    openapiFields.add("syd1");
    openapiFields.add("yyz1");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpotPricesReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SpotPricesReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpotPricesReport is not found in the empty JSON string", SpotPricesReport.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `ams1`
      if (jsonObj.get("ams1") != null && !jsonObj.get("ams1").isJsonNull()) {
        SpotPricesPerFacility.validateJsonObject(jsonObj.getAsJsonObject("ams1"));
      }
      // validate the optional field `atl1`
      if (jsonObj.get("atl1") != null && !jsonObj.get("atl1").isJsonNull()) {
        SpotPricesPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("atl1"));
      }
      // validate the optional field `dfw1`
      if (jsonObj.get("dfw1") != null && !jsonObj.get("dfw1").isJsonNull()) {
        SpotPricesPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("dfw1"));
      }
      // validate the optional field `ewr1`
      if (jsonObj.get("ewr1") != null && !jsonObj.get("ewr1").isJsonNull()) {
        SpotPricesPerFacility.validateJsonObject(jsonObj.getAsJsonObject("ewr1"));
      }
      // validate the optional field `fra1`
      if (jsonObj.get("fra1") != null && !jsonObj.get("fra1").isJsonNull()) {
        SpotPricesPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("fra1"));
      }
      // validate the optional field `iad1`
      if (jsonObj.get("iad1") != null && !jsonObj.get("iad1").isJsonNull()) {
        SpotPricesPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("iad1"));
      }
      // validate the optional field `lax1`
      if (jsonObj.get("lax1") != null && !jsonObj.get("lax1").isJsonNull()) {
        SpotPricesPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("lax1"));
      }
      // validate the optional field `nrt1`
      if (jsonObj.get("nrt1") != null && !jsonObj.get("nrt1").isJsonNull()) {
        SpotPricesPerFacility.validateJsonObject(jsonObj.getAsJsonObject("nrt1"));
      }
      // validate the optional field `ord1`
      if (jsonObj.get("ord1") != null && !jsonObj.get("ord1").isJsonNull()) {
        SpotPricesPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("ord1"));
      }
      // validate the optional field `sea1`
      if (jsonObj.get("sea1") != null && !jsonObj.get("sea1").isJsonNull()) {
        SpotPricesPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("sea1"));
      }
      // validate the optional field `sin1`
      if (jsonObj.get("sin1") != null && !jsonObj.get("sin1").isJsonNull()) {
        SpotPricesPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("sin1"));
      }
      // validate the optional field `sjc1`
      if (jsonObj.get("sjc1") != null && !jsonObj.get("sjc1").isJsonNull()) {
        SpotPricesPerFacility.validateJsonObject(jsonObj.getAsJsonObject("sjc1"));
      }
      // validate the optional field `syd1`
      if (jsonObj.get("syd1") != null && !jsonObj.get("syd1").isJsonNull()) {
        SpotPricesPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("syd1"));
      }
      // validate the optional field `yyz1`
      if (jsonObj.get("yyz1") != null && !jsonObj.get("yyz1").isJsonNull()) {
        SpotPricesPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("yyz1"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpotPricesReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpotPricesReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpotPricesReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpotPricesReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SpotPricesReport>() {
           @Override
           public void write(JsonWriter out, SpotPricesReport value) throws IOException {
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
           public SpotPricesReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SpotPricesReport instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SpotPricesReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpotPricesReport
  * @throws IOException if the JSON string is invalid with respect to SpotPricesReport
  */
  public static SpotPricesReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpotPricesReport.class);
  }

 /**
  * Convert an instance of SpotPricesReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

