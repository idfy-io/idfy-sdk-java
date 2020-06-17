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
   * The type of flow to use.
   */
  public enum IdFlow {
	@JsonProperty("redirect")
    REDIRECT("redirect"),
    
	@JsonProperty("iframe")
    IFRAME("iframe"),
    
	@JsonProperty("headless")
    HEADLESS("headless");
    

    private String value;

    IdFlow(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdFlow fromValue(String text) {
      for (IdFlow b : IdFlow.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }