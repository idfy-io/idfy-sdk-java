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
 * PersonBetaDetaljer
 */
@JsonDeserialize(builder = PersonBetaDetaljer.Builder.class)
public class PersonBetaDetaljer  implements Serializable {
  private final OffsetDateTime registrertDatoField;  // Default value is: null

  private final String betaGruppeKodeField;  // Default value is: null

  private final String betaGruppeTekstField;  // Default value is: null

  private final String betaTypeField;  // Default value is: null

  private final String betaTekstField;  // Default value is: null

  private final Long betaBelopField;  // Default value is: null

  private final String kildeKodeField;  // Default value is: null

  private final String kildeTekstField;  // Default value is: null

  private final Long kildeReferansenrField;  // Default value is: null

  private final String statusAnmerkningField;  // Default value is: null

  private final OffsetDateTime statusDatoField;  // Default value is: null

  private final String kreditorField;  // Default value is: null

  private PersonBetaDetaljer(Builder builder) {
      registrertDatoField = builder.registrertDatoField;
      betaGruppeKodeField = builder.betaGruppeKodeField;
      betaGruppeTekstField = builder.betaGruppeTekstField;
      betaTypeField = builder.betaTypeField;
      betaTekstField = builder.betaTekstField;
      betaBelopField = builder.betaBelopField;
      kildeKodeField = builder.kildeKodeField;
      kildeTekstField = builder.kildeTekstField;
      kildeReferansenrField = builder.kildeReferansenrField;
      statusAnmerkningField = builder.statusAnmerkningField;
      statusDatoField = builder.statusDatoField;
      kreditorField = builder.kreditorField;
  }

      /**
      * Get registrertDatoField
      * @return registrertDatoField
      **/
      public OffsetDateTime getRegistrertDatoField() {return registrertDatoField;}

      /**
      * Get betaGruppeKodeField
      * @return betaGruppeKodeField
      **/
      public String getBetaGruppeKodeField() {return betaGruppeKodeField;}

      /**
      * Get betaGruppeTekstField
      * @return betaGruppeTekstField
      **/
      public String getBetaGruppeTekstField() {return betaGruppeTekstField;}

      /**
      * Get betaTypeField
      * @return betaTypeField
      **/
      public String getBetaTypeField() {return betaTypeField;}

      /**
      * Get betaTekstField
      * @return betaTekstField
      **/
      public String getBetaTekstField() {return betaTekstField;}

      /**
      * Get betaBelopField
      * @return betaBelopField
      **/
      public Long getBetaBelopField() {return betaBelopField;}

      /**
      * Get kildeKodeField
      * @return kildeKodeField
      **/
      public String getKildeKodeField() {return kildeKodeField;}

      /**
      * Get kildeTekstField
      * @return kildeTekstField
      **/
      public String getKildeTekstField() {return kildeTekstField;}

      /**
      * Get kildeReferansenrField
      * @return kildeReferansenrField
      **/
      public Long getKildeReferansenrField() {return kildeReferansenrField;}

      /**
      * Get statusAnmerkningField
      * @return statusAnmerkningField
      **/
      public String getStatusAnmerkningField() {return statusAnmerkningField;}

      /**
      * Get statusDatoField
      * @return statusDatoField
      **/
      public OffsetDateTime getStatusDatoField() {return statusDatoField;}

      /**
      * Get kreditorField
      * @return kreditorField
      **/
      public String getKreditorField() {return kreditorField;}


  public static final class Builder {
      private OffsetDateTime registrertDatoField;
      private String betaGruppeKodeField;
      private String betaGruppeTekstField;
      private String betaTypeField;
      private String betaTekstField;
      private Long betaBelopField;
      private String kildeKodeField;
      private String kildeTekstField;
      private Long kildeReferansenrField;
      private String statusAnmerkningField;
      private OffsetDateTime statusDatoField;
      private String kreditorField;

    public Builder() {
    }

    public Builder(PersonBetaDetaljer copy) {
        this.registrertDatoField = copy.getRegistrertDatoField();
        this.betaGruppeKodeField = copy.getBetaGruppeKodeField();
        this.betaGruppeTekstField = copy.getBetaGruppeTekstField();
        this.betaTypeField = copy.getBetaTypeField();
        this.betaTekstField = copy.getBetaTekstField();
        this.betaBelopField = copy.getBetaBelopField();
        this.kildeKodeField = copy.getKildeKodeField();
        this.kildeTekstField = copy.getKildeTekstField();
        this.kildeReferansenrField = copy.getKildeReferansenrField();
        this.statusAnmerkningField = copy.getStatusAnmerkningField();
        this.statusDatoField = copy.getStatusDatoField();
        this.kreditorField = copy.getKreditorField();
    }

