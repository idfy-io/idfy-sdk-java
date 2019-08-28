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
   * The tenants's preferred language. This language will be used when signing the document and in email/SMS notifications.
   */
  public enum UILanguage {
	@JsonProperty("EN")
    EN("EN"),
    
	@JsonProperty("NO")
    NO("NO"),
    
	@JsonProperty("DA")
    DA("DA"),
    
	@JsonProperty("SV")
    SV("SV"),
    
	@JsonProperty("FI")
    FI("FI");

    private String value;

    UILanguage(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UILanguage fromValue(String text) {
      for (UILanguage b : UILanguage.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
