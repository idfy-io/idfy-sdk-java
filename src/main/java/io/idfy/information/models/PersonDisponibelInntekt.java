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
 * PersonDisponibelInntekt
 */
@JsonDeserialize(builder = PersonDisponibelInntekt.Builder.class)
public class PersonDisponibelInntekt  implements Serializable {
  private final Integer kodeField;  // Default value is: null

  private final String beskrivelseField;  // Default value is: null

  private PersonDisponibelInntekt(Builder builder) {
      kodeField = builder.kodeField;
      beskrivelseField = builder.beskrivelseField;
  }

      /**
      * Get kodeField
      * @return kodeField
      **/
      public Integer getKodeField() {return kodeField;}

      /**
      * Get beskrivelseField
      * @return beskrivelseField
      **/
      public String getBeskrivelseField() {return beskrivelseField;}


  public static final class Builder {
      private Integer kodeField;
      private String beskrivelseField;

    public Builder() {
    }

    public Builder(PersonDisponibelInntekt copy) {
        this.kodeField = copy.getKodeField();
        this.beskrivelseField = copy.getBeskrivelseField();
    }

    public Builder withKodeField(Integer kodeField) {
      this.kodeField = kodeField;
      return this;
    }

    public Builder withBeskrivelseField(String beskrivelseField) {
      this.beskrivelseField = beskrivelseField;
      return this;
    }


    public PersonDisponibelInntekt build() { return new PersonDisponibelInntekt(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonDisponibelInntekt personDisponibelInntekt = (PersonDisponibelInntekt) o;
    return Objects.equals(this.kodeField, personDisponibelInntekt.kodeField) &&
        Objects.equals(this.beskrivelseField, personDisponibelInntekt.beskrivelseField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kodeField, beskrivelseField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonDisponibelInntekt {\n");
    
    sb.append("    kodeField: ").append(toIndentedString(kodeField)).append("\n");
    sb.append("    beskrivelseField: ").append(toIndentedString(beskrivelseField)).append("\n");
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
