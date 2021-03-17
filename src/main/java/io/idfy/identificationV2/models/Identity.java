/*
 * Idfy Identification v2
 * This endpoint enables identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID.
 *
 * OpenAPI spec version: v2
 * Contact: support@idfy.io
 */
package io.idfy.identificationV2.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Details about the identified user. Only available if session has status &#x60;success&#x60;.
 */
@JsonDeserialize(builder = Identity.Builder.class)
public class Identity  implements Serializable {
  /**
   * The user's unique ID from the eID provider.
   */
  private final String providerId;  // Default value is: null

  /**
   * Full name.
   */
  private final String fullName;  // Default value is: null

  /**
   * First name.
   */
  private final String firstName;  // Default value is: null

  /**
   * Middle name.
   */
  private final String middleName;  // Default value is: null

  /**
   * Last name.
   */
  private final String lastName;  // Default value is: null

  /**
   * Date of birth.
   */
  private final String dateOfBirth;  // Default value is: null

  /**
   * National identity number.
   */
  private final String nin;  // Default value is: null

  /**
   * Phone number.
   */
  private final String phoneNumber;  // Default value is: null

  /**
   * Email address.
   */
  private final String email;  // Default value is: null

  private Identity(Builder builder) {
      providerId = builder.providerId;
      fullName = builder.fullName;
      firstName = builder.firstName;
      middleName = builder.middleName;
      lastName = builder.lastName;
      dateOfBirth = builder.dateOfBirth;
      nin = builder.nin;
      phoneNumber = builder.phoneNumber;
      email = builder.email;
  }

      /**
      * The user's unique ID from the eID provider.
      * @return providerId
      **/
      public String getProviderId() {return providerId;}

      /**
      * Full name.
      * @return fullName
      **/
      public String getFullName() {return fullName;}

      /**
      * First name.
      * @return firstName
      **/
      public String getFirstName() {return firstName;}

      /**
      * Middle name.
      * @return middleName
      **/
      public String getMiddleName() {return middleName;}

      /**
      * Last name.
      * @return lastName
      **/
      public String getLastName() {return lastName;}

      /**
      * Date of birth.
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}

      /**
      * National identity number.
      * @return nin
      **/
      public String getNin() {return nin;}

      /**
      * Phone number.
      * @return phoneNumber
      **/
      public String getPhoneNumber() {return phoneNumber;}

      /**
      * Email address.
      * @return email
      **/
      public String getEmail() {return email;}


  public static final class Builder {
      private String providerId;
      private String fullName;
      private String firstName;
      private String middleName;
      private String lastName;
      private String dateOfBirth;
      private String nin;
      private String phoneNumber;
      private String email;

    public Builder() {
    }

    public Builder(Identity copy) {
        this.providerId = copy.getProviderId();
        this.fullName = copy.getFullName();
        this.firstName = copy.getFirstName();
        this.middleName = copy.getMiddleName();
        this.lastName = copy.getLastName();
        this.dateOfBirth = copy.getDateOfBirth();
        this.nin = copy.getNin();
        this.phoneNumber = copy.getPhoneNumber();
        this.email = copy.getEmail();
    }

    public Builder withProviderId(String providerId) {
      this.providerId = providerId;
      return this;
    }

    public Builder withFullName(String fullName) {
      this.fullName = fullName;
      return this;
    }

    public Builder withFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder withMiddleName(String middleName) {
      this.middleName = middleName;
      return this;
    }

    public Builder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder withDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder withNin(String nin) {
      this.nin = nin;
      return this;
    }

    public Builder withPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public Builder withEmail(String email) {
      this.email = email;
      return this;
    }


    public Identity build() { return new Identity(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.providerId, identity.providerId) &&
        Objects.equals(this.fullName, identity.fullName) &&
        Objects.equals(this.firstName, identity.firstName) &&
        Objects.equals(this.middleName, identity.middleName) &&
        Objects.equals(this.lastName, identity.lastName) &&
        Objects.equals(this.dateOfBirth, identity.dateOfBirth) &&
        Objects.equals(this.nin, identity.nin) &&
        Objects.equals(this.phoneNumber, identity.phoneNumber) &&
        Objects.equals(this.email, identity.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, fullName, firstName, middleName, lastName, dateOfBirth, nin, phoneNumber, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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