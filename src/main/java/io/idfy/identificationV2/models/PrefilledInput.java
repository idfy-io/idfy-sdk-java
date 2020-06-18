/*
 * Idfy Identification v2
 * This endpoint enables identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID.
 *
 * OpenAPI spec version: v2
 * Contact: support@idfy.io
 */
package io.idfy.identificationV2.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.io.Serializable;

/**
 * Prefilled input values.
 */
@JsonDeserialize(builder = PrefilledInput.Builder.class)
public class PrefilledInput  implements Serializable {
  /**
   * Prefill the user's national identity number.
   */
  private final String nin;  // Default value is: null

  /**
   * Prefill the user's phone number. Must be prefixed with country code.
   */
  private final String phoneNumber;  // Default value is: null

  /**
   * Prefill the user's date of birth (YYYY-MM-DD).
   */
  private final String dateOfBirth;  // Default value is: null

  /**
   * Prefill the user's username.
   */
  private final String username;  // Default value is: null

  private PrefilledInput(Builder builder) {
      nin = builder.nin;
      phoneNumber = builder.phoneNumber;
      dateOfBirth = builder.dateOfBirth;
      username = builder.username;
  }

      /**
      * Prefill the user's national identity number.
      * @return nin
      **/
      public String getNin() {return nin;}

      /**
      * Prefill the user's phone number. Must be prefixed with country code.
      * @return phoneNumber
      **/
      public String getPhoneNumber() {return phoneNumber;}

      /**
      * Prefill the user's date of birth (YYYY-MM-DD).
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}

      /**
      * Prefill the user's username.
      * @return username
      **/
      public String getUsername() {return username;}


  public static final class Builder {
      private String nin;
      private String phoneNumber;
      private String dateOfBirth;
      private String username;

    public Builder() {
    }

    public Builder(PrefilledInput copy) {
        this.nin = copy.getNin();
        this.phoneNumber = copy.getPhoneNumber();
        this.dateOfBirth = copy.getDateOfBirth();
        this.username = copy.getUsername();
    }

    public Builder withNin(String nin) {
      this.nin = nin;
      return this;
    }

    public Builder withPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public Builder withDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder withUsername(String username) {
      this.username = username;
      return this;
    }


    public PrefilledInput build() { return new PrefilledInput(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefilledInput prefilledInput = (PrefilledInput) o;
    return Objects.equals(this.nin, prefilledInput.nin) &&
        Objects.equals(this.phoneNumber, prefilledInput.phoneNumber) &&
        Objects.equals(this.dateOfBirth, prefilledInput.dateOfBirth) &&
        Objects.equals(this.username, prefilledInput.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nin, phoneNumber, dateOfBirth, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefilledInput {\n");
    
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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