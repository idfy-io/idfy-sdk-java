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
import java.time.OffsetDateTime;
import java.util.UUID;
import java.io.Serializable;

/**
 * An identification historic item
 */
@JsonDeserialize(builder = IdentificationLogItem.Builder.class)
public class IdentificationLogItem  implements Serializable {
  /**
   * The sessionID for the identitication
   */
  private final String id;  // Default value is: null

  /**
   * The fullname of the user as reported back from the IdentityProvider if the identification was a success
   */
  private final String name;  // Default value is: null

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
   * The IP-address of the user
   */
  private final String clientIp;  // Default value is: null

  /**
   * The users user-agent (browser/device)
   */
  private final String userAgent;  // Default value is: null

  /**
   * The identityprovider type (Norwegian BanKID, SwedishBankID, Nemid, etc)
   */
  private final String identityProviderType;  // Default value is: null

  /**
   * The language  used for the identification process
   */
  private final String language;  // Default value is: null

  /**
   * The merchants reference to the identification process, this will also be used to identify an identification in a detailed invoice.
   */
  private final String externalid;  // Default value is: null

  /**
   * The error code for the error
   */
  private final String errorcode;  // Default value is: null

  /**
   * The timestamp for the creation of the identification process
   */
  private final OffsetDateTime timestamp;  // Default value is: null

  /**
   * Was an iFrame used
   */
  private final Boolean iFrame;  // Default value is: null

  /**
   * Was social securitynumber fetched
   */
  private final Boolean socialSecurityNumber;  // Default value is: null

  private final UUID accountId;  // Default value is: null

  private IdentificationLogItem(Builder builder) {
      id = builder.id;
      name = builder.name;
      status = builder.status;
      clientIp = builder.clientIp;
      userAgent = builder.userAgent;
      identityProviderType = builder.identityProviderType;
      language = builder.language;
      externalid = builder.externalid;
      errorcode = builder.errorcode;
      timestamp = builder.timestamp;
      iFrame = builder.iFrame;
      socialSecurityNumber = builder.socialSecurityNumber;
      accountId = builder.accountId;
  }

      /**
      * The sessionID for the identitication
      * @return id
      **/
      public String getId() {return id;}

      /**
      * The fullname of the user as reported back from the IdentityProvider if the identification was a success
      * @return name
      **/
      public String getName() {return name;}

      /**
      * The status of the identification process. If not success the identification process is not completed.
      * @return status
      **/
      public Status getStatus() {return status;}

      /**
      * The IP-address of the user
      * @return clientIp
      **/
      public String getClientIp() {return clientIp;}

      /**
      * The users user-agent (browser/device)
      * @return userAgent
      **/
      public String getUserAgent() {return userAgent;}

      /**
      * The identityprovider type (Norwegian BanKID, SwedishBankID, Nemid, etc)
      * @return identityProviderType
      **/
      public String getIdentityProviderType() {return identityProviderType;}

      /**
      * The language  used for the identification process
      * @return language
      **/
      public String getLanguage() {return language;}

      /**
      * The merchants reference to the identification process, this will also be used to identify an identification in a detailed invoice.
      * @return externalid
      **/
      public String getExternalid() {return externalid;}

      /**
      * The error code for the error
      * @return errorcode
      **/
      public String getErrorcode() {return errorcode;}

      /**
      * The timestamp for the creation of the identification process
      * @return timestamp
      **/
      public OffsetDateTime getTimestamp() {return timestamp;}

      /**
      * Was an iFrame used
      * @return iFrame
      **/
      public Boolean getIFrame() {return iFrame;}

      /**
      * Was social securitynumber fetched
      * @return socialSecurityNumber
      **/
      public Boolean getSocialSecurityNumber() {return socialSecurityNumber;}

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}


  public static final class Builder {
      private String id;
      private String name;
      private Status status;
      private String clientIp;
      private String userAgent;
      private String identityProviderType;
      private String language;
      private String externalid;
      private String errorcode;
      private OffsetDateTime timestamp;
      private Boolean iFrame;
      private Boolean socialSecurityNumber;
      private UUID accountId;

    public Builder() {
    }

    public Builder(IdentificationLogItem copy) {
        this.id = copy.getId();
        this.name = copy.getName();
        this.status = copy.getStatus();
        this.clientIp = copy.getClientIp();
        this.userAgent = copy.getUserAgent();
        this.identityProviderType = copy.getIdentityProviderType();
        this.language = copy.getLanguage();
        this.externalid = copy.getExternalid();
        this.errorcode = copy.getErrorcode();
        this.timestamp = copy.getTimestamp();
        this.iFrame = copy.getIFrame();
        this.socialSecurityNumber = copy.getSocialSecurityNumber();
        this.accountId = copy.getAccountId();
    }

    public Builder withId(String id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withStatus(Status status) {
      this.status = status;
      return this;
    }

    public Builder withClientIp(String clientIp) {
      this.clientIp = clientIp;
      return this;
    }

    public Builder withUserAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }

    public Builder withIdentityProviderType(String identityProviderType) {
      this.identityProviderType = identityProviderType;
      return this;
    }

    public Builder withLanguage(String language) {
      this.language = language;
      return this;
    }

    public Builder withExternalid(String externalid) {
      this.externalid = externalid;
      return this;
    }

    public Builder withErrorcode(String errorcode) {
      this.errorcode = errorcode;
      return this;
    }

    public Builder withTimestamp(OffsetDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder withIFrame(Boolean iFrame) {
      this.iFrame = iFrame;
      return this;
    }

    public Builder withSocialSecurityNumber(Boolean socialSecurityNumber) {
      this.socialSecurityNumber = socialSecurityNumber;
      return this;
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }


    public IdentificationLogItem build() { return new IdentificationLogItem(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationLogItem identificationLogItem = (IdentificationLogItem) o;
    return Objects.equals(this.id, identificationLogItem.id) &&
        Objects.equals(this.name, identificationLogItem.name) &&
        Objects.equals(this.status, identificationLogItem.status) &&
        Objects.equals(this.clientIp, identificationLogItem.clientIp) &&
        Objects.equals(this.userAgent, identificationLogItem.userAgent) &&
        Objects.equals(this.identityProviderType, identificationLogItem.identityProviderType) &&
        Objects.equals(this.language, identificationLogItem.language) &&
        Objects.equals(this.externalid, identificationLogItem.externalid) &&
        Objects.equals(this.errorcode, identificationLogItem.errorcode) &&
        Objects.equals(this.timestamp, identificationLogItem.timestamp) &&
        Objects.equals(this.iFrame, identificationLogItem.iFrame) &&
        Objects.equals(this.socialSecurityNumber, identificationLogItem.socialSecurityNumber) &&
        Objects.equals(this.accountId, identificationLogItem.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, clientIp, userAgent, identityProviderType, language, externalid, errorcode, timestamp, iFrame, socialSecurityNumber, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationLogItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    identityProviderType: ").append(toIndentedString(identityProviderType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    externalid: ").append(toIndentedString(externalid)).append("\n");
    sb.append("    errorcode: ").append(toIndentedString(errorcode)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    iFrame: ").append(toIndentedString(iFrame)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
