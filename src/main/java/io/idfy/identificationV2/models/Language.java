/*
 * Idfy Identification v2
 * This endpoint enables identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID.
 *
 * OpenAPI spec version: v2
 * Contact: support@idfy.io
 */
package io.idfy.identificationV2.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

 /**
   * The language to use for the identification process. Defaults to `en` (english).
   */
  public enum Language {
	@JsonProperty("en")
    EN("en"),
    
	@JsonProperty("no")
    NO("no"),
    
	@JsonProperty("sv")
    SV("sv"),
    
	@JsonProperty("da")
    DA("da");
    

    private String value;

    Language(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Language fromValue(String text) {
      for (Language b : Language.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }