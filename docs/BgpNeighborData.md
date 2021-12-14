
# BgpNeighborData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressFamily** | [**BigDecimal**](BigDecimal.md) | Address Family for IP Address. Accepted values are 4 or 6 |  [optional]
**customerAs** | [**BigDecimal**](BigDecimal.md) | The customer&#39;s ASN. In a local BGP deployment, this will be an internal ASN used to route within the data center. For a global BGP deployment, this will be the your own ASN, configured when you set up BGP for your project. |  [optional]
**customerIp** | **String** | The device&#39;s IP address. For an IPv4 BGP session, this is typically the private bond0 address for the device. |  [optional]
**md5Enabled** | **Boolean** | True if an MD5 password is configured for the project. |  [optional]
**md5Password** | **String** | The MD5 password configured for the project, if set. |  [optional]
**multihop** | **Boolean** | True when the BGP session should be configured as multihop. |  [optional]
**peerAs** | [**BigDecimal**](BigDecimal.md) | The Peer ASN to use when configuring BGP on your device. |  [optional]
**peerIps** | **List&lt;String&gt;** | A list of one or more IP addresses to use for the Peer IP section of your BGP configuration. For non-multihop sessions, this will typically be a single gateway address for the device. For multihop sessions, it will be a list of IPs. |  [optional]
**routesIn** | [**List&lt;BgpNeighborDataRoutesIn&gt;**](BgpNeighborDataRoutesIn.md) | A list of project subnets |  [optional]
**routesOut** | [**List&lt;BgpNeighborDataRoutesOut&gt;**](BgpNeighborDataRoutesOut.md) | A list of outgoing routes. Only populated if the BGP session has default route enabled. |  [optional]



