/*
 * Idfy Secure Share
 * This endpoints enables secure sharing with multiple e-ids offered for login
 *
 * OpenAPI spec version: v1
 * 
 */

package io.idfy.share.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Mobile
 */
@JsonDeserialize(builder = Mobile.Builder.class)
public class Mobile  implements Serializable {
  /**
   * Country code, no need to add +
   */
  private final String countryCode;  // Default value is: null

  /**
   * Valid phonenumber
   */
  private final String number;  // Default value is: null

  private Mobile(Builder builder) {
      countryCode = builder.countryCode;
      number = builder.number;
  }

      /**
      * Country code, no need to add +
      * @return countryCode
      **/
      public String getCountryCode() {return countryCode;}

      /**
      * Valid phonenumber
      * @return number
      **/
      public String getNumber() {return number;}


  public static final class Builder {
      private String countryCode;
      private String number;

    public Builder() {
    }

    public Builder(Mobile copy) {
        this.countryCode = copy.getCountryCode();
        this.number = copy.getNumber();
    }

    public Builder withCountryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    public Builder withNumber(String number) {
      this.number = number;
      return this;
    }


    public Mobile build() { return new Mobile(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mobile mobile = (Mobile) o;
    return Objects.equals(this.countryCode, mobile.countryCode) &&
        Objects.equals(this.number, mobile.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mobile {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
