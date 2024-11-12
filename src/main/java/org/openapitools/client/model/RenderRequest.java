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
import java.util.Arrays;
import org.openapitools.client.model.Context;

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
 * RenderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T13:11:15.572889367+01:00[Europe/Brussels]", comments = "Generator version: 7.9.0")
public class RenderRequest {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Object context = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_TEMPLATE_CONTEXT = "templateContext";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_CONTEXT)
  private Context templateContext;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public RenderRequest() {
  }

  public RenderRequest context(Object context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   */
  @javax.annotation.Nullable
  public Object getContext() {
    return context;
  }

  public void setContext(Object context) {
    this.context = context;
  }


  public RenderRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   */
  @javax.annotation.Nonnull
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public RenderRequest templateContext(Context templateContext) {
    this.templateContext = templateContext;
    return this;
  }

  /**
   * Get templateContext
   * @return templateContext
   */
  @javax.annotation.Nonnull
  public Context getTemplateContext() {
    return templateContext;
  }

  public void setTemplateContext(Context templateContext) {
    this.templateContext = templateContext;
  }


  public RenderRequest templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Get templateId
   * @return templateId
   */
  @javax.annotation.Nonnull
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderRequest renderRequest = (RenderRequest) o;
    return Objects.equals(this.context, renderRequest.context) &&
        Objects.equals(this.fileName, renderRequest.fileName) &&
        Objects.equals(this.templateContext, renderRequest.templateContext) &&
        Objects.equals(this.templateId, renderRequest.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, fileName, templateContext, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    templateContext: ").append(toIndentedString(templateContext)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("context");
    openapiFields.add("fileName");
    openapiFields.add("templateContext");
    openapiFields.add("templateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("context");
    openapiRequiredFields.add("fileName");
    openapiRequiredFields.add("templateContext");
    openapiRequiredFields.add("templateId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RenderRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenderRequest is not found in the empty JSON string", RenderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenderRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RenderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      // validate the required field `templateContext`
      Context.validateJsonElement(jsonObj.get("templateContext"));
      if (!jsonObj.get("templateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RenderRequest>() {
           @Override
           public void write(JsonWriter out, RenderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RenderRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RenderRequest
   * @throws IOException if the JSON string is invalid with respect to RenderRequest
   */
  public static RenderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenderRequest.class);
  }

  /**
   * Convert an instance of RenderRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

