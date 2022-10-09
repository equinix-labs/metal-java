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
import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.PlanAvailableInMetrosInner;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * Plan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Plan {
  public static final String SERIALIZED_NAME_AVAILABLE_IN = "available_in";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_IN)
  private List<Href> availableIn = null;

  public static final String SERIALIZED_NAME_DEPLOYMENT_TYPES = "deployment_types";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_TYPES)
  private List<String> deploymentTypes = null;

  public static final String SERIALIZED_NAME_AVAILABLE_IN_METROS = "available_in_metros";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_IN_METROS)
  private List<PlanAvailableInMetrosInner> availableInMetros = null;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LEGACY = "legacy";
  @SerializedName(SERIALIZED_NAME_LEGACY)
  private Boolean legacy;

  public static final String SERIALIZED_NAME_LINE = "line";
  @SerializedName(SERIALIZED_NAME_LINE)
  private String line;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private Object pricing;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_SPECS = "specs";
  @SerializedName(SERIALIZED_NAME_SPECS)
  private Object specs;

  public Plan() {
  }

  public Plan availableIn(List<Href> availableIn) {
    
    this.availableIn = availableIn;
    return this;
  }

  public Plan addAvailableInItem(Href availableInItem) {
    if (this.availableIn == null) {
      this.availableIn = new ArrayList<>();
    }
    this.availableIn.add(availableInItem);
    return this;
  }

   /**
   * Shows which facilities the plan is available in, and the facility-based price if it is different from the default price.
   * @return availableIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows which facilities the plan is available in, and the facility-based price if it is different from the default price.")

  public List<Href> getAvailableIn() {
    return availableIn;
  }


  public void setAvailableIn(List<Href> availableIn) {
    this.availableIn = availableIn;
  }


  public Plan deploymentTypes(List<String> deploymentTypes) {
    
    this.deploymentTypes = deploymentTypes;
    return this;
  }

  public Plan addDeploymentTypesItem(String deploymentTypesItem) {
    if (this.deploymentTypes == null) {
      this.deploymentTypes = new ArrayList<>();
    }
    this.deploymentTypes.add(deploymentTypesItem);
    return this;
  }

   /**
   * Get deploymentTypes
   * @return deploymentTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDeploymentTypes() {
    return deploymentTypes;
  }


  public void setDeploymentTypes(List<String> deploymentTypes) {
    this.deploymentTypes = deploymentTypes;
  }


  public Plan availableInMetros(List<PlanAvailableInMetrosInner> availableInMetros) {
    
    this.availableInMetros = availableInMetros;
    return this;
  }

  public Plan addAvailableInMetrosItem(PlanAvailableInMetrosInner availableInMetrosItem) {
    if (this.availableInMetros == null) {
      this.availableInMetros = new ArrayList<>();
    }
    this.availableInMetros.add(availableInMetrosItem);
    return this;
  }

   /**
   * Shows which metros the plan is available in, and the metro-based price if it is different from the default price.
   * @return availableInMetros
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows which metros the plan is available in, and the metro-based price if it is different from the default price.")

  public List<PlanAvailableInMetrosInner> getAvailableInMetros() {
    return availableInMetros;
  }


  public void setAvailableInMetros(List<PlanAvailableInMetrosInner> availableInMetros) {
    this.availableInMetros = availableInMetros;
  }


  public Plan propertyClass(String propertyClass) {
    
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropertyClass() {
    return propertyClass;
  }


  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  public Plan description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Plan id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Plan legacy(Boolean legacy) {
    
    this.legacy = legacy;
    return this;
  }

   /**
   * Get legacy
   * @return legacy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLegacy() {
    return legacy;
  }


  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }


  public Plan line(String line) {
    
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLine() {
    return line;
  }


  public void setLine(String line) {
    this.line = line;
  }


  public Plan name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Plan pricing(Object pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPricing() {
    return pricing;
  }


  public void setPricing(Object pricing) {
    this.pricing = pricing;
  }


  public Plan slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public Plan specs(Object specs) {
    
    this.specs = specs;
    return this;
  }

   /**
   * Get specs
   * @return specs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSpecs() {
    return specs;
  }


  public void setSpecs(Object specs) {
    this.specs = specs;
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
  public Plan putAdditionalProperty(String key, Object value) {
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
    Plan plan = (Plan) o;
    return Objects.equals(this.availableIn, plan.availableIn) &&
        Objects.equals(this.deploymentTypes, plan.deploymentTypes) &&
        Objects.equals(this.availableInMetros, plan.availableInMetros) &&
        Objects.equals(this.propertyClass, plan.propertyClass) &&
        Objects.equals(this.description, plan.description) &&
        Objects.equals(this.id, plan.id) &&
        Objects.equals(this.legacy, plan.legacy) &&
        Objects.equals(this.line, plan.line) &&
        Objects.equals(this.name, plan.name) &&
        Objects.equals(this.pricing, plan.pricing) &&
        Objects.equals(this.slug, plan.slug) &&
        Objects.equals(this.specs, plan.specs)&&
        Objects.equals(this.additionalProperties, plan.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableIn, deploymentTypes, availableInMetros, propertyClass, description, id, legacy, line, name, pricing, slug, specs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    sb.append("    availableIn: ").append(toIndentedString(availableIn)).append("\n");
    sb.append("    deploymentTypes: ").append(toIndentedString(deploymentTypes)).append("\n");
    sb.append("    availableInMetros: ").append(toIndentedString(availableInMetros)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    specs: ").append(toIndentedString(specs)).append("\n");
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
    openapiFields.add("available_in");
    openapiFields.add("deployment_types");
    openapiFields.add("available_in_metros");
    openapiFields.add("class");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("legacy");
    openapiFields.add("line");
    openapiFields.add("name");
    openapiFields.add("pricing");
    openapiFields.add("slug");
    openapiFields.add("specs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Plan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Plan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Plan is not found in the empty JSON string", Plan.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("available_in") != null && !jsonObj.get("available_in").isJsonNull()) {
        JsonArray jsonArrayavailableIn = jsonObj.getAsJsonArray("available_in");
        if (jsonArrayavailableIn != null) {
          // ensure the json data is an array
          if (!jsonObj.get("available_in").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `available_in` to be an array in the JSON string but got `%s`", jsonObj.get("available_in").toString()));
          }

          // validate the optional field `available_in` (array)
          for (int i = 0; i < jsonArrayavailableIn.size(); i++) {
            Href.validateJsonObject(jsonArrayavailableIn.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("deployment_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deployment_types` to be an array in the JSON string but got `%s`", jsonObj.get("deployment_types").toString()));
      }
      if (jsonObj.get("available_in_metros") != null && !jsonObj.get("available_in_metros").isJsonNull()) {
        JsonArray jsonArrayavailableInMetros = jsonObj.getAsJsonArray("available_in_metros");
        if (jsonArrayavailableInMetros != null) {
          // ensure the json data is an array
          if (!jsonObj.get("available_in_metros").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `available_in_metros` to be an array in the JSON string but got `%s`", jsonObj.get("available_in_metros").toString()));
          }

          // validate the optional field `available_in_metros` (array)
          for (int i = 0; i < jsonArrayavailableInMetros.size(); i++) {
            PlanAvailableInMetrosInner.validateJsonObject(jsonArrayavailableInMetros.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("class") != null && !jsonObj.get("class").isJsonNull()) && !jsonObj.get("class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("line") != null && !jsonObj.get("line").isJsonNull()) && !jsonObj.get("line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Plan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Plan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Plan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Plan.class));

       return (TypeAdapter<T>) new TypeAdapter<Plan>() {
           @Override
           public void write(JsonWriter out, Plan value) throws IOException {
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
           public Plan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Plan instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Plan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Plan
  * @throws IOException if the JSON string is invalid with respect to Plan
  */
  public static Plan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Plan.class);
  }

 /**
  * Convert an instance of Plan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

