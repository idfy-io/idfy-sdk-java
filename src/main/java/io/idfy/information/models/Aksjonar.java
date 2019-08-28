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
 * Aksjonar
 */
@JsonDeserialize(builder = Aksjonar.Builder.class)
public class Aksjonar  implements Serializable {
  private final Integer orgnrField;  // Default value is: null

  private final Long internRefField;  // Default value is: null

  private final OffsetDateTime fodtDatoField;  // Default value is: null

  private final String navnField;  // Default value is: null

  private final Integer postnrField;  // Default value is: null

  private final String poststedField;  // Default value is: null

  private final Double eierandelField;  // Default value is: null

  private Aksjonar(Builder builder) {
      orgnrField = builder.orgnrField;
      internRefField = builder.internRefField;
      fodtDatoField = builder.fodtDatoField;
      navnField = builder.navnField;
      postnrField = builder.postnrField;
      poststedField = builder.poststedField;
      eierandelField = builder.eierandelField;
  }

      /**
      * Get orgnrField
      * @return orgnrField
      **/
      public Integer getOrgnrField() {return orgnrField;}

      /**
      * Get internRefField
      * @return internRefField
      **/
      public Long getInternRefField() {return internRefField;}

      /**
      * Get fodtDatoField
      * @return fodtDatoField
      **/
      public OffsetDateTime getFodtDatoField() {return fodtDatoField;}

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
      private Integer orgnrField;
      private Long internRefField;
      private OffsetDateTime fodtDatoField;
      private String navnField;
      private Integer postnrField;
      private String poststedField;
      private Double eierandelField;

    public Builder() {
    }

    public Builder(Aksjonar copy) {
        this.orgnrField = copy.getOrgnrField();
        this.internRefField = copy.getInternRefField();
        this.fodtDatoField = copy.getFodtDatoField();
        this.navnField = copy.getNavnField();
        this.postnrField = copy.getPostnrField();
        this.poststedField = copy.getPoststedField();
        this.eierandelField = copy.getEierandelField();
    }

    public Builder withOrgnrField(Integer orgnrField) {
      this.orgnrField = orgnrField;
      return this;
    }

    public Builder withInternRefField(Long internRefField) {
      this.internRefField = internRefField;
      return this;
    }

    public Builder withFodtDatoField(OffsetDateTime fodtDatoField) {
      this.fodtDatoField = fodtDatoField;
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


    public Aksjonar build() { return new Aksjonar(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aksjonar aksjonar = (Aksjonar) o;
    return Objects.equals(this.orgnrField, aksjonar.orgnrField) &&
        Objects.equals(this.internRefField, aksjonar.internRefField) &&
        Objects.equals(this.fodtDatoField, aksjonar.fodtDatoField) &&
        Objects.equals(this.navnField, aksjonar.navnField) &&
        Objects.equals(this.postnrField, aksjonar.postnrField) &&
        Objects.equals(this.poststedField, aksjonar.poststedField) &&
        Objects.equals(this.eierandelField, aksjonar.eierandelField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgnrField, internRefField, fodtDatoField, navnField, postnrField, poststedField, eierandelField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aksjonar {\n");
    
    sb.append("    orgnrField: ").append(toIndentedString(orgnrField)).append("\n");
    sb.append("    internRefField: ").append(toIndentedString(internRefField)).append("\n");
    sb.append("    fodtDatoField: ").append(toIndentedString(fodtDatoField)).append("\n");
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
