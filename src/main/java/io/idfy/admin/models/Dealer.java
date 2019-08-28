/*
 * Idfy.Admin
 * In this API you can manage your account details, logo, styling or manage your openid / oauth api clients. If you are a dealer you can also manage the accounts registered to this dealer.   ## Last update   Last build date for this API: 14.01.2018  
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.admin.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import io.idfy.admin.models.Onboarding;
import java.util.UUID;
import java.io.Serializable;

/**
 * Dealer
 */
@JsonDeserialize(builder = Dealer.Builder.class)
public class Dealer  implements Serializable {
  private final UUID id;  // Default value is: null

  private final String name;  // Default value is: null

  private final Integer customerNumber;  // Default value is: null

  private final String mvaNumber;  // Default value is: null

  private final String companyPhone;  // Default value is: null

  private final String companyEmail;  // Default value is: null

  private final String companyUrl;  // Default value is: null

  private final Onboarding onboarding;  // Default value is: null

  private Dealer(Builder builder) {
      id = builder.id;
      name = builder.name;
      customerNumber = builder.customerNumber;
      mvaNumber = builder.mvaNumber;
      companyPhone = builder.companyPhone;
      companyEmail = builder.companyEmail;
      companyUrl = builder.companyUrl;
      onboarding = builder.onboarding;
  }

      /**
      * Get id
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get customerNumber
      * @return customerNumber
      **/
      public Integer getCustomerNumber() {return customerNumber;}

      /**
      * Get mvaNumber
      * @return mvaNumber
      **/
      public String getMvaNumber() {return mvaNumber;}

      /**
      * Get companyPhone
      * @return companyPhone
      **/
      public String getCompanyPhone() {return companyPhone;}

      /**
      * Get companyEmail
      * @return companyEmail
      **/
      public String getCompanyEmail() {return companyEmail;}

      /**
      * Get companyUrl
      * @return companyUrl
      **/
      public String getCompanyUrl() {return companyUrl;}

      /**
      * Get onboarding
      * @return onboarding
      **/
      public Onboarding getOnboarding() {return onboarding;}


  public static final class Builder {
      private UUID id;
      private String name;
      private Integer customerNumber;
      private String mvaNumber;
      private String companyPhone;
      private String companyEmail;
      private String companyUrl;
      private Onboarding onboarding;

    public Builder() {
    }

    public Builder(Dealer copy) {
        this.id = copy.getId();
        this.name = copy.getName();
        this.customerNumber = copy.getCustomerNumber();
        this.mvaNumber = copy.getMvaNumber();
        this.companyPhone = copy.getCompanyPhone();
        this.companyEmail = copy.getCompanyEmail();
        this.companyUrl = copy.getCompanyUrl();
        this.onboarding = copy.getOnboarding();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withCustomerNumber(Integer customerNumber) {
      this.customerNumber = customerNumber;
      return this;
    }

    public Builder withMvaNumber(String mvaNumber) {
      this.mvaNumber = mvaNumber;
      return this;
    }

    public Builder withCompanyPhone(String companyPhone) {
      this.companyPhone = companyPhone;
      return this;
    }

    public Builder withCompanyEmail(String companyEmail) {
      this.companyEmail = companyEmail;
      return this;
    }

    public Builder withCompanyUrl(String companyUrl) {
      this.companyUrl = companyUrl;
      return this;
    }

    public Builder withOnboarding(Onboarding onboarding) {
      this.onboarding = onboarding;
      return this;
    }


    public Dealer build() { return new Dealer(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dealer dealer = (Dealer) o;
    return Objects.equals(this.id, dealer.id) &&
        Objects.equals(this.name, dealer.name) &&
        Objects.equals(this.customerNumber, dealer.customerNumber) &&
        Objects.equals(this.mvaNumber, dealer.mvaNumber) &&
        Objects.equals(this.companyPhone, dealer.companyPhone) &&
        Objects.equals(this.companyEmail, dealer.companyEmail) &&
        Objects.equals(this.companyUrl, dealer.companyUrl) &&
        Objects.equals(this.onboarding, dealer.onboarding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, customerNumber, mvaNumber, companyPhone, companyEmail, companyUrl, onboarding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dealer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    mvaNumber: ").append(toIndentedString(mvaNumber)).append("\n");
    sb.append("    companyPhone: ").append(toIndentedString(companyPhone)).append("\n");
    sb.append("    companyEmail: ").append(toIndentedString(companyEmail)).append("\n");
    sb.append("    companyUrl: ").append(toIndentedString(companyUrl)).append("\n");
    sb.append("    onboarding: ").append(toIndentedString(onboarding)).append("\n");
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
