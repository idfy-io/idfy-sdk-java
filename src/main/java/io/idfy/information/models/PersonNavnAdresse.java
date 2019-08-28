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
 * PersonNavnAdresse
 */
@JsonDeserialize(builder = PersonNavnAdresse.Builder.class)
public class PersonNavnAdresse  implements Serializable {
  private final String statusField;  // Default value is: null

  private final OffsetDateTime statusDatoField;  // Default value is: null

  private final OffsetDateTime fodselsdatoField;  // Default value is: null

  private final String navnField;  // Default value is: null

  private final String adresseField;  // Default value is: null

  private final String postnrField;  // Default value is: null

  private final String poststedField;  // Default value is: null

  private final String kommuneField;  // Default value is: null

  private final String fylkeField;  // Default value is: null

  private final Integer alderField;  // Default value is: null

  private final String kjonnField;  // Default value is: null

  private final List<String> telefonField;  // Default value is: new ArrayList<>()

  private PersonNavnAdresse(Builder builder) {
      statusField = builder.statusField;
      statusDatoField = builder.statusDatoField;
      fodselsdatoField = builder.fodselsdatoField;
      navnField = builder.navnField;
      adresseField = builder.adresseField;
      postnrField = builder.postnrField;
      poststedField = builder.poststedField;
      kommuneField = builder.kommuneField;
      fylkeField = builder.fylkeField;
      alderField = builder.alderField;
      kjonnField = builder.kjonnField;
      telefonField = builder.telefonField;
  }

      /**
      * Get statusField
      * @return statusField
      **/
      public String getStatusField() {return statusField;}

      /**
      * Get statusDatoField
      * @return statusDatoField
      **/
      public OffsetDateTime getStatusDatoField() {return statusDatoField;}

      /**
      * Get fodselsdatoField
      * @return fodselsdatoField
      **/
      public OffsetDateTime getFodselsdatoField() {return fodselsdatoField;}

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
      public String getPostnrField() {return postnrField;}

      /**
      * Get poststedField
      * @return poststedField
      **/
      public String getPoststedField() {return poststedField;}

      /**
      * Get kommuneField
      * @return kommuneField
      **/
      public String getKommuneField() {return kommuneField;}

      /**
      * Get fylkeField
      * @return fylkeField
      **/
      public String getFylkeField() {return fylkeField;}

      /**
      * Get alderField
      * @return alderField
      **/
      public Integer getAlderField() {return alderField;}

      /**
      * Get kjonnField
      * @return kjonnField
      **/
      public String getKjonnField() {return kjonnField;}

      /**
      * Get telefonField
      * @return telefonField
      **/
      public List<String> getTelefonField() {return telefonField;}


  public static final class Builder {
      private String statusField;
      private OffsetDateTime statusDatoField;
      private OffsetDateTime fodselsdatoField;
      private String navnField;
      private String adresseField;
      private String postnrField;
      private String poststedField;
      private String kommuneField;
      private String fylkeField;
      private Integer alderField;
      private String kjonnField;
      private List<String> telefonField;

    public Builder() {
    }

    public Builder(PersonNavnAdresse copy) {
        this.statusField = copy.getStatusField();
        this.statusDatoField = copy.getStatusDatoField();
        this.fodselsdatoField = copy.getFodselsdatoField();
        this.navnField = copy.getNavnField();
        this.adresseField = copy.getAdresseField();
        this.postnrField = copy.getPostnrField();
        this.poststedField = copy.getPoststedField();
        this.kommuneField = copy.getKommuneField();
        this.fylkeField = copy.getFylkeField();
        this.alderField = copy.getAlderField();
        this.kjonnField = copy.getKjonnField();
        this.telefonField = copy.getTelefonField();
    }

    public Builder withStatusField(String statusField) {
      this.statusField = statusField;
      return this;
    }

    public Builder withStatusDatoField(OffsetDateTime statusDatoField) {
      this.statusDatoField = statusDatoField;
      return this;
    }

    public Builder withFodselsdatoField(OffsetDateTime fodselsdatoField) {
      this.fodselsdatoField = fodselsdatoField;
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

    public Builder withPostnrField(String postnrField) {
      this.postnrField = postnrField;
      return this;
    }

    public Builder withPoststedField(String poststedField) {
      this.poststedField = poststedField;
      return this;
    }

    public Builder withKommuneField(String kommuneField) {
      this.kommuneField = kommuneField;
      return this;
    }

    public Builder withFylkeField(String fylkeField) {
      this.fylkeField = fylkeField;
      return this;
    }

    public Builder withAlderField(Integer alderField) {
      this.alderField = alderField;
      return this;
    }

    public Builder withKjonnField(String kjonnField) {
      this.kjonnField = kjonnField;
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


    public PersonNavnAdresse build() { return new PersonNavnAdresse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonNavnAdresse personNavnAdresse = (PersonNavnAdresse) o;
    return Objects.equals(this.statusField, personNavnAdresse.statusField) &&
        Objects.equals(this.statusDatoField, personNavnAdresse.statusDatoField) &&
        Objects.equals(this.fodselsdatoField, personNavnAdresse.fodselsdatoField) &&
        Objects.equals(this.navnField, personNavnAdresse.navnField) &&
        Objects.equals(this.adresseField, personNavnAdresse.adresseField) &&
        Objects.equals(this.postnrField, personNavnAdresse.postnrField) &&
        Objects.equals(this.poststedField, personNavnAdresse.poststedField) &&
        Objects.equals(this.kommuneField, personNavnAdresse.kommuneField) &&
        Objects.equals(this.fylkeField, personNavnAdresse.fylkeField) &&
        Objects.equals(this.alderField, personNavnAdresse.alderField) &&
        Objects.equals(this.kjonnField, personNavnAdresse.kjonnField) &&
        Objects.equals(this.telefonField, personNavnAdresse.telefonField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusField, statusDatoField, fodselsdatoField, navnField, adresseField, postnrField, poststedField, kommuneField, fylkeField, alderField, kjonnField, telefonField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonNavnAdresse {\n");
    
    sb.append("    statusField: ").append(toIndentedString(statusField)).append("\n");
    sb.append("    statusDatoField: ").append(toIndentedString(statusDatoField)).append("\n");
    sb.append("    fodselsdatoField: ").append(toIndentedString(fodselsdatoField)).append("\n");
    sb.append("    navnField: ").append(toIndentedString(navnField)).append("\n");
    sb.append("    adresseField: ").append(toIndentedString(adresseField)).append("\n");
    sb.append("    postnrField: ").append(toIndentedString(postnrField)).append("\n");
    sb.append("    poststedField: ").append(toIndentedString(poststedField)).append("\n");
    sb.append("    kommuneField: ").append(toIndentedString(kommuneField)).append("\n");
    sb.append("    fylkeField: ").append(toIndentedString(fylkeField)).append("\n");
    sb.append("    alderField: ").append(toIndentedString(alderField)).append("\n");
    sb.append("    kjonnField: ").append(toIndentedString(kjonnField)).append("\n");
    sb.append("    telefonField: ").append(toIndentedString(telefonField)).append("\n");
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
