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
   * Request additional information about the user.
   */
  public enum Include {
	@JsonProperty("name")
    NAME("name"),
    
	@JsonProperty("phone_number")
    PHONE_NUMBER("phone_number"),
    
	@JsonProperty("date_of_birth")
    DATE_OF_BIRTH("date_of_birth"),
    
	@JsonProperty("nin")
    NIN("nin"),
    
	@JsonProperty("email")
    EMAIL("email"),
    
	@JsonProperty("resource.vipps_aml_person")
    RESOURCE_VIPPS_AML_PERSON("resource.vipps_aml_person");
    

    private String value;

    Include(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Include fromValue(String text) {
      for (Include b : Include.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }