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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * BgpConfigRequestInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BgpConfigRequestInput {
  public static final String SERIALIZED_NAME_ASN = "asn";
  @SerializedName(SERIALIZED_NAME_ASN)
  private Integer asn;

  public static final String SERIALIZED_NAME_DEPLOYMENT_TYPE = "deployment_type";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_TYPE)
  private String deploymentType;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5;

  public static final String SERIALIZED_NAME_USE_CASE = "use_case";
  @SerializedName(SERIALIZED_NAME_USE_CASE)
  private String useCase;

  public BgpConfigRequestInput() {
  }

  public BgpConfigRequestInput asn(Integer asn) {
    
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getAsn() {
    return asn;
  }


  public void setAsn(Integer asn) {
    this.asn = asn;
  }


  public BgpConfigRequestInput deploymentType(String deploymentType) {
    
    this.deploymentType = deploymentType;
    return this;
  }

   /**
   * Get deploymentType
   * @return deploymentType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDeploymentType() {
    return deploymentType;
  }


  public void setDeploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
  }


  public BgpConfigRequestInput md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * Get md5
   * @return md5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMd5() {
    return md5;
  }


  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public BgpConfigRequestInput useCase(String useCase) {
    
    this.useCase = useCase;
    return this;
  }

   /**
   * Get useCase
   * @return useCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUseCase() {
    return useCase;
  }


  public void setUseCase(String useCase) {
    this.useCase = useCase;
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
  public BgpConfigRequestInput putAdditionalProperty(String key, Object value) {
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
    BgpConfigRequestInput bgpConfigRequestInput = (BgpConfigRequestInput) o;
    return Objects.equals(this.asn, bgpConfigRequestInput.asn) &&
        Objects.equals(this.deploymentType, bgpConfigRequestInput.deploymentType) &&
        Objects.equals(this.md5, bgpConfigRequestInput.md5) &&
        Objects.equals(this.useCase, bgpConfigRequestInput.useCase)&&
        Objects.equals(this.additionalProperties, bgpConfigRequestInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asn, deploymentType, md5, useCase, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpConfigRequestInput {\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    useCase: ").append(toIndentedString(useCase)).append("\n");
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
    openapiFields.add("asn");
    openapiFields.add("deployment_type");
    openapiFields.add("md5");
    openapiFields.add("use_case");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("asn");
    openapiRequiredFields.add("deployment_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BgpConfigRequestInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BgpConfigRequestInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BgpConfigRequestInput is not found in the empty JSON string", BgpConfigRequestInput.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BgpConfigRequestInput.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("deployment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deployment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deployment_type").toString()));
      }
      if ((jsonObj.get("md5") != null && !jsonObj.get("md5").isJsonNull()) && !jsonObj.get("md5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5").toString()));
      }
      if ((jsonObj.get("use_case") != null && !jsonObj.get("use_case").isJsonNull()) && !jsonObj.get("use_case").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `use_case` to be a primitive type in the JSON string but got `%s`", jsonObj.get("use_case").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BgpConfigRequestInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BgpConfigRequestInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BgpConfigRequestInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BgpConfigRequestInput.class));

       return (TypeAdapter<T>) new TypeAdapter<BgpConfigRequestInput>() {
           @Override
           public void write(JsonWriter out, BgpConfigRequestInput value) throws IOException {
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
           public BgpConfigRequestInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BgpConfigRequestInput instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BgpConfigRequestInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BgpConfigRequestInput
  * @throws IOException if the JSON string is invalid with respect to BgpConfigRequestInput
  */
  public static BgpConfigRequestInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BgpConfigRequestInput.class);
  }

 /**
  * Convert an instance of BgpConfigRequestInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

