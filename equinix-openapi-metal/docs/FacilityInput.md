

# FacilityInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**facility** | **List&lt;String&gt;** | The datacenter where the device should be created.  Either metro or facility must be provided.  The API will accept either a single facility &#x60;{ \&quot;facility\&quot;: \&quot;f1\&quot; }&#x60;, or it can be instructed to create the device in the best available datacenter &#x60;{ \&quot;facility\&quot;: \&quot;any\&quot; }&#x60;.  Additionally it is possible to set a prioritized location selection. For example &#x60;{ \&quot;facility\&quot;: [\&quot;f3\&quot;, \&quot;f2\&quot;, \&quot;any\&quot;] }&#x60; can be used to prioritize &#x60;f3&#x60; and then &#x60;f2&#x60; before accepting &#x60;any&#x60; facility. If none of the facilities provided have availability for the requested device the request will fail. |  |



