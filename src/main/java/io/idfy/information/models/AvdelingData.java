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
 * AvdelingData
 */
@JsonDeserialize(builder = AvdelingData.Builder.class)
public class AvdelingData  implements Serializable {
  private final Integer antallAnsatteField;  // Default value is: null

  private final Boolean antallAnsatteFieldSpecified;  // Default value is: null

  private final Integer telefonField;  // Default value is: null

  private final Boolean telefonFieldSpecified;  // Default value is: null

  private final Integer telefaxField;  // Default value is: null

  private final Boolean telefaxFieldSpecified;  // Default value is: null

  private final OffsetDateTime stiftetDatoField;  // Default value is: null

  private final String bransjeKodeField;  // Default value is: null

  private final String bransjeTekstField;  // Default value is: null

  private final String dagligLederField;  // Default value is: null

  private final Integer hovedforetakOrgnrField;  // Default value is: null

  private final Boolean hovedforetakOrgnrFieldSpecified;  // Default value is: null

  private final Integer hovedforetakDunsnrField;  // Default value is: null

  private final Boolean hovedforetakDunsnrFieldSpecified;  // Default value is: null

  private final String hovedforetakNavnField;  // Default value is: null

  private AvdelingData(Builder builder) {
      antallAnsatteField = builder.antallAnsatteField;
      antallAnsatteFieldSpecified = builder.antallAnsatteFieldSpecified;
      telefonField = builder.telefonField;
      telefonFieldSpecified = builder.telefonFieldSpecified;
      telefaxField = builder.telefaxField;
      telefaxFieldSpecified = builder.telefaxFieldSpecified;
      stiftetDatoField = builder.stiftetDatoField;
      bransjeKodeField = builder.bransjeKodeField;
      bransjeTekstField = builder.bransjeTekstField;
      dagligLederField = builder.dagligLederField;
      hovedforetakOrgnrField = builder.hovedforetakOrgnrField;
      hovedforetakOrgnrFieldSpecified = builder.hovedforetakOrgnrFieldSpecified;
      hovedforetakDunsnrField = builder.hovedforetakDunsnrField;
      hovedforetakDunsnrFieldSpecified = builder.hovedforetakDunsnrFieldSpecified;
      hovedforetakNavnField = builder.hovedforetakNavnField;
  }

      /**
      * Get antallAnsatteField
      * @return antallAnsatteField
      **/
      public Integer getAntallAnsatteField() {return antallAnsatteField;}

      /**
      * Get antallAnsatteFieldSpecified
      * @return antallAnsatteFieldSpecified
      **/
      public Boolean getAntallAnsatteFieldSpecified() {return antallAnsatteFieldSpecified;}

      /**
      * Get telefonField
      * @return telefonField
      **/
      public Integer getTelefonField() {return telefonField;}

      /**
      * Get telefonFieldSpecified
      * @return telefonFieldSpecified
      **/
      public Boolean getTelefonFieldSpecified() {return telefonFieldSpecified;}

      /**
      * Get telefaxField
      * @return telefaxField
      **/
      public Integer getTelefaxField() {return telefaxField;}

      /**
      * Get telefaxFieldSpecified
      * @return telefaxFieldSpecified
      **/
      public Boolean getTelefaxFieldSpecified() {return telefaxFieldSpecified;}

      /**
      * Get stiftetDatoField
      * @return stiftetDatoField
      **/
      public OffsetDateTime getStiftetDatoField() {return stiftetDatoField;}

      /**
      * Get bransjeKodeField
      * @return bransjeKodeField
      **/
      public String getBransjeKodeField() {return bransjeKodeField;}

      /**
      * Get bransjeTekstField
      * @return bransjeTekstField
      **/
      public String getBransjeTekstField() {return bransjeTekstField;}

      /**
      * Get dagligLederField
      * @return dagligLederField
      **/
      public String getDagligLederField() {return dagligLederField;}

      /**
      * Get hovedforetakOrgnrField
      * @return hovedforetakOrgnrField
      **/
      public Integer getHovedforetakOrgnrField() {return hovedforetakOrgnrField;}

      /**
      * Get hovedforetakOrgnrFieldSpecified
      * @return hovedforetakOrgnrFieldSpecified
      **/
      public Boolean getHovedforetakOrgnrFieldSpecified() {return hovedforetakOrgnrFieldSpecified;}

      /**
      * Get hovedforetakDunsnrField
      * @return hovedforetakDunsnrField
      **/
      public Integer getHovedforetakDunsnrField() {return hovedforetakDunsnrField;}

