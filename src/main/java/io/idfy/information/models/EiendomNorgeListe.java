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
 * EiendomNorgeListe
 */
@JsonDeserialize(builder = EiendomNorgeListe.Builder.class)
public class EiendomNorgeListe  implements Serializable {
  private final Integer kommunenrField;  // Default value is: null

  private final String kommuneNavnField;  // Default value is: null

  private final Integer gardnrField;  // Default value is: null

  private final Integer bruksnrField;  // Default value is: null

  private final Integer festenrField;  // Default value is: null

  private final Integer seksjonsnrField;  // Default value is: null

  private final String typeField;  // Default value is: null

  private final String andelField;  // Default value is: null

  private EiendomNorgeListe(Builder builder) {
      kommunenrField = builder.kommunenrField;
      kommuneNavnField = builder.kommuneNavnField;
      gardnrField = builder.gardnrField;
      bruksnrField = builder.bruksnrField;
      festenrField = builder.festenrField;
      seksjonsnrField = builder.seksjonsnrField;
      typeField = builder.typeField;
      andelField = builder.andelField;
  }

      /**
      * Get kommunenrField
      * @return kommunenrField
      **/
      public Integer getKommunenrField() {return kommunenrField;}

      /**
      * Get kommuneNavnField
      * @return kommuneNavnField
      **/
      public String getKommuneNavnField() {return kommuneNavnField;}

      /**
      * Get gardnrField
      * @return gardnrField
      **/
      public Integer getGardnrField() {return gardnrField;}

      /**
      * Get bruksnrField
      * @return bruksnrField
      **/
      public Integer getBruksnrField() {return bruksnrField;}

      /**
      * Get festenrField
      * @return festenrField
      **/
      public Integer getFestenrField() {return festenrField;}

      /**
      * Get seksjonsnrField
      * @return seksjonsnrField
      **/
      public Integer getSeksjonsnrField() {return seksjonsnrField;}

      /**
      * Get typeField
      * @return typeField
      **/
      public String getTypeField() {return typeField;}

      /**
      * Get andelField
      * @return andelField
      **/
      public String getAndelField() {return andelField;}


  public static final class Builder {
      private Integer kommunenrField;
      private String kommuneNavnField;
      private Integer gardnrField;
      private Integer bruksnrField;
      private Integer festenrField;
      private Integer seksjonsnrField;
      private String typeField;
      private String andelField;

    public Builder() {
    }

    public Builder(EiendomNorgeListe copy) {
        this.kommunenrField = copy.getKommunenrField();
        this.kommuneNavnField = copy.getKommuneNavnField();
        this.gardnrField = copy.getGardnrField();
        this.bruksnrField = copy.getBruksnrField();
        this.festenrField = copy.getFestenrField();
        this.seksjonsnrField = copy.getSeksjonsnrField();
        this.typeField = copy.getTypeField();
        this.andelField = copy.getAndelField();
    }

    public Builder withKommunenrField(Integer kommunenrField) {
      this.kommunenrField = kommunenrField;
      return this;
    }

    public Builder withKommuneNavnField(String kommuneNavnField) {
      this.kommuneNavnField = kommuneNavnField;
      return this;
    }

    public Builder withGardnrField(Integer gardnrField) {
      this.gardnrField = gardnrField;
      return this;
    }

    public Builder withBruksnrField(Integer bruksnrField) {
      this.bruksnrField = bruksnrField;
      return this;
    }

    public Builder withFestenrField(Integer festenrField) {
      this.festenrField = festenrField;
      return this;
    }

    public Builder withSeksjonsnrField(Integer seksjonsnrField) {
      this.seksjonsnrField = seksjonsnrField;
      return this;
    }

    public Builder withTypeField(String typeField) {
      this.typeField = typeField;
      return this;
    }

    public Builder withAndelField(String andelField) {
      this.andelField = andelField;
      return this;
    }


    public EiendomNorgeListe build() { return new EiendomNorgeListe(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EiendomNorgeListe eiendomNorgeListe = (EiendomNorgeListe) o;
    return Objects.equals(this.kommunenrField, eiendomNorgeListe.kommunenrField) &&
        Objects.equals(this.kommuneNavnField, eiendomNorgeListe.kommuneNavnField) &&
        Objects.equals(this.gardnrField, eiendomNorgeListe.gardnrField) &&
        Objects.equals(this.bruksnrField, eiendomNorgeListe.bruksnrField) &&
        Objects.equals(this.festenrField, eiendomNorgeListe.festenrField) &&
        Objects.equals(this.seksjonsnrField, eiendomNorgeListe.seksjonsnrField) &&
        Objects.equals(this.typeField, eiendomNorgeListe.typeField) &&
        Objects.equals(this.andelField, eiendomNorgeListe.andelField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kommunenrField, kommuneNavnField, gardnrField, bruksnrField, festenrField, seksjonsnrField, typeField, andelField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EiendomNorgeListe {\n");
    
    sb.append("    kommunenrField: ").append(toIndentedString(kommunenrField)).append("\n");
    sb.append("    kommuneNavnField: ").append(toIndentedString(kommuneNavnField)).append("\n");
    sb.append("    gardnrField: ").append(toIndentedString(gardnrField)).append("\n");
    sb.append("    bruksnrField: ").append(toIndentedString(bruksnrField)).append("\n");
    sb.append("    festenrField: ").append(toIndentedString(festenrField)).append("\n");
    sb.append("    seksjonsnrField: ").append(toIndentedString(seksjonsnrField)).append("\n");
    sb.append("    typeField: ").append(toIndentedString(typeField)).append("\n");
    sb.append("    andelField: ").append(toIndentedString(andelField)).append("\n");
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
