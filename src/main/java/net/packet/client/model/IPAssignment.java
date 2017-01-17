/**
 * Packet API
 * This is the API for Packet. Interact with your devices, user account, and projects.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: help@packet.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.packet.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.packet.client.model.Href;
import org.joda.time.DateTime;


/**
 * IPAssignment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-17T14:09:01.179-05:00")
public class IPAssignment   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("address_family")
  private Integer addressFamily = null;

  @JsonProperty("netmask")
  private String netmask = null;

  @JsonProperty("public")
  private Boolean _public = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("cidr")
  private Integer cidr = null;

  @JsonProperty("management")
  private Boolean management = null;

  @JsonProperty("manageable")
  private Boolean manageable = null;

  @JsonProperty("assigned_to")
  private Href assignedTo = null;

  @JsonProperty("network")
  private String network = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("gateway")
  private String gateway = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("created_at")
  private DateTime createdAt = null;

  public IPAssignment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IPAssignment addressFamily(Integer addressFamily) {
    this.addressFamily = addressFamily;
    return this;
  }

   /**
   * Get addressFamily
   * @return addressFamily
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAddressFamily() {
    return addressFamily;
  }

  public void setAddressFamily(Integer addressFamily) {
    this.addressFamily = addressFamily;
  }

  public IPAssignment netmask(String netmask) {
    this.netmask = netmask;
    return this;
  }

   /**
   * Get netmask
   * @return netmask
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNetmask() {
    return netmask;
  }

  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }

  public IPAssignment _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public IPAssignment enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public IPAssignment cidr(Integer cidr) {
    this.cidr = cidr;
    return this;
  }

   /**
   * Get cidr
   * @return cidr
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCidr() {
    return cidr;
  }

  public void setCidr(Integer cidr) {
    this.cidr = cidr;
  }

  public IPAssignment management(Boolean management) {
    this.management = management;
    return this;
  }

   /**
   * Get management
   * @return management
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getManagement() {
    return management;
  }

  public void setManagement(Boolean management) {
    this.management = management;
  }

  public IPAssignment manageable(Boolean manageable) {
    this.manageable = manageable;
    return this;
  }

   /**
   * Get manageable
   * @return manageable
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getManageable() {
    return manageable;
  }

  public void setManageable(Boolean manageable) {
    this.manageable = manageable;
  }

  public IPAssignment assignedTo(Href assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * Get assignedTo
   * @return assignedTo
  **/
  @ApiModelProperty(example = "null", value = "")
  public Href getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(Href assignedTo) {
    this.assignedTo = assignedTo;
  }

  public IPAssignment network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public IPAssignment address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public IPAssignment gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public IPAssignment href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public IPAssignment createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAssignment iPAssignment = (IPAssignment) o;
    return Objects.equals(this.id, iPAssignment.id) &&
        Objects.equals(this.addressFamily, iPAssignment.addressFamily) &&
        Objects.equals(this.netmask, iPAssignment.netmask) &&
        Objects.equals(this._public, iPAssignment._public) &&
        Objects.equals(this.enabled, iPAssignment.enabled) &&
        Objects.equals(this.cidr, iPAssignment.cidr) &&
        Objects.equals(this.management, iPAssignment.management) &&
        Objects.equals(this.manageable, iPAssignment.manageable) &&
        Objects.equals(this.assignedTo, iPAssignment.assignedTo) &&
        Objects.equals(this.network, iPAssignment.network) &&
        Objects.equals(this.address, iPAssignment.address) &&
        Objects.equals(this.gateway, iPAssignment.gateway) &&
        Objects.equals(this.href, iPAssignment.href) &&
        Objects.equals(this.createdAt, iPAssignment.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addressFamily, netmask, _public, enabled, cidr, management, manageable, assignedTo, network, address, gateway, href, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    management: ").append(toIndentedString(management)).append("\n");
    sb.append("    manageable: ").append(toIndentedString(manageable)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

