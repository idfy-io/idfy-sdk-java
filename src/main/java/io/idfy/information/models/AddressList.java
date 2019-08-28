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
 * AddressList
 */
@JsonDeserialize(builder = AddressList.Builder.class)
public class AddressList  implements Serializable {
  private final String countryName;  // Default value is: null

  private final String countryCode;  // Default value is: null

  private final String street;  // Default value is: null

  private final String postCode;  // Default value is: null

  private final String city;  // Default value is: null

  private AddressList(Builder builder) {
      countryName = builder.countryName;
      countryCode = builder.countryCode;
      street = builder.street;
      postCode = builder.postCode;
      city = builder.city;
  }

      /**
      * Get countryName
      * @return countryName
      **/
      public String getCountryName() {return countryName;}

      /**
      * Get countryCode
      * @return countryCode
      **/
      public String getCountryCode() {return countryCode;}

      /**
      * Get street
      * @return street
      **/
      public String getStreet() {return street;}

      /**
      * Get postCode
      * @return postCode
      **/
      public String getPostCode() {return postCode;}

      /**
      * Get city
      * @return city
      **/
      public String getCity() {return city;}


  public static final class Builder {
      private String countryName;
      private String countryCode;
      private String street;
      private String postCode;
      private String city;

    public Builder() {
    }

    public Builder(AddressList copy) {
        this.countryName = copy.getCountryName();
        this.countryCode = copy.getCountryCode();
        this.street = copy.getStreet();
        this.postCode = copy.getPostCode();
        this.city = copy.getCity();
    }

    public Builder withCountryName(String countryName) {
      this.countryName = countryName;
      return this;
    }

    public Builder withCountryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    public Builder withStreet(String street) {
      this.street = street;
      return this;
    }

    public Builder withPostCode(String postCode) {
      this.postCode = postCode;
      return this;
    }

    public Builder withCity(String city) {
      this.city = city;
      return this;
    }


    public AddressList build() { return new AddressList(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressList addressList = (AddressList) o;
    return Objects.equals(this.countryName, addressList.countryName) &&
        Objects.equals(this.countryCode, addressList.countryCode) &&
        Objects.equals(this.street, addressList.street) &&
        Objects.equals(this.postCode, addressList.postCode) &&
        Objects.equals(this.city, addressList.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryName, countryCode, street, postCode, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressList {\n");
    
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
