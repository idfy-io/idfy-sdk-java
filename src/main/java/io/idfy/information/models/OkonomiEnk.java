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
 * OkonomiEnk
 */
@JsonDeserialize(builder = OkonomiEnk.Builder.class)
public class OkonomiEnk  implements Serializable {
  private final OffsetDateTime fodselsdatoEierField;  // Default value is: null

  private final Integer skatteArField;  // Default value is: null

  private final Long formueField;  // Default value is: null

  private final Double endringFormueField;  // Default value is: null

  private final Long inntektField;  // Default value is: null

  private final Double endringInntektField;  // Default value is: null

  private final Long skattField;  // Default value is: null

  private final String skatteKlasseField;  // Default value is: null

  private final String skatteKlasseUtlField;  // Default value is: null

  private final Integer kommunenrField;  // Default value is: null

  private final String kommuneNavnField;  // Default value is: null

  private OkonomiEnk(Builder builder) {
      fodselsdatoEierField = builder.fodselsdatoEierField;
      skatteArField = builder.skatteArField;
      formueField = builder.formueField;
      endringFormueField = builder.endringFormueField;
      inntektField = builder.inntektField;
      endringInntektField = builder.endringInntektField;
      skattField = builder.skattField;
      skatteKlasseField = builder.skatteKlasseField;
      skatteKlasseUtlField = builder.skatteKlasseUtlField;
      kommunenrField = builder.kommunenrField;
      kommuneNavnField = builder.kommuneNavnField;
  }

      /**
      * Get fodselsdatoEierField
      * @return fodselsdatoEierField
      **/
      public OffsetDateTime getFodselsdatoEierField() {return fodselsdatoEierField;}

      /**
      * Get skatteArField
      * @return skatteArField
      **/
      public Integer getSkatteArField() {return skatteArField;}

      /**
      * Get formueField
      * @return formueField
      **/
      public Long getFormueField() {return formueField;}

      /**
      * Get endringFormueField
      * @return endringFormueField
      **/
      public Double getEndringFormueField() {return endringFormueField;}

      /**
      * Get inntektField
      * @return inntektField
      **/
      public Long getInntektField() {return inntektField;}

      /**
      * Get endringInntektField
      * @return endringInntektField
      **/
      public Double getEndringInntektField() {return endringInntektField;}

      /**
      * Get skattField
      * @return skattField
      **/
      public Long getSkattField() {return skattField;}

      /**
      * Get skatteKlasseField
      * @return skatteKlasseField
      **/
      public String getSkatteKlasseField() {return skatteKlasseField;}

      /**
      * Get skatteKlasseUtlField
      * @return skatteKlasseUtlField
      **/
      public String getSkatteKlasseUtlField() {return skatteKlasseUtlField;}

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


  public static final class Builder {
      private OffsetDateTime fodselsdatoEierField;
      private Integer skatteArField;
      private Long formueField;
      private Double endringFormueField;
      private Long inntektField;
      private Double endringInntektField;
      private Long skattField;
      private String skatteKlasseField;
      private String skatteKlasseUtlField;
      private Integer kommunenrField;
      private String kommuneNavnField;

    public Builder() {
    }

    public Builder(OkonomiEnk copy) {
        this.fodselsdatoEierField = copy.getFodselsdatoEierField();
        this.skatteArField = copy.getSkatteArField();
        this.formueField = copy.getFormueField();
        this.endringFormueField = copy.getEndringFormueField();
        this.inntektField = copy.getInntektField();
        this.endringInntektField = copy.getEndringInntektField();
        this.skattField = copy.getSkattField();
        this.skatteKlasseField = copy.getSkatteKlasseField();
        this.skatteKlasseUtlField = copy.getSkatteKlasseUtlField();
        this.kommunenrField = copy.getKommunenrField();
        this.kommuneNavnField = copy.getKommuneNavnField();
    }

