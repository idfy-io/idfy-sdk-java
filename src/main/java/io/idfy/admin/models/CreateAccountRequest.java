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
import io.idfy.admin.models.Address;
import io.idfy.admin.models.Contact;
import io.idfy.admin.models.DealerInfo;
import io.idfy.admin.models.Settings;
import java.io.Serializable;

/**
 * CreateAccountRequest
 */
@JsonDeserialize(builder = CreateAccountRequest.Builder.class)
public class CreateAccountRequest  implements Serializable {
  /**
   * Name of the account owner (company)
   */
  private final String name;  // Default value is: null

  /**
   * Mva / Organization number
   */
  private final String mvaNumber;  // Default value is: null

  private final String companyPhone;  // Default value is: null

  private final String companyEmail;  // Default value is: null

  private final String companyUrl;  // Default value is: null

  private final Contact contact;  // Default value is: null

  private final Address address;  // Default value is: null

  private final DealerInfo dealer;  // Default value is: null

  private final Settings settings;  // Default value is: null

  private final String country;  // Default value is: null

  private CreateAccountRequest(Builder builder) {
      name = builder.name;
      mvaNumber = builder.mvaNumber;
      companyPhone = builder.companyPhone;
      companyEmail = builder.companyEmail;
      companyUrl = builder.companyUrl;
      contact = builder.contact;
      address = builder.address;
      dealer = builder.dealer;
      settings = builder.settings;
      country = builder.country;
  }

      /**
      * Name of the account owner (company)
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Mva / Organization number
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
      * Get contact
      * @return contact
      **/
      public Contact getContact() {return contact;}

      /**
      * Get address
      * @return address
      **/
      public Address getAddress() {return address;}

      /**
      * Get dealer
      * @return dealer
      **/
      public DealerInfo getDealer() {return dealer;}

      /**
      * Get settings
      * @return settings
      **/
      public Settings getSettings() {return settings;}

      /**
      * Get country
      * @return country
      **/
      public String getCountry() {return country;}


  public static final class Builder {
      private String name;
      private String mvaNumber;
      private String companyPhone;
      private String companyEmail;
      private String companyUrl;
      private Contact contact;
      private Address address;
      private DealerInfo dealer;
      private Settings settings;
      private String country;

    public Builder() {
    }

    public Builder(CreateAccountRequest copy) {
        this.name = copy.getName();
        this.mvaNumber = copy.getMvaNumber();
        this.companyPhone = copy.getCompanyPhone();
        this.companyEmail = copy.getCompanyEmail();
        this.companyUrl = copy.getCompanyUrl();
        this.contact = copy.getContact();
        this.address = copy.getAddress();
        this.dealer = copy.getDealer();
        this.settings = copy.getSettings();
        this.country = copy.getCountry();
    }

    public Builder withName(String name) {
      this.name = name;
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

    public Builder withContact(Contact contact) {
      this.contact = contact;
      return this;
    }

    public Builder withAddress(Address address) {
      this.address = address;
      return this;
    }

    public Builder withDealer(DealerInfo dealer) {
      this.dealer = dealer;
      return this;
    }

    public Builder withSettings(Settings settings) {
      this.settings = settings;
      return this;
    }

    public Builder withCountry(String country) {
      this.country = country;
      return this;
    }


    public CreateAccountRequest build() { return new CreateAccountRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountRequest createAccountRequest = (CreateAccountRequest) o;
    return Objects.equals(this.name, createAccountRequest.name) &&
        Objects.equals(this.mvaNumber, createAccountRequest.mvaNumber) &&
        Objects.equals(this.companyPhone, createAccountRequest.companyPhone) &&
        Objects.equals(this.companyEmail, createAccountRequest.companyEmail) &&
        Objects.equals(this.companyUrl, createAccountRequest.companyUrl) &&
        Objects.equals(this.contact, createAccountRequest.contact) &&
        Objects.equals(this.address, createAccountRequest.address) &&
        Objects.equals(this.dealer, createAccountRequest.dealer) &&
        Objects.equals(this.settings, createAccountRequest.settings) &&
        Objects.equals(this.country, createAccountRequest.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mvaNumber, companyPhone, companyEmail, companyUrl, contact, address, dealer, settings, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mvaNumber: ").append(toIndentedString(mvaNumber)).append("\n");
    sb.append("    companyPhone: ").append(toIndentedString(companyPhone)).append("\n");
    sb.append("    companyEmail: ").append(toIndentedString(companyEmail)).append("\n");
    sb.append("    companyUrl: ").append(toIndentedString(companyUrl)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
