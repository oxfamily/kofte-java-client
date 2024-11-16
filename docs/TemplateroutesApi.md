# TemplateroutesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTemplById**](TemplateroutesApi.md#deleteTemplById) | **DELETE** /api/v1/template/{id} |  |
| [**findAll**](TemplateroutesApi.md#findAll) | **GET** /api/v1/template/find-all |  |
| [**findByContext**](TemplateroutesApi.md#findByContext) | **GET** /api/v1/template/find-by-context |  |
| [**findByIds**](TemplateroutesApi.md#findByIds) | **GET** /api/v1/template/find-by-ids |  |
| [**findByType**](TemplateroutesApi.md#findByType) | **GET** /api/v1/template/find-by-type |  |
| [**findOne**](TemplateroutesApi.md#findOne) | **GET** /api/v1/template/find-one/{templ_id} |  |
| [**render**](TemplateroutesApi.md#render) | **POST** /api/v1/template/render |  |
| [**upsert**](TemplateroutesApi.md#upsert) | **POST** /api/v1/template |  |


<a id="deleteTemplById"></a>
# **deleteTemplById**
> deleteTemplById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TemplateroutesApi apiInstance = new TemplateroutesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteTemplById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateroutesApi#deleteTemplById");
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
| **200** | Delete a template by id |  -  |

<a id="findAll"></a>
# **findAll**
> List&lt;Template&gt; findAll()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TemplateroutesApi apiInstance = new TemplateroutesApi(defaultClient);
    try {
      List<Template> result = apiInstance.findAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateroutesApi#findAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Template&gt;**](Template.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Find all templates |  -  |

<a id="findByContext"></a>
# **findByContext**
> List&lt;Template&gt; findByContext(context)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TemplateroutesApi apiInstance = new TemplateroutesApi(defaultClient);
    Context context = Context.fromValue("INVOICE"); // Context | 
    try {
      List<Template> result = apiInstance.findByContext(context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateroutesApi#findByContext");
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
| **context** | [**Context**](.md)|  | [enum: INVOICE] |

### Return type

[**List&lt;Template&gt;**](Template.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Find templates by context |  -  |

<a id="findByIds"></a>
# **findByIds**
> List&lt;Template&gt; findByIds(ids)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TemplateroutesApi apiInstance = new TemplateroutesApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | 
    try {
      List<Template> result = apiInstance.findByIds(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateroutesApi#findByIds");
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
| **ids** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

[**List&lt;Template&gt;**](Template.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Find By ids |  -  |

<a id="findByType"></a>
# **findByType**
> List&lt;Template&gt; findByType(templateType)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TemplateroutesApi apiInstance = new TemplateroutesApi(defaultClient);
    TemplateType templateType = TemplateType.fromValue("HTML"); // TemplateType | 
    try {
      List<Template> result = apiInstance.findByType(templateType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateroutesApi#findByType");
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
| **templateType** | [**TemplateType**](.md)|  | [enum: HTML] |

### Return type

[**List&lt;Template&gt;**](Template.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Find templates by type |  -  |

<a id="findOne"></a>
# **findOne**
> Template findOne(templId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TemplateroutesApi apiInstance = new TemplateroutesApi(defaultClient);
    String templId = "templId_example"; // String | 
    try {
      Template result = apiInstance.findOne(templId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateroutesApi#findOne");
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
| **templId** | **String**|  | |

### Return type

[**Template**](Template.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Find a template by id |  -  |

<a id="render"></a>
# **render**
> OpenApiBinaryResponse render(renderRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TemplateroutesApi apiInstance = new TemplateroutesApi(defaultClient);
    RenderRequest renderRequest = new RenderRequest(); // RenderRequest | 
    try {
      OpenApiBinaryResponse result = apiInstance.render(renderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateroutesApi#render");
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
| **renderRequest** | [**RenderRequest**](RenderRequest.md)|  | |

### Return type

[**OpenApiBinaryResponse**](OpenApiBinaryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Render template |  -  |

<a id="upsert"></a>
# **upsert**
> Template upsert(title, templateType, templateContext, fileBytes, id, description)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateroutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TemplateroutesApi apiInstance = new TemplateroutesApi(defaultClient);
    String title = "title_example"; // String | 
    TemplateType templateType = TemplateType.fromValue("HTML"); // TemplateType | 
    Context templateContext = Context.fromValue("INVOICE"); // Context | 
    File fileBytes = new File("/path/to/file"); // File | 
    String id = "id_example"; // String | 
    String description = "description_example"; // String | 
    try {
      Template result = apiInstance.upsert(title, templateType, templateContext, fileBytes, id, description);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateroutesApi#upsert");
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
| **title** | **String**|  | |
| **templateType** | [**TemplateType**](.md)|  | [enum: HTML] |
| **templateContext** | [**Context**](.md)|  | [enum: INVOICE] |
| **fileBytes** | **File**|  | |
| **id** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |

### Return type

[**Template**](Template.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upsert a template |  -  |

