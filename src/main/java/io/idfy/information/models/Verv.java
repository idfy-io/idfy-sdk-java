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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Verv
 */
@JsonDeserialize(builder = Verv.Builder.class)
public class Verv  implements Serializable {
  private final Long internRefField;  // Default value is: null

  private final OffsetDateTime fodtDatoField;  // Default value is: null

  private final Boolean fodtDatoFieldSpecified;  // Default value is: null

  private final String navnField;  // Default value is: null

  private final List<String> telefonField;  // Default value is: new ArrayList<>()

  private final Integer postnrField;  // Default value is: null

  private final String poststedField;  // Default value is: null

  private final String vervKodeField;  // Default value is: null

  private final String vervTekstField;  // Default value is: null

  private Verv(Builder builder) {
      internRefField = builder.internRefField;
      fodtDatoField = builder.fodtDatoField;
      fodtDatoFieldSpecified = builder.fodtDatoFieldSpecified;
      navnField = builder.navnField;
      telefonField = builder.telefonField;
      postnrField = builder.postnrField;
      poststedField = builder.poststedField;
      vervKodeField = builder.vervKodeField;
      vervTekstField = builder.vervTekstField;
  }

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
      * Get telefonField
      * @return telefonField
      **/
      public List<String> getTelefonField() {return telefonField;}

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
      * Get vervKodeField
      * @return vervKodeField
      **/
      public String getVervKodeField() {return vervKodeField;}

      /**
      * Get vervTekstField
      * @return vervTekstField
      **/
      public String getVervTekstField() {return vervTekstField;}


  public static final class Builder {
      private Long internRefField;
      private OffsetDateTime fodtDatoField;
      private Boolean fodtDatoFieldSpecified;
      private String navnField;
      private List<String> telefonField;
      private Integer postnrField;
      private String poststedField;
      private String vervKodeField;
      private String vervTekstField;

    public Builder() {
    }

    public Builder(Verv copy) {
        this.internRefField = copy.getInternRefField();
        this.fodtDatoField = copy.getFodtDatoField();
        this.fodtDatoFieldSpecified = copy.getFodtDatoFieldSpecified();
        this.navnField = copy.getNavnField();
        this.telefonField = copy.getTelefonField();
        this.postnrField = copy.getPostnrField();
        this.poststedField = copy.getPoststedField();
        this.vervKodeField = copy.getVervKodeField();
        this.vervTekstField = copy.getVervTekstField();
    }

    public Builder withInternRefField(Long internRefField) {
      this.internRefField = internRefField;
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

    public Builder withTelefonField(List<String> telefonField) {
      this.telefonField = telefonField;
      return this;
    }

    public Builder addTelefonFieldItem(String telefonFieldItem) {
      if (this.telefonField == null) {
        this.telefonField = new ArrayList<>();
      }
      this.telefonField.add(telefonFieldItem);
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

    public Builder withVervKodeField(String vervKodeField) {
      this.vervKodeField = vervKodeField;
      return this;
    }

    public Builder withVervTekstField(String vervTekstField) {
      this.vervTekstField = vervTekstField;
      return this;
    }


    public Verv build() { return new Verv(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Verv verv = (Verv) o;
    return Objects.equals(this.internRefField, verv.internRefField) &&
        Objects.equals(this.fodtDatoField, verv.fodtDatoField) &&
        Objects.equals(this.fodtDatoFieldSpecified, verv.fodtDatoFieldSpecified) &&
        Objects.equals(this.navnField, verv.navnField) &&
        Objects.equals(this.telefonField, verv.telefonField) &&
        Objects.equals(this.postnrField, verv.postnrField) &&
        Objects.equals(this.poststedField, verv.poststedField) &&
        Objects.equals(this.vervKodeField, verv.vervKodeField) &&
        Objects.equals(this.vervTekstField, verv.vervTekstField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internRefField, fodtDatoField, fodtDatoFieldSpecified, navnField, telefonField, postnrField, poststedField, vervKodeField, vervTekstField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verv {\n");
    
    sb.append("    internRefField: ").append(toIndentedString(internRefField)).append("\n");
    sb.append("    fodtDatoField: ").append(toIndentedString(fodtDatoField)).append("\n");
    sb.append("    fodtDatoFieldSpecified: ").append(toIndentedString(fodtDatoFieldSpecified)).append("\n");
    sb.append("    navnField: ").append(toIndentedString(navnField)).append("\n");
    sb.append("    telefonField: ").append(toIndentedString(telefonField)).append("\n");
    sb.append("    postnrField: ").append(toIndentedString(postnrField)).append("\n");
    sb.append("    poststedField: ").append(toIndentedString(poststedField)).append("\n");
    sb.append("    vervKodeField: ").append(toIndentedString(vervKodeField)).append("\n");
    sb.append("    vervTekstField: ").append(toIndentedString(vervTekstField)).append("\n");
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
