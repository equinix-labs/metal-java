

# VrfIPReservationCreateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cidr** | **Integer** | The size of the VRF IP Reservation&#39;s subnet |  |
|**customdata** | **Object** |  |  [optional] |
|**details** | **String** |  |  [optional] |
|**network** | **String** | The starting address for this VRF IP Reservation&#39;s subnet |  |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**type** | **String** | Must be set to &#39;vrf&#39; |  |
|**vrfId** | **UUID** | The ID of the VRF in which this VRF IP Reservation is created. The VRF must have an existing IP Range that contains the requested subnet. This field may be aliased as just &#39;vrf&#39;. |  |



