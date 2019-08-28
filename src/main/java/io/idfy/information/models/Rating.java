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
 * Rating
 */
@JsonDeserialize(builder = Rating.Builder.class)
public class Rating  implements Serializable {
  private final String rating1Field;  // Default value is: null

  private final String ratingBeskrivelseField;  // Default value is: null

  private final Integer limitField;  // Default value is: null

  private final String aktuellHendelseField;  // Default value is: null

  private final String delbGrunnfaktaField;  // Default value is: null

  private final String delbEierJurdiskField;  // Default value is: null

  private final String delbOkonomiField;  // Default value is: null

  private final String delbBetalingserfaringField;  // Default value is: null

  private Rating(Builder builder) {
      rating1Field = builder.rating1Field;
      ratingBeskrivelseField = builder.ratingBeskrivelseField;
      limitField = builder.limitField;
      aktuellHendelseField = builder.aktuellHendelseField;
      delbGrunnfaktaField = builder.delbGrunnfaktaField;
      delbEierJurdiskField = builder.delbEierJurdiskField;
      delbOkonomiField = builder.delbOkonomiField;
      delbBetalingserfaringField = builder.delbBetalingserfaringField;
  }

      /**
      * Get rating1Field
      * @return rating1Field
      **/
      public String getRating1Field() {return rating1Field;}

      /**
      * Get ratingBeskrivelseField
      * @return ratingBeskrivelseField
      **/
      public String getRatingBeskrivelseField() {return ratingBeskrivelseField;}

      /**
      * Get limitField
      * @return limitField
      **/
      public Integer getLimitField() {return limitField;}

      /**
      * Get aktuellHendelseField
      * @return aktuellHendelseField
      **/
      public String getAktuellHendelseField() {return aktuellHendelseField;}

      /**
      * Get delbGrunnfaktaField
      * @return delbGrunnfaktaField
      **/
      public String getDelbGrunnfaktaField() {return delbGrunnfaktaField;}

      /**
      * Get delbEierJurdiskField
      * @return delbEierJurdiskField
      **/
      public String getDelbEierJurdiskField() {return delbEierJurdiskField;}

      /**
      * Get delbOkonomiField
      * @return delbOkonomiField
      **/
      public String getDelbOkonomiField() {return delbOkonomiField;}

      /**
      * Get delbBetalingserfaringField
      * @return delbBetalingserfaringField
      **/
      public String getDelbBetalingserfaringField() {return delbBetalingserfaringField;}


  public static final class Builder {
      private String rating1Field;
      private String ratingBeskrivelseField;
      private Integer limitField;
      private String aktuellHendelseField;
      private String delbGrunnfaktaField;
      private String delbEierJurdiskField;
      private String delbOkonomiField;
      private String delbBetalingserfaringField;

    public Builder() {
    }

    public Builder(Rating copy) {
        this.rating1Field = copy.getRating1Field();
        this.ratingBeskrivelseField = copy.getRatingBeskrivelseField();
        this.limitField = copy.getLimitField();
        this.aktuellHendelseField = copy.getAktuellHendelseField();
        this.delbGrunnfaktaField = copy.getDelbGrunnfaktaField();
        this.delbEierJurdiskField = copy.getDelbEierJurdiskField();
        this.delbOkonomiField = copy.getDelbOkonomiField();
        this.delbBetalingserfaringField = copy.getDelbBetalingserfaringField();
    }

    public Builder withRating1Field(String rating1Field) {
      this.rating1Field = rating1Field;
      return this;
    }

    public Builder withRatingBeskrivelseField(String ratingBeskrivelseField) {
      this.ratingBeskrivelseField = ratingBeskrivelseField;
      return this;
    }

    public Builder withLimitField(Integer limitField) {
      this.limitField = limitField;
      return this;
    }

    public Builder withAktuellHendelseField(String aktuellHendelseField) {
      this.aktuellHendelseField = aktuellHendelseField;
      return this;
    }

    public Builder withDelbGrunnfaktaField(String delbGrunnfaktaField) {
      this.delbGrunnfaktaField = delbGrunnfaktaField;
      return this;
    }

    public Builder withDelbEierJurdiskField(String delbEierJurdiskField) {
      this.delbEierJurdiskField = delbEierJurdiskField;
      return this;
    }

    public Builder withDelbOkonomiField(String delbOkonomiField) {
      this.delbOkonomiField = delbOkonomiField;
      return this;
    }

    public Builder withDelbBetalingserfaringField(String delbBetalingserfaringField) {
      this.delbBetalingserfaringField = delbBetalingserfaringField;
      return this;
    }


    public Rating build() { return new Rating(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rating rating = (Rating) o;
    return Objects.equals(this.rating1Field, rating.rating1Field) &&
        Objects.equals(this.ratingBeskrivelseField, rating.ratingBeskrivelseField) &&
        Objects.equals(this.limitField, rating.limitField) &&
        Objects.equals(this.aktuellHendelseField, rating.aktuellHendelseField) &&
        Objects.equals(this.delbGrunnfaktaField, rating.delbGrunnfaktaField) &&
        Objects.equals(this.delbEierJurdiskField, rating.delbEierJurdiskField) &&
        Objects.equals(this.delbOkonomiField, rating.delbOkonomiField) &&
        Objects.equals(this.delbBetalingserfaringField, rating.delbBetalingserfaringField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating1Field, ratingBeskrivelseField, limitField, aktuellHendelseField, delbGrunnfaktaField, delbEierJurdiskField, delbOkonomiField, delbBetalingserfaringField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    
    sb.append("    rating1Field: ").append(toIndentedString(rating1Field)).append("\n");
    sb.append("    ratingBeskrivelseField: ").append(toIndentedString(ratingBeskrivelseField)).append("\n");
    sb.append("    limitField: ").append(toIndentedString(limitField)).append("\n");
    sb.append("    aktuellHendelseField: ").append(toIndentedString(aktuellHendelseField)).append("\n");
    sb.append("    delbGrunnfaktaField: ").append(toIndentedString(delbGrunnfaktaField)).append("\n");
    sb.append("    delbEierJurdiskField: ").append(toIndentedString(delbEierJurdiskField)).append("\n");
    sb.append("    delbOkonomiField: ").append(toIndentedString(delbOkonomiField)).append("\n");
    sb.append("    delbBetalingserfaringField: ").append(toIndentedString(delbBetalingserfaringField)).append("\n");
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
