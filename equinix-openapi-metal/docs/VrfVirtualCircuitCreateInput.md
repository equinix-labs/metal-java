

# VrfVirtualCircuitCreateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerIp** | **String** | An IP address from the subnet that will be used on the Customer side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Metal IP. By default, the last usable IP address in the subnet will be used. |  [optional] |
|**description** | **String** |  |  [optional] |
|**md5** | **String** | The MD5 password for the BGP peering in plaintext (not a checksum). |  [optional] |
|**metalIp** | **String** | An IP address from the subnet that will be used on the Metal side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Customer IP. By default, the first usable IP address in the subnet will be used. |  [optional] |
|**name** | **String** |  |  [optional] |
|**nniVlan** | **Integer** |  |  |
|**peerAsn** | **Integer** | The peer ASN that will be used with the VRF on the Virtual Circuit. |  |
|**project** | **UUID** |  |  |
|**speed** | **Integer** | speed can be passed as integer number representing bps speed or string (e.g. &#39;52m&#39; or &#39;100g&#39; or &#39;4 gbps&#39;) |  [optional] |
|**subnet** | **String** | The /30 or /31 subnet of one of the VRF IP Blocks that will be used with the VRF for the Virtual Circuit. This subnet does not have to be an existing VRF IP reservation, as we will create the VRF IP reservation on creation if it does not exist. The Metal IP and Customer IP must be IPs from this subnet. For /30 subnets, the network and broadcast IPs cannot be used as the Metal or Customer IP. The subnet specified must be contained within an already-defined IP Range for the VRF. |  |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**vrf** | **UUID** | The UUID of the VRF that will be associated with the Virtual Circuit. |  |



