/*
 * Idfy.Admin
 * In this API you can manage your account details, logo, styling or manage your openid / oauth api clients. If you are a dealer you can also manage the accounts registered to this dealer.   ## Last update   Last build date for this API: 14.01.2018  
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.admin.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Company address
 */
@JsonDeserialize(builder = Address.Builder.class)
public class Address  implements Serializable {
  private final String address1;  // Default value is: null

  private final String address2;  // Default value is: null

  private final String postalCode;  // Default value is: null

  private final String city;  // Default value is: null

  private final String country;  // Default value is: null

  private Address(Builder builder) {
      address1 = builder.address1;
      address2 = builder.address2;
      postalCode = builder.postalCode;
      city = builder.city;
      country = builder.country;
  }

      /**
      * Get address1
      * @return address1
      **/
      public String getAddress1() {return address1;}

      /**
      * Get address2
      * @return address2
      **/
      public String getAddress2() {return address2;}

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


  public static final class Builder {
      private String address1;
      private String address2;
      private String postalCode;
      private String city;
      private String country;

    public Builder() {
    }

    public Builder(Address copy) {
        this.address1 = copy.getAddress1();
        this.address2 = copy.getAddress2();
        this.postalCode = copy.getPostalCode();
        this.city = copy.getCity();
        this.country = copy.getCountry();
    }

    public Builder withAddress1(String address1) {
      this.address1 = address1;
      return this;
    }

    public Builder withAddress2(String address2) {
      this.address2 = address2;
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


    public Address build() { return new Address(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.address1, address.address1) &&
        Objects.equals(this.address2, address.address2) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.country, address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, postalCode, city, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
