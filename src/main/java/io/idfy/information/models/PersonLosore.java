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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * PersonLosore
 */
@JsonDeserialize(builder = PersonLosore.Builder.class)
public class PersonLosore  implements Serializable {
  private final OffsetDateTime ajourDatoField;  // Default value is: null

  private final String spesTekst1Field;  // Default value is: null

  private final String spesTekst2Field;  // Default value is: null

  private final String spesTekst3Field;  // Default value is: null

  private PersonLosore(Builder builder) {
      ajourDatoField = builder.ajourDatoField;
      spesTekst1Field = builder.spesTekst1Field;
      spesTekst2Field = builder.spesTekst2Field;
      spesTekst3Field = builder.spesTekst3Field;
  }

      /**
      * Get ajourDatoField
      * @return ajourDatoField
      **/
      public OffsetDateTime getAjourDatoField() {return ajourDatoField;}

      /**
      * Get spesTekst1Field
      * @return spesTekst1Field
      **/
      public String getSpesTekst1Field() {return spesTekst1Field;}

      /**
      * Get spesTekst2Field
      * @return spesTekst2Field
      **/
      public String getSpesTekst2Field() {return spesTekst2Field;}

      /**
      * Get spesTekst3Field
      * @return spesTekst3Field
      **/
      public String getSpesTekst3Field() {return spesTekst3Field;}


  public static final class Builder {
      private OffsetDateTime ajourDatoField;
      private String spesTekst1Field;
      private String spesTekst2Field;
      private String spesTekst3Field;

    public Builder() {
    }

    public Builder(PersonLosore copy) {
        this.ajourDatoField = copy.getAjourDatoField();
        this.spesTekst1Field = copy.getSpesTekst1Field();
        this.spesTekst2Field = copy.getSpesTekst2Field();
        this.spesTekst3Field = copy.getSpesTekst3Field();
    }

    public Builder withAjourDatoField(OffsetDateTime ajourDatoField) {
      this.ajourDatoField = ajourDatoField;
      return this;
    }

    public Builder withSpesTekst1Field(String spesTekst1Field) {
      this.spesTekst1Field = spesTekst1Field;
      return this;
    }

    public Builder withSpesTekst2Field(String spesTekst2Field) {
      this.spesTekst2Field = spesTekst2Field;
      return this;
    }

    public Builder withSpesTekst3Field(String spesTekst3Field) {
      this.spesTekst3Field = spesTekst3Field;
      return this;
    }


    public PersonLosore build() { return new PersonLosore(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonLosore personLosore = (PersonLosore) o;
    return Objects.equals(this.ajourDatoField, personLosore.ajourDatoField) &&
        Objects.equals(this.spesTekst1Field, personLosore.spesTekst1Field) &&
        Objects.equals(this.spesTekst2Field, personLosore.spesTekst2Field) &&
        Objects.equals(this.spesTekst3Field, personLosore.spesTekst3Field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ajourDatoField, spesTekst1Field, spesTekst2Field, spesTekst3Field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonLosore {\n");
    
    sb.append("    ajourDatoField: ").append(toIndentedString(ajourDatoField)).append("\n");
    sb.append("    spesTekst1Field: ").append(toIndentedString(spesTekst1Field)).append("\n");
    sb.append("    spesTekst2Field: ").append(toIndentedString(spesTekst2Field)).append("\n");
    sb.append("    spesTekst3Field: ").append(toIndentedString(spesTekst3Field)).append("\n");
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
