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
 * KonsernLink
 */
@JsonDeserialize(builder = KonsernLink.Builder.class)
public class KonsernLink  implements Serializable {
  private final Integer orgnrOversteMorField;  // Default value is: null

  private final Integer orgnrNaermesteMorField;  // Default value is: null

  private final Integer lopenrField;  // Default value is: null

  private final Integer nivaDeltagendeField;  // Default value is: null

  private final String landkodeDeltagendeField;  // Default value is: null

  private final Integer orgnrDeltagendeField;  // Default value is: null

  private final String navnDeltagendeField;  // Default value is: null

  private final Double eierandelDeltagendeField;  // Default value is: null

  private KonsernLink(Builder builder) {
      orgnrOversteMorField = builder.orgnrOversteMorField;
      orgnrNaermesteMorField = builder.orgnrNaermesteMorField;
      lopenrField = builder.lopenrField;
      nivaDeltagendeField = builder.nivaDeltagendeField;
      landkodeDeltagendeField = builder.landkodeDeltagendeField;
      orgnrDeltagendeField = builder.orgnrDeltagendeField;
      navnDeltagendeField = builder.navnDeltagendeField;
      eierandelDeltagendeField = builder.eierandelDeltagendeField;
  }

      /**
      * Get orgnrOversteMorField
      * @return orgnrOversteMorField
      **/
      public Integer getOrgnrOversteMorField() {return orgnrOversteMorField;}

      /**
      * Get orgnrNaermesteMorField
      * @return orgnrNaermesteMorField
      **/
      public Integer getOrgnrNaermesteMorField() {return orgnrNaermesteMorField;}

      /**
      * Get lopenrField
      * @return lopenrField
      **/
      public Integer getLopenrField() {return lopenrField;}

      /**
      * Get nivaDeltagendeField
      * @return nivaDeltagendeField
      **/
      public Integer getNivaDeltagendeField() {return nivaDeltagendeField;}

      /**
      * Get landkodeDeltagendeField
      * @return landkodeDeltagendeField
      **/
      public String getLandkodeDeltagendeField() {return landkodeDeltagendeField;}

      /**
      * Get orgnrDeltagendeField
      * @return orgnrDeltagendeField
      **/
      public Integer getOrgnrDeltagendeField() {return orgnrDeltagendeField;}

      /**
      * Get navnDeltagendeField
      * @return navnDeltagendeField
      **/
      public String getNavnDeltagendeField() {return navnDeltagendeField;}

      /**
      * Get eierandelDeltagendeField
      * @return eierandelDeltagendeField
      **/
      public Double getEierandelDeltagendeField() {return eierandelDeltagendeField;}


  public static final class Builder {
      private Integer orgnrOversteMorField;
      private Integer orgnrNaermesteMorField;
      private Integer lopenrField;
      private Integer nivaDeltagendeField;
      private String landkodeDeltagendeField;
      private Integer orgnrDeltagendeField;
      private String navnDeltagendeField;
      private Double eierandelDeltagendeField;

    public Builder() {
    }

    public Builder(KonsernLink copy) {
        this.orgnrOversteMorField = copy.getOrgnrOversteMorField();
        this.orgnrNaermesteMorField = copy.getOrgnrNaermesteMorField();
        this.lopenrField = copy.getLopenrField();
        this.nivaDeltagendeField = copy.getNivaDeltagendeField();
        this.landkodeDeltagendeField = copy.getLandkodeDeltagendeField();
        this.orgnrDeltagendeField = copy.getOrgnrDeltagendeField();
        this.navnDeltagendeField = copy.getNavnDeltagendeField();
        this.eierandelDeltagendeField = copy.getEierandelDeltagendeField();
    }

    public Builder withOrgnrOversteMorField(Integer orgnrOversteMorField) {
      this.orgnrOversteMorField = orgnrOversteMorField;
      return this;
    }

    public Builder withOrgnrNaermesteMorField(Integer orgnrNaermesteMorField) {
      this.orgnrNaermesteMorField = orgnrNaermesteMorField;
      return this;
    }

    public Builder withLopenrField(Integer lopenrField) {
      this.lopenrField = lopenrField;
      return this;
    }

    public Builder withNivaDeltagendeField(Integer nivaDeltagendeField) {
      this.nivaDeltagendeField = nivaDeltagendeField;
      return this;
    }

    public Builder withLandkodeDeltagendeField(String landkodeDeltagendeField) {
      this.landkodeDeltagendeField = landkodeDeltagendeField;
      return this;
    }

    public Builder withOrgnrDeltagendeField(Integer orgnrDeltagendeField) {
      this.orgnrDeltagendeField = orgnrDeltagendeField;
      return this;
    }

    public Builder withNavnDeltagendeField(String navnDeltagendeField) {
      this.navnDeltagendeField = navnDeltagendeField;
      return this;
    }

    public Builder withEierandelDeltagendeField(Double eierandelDeltagendeField) {
      this.eierandelDeltagendeField = eierandelDeltagendeField;
      return this;
    }


    public KonsernLink build() { return new KonsernLink(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KonsernLink konsernLink = (KonsernLink) o;
    return Objects.equals(this.orgnrOversteMorField, konsernLink.orgnrOversteMorField) &&
        Objects.equals(this.orgnrNaermesteMorField, konsernLink.orgnrNaermesteMorField) &&
        Objects.equals(this.lopenrField, konsernLink.lopenrField) &&
        Objects.equals(this.nivaDeltagendeField, konsernLink.nivaDeltagendeField) &&
        Objects.equals(this.landkodeDeltagendeField, konsernLink.landkodeDeltagendeField) &&
        Objects.equals(this.orgnrDeltagendeField, konsernLink.orgnrDeltagendeField) &&
        Objects.equals(this.navnDeltagendeField, konsernLink.navnDeltagendeField) &&
        Objects.equals(this.eierandelDeltagendeField, konsernLink.eierandelDeltagendeField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgnrOversteMorField, orgnrNaermesteMorField, lopenrField, nivaDeltagendeField, landkodeDeltagendeField, orgnrDeltagendeField, navnDeltagendeField, eierandelDeltagendeField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KonsernLink {\n");
    
    sb.append("    orgnrOversteMorField: ").append(toIndentedString(orgnrOversteMorField)).append("\n");
    sb.append("    orgnrNaermesteMorField: ").append(toIndentedString(orgnrNaermesteMorField)).append("\n");
    sb.append("    lopenrField: ").append(toIndentedString(lopenrField)).append("\n");
    sb.append("    nivaDeltagendeField: ").append(toIndentedString(nivaDeltagendeField)).append("\n");
    sb.append("    landkodeDeltagendeField: ").append(toIndentedString(landkodeDeltagendeField)).append("\n");
    sb.append("    orgnrDeltagendeField: ").append(toIndentedString(orgnrDeltagendeField)).append("\n");
    sb.append("    navnDeltagendeField: ").append(toIndentedString(navnDeltagendeField)).append("\n");
    sb.append("    eierandelDeltagendeField: ").append(toIndentedString(eierandelDeltagendeField)).append("\n");
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
