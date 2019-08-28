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
import io.idfy.information.models.Economy;
import io.idfy.information.models.HentForetakResponse;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * CreditCheckCompanyResponse
 */
@JsonDeserialize(builder = CreditCheckCompanyResponse.Builder.class)
public class CreditCheckCompanyResponse  implements Serializable {
  private final Integer orgNumber;  // Default value is: null

  private final String orgName;  // Default value is: null

  private final String address;  // Default value is: null

  private final String postalCode;  // Default value is: null

  private final String city;  // Default value is: null

  private final OffsetDateTime incorporationDate;  // Default value is: null

  private final String chairMan;  // Default value is: null

  private final String CEO;  // Default value is: null

  private final Economy economy;  // Default value is: null

  private final String bisnodeRatingCode;  // Default value is: null

  private final String bisnodeRatingDescription;  // Default value is: null

  private final Double creditLimit;  // Default value is: null

  private final String paymentDefaults;  // Default value is: null

  private final String requestId;  // Default value is: null

  private final String report;  // Default value is: null

  private final HentForetakResponse detailedInformation;  // Default value is: null

  private final Integer numberOfPaymentDefaults;  // Default value is: null

  private CreditCheckCompanyResponse(Builder builder) {
      orgNumber = builder.orgNumber;
      orgName = builder.orgName;
      address = builder.address;
      postalCode = builder.postalCode;
      city = builder.city;
      incorporationDate = builder.incorporationDate;
      chairMan = builder.chairMan;
      CEO = builder.CEO;
      economy = builder.economy;
      bisnodeRatingCode = builder.bisnodeRatingCode;
      bisnodeRatingDescription = builder.bisnodeRatingDescription;
      creditLimit = builder.creditLimit;
      paymentDefaults = builder.paymentDefaults;
      requestId = builder.requestId;
      report = builder.report;
      detailedInformation = builder.detailedInformation;
      numberOfPaymentDefaults = builder.numberOfPaymentDefaults;
  }

      /**
      * Get orgNumber
      * @return orgNumber
      **/
      public Integer getOrgNumber() {return orgNumber;}

      /**
      * Get orgName
      * @return orgName
      **/
      public String getOrgName() {return orgName;}

      /**
      * Get address
      * @return address
      **/
      public String getAddress() {return address;}

      /**
      * Get postalCode
      * @return postalCode
      **/
      public String getPostalCode() {return postalCode;}

      /**
      * Get city
      * @return city
      **/
      public String getCity() {return city;}

      /**
      * Get incorporationDate
      * @return incorporationDate
      **/
      public OffsetDateTime getIncorporationDate() {return incorporationDate;}

      /**
      * Get chairMan
      * @return chairMan
      **/
      public String getChairMan() {return chairMan;}

      /**
      * Get CEO
      * @return CEO
      **/
      public String getCEO() {return CEO;}

      /**
      * Get economy
      * @return economy
      **/
      public Economy getEconomy() {return economy;}

      /**
      * Get bisnodeRatingCode
      * @return bisnodeRatingCode
      **/
      public String getBisnodeRatingCode() {return bisnodeRatingCode;}

      /**
      * Get bisnodeRatingDescription
      * @return bisnodeRatingDescription
      **/
      public String getBisnodeRatingDescription() {return bisnodeRatingDescription;}

      /**
      * Get creditLimit
      * @return creditLimit
      **/
      public Double getCreditLimit() {return creditLimit;}

      /**
      * Get paymentDefaults
      * @return paymentDefaults
      **/
      public String getPaymentDefaults() {return paymentDefaults;}

      /**
      * Get requestId
      * @return requestId
      **/
      public String getRequestId() {return requestId;}

      /**
      * Get report
      * @return report
      **/
      public String getReport() {return report;}

      /**
      * Get detailedInformation
      * @return detailedInformation
      **/
      public HentForetakResponse getDetailedInformation() {return detailedInformation;}

      /**
      * Get numberOfPaymentDefaults
      * @return numberOfPaymentDefaults
      **/
      public Integer getNumberOfPaymentDefaults() {return numberOfPaymentDefaults;}


  public static final class Builder {
      private Integer orgNumber;
      private String orgName;
      private String address;
      private String postalCode;
      private String city;
      private OffsetDateTime incorporationDate;
      private String chairMan;
      private String CEO;
      private Economy economy;
      private String bisnodeRatingCode;
      private String bisnodeRatingDescription;
      private Double creditLimit;
      private String paymentDefaults;
      private String requestId;
      private String report;
      private HentForetakResponse detailedInformation;
      private Integer numberOfPaymentDefaults;

    public Builder() {
    }

    public Builder(CreditCheckCompanyResponse copy) {
        this.orgNumber = copy.getOrgNumber();
        this.orgName = copy.getOrgName();
        this.address = copy.getAddress();
        this.postalCode = copy.getPostalCode();
        this.city = copy.getCity();
        this.incorporationDate = copy.getIncorporationDate();
        this.chairMan = copy.getChairMan();
        this.CEO = copy.getCEO();
        this.economy = copy.getEconomy();
        this.bisnodeRatingCode = copy.getBisnodeRatingCode();
        this.bisnodeRatingDescription = copy.getBisnodeRatingDescription();
        this.creditLimit = copy.getCreditLimit();
        this.paymentDefaults = copy.getPaymentDefaults();
        this.requestId = copy.getRequestId();
        this.report = copy.getReport();
        this.detailedInformation = copy.getDetailedInformation();
        this.numberOfPaymentDefaults = copy.getNumberOfPaymentDefaults();
    }

