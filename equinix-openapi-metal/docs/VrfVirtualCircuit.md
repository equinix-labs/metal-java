

# VrfVirtualCircuit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerIp** | **String** | An IP address from the subnet that will be used on the Customer side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Metal IP. By default, the last usable IP address in the subnet will be used. |  [optional] |
|**description** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**md5** | **String** | The MD5 password for the BGP peering in plaintext (not a checksum). |  [optional] |
|**metalIp** | **String** | An IP address from the subnet that will be used on the Metal side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Customer IP. By default, the first usable IP address in the subnet will be used. |  [optional] |
|**name** | **String** |  |  [optional] |
|**port** | [**Href**](Href.md) |  |  [optional] |
|**nniVlan** | **Integer** |  |  [optional] |
|**peerAsn** | **Integer** | The peer ASN that will be used with the VRF on the Virtual Circuit. |  [optional] |
|**project** | [**Href**](Href.md) |  |  [optional] |
|**speed** | **Integer** | integer representing bps speed |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status changes of a VRF virtual circuit are generally the same as Virtual Circuits that aren&#39;t in a VRF. However, for VRF Virtual Circuits on Fabric VCs, the status will change to &#39;waiting_on_peering_details&#39; once the Fabric service token associated with the virtual circuit has been redeemed on Fabric, and Metal has found the associated Fabric connection. At this point, users can update the subnet, MD5 password, customer IP and/or metal IP accordingly. For VRF Virtual Circuits on Dedicated Ports, we require all peering details to be set on creation of a VRF Virtual Circuit. The status will change to &#x60;changing_peering_details&#x60; whenever an active VRF Virtual Circuit has any of its peering details updated. |  [optional] |
|**subnet** | **String** | The /30 or /31 subnet of one of the VRF IP Blocks that will be used with the VRF for the Virtual Circuit. This subnet does not have to be an existing VRF IP reservation, as we will create the VRF IP reservation on creation if it does not exist. The Metal IP and Customer IP must be IPs from this subnet. For /30 subnets, the network and broadcast IPs cannot be used as the Metal or Customer IP. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**vrf** | [**Vrf**](Vrf.md) |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| WAITING_ON_PEERING_DETAILS | &quot;waiting_on_peering_details&quot; |
| ACTIVATING | &quot;activating&quot; |
| CHANGING_PEERING_DETAILS | &quot;changing_peering_details&quot; |
| DEACTIVATING | &quot;deactivating&quot; |
| DELETING | &quot;deleting&quot; |
| ACTIVE | &quot;active&quot; |
| EXPIRED | &quot;expired&quot; |
| ACTIVATION_FAILED | &quot;activation_failed&quot; |
| CHANGING_PEERING_DETAILS_FAILED | &quot;changing_peering_details_failed&quot; |
| DEACTIVATION_FAILED | &quot;deactivation_failed&quot; |
| DELETE_FAILED | &quot;delete_failed&quot; |



