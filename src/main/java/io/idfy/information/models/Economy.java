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
 * Economy
 */
@JsonDeserialize(builder = Economy.Builder.class)
public class Economy  implements Serializable {
  private final Integer year;  // Default value is: null

  private final Long turnover;  // Default value is: null

  private final Long operatingProfit;  // Default value is: null

  private final Double equity;  // Default value is: null

  private final Integer employees;  // Default value is: null

  private Economy(Builder builder) {
      year = builder.year;
      turnover = builder.turnover;
      operatingProfit = builder.operatingProfit;
      equity = builder.equity;
      employees = builder.employees;
  }

      /**
      * Get year
      * @return year
      **/
      public Integer getYear() {return year;}

      /**
      * Get turnover
      * @return turnover
      **/
      public Long getTurnover() {return turnover;}

      /**
      * Get operatingProfit
      * @return operatingProfit
      **/
      public Long getOperatingProfit() {return operatingProfit;}

      /**
      * Get equity
      * @return equity
      **/
      public Double getEquity() {return equity;}

      /**
      * Get employees
      * @return employees
      **/
      public Integer getEmployees() {return employees;}


  public static final class Builder {
      private Integer year;
      private Long turnover;
      private Long operatingProfit;
      private Double equity;
      private Integer employees;

    public Builder() {
    }

    public Builder(Economy copy) {
        this.year = copy.getYear();
        this.turnover = copy.getTurnover();
        this.operatingProfit = copy.getOperatingProfit();
        this.equity = copy.getEquity();
        this.employees = copy.getEmployees();
    }

    public Builder withYear(Integer year) {
      this.year = year;
      return this;
    }

    public Builder withTurnover(Long turnover) {
      this.turnover = turnover;
      return this;
    }

    public Builder withOperatingProfit(Long operatingProfit) {
      this.operatingProfit = operatingProfit;
      return this;
    }

    public Builder withEquity(Double equity) {
      this.equity = equity;
      return this;
    }

    public Builder withEmployees(Integer employees) {
      this.employees = employees;
      return this;
    }


    public Economy build() { return new Economy(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Economy economy = (Economy) o;
    return Objects.equals(this.year, economy.year) &&
        Objects.equals(this.turnover, economy.turnover) &&
        Objects.equals(this.operatingProfit, economy.operatingProfit) &&
        Objects.equals(this.equity, economy.equity) &&
        Objects.equals(this.employees, economy.employees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, turnover, operatingProfit, equity, employees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Economy {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    operatingProfit: ").append(toIndentedString(operatingProfit)).append("\n");
    sb.append("    equity: ").append(toIndentedString(equity)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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
