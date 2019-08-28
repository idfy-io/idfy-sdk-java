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
 * OkonomiSammendragKonsern
 */
@JsonDeserialize(builder = OkonomiSammendragKonsern.Builder.class)
public class OkonomiSammendragKonsern  implements Serializable {
  private final Integer regnskapsAvArField;  // Default value is: null

  private final Integer regnskapsAvMndField;  // Default value is: null

  private final Long totalinntektField;  // Default value is: null

  private final Long resultatForSkattField;  // Default value is: null

  private final Long arsResultatField;  // Default value is: null

  private final Long sumEiendelerField;  // Default value is: null

  private final Double overskuddsprosentField;  // Default value is: null

  private final Double totalrentabilitetField;  // Default value is: null

  private final Double egenkapitalandelField;  // Default value is: null

  private final Double likviditetsgrad1Field;  // Default value is: null

  private final Double likviditetsgrad2Field;  // Default value is: null

  private OkonomiSammendragKonsern(Builder builder) {
      regnskapsAvArField = builder.regnskapsAvArField;
      regnskapsAvMndField = builder.regnskapsAvMndField;
      totalinntektField = builder.totalinntektField;
      resultatForSkattField = builder.resultatForSkattField;
      arsResultatField = builder.arsResultatField;
      sumEiendelerField = builder.sumEiendelerField;
      overskuddsprosentField = builder.overskuddsprosentField;
      totalrentabilitetField = builder.totalrentabilitetField;
      egenkapitalandelField = builder.egenkapitalandelField;
      likviditetsgrad1Field = builder.likviditetsgrad1Field;
      likviditetsgrad2Field = builder.likviditetsgrad2Field;
  }

      /**
      * Get regnskapsAvArField
      * @return regnskapsAvArField
      **/
      public Integer getRegnskapsAvArField() {return regnskapsAvArField;}

      /**
      * Get regnskapsAvMndField
      * @return regnskapsAvMndField
      **/
      public Integer getRegnskapsAvMndField() {return regnskapsAvMndField;}

      /**
      * Get totalinntektField
      * @return totalinntektField
      **/
      public Long getTotalinntektField() {return totalinntektField;}

      /**
      * Get resultatForSkattField
      * @return resultatForSkattField
      **/
      public Long getResultatForSkattField() {return resultatForSkattField;}

      /**
      * Get arsResultatField
      * @return arsResultatField
      **/
      public Long getArsResultatField() {return arsResultatField;}

      /**
      * Get sumEiendelerField
      * @return sumEiendelerField
      **/
      public Long getSumEiendelerField() {return sumEiendelerField;}

      /**
      * Get overskuddsprosentField
      * @return overskuddsprosentField
      **/
      public Double getOverskuddsprosentField() {return overskuddsprosentField;}

      /**
      * Get totalrentabilitetField
      * @return totalrentabilitetField
      **/
      public Double getTotalrentabilitetField() {return totalrentabilitetField;}

      /**
      * Get egenkapitalandelField
      * @return egenkapitalandelField
      **/
      public Double getEgenkapitalandelField() {return egenkapitalandelField;}

      /**
      * Get likviditetsgrad1Field
      * @return likviditetsgrad1Field
      **/
      public Double getLikviditetsgrad1Field() {return likviditetsgrad1Field;}

      /**
      * Get likviditetsgrad2Field
      * @return likviditetsgrad2Field
      **/
      public Double getLikviditetsgrad2Field() {return likviditetsgrad2Field;}


  public static final class Builder {
      private Integer regnskapsAvArField;
      private Integer regnskapsAvMndField;
      private Long totalinntektField;
      private Long resultatForSkattField;
      private Long arsResultatField;
      private Long sumEiendelerField;
      private Double overskuddsprosentField;
      private Double totalrentabilitetField;
      private Double egenkapitalandelField;
      private Double likviditetsgrad1Field;
      private Double likviditetsgrad2Field;

    public Builder() {
    }

    public Builder(OkonomiSammendragKonsern copy) {
        this.regnskapsAvArField = copy.getRegnskapsAvArField();
        this.regnskapsAvMndField = copy.getRegnskapsAvMndField();
        this.totalinntektField = copy.getTotalinntektField();
        this.resultatForSkattField = copy.getResultatForSkattField();
        this.arsResultatField = copy.getArsResultatField();
        this.sumEiendelerField = copy.getSumEiendelerField();
        this.overskuddsprosentField = copy.getOverskuddsprosentField();
        this.totalrentabilitetField = copy.getTotalrentabilitetField();
        this.egenkapitalandelField = copy.getEgenkapitalandelField();
        this.likviditetsgrad1Field = copy.getLikviditetsgrad1Field();
        this.likviditetsgrad2Field = copy.getLikviditetsgrad2Field();
    }

