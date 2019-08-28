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
import io.idfy.information.models.AnsatteData;
import io.idfy.information.models.BransjeData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Grunnfakta
 */
@JsonDeserialize(builder = Grunnfakta.Builder.class)
public class Grunnfakta  implements Serializable {
  private final String selskFormKodeField;  // Default value is: null

  private final String selskFormTekstField;  // Default value is: null

  private final Integer etablertArField;  // Default value is: null

  private final Boolean etablertArFieldSpecified;  // Default value is: null

  private final OffsetDateTime stiftetDatoField;  // Default value is: null

  private final Long aksjekapitalField;  // Default value is: null

  private final String aksjekapitalStatusField;  // Default value is: null

  private final String registrertStedField;  // Default value is: null

  private final OffsetDateTime registrertDatoField;  // Default value is: null

  private final Integer revisorOrgnrField;  // Default value is: null

  private final String revisorNavnField;  // Default value is: null

  private final Integer bankRegnrField;  // Default value is: null

  private final String bankNavnField;  // Default value is: null

  private final List<BransjeData> bransjeDataField;  // Default value is: new ArrayList<>()

  private final List<AnsatteData> ansatteDataField;  // Default value is: new ArrayList<>()

  private Grunnfakta(Builder builder) {
      selskFormKodeField = builder.selskFormKodeField;
      selskFormTekstField = builder.selskFormTekstField;
      etablertArField = builder.etablertArField;
      etablertArFieldSpecified = builder.etablertArFieldSpecified;
      stiftetDatoField = builder.stiftetDatoField;
      aksjekapitalField = builder.aksjekapitalField;
      aksjekapitalStatusField = builder.aksjekapitalStatusField;
      registrertStedField = builder.registrertStedField;
      registrertDatoField = builder.registrertDatoField;
      revisorOrgnrField = builder.revisorOrgnrField;
      revisorNavnField = builder.revisorNavnField;
      bankRegnrField = builder.bankRegnrField;
      bankNavnField = builder.bankNavnField;
      bransjeDataField = builder.bransjeDataField;
      ansatteDataField = builder.ansatteDataField;
  }

      /**
      * Get selskFormKodeField
      * @return selskFormKodeField
      **/
      public String getSelskFormKodeField() {return selskFormKodeField;}

      /**
      * Get selskFormTekstField
      * @return selskFormTekstField
      **/
      public String getSelskFormTekstField() {return selskFormTekstField;}

      /**
      * Get etablertArField
      * @return etablertArField
      **/
      public Integer getEtablertArField() {return etablertArField;}

      /**
      * Get etablertArFieldSpecified
      * @return etablertArFieldSpecified
      **/
      public Boolean getEtablertArFieldSpecified() {return etablertArFieldSpecified;}

      /**
      * Get stiftetDatoField
      * @return stiftetDatoField
      **/
      public OffsetDateTime getStiftetDatoField() {return stiftetDatoField;}

      /**
      * Get aksjekapitalField
      * @return aksjekapitalField
      **/
      public Long getAksjekapitalField() {return aksjekapitalField;}

      /**
      * Get aksjekapitalStatusField
      * @return aksjekapitalStatusField
      **/
      public String getAksjekapitalStatusField() {return aksjekapitalStatusField;}

      /**
      * Get registrertStedField
      * @return registrertStedField
      **/
      public String getRegistrertStedField() {return registrertStedField;}

      /**
      * Get registrertDatoField
      * @return registrertDatoField
      **/
      public OffsetDateTime getRegistrertDatoField() {return registrertDatoField;}

      /**
      * Get revisorOrgnrField
      * @return revisorOrgnrField
      **/
      public Integer getRevisorOrgnrField() {return revisorOrgnrField;}

      /**
      * Get revisorNavnField
      * @return revisorNavnField
      **/
      public String getRevisorNavnField() {return revisorNavnField;}

      /**
      * Get bankRegnrField
      * @return bankRegnrField
      **/
      public Integer getBankRegnrField() {return bankRegnrField;}

      /**
      * Get bankNavnField
      * @return bankNavnField
      **/
      public String getBankNavnField() {return bankNavnField;}

