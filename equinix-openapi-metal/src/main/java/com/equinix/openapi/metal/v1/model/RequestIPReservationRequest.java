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
import com.equinix.openapi.metal.v1.model.IPReservationRequestInput;
import com.equinix.openapi.metal.v1.model.VrfIpReservationCreateInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.equinix.openapi.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestIPReservationRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RequestIPReservationRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RequestIPReservationRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RequestIPReservationRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<IPReservationRequestInput> adapterIPReservationRequestInput = gson.getDelegateAdapter(this, TypeToken.get(IPReservationRequestInput.class));
            final TypeAdapter<VrfIpReservationCreateInput> adapterVrfIpReservationCreateInput = gson.getDelegateAdapter(this, TypeToken.get(VrfIpReservationCreateInput.class));

            return (TypeAdapter<T>) new TypeAdapter<RequestIPReservationRequest>() {
                @Override
                public void write(JsonWriter out, RequestIPReservationRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `IPReservationRequestInput`
                    if (value.getActualInstance() instanceof IPReservationRequestInput) {
                      JsonElement element = adapterIPReservationRequestInput.toJsonTree((IPReservationRequestInput)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `VrfIpReservationCreateInput`
                    if (value.getActualInstance() instanceof VrfIpReservationCreateInput) {
                      JsonElement element = adapterVrfIpReservationCreateInput.toJsonTree((VrfIpReservationCreateInput)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: IPReservationRequestInput, VrfIpReservationCreateInput");
                }

                @Override
                public RequestIPReservationRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize IPReservationRequestInput
                    try {
                      // validate the JSON object to see if any exception is thrown
                      IPReservationRequestInput.validateJsonElement(jsonElement);
                      actualAdapter = adapterIPReservationRequestInput;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'IPReservationRequestInput'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for IPReservationRequestInput failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'IPReservationRequestInput'", e);
                    }
                    // deserialize VrfIpReservationCreateInput
                    try {
                      // validate the JSON object to see if any exception is thrown
                      VrfIpReservationCreateInput.validateJsonElement(jsonElement);
                      actualAdapter = adapterVrfIpReservationCreateInput;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'VrfIpReservationCreateInput'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for VrfIpReservationCreateInput failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'VrfIpReservationCreateInput'", e);
                    }

                    if (match == 1) {
                        RequestIPReservationRequest ret = new RequestIPReservationRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RequestIPReservationRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RequestIPReservationRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public RequestIPReservationRequest(IPReservationRequestInput o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RequestIPReservationRequest(VrfIpReservationCreateInput o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("IPReservationRequestInput", IPReservationRequestInput.class);
        schemas.put("VrfIpReservationCreateInput", VrfIpReservationCreateInput.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RequestIPReservationRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * IPReservationRequestInput, VrfIpReservationCreateInput
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof IPReservationRequestInput) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof VrfIpReservationCreateInput) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be IPReservationRequestInput, VrfIpReservationCreateInput");
    }

    /**
     * Get the actual instance, which can be the following:
     * IPReservationRequestInput, VrfIpReservationCreateInput
     *
     * @return The actual instance (IPReservationRequestInput, VrfIpReservationCreateInput)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `IPReservationRequestInput`. If the actual instance is not `IPReservationRequestInput`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IPReservationRequestInput`
     * @throws ClassCastException if the instance is not `IPReservationRequestInput`
     */
    public IPReservationRequestInput getIPReservationRequestInput() throws ClassCastException {
        return (IPReservationRequestInput)super.getActualInstance();
    }
    /**
     * Get the actual instance of `VrfIpReservationCreateInput`. If the actual instance is not `VrfIpReservationCreateInput`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VrfIpReservationCreateInput`
     * @throws ClassCastException if the instance is not `VrfIpReservationCreateInput`
     */
    public VrfIpReservationCreateInput getVrfIpReservationCreateInput() throws ClassCastException {
        return (VrfIpReservationCreateInput)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RequestIPReservationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with IPReservationRequestInput
    try {
      IPReservationRequestInput.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for IPReservationRequestInput failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with VrfIpReservationCreateInput
    try {
      VrfIpReservationCreateInput.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for VrfIpReservationCreateInput failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RequestIPReservationRequest with oneOf schemas: IPReservationRequestInput, VrfIpReservationCreateInput. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of RequestIPReservationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestIPReservationRequest
  * @throws IOException if the JSON string is invalid with respect to RequestIPReservationRequest
  */
  public static RequestIPReservationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestIPReservationRequest.class);
  }

 /**
  * Convert an instance of RequestIPReservationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

