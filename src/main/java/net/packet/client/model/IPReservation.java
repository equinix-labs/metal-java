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
import java.util.ArrayList;
import java.util.List;
import net.packet.client.model.Facility;
import net.packet.client.model.IPAssignment;
import org.joda.time.DateTime;


/**
 * IPReservation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-17T14:09:01.179-05:00")
public class IPReservation   {
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

  @JsonProperty("addon")
  private Boolean addon = null;

  @JsonProperty("bill")
  private Boolean bill = null;

  @JsonProperty("assignments")
  private List<IPAssignment> assignments = new ArrayList<IPAssignment>();

  @JsonProperty("network")
  private String network = null;

  @JsonProperty("created_at")
  private DateTime createdAt = null;

  @JsonProperty("facility")
  private Facility facility = null;

  @JsonProperty("href")
  private String href = null;

  public IPReservation id(String id) {
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

  public IPReservation addressFamily(Integer addressFamily) {
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

  public IPReservation netmask(String netmask) {
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

  public IPReservation _public(Boolean _public) {
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

  public IPReservation enabled(Boolean enabled) {
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

  public IPReservation cidr(Integer cidr) {
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

  public IPReservation management(Boolean management) {
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

  public IPReservation manageable(Boolean manageable) {
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

  public IPReservation addon(Boolean addon) {
    this.addon = addon;
    return this;
  }

   /**
   * Get addon
   * @return addon
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAddon() {
    return addon;
  }

  public void setAddon(Boolean addon) {
    this.addon = addon;
  }

  public IPReservation bill(Boolean bill) {
    this.bill = bill;
    return this;
  }

   /**
   * Get bill
   * @return bill
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getBill() {
    return bill;
  }

  public void setBill(Boolean bill) {
    this.bill = bill;
  }

  public IPReservation assignments(List<IPAssignment> assignments) {
    this.assignments = assignments;
    return this;
  }

  public IPReservation addAssignmentsItem(IPAssignment assignmentsItem) {
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<IPAssignment> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<IPAssignment> assignments) {
    this.assignments = assignments;
  }

  public IPReservation network(String network) {
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

  public IPReservation createdAt(DateTime createdAt) {
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

  public IPReservation facility(Facility facility) {
    this.facility = facility;
    return this;
  }

   /**
   * Get facility
   * @return facility
  **/
  @ApiModelProperty(example = "null", value = "")
  public Facility getFacility() {
    return facility;
  }

  public void setFacility(Facility facility) {
    this.facility = facility;
  }

  public IPReservation href(String href) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPReservation iPReservation = (IPReservation) o;
    return Objects.equals(this.id, iPReservation.id) &&
        Objects.equals(this.addressFamily, iPReservation.addressFamily) &&
        Objects.equals(this.netmask, iPReservation.netmask) &&
        Objects.equals(this._public, iPReservation._public) &&
        Objects.equals(this.enabled, iPReservation.enabled) &&
        Objects.equals(this.cidr, iPReservation.cidr) &&
        Objects.equals(this.management, iPReservation.management) &&
        Objects.equals(this.manageable, iPReservation.manageable) &&
        Objects.equals(this.addon, iPReservation.addon) &&
        Objects.equals(this.bill, iPReservation.bill) &&
        Objects.equals(this.assignments, iPReservation.assignments) &&
        Objects.equals(this.network, iPReservation.network) &&
        Objects.equals(this.createdAt, iPReservation.createdAt) &&
        Objects.equals(this.facility, iPReservation.facility) &&
        Objects.equals(this.href, iPReservation.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addressFamily, netmask, _public, enabled, cidr, management, manageable, addon, bill, assignments, network, createdAt, facility, href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPReservation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    management: ").append(toIndentedString(management)).append("\n");
    sb.append("    manageable: ").append(toIndentedString(manageable)).append("\n");
    sb.append("    addon: ").append(toIndentedString(addon)).append("\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

