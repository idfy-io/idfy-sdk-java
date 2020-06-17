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
   * Gets or Sets IdSessionStatus
   */
  public enum IdSessionStatus {
	@JsonProperty("created")
    CREATED("created"),
    
	@JsonProperty("user_initiated")
    USER_INITIATED("user_initiated"),
    
	@JsonProperty("user_aborted")
    USER_ABORTED("user_aborted"),
    
	@JsonProperty("timed_out")
    TIMED_OUT("timed_out"),
    
	@JsonProperty("invalidated")
    INVALIDATED("invalidated"),
    
	@JsonProperty("failed")
    FAILED("failed"),
    
	@JsonProperty("success")
    SUCCESS("success");
    

    private String value;

    IdSessionStatus(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdSessionStatus fromValue(String text) {
      for (IdSessionStatus b : IdSessionStatus.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }