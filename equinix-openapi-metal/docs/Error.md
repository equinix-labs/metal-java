

# Error

Error responses are included with 4xx and 5xx HTTP responses from the API service. Either \"error\" or \"errors\" will be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | **String** | A description of the error that caused the request to fail. |  [optional] |
|**errors** | **List&lt;String&gt;** | A list of errors that contributed to the request failing. |  [optional] |



