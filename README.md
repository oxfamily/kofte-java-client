# openapi-java-client

Köfte
- API version: 0.2
  - Build date: 2024-11-12T13:01:53.928017620+01:00[Europe/Brussels]
  - Generator version: 7.9.0

Köfte Api V1


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:0.2"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-0.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*TemplateroutesApi* | [**deleteTemplById**](docs/TemplateroutesApi.md#deleteTemplById) | **DELETE** /api/v1/template/{id} | 
*TemplateroutesApi* | [**findAll**](docs/TemplateroutesApi.md#findAll) | **GET** /api/v1/template/find-all | 
*TemplateroutesApi* | [**findByContext**](docs/TemplateroutesApi.md#findByContext) | **GET** /api/v1/template/find-by-context | 
*TemplateroutesApi* | [**findByIds**](docs/TemplateroutesApi.md#findByIds) | **GET** /api/v1/template/find-by-ids | 
*TemplateroutesApi* | [**findByType**](docs/TemplateroutesApi.md#findByType) | **GET** /api/v1/template/find-by-type | 
*TemplateroutesApi* | [**findOne**](docs/TemplateroutesApi.md#findOne) | **GET** /api/v1/template/find-one/{templ_id} | 
*TemplateroutesApi* | [**render**](docs/TemplateroutesApi.md#render) | **POST** /api/v1/template/render | 
*TemplateroutesApi* | [**upsert**](docs/TemplateroutesApi.md#upsert) | **POST** /api/v1/template | 
*UploadroutesApi* | [**deleteById**](docs/UploadroutesApi.md#deleteById) | **DELETE** /api/v1/upload/{id} | 
*UploadroutesApi* | [**download**](docs/UploadroutesApi.md#download) | **GET** /api/v1/upload/download | 
*UploadroutesApi* | [**metadata**](docs/UploadroutesApi.md#metadata) | **GET** /api/v1/upload/metadata | 
*UploadroutesApi* | [**upload**](docs/UploadroutesApi.md#upload) | **POST** /api/v1/upload | 


## Documentation for Models

 - [Context](docs/Context.md)
 - [DownloadFileRequestUriParams](docs/DownloadFileRequestUriParams.md)
 - [FileUpload](docs/FileUpload.md)
 - [RenderRequest](docs/RenderRequest.md)
 - [Template](docs/Template.md)
 - [TemplateType](docs/TemplateType.md)
 - [TemplateUpsert](docs/TemplateUpsert.md)
 - [UploadFileRequestUriParams](docs/UploadFileRequestUriParams.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="bearerAuth"></a>
### bearerAuth

- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



