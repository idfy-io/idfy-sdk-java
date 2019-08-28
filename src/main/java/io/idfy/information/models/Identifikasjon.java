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
 * Identifikasjon
 */
@JsonDeserialize(builder = Identifikasjon.Builder.class)
public class Identifikasjon  implements Serializable {
  private final Integer orgnrField;  // Default value is: null

  private final Integer dunsnrField;  // Default value is: null

  private Identifikasjon(Builder builder) {
      orgnrField = builder.orgnrField;
      dunsnrField = builder.dunsnrField;
  }

      /**
      * Get orgnrField
      * @return orgnrField
      **/
      public Integer getOrgnrField() {return orgnrField;}

      /**
      * Get dunsnrField
      * @return dunsnrField
      **/
      public Integer getDunsnrField() {return dunsnrField;}


  public static final class Builder {
      private Integer orgnrField;
      private Integer dunsnrField;

    public Builder() {
    }

    public Builder(Identifikasjon copy) {
        this.orgnrField = copy.getOrgnrField();
        this.dunsnrField = copy.getDunsnrField();
    }

    public Builder withOrgnrField(Integer orgnrField) {
      this.orgnrField = orgnrField;
      return this;
    }

    public Builder withDunsnrField(Integer dunsnrField) {
      this.dunsnrField = dunsnrField;
      return this;
    }


    public Identifikasjon build() { return new Identifikasjon(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identifikasjon identifikasjon = (Identifikasjon) o;
    return Objects.equals(this.orgnrField, identifikasjon.orgnrField) &&
        Objects.equals(this.dunsnrField, identifikasjon.dunsnrField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgnrField, dunsnrField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identifikasjon {\n");
    
    sb.append("    orgnrField: ").append(toIndentedString(orgnrField)).append("\n");
    sb.append("    dunsnrField: ").append(toIndentedString(dunsnrField)).append("\n");
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
