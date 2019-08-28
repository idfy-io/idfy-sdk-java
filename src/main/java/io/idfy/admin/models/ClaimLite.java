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
 * ClaimLite
 */
@JsonDeserialize(builder = ClaimLite.Builder.class)
public class ClaimLite  implements Serializable {
  private final String type;  // Default value is: null

  private final String value;  // Default value is: null

  private ClaimLite(Builder builder) {
      type = builder.type;
      value = builder.value;
  }

      /**
      * Get type
      * @return type
      **/
      public String getType() {return type;}

      /**
      * Get value
      * @return value
      **/
      public String getValue() {return value;}


  public static final class Builder {
      private String type;
      private String value;

    public Builder() {
    }

    public Builder(ClaimLite copy) {
        this.type = copy.getType();
        this.value = copy.getValue();
    }

    public Builder withType(String type) {
      this.type = type;
      return this;
    }

    public Builder withValue(String value) {
      this.value = value;
      return this;
    }


    public ClaimLite build() { return new ClaimLite(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimLite claimLite = (ClaimLite) o;
    return Objects.equals(this.type, claimLite.type) &&
        Objects.equals(this.value, claimLite.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimLite {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
