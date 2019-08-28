/*
 * Idfy Identification
 * This endpoint enables authentication/identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID. ## Last update   Last build date for this endpoint: 02.04.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.identification.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * Creates a BankID mobile identification process
 */
@JsonDeserialize(builder = CreateBankIDMobileRequest.Builder.class)
public class CreateBankIDMobileRequest  implements Serializable {
  /**
   * Mobile number for the user that is to be identified
   */
  private final String mobileNumber;  // Default value is: null

  /**
   * Date of birth for the user that is to be identified
   */
  private final String dateOfBirth;  // Default value is: null

  /**
   * Should the socialsecuritynumber be fetched from the identityprovider? Beware that there is an extra cost of doing this every time and one need permission to do it.
   */
  private final Boolean getSocialSecurityNumber;  // Default value is: null

  /**
   * The merchants reference to the identification process
   */
  private final String externalReference;  // Default value is: null

  /**
   * List of addon data that can be orderd. The result will be in MetaData list of the reponse
   */
  private final Map<String, String> addonservices;  // Default value is: new HashMap<>()

  private CreateBankIDMobileRequest(Builder builder) {
      mobileNumber = builder.mobileNumber;
      dateOfBirth = builder.dateOfBirth;
      getSocialSecurityNumber = builder.getSocialSecurityNumber;
      externalReference = builder.externalReference;
      addonservices = builder.addonservices;
  }

      /**
      * Mobile number for the user that is to be identified
      * @return mobileNumber
      **/
      public String getMobileNumber() {return mobileNumber;}

      /**
      * Date of birth for the user that is to be identified
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}

      /**
      * Should the socialsecuritynumber be fetched from the identityprovider? Beware that there is an extra cost of doing this every time and one need permission to do it.
      * @return getSocialSecurityNumber
      **/
      public Boolean getGetSocialSecurityNumber() {return getSocialSecurityNumber;}

      /**
      * The merchants reference to the identification process
      * @return externalReference
      **/
      public String getExternalReference() {return externalReference;}

      /**
      * List of addon data that can be orderd. The result will be in MetaData list of the reponse
      * @return addonservices
      **/
      public Map<String, String> getAddonservices() {return addonservices;}


  public static final class Builder {
      private String mobileNumber;
      private String dateOfBirth;
      private Boolean getSocialSecurityNumber;
      private String externalReference;
      private Map<String, String> addonservices;

    public Builder() {
    }

    public Builder(CreateBankIDMobileRequest copy) {
        this.mobileNumber = copy.getMobileNumber();
        this.dateOfBirth = copy.getDateOfBirth();
        this.getSocialSecurityNumber = copy.getGetSocialSecurityNumber();
        this.externalReference = copy.getExternalReference();
        this.addonservices = copy.getAddonservices();
    }

    public Builder withMobileNumber(String mobileNumber) {
      this.mobileNumber = mobileNumber;
      return this;
    }

    public Builder withDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder withGetSocialSecurityNumber(Boolean getSocialSecurityNumber) {
      this.getSocialSecurityNumber = getSocialSecurityNumber;
      return this;
    }

    public Builder withExternalReference(String externalReference) {
      this.externalReference = externalReference;
      return this;
    }

    public Builder withAddonservices(Map<String, String> addonservices) {
      this.addonservices = addonservices;
      return this;
    }

    public Builder putAddonservicesItem(String key, String addonservicesItem) {
      if (this.addonservices == null) {
        this.addonservices = new HashMap<>();
      }
      this.addonservices.put(key, addonservicesItem);
      return this;
    }


    public CreateBankIDMobileRequest build() { return new CreateBankIDMobileRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBankIDMobileRequest createBankIDMobileRequest = (CreateBankIDMobileRequest) o;
    return Objects.equals(this.mobileNumber, createBankIDMobileRequest.mobileNumber) &&
        Objects.equals(this.dateOfBirth, createBankIDMobileRequest.dateOfBirth) &&
        Objects.equals(this.getSocialSecurityNumber, createBankIDMobileRequest.getSocialSecurityNumber) &&
        Objects.equals(this.externalReference, createBankIDMobileRequest.externalReference) &&
        Objects.equals(this.addonservices, createBankIDMobileRequest.addonservices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileNumber, dateOfBirth, getSocialSecurityNumber, externalReference, addonservices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBankIDMobileRequest {\n");
    
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    getSocialSecurityNumber: ").append(toIndentedString(getSocialSecurityNumber)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    addonservices: ").append(toIndentedString(addonservices)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