      /**
      * Get hovedforetakDunsnrFieldSpecified
      * @return hovedforetakDunsnrFieldSpecified
      **/
      public Boolean getHovedforetakDunsnrFieldSpecified() {return hovedforetakDunsnrFieldSpecified;}

      /**
      * Get hovedforetakNavnField
      * @return hovedforetakNavnField
      **/
      public String getHovedforetakNavnField() {return hovedforetakNavnField;}


  public static final class Builder {
      private Integer antallAnsatteField;
      private Boolean antallAnsatteFieldSpecified;
      private Integer telefonField;
      private Boolean telefonFieldSpecified;
      private Integer telefaxField;
      private Boolean telefaxFieldSpecified;
      private OffsetDateTime stiftetDatoField;
      private String bransjeKodeField;
      private String bransjeTekstField;
      private String dagligLederField;
      private Integer hovedforetakOrgnrField;
      private Boolean hovedforetakOrgnrFieldSpecified;
      private Integer hovedforetakDunsnrField;
      private Boolean hovedforetakDunsnrFieldSpecified;
      private String hovedforetakNavnField;

    public Builder() {
    }

    public Builder(AvdelingData copy) {
        this.antallAnsatteField = copy.getAntallAnsatteField();
        this.antallAnsatteFieldSpecified = copy.getAntallAnsatteFieldSpecified();
        this.telefonField = copy.getTelefonField();
        this.telefonFieldSpecified = copy.getTelefonFieldSpecified();
        this.telefaxField = copy.getTelefaxField();
        this.telefaxFieldSpecified = copy.getTelefaxFieldSpecified();
        this.stiftetDatoField = copy.getStiftetDatoField();
        this.bransjeKodeField = copy.getBransjeKodeField();
        this.bransjeTekstField = copy.getBransjeTekstField();
        this.dagligLederField = copy.getDagligLederField();
        this.hovedforetakOrgnrField = copy.getHovedforetakOrgnrField();
        this.hovedforetakOrgnrFieldSpecified = copy.getHovedforetakOrgnrFieldSpecified();
        this.hovedforetakDunsnrField = copy.getHovedforetakDunsnrField();
        this.hovedforetakDunsnrFieldSpecified = copy.getHovedforetakDunsnrFieldSpecified();
        this.hovedforetakNavnField = copy.getHovedforetakNavnField();
    }

    public Builder withAntallAnsatteField(Integer antallAnsatteField) {
      this.antallAnsatteField = antallAnsatteField;
      return this;
    }

    public Builder withAntallAnsatteFieldSpecified(Boolean antallAnsatteFieldSpecified) {
      this.antallAnsatteFieldSpecified = antallAnsatteFieldSpecified;
      return this;
    }

    public Builder withTelefonField(Integer telefonField) {
      this.telefonField = telefonField;
      return this;
    }

    public Builder withTelefonFieldSpecified(Boolean telefonFieldSpecified) {
      this.telefonFieldSpecified = telefonFieldSpecified;
      return this;
    }

    public Builder withTelefaxField(Integer telefaxField) {
      this.telefaxField = telefaxField;
      return this;
    }

    public Builder withTelefaxFieldSpecified(Boolean telefaxFieldSpecified) {
      this.telefaxFieldSpecified = telefaxFieldSpecified;
      return this;
    }

    public Builder withStiftetDatoField(OffsetDateTime stiftetDatoField) {
      this.stiftetDatoField = stiftetDatoField;
      return this;
    }

    public Builder withBransjeKodeField(String bransjeKodeField) {
      this.bransjeKodeField = bransjeKodeField;
      return this;
    }

    public Builder withBransjeTekstField(String bransjeTekstField) {
      this.bransjeTekstField = bransjeTekstField;
      return this;
    }

    public Builder withDagligLederField(String dagligLederField) {
      this.dagligLederField = dagligLederField;
      return this;
    }

    public Builder withHovedforetakOrgnrField(Integer hovedforetakOrgnrField) {
      this.hovedforetakOrgnrField = hovedforetakOrgnrField;
      return this;
    }

    public Builder withHovedforetakOrgnrFieldSpecified(Boolean hovedforetakOrgnrFieldSpecified) {
      this.hovedforetakOrgnrFieldSpecified = hovedforetakOrgnrFieldSpecified;
      return this;
    }

