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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * VrfVirtualCircuitCreateInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VrfVirtualCircuitCreateInput {
  public static final String SERIALIZED_NAME_CUSTOMER_IP = "customer_ip";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_IP)
  private String customerIp;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5;

  public static final String SERIALIZED_NAME_METAL_IP = "metal_ip";
  @SerializedName(SERIALIZED_NAME_METAL_IP)
  private String metalIp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NNI_VLAN = "nni_vlan";
  @SerializedName(SERIALIZED_NAME_NNI_VLAN)
  private Integer nniVlan;

  public static final String SERIALIZED_NAME_PEER_ASN = "peer_asn";
  @SerializedName(SERIALIZED_NAME_PEER_ASN)
  private Integer peerAsn;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_SPEED = "speed";
  @SerializedName(SERIALIZED_NAME_SPEED)
  private Integer speed;

  public static final String SERIALIZED_NAME_SUBNET = "subnet";
  @SerializedName(SERIALIZED_NAME_SUBNET)
  private String subnet;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_VRF = "vrf";
  @SerializedName(SERIALIZED_NAME_VRF)
  private UUID vrf;

  public VrfVirtualCircuitCreateInput() {
  }

  public VrfVirtualCircuitCreateInput customerIp(String customerIp) {
    
    this.customerIp = customerIp;
    return this;
  }

   /**
   * An IP address from the subnet that will be used on the Customer side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Metal IP. By default, the last usable IP address in the subnet will be used.
   * @return customerIp
  **/
  @javax.annotation.Nullable
  public String getCustomerIp() {
    return customerIp;
  }


  public void setCustomerIp(String customerIp) {
    this.customerIp = customerIp;
  }


  public VrfVirtualCircuitCreateInput description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VrfVirtualCircuitCreateInput md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * The plaintext BGP peering password shared by neighbors as an MD5 checksum: * must be 10-20 characters long * may not include punctuation * must be a combination of numbers and letters * must contain at least one lowercase, uppercase, and digit character 
   * @return md5
  **/
  @javax.annotation.Nullable
  public String getMd5() {
    return md5;
  }


  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public VrfVirtualCircuitCreateInput metalIp(String metalIp) {
    
    this.metalIp = metalIp;
    return this;
  }

   /**
   * An IP address from the subnet that will be used on the Metal side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Customer IP. By default, the first usable IP address in the subnet will be used.
   * @return metalIp
  **/
  @javax.annotation.Nullable
  public String getMetalIp() {
    return metalIp;
  }


  public void setMetalIp(String metalIp) {
    this.metalIp = metalIp;
  }


  public VrfVirtualCircuitCreateInput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VrfVirtualCircuitCreateInput nniVlan(Integer nniVlan) {
    
    this.nniVlan = nniVlan;
    return this;
  }

   /**
   * Get nniVlan
   * minimum: 2
   * maximum: 4094
   * @return nniVlan
  **/
  @javax.annotation.Nonnull
  public Integer getNniVlan() {
    return nniVlan;
  }


  public void setNniVlan(Integer nniVlan) {
    this.nniVlan = nniVlan;
  }


  public VrfVirtualCircuitCreateInput peerAsn(Integer peerAsn) {
    
    this.peerAsn = peerAsn;
    return this;
  }

   /**
   * The peer ASN that will be used with the VRF on the Virtual Circuit.
   * @return peerAsn
  **/
  @javax.annotation.Nonnull
  public Integer getPeerAsn() {
    return peerAsn;
  }


  public void setPeerAsn(Integer peerAsn) {
    this.peerAsn = peerAsn;
  }


  public VrfVirtualCircuitCreateInput projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public VrfVirtualCircuitCreateInput speed(Integer speed) {
    
    this.speed = speed;
    return this;
  }

   /**
   * speed can be passed as integer number representing bps speed or string (e.g. &#39;52m&#39; or &#39;100g&#39; or &#39;4 gbps&#39;)
   * @return speed
  **/
  @javax.annotation.Nullable
  public Integer getSpeed() {
    return speed;
  }


  public void setSpeed(Integer speed) {
    this.speed = speed;
  }


  public VrfVirtualCircuitCreateInput subnet(String subnet) {
    
    this.subnet = subnet;
    return this;
  }

   /**
   * The /30 or /31 subnet of one of the VRF IP Blocks that will be used with the VRF for the Virtual Circuit. This subnet does not have to be an existing VRF IP reservation, as we will create the VRF IP reservation on creation if it does not exist. The Metal IP and Customer IP must be IPs from this subnet. For /30 subnets, the network and broadcast IPs cannot be used as the Metal or Customer IP. The subnet specified must be contained within an already-defined IP Range for the VRF.
   * @return subnet
  **/
  @javax.annotation.Nonnull
  public String getSubnet() {
    return subnet;
  }


  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }


  public VrfVirtualCircuitCreateInput tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public VrfVirtualCircuitCreateInput addTagsItem(String tagsItem) {
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
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public VrfVirtualCircuitCreateInput vrf(UUID vrf) {
    
    this.vrf = vrf;
    return this;
  }

   /**
   * The UUID of the VRF that will be associated with the Virtual Circuit.
   * @return vrf
  **/
  @javax.annotation.Nonnull
  public UUID getVrf() {
    return vrf;
  }


  public void setVrf(UUID vrf) {
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
   * @return the VrfVirtualCircuitCreateInput instance itself
   */
  public VrfVirtualCircuitCreateInput putAdditionalProperty(String key, Object value) {
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
    VrfVirtualCircuitCreateInput vrfVirtualCircuitCreateInput = (VrfVirtualCircuitCreateInput) o;
    return Objects.equals(this.customerIp, vrfVirtualCircuitCreateInput.customerIp) &&
        Objects.equals(this.description, vrfVirtualCircuitCreateInput.description) &&
        Objects.equals(this.md5, vrfVirtualCircuitCreateInput.md5) &&
        Objects.equals(this.metalIp, vrfVirtualCircuitCreateInput.metalIp) &&
        Objects.equals(this.name, vrfVirtualCircuitCreateInput.name) &&
        Objects.equals(this.nniVlan, vrfVirtualCircuitCreateInput.nniVlan) &&
        Objects.equals(this.peerAsn, vrfVirtualCircuitCreateInput.peerAsn) &&
        Objects.equals(this.projectId, vrfVirtualCircuitCreateInput.projectId) &&
        Objects.equals(this.speed, vrfVirtualCircuitCreateInput.speed) &&
        Objects.equals(this.subnet, vrfVirtualCircuitCreateInput.subnet) &&
        Objects.equals(this.tags, vrfVirtualCircuitCreateInput.tags) &&
        Objects.equals(this.vrf, vrfVirtualCircuitCreateInput.vrf)&&
        Objects.equals(this.additionalProperties, vrfVirtualCircuitCreateInput.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerIp, description, md5, metalIp, name, nniVlan, peerAsn, projectId, speed, subnet, tags, vrf, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VrfVirtualCircuitCreateInput {\n");
    sb.append("    customerIp: ").append(toIndentedString(customerIp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    metalIp: ").append(toIndentedString(metalIp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nniVlan: ").append(toIndentedString(nniVlan)).append("\n");
    sb.append("    peerAsn: ").append(toIndentedString(peerAsn)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("customer_ip");
    openapiFields.add("description");
    openapiFields.add("md5");
    openapiFields.add("metal_ip");
    openapiFields.add("name");
    openapiFields.add("nni_vlan");
    openapiFields.add("peer_asn");
    openapiFields.add("project_id");
    openapiFields.add("speed");
    openapiFields.add("subnet");
    openapiFields.add("tags");
    openapiFields.add("vrf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nni_vlan");
    openapiRequiredFields.add("peer_asn");
    openapiRequiredFields.add("project_id");
    openapiRequiredFields.add("subnet");
    openapiRequiredFields.add("vrf");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VrfVirtualCircuitCreateInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VrfVirtualCircuitCreateInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VrfVirtualCircuitCreateInput is not found in the empty JSON string", VrfVirtualCircuitCreateInput.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VrfVirtualCircuitCreateInput.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("customer_ip") != null && !jsonObj.get("customer_ip").isJsonNull()) && !jsonObj.get("customer_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_ip").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("md5") != null && !jsonObj.get("md5").isJsonNull()) && !jsonObj.get("md5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5").toString()));
      }
      if ((jsonObj.get("metal_ip") != null && !jsonObj.get("metal_ip").isJsonNull()) && !jsonObj.get("metal_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metal_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metal_ip").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if (!jsonObj.get("subnet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subnet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subnet").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (!jsonObj.get("vrf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vrf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vrf").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VrfVirtualCircuitCreateInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VrfVirtualCircuitCreateInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VrfVirtualCircuitCreateInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VrfVirtualCircuitCreateInput.class));

       return (TypeAdapter<T>) new TypeAdapter<VrfVirtualCircuitCreateInput>() {
           @Override
           public void write(JsonWriter out, VrfVirtualCircuitCreateInput value) throws IOException {
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
           public VrfVirtualCircuitCreateInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VrfVirtualCircuitCreateInput instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VrfVirtualCircuitCreateInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VrfVirtualCircuitCreateInput
  * @throws IOException if the JSON string is invalid with respect to VrfVirtualCircuitCreateInput
  */
  public static VrfVirtualCircuitCreateInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VrfVirtualCircuitCreateInput.class);
  }

 /**
  * Convert an instance of VrfVirtualCircuitCreateInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

