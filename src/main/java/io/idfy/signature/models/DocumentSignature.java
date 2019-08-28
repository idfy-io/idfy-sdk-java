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
import io.idfy.signature.models.SocialSecurityNumber;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * The document signature.
 */
@JsonDeserialize(builder = DocumentSignature.Builder.class)
public class DocumentSignature  implements Serializable {
  /**
   * The signature method used to sign the document.
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
   * The signature method used to sign the document.
   */
  private final SignatureMethod signatureMethod;  // Default value is: null

  /**
   * The signer's full name, retrieved from the signature-method provider.
   */
  private final String fullName;  // Default value is: null

  /**
   * The signer's first name.
   */
  private final String firstName;  // Default value is: null

  /**
   * The signer's last name.
   */
  private final String lastName;  // Default value is: null

  /**
   * The signer's middle name.
   */
  private final String middleName;  // Default value is: null

  /**
   * Time at which the signature was registered (ISO 8601).
   */
  private final OffsetDateTime signedTime;  // Default value is: null

  /**
   * The signer's date of birth (yyyy-MM-dd).
   */
  private final String dateOfBirth;  // Default value is: null

  /**
   * The signature method unique ID.
   */
  private final String signatureMethodUniqueId;  // Default value is: null

  private final SocialSecurityNumber socialSecurityNumber;  // Default value is: null

  /**
   * The IP address of the signer.
   */
  private final String clientIp;  // Default value is: null

  /**
   * The signature mechanism used
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
   * The signature mechanism used
   */
  private final Mechanism mechanism;  // Default value is: null

  /**
   * The origin of the signer name and date of birth in this object
   */
  public enum PersonalInfoOrigin {
    @JsonProperty("unknown")
    UNKNOWN("unknown"),
    
    @JsonProperty("eid")
    EID("eid"),
    
    @JsonProperty("userFormInput")
    USERFORMINPUT("userFormInput");

    private String value;

