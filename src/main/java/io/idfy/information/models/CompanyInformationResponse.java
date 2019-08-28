/*
 * Idfy Information Services
 * This endpoint offers a lot of useful extra information including credit checks, signature / prokura checks and information regarding persons and companies.   ## Last update   Last build date for this endpoint: 13.12.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.information.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * CompanyInformationResponse
 */
@JsonDeserialize(builder = CompanyInformationResponse.Builder.class)
public class CompanyInformationResponse  implements Serializable {
  private final String orgNr;  // Default value is: null

  private final String orgName;  // Default value is: null

  private final String address;  // Default value is: null

  private final String postalCode;  // Default value is: null

  private final String city;  // Default value is: null

  private final String country;  // Default value is: null

  private final String rawJson;  // Default value is: null

  private final String phone;  // Default value is: null

  private final String mobile;  // Default value is: null

  private final String requestId;  // Default value is: null

  private CompanyInformationResponse(Builder builder) {
      orgNr = builder.orgNr;
      orgName = builder.orgName;
      address = builder.address;
      postalCode = builder.postalCode;
      city = builder.city;
      country = builder.country;
      rawJson = builder.rawJson;
      phone = builder.phone;
      mobile = builder.mobile;
      requestId = builder.requestId;
  }

      /**
      * Get orgNr
      * @return orgNr
      **/
      public String getOrgNr() {return orgNr;}

      /**
      * Get orgName
      * @return orgName
      **/
      public String getOrgName() {return orgName;}

      /**
      * Get address
      * @return address
      **/
      public String getAddress() {return address;}

      /**
      * Get postalCode
      * @return postalCode
      **/
      public String getPostalCode() {return postalCode;}

      /**
      * Get city
      * @return city
      **/
      public String getCity() {return city;}

      /**
      * Get country
      * @return country
      **/
      public String getCountry() {return country;}

      /**
      * Get rawJson
      * @return rawJson
      **/
      public String getRawJson() {return rawJson;}

      /**
      * Get phone
      * @return phone
      **/
      public String getPhone() {return phone;}

      /**
      * Get mobile
      * @return mobile
      **/
      public String getMobile() {return mobile;}

      /**
      * Get requestId
      * @return requestId
      **/
      public String getRequestId() {return requestId;}


  public static final class Builder {
      private String orgNr;
      private String orgName;
      private String address;
      private String postalCode;
      private String city;
      private String country;
      private String rawJson;
      private String phone;
      private String mobile;
      private String requestId;

    public Builder() {
    }

    public Builder(CompanyInformationResponse copy) {
        this.orgNr = copy.getOrgNr();
        this.orgName = copy.getOrgName();
        this.address = copy.getAddress();
        this.postalCode = copy.getPostalCode();
        this.city = copy.getCity();
        this.country = copy.getCountry();
        this.rawJson = copy.getRawJson();
        this.phone = copy.getPhone();
        this.mobile = copy.getMobile();
        this.requestId = copy.getRequestId();
    }

    public Builder withOrgNr(String orgNr) {
      this.orgNr = orgNr;
      return this;
    }

    public Builder withOrgName(String orgName) {
      this.orgName = orgName;
      return this;
    }

    public Builder withAddress(String address) {
      this.address = address;
      return this;
    }

    public Builder withPostalCode(String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    public Builder withCity(String city) {
      this.city = city;
      return this;
    }

    public Builder withCountry(String country) {
      this.country = country;
      return this;
    }

    public Builder withRawJson(String rawJson) {
      this.rawJson = rawJson;
      return this;
    }

    public Builder withPhone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder withMobile(String mobile) {
      this.mobile = mobile;
      return this;
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }


    public CompanyInformationResponse build() { return new CompanyInformationResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInformationResponse companyInformationResponse = (CompanyInformationResponse) o;
    return Objects.equals(this.orgNr, companyInformationResponse.orgNr) &&
        Objects.equals(this.orgName, companyInformationResponse.orgName) &&
        Objects.equals(this.address, companyInformationResponse.address) &&
        Objects.equals(this.postalCode, companyInformationResponse.postalCode) &&
        Objects.equals(this.city, companyInformationResponse.city) &&
        Objects.equals(this.country, companyInformationResponse.country) &&
        Objects.equals(this.rawJson, companyInformationResponse.rawJson) &&
        Objects.equals(this.phone, companyInformationResponse.phone) &&
        Objects.equals(this.mobile, companyInformationResponse.mobile) &&
        Objects.equals(this.requestId, companyInformationResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgNr, orgName, address, postalCode, city, country, rawJson, phone, mobile, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyInformationResponse {\n");
    
    sb.append("    orgNr: ").append(toIndentedString(orgNr)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    rawJson: ").append(toIndentedString(rawJson)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
