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
import io.idfy.admin.models.Resources;
import io.idfy.admin.models.Settings;
import java.util.UUID;
import java.io.Serializable;

/**
 * Account
 */
@JsonDeserialize(builder = Account.Builder.class)
public class Account  implements Serializable {
  /**
   * Account Id
   */
  private final UUID id;  // Default value is: null

  /**
   * Uni micro customer number
   */
  private final String customerNumber;  // Default value is: null

  private final Resources resources;  // Default value is: null

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

  private Account(Builder builder) {
      id = builder.id;
      customerNumber = builder.customerNumber;
      resources = builder.resources;
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
      * Account Id
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * Uni micro customer number
      * @return customerNumber
      **/
      public String getCustomerNumber() {return customerNumber;}

      /**
      * Get resources
      * @return resources
      **/
      public Resources getResources() {return resources;}

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
      private UUID id;
      private String customerNumber;
      private Resources resources;
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

    public Builder(Account copy) {
        this.id = copy.getId();
        this.customerNumber = copy.getCustomerNumber();
        this.resources = copy.getResources();
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

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withCustomerNumber(String customerNumber) {
      this.customerNumber = customerNumber;
      return this;
    }

    public Builder withResources(Resources resources) {
      this.resources = resources;
      return this;
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


    public Account build() { return new Account(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.customerNumber, account.customerNumber) &&
        Objects.equals(this.resources, account.resources) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.mvaNumber, account.mvaNumber) &&
        Objects.equals(this.companyPhone, account.companyPhone) &&
        Objects.equals(this.companyEmail, account.companyEmail) &&
        Objects.equals(this.companyUrl, account.companyUrl) &&
        Objects.equals(this.contact, account.contact) &&
        Objects.equals(this.address, account.address) &&
        Objects.equals(this.dealer, account.dealer) &&
        Objects.equals(this.settings, account.settings) &&
        Objects.equals(this.country, account.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerNumber, resources, name, mvaNumber, companyPhone, companyEmail, companyUrl, contact, address, dealer, settings, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
