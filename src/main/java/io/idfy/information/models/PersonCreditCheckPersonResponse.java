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
import io.idfy.information.models.PersonEconomy;
import io.idfy.information.models.PersonHentPersonResponse;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * PersonCreditCheckPersonResponse
 */
@JsonDeserialize(builder = PersonCreditCheckPersonResponse.Builder.class)
public class PersonCreditCheckPersonResponse  implements Serializable {
  private final String requestId;  // Default value is: null

  private final String report;  // Default value is: null

  private final String name;  // Default value is: null

  private final String address;  // Default value is: null

  private final String city;  // Default value is: null

  private final String postalCode;  // Default value is: null

  private final Integer score;  // Default value is: null

  private final String scoreDecision;  // Default value is: null

  private final String dateOfBirth;  // Default value is: null

  private final Integer age;  // Default value is: null

  private final String gender;  // Default value is: null

  private final Integer numberOfPaymentDefaults;  // Default value is: null

  private final Double paymentDefaultsAmount;  // Default value is: null

  private final List<PersonEconomy> incomeAndFortune;  // Default value is: new ArrayList<>()

  private final PersonHentPersonResponse detailedInformation;  // Default value is: null

  private PersonCreditCheckPersonResponse(Builder builder) {
      requestId = builder.requestId;
      report = builder.report;
      name = builder.name;
      address = builder.address;
      city = builder.city;
      postalCode = builder.postalCode;
      score = builder.score;
      scoreDecision = builder.scoreDecision;
      dateOfBirth = builder.dateOfBirth;
      age = builder.age;
      gender = builder.gender;
      numberOfPaymentDefaults = builder.numberOfPaymentDefaults;
      paymentDefaultsAmount = builder.paymentDefaultsAmount;
      incomeAndFortune = builder.incomeAndFortune;
      detailedInformation = builder.detailedInformation;
  }

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
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get address
      * @return address
      **/
      public String getAddress() {return address;}

      /**
      * Get city
      * @return city
      **/
      public String getCity() {return city;}

      /**
      * Get postalCode
      * @return postalCode
      **/
      public String getPostalCode() {return postalCode;}

      /**
      * Get score
      * @return score
      **/
      public Integer getScore() {return score;}

      /**
      * Get scoreDecision
      * @return scoreDecision
      **/
      public String getScoreDecision() {return scoreDecision;}

      /**
      * Get dateOfBirth
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}

      /**
      * Get age
      * @return age
      **/
      public Integer getAge() {return age;}

      /**
      * Get gender
      * @return gender
      **/
      public String getGender() {return gender;}

      /**
      * Get numberOfPaymentDefaults
      * @return numberOfPaymentDefaults
      **/
      public Integer getNumberOfPaymentDefaults() {return numberOfPaymentDefaults;}

      /**
      * Get paymentDefaultsAmount
      * @return paymentDefaultsAmount
      **/
      public Double getPaymentDefaultsAmount() {return paymentDefaultsAmount;}

      /**
      * Get incomeAndFortune
      * @return incomeAndFortune
      **/
      public List<PersonEconomy> getIncomeAndFortune() {return incomeAndFortune;}

      /**
      * Get detailedInformation
      * @return detailedInformation
      **/
      public PersonHentPersonResponse getDetailedInformation() {return detailedInformation;}


  public static final class Builder {
      private String requestId;
      private String report;
      private String name;
      private String address;
      private String city;
      private String postalCode;
      private Integer score;
      private String scoreDecision;
      private String dateOfBirth;
      private Integer age;
      private String gender;
      private Integer numberOfPaymentDefaults;
      private Double paymentDefaultsAmount;
      private List<PersonEconomy> incomeAndFortune;
      private PersonHentPersonResponse detailedInformation;

    public Builder() {
    }

