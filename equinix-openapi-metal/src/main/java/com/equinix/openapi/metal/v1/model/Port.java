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
import com.equinix.openapi.metal.v1.model.BondPortData;
import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.PortData;
import com.equinix.openapi.metal.v1.model.VirtualNetwork;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * Port is a hardware port associated with a reserved or instantiated hardware device.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Port {
  public static final String SERIALIZED_NAME_BOND = "bond";
  @SerializedName(SERIALIZED_NAME_BOND)
  private BondPortData bond;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private PortData data;

  public static final String SERIALIZED_NAME_DISBOND_OPERATION_SUPPORTED = "disbond_operation_supported";
  @SerializedName(SERIALIZED_NAME_DISBOND_OPERATION_SUPPORTED)
  private Boolean disbondOperationSupported;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Type is either \&quot;NetworkBondPort\&quot; for bond ports or \&quot;NetworkPort\&quot; for bondable ethernet ports
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NETWORKPORT("NetworkPort"),
    
    NETWORKBONDPORT("NetworkBondPort");

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
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * Composite network type of the bond
   */
  @JsonAdapter(NetworkTypeEnum.Adapter.class)
  public enum NetworkTypeEnum {
    LAYER2_BONDED("layer2-bonded"),
    
    LAYER2_INDIVIDUAL("layer2-individual"),
    
    LAYER3("layer3"),
    
    HYBRID("hybrid"),
    
    HYBRID_BONDED("hybrid-bonded");

    private String value;

    NetworkTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NetworkTypeEnum fromValue(String value) {
      for (NetworkTypeEnum b : NetworkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NetworkTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NetworkTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NetworkTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NetworkTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NETWORK_TYPE = "network_type";
  @SerializedName(SERIALIZED_NAME_NETWORK_TYPE)
  private NetworkTypeEnum networkType;

  public static final String SERIALIZED_NAME_NATIVE_VIRTUAL_NETWORK = "native_virtual_network";
  @SerializedName(SERIALIZED_NAME_NATIVE_VIRTUAL_NETWORK)
  private VirtualNetwork nativeVirtualNetwork;

  public static final String SERIALIZED_NAME_VIRTUAL_NETWORKS = "virtual_networks";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NETWORKS)
  private List<Href> virtualNetworks;

  public Port() {
  }

  public Port bond(BondPortData bond) {
    
    this.bond = bond;
    return this;
  }

   /**
   * Get bond
   * @return bond
  **/
  @javax.annotation.Nullable
  public BondPortData getBond() {
    return bond;
  }


  public void setBond(BondPortData bond) {
    this.bond = bond;
  }


  public Port data(PortData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public PortData getData() {
    return data;
  }


  public void setData(PortData data) {
    this.data = data;
  }


  public Port disbondOperationSupported(Boolean disbondOperationSupported) {
    
    this.disbondOperationSupported = disbondOperationSupported;
    return this;
  }

   /**
   * Indicates whether or not the bond can be broken on the port (when applicable).
   * @return disbondOperationSupported
  **/
  @javax.annotation.Nullable
  public Boolean getDisbondOperationSupported() {
    return disbondOperationSupported;
  }


  public void setDisbondOperationSupported(Boolean disbondOperationSupported) {
    this.disbondOperationSupported = disbondOperationSupported;
  }


  public Port href(String href) {
    
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


  public Port id(UUID id) {
    
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


  public Port name(String name) {
    
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


  public Port type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type is either \&quot;NetworkBondPort\&quot; for bond ports or \&quot;NetworkPort\&quot; for bondable ethernet ports
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Port networkType(NetworkTypeEnum networkType) {
    
    this.networkType = networkType;
    return this;
  }

   /**
   * Composite network type of the bond
   * @return networkType
  **/
  @javax.annotation.Nullable
  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }


  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }


  public Port nativeVirtualNetwork(VirtualNetwork nativeVirtualNetwork) {
    
    this.nativeVirtualNetwork = nativeVirtualNetwork;
    return this;
  }

   /**
   * Get nativeVirtualNetwork
   * @return nativeVirtualNetwork
  **/
  @javax.annotation.Nullable
  public VirtualNetwork getNativeVirtualNetwork() {
    return nativeVirtualNetwork;
  }


  public void setNativeVirtualNetwork(VirtualNetwork nativeVirtualNetwork) {
    this.nativeVirtualNetwork = nativeVirtualNetwork;
  }


  public Port virtualNetworks(List<Href> virtualNetworks) {
    
    this.virtualNetworks = virtualNetworks;
    return this;
  }

  public Port addVirtualNetworksItem(Href virtualNetworksItem) {
    if (this.virtualNetworks == null) {
      this.virtualNetworks = new ArrayList<>();
    }
    this.virtualNetworks.add(virtualNetworksItem);
    return this;
  }

   /**
   * Get virtualNetworks
   * @return virtualNetworks
  **/
  @javax.annotation.Nullable
  public List<Href> getVirtualNetworks() {
    return virtualNetworks;
  }


  public void setVirtualNetworks(List<Href> virtualNetworks) {
    this.virtualNetworks = virtualNetworks;
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
   * @return the Port instance itself
   */
  public Port putAdditionalProperty(String key, Object value) {
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
    Port port = (Port) o;
    return Objects.equals(this.bond, port.bond) &&
        Objects.equals(this.data, port.data) &&
        Objects.equals(this.disbondOperationSupported, port.disbondOperationSupported) &&
        Objects.equals(this.href, port.href) &&
        Objects.equals(this.id, port.id) &&
        Objects.equals(this.name, port.name) &&
        Objects.equals(this.type, port.type) &&
        Objects.equals(this.networkType, port.networkType) &&
        Objects.equals(this.nativeVirtualNetwork, port.nativeVirtualNetwork) &&
        Objects.equals(this.virtualNetworks, port.virtualNetworks)&&
        Objects.equals(this.additionalProperties, port.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bond, data, disbondOperationSupported, href, id, name, type, networkType, nativeVirtualNetwork, virtualNetworks, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Port {\n");
    sb.append("    bond: ").append(toIndentedString(bond)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    disbondOperationSupported: ").append(toIndentedString(disbondOperationSupported)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    nativeVirtualNetwork: ").append(toIndentedString(nativeVirtualNetwork)).append("\n");
    sb.append("    virtualNetworks: ").append(toIndentedString(virtualNetworks)).append("\n");
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
    openapiFields.add("bond");
    openapiFields.add("data");
    openapiFields.add("disbond_operation_supported");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("network_type");
    openapiFields.add("native_virtual_network");
    openapiFields.add("virtual_networks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Port
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Port.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Port is not found in the empty JSON string", Port.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `bond`
      if (jsonObj.get("bond") != null && !jsonObj.get("bond").isJsonNull()) {
        BondPortData.validateJsonObject(jsonObj.getAsJsonObject("bond"));
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        PortData.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("network_type") != null && !jsonObj.get("network_type").isJsonNull()) && !jsonObj.get("network_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network_type").toString()));
      }
      // validate the optional field `native_virtual_network`
      if (jsonObj.get("native_virtual_network") != null && !jsonObj.get("native_virtual_network").isJsonNull()) {
        VirtualNetwork.validateJsonObject(jsonObj.getAsJsonObject("native_virtual_network"));
      }
      if (jsonObj.get("virtual_networks") != null && !jsonObj.get("virtual_networks").isJsonNull()) {
        JsonArray jsonArrayvirtualNetworks = jsonObj.getAsJsonArray("virtual_networks");
        if (jsonArrayvirtualNetworks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("virtual_networks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `virtual_networks` to be an array in the JSON string but got `%s`", jsonObj.get("virtual_networks").toString()));
          }

          // validate the optional field `virtual_networks` (array)
          for (int i = 0; i < jsonArrayvirtualNetworks.size(); i++) {
            Href.validateJsonObject(jsonArrayvirtualNetworks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Port.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Port' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Port> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Port.class));

       return (TypeAdapter<T>) new TypeAdapter<Port>() {
           @Override
           public void write(JsonWriter out, Port value) throws IOException {
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
           public Port read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Port instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Port given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Port
  * @throws IOException if the JSON string is invalid with respect to Port
  */
  public static Port fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Port.class);
  }

 /**
  * Convert an instance of Port to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

