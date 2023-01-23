

# Port

Port is a hardware port associated with a reserved or instantiated hardware device.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bond** | [**BondPortData**](BondPortData.md) |  |  [optional] |
|**data** | [**PortData**](PortData.md) |  |  [optional] |
|**disbondOperationSupported** | **Boolean** | Indicates whether or not the bond can be broken on the port (when applicable). |  [optional] |
|**href** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type is either \&quot;NetworkBondPort\&quot; for bond ports or \&quot;NetworkPort\&quot; for bondable ethernet ports |  [optional] |
|**networkType** | [**NetworkTypeEnum**](#NetworkTypeEnum) | Composite network type of the bond |  [optional] |
|**nativeVirtualNetwork** | [**VirtualNetwork**](VirtualNetwork.md) |  |  [optional] |
|**virtualNetworks** | [**List&lt;Href&gt;**](Href.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NETWORKPORT | &quot;NetworkPort&quot; |
| NETWORKBONDPORT | &quot;NetworkBondPort&quot; |



## Enum: NetworkTypeEnum

| Name | Value |
|---- | -----|
| LAYER2_BONDED | &quot;layer2-bonded&quot; |
| LAYER2_INDIVIDUAL | &quot;layer2-individual&quot; |
| LAYER3 | &quot;layer3&quot; |
| HYBRID | &quot;hybrid&quot; |
| HYBRID_BONDED | &quot;hybrid-bonded&quot; |