    public Builder(PersonCreditCheckPersonResponse copy) {
        this.requestId = copy.getRequestId();
        this.report = copy.getReport();
        this.name = copy.getName();
        this.address = copy.getAddress();
        this.city = copy.getCity();
        this.postalCode = copy.getPostalCode();
        this.score = copy.getScore();
        this.scoreDecision = copy.getScoreDecision();
        this.dateOfBirth = copy.getDateOfBirth();
        this.age = copy.getAge();
        this.gender = copy.getGender();
        this.numberOfPaymentDefaults = copy.getNumberOfPaymentDefaults();
        this.paymentDefaultsAmount = copy.getPaymentDefaultsAmount();
        this.incomeAndFortune = copy.getIncomeAndFortune();
        this.detailedInformation = copy.getDetailedInformation();
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public Builder withReport(String report) {
      this.report = report;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withAddress(String address) {
      this.address = address;
      return this;
    }

    public Builder withCity(String city) {
      this.city = city;
      return this;
    }

    public Builder withPostalCode(String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    public Builder withScore(Integer score) {
      this.score = score;
      return this;
    }

    public Builder withScoreDecision(String scoreDecision) {
      this.scoreDecision = scoreDecision;
      return this;
    }

    public Builder withDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder withAge(Integer age) {
      this.age = age;
      return this;
    }

    public Builder withGender(String gender) {
      this.gender = gender;
      return this;
    }

    public Builder withNumberOfPaymentDefaults(Integer numberOfPaymentDefaults) {
      this.numberOfPaymentDefaults = numberOfPaymentDefaults;
      return this;
    }

    public Builder withPaymentDefaultsAmount(Double paymentDefaultsAmount) {
      this.paymentDefaultsAmount = paymentDefaultsAmount;
      return this;
    }

    public Builder withIncomeAndFortune(List<PersonEconomy> incomeAndFortune) {
      this.incomeAndFortune = incomeAndFortune;
      return this;
    }

    public Builder addIncomeAndFortuneItem(PersonEconomy incomeAndFortuneItem) {
      if (this.incomeAndFortune == null) {
        this.incomeAndFortune = new ArrayList<>();
      }
      this.incomeAndFortune.add(incomeAndFortuneItem);
      return this;
    }

    public Builder withDetailedInformation(PersonHentPersonResponse detailedInformation) {
      this.detailedInformation = detailedInformation;
      return this;
    }


    public PersonCreditCheckPersonResponse build() { return new PersonCreditCheckPersonResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonCreditCheckPersonResponse personCreditCheckPersonResponse = (PersonCreditCheckPersonResponse) o;
    return Objects.equals(this.requestId, personCreditCheckPersonResponse.requestId) &&
        Objects.equals(this.report, personCreditCheckPersonResponse.report) &&
        Objects.equals(this.name, personCreditCheckPersonResponse.name) &&
        Objects.equals(this.address, personCreditCheckPersonResponse.address) &&
        Objects.equals(this.city, personCreditCheckPersonResponse.city) &&
        Objects.equals(this.postalCode, personCreditCheckPersonResponse.postalCode) &&
        Objects.equals(this.score, personCreditCheckPersonResponse.score) &&
        Objects.equals(this.scoreDecision, personCreditCheckPersonResponse.scoreDecision) &&
        Objects.equals(this.dateOfBirth, personCreditCheckPersonResponse.dateOfBirth) &&
        Objects.equals(this.age, personCreditCheckPersonResponse.age) &&
        Objects.equals(this.gender, personCreditCheckPersonResponse.gender) &&
        Objects.equals(this.numberOfPaymentDefaults, personCreditCheckPersonResponse.numberOfPaymentDefaults) &&
        Objects.equals(this.paymentDefaultsAmount, personCreditCheckPersonResponse.paymentDefaultsAmount) &&
        Objects.equals(this.incomeAndFortune, personCreditCheckPersonResponse.incomeAndFortune) &&
        Objects.equals(this.detailedInformation, personCreditCheckPersonResponse.detailedInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, report, name, address, city, postalCode, score, scoreDecision, dateOfBirth, age, gender, numberOfPaymentDefaults, paymentDefaultsAmount, incomeAndFortune, detailedInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonCreditCheckPersonResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    scoreDecision: ").append(toIndentedString(scoreDecision)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    numberOfPaymentDefaults: ").append(toIndentedString(numberOfPaymentDefaults)).append("\n");
    sb.append("    paymentDefaultsAmount: ").append(toIndentedString(paymentDefaultsAmount)).append("\n");
    sb.append("    incomeAndFortune: ").append(toIndentedString(incomeAndFortune)).append("\n");
    sb.append("    detailedInformation: ").append(toIndentedString(detailedInformation)).append("\n");
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
