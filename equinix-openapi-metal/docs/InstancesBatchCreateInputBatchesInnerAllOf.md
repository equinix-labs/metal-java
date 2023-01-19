

# InstancesBatchCreateInputBatchesInnerAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hostnames** | **List&lt;String&gt;** |  |  [optional] |
|**quantity** | **Integer** | The number of devices to create in this batch. The hostname may contain an &#x60;{{index}}&#x60; placeholder, which will be replaced with the index of the device in the batch. For example, if the hostname is &#x60;device-{{index}}&#x60;, the first device in the batch will have the hostname &#x60;device-01&#x60;, the second device will have the hostname &#x60;device-02&#x60;, and so on. |  [optional] |



