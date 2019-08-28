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
import io.idfy.information.models.ArsaksData;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Scoring
 */
@JsonDeserialize(builder = Scoring.Builder.class)
public class Scoring  implements Serializable {
  private final String beslutningField;  // Default value is: null

  private final List<ArsaksData> arsaksDataField;  // Default value is: new ArrayList<>()

  private final Integer scoreField;  // Default value is: null

  private final Integer grenseAvslagField;  // Default value is: null

  private final Integer grenseGodkjentField;  // Default value is: null

  private Scoring(Builder builder) {
      beslutningField = builder.beslutningField;
      arsaksDataField = builder.arsaksDataField;
      scoreField = builder.scoreField;
      grenseAvslagField = builder.grenseAvslagField;
      grenseGodkjentField = builder.grenseGodkjentField;
  }

      /**
      * Get beslutningField
      * @return beslutningField
      **/
      public String getBeslutningField() {return beslutningField;}

      /**
      * Get arsaksDataField
      * @return arsaksDataField
      **/
      public List<ArsaksData> getArsaksDataField() {return arsaksDataField;}

      /**
      * Get scoreField
      * @return scoreField
      **/
      public Integer getScoreField() {return scoreField;}

      /**
      * Get grenseAvslagField
      * @return grenseAvslagField
      **/
      public Integer getGrenseAvslagField() {return grenseAvslagField;}

      /**
      * Get grenseGodkjentField
      * @return grenseGodkjentField
      **/
      public Integer getGrenseGodkjentField() {return grenseGodkjentField;}


  public static final class Builder {
      private String beslutningField;
      private List<ArsaksData> arsaksDataField;
      private Integer scoreField;
      private Integer grenseAvslagField;
      private Integer grenseGodkjentField;

    public Builder() {
    }

    public Builder(Scoring copy) {
        this.beslutningField = copy.getBeslutningField();
        this.arsaksDataField = copy.getArsaksDataField();
        this.scoreField = copy.getScoreField();
        this.grenseAvslagField = copy.getGrenseAvslagField();
        this.grenseGodkjentField = copy.getGrenseGodkjentField();
    }

    public Builder withBeslutningField(String beslutningField) {
      this.beslutningField = beslutningField;
      return this;
    }

    public Builder withArsaksDataField(List<ArsaksData> arsaksDataField) {
      this.arsaksDataField = arsaksDataField;
      return this;
    }

    public Builder addArsaksDataFieldItem(ArsaksData arsaksDataFieldItem) {
      if (this.arsaksDataField == null) {
        this.arsaksDataField = new ArrayList<>();
      }
      this.arsaksDataField.add(arsaksDataFieldItem);
      return this;
    }

    public Builder withScoreField(Integer scoreField) {
      this.scoreField = scoreField;
      return this;
    }

    public Builder withGrenseAvslagField(Integer grenseAvslagField) {
      this.grenseAvslagField = grenseAvslagField;
      return this;
    }

    public Builder withGrenseGodkjentField(Integer grenseGodkjentField) {
      this.grenseGodkjentField = grenseGodkjentField;
      return this;
    }


    public Scoring build() { return new Scoring(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scoring scoring = (Scoring) o;
    return Objects.equals(this.beslutningField, scoring.beslutningField) &&
        Objects.equals(this.arsaksDataField, scoring.arsaksDataField) &&
        Objects.equals(this.scoreField, scoring.scoreField) &&
        Objects.equals(this.grenseAvslagField, scoring.grenseAvslagField) &&
        Objects.equals(this.grenseGodkjentField, scoring.grenseGodkjentField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beslutningField, arsaksDataField, scoreField, grenseAvslagField, grenseGodkjentField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scoring {\n");
    
    sb.append("    beslutningField: ").append(toIndentedString(beslutningField)).append("\n");
    sb.append("    arsaksDataField: ").append(toIndentedString(arsaksDataField)).append("\n");
    sb.append("    scoreField: ").append(toIndentedString(scoreField)).append("\n");
    sb.append("    grenseAvslagField: ").append(toIndentedString(grenseAvslagField)).append("\n");
    sb.append("    grenseGodkjentField: ").append(toIndentedString(grenseGodkjentField)).append("\n");
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