    public Builder withRegnskapsAvArField(Integer regnskapsAvArField) {
      this.regnskapsAvArField = regnskapsAvArField;
      return this;
    }

    public Builder withRegnskapsAvMndField(Integer regnskapsAvMndField) {
      this.regnskapsAvMndField = regnskapsAvMndField;
      return this;
    }

    public Builder withTotalinntektField(Long totalinntektField) {
      this.totalinntektField = totalinntektField;
      return this;
    }

    public Builder withResultatForSkattField(Long resultatForSkattField) {
      this.resultatForSkattField = resultatForSkattField;
      return this;
    }

    public Builder withArsResultatField(Long arsResultatField) {
      this.arsResultatField = arsResultatField;
      return this;
    }

    public Builder withSumEiendelerField(Long sumEiendelerField) {
      this.sumEiendelerField = sumEiendelerField;
      return this;
    }

    public Builder withOverskuddsprosentField(Double overskuddsprosentField) {
      this.overskuddsprosentField = overskuddsprosentField;
      return this;
    }

    public Builder withTotalrentabilitetField(Double totalrentabilitetField) {
      this.totalrentabilitetField = totalrentabilitetField;
      return this;
    }

    public Builder withEgenkapitalandelField(Double egenkapitalandelField) {
      this.egenkapitalandelField = egenkapitalandelField;
      return this;
    }

    public Builder withLikviditetsgrad1Field(Double likviditetsgrad1Field) {
      this.likviditetsgrad1Field = likviditetsgrad1Field;
      return this;
    }

    public Builder withLikviditetsgrad2Field(Double likviditetsgrad2Field) {
      this.likviditetsgrad2Field = likviditetsgrad2Field;
      return this;
    }


    public OkonomiSammendragKonsern build() { return new OkonomiSammendragKonsern(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OkonomiSammendragKonsern okonomiSammendragKonsern = (OkonomiSammendragKonsern) o;
    return Objects.equals(this.regnskapsAvArField, okonomiSammendragKonsern.regnskapsAvArField) &&
        Objects.equals(this.regnskapsAvMndField, okonomiSammendragKonsern.regnskapsAvMndField) &&
        Objects.equals(this.totalinntektField, okonomiSammendragKonsern.totalinntektField) &&
        Objects.equals(this.resultatForSkattField, okonomiSammendragKonsern.resultatForSkattField) &&
        Objects.equals(this.arsResultatField, okonomiSammendragKonsern.arsResultatField) &&
        Objects.equals(this.sumEiendelerField, okonomiSammendragKonsern.sumEiendelerField) &&
        Objects.equals(this.overskuddsprosentField, okonomiSammendragKonsern.overskuddsprosentField) &&
        Objects.equals(this.totalrentabilitetField, okonomiSammendragKonsern.totalrentabilitetField) &&
        Objects.equals(this.egenkapitalandelField, okonomiSammendragKonsern.egenkapitalandelField) &&
        Objects.equals(this.likviditetsgrad1Field, okonomiSammendragKonsern.likviditetsgrad1Field) &&
        Objects.equals(this.likviditetsgrad2Field, okonomiSammendragKonsern.likviditetsgrad2Field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regnskapsAvArField, regnskapsAvMndField, totalinntektField, resultatForSkattField, arsResultatField, sumEiendelerField, overskuddsprosentField, totalrentabilitetField, egenkapitalandelField, likviditetsgrad1Field, likviditetsgrad2Field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OkonomiSammendragKonsern {\n");
    
    sb.append("    regnskapsAvArField: ").append(toIndentedString(regnskapsAvArField)).append("\n");
    sb.append("    regnskapsAvMndField: ").append(toIndentedString(regnskapsAvMndField)).append("\n");
    sb.append("    totalinntektField: ").append(toIndentedString(totalinntektField)).append("\n");
    sb.append("    resultatForSkattField: ").append(toIndentedString(resultatForSkattField)).append("\n");
    sb.append("    arsResultatField: ").append(toIndentedString(arsResultatField)).append("\n");
    sb.append("    sumEiendelerField: ").append(toIndentedString(sumEiendelerField)).append("\n");
    sb.append("    overskuddsprosentField: ").append(toIndentedString(overskuddsprosentField)).append("\n");
    sb.append("    totalrentabilitetField: ").append(toIndentedString(totalrentabilitetField)).append("\n");
    sb.append("    egenkapitalandelField: ").append(toIndentedString(egenkapitalandelField)).append("\n");
    sb.append("    likviditetsgrad1Field: ").append(toIndentedString(likviditetsgrad1Field)).append("\n");
    sb.append("    likviditetsgrad2Field: ").append(toIndentedString(likviditetsgrad2Field)).append("\n");
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