    public Builder withHovedforetakDunsnrField(Integer hovedforetakDunsnrField) {
      this.hovedforetakDunsnrField = hovedforetakDunsnrField;
      return this;
    }

    public Builder withHovedforetakDunsnrFieldSpecified(Boolean hovedforetakDunsnrFieldSpecified) {
      this.hovedforetakDunsnrFieldSpecified = hovedforetakDunsnrFieldSpecified;
      return this;
    }

    public Builder withHovedforetakNavnField(String hovedforetakNavnField) {
      this.hovedforetakNavnField = hovedforetakNavnField;
      return this;
    }


    public AvdelingData build() { return new AvdelingData(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvdelingData avdelingData = (AvdelingData) o;
    return Objects.equals(this.antallAnsatteField, avdelingData.antallAnsatteField) &&
        Objects.equals(this.antallAnsatteFieldSpecified, avdelingData.antallAnsatteFieldSpecified) &&
        Objects.equals(this.telefonField, avdelingData.telefonField) &&
        Objects.equals(this.telefonFieldSpecified, avdelingData.telefonFieldSpecified) &&
        Objects.equals(this.telefaxField, avdelingData.telefaxField) &&
        Objects.equals(this.telefaxFieldSpecified, avdelingData.telefaxFieldSpecified) &&
        Objects.equals(this.stiftetDatoField, avdelingData.stiftetDatoField) &&
        Objects.equals(this.bransjeKodeField, avdelingData.bransjeKodeField) &&
        Objects.equals(this.bransjeTekstField, avdelingData.bransjeTekstField) &&
        Objects.equals(this.dagligLederField, avdelingData.dagligLederField) &&
        Objects.equals(this.hovedforetakOrgnrField, avdelingData.hovedforetakOrgnrField) &&
        Objects.equals(this.hovedforetakOrgnrFieldSpecified, avdelingData.hovedforetakOrgnrFieldSpecified) &&
        Objects.equals(this.hovedforetakDunsnrField, avdelingData.hovedforetakDunsnrField) &&
        Objects.equals(this.hovedforetakDunsnrFieldSpecified, avdelingData.hovedforetakDunsnrFieldSpecified) &&
        Objects.equals(this.hovedforetakNavnField, avdelingData.hovedforetakNavnField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antallAnsatteField, antallAnsatteFieldSpecified, telefonField, telefonFieldSpecified, telefaxField, telefaxFieldSpecified, stiftetDatoField, bransjeKodeField, bransjeTekstField, dagligLederField, hovedforetakOrgnrField, hovedforetakOrgnrFieldSpecified, hovedforetakDunsnrField, hovedforetakDunsnrFieldSpecified, hovedforetakNavnField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvdelingData {\n");
    
    sb.append("    antallAnsatteField: ").append(toIndentedString(antallAnsatteField)).append("\n");
    sb.append("    antallAnsatteFieldSpecified: ").append(toIndentedString(antallAnsatteFieldSpecified)).append("\n");
    sb.append("    telefonField: ").append(toIndentedString(telefonField)).append("\n");
    sb.append("    telefonFieldSpecified: ").append(toIndentedString(telefonFieldSpecified)).append("\n");
    sb.append("    telefaxField: ").append(toIndentedString(telefaxField)).append("\n");
    sb.append("    telefaxFieldSpecified: ").append(toIndentedString(telefaxFieldSpecified)).append("\n");
    sb.append("    stiftetDatoField: ").append(toIndentedString(stiftetDatoField)).append("\n");
    sb.append("    bransjeKodeField: ").append(toIndentedString(bransjeKodeField)).append("\n");
    sb.append("    bransjeTekstField: ").append(toIndentedString(bransjeTekstField)).append("\n");
    sb.append("    dagligLederField: ").append(toIndentedString(dagligLederField)).append("\n");
    sb.append("    hovedforetakOrgnrField: ").append(toIndentedString(hovedforetakOrgnrField)).append("\n");
    sb.append("    hovedforetakOrgnrFieldSpecified: ").append(toIndentedString(hovedforetakOrgnrFieldSpecified)).append("\n");
    sb.append("    hovedforetakDunsnrField: ").append(toIndentedString(hovedforetakDunsnrField)).append("\n");
    sb.append("    hovedforetakDunsnrFieldSpecified: ").append(toIndentedString(hovedforetakDunsnrFieldSpecified)).append("\n");
    sb.append("    hovedforetakNavnField: ").append(toIndentedString(hovedforetakNavnField)).append("\n");
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
