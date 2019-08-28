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
 * Rettighetshavere
 */
@JsonDeserialize(builder = Rettighetshavere.Builder.class)
public class Rettighetshavere  implements Serializable {
  private final Long internreferanseField;  // Default value is: null

  private final OffsetDateTime fodtDatoField;  // Default value is: null

  private final Boolean fodtDatoFieldSpecified;  // Default value is: null

  private final String navnField;  // Default value is: null

  private final String adresseField;  // Default value is: null

  private final Integer postnrField;  // Default value is: null

  private final String poststedField;  // Default value is: null

  private final Double andelField;  // Default value is: null

  private final Boolean indirekteEierField;  // Default value is: null

  private Rettighetshavere(Builder builder) {
      internreferanseField = builder.internreferanseField;
      fodtDatoField = builder.fodtDatoField;
      fodtDatoFieldSpecified = builder.fodtDatoFieldSpecified;
      navnField = builder.navnField;
      adresseField = builder.adresseField;
      postnrField = builder.postnrField;
      poststedField = builder.poststedField;
      andelField = builder.andelField;
      indirekteEierField = builder.indirekteEierField;
  }

      /**
      * Get internreferanseField
      * @return internreferanseField
      **/
      public Long getInternreferanseField() {return internreferanseField;}

      /**
      * Get fodtDatoField
      * @return fodtDatoField
      **/
      public OffsetDateTime getFodtDatoField() {return fodtDatoField;}

      /**
      * Get fodtDatoFieldSpecified
      * @return fodtDatoFieldSpecified
      **/
      public Boolean getFodtDatoFieldSpecified() {return fodtDatoFieldSpecified;}

      /**
      * Get navnField
      * @return navnField
      **/
      public String getNavnField() {return navnField;}

      /**
      * Get adresseField
      * @return adresseField
      **/
      public String getAdresseField() {return adresseField;}

      /**
      * Get postnrField
      * @return postnrField
      **/
      public Integer getPostnrField() {return postnrField;}

      /**
      * Get poststedField
      * @return poststedField
      **/
      public String getPoststedField() {return poststedField;}

      /**
      * Get andelField
      * @return andelField
      **/
      public Double getAndelField() {return andelField;}

      /**
      * Get indirekteEierField
      * @return indirekteEierField
      **/
      public Boolean getIndirekteEierField() {return indirekteEierField;}


  public static final class Builder {
      private Long internreferanseField;
      private OffsetDateTime fodtDatoField;
      private Boolean fodtDatoFieldSpecified;
      private String navnField;
      private String adresseField;
      private Integer postnrField;
      private String poststedField;
      private Double andelField;
      private Boolean indirekteEierField;

    public Builder() {
    }

    public Builder(Rettighetshavere copy) {
        this.internreferanseField = copy.getInternreferanseField();
        this.fodtDatoField = copy.getFodtDatoField();
        this.fodtDatoFieldSpecified = copy.getFodtDatoFieldSpecified();
        this.navnField = copy.getNavnField();
        this.adresseField = copy.getAdresseField();
        this.postnrField = copy.getPostnrField();
        this.poststedField = copy.getPoststedField();
        this.andelField = copy.getAndelField();
        this.indirekteEierField = copy.getIndirekteEierField();
    }

    public Builder withInternreferanseField(Long internreferanseField) {
      this.internreferanseField = internreferanseField;
      return this;
    }

    public Builder withFodtDatoField(OffsetDateTime fodtDatoField) {
      this.fodtDatoField = fodtDatoField;
      return this;
    }

    public Builder withFodtDatoFieldSpecified(Boolean fodtDatoFieldSpecified) {
      this.fodtDatoFieldSpecified = fodtDatoFieldSpecified;
      return this;
    }

    public Builder withNavnField(String navnField) {
      this.navnField = navnField;
      return this;
    }

    public Builder withAdresseField(String adresseField) {
      this.adresseField = adresseField;
      return this;
    }

    public Builder withPostnrField(Integer postnrField) {
      this.postnrField = postnrField;
      return this;
    }

    public Builder withPoststedField(String poststedField) {
      this.poststedField = poststedField;
      return this;
    }

    public Builder withAndelField(Double andelField) {
      this.andelField = andelField;
      return this;
    }

    public Builder withIndirekteEierField(Boolean indirekteEierField) {
      this.indirekteEierField = indirekteEierField;
      return this;
    }


    public Rettighetshavere build() { return new Rettighetshavere(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rettighetshavere rettighetshavere = (Rettighetshavere) o;
    return Objects.equals(this.internreferanseField, rettighetshavere.internreferanseField) &&
        Objects.equals(this.fodtDatoField, rettighetshavere.fodtDatoField) &&
        Objects.equals(this.fodtDatoFieldSpecified, rettighetshavere.fodtDatoFieldSpecified) &&
        Objects.equals(this.navnField, rettighetshavere.navnField) &&
        Objects.equals(this.adresseField, rettighetshavere.adresseField) &&
        Objects.equals(this.postnrField, rettighetshavere.postnrField) &&
        Objects.equals(this.poststedField, rettighetshavere.poststedField) &&
        Objects.equals(this.andelField, rettighetshavere.andelField) &&
        Objects.equals(this.indirekteEierField, rettighetshavere.indirekteEierField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internreferanseField, fodtDatoField, fodtDatoFieldSpecified, navnField, adresseField, postnrField, poststedField, andelField, indirekteEierField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rettighetshavere {\n");
    
    sb.append("    internreferanseField: ").append(toIndentedString(internreferanseField)).append("\n");
    sb.append("    fodtDatoField: ").append(toIndentedString(fodtDatoField)).append("\n");
    sb.append("    fodtDatoFieldSpecified: ").append(toIndentedString(fodtDatoFieldSpecified)).append("\n");
    sb.append("    navnField: ").append(toIndentedString(navnField)).append("\n");
    sb.append("    adresseField: ").append(toIndentedString(adresseField)).append("\n");
    sb.append("    postnrField: ").append(toIndentedString(postnrField)).append("\n");
    sb.append("    poststedField: ").append(toIndentedString(poststedField)).append("\n");
    sb.append("    andelField: ").append(toIndentedString(andelField)).append("\n");
    sb.append("    indirekteEierField: ").append(toIndentedString(indirekteEierField)).append("\n");
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
