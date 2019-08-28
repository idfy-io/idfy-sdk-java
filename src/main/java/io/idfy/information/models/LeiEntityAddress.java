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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * LeiEntityAddress
 */
@JsonDeserialize(builder = LeiEntityAddress.Builder.class)
public class LeiEntityAddress  implements Serializable {
  private final String city;  // Default value is: null

  private final String country;  // Default value is: null

  private final String firstAddressLine;  // Default value is: null

  private final List<String> additionalAddressLine;  // Default value is: new ArrayList<>()

  private final String postalCode;  // Default value is: null

  private final String region;  // Default value is: null

  private LeiEntityAddress(Builder builder) {
      city = builder.city;
      country = builder.country;
      firstAddressLine = builder.firstAddressLine;
      additionalAddressLine = builder.additionalAddressLine;
      postalCode = builder.postalCode;
      region = builder.region;
  }

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
      * Get firstAddressLine
      * @return firstAddressLine
      **/
      public String getFirstAddressLine() {return firstAddressLine;}

      /**
      * Get additionalAddressLine
      * @return additionalAddressLine
      **/
      public List<String> getAdditionalAddressLine() {return additionalAddressLine;}

      /**
      * Get postalCode
      * @return postalCode
      **/
      public String getPostalCode() {return postalCode;}

      /**
      * Get region
      * @return region
      **/
      public String getRegion() {return region;}


  public static final class Builder {
      private String city;
      private String country;
      private String firstAddressLine;
      private List<String> additionalAddressLine;
      private String postalCode;
      private String region;

    public Builder() {
    }

    public Builder(LeiEntityAddress copy) {
        this.city = copy.getCity();
        this.country = copy.getCountry();
        this.firstAddressLine = copy.getFirstAddressLine();
        this.additionalAddressLine = copy.getAdditionalAddressLine();
        this.postalCode = copy.getPostalCode();
        this.region = copy.getRegion();
    }

    public Builder withCity(String city) {
      this.city = city;
      return this;
    }

    public Builder withCountry(String country) {
      this.country = country;
      return this;
    }

    public Builder withFirstAddressLine(String firstAddressLine) {
      this.firstAddressLine = firstAddressLine;
      return this;
    }

    public Builder withAdditionalAddressLine(List<String> additionalAddressLine) {
      this.additionalAddressLine = additionalAddressLine;
      return this;
    }

    public Builder addAdditionalAddressLineItem(String additionalAddressLineItem) {
      if (this.additionalAddressLine == null) {
        this.additionalAddressLine = new ArrayList<>();
      }
      this.additionalAddressLine.add(additionalAddressLineItem);
      return this;
    }

    public Builder withPostalCode(String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    public Builder withRegion(String region) {
      this.region = region;
      return this;
    }


    public LeiEntityAddress build() { return new LeiEntityAddress(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeiEntityAddress leiEntityAddress = (LeiEntityAddress) o;
    return Objects.equals(this.city, leiEntityAddress.city) &&
        Objects.equals(this.country, leiEntityAddress.country) &&
        Objects.equals(this.firstAddressLine, leiEntityAddress.firstAddressLine) &&
        Objects.equals(this.additionalAddressLine, leiEntityAddress.additionalAddressLine) &&
        Objects.equals(this.postalCode, leiEntityAddress.postalCode) &&
        Objects.equals(this.region, leiEntityAddress.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, firstAddressLine, additionalAddressLine, postalCode, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeiEntityAddress {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    firstAddressLine: ").append(toIndentedString(firstAddressLine)).append("\n");
    sb.append("    additionalAddressLine: ").append(toIndentedString(additionalAddressLine)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
