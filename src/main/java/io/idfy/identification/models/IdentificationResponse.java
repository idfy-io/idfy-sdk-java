/*
 * Idfy Identification
 * This endpoint enables authentication/identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID. ## Last update   Last build date for this endpoint: 02.04.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.identification.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import io.idfy.identification.models.EnvironmentInfo;
import io.idfy.identification.models.Error;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * The reponse for the identity process. Contains users name, id number etc
 */
@JsonDeserialize(builder = IdentificationResponse.Builder.class)
public class IdentificationResponse  implements Serializable {
  /**
   * The fullname of the user as reported back from the IdentityProvider
   */
  private final String name;  // Default value is: null

  /**
   * The first name of the user
   */
  private final String firstName;  // Default value is: null

  /**
   * The middle name of the user (not always available)
   */
  private final String middleName;  // Default value is: null

  /**
   * The last name of the user
   */
  private final String lastName;  // Default value is: null

  /**
   * The users date of birth (not always available)
   */
  private final String dateOfBirth;  // Default value is: null

  /**
   * The status of the identification process. If not success the identification process is not completed.
   */
  public enum Status {
    @JsonProperty("UNKNOWN")
    UNKNOWN("UNKNOWN"),
    
    @JsonProperty("SUCCESS")
    SUCCESS("SUCCESS"),
    
    @JsonProperty("ERROR")
    ERROR("ERROR"),
    
    @JsonProperty("USERABORTED")
    USERABORTED("USERABORTED"),
    
    @JsonProperty("INVALIDATED")
    INVALIDATED("INVALIDATED"),
    
    @JsonProperty("TIMEOUT")
    TIMEOUT("TIMEOUT"),
    
    @JsonProperty("CREATED")
    CREATED("CREATED"),
    
    @JsonProperty("USERINITIATED")
    USERINITIATED("USERINITIATED");

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
   * The status of the identification process. If not success the identification process is not completed.
   */
  private final Status status;  // Default value is: null

  /**
   * The social security number for the user (if allowed and if the GetSocialSecurityNumber is set to true in the request)
   */
  private final String socialSecurityNumber;  // Default value is: null

  /**
   * The uniqueID from the e-ID, this ID is unique for the user and is the same every time the user logs on. This is not a sensitiv ID and you could store this to identify the user in you database.  Remark: The Swedish BankID do not have an unique ID.
   */
  private final String identityProviderUniqueId;  // Default value is: null

  /**
   * The identityprovider type (Norwegian BanKID, SwedishBankID, Nemid, etc)
   */
  public enum IdentityProvider {
    @JsonProperty("UNKNOWN")
    UNKNOWN("UNKNOWN"),
    
    @JsonProperty("NO_BANKID_MOBILE")
    NO_BANKID_MOBILE("NO_BANKID_MOBILE"),
    
    @JsonProperty("NO_BANKID_WEB")
    NO_BANKID_WEB("NO_BANKID_WEB"),
    
    @JsonProperty("SWE_BANKID")
    SWE_BANKID("SWE_BANKID"),
    
    @JsonProperty("SWE_BANKID_MOBILE")
    SWE_BANKID_MOBILE("SWE_BANKID_MOBILE"),
    
    @JsonProperty("NO_BUYPASS")
    NO_BUYPASS("NO_BUYPASS"),
    
    @JsonProperty("DA_NEMID")
    DA_NEMID("DA_NEMID"),
    
    @JsonProperty("FI_TUPAS")
    FI_TUPAS("FI_TUPAS"),
    
    @JsonProperty("FI_MOBIILIVARMENNE")
    FI_MOBIILIVARMENNE("FI_MOBIILIVARMENNE");

    private String value;

