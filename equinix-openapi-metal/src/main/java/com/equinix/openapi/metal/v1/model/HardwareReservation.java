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
import com.equinix.openapi.metal.v1.model.Device;
import com.equinix.openapi.metal.v1.model.Facility;
import com.equinix.openapi.metal.v1.model.Plan;
import com.equinix.openapi.metal.v1.model.Project;
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
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * HardwareReservation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HardwareReservation {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CUSTOM_RATE = "custom_rate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_RATE)
  private Float customRate;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private Device device;

  public static final String SERIALIZED_NAME_FACILITY = "facility";
  @SerializedName(SERIALIZED_NAME_FACILITY)
  private Facility facility;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NEED_OF_SERVICE = "need_of_service";
  @SerializedName(SERIALIZED_NAME_NEED_OF_SERVICE)
  private Boolean needOfService;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private Plan plan;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public static final String SERIALIZED_NAME_PROVISIONABLE = "provisionable";
  @SerializedName(SERIALIZED_NAME_PROVISIONABLE)
  private Boolean provisionable;

  public static final String SERIALIZED_NAME_SHORT_ID = "short_id";
  @SerializedName(SERIALIZED_NAME_SHORT_ID)
  private String shortId;

  public static final String SERIALIZED_NAME_SPARE = "spare";
  @SerializedName(SERIALIZED_NAME_SPARE)
  private Boolean spare;

  public static final String SERIALIZED_NAME_SWITCH_UUID = "switch_uuid";
  @SerializedName(SERIALIZED_NAME_SWITCH_UUID)
  private String switchUuid;

  public static final String SERIALIZED_NAME_TERMINATION_TIME = "termination_time";
  @SerializedName(SERIALIZED_NAME_TERMINATION_TIME)
  private OffsetDateTime terminationTime;

  public HardwareReservation() {
  }

  public HardwareReservation createdAt(OffsetDateTime createdAt) {
    
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


  public HardwareReservation customRate(Float customRate) {
    
    this.customRate = customRate;
    return this;
  }

   /**
   * Amount that will be charged for every billing_cycle.
   * @return customRate
  **/
  @javax.annotation.Nullable
  public Float getCustomRate() {
    return customRate;
  }


  public void setCustomRate(Float customRate) {
    this.customRate = customRate;
  }


  public HardwareReservation device(Device device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  public Device getDevice() {
    return device;
  }


  public void setDevice(Device device) {
    this.device = device;
  }


  public HardwareReservation facility(Facility facility) {
    
    this.facility = facility;
    return this;
  }

   /**
   * Get facility
   * @return facility
  **/
  @javax.annotation.Nullable
  public Facility getFacility() {
    return facility;
  }


  public void setFacility(Facility facility) {
    this.facility = facility;
  }


  public HardwareReservation href(String href) {
    
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


  public HardwareReservation id(UUID id) {
    
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


  public HardwareReservation needOfService(Boolean needOfService) {
    
    this.needOfService = needOfService;
    return this;
  }

   /**
   * Whether this Device requires assistance from Equinix Metal.
   * @return needOfService
  **/
  @javax.annotation.Nullable
  public Boolean getNeedOfService() {
    return needOfService;
  }


  public void setNeedOfService(Boolean needOfService) {
    this.needOfService = needOfService;
  }


  public HardwareReservation plan(Plan plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @javax.annotation.Nullable
  public Plan getPlan() {
    return plan;
  }


  public void setPlan(Plan plan) {
    this.plan = plan;
  }


  public HardwareReservation project(Project project) {
    
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


  public HardwareReservation provisionable(Boolean provisionable) {
    
    this.provisionable = provisionable;
    return this;
  }

   /**
   * Whether the reserved server is provisionable or not. Spare devices can&#39;t be provisioned unless they are activated first.
   * @return provisionable
  **/
  @javax.annotation.Nullable
  public Boolean getProvisionable() {
    return provisionable;
  }


  public void setProvisionable(Boolean provisionable) {
    this.provisionable = provisionable;
  }


  public HardwareReservation shortId(String shortId) {
    
    this.shortId = shortId;
    return this;
  }

   /**
   * Short version of the ID.
   * @return shortId
  **/
  @javax.annotation.Nullable
  public String getShortId() {
    return shortId;
  }


  public void setShortId(String shortId) {
    this.shortId = shortId;
  }


  public HardwareReservation spare(Boolean spare) {
    
    this.spare = spare;
    return this;
  }

   /**
   * Whether the Hardware Reservation is a spare. Spare Hardware Reservations are used when a Hardware Reservations requires service from Equinix Metal
   * @return spare
  **/
  @javax.annotation.Nullable
  public Boolean getSpare() {
    return spare;
  }


  public void setSpare(Boolean spare) {
    this.spare = spare;
  }


  public HardwareReservation switchUuid(String switchUuid) {
    
    this.switchUuid = switchUuid;
    return this;
  }

   /**
   * Switch short id. This can be used to determine if two devices are connected to the same switch, for example.
   * @return switchUuid
  **/
  @javax.annotation.Nullable
  public String getSwitchUuid() {
    return switchUuid;
  }


  public void setSwitchUuid(String switchUuid) {
    this.switchUuid = switchUuid;
  }


  public HardwareReservation terminationTime(OffsetDateTime terminationTime) {
    
    this.terminationTime = terminationTime;
    return this;
  }

   /**
   * Expiration date for the reservation.
   * @return terminationTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getTerminationTime() {
    return terminationTime;
  }


  public void setTerminationTime(OffsetDateTime terminationTime) {
    this.terminationTime = terminationTime;
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
   * @return the HardwareReservation instance itself
   */
  public HardwareReservation putAdditionalProperty(String key, Object value) {
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
    HardwareReservation hardwareReservation = (HardwareReservation) o;
    return Objects.equals(this.createdAt, hardwareReservation.createdAt) &&
        Objects.equals(this.customRate, hardwareReservation.customRate) &&
        Objects.equals(this.device, hardwareReservation.device) &&
        Objects.equals(this.facility, hardwareReservation.facility) &&
        Objects.equals(this.href, hardwareReservation.href) &&
        Objects.equals(this.id, hardwareReservation.id) &&
        Objects.equals(this.needOfService, hardwareReservation.needOfService) &&
        Objects.equals(this.plan, hardwareReservation.plan) &&
        Objects.equals(this.project, hardwareReservation.project) &&
        Objects.equals(this.provisionable, hardwareReservation.provisionable) &&
        Objects.equals(this.shortId, hardwareReservation.shortId) &&
        Objects.equals(this.spare, hardwareReservation.spare) &&
        Objects.equals(this.switchUuid, hardwareReservation.switchUuid) &&
        Objects.equals(this.terminationTime, hardwareReservation.terminationTime)&&
        Objects.equals(this.additionalProperties, hardwareReservation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, customRate, device, facility, href, id, needOfService, plan, project, provisionable, shortId, spare, switchUuid, terminationTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HardwareReservation {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customRate: ").append(toIndentedString(customRate)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    needOfService: ").append(toIndentedString(needOfService)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    provisionable: ").append(toIndentedString(provisionable)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    spare: ").append(toIndentedString(spare)).append("\n");
    sb.append("    switchUuid: ").append(toIndentedString(switchUuid)).append("\n");
    sb.append("    terminationTime: ").append(toIndentedString(terminationTime)).append("\n");
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
    openapiFields.add("custom_rate");
    openapiFields.add("device");
    openapiFields.add("facility");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("need_of_service");
    openapiFields.add("plan");
    openapiFields.add("project");
    openapiFields.add("provisionable");
    openapiFields.add("short_id");
    openapiFields.add("spare");
    openapiFields.add("switch_uuid");
    openapiFields.add("termination_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HardwareReservation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HardwareReservation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HardwareReservation is not found in the empty JSON string", HardwareReservation.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `device`
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) {
        Device.validateJsonElement(jsonObj.get("device"));
      }
      // validate the optional field `facility`
      if (jsonObj.get("facility") != null && !jsonObj.get("facility").isJsonNull()) {
        Facility.validateJsonElement(jsonObj.get("facility"));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `plan`
      if (jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) {
        Plan.validateJsonElement(jsonObj.get("plan"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonElement(jsonObj.get("project"));
      }
      if ((jsonObj.get("short_id") != null && !jsonObj.get("short_id").isJsonNull()) && !jsonObj.get("short_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_id").toString()));
      }
      if ((jsonObj.get("switch_uuid") != null && !jsonObj.get("switch_uuid").isJsonNull()) && !jsonObj.get("switch_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `switch_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("switch_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HardwareReservation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HardwareReservation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HardwareReservation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HardwareReservation.class));

       return (TypeAdapter<T>) new TypeAdapter<HardwareReservation>() {
           @Override
           public void write(JsonWriter out, HardwareReservation value) throws IOException {
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
           public HardwareReservation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             HardwareReservation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of HardwareReservation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HardwareReservation
  * @throws IOException if the JSON string is invalid with respect to HardwareReservation
  */
  public static HardwareReservation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HardwareReservation.class);
  }

 /**
  * Convert an instance of HardwareReservation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

