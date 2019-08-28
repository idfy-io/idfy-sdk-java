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
 * PersonNaringsInteresser
 */
@JsonDeserialize(builder = PersonNaringsInteresser.Builder.class)
public class PersonNaringsInteresser  implements Serializable {
  private final Integer orgnrField;  // Default value is: null

  private final String statusKodeField;  // Default value is: null

  private final String statusTekstField;  // Default value is: null

  private final OffsetDateTime statusDatoField;  // Default value is: null

  private final String navnField;  // Default value is: null

  private final String selskFormField;  // Default value is: null

  private final String rolleField;  // Default value is: null

  private final Double eierandelField;  // Default value is: null

  private final String vervKodeField;  // Default value is: null

  private final String vervTekstField;  // Default value is: null

  private PersonNaringsInteresser(Builder builder) {
      orgnrField = builder.orgnrField;
      statusKodeField = builder.statusKodeField;
      statusTekstField = builder.statusTekstField;
      statusDatoField = builder.statusDatoField;
      navnField = builder.navnField;
      selskFormField = builder.selskFormField;
      rolleField = builder.rolleField;
      eierandelField = builder.eierandelField;
      vervKodeField = builder.vervKodeField;
      vervTekstField = builder.vervTekstField;
  }

      /**
      * Get orgnrField
      * @return orgnrField
      **/
      public Integer getOrgnrField() {return orgnrField;}

      /**
      * Get statusKodeField
      * @return statusKodeField
      **/
      public String getStatusKodeField() {return statusKodeField;}

      /**
      * Get statusTekstField
      * @return statusTekstField
      **/
      public String getStatusTekstField() {return statusTekstField;}

      /**
      * Get statusDatoField
      * @return statusDatoField
      **/
      public OffsetDateTime getStatusDatoField() {return statusDatoField;}

      /**
      * Get navnField
      * @return navnField
      **/
      public String getNavnField() {return navnField;}

      /**
      * Get selskFormField
      * @return selskFormField
      **/
      public String getSelskFormField() {return selskFormField;}

      /**
      * Get rolleField
      * @return rolleField
      **/
      public String getRolleField() {return rolleField;}

      /**
      * Get eierandelField
      * @return eierandelField
      **/
      public Double getEierandelField() {return eierandelField;}

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
      private Integer orgnrField;
      private String statusKodeField;
      private String statusTekstField;
      private OffsetDateTime statusDatoField;
      private String navnField;
      private String selskFormField;
      private String rolleField;
      private Double eierandelField;
      private String vervKodeField;
      private String vervTekstField;

    public Builder() {
    }

    public Builder(PersonNaringsInteresser copy) {
        this.orgnrField = copy.getOrgnrField();
        this.statusKodeField = copy.getStatusKodeField();
        this.statusTekstField = copy.getStatusTekstField();
        this.statusDatoField = copy.getStatusDatoField();
        this.navnField = copy.getNavnField();
        this.selskFormField = copy.getSelskFormField();
        this.rolleField = copy.getRolleField();
        this.eierandelField = copy.getEierandelField();
        this.vervKodeField = copy.getVervKodeField();
        this.vervTekstField = copy.getVervTekstField();
    }

    public Builder withOrgnrField(Integer orgnrField) {
      this.orgnrField = orgnrField;
      return this;
    }

    public Builder withStatusKodeField(String statusKodeField) {
      this.statusKodeField = statusKodeField;
      return this;
    }

    public Builder withStatusTekstField(String statusTekstField) {
      this.statusTekstField = statusTekstField;
      return this;
    }

    public Builder withStatusDatoField(OffsetDateTime statusDatoField) {
      this.statusDatoField = statusDatoField;
      return this;
    }

    public Builder withNavnField(String navnField) {
      this.navnField = navnField;
      return this;
    }

    public Builder withSelskFormField(String selskFormField) {
      this.selskFormField = selskFormField;
      return this;
    }

    public Builder withRolleField(String rolleField) {
      this.rolleField = rolleField;
      return this;
    }

    public Builder withEierandelField(Double eierandelField) {
      this.eierandelField = eierandelField;
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


    public PersonNaringsInteresser build() { return new PersonNaringsInteresser(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonNaringsInteresser personNaringsInteresser = (PersonNaringsInteresser) o;
    return Objects.equals(this.orgnrField, personNaringsInteresser.orgnrField) &&
        Objects.equals(this.statusKodeField, personNaringsInteresser.statusKodeField) &&
        Objects.equals(this.statusTekstField, personNaringsInteresser.statusTekstField) &&
        Objects.equals(this.statusDatoField, personNaringsInteresser.statusDatoField) &&
        Objects.equals(this.navnField, personNaringsInteresser.navnField) &&
        Objects.equals(this.selskFormField, personNaringsInteresser.selskFormField) &&
        Objects.equals(this.rolleField, personNaringsInteresser.rolleField) &&
        Objects.equals(this.eierandelField, personNaringsInteresser.eierandelField) &&
        Objects.equals(this.vervKodeField, personNaringsInteresser.vervKodeField) &&
        Objects.equals(this.vervTekstField, personNaringsInteresser.vervTekstField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgnrField, statusKodeField, statusTekstField, statusDatoField, navnField, selskFormField, rolleField, eierandelField, vervKodeField, vervTekstField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonNaringsInteresser {\n");
    
    sb.append("    orgnrField: ").append(toIndentedString(orgnrField)).append("\n");
    sb.append("    statusKodeField: ").append(toIndentedString(statusKodeField)).append("\n");
    sb.append("    statusTekstField: ").append(toIndentedString(statusTekstField)).append("\n");
    sb.append("    statusDatoField: ").append(toIndentedString(statusDatoField)).append("\n");
    sb.append("    navnField: ").append(toIndentedString(navnField)).append("\n");
    sb.append("    selskFormField: ").append(toIndentedString(selskFormField)).append("\n");
    sb.append("    rolleField: ").append(toIndentedString(rolleField)).append("\n");
    sb.append("    eierandelField: ").append(toIndentedString(eierandelField)).append("\n");
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
