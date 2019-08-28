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
 * PersonBetaSammendrag
 */
@JsonDeserialize(builder = PersonBetaSammendrag.Builder.class)
public class PersonBetaSammendrag  implements Serializable {
  private final Integer antallInkassoField;  // Default value is: null

  private final OffsetDateTime ajourDatoInkassoField;  // Default value is: null

  private final Integer antallPanterLosoreField;  // Default value is: null

  private final OffsetDateTime ajourDatoLosoreField;  // Default value is: null

  private final Integer antallPanterEiendomField;  // Default value is: null

  private final OffsetDateTime ajourDatoEiendomField;  // Default value is: null

  private PersonBetaSammendrag(Builder builder) {
      antallInkassoField = builder.antallInkassoField;
      ajourDatoInkassoField = builder.ajourDatoInkassoField;
      antallPanterLosoreField = builder.antallPanterLosoreField;
      ajourDatoLosoreField = builder.ajourDatoLosoreField;
      antallPanterEiendomField = builder.antallPanterEiendomField;
      ajourDatoEiendomField = builder.ajourDatoEiendomField;
  }

      /**
      * Get antallInkassoField
      * @return antallInkassoField
      **/
      public Integer getAntallInkassoField() {return antallInkassoField;}

      /**
      * Get ajourDatoInkassoField
      * @return ajourDatoInkassoField
      **/
      public OffsetDateTime getAjourDatoInkassoField() {return ajourDatoInkassoField;}

      /**
      * Get antallPanterLosoreField
      * @return antallPanterLosoreField
      **/
      public Integer getAntallPanterLosoreField() {return antallPanterLosoreField;}

      /**
      * Get ajourDatoLosoreField
      * @return ajourDatoLosoreField
      **/
      public OffsetDateTime getAjourDatoLosoreField() {return ajourDatoLosoreField;}

      /**
      * Get antallPanterEiendomField
      * @return antallPanterEiendomField
      **/
      public Integer getAntallPanterEiendomField() {return antallPanterEiendomField;}

      /**
      * Get ajourDatoEiendomField
      * @return ajourDatoEiendomField
      **/
      public OffsetDateTime getAjourDatoEiendomField() {return ajourDatoEiendomField;}


  public static final class Builder {
      private Integer antallInkassoField;
      private OffsetDateTime ajourDatoInkassoField;
      private Integer antallPanterLosoreField;
      private OffsetDateTime ajourDatoLosoreField;
      private Integer antallPanterEiendomField;
      private OffsetDateTime ajourDatoEiendomField;

    public Builder() {
    }

    public Builder(PersonBetaSammendrag copy) {
        this.antallInkassoField = copy.getAntallInkassoField();
        this.ajourDatoInkassoField = copy.getAjourDatoInkassoField();
        this.antallPanterLosoreField = copy.getAntallPanterLosoreField();
        this.ajourDatoLosoreField = copy.getAjourDatoLosoreField();
        this.antallPanterEiendomField = copy.getAntallPanterEiendomField();
        this.ajourDatoEiendomField = copy.getAjourDatoEiendomField();
    }

    public Builder withAntallInkassoField(Integer antallInkassoField) {
      this.antallInkassoField = antallInkassoField;
      return this;
    }

    public Builder withAjourDatoInkassoField(OffsetDateTime ajourDatoInkassoField) {
      this.ajourDatoInkassoField = ajourDatoInkassoField;
      return this;
    }

    public Builder withAntallPanterLosoreField(Integer antallPanterLosoreField) {
      this.antallPanterLosoreField = antallPanterLosoreField;
      return this;
    }

    public Builder withAjourDatoLosoreField(OffsetDateTime ajourDatoLosoreField) {
      this.ajourDatoLosoreField = ajourDatoLosoreField;
      return this;
    }

    public Builder withAntallPanterEiendomField(Integer antallPanterEiendomField) {
      this.antallPanterEiendomField = antallPanterEiendomField;
      return this;
    }

    public Builder withAjourDatoEiendomField(OffsetDateTime ajourDatoEiendomField) {
      this.ajourDatoEiendomField = ajourDatoEiendomField;
      return this;
    }


    public PersonBetaSammendrag build() { return new PersonBetaSammendrag(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonBetaSammendrag personBetaSammendrag = (PersonBetaSammendrag) o;
    return Objects.equals(this.antallInkassoField, personBetaSammendrag.antallInkassoField) &&
        Objects.equals(this.ajourDatoInkassoField, personBetaSammendrag.ajourDatoInkassoField) &&
        Objects.equals(this.antallPanterLosoreField, personBetaSammendrag.antallPanterLosoreField) &&
        Objects.equals(this.ajourDatoLosoreField, personBetaSammendrag.ajourDatoLosoreField) &&
        Objects.equals(this.antallPanterEiendomField, personBetaSammendrag.antallPanterEiendomField) &&
        Objects.equals(this.ajourDatoEiendomField, personBetaSammendrag.ajourDatoEiendomField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antallInkassoField, ajourDatoInkassoField, antallPanterLosoreField, ajourDatoLosoreField, antallPanterEiendomField, ajourDatoEiendomField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonBetaSammendrag {\n");
    
    sb.append("    antallInkassoField: ").append(toIndentedString(antallInkassoField)).append("\n");
    sb.append("    ajourDatoInkassoField: ").append(toIndentedString(ajourDatoInkassoField)).append("\n");
    sb.append("    antallPanterLosoreField: ").append(toIndentedString(antallPanterLosoreField)).append("\n");
    sb.append("    ajourDatoLosoreField: ").append(toIndentedString(ajourDatoLosoreField)).append("\n");
    sb.append("    antallPanterEiendomField: ").append(toIndentedString(antallPanterEiendomField)).append("\n");
    sb.append("    ajourDatoEiendomField: ").append(toIndentedString(ajourDatoEiendomField)).append("\n");
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
