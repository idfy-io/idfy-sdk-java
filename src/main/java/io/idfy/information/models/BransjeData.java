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
 * BransjeData
 */
@JsonDeserialize(builder = BransjeData.Builder.class)
public class BransjeData  implements Serializable {
  private final Integer bransjeKodeField;  // Default value is: null

  private final String bransjeTekstField;  // Default value is: null

  private BransjeData(Builder builder) {
      bransjeKodeField = builder.bransjeKodeField;
      bransjeTekstField = builder.bransjeTekstField;
  }

      /**
      * Get bransjeKodeField
      * @return bransjeKodeField
      **/
      public Integer getBransjeKodeField() {return bransjeKodeField;}

      /**
      * Get bransjeTekstField
      * @return bransjeTekstField
      **/
      public String getBransjeTekstField() {return bransjeTekstField;}


  public static final class Builder {
      private Integer bransjeKodeField;
      private String bransjeTekstField;

    public Builder() {
    }

    public Builder(BransjeData copy) {
        this.bransjeKodeField = copy.getBransjeKodeField();
        this.bransjeTekstField = copy.getBransjeTekstField();
    }

    public Builder withBransjeKodeField(Integer bransjeKodeField) {
      this.bransjeKodeField = bransjeKodeField;
      return this;
    }

    public Builder withBransjeTekstField(String bransjeTekstField) {
      this.bransjeTekstField = bransjeTekstField;
      return this;
    }


    public BransjeData build() { return new BransjeData(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BransjeData bransjeData = (BransjeData) o;
    return Objects.equals(this.bransjeKodeField, bransjeData.bransjeKodeField) &&
        Objects.equals(this.bransjeTekstField, bransjeData.bransjeTekstField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bransjeKodeField, bransjeTekstField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BransjeData {\n");
    
    sb.append("    bransjeKodeField: ").append(toIndentedString(bransjeKodeField)).append("\n");
    sb.append("    bransjeTekstField: ").append(toIndentedString(bransjeTekstField)).append("\n");
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
