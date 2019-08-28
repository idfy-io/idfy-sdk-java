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
 * VervData
 */
@JsonDeserialize(builder = VervData.Builder.class)
public class VervData  implements Serializable {
  private final String vervKodeField;  // Default value is: null

  private final String vervTekstField;  // Default value is: null

  private VervData(Builder builder) {
      vervKodeField = builder.vervKodeField;
      vervTekstField = builder.vervTekstField;
  }

      /**
      * Get vervKodeField
      * @return vervKodeField
      **/
      public String getVervKodeField() {return vervKodeField;}

      /**
      * Get vervTekstField
      * @return vervTekstField
      **/
      public String getVervTekstField() {return vervTekstField;}


  public static final class Builder {
      private String vervKodeField;
      private String vervTekstField;

    public Builder() {
    }

    public Builder(VervData copy) {
        this.vervKodeField = copy.getVervKodeField();
        this.vervTekstField = copy.getVervTekstField();
    }

    public Builder withVervKodeField(String vervKodeField) {
      this.vervKodeField = vervKodeField;
      return this;
    }

    public Builder withVervTekstField(String vervTekstField) {
      this.vervTekstField = vervTekstField;
      return this;
    }


    public VervData build() { return new VervData(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VervData vervData = (VervData) o;
    return Objects.equals(this.vervKodeField, vervData.vervKodeField) &&
        Objects.equals(this.vervTekstField, vervData.vervTekstField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vervKodeField, vervTekstField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VervData {\n");
    
    sb.append("    vervKodeField: ").append(toIndentedString(vervKodeField)).append("\n");
    sb.append("    vervTekstField: ").append(toIndentedString(vervTekstField)).append("\n");
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
