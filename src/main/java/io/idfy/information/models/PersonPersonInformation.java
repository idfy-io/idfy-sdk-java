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
 * PersonPersonInformation
 */
@JsonDeserialize(builder = PersonPersonInformation.Builder.class)
public class PersonPersonInformation  implements Serializable {
  private final String firstname;  // Default value is: null

  private final String middlename;  // Default value is: null

  private final String lastname;  // Default value is: null

  private final String dateOfBirth;  // Default value is: null

  private final String address;  // Default value is: null

  private final String zipCode;  // Default value is: null

  private final String city;  // Default value is: null

  private final String mobile;  // Default value is: null

  private final String phone;  // Default value is: null

  private final String gender;  // Default value is: null

  private final String rawJson;  // Default value is: null

  private final String requestId;  // Default value is: null

  private final OffsetDateTime dead;  // Default value is: null

  private final String source;  // Default value is: null

  private PersonPersonInformation(Builder builder) {
      firstname = builder.firstname;
      middlename = builder.middlename;
      lastname = builder.lastname;
      dateOfBirth = builder.dateOfBirth;
      address = builder.address;
      zipCode = builder.zipCode;
      city = builder.city;
      mobile = builder.mobile;
      phone = builder.phone;
      gender = builder.gender;
      rawJson = builder.rawJson;
      requestId = builder.requestId;
      dead = builder.dead;
      source = builder.source;
  }

      /**
      * Get firstname
      * @return firstname
      **/
      public String getFirstname() {return firstname;}

      /**
      * Get middlename
      * @return middlename
      **/
      public String getMiddlename() {return middlename;}

      /**
      * Get lastname
      * @return lastname
      **/
      public String getLastname() {return lastname;}

      /**
      * Get dateOfBirth
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}

      /**
      * Get address
      * @return address
      **/
      public String getAddress() {return address;}

      /**
      * Get zipCode
      * @return zipCode
      **/
      public String getZipCode() {return zipCode;}

      /**
      * Get city
      * @return city
      **/
      public String getCity() {return city;}

      /**
      * Get mobile
      * @return mobile
      **/
      public String getMobile() {return mobile;}

      /**
      * Get phone
      * @return phone
      **/
      public String getPhone() {return phone;}

      /**
      * Get gender
      * @return gender
      **/
      public String getGender() {return gender;}

      /**
      * Get rawJson
      * @return rawJson
      **/
      public String getRawJson() {return rawJson;}

      /**
      * Get requestId
      * @return requestId
      **/
      public String getRequestId() {return requestId;}

      /**
      * Get dead
      * @return dead
      **/
      public OffsetDateTime getDead() {return dead;}

      /**
      * Get source
      * @return source
      **/
      public String getSource() {return source;}


  public static final class Builder {
      private String firstname;
      private String middlename;
      private String lastname;
      private String dateOfBirth;
      private String address;
      private String zipCode;
      private String city;
      private String mobile;
      private String phone;
      private String gender;
      private String rawJson;
      private String requestId;
      private OffsetDateTime dead;
      private String source;

    public Builder() {
    }

    public Builder(PersonPersonInformation copy) {
        this.firstname = copy.getFirstname();
        this.middlename = copy.getMiddlename();
        this.lastname = copy.getLastname();
        this.dateOfBirth = copy.getDateOfBirth();
        this.address = copy.getAddress();
        this.zipCode = copy.getZipCode();
        this.city = copy.getCity();
        this.mobile = copy.getMobile();
        this.phone = copy.getPhone();
        this.gender = copy.getGender();
        this.rawJson = copy.getRawJson();
        this.requestId = copy.getRequestId();
        this.dead = copy.getDead();
        this.source = copy.getSource();
    }

    public Builder withFirstname(String firstname) {
      this.firstname = firstname;
      return this;
    }

    public Builder withMiddlename(String middlename) {
      this.middlename = middlename;
      return this;
    }

    public Builder withLastname(String lastname) {
      this.lastname = lastname;
      return this;
    }

    public Builder withDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder withAddress(String address) {
      this.address = address;
      return this;
    }

    public Builder withZipCode(String zipCode) {
      this.zipCode = zipCode;
      return this;
    }

    public Builder withCity(String city) {
      this.city = city;
      return this;
    }

    public Builder withMobile(String mobile) {
      this.mobile = mobile;
      return this;
    }

    public Builder withPhone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder withGender(String gender) {
      this.gender = gender;
      return this;
    }

    public Builder withRawJson(String rawJson) {
      this.rawJson = rawJson;
      return this;
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public Builder withDead(OffsetDateTime dead) {
      this.dead = dead;
      return this;
    }

    public Builder withSource(String source) {
      this.source = source;
      return this;
    }


    public PersonPersonInformation build() { return new PersonPersonInformation(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonPersonInformation personPersonInformation = (PersonPersonInformation) o;
    return Objects.equals(this.firstname, personPersonInformation.firstname) &&
        Objects.equals(this.middlename, personPersonInformation.middlename) &&
        Objects.equals(this.lastname, personPersonInformation.lastname) &&
        Objects.equals(this.dateOfBirth, personPersonInformation.dateOfBirth) &&
        Objects.equals(this.address, personPersonInformation.address) &&
        Objects.equals(this.zipCode, personPersonInformation.zipCode) &&
        Objects.equals(this.city, personPersonInformation.city) &&
        Objects.equals(this.mobile, personPersonInformation.mobile) &&
        Objects.equals(this.phone, personPersonInformation.phone) &&
        Objects.equals(this.gender, personPersonInformation.gender) &&
        Objects.equals(this.rawJson, personPersonInformation.rawJson) &&
        Objects.equals(this.requestId, personPersonInformation.requestId) &&
        Objects.equals(this.dead, personPersonInformation.dead) &&
        Objects.equals(this.source, personPersonInformation.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, middlename, lastname, dateOfBirth, address, zipCode, city, mobile, phone, gender, rawJson, requestId, dead, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonPersonInformation {\n");
    
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    middlename: ").append(toIndentedString(middlename)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    rawJson: ").append(toIndentedString(rawJson)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    dead: ").append(toIndentedString(dead)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