    public Builder withRegistrertDatoField(OffsetDateTime registrertDatoField) {
      this.registrertDatoField = registrertDatoField;
      return this;
    }

    public Builder withBetaGruppeKodeField(String betaGruppeKodeField) {
      this.betaGruppeKodeField = betaGruppeKodeField;
      return this;
    }

    public Builder withBetaGruppeTekstField(String betaGruppeTekstField) {
      this.betaGruppeTekstField = betaGruppeTekstField;
      return this;
    }

    public Builder withBetaTypeField(String betaTypeField) {
      this.betaTypeField = betaTypeField;
      return this;
    }

    public Builder withBetaTekstField(String betaTekstField) {
      this.betaTekstField = betaTekstField;
      return this;
    }

    public Builder withBetaBelopField(Long betaBelopField) {
      this.betaBelopField = betaBelopField;
      return this;
    }

    public Builder withKildeKodeField(String kildeKodeField) {
      this.kildeKodeField = kildeKodeField;
      return this;
    }

    public Builder withKildeTekstField(String kildeTekstField) {
      this.kildeTekstField = kildeTekstField;
      return this;
    }

    public Builder withKildeReferansenrField(Long kildeReferansenrField) {
      this.kildeReferansenrField = kildeReferansenrField;
      return this;
    }

    public Builder withStatusAnmerkningField(String statusAnmerkningField) {
      this.statusAnmerkningField = statusAnmerkningField;
      return this;
    }

    public Builder withStatusDatoField(OffsetDateTime statusDatoField) {
      this.statusDatoField = statusDatoField;
      return this;
    }

    public Builder withKreditorField(String kreditorField) {
      this.kreditorField = kreditorField;
      return this;
    }


    public PersonBetaDetaljer build() { return new PersonBetaDetaljer(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonBetaDetaljer personBetaDetaljer = (PersonBetaDetaljer) o;
    return Objects.equals(this.registrertDatoField, personBetaDetaljer.registrertDatoField) &&
        Objects.equals(this.betaGruppeKodeField, personBetaDetaljer.betaGruppeKodeField) &&
        Objects.equals(this.betaGruppeTekstField, personBetaDetaljer.betaGruppeTekstField) &&
        Objects.equals(this.betaTypeField, personBetaDetaljer.betaTypeField) &&
        Objects.equals(this.betaTekstField, personBetaDetaljer.betaTekstField) &&
        Objects.equals(this.betaBelopField, personBetaDetaljer.betaBelopField) &&
        Objects.equals(this.kildeKodeField, personBetaDetaljer.kildeKodeField) &&
        Objects.equals(this.kildeTekstField, personBetaDetaljer.kildeTekstField) &&
        Objects.equals(this.kildeReferansenrField, personBetaDetaljer.kildeReferansenrField) &&
        Objects.equals(this.statusAnmerkningField, personBetaDetaljer.statusAnmerkningField) &&
        Objects.equals(this.statusDatoField, personBetaDetaljer.statusDatoField) &&
        Objects.equals(this.kreditorField, personBetaDetaljer.kreditorField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrertDatoField, betaGruppeKodeField, betaGruppeTekstField, betaTypeField, betaTekstField, betaBelopField, kildeKodeField, kildeTekstField, kildeReferansenrField, statusAnmerkningField, statusDatoField, kreditorField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonBetaDetaljer {\n");
    
    sb.append("    registrertDatoField: ").append(toIndentedString(registrertDatoField)).append("\n");
    sb.append("    betaGruppeKodeField: ").append(toIndentedString(betaGruppeKodeField)).append("\n");
    sb.append("    betaGruppeTekstField: ").append(toIndentedString(betaGruppeTekstField)).append("\n");
    sb.append("    betaTypeField: ").append(toIndentedString(betaTypeField)).append("\n");
    sb.append("    betaTekstField: ").append(toIndentedString(betaTekstField)).append("\n");
    sb.append("    betaBelopField: ").append(toIndentedString(betaBelopField)).append("\n");
    sb.append("    kildeKodeField: ").append(toIndentedString(kildeKodeField)).append("\n");
    sb.append("    kildeTekstField: ").append(toIndentedString(kildeTekstField)).append("\n");
    sb.append("    kildeReferansenrField: ").append(toIndentedString(kildeReferansenrField)).append("\n");
    sb.append("    statusAnmerkningField: ").append(toIndentedString(statusAnmerkningField)).append("\n");
    sb.append("    statusDatoField: ").append(toIndentedString(statusDatoField)).append("\n");
    sb.append("    kreditorField: ").append(toIndentedString(kreditorField)).append("\n");
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
