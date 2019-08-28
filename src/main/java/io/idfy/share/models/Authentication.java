/*
 * Idfy Secure Share
 * This endpoints enables secure sharing with multiple e-ids offered for login
 *
 * OpenAPI spec version: v1
 * 
 */

package io.idfy.share.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Authentication
 */
@JsonDeserialize(builder = Authentication.Builder.class)
public class Authentication  implements Serializable {
  /**
   * The identityprovider type (Norwegian BankID, buypass etc)
   */
  public enum IdentityProvider {
    @JsonProperty("NoBankIdMobile")
    NOBANKIDMOBILE("NoBankIdMobile"),
    
    @JsonProperty("NoBankIdWeb")
    NOBANKIDWEB("NoBankIdWeb"),
    
    @JsonProperty("SweBankId")
    SWEBANKID("SweBankId"),
    
    @JsonProperty("SweBankIdMobile")
    SWEBANKIDMOBILE("SweBankIdMobile"),
    
    @JsonProperty("NoBuypass")
    NOBUYPASS("NoBuypass"),
    
    @JsonProperty("DaNemId")
    DANEMID("DaNemId"),
    
    @JsonProperty("FiTupas")
    FITUPAS("FiTupas");

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
   * The identityprovider type (Norwegian BankID, buypass etc)
   */
  private final IdentityProvider identityProvider;  // Default value is: null

  /**
   * The uniqueID from the e-ID, this ID is unique for the user and is the same every time the user logs on. This is not a sensitiv ID and your could store this to identify the user in you database. Remark: The Swedish BankID do not have an unique ID.
   */
  private final String identityProviderUniqueId;  // Default value is: null

  /**
   * Social security number
   */
  private final String ssn;  // Default value is: null

  /**
   * The users date of birth format ddMMyy
   */
  private final String dateOfBirth;  // Default value is: null

  private Authentication(Builder builder) {
      identityProvider = builder.identityProvider;
      identityProviderUniqueId = builder.identityProviderUniqueId;
      ssn = builder.ssn;
      dateOfBirth = builder.dateOfBirth;
  }

      /**
      * The identityprovider type (Norwegian BankID, buypass etc)
      * @return identityProvider
      **/
      public IdentityProvider getIdentityProvider() {return identityProvider;}

      /**
      * The uniqueID from the e-ID, this ID is unique for the user and is the same every time the user logs on. This is not a sensitiv ID and your could store this to identify the user in you database. Remark: The Swedish BankID do not have an unique ID.
      * @return identityProviderUniqueId
      **/
      public String getIdentityProviderUniqueId() {return identityProviderUniqueId;}

      /**
      * Social security number
      * @return ssn
      **/
      public String getSsn() {return ssn;}

      /**
      * The users date of birth format ddMMyy
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}


  public static final class Builder {
      private IdentityProvider identityProvider;
      private String identityProviderUniqueId;
      private String ssn;
      private String dateOfBirth;

    public Builder() {
    }

    public Builder(Authentication copy) {
        this.identityProvider = copy.getIdentityProvider();
        this.identityProviderUniqueId = copy.getIdentityProviderUniqueId();
        this.ssn = copy.getSsn();
        this.dateOfBirth = copy.getDateOfBirth();
    }

    public Builder withIdentityProvider(IdentityProvider identityProvider) {
      this.identityProvider = identityProvider;
      return this;
    }

    public Builder withIdentityProviderUniqueId(String identityProviderUniqueId) {
      this.identityProviderUniqueId = identityProviderUniqueId;
      return this;
    }

    public Builder withSsn(String ssn) {
      this.ssn = ssn;
      return this;
    }

    public Builder withDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }


    public Authentication build() { return new Authentication(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authentication authentication = (Authentication) o;
    return Objects.equals(this.identityProvider, authentication.identityProvider) &&
        Objects.equals(this.identityProviderUniqueId, authentication.identityProviderUniqueId) &&
        Objects.equals(this.ssn, authentication.ssn) &&
        Objects.equals(this.dateOfBirth, authentication.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityProvider, identityProviderUniqueId, ssn, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authentication {\n");
    
    sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
    sb.append("    identityProviderUniqueId: ").append(toIndentedString(identityProviderUniqueId)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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
