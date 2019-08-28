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
 * PersonIdentifikasjon
 */
@JsonDeserialize(builder = PersonIdentifikasjon.Builder.class)
public class PersonIdentifikasjon  implements Serializable {
  private final Long internrefField;  // Default value is: null

  private PersonIdentifikasjon(Builder builder) {
      internrefField = builder.internrefField;
  }

      /**
      * Get internrefField
      * @return internrefField
      **/
      public Long getInternrefField() {return internrefField;}


  public static final class Builder {
      private Long internrefField;

    public Builder() {
    }

    public Builder(PersonIdentifikasjon copy) {
        this.internrefField = copy.getInternrefField();
    }

    public Builder withInternrefField(Long internrefField) {
      this.internrefField = internrefField;
      return this;
    }


    public PersonIdentifikasjon build() { return new PersonIdentifikasjon(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonIdentifikasjon personIdentifikasjon = (PersonIdentifikasjon) o;
    return Objects.equals(this.internrefField, personIdentifikasjon.internrefField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internrefField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonIdentifikasjon {\n");
    
    sb.append("    internrefField: ").append(toIndentedString(internrefField)).append("\n");
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
