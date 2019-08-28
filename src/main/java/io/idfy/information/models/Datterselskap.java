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
 * Datterselskap
 */
@JsonDeserialize(builder = Datterselskap.Builder.class)
public class Datterselskap  implements Serializable {
  private final Long orgnrField;  // Default value is: null

  private final String kodeTypeField;  // Default value is: null

  private final String kodeTekstField;  // Default value is: null

  private final String navnField;  // Default value is: null

  private final Integer postnrField;  // Default value is: null

  private final String poststedField;  // Default value is: null

  private final Double eierandelField;  // Default value is: null

  private Datterselskap(Builder builder) {
      orgnrField = builder.orgnrField;
      kodeTypeField = builder.kodeTypeField;
      kodeTekstField = builder.kodeTekstField;
      navnField = builder.navnField;
      postnrField = builder.postnrField;
      poststedField = builder.poststedField;
      eierandelField = builder.eierandelField;
  }

      /**
      * Get orgnrField
      * @return orgnrField
      **/
      public Long getOrgnrField() {return orgnrField;}

      /**
      * Get kodeTypeField
      * @return kodeTypeField
      **/
      public String getKodeTypeField() {return kodeTypeField;}

      /**
      * Get kodeTekstField
      * @return kodeTekstField
      **/
      public String getKodeTekstField() {return kodeTekstField;}

      /**
      * Get navnField
      * @return navnField
      **/
      public String getNavnField() {return navnField;}

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
      * Get eierandelField
      * @return eierandelField
      **/
      public Double getEierandelField() {return eierandelField;}


  public static final class Builder {
      private Long orgnrField;
      private String kodeTypeField;
      private String kodeTekstField;
      private String navnField;
      private Integer postnrField;
      private String poststedField;
      private Double eierandelField;

    public Builder() {
    }

    public Builder(Datterselskap copy) {
        this.orgnrField = copy.getOrgnrField();
        this.kodeTypeField = copy.getKodeTypeField();
        this.kodeTekstField = copy.getKodeTekstField();
        this.navnField = copy.getNavnField();
        this.postnrField = copy.getPostnrField();
        this.poststedField = copy.getPoststedField();
        this.eierandelField = copy.getEierandelField();
    }

    public Builder withOrgnrField(Long orgnrField) {
      this.orgnrField = orgnrField;
      return this;
    }

    public Builder withKodeTypeField(String kodeTypeField) {
      this.kodeTypeField = kodeTypeField;
      return this;
    }

    public Builder withKodeTekstField(String kodeTekstField) {
      this.kodeTekstField = kodeTekstField;
      return this;
    }

    public Builder withNavnField(String navnField) {
      this.navnField = navnField;
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

    public Builder withEierandelField(Double eierandelField) {
      this.eierandelField = eierandelField;
      return this;
    }


    public Datterselskap build() { return new Datterselskap(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datterselskap datterselskap = (Datterselskap) o;
    return Objects.equals(this.orgnrField, datterselskap.orgnrField) &&
        Objects.equals(this.kodeTypeField, datterselskap.kodeTypeField) &&
        Objects.equals(this.kodeTekstField, datterselskap.kodeTekstField) &&
        Objects.equals(this.navnField, datterselskap.navnField) &&
        Objects.equals(this.postnrField, datterselskap.postnrField) &&
        Objects.equals(this.poststedField, datterselskap.poststedField) &&
        Objects.equals(this.eierandelField, datterselskap.eierandelField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgnrField, kodeTypeField, kodeTekstField, navnField, postnrField, poststedField, eierandelField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datterselskap {\n");
    
    sb.append("    orgnrField: ").append(toIndentedString(orgnrField)).append("\n");
    sb.append("    kodeTypeField: ").append(toIndentedString(kodeTypeField)).append("\n");
    sb.append("    kodeTekstField: ").append(toIndentedString(kodeTekstField)).append("\n");
    sb.append("    navnField: ").append(toIndentedString(navnField)).append("\n");
    sb.append("    postnrField: ").append(toIndentedString(postnrField)).append("\n");
    sb.append("    poststedField: ").append(toIndentedString(poststedField)).append("\n");
    sb.append("    eierandelField: ").append(toIndentedString(eierandelField)).append("\n");
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
