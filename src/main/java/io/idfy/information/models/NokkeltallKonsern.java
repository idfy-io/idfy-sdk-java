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
 * NokkeltallKonsern
 */
@JsonDeserialize(builder = NokkeltallKonsern.Builder.class)
public class NokkeltallKonsern  implements Serializable {
  private final Integer regnskapsAvArField;  // Default value is: null

  private final Integer regnskapsAvMndField;  // Default value is: null

  private final Double overskuddsprosentField;  // Default value is: null

  private final Double rentedekningsgradField;  // Default value is: null

  private final Double totalrentabilitetField;  // Default value is: null

  private final Double eKRentabilitetField;  // Default value is: null

  private final Double langLagerfinansField;  // Default value is: null

  private final Double gjennomsnittLagerField;  // Default value is: null

  private final Double egenkapitalAndelField;  // Default value is: null

  private final Double tapsbufferField;  // Default value is: null

  private final Double fremmedkapitalKostnadField;  // Default value is: null

  private final Double likviditetsgrad1Field;  // Default value is: null

  private final Double likviditetsgrad2Field;  // Default value is: null

  private final Double likviderProsentSalgField;  // Default value is: null

  private NokkeltallKonsern(Builder builder) {
      regnskapsAvArField = builder.regnskapsAvArField;
      regnskapsAvMndField = builder.regnskapsAvMndField;
      overskuddsprosentField = builder.overskuddsprosentField;
      rentedekningsgradField = builder.rentedekningsgradField;
      totalrentabilitetField = builder.totalrentabilitetField;
      eKRentabilitetField = builder.eKRentabilitetField;
      langLagerfinansField = builder.langLagerfinansField;
      gjennomsnittLagerField = builder.gjennomsnittLagerField;
      egenkapitalAndelField = builder.egenkapitalAndelField;
      tapsbufferField = builder.tapsbufferField;
      fremmedkapitalKostnadField = builder.fremmedkapitalKostnadField;
      likviditetsgrad1Field = builder.likviditetsgrad1Field;
      likviditetsgrad2Field = builder.likviditetsgrad2Field;
      likviderProsentSalgField = builder.likviderProsentSalgField;
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
      * Get overskuddsprosentField
      * @return overskuddsprosentField
      **/
      public Double getOverskuddsprosentField() {return overskuddsprosentField;}

      /**
      * Get rentedekningsgradField
      * @return rentedekningsgradField
      **/
      public Double getRentedekningsgradField() {return rentedekningsgradField;}

      /**
      * Get totalrentabilitetField
      * @return totalrentabilitetField
      **/
      public Double getTotalrentabilitetField() {return totalrentabilitetField;}

      /**
      * Get eKRentabilitetField
      * @return eKRentabilitetField
      **/
      public Double getEKRentabilitetField() {return eKRentabilitetField;}

      /**
      * Get langLagerfinansField
      * @return langLagerfinansField
      **/
      public Double getLangLagerfinansField() {return langLagerfinansField;}

      /**
      * Get gjennomsnittLagerField
      * @return gjennomsnittLagerField
      **/
      public Double getGjennomsnittLagerField() {return gjennomsnittLagerField;}

      /**
      * Get egenkapitalAndelField
      * @return egenkapitalAndelField
      **/
      public Double getEgenkapitalAndelField() {return egenkapitalAndelField;}

      /**
      * Get tapsbufferField
      * @return tapsbufferField
      **/
      public Double getTapsbufferField() {return tapsbufferField;}

      /**
      * Get fremmedkapitalKostnadField
      * @return fremmedkapitalKostnadField
      **/
      public Double getFremmedkapitalKostnadField() {return fremmedkapitalKostnadField;}

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

      /**
      * Get likviderProsentSalgField
      * @return likviderProsentSalgField
      **/
      public Double getLikviderProsentSalgField() {return likviderProsentSalgField;}


  public static final class Builder {
      private Integer regnskapsAvArField;
      private Integer regnskapsAvMndField;
      private Double overskuddsprosentField;
      private Double rentedekningsgradField;
      private Double totalrentabilitetField;
      private Double eKRentabilitetField;
      private Double langLagerfinansField;
      private Double gjennomsnittLagerField;
      private Double egenkapitalAndelField;
      private Double tapsbufferField;
      private Double fremmedkapitalKostnadField;
      private Double likviditetsgrad1Field;
      private Double likviditetsgrad2Field;
      private Double likviderProsentSalgField;

    public Builder() {
    }

    public Builder(NokkeltallKonsern copy) {
        this.regnskapsAvArField = copy.getRegnskapsAvArField();
        this.regnskapsAvMndField = copy.getRegnskapsAvMndField();
        this.overskuddsprosentField = copy.getOverskuddsprosentField();
        this.rentedekningsgradField = copy.getRentedekningsgradField();
        this.totalrentabilitetField = copy.getTotalrentabilitetField();
        this.eKRentabilitetField = copy.getEKRentabilitetField();
        this.langLagerfinansField = copy.getLangLagerfinansField();
        this.gjennomsnittLagerField = copy.getGjennomsnittLagerField();
        this.egenkapitalAndelField = copy.getEgenkapitalAndelField();
        this.tapsbufferField = copy.getTapsbufferField();
        this.fremmedkapitalKostnadField = copy.getFremmedkapitalKostnadField();
        this.likviditetsgrad1Field = copy.getLikviditetsgrad1Field();
        this.likviditetsgrad2Field = copy.getLikviditetsgrad2Field();
        this.likviderProsentSalgField = copy.getLikviderProsentSalgField();
    }

    public Builder withRegnskapsAvArField(Integer regnskapsAvArField) {
      this.regnskapsAvArField = regnskapsAvArField;
      return this;
    }

    public Builder withRegnskapsAvMndField(Integer regnskapsAvMndField) {
      this.regnskapsAvMndField = regnskapsAvMndField;
      return this;
    }

    public Builder withOverskuddsprosentField(Double overskuddsprosentField) {
      this.overskuddsprosentField = overskuddsprosentField;
      return this;
    }

    public Builder withRentedekningsgradField(Double rentedekningsgradField) {
      this.rentedekningsgradField = rentedekningsgradField;
      return this;
    }

    public Builder withTotalrentabilitetField(Double totalrentabilitetField) {
      this.totalrentabilitetField = totalrentabilitetField;
      return this;
    }

    public Builder withEKRentabilitetField(Double eKRentabilitetField) {
      this.eKRentabilitetField = eKRentabilitetField;
      return this;
    }

    public Builder withLangLagerfinansField(Double langLagerfinansField) {
      this.langLagerfinansField = langLagerfinansField;
      return this;
    }

    public Builder withGjennomsnittLagerField(Double gjennomsnittLagerField) {
      this.gjennomsnittLagerField = gjennomsnittLagerField;
      return this;
    }

    public Builder withEgenkapitalAndelField(Double egenkapitalAndelField) {
      this.egenkapitalAndelField = egenkapitalAndelField;
      return this;
    }

    public Builder withTapsbufferField(Double tapsbufferField) {
      this.tapsbufferField = tapsbufferField;
      return this;
    }

    public Builder withFremmedkapitalKostnadField(Double fremmedkapitalKostnadField) {
      this.fremmedkapitalKostnadField = fremmedkapitalKostnadField;
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

    public Builder withLikviderProsentSalgField(Double likviderProsentSalgField) {
      this.likviderProsentSalgField = likviderProsentSalgField;
      return this;
    }


    public NokkeltallKonsern build() { return new NokkeltallKonsern(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NokkeltallKonsern nokkeltallKonsern = (NokkeltallKonsern) o;
    return Objects.equals(this.regnskapsAvArField, nokkeltallKonsern.regnskapsAvArField) &&
        Objects.equals(this.regnskapsAvMndField, nokkeltallKonsern.regnskapsAvMndField) &&
        Objects.equals(this.overskuddsprosentField, nokkeltallKonsern.overskuddsprosentField) &&
        Objects.equals(this.rentedekningsgradField, nokkeltallKonsern.rentedekningsgradField) &&
        Objects.equals(this.totalrentabilitetField, nokkeltallKonsern.totalrentabilitetField) &&
        Objects.equals(this.eKRentabilitetField, nokkeltallKonsern.eKRentabilitetField) &&
        Objects.equals(this.langLagerfinansField, nokkeltallKonsern.langLagerfinansField) &&
        Objects.equals(this.gjennomsnittLagerField, nokkeltallKonsern.gjennomsnittLagerField) &&
        Objects.equals(this.egenkapitalAndelField, nokkeltallKonsern.egenkapitalAndelField) &&
        Objects.equals(this.tapsbufferField, nokkeltallKonsern.tapsbufferField) &&
        Objects.equals(this.fremmedkapitalKostnadField, nokkeltallKonsern.fremmedkapitalKostnadField) &&
        Objects.equals(this.likviditetsgrad1Field, nokkeltallKonsern.likviditetsgrad1Field) &&
        Objects.equals(this.likviditetsgrad2Field, nokkeltallKonsern.likviditetsgrad2Field) &&
        Objects.equals(this.likviderProsentSalgField, nokkeltallKonsern.likviderProsentSalgField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regnskapsAvArField, regnskapsAvMndField, overskuddsprosentField, rentedekningsgradField, totalrentabilitetField, eKRentabilitetField, langLagerfinansField, gjennomsnittLagerField, egenkapitalAndelField, tapsbufferField, fremmedkapitalKostnadField, likviditetsgrad1Field, likviditetsgrad2Field, likviderProsentSalgField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NokkeltallKonsern {\n");
    
    sb.append("    regnskapsAvArField: ").append(toIndentedString(regnskapsAvArField)).append("\n");
    sb.append("    regnskapsAvMndField: ").append(toIndentedString(regnskapsAvMndField)).append("\n");
    sb.append("    overskuddsprosentField: ").append(toIndentedString(overskuddsprosentField)).append("\n");
    sb.append("    rentedekningsgradField: ").append(toIndentedString(rentedekningsgradField)).append("\n");
    sb.append("    totalrentabilitetField: ").append(toIndentedString(totalrentabilitetField)).append("\n");
    sb.append("    eKRentabilitetField: ").append(toIndentedString(eKRentabilitetField)).append("\n");
    sb.append("    langLagerfinansField: ").append(toIndentedString(langLagerfinansField)).append("\n");
    sb.append("    gjennomsnittLagerField: ").append(toIndentedString(gjennomsnittLagerField)).append("\n");
    sb.append("    egenkapitalAndelField: ").append(toIndentedString(egenkapitalAndelField)).append("\n");
    sb.append("    tapsbufferField: ").append(toIndentedString(tapsbufferField)).append("\n");
    sb.append("    fremmedkapitalKostnadField: ").append(toIndentedString(fremmedkapitalKostnadField)).append("\n");
    sb.append("    likviditetsgrad1Field: ").append(toIndentedString(likviditetsgrad1Field)).append("\n");
    sb.append("    likviditetsgrad2Field: ").append(toIndentedString(likviditetsgrad2Field)).append("\n");
    sb.append("    likviderProsentSalgField: ").append(toIndentedString(likviderProsentSalgField)).append("\n");
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
