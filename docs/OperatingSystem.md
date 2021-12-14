
# OperatingSystem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**slug** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**distro** | **String** |  |  [optional]
**version** | **String** |  |  [optional]
**preinstallable** | **Boolean** | Servers can be already preinstalled with OS in order to shorten provision time. |  [optional]
**provisionableOn** | **List&lt;String&gt;** |  |  [optional]
**pricing** | **Object** | This object contains price per time unit and optional multiplier value if licence price depends on hardware plan or components (e.g. number of cores) |  [optional]
**licensed** | **Boolean** | Licenced OS is priced according to pricing property |  [optional]



