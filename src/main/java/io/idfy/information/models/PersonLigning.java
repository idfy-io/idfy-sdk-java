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
 * PersonLigning
 */
@JsonDeserialize(builder = PersonLigning.Builder.class)
public class PersonLigning  implements Serializable {
  private final Integer skatteArField;  // Default value is: null

  private final Long formueField;  // Default value is: null

  private final Double endringFormueField;  // Default value is: null

  private final Long inntektField;  // Default value is: null

  private final Double endringInntektField;  // Default value is: null

  private final Long skattField;  // Default value is: null

  private final String skatteKlasseField;  // Default value is: null

  private final String skatteKlasseUtlField;  // Default value is: null

  private final String kommunenrField;  // Default value is: null

  private final String kommuneNavnField;  // Default value is: null

  private final Long bruttoInntektField;  // Default value is: null

  private final Double gjeldsgrad1Field;  // Default value is: null

  private final Double gjeldsgrad2Field;  // Default value is: null

  private PersonLigning(Builder builder) {
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
      bruttoInntektField = builder.bruttoInntektField;
      gjeldsgrad1Field = builder.gjeldsgrad1Field;
      gjeldsgrad2Field = builder.gjeldsgrad2Field;
  }

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
      public String getKommunenrField() {return kommunenrField;}

      /**
      * Get kommuneNavnField
      * @return kommuneNavnField
      **/
      public String getKommuneNavnField() {return kommuneNavnField;}

      /**
      * Get bruttoInntektField
      * @return bruttoInntektField
      **/
      public Long getBruttoInntektField() {return bruttoInntektField;}

      /**
      * Get gjeldsgrad1Field
      * @return gjeldsgrad1Field
      **/
      public Double getGjeldsgrad1Field() {return gjeldsgrad1Field;}

      /**
      * Get gjeldsgrad2Field
      * @return gjeldsgrad2Field
      **/
      public Double getGjeldsgrad2Field() {return gjeldsgrad2Field;}


  public static final class Builder {
      private Integer skatteArField;
      private Long formueField;
      private Double endringFormueField;
      private Long inntektField;
      private Double endringInntektField;
      private Long skattField;
      private String skatteKlasseField;
      private String skatteKlasseUtlField;
      private String kommunenrField;
      private String kommuneNavnField;
      private Long bruttoInntektField;
      private Double gjeldsgrad1Field;
      private Double gjeldsgrad2Field;

    public Builder() {
    }

    public Builder(PersonLigning copy) {
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
        this.bruttoInntektField = copy.getBruttoInntektField();
        this.gjeldsgrad1Field = copy.getGjeldsgrad1Field();
        this.gjeldsgrad2Field = copy.getGjeldsgrad2Field();
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

    public Builder withKommunenrField(String kommunenrField) {
      this.kommunenrField = kommunenrField;
      return this;
    }

    public Builder withKommuneNavnField(String kommuneNavnField) {
      this.kommuneNavnField = kommuneNavnField;
      return this;
    }

    public Builder withBruttoInntektField(Long bruttoInntektField) {
      this.bruttoInntektField = bruttoInntektField;
      return this;
    }

    public Builder withGjeldsgrad1Field(Double gjeldsgrad1Field) {
      this.gjeldsgrad1Field = gjeldsgrad1Field;
      return this;
    }

    public Builder withGjeldsgrad2Field(Double gjeldsgrad2Field) {
      this.gjeldsgrad2Field = gjeldsgrad2Field;
      return this;
    }


    public PersonLigning build() { return new PersonLigning(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonLigning personLigning = (PersonLigning) o;
    return Objects.equals(this.skatteArField, personLigning.skatteArField) &&
        Objects.equals(this.formueField, personLigning.formueField) &&
        Objects.equals(this.endringFormueField, personLigning.endringFormueField) &&
        Objects.equals(this.inntektField, personLigning.inntektField) &&
        Objects.equals(this.endringInntektField, personLigning.endringInntektField) &&
        Objects.equals(this.skattField, personLigning.skattField) &&
        Objects.equals(this.skatteKlasseField, personLigning.skatteKlasseField) &&
        Objects.equals(this.skatteKlasseUtlField, personLigning.skatteKlasseUtlField) &&
        Objects.equals(this.kommunenrField, personLigning.kommunenrField) &&
        Objects.equals(this.kommuneNavnField, personLigning.kommuneNavnField) &&
        Objects.equals(this.bruttoInntektField, personLigning.bruttoInntektField) &&
        Objects.equals(this.gjeldsgrad1Field, personLigning.gjeldsgrad1Field) &&
        Objects.equals(this.gjeldsgrad2Field, personLigning.gjeldsgrad2Field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skatteArField, formueField, endringFormueField, inntektField, endringInntektField, skattField, skatteKlasseField, skatteKlasseUtlField, kommunenrField, kommuneNavnField, bruttoInntektField, gjeldsgrad1Field, gjeldsgrad2Field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonLigning {\n");
    
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
    sb.append("    bruttoInntektField: ").append(toIndentedString(bruttoInntektField)).append("\n");
    sb.append("    gjeldsgrad1Field: ").append(toIndentedString(gjeldsgrad1Field)).append("\n");
    sb.append("    gjeldsgrad2Field: ").append(toIndentedString(gjeldsgrad2Field)).append("\n");
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