      /**
      * Get bransjeDataField
      * @return bransjeDataField
      **/
      public List<BransjeData> getBransjeDataField() {return bransjeDataField;}

      /**
      * Get ansatteDataField
      * @return ansatteDataField
      **/
      public List<AnsatteData> getAnsatteDataField() {return ansatteDataField;}


  public static final class Builder {
      private String selskFormKodeField;
      private String selskFormTekstField;
      private Integer etablertArField;
      private Boolean etablertArFieldSpecified;
      private OffsetDateTime stiftetDatoField;
      private Long aksjekapitalField;
      private String aksjekapitalStatusField;
      private String registrertStedField;
      private OffsetDateTime registrertDatoField;
      private Integer revisorOrgnrField;
      private String revisorNavnField;
      private Integer bankRegnrField;
      private String bankNavnField;
      private List<BransjeData> bransjeDataField;
      private List<AnsatteData> ansatteDataField;

    public Builder() {
    }

    public Builder(Grunnfakta copy) {
        this.selskFormKodeField = copy.getSelskFormKodeField();
        this.selskFormTekstField = copy.getSelskFormTekstField();
        this.etablertArField = copy.getEtablertArField();
        this.etablertArFieldSpecified = copy.getEtablertArFieldSpecified();
        this.stiftetDatoField = copy.getStiftetDatoField();
        this.aksjekapitalField = copy.getAksjekapitalField();
        this.aksjekapitalStatusField = copy.getAksjekapitalStatusField();
        this.registrertStedField = copy.getRegistrertStedField();
        this.registrertDatoField = copy.getRegistrertDatoField();
        this.revisorOrgnrField = copy.getRevisorOrgnrField();
        this.revisorNavnField = copy.getRevisorNavnField();
        this.bankRegnrField = copy.getBankRegnrField();
        this.bankNavnField = copy.getBankNavnField();
        this.bransjeDataField = copy.getBransjeDataField();
        this.ansatteDataField = copy.getAnsatteDataField();
    }

    public Builder withSelskFormKodeField(String selskFormKodeField) {
      this.selskFormKodeField = selskFormKodeField;
      return this;
    }

    public Builder withSelskFormTekstField(String selskFormTekstField) {
      this.selskFormTekstField = selskFormTekstField;
      return this;
    }

    public Builder withEtablertArField(Integer etablertArField) {
      this.etablertArField = etablertArField;
      return this;
    }

    public Builder withEtablertArFieldSpecified(Boolean etablertArFieldSpecified) {
      this.etablertArFieldSpecified = etablertArFieldSpecified;
      return this;
    }

    public Builder withStiftetDatoField(OffsetDateTime stiftetDatoField) {
      this.stiftetDatoField = stiftetDatoField;
      return this;
    }

    public Builder withAksjekapitalField(Long aksjekapitalField) {
      this.aksjekapitalField = aksjekapitalField;
      return this;
    }

    public Builder withAksjekapitalStatusField(String aksjekapitalStatusField) {
      this.aksjekapitalStatusField = aksjekapitalStatusField;
      return this;
    }

    public Builder withRegistrertStedField(String registrertStedField) {
      this.registrertStedField = registrertStedField;
      return this;
    }

    public Builder withRegistrertDatoField(OffsetDateTime registrertDatoField) {
      this.registrertDatoField = registrertDatoField;
      return this;
    }

    public Builder withRevisorOrgnrField(Integer revisorOrgnrField) {
      this.revisorOrgnrField = revisorOrgnrField;
      return this;
    }

    public Builder withRevisorNavnField(String revisorNavnField) {
      this.revisorNavnField = revisorNavnField;
      return this;
    }

    public Builder withBankRegnrField(Integer bankRegnrField) {
      this.bankRegnrField = bankRegnrField;
      return this;
    }

    public Builder withBankNavnField(String bankNavnField) {
      this.bankNavnField = bankNavnField;
      return this;
    }

    public Builder withBransjeDataField(List<BransjeData> bransjeDataField) {
      this.bransjeDataField = bransjeDataField;
      return this;
    }

