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
 * CompanyInfoDifiResponse
 */
@JsonDeserialize(builder = CompanyInfoDifiResponse.Builder.class)
public class CompanyInfoDifiResponse  implements Serializable {
  private final String orgNr;  // Default value is: null

  private final String orgName;  // Default value is: null

  private final String address;  // Default value is: null

  private final String postalCode;  // Default value is: null

  private final String city;  // Default value is: null

  private final String website;  // Default value is: null

  private final String country;  // Default value is: null

  private CompanyInfoDifiResponse(Builder builder) {
      orgNr = builder.orgNr;
      orgName = builder.orgName;
      address = builder.address;
      postalCode = builder.postalCode;
      city = builder.city;
      website = builder.website;
      country = builder.country;
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
      * Get website
      * @return website
      **/
      public String getWebsite() {return website;}

      /**
      * Get country
      * @return country
      **/
      public String getCountry() {return country;}


  public static final class Builder {
      private String orgNr;
      private String orgName;
      private String address;
      private String postalCode;
      private String city;
      private String website;
      private String country;

    public Builder() {
    }

    public Builder(CompanyInfoDifiResponse copy) {
        this.orgNr = copy.getOrgNr();
        this.orgName = copy.getOrgName();
        this.address = copy.getAddress();
        this.postalCode = copy.getPostalCode();
        this.city = copy.getCity();
        this.website = copy.getWebsite();
        this.country = copy.getCountry();
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

    public Builder withWebsite(String website) {
      this.website = website;
      return this;
    }

    public Builder withCountry(String country) {
      this.country = country;
      return this;
    }


    public CompanyInfoDifiResponse build() { return new CompanyInfoDifiResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInfoDifiResponse companyInfoDifiResponse = (CompanyInfoDifiResponse) o;
    return Objects.equals(this.orgNr, companyInfoDifiResponse.orgNr) &&
        Objects.equals(this.orgName, companyInfoDifiResponse.orgName) &&
        Objects.equals(this.address, companyInfoDifiResponse.address) &&
        Objects.equals(this.postalCode, companyInfoDifiResponse.postalCode) &&
        Objects.equals(this.city, companyInfoDifiResponse.city) &&
        Objects.equals(this.website, companyInfoDifiResponse.website) &&
        Objects.equals(this.country, companyInfoDifiResponse.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgNr, orgName, address, postalCode, city, website, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyInfoDifiResponse {\n");
    
    sb.append("    orgNr: ").append(toIndentedString(orgNr)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
