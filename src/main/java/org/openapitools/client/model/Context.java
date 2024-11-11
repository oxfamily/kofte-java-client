/*
 * Köfte
 * Köfte Api V1
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Context
 */
@JsonAdapter(Context.Adapter.class)
public enum Context {
  
  INVOICE("INVOICE");

  private String value;

  Context(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Context fromValue(String value) {
    for (Context b : Context.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Context> {
    @Override
    public void write(final JsonWriter jsonWriter, final Context enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Context read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Context.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Context.fromValue(value);
  }
}
