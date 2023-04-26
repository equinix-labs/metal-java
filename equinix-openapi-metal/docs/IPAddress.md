

# IPAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressFamily** | [**AddressFamilyEnum**](#AddressFamilyEnum) | Address Family for IP Address |  [optional] |
|**cidr** | **Integer** | Cidr Size for the IP Block created. Valid values depends on the operating system being provisioned. (28..32 for IPv4 addresses, 124..127 for IPv6 addresses) |  [optional] |
|**ipReservations** | **List&lt;String&gt;** | UUIDs of any IP reservations to use when assigning IPs |  [optional] |
|**_public** | **Boolean** | Address Type for IP Address |  [optional] |



## Enum: AddressFamilyEnum

| Name | Value |
|---- | -----|
| NUMBER_4 | 4 |
| NUMBER_6 | 6 |



