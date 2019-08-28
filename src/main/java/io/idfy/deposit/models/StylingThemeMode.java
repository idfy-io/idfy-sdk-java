/*
 * Idfy Deposit
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.deposit.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

 /**
   * The theme color mode, specify if you want it dark or light themed. Defaults to light
   */
  public enum StylingThemeMode {
	@JsonProperty("Light")
    LIGHT("Light"),
    
	@JsonProperty("Dark")
    DARK("Dark");

    private String value;

    StylingThemeMode(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StylingThemeMode fromValue(String text) {
      for (StylingThemeMode b : StylingThemeMode.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
