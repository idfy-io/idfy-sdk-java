/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.signature.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Authentication settings for the signer.
 */
@JsonDeserialize(builder = Authentication.Builder.class)
public class Authentication  implements Serializable {
  /**
   * Set the type of authentication you want before the user is allowed to view the document(s), sms otp will use the mobile number specified in signerinfo
   */
  public enum Mechanism {
    @JsonProperty("off")
    OFF("off"),
    
    @JsonProperty("eid")
    EID("eid"),
    
    @JsonProperty("smsOtp")
    SMSOTP("smsOtp"),
    
    @JsonProperty("eidAndSmsOtp")
    EIDANDSMSOTP("eidAndSmsOtp");

    private String value;

    Mechanism(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Mechanism fromValue(String text) {
      for (Mechanism b : Mechanism.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Set the type of authentication you want before the user is allowed to view the document(s), sms otp will use the mobile number specified in signerinfo
   */
  private final Mechanism mechanism;  // Default value is: null

  /**
   * The signer's social security number.
   */
  private final String socialSecurityNumber;  // Default value is: null

  /**
   * The signer's unique ID for a signature method (for example the Norwegian BankID PID).
   */
  private final String signatureMethodUniqueId;  // Default value is: null

  private Authentication(Builder builder) {
      mechanism = builder.mechanism;
      socialSecurityNumber = builder.socialSecurityNumber;
      signatureMethodUniqueId = builder.signatureMethodUniqueId;
  }

      /**
      * Set the type of authentication you want before the user is allowed to view the document(s), sms otp will use the mobile number specified in signerinfo
      * @return mechanism
      **/
      public Mechanism getMechanism() {return mechanism;}

      /**
      * The signer's social security number.
      * @return socialSecurityNumber
      **/
      public String getSocialSecurityNumber() {return socialSecurityNumber;}

      /**
      * The signer's unique ID for a signature method (for example the Norwegian BankID PID).
      * @return signatureMethodUniqueId
      **/
      public String getSignatureMethodUniqueId() {return signatureMethodUniqueId;}


  public static final class Builder {
      private Mechanism mechanism;
      private String socialSecurityNumber;
      private String signatureMethodUniqueId;

    public Builder() {
    }

    public Builder(Authentication copy) {
        this.mechanism = copy.getMechanism();
        this.socialSecurityNumber = copy.getSocialSecurityNumber();
        this.signatureMethodUniqueId = copy.getSignatureMethodUniqueId();
    }

    public Builder withMechanism(Mechanism mechanism) {
      this.mechanism = mechanism;
      return this;
    }

    public Builder withSocialSecurityNumber(String socialSecurityNumber) {
      this.socialSecurityNumber = socialSecurityNumber;
      return this;
    }

    public Builder withSignatureMethodUniqueId(String signatureMethodUniqueId) {
      this.signatureMethodUniqueId = signatureMethodUniqueId;
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
    return Objects.equals(this.mechanism, authentication.mechanism) &&
        Objects.equals(this.socialSecurityNumber, authentication.socialSecurityNumber) &&
        Objects.equals(this.signatureMethodUniqueId, authentication.signatureMethodUniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanism, socialSecurityNumber, signatureMethodUniqueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authentication {\n");
    
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    signatureMethodUniqueId: ").append(toIndentedString(signatureMethodUniqueId)).append("\n");
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
