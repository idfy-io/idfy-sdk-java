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
 * PersonTidligereNavnAdresse
 */
@JsonDeserialize(builder = PersonTidligereNavnAdresse.Builder.class)
public class PersonTidligereNavnAdresse  implements Serializable {
  private final String tidligereNavnAdresse1Field;  // Default value is: null

  private final OffsetDateTime endringsDatoField;  // Default value is: null

  private final String endringsTypeField;  // Default value is: null

  private final String tidligerePostAdresseField;  // Default value is: null

  private PersonTidligereNavnAdresse(Builder builder) {
      tidligereNavnAdresse1Field = builder.tidligereNavnAdresse1Field;
      endringsDatoField = builder.endringsDatoField;
      endringsTypeField = builder.endringsTypeField;
      tidligerePostAdresseField = builder.tidligerePostAdresseField;
  }

      /**
      * Get tidligereNavnAdresse1Field
      * @return tidligereNavnAdresse1Field
      **/
      public String getTidligereNavnAdresse1Field() {return tidligereNavnAdresse1Field;}

      /**
      * Get endringsDatoField
      * @return endringsDatoField
      **/
      public OffsetDateTime getEndringsDatoField() {return endringsDatoField;}

      /**
      * Get endringsTypeField
      * @return endringsTypeField
      **/
      public String getEndringsTypeField() {return endringsTypeField;}

      /**
      * Get tidligerePostAdresseField
      * @return tidligerePostAdresseField
      **/
      public String getTidligerePostAdresseField() {return tidligerePostAdresseField;}


  public static final class Builder {
      private String tidligereNavnAdresse1Field;
      private OffsetDateTime endringsDatoField;
      private String endringsTypeField;
      private String tidligerePostAdresseField;

    public Builder() {
    }

    public Builder(PersonTidligereNavnAdresse copy) {
        this.tidligereNavnAdresse1Field = copy.getTidligereNavnAdresse1Field();
        this.endringsDatoField = copy.getEndringsDatoField();
        this.endringsTypeField = copy.getEndringsTypeField();
        this.tidligerePostAdresseField = copy.getTidligerePostAdresseField();
    }

    public Builder withTidligereNavnAdresse1Field(String tidligereNavnAdresse1Field) {
      this.tidligereNavnAdresse1Field = tidligereNavnAdresse1Field;
      return this;
    }

    public Builder withEndringsDatoField(OffsetDateTime endringsDatoField) {
      this.endringsDatoField = endringsDatoField;
      return this;
    }

    public Builder withEndringsTypeField(String endringsTypeField) {
      this.endringsTypeField = endringsTypeField;
      return this;
    }

    public Builder withTidligerePostAdresseField(String tidligerePostAdresseField) {
      this.tidligerePostAdresseField = tidligerePostAdresseField;
      return this;
    }


    public PersonTidligereNavnAdresse build() { return new PersonTidligereNavnAdresse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonTidligereNavnAdresse personTidligereNavnAdresse = (PersonTidligereNavnAdresse) o;
    return Objects.equals(this.tidligereNavnAdresse1Field, personTidligereNavnAdresse.tidligereNavnAdresse1Field) &&
        Objects.equals(this.endringsDatoField, personTidligereNavnAdresse.endringsDatoField) &&
        Objects.equals(this.endringsTypeField, personTidligereNavnAdresse.endringsTypeField) &&
        Objects.equals(this.tidligerePostAdresseField, personTidligereNavnAdresse.tidligerePostAdresseField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tidligereNavnAdresse1Field, endringsDatoField, endringsTypeField, tidligerePostAdresseField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonTidligereNavnAdresse {\n");
    
    sb.append("    tidligereNavnAdresse1Field: ").append(toIndentedString(tidligereNavnAdresse1Field)).append("\n");
    sb.append("    endringsDatoField: ").append(toIndentedString(endringsDatoField)).append("\n");
    sb.append("    endringsTypeField: ").append(toIndentedString(endringsTypeField)).append("\n");
    sb.append("    tidligerePostAdresseField: ").append(toIndentedString(tidligerePostAdresseField)).append("\n");
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