    public Builder withOrgNumber(Integer orgNumber) {
      this.orgNumber = orgNumber;
      return this;
    }

    public Builder withOrgName(String orgName) {
      this.orgName = orgName;
      return this;
    }

    public Builder withAddress(String address) {
      this.address = address;
      return this;
    }

    public Builder withPostalCode(String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    public Builder withCity(String city) {
      this.city = city;
      return this;
    }

    public Builder withIncorporationDate(OffsetDateTime incorporationDate) {
      this.incorporationDate = incorporationDate;
      return this;
    }

    public Builder withChairMan(String chairMan) {
      this.chairMan = chairMan;
      return this;
    }

    public Builder withCEO(String CEO) {
      this.CEO = CEO;
      return this;
    }

    public Builder withEconomy(Economy economy) {
      this.economy = economy;
      return this;
    }

    public Builder withBisnodeRatingCode(String bisnodeRatingCode) {
      this.bisnodeRatingCode = bisnodeRatingCode;
      return this;
    }

    public Builder withBisnodeRatingDescription(String bisnodeRatingDescription) {
      this.bisnodeRatingDescription = bisnodeRatingDescription;
      return this;
    }

    public Builder withCreditLimit(Double creditLimit) {
      this.creditLimit = creditLimit;
      return this;
    }

    public Builder withPaymentDefaults(String paymentDefaults) {
      this.paymentDefaults = paymentDefaults;
      return this;
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public Builder withReport(String report) {
      this.report = report;
      return this;
    }

    public Builder withDetailedInformation(HentForetakResponse detailedInformation) {
      this.detailedInformation = detailedInformation;
      return this;
    }

    public Builder withNumberOfPaymentDefaults(Integer numberOfPaymentDefaults) {
      this.numberOfPaymentDefaults = numberOfPaymentDefaults;
      return this;
    }


    public CreditCheckCompanyResponse build() { return new CreditCheckCompanyResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCheckCompanyResponse creditCheckCompanyResponse = (CreditCheckCompanyResponse) o;
    return Objects.equals(this.orgNumber, creditCheckCompanyResponse.orgNumber) &&
        Objects.equals(this.orgName, creditCheckCompanyResponse.orgName) &&
        Objects.equals(this.address, creditCheckCompanyResponse.address) &&
        Objects.equals(this.postalCode, creditCheckCompanyResponse.postalCode) &&
        Objects.equals(this.city, creditCheckCompanyResponse.city) &&
        Objects.equals(this.incorporationDate, creditCheckCompanyResponse.incorporationDate) &&
        Objects.equals(this.chairMan, creditCheckCompanyResponse.chairMan) &&
        Objects.equals(this.CEO, creditCheckCompanyResponse.CEO) &&
        Objects.equals(this.economy, creditCheckCompanyResponse.economy) &&
        Objects.equals(this.bisnodeRatingCode, creditCheckCompanyResponse.bisnodeRatingCode) &&
        Objects.equals(this.bisnodeRatingDescription, creditCheckCompanyResponse.bisnodeRatingDescription) &&
        Objects.equals(this.creditLimit, creditCheckCompanyResponse.creditLimit) &&
        Objects.equals(this.paymentDefaults, creditCheckCompanyResponse.paymentDefaults) &&
        Objects.equals(this.requestId, creditCheckCompanyResponse.requestId) &&
        Objects.equals(this.report, creditCheckCompanyResponse.report) &&
        Objects.equals(this.detailedInformation, creditCheckCompanyResponse.detailedInformation) &&
        Objects.equals(this.numberOfPaymentDefaults, creditCheckCompanyResponse.numberOfPaymentDefaults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgNumber, orgName, address, postalCode, city, incorporationDate, chairMan, CEO, economy, bisnodeRatingCode, bisnodeRatingDescription, creditLimit, paymentDefaults, requestId, report, detailedInformation, numberOfPaymentDefaults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCheckCompanyResponse {\n");
    
    sb.append("    orgNumber: ").append(toIndentedString(orgNumber)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    incorporationDate: ").append(toIndentedString(incorporationDate)).append("\n");
    sb.append("    chairMan: ").append(toIndentedString(chairMan)).append("\n");
    sb.append("    CEO: ").append(toIndentedString(CEO)).append("\n");
    sb.append("    economy: ").append(toIndentedString(economy)).append("\n");
    sb.append("    bisnodeRatingCode: ").append(toIndentedString(bisnodeRatingCode)).append("\n");
    sb.append("    bisnodeRatingDescription: ").append(toIndentedString(bisnodeRatingDescription)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    paymentDefaults: ").append(toIndentedString(paymentDefaults)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    detailedInformation: ").append(toIndentedString(detailedInformation)).append("\n");
    sb.append("    numberOfPaymentDefaults: ").append(toIndentedString(numberOfPaymentDefaults)).append("\n");
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