    IdentityProvider(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdentityProvider fromValue(String text) {
      for (IdentityProvider b : IdentityProvider.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The identityprovider type (Norwegian BanKID, SwedishBankID, Nemid, etc)
   */
  private final IdentityProvider identityProvider;  // Default value is: null

  /**
   * Information about error if the identification process failed. (Only set if an error occured, if not is null)
   */
  private final Error error;  // Default value is: null

  /**
   * Information about the users environment as seen by IdentiSign, can be used to compare with own data.
   */
  private final EnvironmentInfo environmentInfo;  // Default value is: null

  /**
   * A dicitonary with extra information from each identityprovider, and extra services. See developer documentation for more information
   */
  private final Map<String, String> metaData;  // Default value is: new HashMap<>()

  /**
   * The RequestId
   */
  private final String requestId;  // Default value is: null

  private IdentificationResponse(Builder builder) {
      name = builder.name;
      firstName = builder.firstName;
      middleName = builder.middleName;
      lastName = builder.lastName;
      dateOfBirth = builder.dateOfBirth;
      status = builder.status;
      socialSecurityNumber = builder.socialSecurityNumber;
      identityProviderUniqueId = builder.identityProviderUniqueId;
      identityProvider = builder.identityProvider;
      error = builder.error;
      environmentInfo = builder.environmentInfo;
      metaData = builder.metaData;
      requestId = builder.requestId;
  }

      /**
      * The fullname of the user as reported back from the IdentityProvider
      * @return name
      **/
      public String getName() {return name;}

      /**
      * The first name of the user
      * @return firstName
      **/
      public String getFirstName() {return firstName;}

      /**
      * The middle name of the user (not always available)
      * @return middleName
      **/
      public String getMiddleName() {return middleName;}

      /**
      * The last name of the user
      * @return lastName
      **/
      public String getLastName() {return lastName;}

      /**
      * The users date of birth (not always available)
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}

      /**
      * The status of the identification process. If not success the identification process is not completed.
      * @return status
      **/
      public Status getStatus() {return status;}

      /**
      * The social security number for the user (if allowed and if the GetSocialSecurityNumber is set to true in the request)
      * @return socialSecurityNumber
      **/
      public String getSocialSecurityNumber() {return socialSecurityNumber;}

      /**
      * The uniqueID from the e-ID, this ID is unique for the user and is the same every time the user logs on. This is not a sensitiv ID and you could store this to identify the user in you database.  Remark: The Swedish BankID do not have an unique ID.
      * @return identityProviderUniqueId
      **/
      public String getIdentityProviderUniqueId() {return identityProviderUniqueId;}

      /**
      * The identityprovider type (Norwegian BanKID, SwedishBankID, Nemid, etc)
      * @return identityProvider
      **/
      public IdentityProvider getIdentityProvider() {return identityProvider;}

      /**
      * Information about error if the identification process failed. (Only set if an error occured, if not is null)
      * @return error
      **/
      public Error getError() {return error;}

      /**
      * Information about the users environment as seen by IdentiSign, can be used to compare with own data.
      * @return environmentInfo
      **/
      public EnvironmentInfo getEnvironmentInfo() {return environmentInfo;}

      /**
      * A dicitonary with extra information from each identityprovider, and extra services. See developer documentation for more information
      * @return metaData
      **/
      public Map<String, String> getMetaData() {return metaData;}

      /**
      * The RequestId
      * @return requestId
      **/
      public String getRequestId() {return requestId;}


  public static final class Builder {
      private String name;
      private String firstName;
      private String middleName;
      private String lastName;
      private String dateOfBirth;
      private Status status;
      private String socialSecurityNumber;
      private String identityProviderUniqueId;
      private IdentityProvider identityProvider;
      private Error error;
      private EnvironmentInfo environmentInfo;
      private Map<String, String> metaData;
      private String requestId;

    public Builder() {
    }

    public Builder(IdentificationResponse copy) {
        this.name = copy.getName();
        this.firstName = copy.getFirstName();
        this.middleName = copy.getMiddleName();
        this.lastName = copy.getLastName();
        this.dateOfBirth = copy.getDateOfBirth();
        this.status = copy.getStatus();
        this.socialSecurityNumber = copy.getSocialSecurityNumber();
        this.identityProviderUniqueId = copy.getIdentityProviderUniqueId();
        this.identityProvider = copy.getIdentityProvider();
        this.error = copy.getError();
        this.environmentInfo = copy.getEnvironmentInfo();
        this.metaData = copy.getMetaData();
        this.requestId = copy.getRequestId();
    }

    public Builder withName(String name) {
      this.name = name;
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

    public Builder withStatus(Status status) {
      this.status = status;
      return this;
    }

    public Builder withSocialSecurityNumber(String socialSecurityNumber) {
      this.socialSecurityNumber = socialSecurityNumber;
      return this;
    }

    public Builder withIdentityProviderUniqueId(String identityProviderUniqueId) {
      this.identityProviderUniqueId = identityProviderUniqueId;
      return this;
    }

    public Builder withIdentityProvider(IdentityProvider identityProvider) {
      this.identityProvider = identityProvider;
      return this;
    }

    public Builder withError(Error error) {
      this.error = error;
      return this;
    }

    public Builder withEnvironmentInfo(EnvironmentInfo environmentInfo) {
      this.environmentInfo = environmentInfo;
      return this;
    }

    public Builder withMetaData(Map<String, String> metaData) {
      this.metaData = metaData;
      return this;
    }

    public Builder putMetaDataItem(String key, String metaDataItem) {
      if (this.metaData == null) {
        this.metaData = new HashMap<>();
      }
      this.metaData.put(key, metaDataItem);
      return this;
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }


    public IdentificationResponse build() { return new IdentificationResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationResponse identificationResponse = (IdentificationResponse) o;
    return Objects.equals(this.name, identificationResponse.name) &&
        Objects.equals(this.firstName, identificationResponse.firstName) &&
        Objects.equals(this.middleName, identificationResponse.middleName) &&
        Objects.equals(this.lastName, identificationResponse.lastName) &&
        Objects.equals(this.dateOfBirth, identificationResponse.dateOfBirth) &&
        Objects.equals(this.status, identificationResponse.status) &&
        Objects.equals(this.socialSecurityNumber, identificationResponse.socialSecurityNumber) &&
        Objects.equals(this.identityProviderUniqueId, identificationResponse.identityProviderUniqueId) &&
        Objects.equals(this.identityProvider, identificationResponse.identityProvider) &&
        Objects.equals(this.error, identificationResponse.error) &&
        Objects.equals(this.environmentInfo, identificationResponse.environmentInfo) &&
        Objects.equals(this.metaData, identificationResponse.metaData) &&
        Objects.equals(this.requestId, identificationResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, firstName, middleName, lastName, dateOfBirth, status, socialSecurityNumber, identityProviderUniqueId, identityProvider, error, environmentInfo, metaData, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    identityProviderUniqueId: ").append(toIndentedString(identityProviderUniqueId)).append("\n");
    sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    environmentInfo: ").append(toIndentedString(environmentInfo)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
