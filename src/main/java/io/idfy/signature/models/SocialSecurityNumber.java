/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.signature.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * The signer&#39;s social security number. Will be retrieved only when &#x60;getSocialSecurityNumber&#x60; is specified when creating the document.
 */
@JsonDeserialize(builder = SocialSecurityNumber.Builder.class)
public class SocialSecurityNumber  implements Serializable {
  /**
   * The social security number.
   */
  private final String value;  // Default value is: null

  /**
   * ISO 3166-1 Alfa-2 (2 letters) country code.
   */
  private final String countryCode;  // Default value is: null

  private SocialSecurityNumber(Builder builder) {
      value = builder.value;
      countryCode = builder.countryCode;
  }

      /**
      * The social security number.
      * @return value
      **/
      public String getValue() {return value;}

      /**
      * ISO 3166-1 Alfa-2 (2 letters) country code.
      * @return countryCode
      **/
      public String getCountryCode() {return countryCode;}


  public static final class Builder {
      private String value;
      private String countryCode;

    public Builder() {
    }

    public Builder(SocialSecurityNumber copy) {
        this.value = copy.getValue();
        this.countryCode = copy.getCountryCode();
    }

    public Builder withValue(String value) {
      this.value = value;
      return this;
    }

    public Builder withCountryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }


    public SocialSecurityNumber build() { return new SocialSecurityNumber(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialSecurityNumber socialSecurityNumber = (SocialSecurityNumber) o;
    return Objects.equals(this.value, socialSecurityNumber.value) &&
        Objects.equals(this.countryCode, socialSecurityNumber.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialSecurityNumber {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
