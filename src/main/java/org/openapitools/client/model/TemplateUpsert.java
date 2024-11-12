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
import org.openapitools.client.model.TemplateType;
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
 * TemplateUpsert
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T12:58:11.388727288+01:00[Europe/Brussels]", comments = "Generator version: 7.9.0")
public class TemplateUpsert {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TEMPLATE_CONTEXT = "templateContext";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_CONTEXT)
  private Context templateContext;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "templateType";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private TemplateType templateType;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public TemplateUpsert() {
  }

  public TemplateUpsert id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public TemplateUpsert description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public TemplateUpsert templateContext(Context templateContext) {
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


  public TemplateUpsert templateType(TemplateType templateType) {
    this.templateType = templateType;
    return this;
  }

  /**
   * Get templateType
   * @return templateType
   */
  @javax.annotation.Nonnull
  public TemplateType getTemplateType() {
    return templateType;
  }

  public void setTemplateType(TemplateType templateType) {
    this.templateType = templateType;
  }


  public TemplateUpsert title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateUpsert templateUpsert = (TemplateUpsert) o;
    return Objects.equals(this.id, templateUpsert.id) &&
        Objects.equals(this.description, templateUpsert.description) &&
        Objects.equals(this.templateContext, templateUpsert.templateContext) &&
        Objects.equals(this.templateType, templateUpsert.templateType) &&
        Objects.equals(this.title, templateUpsert.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, templateContext, templateType, title);
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
    sb.append("class TemplateUpsert {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    templateContext: ").append(toIndentedString(templateContext)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("templateContext");
    openapiFields.add("templateType");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("templateContext");
    openapiRequiredFields.add("templateType");
    openapiRequiredFields.add("title");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TemplateUpsert
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateUpsert.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateUpsert is not found in the empty JSON string", TemplateUpsert.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TemplateUpsert.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateUpsert` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateUpsert.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("_id") != null && !jsonObj.get("_id").isJsonNull()) && !jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `templateContext`
      Context.validateJsonElement(jsonObj.get("templateContext"));
      // validate the required field `templateType`
      TemplateType.validateJsonElement(jsonObj.get("templateType"));
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateUpsert.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateUpsert' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateUpsert> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateUpsert.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateUpsert>() {
           @Override
           public void write(JsonWriter out, TemplateUpsert value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateUpsert read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TemplateUpsert given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TemplateUpsert
   * @throws IOException if the JSON string is invalid with respect to TemplateUpsert
   */
  public static TemplateUpsert fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateUpsert.class);
  }

  /**
   * Convert an instance of TemplateUpsert to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

