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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * SignSuccess
 */
@JsonDeserialize(builder = SignSuccess.Builder.class)
public class SignSuccess  implements Serializable {
  /**
   * The unique id retrieved from the signature method provider
   */
  private final String signatureMethodUniqueId;  // Default value is: null

  /**
   * The signers first name
   */
  private final String firstName;  // Default value is: null

  /**
   * The signers middle name
   */
  private final String middleName;  // Default value is: null

  /**
   * The signers last name
   */
  private final String lastName;  // Default value is: null

  /**
   * The signers full name
   */
  private final String fullName;  // Default value is: null

  /**
   * The signers date of birth
   */
  private final String dateOfBirth;  // Default value is: null

  /**
   * The signaturemethod used to sign the document
   */
  public enum SignatureMethod {
    @JsonProperty("no_bankid")
    NO_BANKID("no_bankid"),
    
    @JsonProperty("no_bankid_mobile")
    NO_BANKID_MOBILE("no_bankid_mobile"),
    
    @JsonProperty("no_bankid_netcentric")
    NO_BANKID_NETCENTRIC("no_bankid_netcentric"),
    
    @JsonProperty("no_buypass")
    NO_BUYPASS("no_buypass"),
    
    @JsonProperty("no_commfides")
    NO_COMMFIDES("no_commfides"),
    
    @JsonProperty("se_bankid")
    SE_BANKID("se_bankid"),
    
    @JsonProperty("dk_nemid")
    DK_NEMID("dk_nemid"),
    
    @JsonProperty("fi_tupas")
    FI_TUPAS("fi_tupas"),
    
    @JsonProperty("fi_mobiilivarmenne")
    FI_MOBIILIVARMENNE("fi_mobiilivarmenne"),
    
    @JsonProperty("nl_digid")
    NL_DIGID("nl_digid"),
    
    @JsonProperty("es_dni")
    ES_DNI("es_dni"),
    
    @JsonProperty("ee_esteid")
    EE_ESTEID("ee_esteid"),
    
    @JsonProperty("mobile_connect")
    MOBILE_CONNECT("mobile_connect"),
    
    @JsonProperty("sms_otp")
    SMS_OTP("sms_otp"),
    
    @JsonProperty("identification_papers")
    IDENTIFICATION_PAPERS("identification_papers"),
    
    @JsonProperty("social")
    SOCIAL("social"),
    
    @JsonProperty("unknown")
    UNKNOWN("unknown");

    private String value;

    SignatureMethod(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureMethod fromValue(String text) {
      for (SignatureMethod b : SignatureMethod.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The signaturemethod used to sign the document
   */
  private final SignatureMethod signatureMethod;  // Default value is: null

  /**
   * Signed time (ISO 8601)
   */
  private final OffsetDateTime signedTime;  // Default value is: null

  /**
   * The mechanism used
   */
  public enum Mechanism {
    @JsonProperty("pkisignature")
    PKISIGNATURE("pkisignature"),
    
    @JsonProperty("identification")
    IDENTIFICATION("identification"),
    
    @JsonProperty("handwritten")
    HANDWRITTEN("handwritten"),
    
    @JsonProperty("handwritten_with_identification")
    HANDWRITTEN_WITH_IDENTIFICATION("handwritten_with_identification");

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
   * The mechanism used
   */
  private final Mechanism mechanism;  // Default value is: null

  private SignSuccess(Builder builder) {
      signatureMethodUniqueId = builder.signatureMethodUniqueId;
      firstName = builder.firstName;
      middleName = builder.middleName;
      lastName = builder.lastName;
      fullName = builder.fullName;
      dateOfBirth = builder.dateOfBirth;
      signatureMethod = builder.signatureMethod;
      signedTime = builder.signedTime;
      mechanism = builder.mechanism;
  }

      /**
      * The unique id retrieved from the signature method provider
      * @return signatureMethodUniqueId
      **/
      public String getSignatureMethodUniqueId() {return signatureMethodUniqueId;}

      /**
      * The signers first name
      * @return firstName
      **/
      public String getFirstName() {return firstName;}

      /**
      * The signers middle name
      * @return middleName
      **/
      public String getMiddleName() {return middleName;}

      /**
      * The signers last name
      * @return lastName
      **/
      public String getLastName() {return lastName;}

      /**
      * The signers full name
      * @return fullName
      **/
      public String getFullName() {return fullName;}

      /**
      * The signers date of birth
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}

      /**
      * The signaturemethod used to sign the document
      * @return signatureMethod
      **/
      public SignatureMethod getSignatureMethod() {return signatureMethod;}

      /**
      * Signed time (ISO 8601)
      * @return signedTime
      **/
      public OffsetDateTime getSignedTime() {return signedTime;}

      /**
      * The mechanism used
      * @return mechanism
      **/
      public Mechanism getMechanism() {return mechanism;}


  public static final class Builder {
      private String signatureMethodUniqueId;
      private String firstName;
      private String middleName;
      private String lastName;
      private String fullName;
      private String dateOfBirth;
      private SignatureMethod signatureMethod;
      private OffsetDateTime signedTime;
      private Mechanism mechanism;

    public Builder() {
    }

    public Builder(SignSuccess copy) {
        this.signatureMethodUniqueId = copy.getSignatureMethodUniqueId();
        this.firstName = copy.getFirstName();
        this.middleName = copy.getMiddleName();
        this.lastName = copy.getLastName();
        this.fullName = copy.getFullName();
        this.dateOfBirth = copy.getDateOfBirth();
        this.signatureMethod = copy.getSignatureMethod();
        this.signedTime = copy.getSignedTime();
        this.mechanism = copy.getMechanism();
    }

    public Builder withSignatureMethodUniqueId(String signatureMethodUniqueId) {
      this.signatureMethodUniqueId = signatureMethodUniqueId;
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

    public Builder withFullName(String fullName) {
      this.fullName = fullName;
      return this;
    }

    public Builder withDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder withSignatureMethod(SignatureMethod signatureMethod) {
      this.signatureMethod = signatureMethod;
      return this;
    }

    public Builder withSignedTime(OffsetDateTime signedTime) {
      this.signedTime = signedTime;
      return this;
    }

    public Builder withMechanism(Mechanism mechanism) {
      this.mechanism = mechanism;
      return this;
    }


    public SignSuccess build() { return new SignSuccess(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignSuccess signSuccess = (SignSuccess) o;
    return Objects.equals(this.signatureMethodUniqueId, signSuccess.signatureMethodUniqueId) &&
        Objects.equals(this.firstName, signSuccess.firstName) &&
        Objects.equals(this.middleName, signSuccess.middleName) &&
        Objects.equals(this.lastName, signSuccess.lastName) &&
        Objects.equals(this.fullName, signSuccess.fullName) &&
        Objects.equals(this.dateOfBirth, signSuccess.dateOfBirth) &&
        Objects.equals(this.signatureMethod, signSuccess.signatureMethod) &&
        Objects.equals(this.signedTime, signSuccess.signedTime) &&
        Objects.equals(this.mechanism, signSuccess.mechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureMethodUniqueId, firstName, middleName, lastName, fullName, dateOfBirth, signatureMethod, signedTime, mechanism);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignSuccess {\n");
    
    sb.append("    signatureMethodUniqueId: ").append(toIndentedString(signatureMethodUniqueId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    signatureMethod: ").append(toIndentedString(signatureMethod)).append("\n");
    sb.append("    signedTime: ").append(toIndentedString(signedTime)).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
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
