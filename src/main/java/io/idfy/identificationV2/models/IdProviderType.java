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
   * The eID provider used for identification.
   */
  public enum IdProviderType {
	@JsonProperty("no_bankid_netcentric")
    NO_BANKID_NETCENTRIC("no_bankid_netcentric"),
    
	@JsonProperty("no_bankid_mobile")
    NO_BANKID_MOBILE("no_bankid_mobile"),
    
	@JsonProperty("se_bankid")
    SE_BANKID("se_bankid"),
    
	@JsonProperty("no_buypass")
    NO_BUYPASS("no_buypass"),
    
	@JsonProperty("dk_nemid")
    DK_NEMID("dk_nemid"),
    
	@JsonProperty("fi_eid")
    FI_EID("fi_eid"),
    
	@JsonProperty("sms_otp")
    SMS_OTP("sms_otp"),
    
	@JsonProperty("freja")
    FREJA("freja"),
    
	@JsonProperty("github")
    GITHUB("github"),
    
	@JsonProperty("google")
    GOOGLE("google"),
    
	@JsonProperty("linkedin")
    LINKEDIN("linkedin"),
    
	@JsonProperty("itsme")
    ITSME("itsme"),
    
	@JsonProperty("idin")
    IDIN("idin");
    

    private String value;

    IdProviderType(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdProviderType fromValue(String text) {
      for (IdProviderType b : IdProviderType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }