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
   * Gets or Sets ExtraInfoStatus
   */
  public enum ExtraInfoStatus {
	@JsonProperty("pending")
    PENDING("pending"),
    
	@JsonProperty("missing_credentials")
    MISSING_CREDENTIALS("missing_credentials"),
    
	@JsonProperty("unsupported_idp")
    UNSUPPORTED_IDP("unsupported_idp"),
    
	@JsonProperty("not_found")
    NOT_FOUND("not_found"),
    
	@JsonProperty("unknown_error")
    UNKNOWN_ERROR("unknown_error"),
    
	@JsonProperty("success")
    SUCCESS("success"),
    
	@JsonProperty("insufficient_access")
    INSUFFICIENT_ACCESS("insufficient_access"),
    
	@JsonProperty("invalid_credentials")
    INVALID_CREDENTIALS("invalid_credentials");
    

    private String value;

    ExtraInfoStatus(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExtraInfoStatus fromValue(String text) {
      for (ExtraInfoStatus b : ExtraInfoStatus.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }