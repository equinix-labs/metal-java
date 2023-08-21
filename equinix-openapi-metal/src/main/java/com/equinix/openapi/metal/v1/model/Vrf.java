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
import com.equinix.openapi.metal.v1.model.Metro;
import com.equinix.openapi.metal.v1.model.Project;
import com.equinix.openapi.metal.v1.model.User;
import com.equinix.openapi.metal.v1.model.VrfVirtualCircuit;
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
 * Vrf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Vrf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BILL = "bill";
  @SerializedName(SERIALIZED_NAME_BILL)
  private Boolean bill = false;

  public static final String SERIALIZED_NAME_BGP_DYNAMIC_NEIGHBORS_ENABLED = "bgp_dynamic_neighbors_enabled";
  @SerializedName(SERIALIZED_NAME_BGP_DYNAMIC_NEIGHBORS_ENABLED)
  private Boolean bgpDynamicNeighborsEnabled;

  public static final String SERIALIZED_NAME_BGP_DYNAMIC_NEIGHBORS_EXPORT_ROUTE_MAP = "bgp_dynamic_neighbors_export_route_map";
  @SerializedName(SERIALIZED_NAME_BGP_DYNAMIC_NEIGHBORS_EXPORT_ROUTE_MAP)
  private Boolean bgpDynamicNeighborsExportRouteMap;

  public static final String SERIALIZED_NAME_BGP_DYNAMIC_NEIGHBORS_BFD_ENABLED = "bgp_dynamic_neighbors_bfd_enabled";
  @SerializedName(SERIALIZED_NAME_BGP_DYNAMIC_NEIGHBORS_BFD_ENABLED)
  private Boolean bgpDynamicNeighborsBfdEnabled;

  public static final String SERIALIZED_NAME_LOCAL_ASN = "local_asn";
  @SerializedName(SERIALIZED_NAME_LOCAL_ASN)
  private Integer localAsn;

  public static final String SERIALIZED_NAME_VIRTUAL_CIRCUITS = "virtual_circuits";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_CIRCUITS)
  private List<VrfVirtualCircuit> virtualCircuits;

  public static final String SERIALIZED_NAME_IP_RANGES = "ip_ranges";
  @SerializedName(SERIALIZED_NAME_IP_RANGES)
  private List<String> ipRanges;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public static final String SERIALIZED_NAME_METRO = "metro";
  @SerializedName(SERIALIZED_NAME_METRO)
  private Metro metro;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private User createdBy;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public Vrf() {
  }

  public Vrf id(UUID id) {
    
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


  public Vrf name(String name) {
    
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


  public Vrf description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Optional field that can be set to describe the VRF
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Vrf bill(Boolean bill) {
    
    this.bill = bill;
    return this;
  }

   /**
   * True if the VRF is being billed. Usage will start when the first VRF Virtual Circuit is active, and will only stop when the VRF has been deleted.
   * @return bill
  **/
  @javax.annotation.Nullable
  public Boolean getBill() {
    return bill;
  }


  public void setBill(Boolean bill) {
    this.bill = bill;
  }


  public Vrf bgpDynamicNeighborsEnabled(Boolean bgpDynamicNeighborsEnabled) {
    
    this.bgpDynamicNeighborsEnabled = bgpDynamicNeighborsEnabled;
    return this;
  }

   /**
   * Toggle to enable the dynamic bgp neighbors feature on the VRF
   * @return bgpDynamicNeighborsEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getBgpDynamicNeighborsEnabled() {
    return bgpDynamicNeighborsEnabled;
  }


  public void setBgpDynamicNeighborsEnabled(Boolean bgpDynamicNeighborsEnabled) {
    this.bgpDynamicNeighborsEnabled = bgpDynamicNeighborsEnabled;
  }


  public Vrf bgpDynamicNeighborsExportRouteMap(Boolean bgpDynamicNeighborsExportRouteMap) {
    
    this.bgpDynamicNeighborsExportRouteMap = bgpDynamicNeighborsExportRouteMap;
    return this;
  }

   /**
   * Toggle to export the VRF route-map to the dynamic bgp neighbors
   * @return bgpDynamicNeighborsExportRouteMap
  **/
  @javax.annotation.Nullable
  public Boolean getBgpDynamicNeighborsExportRouteMap() {
    return bgpDynamicNeighborsExportRouteMap;
  }


  public void setBgpDynamicNeighborsExportRouteMap(Boolean bgpDynamicNeighborsExportRouteMap) {
    this.bgpDynamicNeighborsExportRouteMap = bgpDynamicNeighborsExportRouteMap;
  }


  public Vrf bgpDynamicNeighborsBfdEnabled(Boolean bgpDynamicNeighborsBfdEnabled) {
    
    this.bgpDynamicNeighborsBfdEnabled = bgpDynamicNeighborsBfdEnabled;
    return this;
  }

   /**
   * Toggle BFD on dynamic bgp neighbors sessions
   * @return bgpDynamicNeighborsBfdEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getBgpDynamicNeighborsBfdEnabled() {
    return bgpDynamicNeighborsBfdEnabled;
  }


  public void setBgpDynamicNeighborsBfdEnabled(Boolean bgpDynamicNeighborsBfdEnabled) {
    this.bgpDynamicNeighborsBfdEnabled = bgpDynamicNeighborsBfdEnabled;
  }


  public Vrf localAsn(Integer localAsn) {
    
    this.localAsn = localAsn;
    return this;
  }

   /**
   * A 4-byte ASN associated with the VRF.
   * @return localAsn
  **/
  @javax.annotation.Nullable
  public Integer getLocalAsn() {
    return localAsn;
  }


  public void setLocalAsn(Integer localAsn) {
    this.localAsn = localAsn;
  }


  public Vrf virtualCircuits(List<VrfVirtualCircuit> virtualCircuits) {
    
    this.virtualCircuits = virtualCircuits;
    return this;
  }

  public Vrf addVirtualCircuitsItem(VrfVirtualCircuit virtualCircuitsItem) {
    if (this.virtualCircuits == null) {
      this.virtualCircuits = new ArrayList<>();
    }
    this.virtualCircuits.add(virtualCircuitsItem);
    return this;
  }

   /**
   * Virtual circuits that are in the VRF
   * @return virtualCircuits
  **/
  @javax.annotation.Nullable
  public List<VrfVirtualCircuit> getVirtualCircuits() {
    return virtualCircuits;
  }


  public void setVirtualCircuits(List<VrfVirtualCircuit> virtualCircuits) {
    this.virtualCircuits = virtualCircuits;
  }


  public Vrf ipRanges(List<String> ipRanges) {
    
    this.ipRanges = ipRanges;
    return this;
  }

  public Vrf addIpRangesItem(String ipRangesItem) {
    if (this.ipRanges == null) {
      this.ipRanges = new ArrayList<>();
    }
    this.ipRanges.add(ipRangesItem);
    return this;
  }

   /**
   * A list of CIDR network addresses. Like [\&quot;10.0.0.0/16\&quot;, \&quot;2001:d78::/56\&quot;].
   * @return ipRanges
  **/
  @javax.annotation.Nullable
  public List<String> getIpRanges() {
    return ipRanges;
  }


  public void setIpRanges(List<String> ipRanges) {
    this.ipRanges = ipRanges;
  }


  public Vrf project(Project project) {
    
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


  public Vrf metro(Metro metro) {
    
    this.metro = metro;
    return this;
  }

   /**
   * Get metro
   * @return metro
  **/
  @javax.annotation.Nullable
  public Metro getMetro() {
    return metro;
  }


  public void setMetro(Metro metro) {
    this.metro = metro;
  }


  public Vrf createdBy(User createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  public User getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }


  public Vrf href(String href) {
    
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


  public Vrf createdAt(OffsetDateTime createdAt) {
    
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


  public Vrf updatedAt(OffsetDateTime updatedAt) {
    
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


  public Vrf tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Vrf addTagsItem(String tagsItem) {
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
   * @return the Vrf instance itself
   */
  public Vrf putAdditionalProperty(String key, Object value) {
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
    Vrf vrf = (Vrf) o;
    return Objects.equals(this.id, vrf.id) &&
        Objects.equals(this.name, vrf.name) &&
        Objects.equals(this.description, vrf.description) &&
        Objects.equals(this.bill, vrf.bill) &&
        Objects.equals(this.bgpDynamicNeighborsEnabled, vrf.bgpDynamicNeighborsEnabled) &&
        Objects.equals(this.bgpDynamicNeighborsExportRouteMap, vrf.bgpDynamicNeighborsExportRouteMap) &&
        Objects.equals(this.bgpDynamicNeighborsBfdEnabled, vrf.bgpDynamicNeighborsBfdEnabled) &&
        Objects.equals(this.localAsn, vrf.localAsn) &&
        Objects.equals(this.virtualCircuits, vrf.virtualCircuits) &&
        Objects.equals(this.ipRanges, vrf.ipRanges) &&
        Objects.equals(this.project, vrf.project) &&
        Objects.equals(this.metro, vrf.metro) &&
        Objects.equals(this.createdBy, vrf.createdBy) &&
        Objects.equals(this.href, vrf.href) &&
        Objects.equals(this.createdAt, vrf.createdAt) &&
        Objects.equals(this.updatedAt, vrf.updatedAt) &&
        Objects.equals(this.tags, vrf.tags)&&
        Objects.equals(this.additionalProperties, vrf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, bill, bgpDynamicNeighborsEnabled, bgpDynamicNeighborsExportRouteMap, bgpDynamicNeighborsBfdEnabled, localAsn, virtualCircuits, ipRanges, project, metro, createdBy, href, createdAt, updatedAt, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vrf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
    sb.append("    bgpDynamicNeighborsEnabled: ").append(toIndentedString(bgpDynamicNeighborsEnabled)).append("\n");
    sb.append("    bgpDynamicNeighborsExportRouteMap: ").append(toIndentedString(bgpDynamicNeighborsExportRouteMap)).append("\n");
    sb.append("    bgpDynamicNeighborsBfdEnabled: ").append(toIndentedString(bgpDynamicNeighborsBfdEnabled)).append("\n");
    sb.append("    localAsn: ").append(toIndentedString(localAsn)).append("\n");
    sb.append("    virtualCircuits: ").append(toIndentedString(virtualCircuits)).append("\n");
    sb.append("    ipRanges: ").append(toIndentedString(ipRanges)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("bill");
    openapiFields.add("bgp_dynamic_neighbors_enabled");
    openapiFields.add("bgp_dynamic_neighbors_export_route_map");
    openapiFields.add("bgp_dynamic_neighbors_bfd_enabled");
    openapiFields.add("local_asn");
    openapiFields.add("virtual_circuits");
    openapiFields.add("ip_ranges");
    openapiFields.add("project");
    openapiFields.add("metro");
    openapiFields.add("created_by");
    openapiFields.add("href");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Vrf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Vrf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Vrf is not found in the empty JSON string", Vrf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("virtual_circuits") != null && !jsonObj.get("virtual_circuits").isJsonNull()) {
        JsonArray jsonArrayvirtualCircuits = jsonObj.getAsJsonArray("virtual_circuits");
        if (jsonArrayvirtualCircuits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("virtual_circuits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `virtual_circuits` to be an array in the JSON string but got `%s`", jsonObj.get("virtual_circuits").toString()));
          }

          // validate the optional field `virtual_circuits` (array)
          for (int i = 0; i < jsonArrayvirtualCircuits.size(); i++) {
            VrfVirtualCircuit.validateJsonObject(jsonArrayvirtualCircuits.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ip_ranges") != null && !jsonObj.get("ip_ranges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_ranges` to be an array in the JSON string but got `%s`", jsonObj.get("ip_ranges").toString()));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
      // validate the optional field `metro`
      if (jsonObj.get("metro") != null && !jsonObj.get("metro").isJsonNull()) {
        Metro.validateJsonObject(jsonObj.getAsJsonObject("metro"));
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        User.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Vrf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Vrf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Vrf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Vrf.class));

       return (TypeAdapter<T>) new TypeAdapter<Vrf>() {
           @Override
           public void write(JsonWriter out, Vrf value) throws IOException {
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
           public Vrf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Vrf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Vrf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Vrf
  * @throws IOException if the JSON string is invalid with respect to Vrf
  */
  public static Vrf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Vrf.class);
  }

 /**
  * Convert an instance of Vrf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

