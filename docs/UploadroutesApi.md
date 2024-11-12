# UploadroutesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteById**](UploadroutesApi.md#deleteById) | **DELETE** /api/v1/upload/{id} |  |
| [**download**](UploadroutesApi.md#download) | **GET** /api/v1/upload/download |  |
| [**metadata**](UploadroutesApi.md#metadata) | **GET** /api/v1/upload/metadata |  |
| [**upload**](UploadroutesApi.md#upload) | **POST** /api/v1/upload |  |


<a id="deleteById"></a>
# **deleteById**
> deleteById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UploadroutesApi apiInstance = new UploadroutesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadroutesApi#deleteById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a file by id |  -  |

<a id="download"></a>
# **download**
> OpenApiBinaryResponse download(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UploadroutesApi apiInstance = new UploadroutesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      OpenApiBinaryResponse result = apiInstance.download(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadroutesApi#download");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**OpenApiBinaryResponse**](OpenApiBinaryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download file |  -  |

<a id="metadata"></a>
# **metadata**
> FileUpload metadata(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UploadroutesApi apiInstance = new UploadroutesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      FileUpload result = apiInstance.metadata(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadroutesApi#metadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**FileUpload**](FileUpload.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get upload metadata |  -  |

<a id="upload"></a>
# **upload**
> FileUpload upload(fileBytes, correlationId, id, isPublic)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UploadroutesApi apiInstance = new UploadroutesApi(defaultClient);
    File fileBytes = new File("/path/to/file"); // File | 
    String correlationId = "correlationId_example"; // String | 
    String id = "id_example"; // String | 
    Boolean isPublic = true; // Boolean | 
    try {
      FileUpload result = apiInstance.upload(fileBytes, correlationId, id, isPublic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadroutesApi#upload");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileBytes** | **File**|  | |
| **correlationId** | **String**|  | [optional] |
| **id** | **String**|  | [optional] |
| **isPublic** | **Boolean**|  | [optional] |

### Return type

[**FileUpload**](FileUpload.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload a file |  -  |