    public Builder addBransjeDataFieldItem(BransjeData bransjeDataFieldItem) {
      if (this.bransjeDataField == null) {
        this.bransjeDataField = new ArrayList<>();
      }
      this.bransjeDataField.add(bransjeDataFieldItem);
      return this;
    }

    public Builder withAnsatteDataField(List<AnsatteData> ansatteDataField) {
      this.ansatteDataField = ansatteDataField;
      return this;
    }

    public Builder addAnsatteDataFieldItem(AnsatteData ansatteDataFieldItem) {
      if (this.ansatteDataField == null) {
        this.ansatteDataField = new ArrayList<>();
      }
      this.ansatteDataField.add(ansatteDataFieldItem);
      return this;
    }


    public Grunnfakta build() { return new Grunnfakta(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grunnfakta grunnfakta = (Grunnfakta) o;
    return Objects.equals(this.selskFormKodeField, grunnfakta.selskFormKodeField) &&
        Objects.equals(this.selskFormTekstField, grunnfakta.selskFormTekstField) &&
        Objects.equals(this.etablertArField, grunnfakta.etablertArField) &&
        Objects.equals(this.etablertArFieldSpecified, grunnfakta.etablertArFieldSpecified) &&
        Objects.equals(this.stiftetDatoField, grunnfakta.stiftetDatoField) &&
        Objects.equals(this.aksjekapitalField, grunnfakta.aksjekapitalField) &&
        Objects.equals(this.aksjekapitalStatusField, grunnfakta.aksjekapitalStatusField) &&
        Objects.equals(this.registrertStedField, grunnfakta.registrertStedField) &&
        Objects.equals(this.registrertDatoField, grunnfakta.registrertDatoField) &&
        Objects.equals(this.revisorOrgnrField, grunnfakta.revisorOrgnrField) &&
        Objects.equals(this.revisorNavnField, grunnfakta.revisorNavnField) &&
        Objects.equals(this.bankRegnrField, grunnfakta.bankRegnrField) &&
        Objects.equals(this.bankNavnField, grunnfakta.bankNavnField) &&
        Objects.equals(this.bransjeDataField, grunnfakta.bransjeDataField) &&
        Objects.equals(this.ansatteDataField, grunnfakta.ansatteDataField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selskFormKodeField, selskFormTekstField, etablertArField, etablertArFieldSpecified, stiftetDatoField, aksjekapitalField, aksjekapitalStatusField, registrertStedField, registrertDatoField, revisorOrgnrField, revisorNavnField, bankRegnrField, bankNavnField, bransjeDataField, ansatteDataField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grunnfakta {\n");
    
    sb.append("    selskFormKodeField: ").append(toIndentedString(selskFormKodeField)).append("\n");
    sb.append("    selskFormTekstField: ").append(toIndentedString(selskFormTekstField)).append("\n");
    sb.append("    etablertArField: ").append(toIndentedString(etablertArField)).append("\n");
    sb.append("    etablertArFieldSpecified: ").append(toIndentedString(etablertArFieldSpecified)).append("\n");
    sb.append("    stiftetDatoField: ").append(toIndentedString(stiftetDatoField)).append("\n");
    sb.append("    aksjekapitalField: ").append(toIndentedString(aksjekapitalField)).append("\n");
    sb.append("    aksjekapitalStatusField: ").append(toIndentedString(aksjekapitalStatusField)).append("\n");
    sb.append("    registrertStedField: ").append(toIndentedString(registrertStedField)).append("\n");
    sb.append("    registrertDatoField: ").append(toIndentedString(registrertDatoField)).append("\n");
    sb.append("    revisorOrgnrField: ").append(toIndentedString(revisorOrgnrField)).append("\n");
    sb.append("    revisorNavnField: ").append(toIndentedString(revisorNavnField)).append("\n");
    sb.append("    bankRegnrField: ").append(toIndentedString(bankRegnrField)).append("\n");
    sb.append("    bankNavnField: ").append(toIndentedString(bankNavnField)).append("\n");
    sb.append("    bransjeDataField: ").append(toIndentedString(bransjeDataField)).append("\n");
    sb.append("    ansatteDataField: ").append(toIndentedString(ansatteDataField)).append("\n");
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