    public Builder withFodselsdatoEierField(OffsetDateTime fodselsdatoEierField) {
      this.fodselsdatoEierField = fodselsdatoEierField;
      return this;
    }

    public Builder withSkatteArField(Integer skatteArField) {
      this.skatteArField = skatteArField;
      return this;
    }

    public Builder withFormueField(Long formueField) {
      this.formueField = formueField;
      return this;
    }

    public Builder withEndringFormueField(Double endringFormueField) {
      this.endringFormueField = endringFormueField;
      return this;
    }

    public Builder withInntektField(Long inntektField) {
      this.inntektField = inntektField;
      return this;
    }

    public Builder withEndringInntektField(Double endringInntektField) {
      this.endringInntektField = endringInntektField;
      return this;
    }

    public Builder withSkattField(Long skattField) {
      this.skattField = skattField;
      return this;
    }

    public Builder withSkatteKlasseField(String skatteKlasseField) {
      this.skatteKlasseField = skatteKlasseField;
      return this;
    }

    public Builder withSkatteKlasseUtlField(String skatteKlasseUtlField) {
      this.skatteKlasseUtlField = skatteKlasseUtlField;
      return this;
    }

    public Builder withKommunenrField(Integer kommunenrField) {
      this.kommunenrField = kommunenrField;
      return this;
    }

    public Builder withKommuneNavnField(String kommuneNavnField) {
      this.kommuneNavnField = kommuneNavnField;
      return this;
    }


    public OkonomiEnk build() { return new OkonomiEnk(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OkonomiEnk okonomiEnk = (OkonomiEnk) o;
    return Objects.equals(this.fodselsdatoEierField, okonomiEnk.fodselsdatoEierField) &&
        Objects.equals(this.skatteArField, okonomiEnk.skatteArField) &&
        Objects.equals(this.formueField, okonomiEnk.formueField) &&
        Objects.equals(this.endringFormueField, okonomiEnk.endringFormueField) &&
        Objects.equals(this.inntektField, okonomiEnk.inntektField) &&
        Objects.equals(this.endringInntektField, okonomiEnk.endringInntektField) &&
        Objects.equals(this.skattField, okonomiEnk.skattField) &&
        Objects.equals(this.skatteKlasseField, okonomiEnk.skatteKlasseField) &&
        Objects.equals(this.skatteKlasseUtlField, okonomiEnk.skatteKlasseUtlField) &&
        Objects.equals(this.kommunenrField, okonomiEnk.kommunenrField) &&
        Objects.equals(this.kommuneNavnField, okonomiEnk.kommuneNavnField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fodselsdatoEierField, skatteArField, formueField, endringFormueField, inntektField, endringInntektField, skattField, skatteKlasseField, skatteKlasseUtlField, kommunenrField, kommuneNavnField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OkonomiEnk {\n");
    
    sb.append("    fodselsdatoEierField: ").append(toIndentedString(fodselsdatoEierField)).append("\n");
    sb.append("    skatteArField: ").append(toIndentedString(skatteArField)).append("\n");
    sb.append("    formueField: ").append(toIndentedString(formueField)).append("\n");
    sb.append("    endringFormueField: ").append(toIndentedString(endringFormueField)).append("\n");
    sb.append("    inntektField: ").append(toIndentedString(inntektField)).append("\n");
    sb.append("    endringInntektField: ").append(toIndentedString(endringInntektField)).append("\n");
    sb.append("    skattField: ").append(toIndentedString(skattField)).append("\n");
    sb.append("    skatteKlasseField: ").append(toIndentedString(skatteKlasseField)).append("\n");
    sb.append("    skatteKlasseUtlField: ").append(toIndentedString(skatteKlasseUtlField)).append("\n");
    sb.append("    kommunenrField: ").append(toIndentedString(kommunenrField)).append("\n");
    sb.append("    kommuneNavnField: ").append(toIndentedString(kommuneNavnField)).append("\n");
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