    PersonalInfoOrigin(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PersonalInfoOrigin fromValue(String text) {
      for (PersonalInfoOrigin b : PersonalInfoOrigin.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The origin of the signer name and date of birth in this object
   */
  private final PersonalInfoOrigin personalInfoOrigin;  // Default value is: null

  private DocumentSignature(Builder builder) {
      signatureMethod = builder.signatureMethod;
      fullName = builder.fullName;
      firstName = builder.firstName;
      lastName = builder.lastName;
      middleName = builder.middleName;
      signedTime = builder.signedTime;
      dateOfBirth = builder.dateOfBirth;
      signatureMethodUniqueId = builder.signatureMethodUniqueId;
      socialSecurityNumber = builder.socialSecurityNumber;
      clientIp = builder.clientIp;
      mechanism = builder.mechanism;
      personalInfoOrigin = builder.personalInfoOrigin;
  }

      /**
      * The signature method used to sign the document.
      * @return signatureMethod
      **/
      public SignatureMethod getSignatureMethod() {return signatureMethod;}

      /**
      * The signer's full name, retrieved from the signature-method provider.
      * @return fullName
      **/
      public String getFullName() {return fullName;}

      /**
      * The signer's first name.
      * @return firstName
      **/
      public String getFirstName() {return firstName;}

      /**
      * The signer's last name.
      * @return lastName
      **/
      public String getLastName() {return lastName;}

      /**
      * The signer's middle name.
      * @return middleName
      **/
      public String getMiddleName() {return middleName;}

      /**
      * Time at which the signature was registered (ISO 8601).
      * @return signedTime
      **/
      public OffsetDateTime getSignedTime() {return signedTime;}

      /**
      * The signer's date of birth (yyyy-MM-dd).
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}

      /**
      * The signature method unique ID.
      * @return signatureMethodUniqueId
      **/
      public String getSignatureMethodUniqueId() {return signatureMethodUniqueId;}

      /**
      * Get socialSecurityNumber
      * @return socialSecurityNumber
      **/
      public SocialSecurityNumber getSocialSecurityNumber() {return socialSecurityNumber;}

      /**
      * The IP address of the signer.
      * @return clientIp
      **/
      public String getClientIp() {return clientIp;}

      /**
      * The signature mechanism used
      * @return mechanism
      **/
      public Mechanism getMechanism() {return mechanism;}

      /**
      * The origin of the signer name and date of birth in this object
      * @return personalInfoOrigin
      **/
      public PersonalInfoOrigin getPersonalInfoOrigin() {return personalInfoOrigin;}


  public static final class Builder {
      private SignatureMethod signatureMethod;
      private String fullName;
      private String firstName;
      private String lastName;
      private String middleName;
      private OffsetDateTime signedTime;
      private String dateOfBirth;
      private String signatureMethodUniqueId;
      private SocialSecurityNumber socialSecurityNumber;
      private String clientIp;
      private Mechanism mechanism;
      private PersonalInfoOrigin personalInfoOrigin;

    public Builder() {
    }

    public Builder(DocumentSignature copy) {
        this.signatureMethod = copy.getSignatureMethod();
        this.fullName = copy.getFullName();
        this.firstName = copy.getFirstName();
        this.lastName = copy.getLastName();
        this.middleName = copy.getMiddleName();
        this.signedTime = copy.getSignedTime();
        this.dateOfBirth = copy.getDateOfBirth();
        this.signatureMethodUniqueId = copy.getSignatureMethodUniqueId();
        this.socialSecurityNumber = copy.getSocialSecurityNumber();
        this.clientIp = copy.getClientIp();
        this.mechanism = copy.getMechanism();
        this.personalInfoOrigin = copy.getPersonalInfoOrigin();
    }

    public Builder withSignatureMethod(SignatureMethod signatureMethod) {
      this.signatureMethod = signatureMethod;
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

    public Builder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder withMiddleName(String middleName) {
      this.middleName = middleName;
      return this;
    }

    public Builder withSignedTime(OffsetDateTime signedTime) {
      this.signedTime = signedTime;
      return this;
    }

    public Builder withDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder withSignatureMethodUniqueId(String signatureMethodUniqueId) {
      this.signatureMethodUniqueId = signatureMethodUniqueId;
      return this;
    }

    public Builder withSocialSecurityNumber(SocialSecurityNumber socialSecurityNumber) {
      this.socialSecurityNumber = socialSecurityNumber;
      return this;
    }

    public Builder withClientIp(String clientIp) {
      this.clientIp = clientIp;
      return this;
    }

    public Builder withMechanism(Mechanism mechanism) {
      this.mechanism = mechanism;
      return this;
    }

    public Builder withPersonalInfoOrigin(PersonalInfoOrigin personalInfoOrigin) {
      this.personalInfoOrigin = personalInfoOrigin;
      return this;
    }


    public DocumentSignature build() { return new DocumentSignature(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSignature documentSignature = (DocumentSignature) o;
    return Objects.equals(this.signatureMethod, documentSignature.signatureMethod) &&
        Objects.equals(this.fullName, documentSignature.fullName) &&
        Objects.equals(this.firstName, documentSignature.firstName) &&
        Objects.equals(this.lastName, documentSignature.lastName) &&
        Objects.equals(this.middleName, documentSignature.middleName) &&
        Objects.equals(this.signedTime, documentSignature.signedTime) &&
        Objects.equals(this.dateOfBirth, documentSignature.dateOfBirth) &&
        Objects.equals(this.signatureMethodUniqueId, documentSignature.signatureMethodUniqueId) &&
        Objects.equals(this.socialSecurityNumber, documentSignature.socialSecurityNumber) &&
        Objects.equals(this.clientIp, documentSignature.clientIp) &&
        Objects.equals(this.mechanism, documentSignature.mechanism) &&
        Objects.equals(this.personalInfoOrigin, documentSignature.personalInfoOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureMethod, fullName, firstName, lastName, middleName, signedTime, dateOfBirth, signatureMethodUniqueId, socialSecurityNumber, clientIp, mechanism, personalInfoOrigin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSignature {\n");
    
    sb.append("    signatureMethod: ").append(toIndentedString(signatureMethod)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    signedTime: ").append(toIndentedString(signedTime)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    signatureMethodUniqueId: ").append(toIndentedString(signatureMethodUniqueId)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    personalInfoOrigin: ").append(toIndentedString(personalInfoOrigin)).append("\n");
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
