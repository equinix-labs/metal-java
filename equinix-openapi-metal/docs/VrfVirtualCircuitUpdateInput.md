

# VrfVirtualCircuitUpdateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerIp** | **String** | An IP address from the subnet that will be used on the Customer side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Metal IP. By default, the last usable IP address in the subnet will be used. |  [optional] |
|**description** | **String** |  |  [optional] |
|**md5** | **String** | The plaintext BGP peering password shared by neighbors as an MD5 checksum: * must be 10-20 characters long * may not include punctuation * must be a combination of numbers and letters * must contain at least one lowercase, uppercase, and digit character  |  [optional] |
|**metalIp** | **String** | An IP address from the subnet that will be used on the Metal side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Customer IP. By default, the first usable IP address in the subnet will be used. |  [optional] |
|**name** | **String** |  |  [optional] |
|**peerAsn** | **Integer** | The peer ASN that will be used with the VRF on the Virtual Circuit. |  [optional] |
|**speed** | **String** | Speed can be changed only if it is an interconnection on a Dedicated Port |  [optional] |
|**subnet** | **String** | The /30 or /31 subnet of one of the VRF IP Blocks that will be used with the VRF for the Virtual Circuit. This subnet does not have to be an existing VRF IP reservation, as we will create the VRF IP reservation on creation if it does not exist. The Metal IP and Customer IP must be IPs from this subnet. For /30 subnets, the network and broadcast IPs cannot be used as the Metal or Customer IP. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



