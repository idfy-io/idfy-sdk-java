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
 * PersonEconomy
 */
@JsonDeserialize(builder = PersonEconomy.Builder.class)
public class PersonEconomy  implements Serializable {
  private final Integer year;  // Default value is: null

  private final Double netIncome;  // Default value is: null

  private final Double incomeChange;  // Default value is: null

  private final Double fortune;  // Default value is: null

  private final Double assessedTax;  // Default value is: null

  private final String taxClass;  // Default value is: null

  private final String municipal;  // Default value is: null

  private final String municipalNumber;  // Default value is: null

  private PersonEconomy(Builder builder) {
      year = builder.year;
      netIncome = builder.netIncome;
      incomeChange = builder.incomeChange;
      fortune = builder.fortune;
      assessedTax = builder.assessedTax;
      taxClass = builder.taxClass;
      municipal = builder.municipal;
      municipalNumber = builder.municipalNumber;
  }

      /**
      * Get year
      * @return year
      **/
      public Integer getYear() {return year;}

      /**
      * Get netIncome
      * @return netIncome
      **/
      public Double getNetIncome() {return netIncome;}

      /**
      * Get incomeChange
      * @return incomeChange
      **/
      public Double getIncomeChange() {return incomeChange;}

      /**
      * Get fortune
      * @return fortune
      **/
      public Double getFortune() {return fortune;}

      /**
      * Get assessedTax
      * @return assessedTax
      **/
      public Double getAssessedTax() {return assessedTax;}

      /**
      * Get taxClass
      * @return taxClass
      **/
      public String getTaxClass() {return taxClass;}

      /**
      * Get municipal
      * @return municipal
      **/
      public String getMunicipal() {return municipal;}

      /**
      * Get municipalNumber
      * @return municipalNumber
      **/
      public String getMunicipalNumber() {return municipalNumber;}


  public static final class Builder {
      private Integer year;
      private Double netIncome;
      private Double incomeChange;
      private Double fortune;
      private Double assessedTax;
      private String taxClass;
      private String municipal;
      private String municipalNumber;

    public Builder() {
    }

    public Builder(PersonEconomy copy) {
        this.year = copy.getYear();
        this.netIncome = copy.getNetIncome();
        this.incomeChange = copy.getIncomeChange();
        this.fortune = copy.getFortune();
        this.assessedTax = copy.getAssessedTax();
        this.taxClass = copy.getTaxClass();
        this.municipal = copy.getMunicipal();
        this.municipalNumber = copy.getMunicipalNumber();
    }

    public Builder withYear(Integer year) {
      this.year = year;
      return this;
    }

    public Builder withNetIncome(Double netIncome) {
      this.netIncome = netIncome;
      return this;
    }

    public Builder withIncomeChange(Double incomeChange) {
      this.incomeChange = incomeChange;
      return this;
    }

    public Builder withFortune(Double fortune) {
      this.fortune = fortune;
      return this;
    }

    public Builder withAssessedTax(Double assessedTax) {
      this.assessedTax = assessedTax;
      return this;
    }

    public Builder withTaxClass(String taxClass) {
      this.taxClass = taxClass;
      return this;
    }

    public Builder withMunicipal(String municipal) {
      this.municipal = municipal;
      return this;
    }

    public Builder withMunicipalNumber(String municipalNumber) {
      this.municipalNumber = municipalNumber;
      return this;
    }


    public PersonEconomy build() { return new PersonEconomy(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonEconomy personEconomy = (PersonEconomy) o;
    return Objects.equals(this.year, personEconomy.year) &&
        Objects.equals(this.netIncome, personEconomy.netIncome) &&
        Objects.equals(this.incomeChange, personEconomy.incomeChange) &&
        Objects.equals(this.fortune, personEconomy.fortune) &&
        Objects.equals(this.assessedTax, personEconomy.assessedTax) &&
        Objects.equals(this.taxClass, personEconomy.taxClass) &&
        Objects.equals(this.municipal, personEconomy.municipal) &&
        Objects.equals(this.municipalNumber, personEconomy.municipalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, netIncome, incomeChange, fortune, assessedTax, taxClass, municipal, municipalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonEconomy {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    incomeChange: ").append(toIndentedString(incomeChange)).append("\n");
    sb.append("    fortune: ").append(toIndentedString(fortune)).append("\n");
    sb.append("    assessedTax: ").append(toIndentedString(assessedTax)).append("\n");
    sb.append("    taxClass: ").append(toIndentedString(taxClass)).append("\n");
    sb.append("    municipal: ").append(toIndentedString(municipal)).append("\n");
    sb.append("    municipalNumber: ").append(toIndentedString(municipalNumber)).append("\n");
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
