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
import io.idfy.information.models.Role;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Data retrieved before the actual screening (data enhancement).
 */
@JsonDeserialize(builder = VerifiedPerson.Builder.class)
public class VerifiedPerson  implements Serializable {
  /**
   * Gets or Sets status
   */
  public enum Status {
    @JsonProperty("UNKNOWN")
    UNKNOWN("UNKNOWN"),
    
    @JsonProperty("EMIGRATED")
    EMIGRATED("EMIGRATED"),
    
    @JsonProperty("BANKRUPT")
    BANKRUPT("BANKRUPT"),
    
    @JsonProperty("PROTECTED")
    PROTECTED("PROTECTED"),
    
    @JsonProperty("NO_ADDRESS")
    NO_ADDRESS("NO_ADDRESS"),
    
    @JsonProperty("DECEASED")
    DECEASED("DECEASED"),
    
    @JsonProperty("GUARDIANSHIP")
    GUARDIANSHIP("GUARDIANSHIP");

    private String value;

    Status(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Status fromValue(String text) {
      for (Status b : Status.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Person status code, e.g. DECEASED, EMIGRATED
   */
  private final List<Status> status;  // Default value is: new ArrayList<>()

  /**
   * Date of death
   */
  private final OffsetDateTime deceasedDate;  // Default value is: null

  /**
   * Date of emigration
   */
  private final OffsetDateTime emigratedDate;  // Default value is: null

  /**
   * Role in company
   */
  private final List<Role> roles;  // Default value is: new ArrayList<>()

  /**
   * Name of data provider
   */
  private final String provider;  // Default value is: null

  /**
   * Name of person
   */
  private final String name;  // Default value is: null

  /**
   * Gender of person
   */
  public enum Gender {
    @JsonProperty("MALE")
    MALE("MALE"),
    
    @JsonProperty("FEMALE")
    FEMALE("FEMALE"),
    
    @JsonProperty("UNKNOWN")
    UNKNOWN("UNKNOWN");

    private String value;

    Gender(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Gender fromValue(String text) {
      for (Gender b : Gender.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Gender of person
   */
  private final Gender gender;  // Default value is: null

  /**
   * National Identification Number
   */
  private final String natIdNo;  // Default value is: null

  /**
   * Two-letter code as specified in the ISO 3166 standard
   */
  private final String nationality;  // Default value is: null

  /**
   * Date of birth for the person
   */
  private final String birthDate;  // Default value is: null

  private VerifiedPerson(Builder builder) {
      status = builder.status;
      deceasedDate = builder.deceasedDate;
      emigratedDate = builder.emigratedDate;
      roles = builder.roles;
      provider = builder.provider;
      name = builder.name;
      gender = builder.gender;
      natIdNo = builder.natIdNo;
      nationality = builder.nationality;
      birthDate = builder.birthDate;
  }

      /**
      * Person status code, e.g. DECEASED, EMIGRATED
      * @return status
      **/
      public List<Status> getStatus() {return status;}

      /**
      * Date of death
      * @return deceasedDate
      **/
      public OffsetDateTime getDeceasedDate() {return deceasedDate;}

      /**
      * Date of emigration
      * @return emigratedDate
      **/
      public OffsetDateTime getEmigratedDate() {return emigratedDate;}

      /**
      * Role in company
      * @return roles
      **/
      public List<Role> getRoles() {return roles;}

      /**
      * Name of data provider
      * @return provider
      **/
      public String getProvider() {return provider;}

      /**
      * Name of person
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Gender of person
      * @return gender
      **/
      public Gender getGender() {return gender;}

      /**
      * National Identification Number
      * @return natIdNo
      **/
      public String getNatIdNo() {return natIdNo;}

      /**
      * Two-letter code as specified in the ISO 3166 standard
      * @return nationality
      **/
      public String getNationality() {return nationality;}

      /**
      * Date of birth for the person
      * @return birthDate
      **/
      public String getBirthDate() {return birthDate;}


  public static final class Builder {
      private List<Status> status;
      private OffsetDateTime deceasedDate;
      private OffsetDateTime emigratedDate;
      private List<Role> roles;
      private String provider;
      private String name;
      private Gender gender;
      private String natIdNo;
      private String nationality;
      private String birthDate;

    public Builder() {
    }

    public Builder(VerifiedPerson copy) {
        this.status = copy.getStatus();
        this.deceasedDate = copy.getDeceasedDate();
        this.emigratedDate = copy.getEmigratedDate();
        this.roles = copy.getRoles();
        this.provider = copy.getProvider();
        this.name = copy.getName();
        this.gender = copy.getGender();
        this.natIdNo = copy.getNatIdNo();
        this.nationality = copy.getNationality();
        this.birthDate = copy.getBirthDate();
    }

    public Builder withStatus(List<Status> status) {
      this.status = status;
      return this;
    }

    public Builder addStatusItem(Status statusItem) {
      if (this.status == null) {
        this.status = new ArrayList<>();
      }
      this.status.add(statusItem);
      return this;
    }

    public Builder withDeceasedDate(OffsetDateTime deceasedDate) {
      this.deceasedDate = deceasedDate;
      return this;
    }

    public Builder withEmigratedDate(OffsetDateTime emigratedDate) {
      this.emigratedDate = emigratedDate;
      return this;
    }

    public Builder withRoles(List<Role> roles) {
      this.roles = roles;
      return this;
    }

    public Builder addRolesItem(Role rolesItem) {
      if (this.roles == null) {
        this.roles = new ArrayList<>();
      }
      this.roles.add(rolesItem);
      return this;
    }

    public Builder withProvider(String provider) {
      this.provider = provider;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withGender(Gender gender) {
      this.gender = gender;
      return this;
    }

    public Builder withNatIdNo(String natIdNo) {
      this.natIdNo = natIdNo;
      return this;
    }

    public Builder withNationality(String nationality) {
      this.nationality = nationality;
      return this;
    }

    public Builder withBirthDate(String birthDate) {
      this.birthDate = birthDate;
      return this;
    }


    public VerifiedPerson build() { return new VerifiedPerson(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiedPerson verifiedPerson = (VerifiedPerson) o;
    return Objects.equals(this.status, verifiedPerson.status) &&
        Objects.equals(this.deceasedDate, verifiedPerson.deceasedDate) &&
        Objects.equals(this.emigratedDate, verifiedPerson.emigratedDate) &&
        Objects.equals(this.roles, verifiedPerson.roles) &&
        Objects.equals(this.provider, verifiedPerson.provider) &&
        Objects.equals(this.name, verifiedPerson.name) &&
        Objects.equals(this.gender, verifiedPerson.gender) &&
        Objects.equals(this.natIdNo, verifiedPerson.natIdNo) &&
        Objects.equals(this.nationality, verifiedPerson.nationality) &&
        Objects.equals(this.birthDate, verifiedPerson.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, deceasedDate, emigratedDate, roles, provider, name, gender, natIdNo, nationality, birthDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiedPerson {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deceasedDate: ").append(toIndentedString(deceasedDate)).append("\n");
    sb.append("    emigratedDate: ").append(toIndentedString(emigratedDate)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    natIdNo: ").append(toIndentedString(natIdNo)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
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
