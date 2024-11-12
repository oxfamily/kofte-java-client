/*
 * Köfte
 * Köfte Api V1
 *
 * The version of the OpenAPI document: 0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * FileUpload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T12:58:11.388727288+01:00[Europe/Brussels]", comments = "Generator version: 7.9.0")
public class FileUpload {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_INTERNAL_NAME = "internalName";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NAME)
  private String internalName;

  public static final String SERIALIZED_NAME_ORIGINAL_FILENAME = "originalFilename";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILENAME)
  private String originalFilename;

  public static final String SERIALIZED_NAME_PUBLIC_RESOURCE = "publicResource";
  @SerializedName(SERIALIZED_NAME_PUBLIC_RESOURCE)
  private Boolean publicResource;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_THUMBNAIL_ID = "thumbnailId";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_ID)
  private String thumbnailId;

  public static final String SERIALIZED_NAME_UPDATED_DATE = "updatedDate";
  @SerializedName(SERIALIZED_NAME_UPDATED_DATE)
  private OffsetDateTime updatedDate;

  public FileUpload() {
  }

  public FileUpload id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public FileUpload contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public FileUpload correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * Get correlationId
   * @return correlationId
   */
  @javax.annotation.Nullable
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  public FileUpload creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public FileUpload extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Get extension
   * @return extension
   */
  @javax.annotation.Nullable
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public FileUpload internalName(String internalName) {
    this.internalName = internalName;
    return this;
  }

  /**
   * Get internalName
   * @return internalName
   */
  @javax.annotation.Nonnull
  public String getInternalName() {
    return internalName;
  }

  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }


  public FileUpload originalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
    return this;
  }

  /**
   * Get originalFilename
   * @return originalFilename
   */
  @javax.annotation.Nonnull
  public String getOriginalFilename() {
    return originalFilename;
  }

  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }


  public FileUpload publicResource(Boolean publicResource) {
    this.publicResource = publicResource;
    return this;
  }

  /**
   * Get publicResource
   * @return publicResource
   */
  @javax.annotation.Nonnull
  public Boolean getPublicResource() {
    return publicResource;
  }

  public void setPublicResource(Boolean publicResource) {
    this.publicResource = publicResource;
  }


  public FileUpload size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * minimum: 0
   * @return size
   */
  @javax.annotation.Nonnull
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public FileUpload thumbnailId(String thumbnailId) {
    this.thumbnailId = thumbnailId;
    return this;
  }

  /**
   * Get thumbnailId
   * @return thumbnailId
   */
  @javax.annotation.Nullable
  public String getThumbnailId() {
    return thumbnailId;
  }

  public void setThumbnailId(String thumbnailId) {
    this.thumbnailId = thumbnailId;
  }


  public FileUpload updatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUpload fileUpload = (FileUpload) o;
    return Objects.equals(this.id, fileUpload.id) &&
        Objects.equals(this.contentType, fileUpload.contentType) &&
        Objects.equals(this.correlationId, fileUpload.correlationId) &&
        Objects.equals(this.creationDate, fileUpload.creationDate) &&
        Objects.equals(this.extension, fileUpload.extension) &&
        Objects.equals(this.internalName, fileUpload.internalName) &&
        Objects.equals(this.originalFilename, fileUpload.originalFilename) &&
        Objects.equals(this.publicResource, fileUpload.publicResource) &&
        Objects.equals(this.size, fileUpload.size) &&
        Objects.equals(this.thumbnailId, fileUpload.thumbnailId) &&
        Objects.equals(this.updatedDate, fileUpload.updatedDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contentType, correlationId, creationDate, extension, internalName, originalFilename, publicResource, size, thumbnailId, updatedDate);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUpload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    publicResource: ").append(toIndentedString(publicResource)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    thumbnailId: ").append(toIndentedString(thumbnailId)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("_id");
    openapiFields.add("contentType");
    openapiFields.add("correlationId");
    openapiFields.add("creationDate");
    openapiFields.add("extension");
    openapiFields.add("internalName");
    openapiFields.add("originalFilename");
    openapiFields.add("publicResource");
    openapiFields.add("size");
    openapiFields.add("thumbnailId");
    openapiFields.add("updatedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_id");
    openapiRequiredFields.add("creationDate");
    openapiRequiredFields.add("internalName");
    openapiRequiredFields.add("originalFilename");
    openapiRequiredFields.add("publicResource");
    openapiRequiredFields.add("size");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FileUpload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FileUpload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileUpload is not found in the empty JSON string", FileUpload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FileUpload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileUpload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FileUpload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
      if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull()) && !jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
      if ((jsonObj.get("correlationId") != null && !jsonObj.get("correlationId").isJsonNull()) && !jsonObj.get("correlationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlationId").toString()));
      }
      if ((jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonNull()) && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if (!jsonObj.get("internalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalName").toString()));
      }
      if (!jsonObj.get("originalFilename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalFilename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalFilename").toString()));
      }
      if ((jsonObj.get("thumbnailId") != null && !jsonObj.get("thumbnailId").isJsonNull()) && !jsonObj.get("thumbnailId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnailId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnailId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileUpload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileUpload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileUpload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileUpload.class));

       return (TypeAdapter<T>) new TypeAdapter<FileUpload>() {
           @Override
           public void write(JsonWriter out, FileUpload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileUpload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FileUpload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FileUpload
   * @throws IOException if the JSON string is invalid with respect to FileUpload
   */
  public static FileUpload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileUpload.class);
  }

  /**
   * Convert an instance of FileUpload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

