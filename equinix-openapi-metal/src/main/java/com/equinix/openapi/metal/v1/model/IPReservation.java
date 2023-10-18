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
import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.IPAssignment;
import com.equinix.openapi.metal.v1.model.IPReservationFacility;
import com.equinix.openapi.metal.v1.model.IPReservationMetro;
import com.equinix.openapi.metal.v1.model.MetalGatewayLite;
import com.equinix.openapi.metal.v1.model.Project;
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
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * IPReservation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IPReservation {
  public static final String SERIALIZED_NAME_ADDON = "addon";
  @SerializedName(SERIALIZED_NAME_ADDON)
  private Boolean addon;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_FAMILY = "address_family";
  @SerializedName(SERIALIZED_NAME_ADDRESS_FAMILY)
  private Integer addressFamily;

  public static final String SERIALIZED_NAME_ASSIGNMENTS = "assignments";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTS)
  private List<IPAssignment> assignments;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private String available;

  public static final String SERIALIZED_NAME_BILL = "bill";
  @SerializedName(SERIALIZED_NAME_BILL)
  private Boolean bill;

  public static final String SERIALIZED_NAME_CIDR = "cidr";
  @SerializedName(SERIALIZED_NAME_CIDR)
  private Integer cidr;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CUSTOMDATA = "customdata";
  @SerializedName(SERIALIZED_NAME_CUSTOMDATA)
  private Object customdata;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_FACILITY = "facility";
  @SerializedName(SERIALIZED_NAME_FACILITY)
  private IPReservationFacility facility;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_GLOBAL_IP = "global_ip";
  @SerializedName(SERIALIZED_NAME_GLOBAL_IP)
  private Boolean globalIp;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_MANAGEABLE = "manageable";
  @SerializedName(SERIALIZED_NAME_MANAGEABLE)
  private Boolean manageable;

  public static final String SERIALIZED_NAME_MANAGEMENT = "management";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT)
  private Boolean management;

  public static final String SERIALIZED_NAME_METAL_GATEWAY = "metal_gateway";
  @SerializedName(SERIALIZED_NAME_METAL_GATEWAY)
  private MetalGatewayLite metalGateway;

  public static final String SERIALIZED_NAME_METRO = "metro";
  @SerializedName(SERIALIZED_NAME_METRO)
  private IPReservationMetro metro;

  public static final String SERIALIZED_NAME_NETMASK = "netmask";
  @SerializedName(SERIALIZED_NAME_NETMASK)
  private String netmask;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public static final String SERIALIZED_NAME_PROJECT_LITE = "project_lite";
  @SerializedName(SERIALIZED_NAME_PROJECT_LITE)
  private Href projectLite;

  public static final String SERIALIZED_NAME_REQUESTED_BY = "requested_by";
  @SerializedName(SERIALIZED_NAME_REQUESTED_BY)
  private Href requestedBy;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    GLOBAL_IPV4("global_ipv4"),
    
    PUBLIC_IPV4("public_ipv4"),
    
    PRIVATE_IPV4("private_ipv4"),
    
    PUBLIC_IPV6("public_ipv6");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public IPReservation() {
  }

  public IPReservation addon(Boolean addon) {
    
    this.addon = addon;
    return this;
  }

   /**
   * Get addon
   * @return addon
  **/
  @javax.annotation.Nullable
  public Boolean getAddon() {
    return addon;
  }


  public void setAddon(Boolean addon) {
    this.addon = addon;
  }


  public IPReservation address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public IPReservation addressFamily(Integer addressFamily) {
    
    this.addressFamily = addressFamily;
    return this;
  }

   /**
   * Get addressFamily
   * @return addressFamily
  **/
  @javax.annotation.Nullable
  public Integer getAddressFamily() {
    return addressFamily;
  }


  public void setAddressFamily(Integer addressFamily) {
    this.addressFamily = addressFamily;
  }


  public IPReservation assignments(List<IPAssignment> assignments) {
    
    this.assignments = assignments;
    return this;
  }

  public IPReservation addAssignmentsItem(IPAssignment assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  @javax.annotation.Nullable
  public List<IPAssignment> getAssignments() {
    return assignments;
  }


  public void setAssignments(List<IPAssignment> assignments) {
    this.assignments = assignments;
  }


  public IPReservation available(String available) {
    
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nullable
  public String getAvailable() {
    return available;
  }


  public void setAvailable(String available) {
    this.available = available;
  }


  public IPReservation bill(Boolean bill) {
    
    this.bill = bill;
    return this;
  }

   /**
   * Get bill
   * @return bill
  **/
  @javax.annotation.Nullable
  public Boolean getBill() {
    return bill;
  }


  public void setBill(Boolean bill) {
    this.bill = bill;
  }


  public IPReservation cidr(Integer cidr) {
    
    this.cidr = cidr;
    return this;
  }

   /**
   * Get cidr
   * @return cidr
  **/
  @javax.annotation.Nullable
  public Integer getCidr() {
    return cidr;
  }


  public void setCidr(Integer cidr) {
    this.cidr = cidr;
  }


  public IPReservation createdAt(OffsetDateTime createdAt) {
    
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


  public IPReservation customdata(Object customdata) {
    
    this.customdata = customdata;
    return this;
  }

   /**
   * Get customdata
   * @return customdata
  **/
  @javax.annotation.Nullable
  public Object getCustomdata() {
    return customdata;
  }


  public void setCustomdata(Object customdata) {
    this.customdata = customdata;
  }


  public IPReservation enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public IPReservation details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public IPReservation facility(IPReservationFacility facility) {
    
    this.facility = facility;
    return this;
  }

   /**
   * Get facility
   * @return facility
  **/
  @javax.annotation.Nullable
  public IPReservationFacility getFacility() {
    return facility;
  }


  public void setFacility(IPReservationFacility facility) {
    this.facility = facility;
  }


  public IPReservation gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public IPReservation globalIp(Boolean globalIp) {
    
    this.globalIp = globalIp;
    return this;
  }

   /**
   * Get globalIp
   * @return globalIp
  **/
  @javax.annotation.Nullable
  public Boolean getGlobalIp() {
    return globalIp;
  }


  public void setGlobalIp(Boolean globalIp) {
    this.globalIp = globalIp;
  }


  public IPReservation href(String href) {
    
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


  public IPReservation id(UUID id) {
    
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


  public IPReservation manageable(Boolean manageable) {
    
    this.manageable = manageable;
    return this;
  }

   /**
   * Get manageable
   * @return manageable
  **/
  @javax.annotation.Nullable
  public Boolean getManageable() {
    return manageable;
  }


  public void setManageable(Boolean manageable) {
    this.manageable = manageable;
  }


  public IPReservation management(Boolean management) {
    
    this.management = management;
    return this;
  }

   /**
   * Get management
   * @return management
  **/
  @javax.annotation.Nullable
  public Boolean getManagement() {
    return management;
  }


  public void setManagement(Boolean management) {
    this.management = management;
  }


  public IPReservation metalGateway(MetalGatewayLite metalGateway) {
    
    this.metalGateway = metalGateway;
    return this;
  }

   /**
   * Get metalGateway
   * @return metalGateway
  **/
  @javax.annotation.Nullable
  public MetalGatewayLite getMetalGateway() {
    return metalGateway;
  }


  public void setMetalGateway(MetalGatewayLite metalGateway) {
    this.metalGateway = metalGateway;
  }


  public IPReservation metro(IPReservationMetro metro) {
    
    this.metro = metro;
    return this;
  }

   /**
   * Get metro
   * @return metro
  **/
  @javax.annotation.Nullable
  public IPReservationMetro getMetro() {
    return metro;
  }


  public void setMetro(IPReservationMetro metro) {
    this.metro = metro;
  }


  public IPReservation netmask(String netmask) {
    
    this.netmask = netmask;
    return this;
  }

   /**
   * Get netmask
   * @return netmask
  **/
  @javax.annotation.Nullable
  public String getNetmask() {
    return netmask;
  }


  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }


  public IPReservation network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public IPReservation project(Project project) {
    
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


  public IPReservation projectLite(Href projectLite) {
    
    this.projectLite = projectLite;
    return this;
  }

   /**
   * Get projectLite
   * @return projectLite
  **/
  @javax.annotation.Nullable
  public Href getProjectLite() {
    return projectLite;
  }


  public void setProjectLite(Href projectLite) {
    this.projectLite = projectLite;
  }


  public IPReservation requestedBy(Href requestedBy) {
    
    this.requestedBy = requestedBy;
    return this;
  }

   /**
   * Get requestedBy
   * @return requestedBy
  **/
  @javax.annotation.Nullable
  public Href getRequestedBy() {
    return requestedBy;
  }


  public void setRequestedBy(Href requestedBy) {
    this.requestedBy = requestedBy;
  }


  public IPReservation _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @javax.annotation.Nullable
  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  public IPReservation state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public IPReservation tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public IPReservation addTagsItem(String tagsItem) {
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


  public IPReservation type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPReservation ipReservation = (IPReservation) o;
    return Objects.equals(this.addon, ipReservation.addon) &&
        Objects.equals(this.address, ipReservation.address) &&
        Objects.equals(this.addressFamily, ipReservation.addressFamily) &&
        Objects.equals(this.assignments, ipReservation.assignments) &&
        Objects.equals(this.available, ipReservation.available) &&
        Objects.equals(this.bill, ipReservation.bill) &&
        Objects.equals(this.cidr, ipReservation.cidr) &&
        Objects.equals(this.createdAt, ipReservation.createdAt) &&
        Objects.equals(this.customdata, ipReservation.customdata) &&
        Objects.equals(this.enabled, ipReservation.enabled) &&
        Objects.equals(this.details, ipReservation.details) &&
        Objects.equals(this.facility, ipReservation.facility) &&
        Objects.equals(this.gateway, ipReservation.gateway) &&
        Objects.equals(this.globalIp, ipReservation.globalIp) &&
        Objects.equals(this.href, ipReservation.href) &&
        Objects.equals(this.id, ipReservation.id) &&
        Objects.equals(this.manageable, ipReservation.manageable) &&
        Objects.equals(this.management, ipReservation.management) &&
        Objects.equals(this.metalGateway, ipReservation.metalGateway) &&
        Objects.equals(this.metro, ipReservation.metro) &&
        Objects.equals(this.netmask, ipReservation.netmask) &&
        Objects.equals(this.network, ipReservation.network) &&
        Objects.equals(this.project, ipReservation.project) &&
        Objects.equals(this.projectLite, ipReservation.projectLite) &&
        Objects.equals(this.requestedBy, ipReservation.requestedBy) &&
        Objects.equals(this._public, ipReservation._public) &&
        Objects.equals(this.state, ipReservation.state) &&
        Objects.equals(this.tags, ipReservation.tags) &&
        Objects.equals(this.type, ipReservation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addon, address, addressFamily, assignments, available, bill, cidr, createdAt, customdata, enabled, details, facility, gateway, globalIp, href, id, manageable, management, metalGateway, metro, netmask, network, project, projectLite, requestedBy, _public, state, tags, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPReservation {\n");
    sb.append("    addon: ").append(toIndentedString(addon)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    globalIp: ").append(toIndentedString(globalIp)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manageable: ").append(toIndentedString(manageable)).append("\n");
    sb.append("    management: ").append(toIndentedString(management)).append("\n");
    sb.append("    metalGateway: ").append(toIndentedString(metalGateway)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectLite: ").append(toIndentedString(projectLite)).append("\n");
    sb.append("    requestedBy: ").append(toIndentedString(requestedBy)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("addon");
    openapiFields.add("address");
    openapiFields.add("address_family");
    openapiFields.add("assignments");
    openapiFields.add("available");
    openapiFields.add("bill");
    openapiFields.add("cidr");
    openapiFields.add("created_at");
    openapiFields.add("customdata");
    openapiFields.add("enabled");
    openapiFields.add("details");
    openapiFields.add("facility");
    openapiFields.add("gateway");
    openapiFields.add("global_ip");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("manageable");
    openapiFields.add("management");
    openapiFields.add("metal_gateway");
    openapiFields.add("metro");
    openapiFields.add("netmask");
    openapiFields.add("network");
    openapiFields.add("project");
    openapiFields.add("project_lite");
    openapiFields.add("requested_by");
    openapiFields.add("public");
    openapiFields.add("state");
    openapiFields.add("tags");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IPReservation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IPReservation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IPReservation is not found in the empty JSON string", IPReservation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IPReservation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IPReservation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IPReservation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("assignments") != null && !jsonObj.get("assignments").isJsonNull()) {
        JsonArray jsonArrayassignments = jsonObj.getAsJsonArray("assignments");
        if (jsonArrayassignments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("assignments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `assignments` to be an array in the JSON string but got `%s`", jsonObj.get("assignments").toString()));
          }

          // validate the optional field `assignments` (array)
          for (int i = 0; i < jsonArrayassignments.size(); i++) {
            IPAssignment.validateJsonElement(jsonArrayassignments.get(i));
          };
        }
      }
      if ((jsonObj.get("available") != null && !jsonObj.get("available").isJsonNull()) && !jsonObj.get("available").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available").toString()));
      }
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      // validate the optional field `facility`
      if (jsonObj.get("facility") != null && !jsonObj.get("facility").isJsonNull()) {
        IPReservationFacility.validateJsonElement(jsonObj.get("facility"));
      }
      if ((jsonObj.get("gateway") != null && !jsonObj.get("gateway").isJsonNull()) && !jsonObj.get("gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway").toString()));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `metal_gateway`
      if (jsonObj.get("metal_gateway") != null && !jsonObj.get("metal_gateway").isJsonNull()) {
        MetalGatewayLite.validateJsonElement(jsonObj.get("metal_gateway"));
      }
      // validate the optional field `metro`
      if (jsonObj.get("metro") != null && !jsonObj.get("metro").isJsonNull()) {
        IPReservationMetro.validateJsonElement(jsonObj.get("metro"));
      }
      if ((jsonObj.get("netmask") != null && !jsonObj.get("netmask").isJsonNull()) && !jsonObj.get("netmask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netmask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netmask").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonElement(jsonObj.get("project"));
      }
      // validate the optional field `project_lite`
      if (jsonObj.get("project_lite") != null && !jsonObj.get("project_lite").isJsonNull()) {
        Href.validateJsonElement(jsonObj.get("project_lite"));
      }
      // validate the optional field `requested_by`
      if (jsonObj.get("requested_by") != null && !jsonObj.get("requested_by").isJsonNull()) {
        Href.validateJsonElement(jsonObj.get("requested_by"));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IPReservation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IPReservation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IPReservation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IPReservation.class));

       return (TypeAdapter<T>) new TypeAdapter<IPReservation>() {
           @Override
           public void write(JsonWriter out, IPReservation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IPReservation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IPReservation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IPReservation
  * @throws IOException if the JSON string is invalid with respect to IPReservation
  */
  public static IPReservation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IPReservation.class);
  }

 /**
  * Convert an instance of IPReservation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

