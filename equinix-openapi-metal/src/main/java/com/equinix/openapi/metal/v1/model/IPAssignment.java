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
import com.equinix.openapi.metal.v1.model.IPAssignmentMetro;
import com.equinix.openapi.metal.v1.model.ParentBlock;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * IPAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IPAssignment {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_FAMILY = "address_family";
  @SerializedName(SERIALIZED_NAME_ADDRESS_FAMILY)
  private Integer addressFamily;

  public static final String SERIALIZED_NAME_ASSIGNED_TO = "assigned_to";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_TO)
  private Href assignedTo;

  public static final String SERIALIZED_NAME_CIDR = "cidr";
  @SerializedName(SERIALIZED_NAME_CIDR)
  private Integer cidr;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

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

  public static final String SERIALIZED_NAME_METRO = "metro";
  @SerializedName(SERIALIZED_NAME_METRO)
  private IPAssignmentMetro metro;

  public static final String SERIALIZED_NAME_NETMASK = "netmask";
  @SerializedName(SERIALIZED_NAME_NETMASK)
  private String netmask;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_PARENT_BLOCK = "parent_block";
  @SerializedName(SERIALIZED_NAME_PARENT_BLOCK)
  private ParentBlock parentBlock;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public IPAssignment() {
  }

  public IPAssignment address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public IPAssignment addressFamily(Integer addressFamily) {
    
    this.addressFamily = addressFamily;
    return this;
  }

   /**
   * Get addressFamily
   * @return addressFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAddressFamily() {
    return addressFamily;
  }


  public void setAddressFamily(Integer addressFamily) {
    this.addressFamily = addressFamily;
  }


  public IPAssignment assignedTo(Href assignedTo) {
    
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * Get assignedTo
   * @return assignedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Href getAssignedTo() {
    return assignedTo;
  }


  public void setAssignedTo(Href assignedTo) {
    this.assignedTo = assignedTo;
  }


  public IPAssignment cidr(Integer cidr) {
    
    this.cidr = cidr;
    return this;
  }

   /**
   * Get cidr
   * @return cidr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCidr() {
    return cidr;
  }


  public void setCidr(Integer cidr) {
    this.cidr = cidr;
  }


  public IPAssignment createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public IPAssignment enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public IPAssignment gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public IPAssignment globalIp(Boolean globalIp) {
    
    this.globalIp = globalIp;
    return this;
  }

   /**
   * Get globalIp
   * @return globalIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGlobalIp() {
    return globalIp;
  }


  public void setGlobalIp(Boolean globalIp) {
    this.globalIp = globalIp;
  }


  public IPAssignment href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public IPAssignment id(UUID id) {
    
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


  public IPAssignment manageable(Boolean manageable) {
    
    this.manageable = manageable;
    return this;
  }

   /**
   * Get manageable
   * @return manageable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getManageable() {
    return manageable;
  }


  public void setManageable(Boolean manageable) {
    this.manageable = manageable;
  }


  public IPAssignment management(Boolean management) {
    
    this.management = management;
    return this;
  }

   /**
   * Get management
   * @return management
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getManagement() {
    return management;
  }


  public void setManagement(Boolean management) {
    this.management = management;
  }


  public IPAssignment metro(IPAssignmentMetro metro) {
    
    this.metro = metro;
    return this;
  }

   /**
   * Get metro
   * @return metro
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IPAssignmentMetro getMetro() {
    return metro;
  }


  public void setMetro(IPAssignmentMetro metro) {
    this.metro = metro;
  }


  public IPAssignment netmask(String netmask) {
    
    this.netmask = netmask;
    return this;
  }

   /**
   * Get netmask
   * @return netmask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNetmask() {
    return netmask;
  }


  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }


  public IPAssignment network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public IPAssignment parentBlock(ParentBlock parentBlock) {
    
    this.parentBlock = parentBlock;
    return this;
  }

   /**
   * Get parentBlock
   * @return parentBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ParentBlock getParentBlock() {
    return parentBlock;
  }


  public void setParentBlock(ParentBlock parentBlock) {
    this.parentBlock = parentBlock;
  }


  public IPAssignment _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
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
  public IPAssignment putAdditionalProperty(String key, Object value) {
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
    IPAssignment ipAssignment = (IPAssignment) o;
    return Objects.equals(this.address, ipAssignment.address) &&
        Objects.equals(this.addressFamily, ipAssignment.addressFamily) &&
        Objects.equals(this.assignedTo, ipAssignment.assignedTo) &&
        Objects.equals(this.cidr, ipAssignment.cidr) &&
        Objects.equals(this.createdAt, ipAssignment.createdAt) &&
        Objects.equals(this.enabled, ipAssignment.enabled) &&
        Objects.equals(this.gateway, ipAssignment.gateway) &&
        Objects.equals(this.globalIp, ipAssignment.globalIp) &&
        Objects.equals(this.href, ipAssignment.href) &&
        Objects.equals(this.id, ipAssignment.id) &&
        Objects.equals(this.manageable, ipAssignment.manageable) &&
        Objects.equals(this.management, ipAssignment.management) &&
        Objects.equals(this.metro, ipAssignment.metro) &&
        Objects.equals(this.netmask, ipAssignment.netmask) &&
        Objects.equals(this.network, ipAssignment.network) &&
        Objects.equals(this.parentBlock, ipAssignment.parentBlock) &&
        Objects.equals(this._public, ipAssignment._public)&&
        Objects.equals(this.additionalProperties, ipAssignment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressFamily, assignedTo, cidr, createdAt, enabled, gateway, globalIp, href, id, manageable, management, metro, netmask, network, parentBlock, _public, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAssignment {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    globalIp: ").append(toIndentedString(globalIp)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manageable: ").append(toIndentedString(manageable)).append("\n");
    sb.append("    management: ").append(toIndentedString(management)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    parentBlock: ").append(toIndentedString(parentBlock)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("address_family");
    openapiFields.add("assigned_to");
    openapiFields.add("cidr");
    openapiFields.add("created_at");
    openapiFields.add("enabled");
    openapiFields.add("gateway");
    openapiFields.add("global_ip");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("manageable");
    openapiFields.add("management");
    openapiFields.add("metro");
    openapiFields.add("netmask");
    openapiFields.add("network");
    openapiFields.add("parent_block");
    openapiFields.add("public");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IPAssignment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IPAssignment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IPAssignment is not found in the empty JSON string", IPAssignment.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      // validate the optional field `assigned_to`
      if (jsonObj.get("assigned_to") != null && !jsonObj.get("assigned_to").isJsonNull()) {
        Href.validateJsonObject(jsonObj.getAsJsonObject("assigned_to"));
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
      // validate the optional field `metro`
      if (jsonObj.get("metro") != null && !jsonObj.get("metro").isJsonNull()) {
        IPAssignmentMetro.validateJsonObject(jsonObj.getAsJsonObject("metro"));
      }
      if ((jsonObj.get("netmask") != null && !jsonObj.get("netmask").isJsonNull()) && !jsonObj.get("netmask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netmask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netmask").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      // validate the optional field `parent_block`
      if (jsonObj.get("parent_block") != null && !jsonObj.get("parent_block").isJsonNull()) {
        ParentBlock.validateJsonObject(jsonObj.getAsJsonObject("parent_block"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IPAssignment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IPAssignment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IPAssignment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IPAssignment.class));

       return (TypeAdapter<T>) new TypeAdapter<IPAssignment>() {
           @Override
           public void write(JsonWriter out, IPAssignment value) throws IOException {
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
           public IPAssignment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IPAssignment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IPAssignment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IPAssignment
  * @throws IOException if the JSON string is invalid with respect to IPAssignment
  */
  public static IPAssignment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IPAssignment.class);
  }

 /**
  * Convert an instance of IPAssignment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

