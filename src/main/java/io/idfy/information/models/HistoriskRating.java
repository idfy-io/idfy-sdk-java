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
 * HistoriskRating
 */
@JsonDeserialize(builder = HistoriskRating.Builder.class)
public class HistoriskRating  implements Serializable {
  private final Integer endrArField;  // Default value is: null

  private final Integer endrMndField;  // Default value is: null

  private final String ratingField;  // Default value is: null

  private final Integer limitField;  // Default value is: null

  private final String aktuellHendelseField;  // Default value is: null

  private final Integer regnArField;  // Default value is: null

  private HistoriskRating(Builder builder) {
      endrArField = builder.endrArField;
      endrMndField = builder.endrMndField;
      ratingField = builder.ratingField;
      limitField = builder.limitField;
      aktuellHendelseField = builder.aktuellHendelseField;
      regnArField = builder.regnArField;
  }

      /**
      * Get endrArField
      * @return endrArField
      **/
      public Integer getEndrArField() {return endrArField;}

      /**
      * Get endrMndField
      * @return endrMndField
      **/
      public Integer getEndrMndField() {return endrMndField;}

      /**
      * Get ratingField
      * @return ratingField
      **/
      public String getRatingField() {return ratingField;}

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
      * Get regnArField
      * @return regnArField
      **/
      public Integer getRegnArField() {return regnArField;}


  public static final class Builder {
      private Integer endrArField;
      private Integer endrMndField;
      private String ratingField;
      private Integer limitField;
      private String aktuellHendelseField;
      private Integer regnArField;

    public Builder() {
    }

    public Builder(HistoriskRating copy) {
        this.endrArField = copy.getEndrArField();
        this.endrMndField = copy.getEndrMndField();
        this.ratingField = copy.getRatingField();
        this.limitField = copy.getLimitField();
        this.aktuellHendelseField = copy.getAktuellHendelseField();
        this.regnArField = copy.getRegnArField();
    }

    public Builder withEndrArField(Integer endrArField) {
      this.endrArField = endrArField;
      return this;
    }

    public Builder withEndrMndField(Integer endrMndField) {
      this.endrMndField = endrMndField;
      return this;
    }

    public Builder withRatingField(String ratingField) {
      this.ratingField = ratingField;
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

    public Builder withRegnArField(Integer regnArField) {
      this.regnArField = regnArField;
      return this;
    }


    public HistoriskRating build() { return new HistoriskRating(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoriskRating historiskRating = (HistoriskRating) o;
    return Objects.equals(this.endrArField, historiskRating.endrArField) &&
        Objects.equals(this.endrMndField, historiskRating.endrMndField) &&
        Objects.equals(this.ratingField, historiskRating.ratingField) &&
        Objects.equals(this.limitField, historiskRating.limitField) &&
        Objects.equals(this.aktuellHendelseField, historiskRating.aktuellHendelseField) &&
        Objects.equals(this.regnArField, historiskRating.regnArField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endrArField, endrMndField, ratingField, limitField, aktuellHendelseField, regnArField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoriskRating {\n");
    
    sb.append("    endrArField: ").append(toIndentedString(endrArField)).append("\n");
    sb.append("    endrMndField: ").append(toIndentedString(endrMndField)).append("\n");
    sb.append("    ratingField: ").append(toIndentedString(ratingField)).append("\n");
    sb.append("    limitField: ").append(toIndentedString(limitField)).append("\n");
    sb.append("    aktuellHendelseField: ").append(toIndentedString(aktuellHendelseField)).append("\n");
    sb.append("    regnArField: ").append(toIndentedString(regnArField)).append("\n");
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
