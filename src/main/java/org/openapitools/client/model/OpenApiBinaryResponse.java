/*
 * Köfte
 * Köfte Api V1
 *
 * The version of the OpenAPI document: 0.5
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
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

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
 * OpenApiBinaryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T19:46:46.523141013+01:00[Europe/Brussels]", comments = "Generator version: 7.9.0")
public class OpenApiBinaryResponse {
  public static final String SERIALIZED_NAME_FILE_BYTES = "file_bytes";
  @SerializedName(SERIALIZED_NAME_FILE_BYTES)
  private File fileBytes;

  public OpenApiBinaryResponse() {
  }

  public OpenApiBinaryResponse fileBytes(File fileBytes) {
    this.fileBytes = fileBytes;
    return this;
  }

  /**
   * Get fileBytes
   * @return fileBytes
   */
  @javax.annotation.Nonnull
  public File getFileBytes() {
    return fileBytes;
  }

  public void setFileBytes(File fileBytes) {
    this.fileBytes = fileBytes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiBinaryResponse openApiBinaryResponse = (OpenApiBinaryResponse) o;
    return Objects.equals(this.fileBytes, openApiBinaryResponse.fileBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiBinaryResponse {\n");
    sb.append("    fileBytes: ").append(toIndentedString(fileBytes)).append("\n");
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
    openapiFields.add("file_bytes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("file_bytes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OpenApiBinaryResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenApiBinaryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenApiBinaryResponse is not found in the empty JSON string", OpenApiBinaryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenApiBinaryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenApiBinaryResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OpenApiBinaryResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenApiBinaryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenApiBinaryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenApiBinaryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenApiBinaryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenApiBinaryResponse>() {
           @Override
           public void write(JsonWriter out, OpenApiBinaryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenApiBinaryResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OpenApiBinaryResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OpenApiBinaryResponse
   * @throws IOException if the JSON string is invalid with respect to OpenApiBinaryResponse
   */
  public static OpenApiBinaryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenApiBinaryResponse.class);
  }

  /**
   * Convert an instance of OpenApiBinaryResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

