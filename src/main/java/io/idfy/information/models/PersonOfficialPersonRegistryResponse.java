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
 * PersonOfficialPersonRegistryResponse
 */
@JsonDeserialize(builder = PersonOfficialPersonRegistryResponse.Builder.class)
public class PersonOfficialPersonRegistryResponse  implements Serializable {
  private final String firstName;  // Default value is: null

  private final String lastName;  // Default value is: null

  private final String middleName;  // Default value is: null

  private final String fullname;  // Default value is: null

  private final String address;  // Default value is: null

  private final String address2;  // Default value is: null

  private final String city;  // Default value is: null

  private final String postalCode;  // Default value is: null

  private final String gender;  // Default value is: null

  private final String rawJson;  // Default value is: null

  private final String requestId;  // Default value is: null

  private PersonOfficialPersonRegistryResponse(Builder builder) {
      firstName = builder.firstName;
      lastName = builder.lastName;
      middleName = builder.middleName;
      fullname = builder.fullname;
      address = builder.address;
      address2 = builder.address2;
      city = builder.city;
      postalCode = builder.postalCode;
      gender = builder.gender;
      rawJson = builder.rawJson;
      requestId = builder.requestId;
  }

      /**
      * Get firstName
      * @return firstName
      **/
      public String getFirstName() {return firstName;}

      /**
      * Get lastName
      * @return lastName
      **/
      public String getLastName() {return lastName;}

      /**
      * Get middleName
      * @return middleName
      **/
      public String getMiddleName() {return middleName;}

      /**
      * Get fullname
      * @return fullname
      **/
      public String getFullname() {return fullname;}

      /**
      * Get address
      * @return address
      **/
      public String getAddress() {return address;}

      /**
      * Get address2
      * @return address2
      **/
      public String getAddress2() {return address2;}

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


  public static final class Builder {
      private String firstName;
      private String lastName;
      private String middleName;
      private String fullname;
      private String address;
      private String address2;
      private String city;
      private String postalCode;
      private String gender;
      private String rawJson;
      private String requestId;

    public Builder() {
    }

    public Builder(PersonOfficialPersonRegistryResponse copy) {
        this.firstName = copy.getFirstName();
        this.lastName = copy.getLastName();
        this.middleName = copy.getMiddleName();
        this.fullname = copy.getFullname();
        this.address = copy.getAddress();
        this.address2 = copy.getAddress2();
        this.city = copy.getCity();
        this.postalCode = copy.getPostalCode();
        this.gender = copy.getGender();
        this.rawJson = copy.getRawJson();
        this.requestId = copy.getRequestId();
    }

    public Builder withFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder withMiddleName(String middleName) {
      this.middleName = middleName;
      return this;
    }

    public Builder withFullname(String fullname) {
      this.fullname = fullname;
      return this;
    }

    public Builder withAddress(String address) {
      this.address = address;
      return this;
    }

    public Builder withAddress2(String address2) {
      this.address2 = address2;
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


    public PersonOfficialPersonRegistryResponse build() { return new PersonOfficialPersonRegistryResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonOfficialPersonRegistryResponse personOfficialPersonRegistryResponse = (PersonOfficialPersonRegistryResponse) o;
    return Objects.equals(this.firstName, personOfficialPersonRegistryResponse.firstName) &&
        Objects.equals(this.lastName, personOfficialPersonRegistryResponse.lastName) &&
        Objects.equals(this.middleName, personOfficialPersonRegistryResponse.middleName) &&
        Objects.equals(this.fullname, personOfficialPersonRegistryResponse.fullname) &&
        Objects.equals(this.address, personOfficialPersonRegistryResponse.address) &&
        Objects.equals(this.address2, personOfficialPersonRegistryResponse.address2) &&
        Objects.equals(this.city, personOfficialPersonRegistryResponse.city) &&
        Objects.equals(this.postalCode, personOfficialPersonRegistryResponse.postalCode) &&
        Objects.equals(this.gender, personOfficialPersonRegistryResponse.gender) &&
        Objects.equals(this.rawJson, personOfficialPersonRegistryResponse.rawJson) &&
        Objects.equals(this.requestId, personOfficialPersonRegistryResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, middleName, fullname, address, address2, city, postalCode, gender, rawJson, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonOfficialPersonRegistryResponse {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    rawJson: ").append(toIndentedString(rawJson)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
