

# OperatingSystem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**distro** | **String** |  |  [optional] |
|**distroLabel** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**licensed** | **Boolean** | Licenced OS is priced according to pricing property |  [optional] |
|**name** | **String** |  |  [optional] |
|**preinstallable** | **Boolean** | Servers can be already preinstalled with OS in order to shorten provision time. |  [optional] |
|**pricing** | **Object** | This object contains price per time unit and optional multiplier value if licence price depends on hardware plan or components (e.g. number of cores) |  [optional] |
|**provisionableOn** | **List&lt;String&gt;** |  |  [optional] |
|**slug** | **String** |  |  [optional] |
|**version** | **String** |  |  [optional] |
|**defaultOperatingSystem** | **Boolean** | Default operating system for the distro. |  [optional] [readonly] |



