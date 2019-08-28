/*
 * Idfy.Validation
 * In this API you can validate signatures from the following electronic IDs (e-ID)<br/><br/>  &bull; Norwegian BankId (SDO)<br/>  ## Last update [LastUpdate] ## Last update   Last build date for this endpoint: 12.03.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.validation.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import io.idfy.validation.models.X509Certificate;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Certificate
 */
@JsonDeserialize(builder = Certificate.Builder.class)
public class Certificate  implements Serializable {
  private final String issuerName;  // Default value is: null

  private final String subjectName;  // Default value is: null

  private final OffsetDateTime validFromDate;  // Default value is: null

  private final OffsetDateTime validToDate;  // Default value is: null

  private final String versionNumber;  // Default value is: null

  private final String serialNumber;  // Default value is: null

  private final String keyAlgorithm;  // Default value is: null

  private final String keySize;  // Default value is: null

  private final String uniqueId;  // Default value is: null

  private final String originator;  // Default value is: null

  private final String bankName;  // Default value is: null

  private final OffsetDateTime dateOfBirth;  // Default value is: null

  private final String policyOid;  // Default value is: null

  private final String commonName;  // Default value is: null

  private final String signingCertficate;  // Default value is: null

  private final X509Certificate x509Certificate;  // Default value is: null

  private final String keyUsage;  // Default value is: null

  private final Object emailAddress;  // Default value is: null

  private final OffsetDateTime signingTime;  // Default value is: null

  private final String phoneNumber;  // Default value is: null

  /**
   * Gets or Sets certificateType
   */
  public enum CertificateType {
    @JsonProperty("HSM_MERCHANT_CERTIFICATE")
    HSM_MERCHANT_CERTIFICATE("HSM_MERCHANT_CERTIFICATE"),
    
    @JsonProperty("MOBILE_PERSONAL_CERTIFICATE")
    MOBILE_PERSONAL_CERTIFICATE("MOBILE_PERSONAL_CERTIFICATE"),
    
    @JsonProperty("NETCENTRIC_EMPLOYEE_CERTIFICATE")
    NETCENTRIC_EMPLOYEE_CERTIFICATE("NETCENTRIC_EMPLOYEE_CERTIFICATE"),
    
    @JsonProperty("NETCENTRIC_PERSONAL_CERTIFICATE")
    NETCENTRIC_PERSONAL_CERTIFICATE("NETCENTRIC_PERSONAL_CERTIFICATE"),
    
    @JsonProperty("NETCENTRIC_QUALIFIED_EMPLOYEE_CERTIFICATE")
    NETCENTRIC_QUALIFIED_EMPLOYEE_CERTIFICATE("NETCENTRIC_QUALIFIED_EMPLOYEE_CERTIFICATE"),
    
    @JsonProperty("NETCENTRIC_QUALIFIED_PERSONAL_CERTIFICATE")
    NETCENTRIC_QUALIFIED_PERSONAL_CERTIFICATE("NETCENTRIC_QUALIFIED_PERSONAL_CERTIFICATE"),
    
    @JsonProperty("SOFT_MERCHANT_CERTIFICATE")
    SOFT_MERCHANT_CERTIFICATE("SOFT_MERCHANT_CERTIFICATE"),
    
    @JsonProperty("UNKNOWN")
    UNKNOWN("UNKNOWN");

    private String value;

    CertificateType(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CertificateType fromValue(String text) {
      for (CertificateType b : CertificateType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final CertificateType certificateType;  // Default value is: null

  private Certificate(Builder builder) {
      issuerName = builder.issuerName;
      subjectName = builder.subjectName;
      validFromDate = builder.validFromDate;
      validToDate = builder.validToDate;
      versionNumber = builder.versionNumber;
      serialNumber = builder.serialNumber;
      keyAlgorithm = builder.keyAlgorithm;
      keySize = builder.keySize;
      uniqueId = builder.uniqueId;
      originator = builder.originator;
      bankName = builder.bankName;
      dateOfBirth = builder.dateOfBirth;
      policyOid = builder.policyOid;
      commonName = builder.commonName;
      signingCertficate = builder.signingCertficate;
      x509Certificate = builder.x509Certificate;
      keyUsage = builder.keyUsage;
      emailAddress = builder.emailAddress;
      signingTime = builder.signingTime;
      phoneNumber = builder.phoneNumber;
      certificateType = builder.certificateType;
  }

      /**
      * Get issuerName
      * @return issuerName
      **/
      public String getIssuerName() {return issuerName;}

      /**
      * Get subjectName
      * @return subjectName
      **/
      public String getSubjectName() {return subjectName;}

      /**
      * Get validFromDate
      * @return validFromDate
      **/
      public OffsetDateTime getValidFromDate() {return validFromDate;}

      /**
      * Get validToDate
      * @return validToDate
      **/
      public OffsetDateTime getValidToDate() {return validToDate;}

      /**
      * Get versionNumber
      * @return versionNumber
      **/
      public String getVersionNumber() {return versionNumber;}

      /**
      * Get serialNumber
      * @return serialNumber
      **/
      public String getSerialNumber() {return serialNumber;}

      /**
      * Get keyAlgorithm
      * @return keyAlgorithm
      **/
      public String getKeyAlgorithm() {return keyAlgorithm;}

      /**
      * Get keySize
      * @return keySize
      **/
      public String getKeySize() {return keySize;}

      /**
      * Get uniqueId
      * @return uniqueId
      **/
      public String getUniqueId() {return uniqueId;}

      /**
      * Get originator
      * @return originator
      **/
      public String getOriginator() {return originator;}

      /**
      * Get bankName
      * @return bankName
      **/
      public String getBankName() {return bankName;}

      /**
      * Get dateOfBirth
      * @return dateOfBirth
      **/
      public OffsetDateTime getDateOfBirth() {return dateOfBirth;}

      /**
      * Get policyOid
      * @return policyOid
      **/
      public String getPolicyOid() {return policyOid;}

      /**
      * Get commonName
      * @return commonName
      **/
      public String getCommonName() {return commonName;}

      /**
      * Get signingCertficate
      * @return signingCertficate
      **/
      public String getSigningCertficate() {return signingCertficate;}

      /**
      * Get x509Certificate
      * @return x509Certificate
      **/
      public X509Certificate getX509Certificate() {return x509Certificate;}

      /**
      * Get keyUsage
      * @return keyUsage
      **/
      public String getKeyUsage() {return keyUsage;}

      /**
      * Get emailAddress
      * @return emailAddress
      **/
      public Object getEmailAddress() {return emailAddress;}

      /**
      * Get signingTime
      * @return signingTime
      **/
      public OffsetDateTime getSigningTime() {return signingTime;}

      /**
      * Get phoneNumber
      * @return phoneNumber
      **/
      public String getPhoneNumber() {return phoneNumber;}

      /**
      * Get certificateType
      * @return certificateType
      **/
      public CertificateType getCertificateType() {return certificateType;}


  public static final class Builder {
      private String issuerName;
      private String subjectName;
      private OffsetDateTime validFromDate;
      private OffsetDateTime validToDate;
      private String versionNumber;
      private String serialNumber;
      private String keyAlgorithm;
      private String keySize;
      private String uniqueId;
      private String originator;
      private String bankName;
      private OffsetDateTime dateOfBirth;
      private String policyOid;
      private String commonName;
      private String signingCertficate;
      private X509Certificate x509Certificate;
      private String keyUsage;
      private Object emailAddress;
      private OffsetDateTime signingTime;
      private String phoneNumber;
      private CertificateType certificateType;

    public Builder() {
    }

    public Builder(Certificate copy) {
        this.issuerName = copy.getIssuerName();
        this.subjectName = copy.getSubjectName();
        this.validFromDate = copy.getValidFromDate();
        this.validToDate = copy.getValidToDate();
        this.versionNumber = copy.getVersionNumber();
        this.serialNumber = copy.getSerialNumber();
        this.keyAlgorithm = copy.getKeyAlgorithm();
        this.keySize = copy.getKeySize();
        this.uniqueId = copy.getUniqueId();
        this.originator = copy.getOriginator();
        this.bankName = copy.getBankName();
        this.dateOfBirth = copy.getDateOfBirth();
        this.policyOid = copy.getPolicyOid();
        this.commonName = copy.getCommonName();
        this.signingCertficate = copy.getSigningCertficate();
        this.x509Certificate = copy.getX509Certificate();
        this.keyUsage = copy.getKeyUsage();
        this.emailAddress = copy.getEmailAddress();
        this.signingTime = copy.getSigningTime();
        this.phoneNumber = copy.getPhoneNumber();
        this.certificateType = copy.getCertificateType();
    }

    public Builder withIssuerName(String issuerName) {
      this.issuerName = issuerName;
      return this;
    }

    public Builder withSubjectName(String subjectName) {
      this.subjectName = subjectName;
      return this;
    }

    public Builder withValidFromDate(OffsetDateTime validFromDate) {
      this.validFromDate = validFromDate;
      return this;
    }

    public Builder withValidToDate(OffsetDateTime validToDate) {
      this.validToDate = validToDate;
      return this;
    }

    public Builder withVersionNumber(String versionNumber) {
      this.versionNumber = versionNumber;
      return this;
    }

    public Builder withSerialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
      return this;
    }

    public Builder withKeyAlgorithm(String keyAlgorithm) {
      this.keyAlgorithm = keyAlgorithm;
      return this;
    }

    public Builder withKeySize(String keySize) {
      this.keySize = keySize;
      return this;
    }

    public Builder withUniqueId(String uniqueId) {
      this.uniqueId = uniqueId;
      return this;
    }

    public Builder withOriginator(String originator) {
      this.originator = originator;
      return this;
    }

    public Builder withBankName(String bankName) {
      this.bankName = bankName;
      return this;
    }

    public Builder withDateOfBirth(OffsetDateTime dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder withPolicyOid(String policyOid) {
      this.policyOid = policyOid;
      return this;
    }

    public Builder withCommonName(String commonName) {
      this.commonName = commonName;
      return this;
    }

    public Builder withSigningCertficate(String signingCertficate) {
      this.signingCertficate = signingCertficate;
      return this;
    }

    public Builder withX509Certificate(X509Certificate x509Certificate) {
      this.x509Certificate = x509Certificate;
      return this;
    }

    public Builder withKeyUsage(String keyUsage) {
      this.keyUsage = keyUsage;
      return this;
    }

    public Builder withEmailAddress(Object emailAddress) {
      this.emailAddress = emailAddress;
      return this;
    }

    public Builder withSigningTime(OffsetDateTime signingTime) {
      this.signingTime = signingTime;
      return this;
    }

    public Builder withPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public Builder withCertificateType(CertificateType certificateType) {
      this.certificateType = certificateType;
      return this;
    }


    public Certificate build() { return new Certificate(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Certificate certificate = (Certificate) o;
    return Objects.equals(this.issuerName, certificate.issuerName) &&
        Objects.equals(this.subjectName, certificate.subjectName) &&
        Objects.equals(this.validFromDate, certificate.validFromDate) &&
        Objects.equals(this.validToDate, certificate.validToDate) &&
        Objects.equals(this.versionNumber, certificate.versionNumber) &&
        Objects.equals(this.serialNumber, certificate.serialNumber) &&
        Objects.equals(this.keyAlgorithm, certificate.keyAlgorithm) &&
        Objects.equals(this.keySize, certificate.keySize) &&
        Objects.equals(this.uniqueId, certificate.uniqueId) &&
        Objects.equals(this.originator, certificate.originator) &&
        Objects.equals(this.bankName, certificate.bankName) &&
        Objects.equals(this.dateOfBirth, certificate.dateOfBirth) &&
        Objects.equals(this.policyOid, certificate.policyOid) &&
        Objects.equals(this.commonName, certificate.commonName) &&
        Objects.equals(this.signingCertficate, certificate.signingCertficate) &&
        Objects.equals(this.x509Certificate, certificate.x509Certificate) &&
        Objects.equals(this.keyUsage, certificate.keyUsage) &&
        Objects.equals(this.emailAddress, certificate.emailAddress) &&
        Objects.equals(this.signingTime, certificate.signingTime) &&
        Objects.equals(this.phoneNumber, certificate.phoneNumber) &&
        Objects.equals(this.certificateType, certificate.certificateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerName, subjectName, validFromDate, validToDate, versionNumber, serialNumber, keyAlgorithm, keySize, uniqueId, originator, bankName, dateOfBirth, policyOid, commonName, signingCertficate, x509Certificate, keyUsage, emailAddress, signingTime, phoneNumber, certificateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Certificate {\n");
    
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
    sb.append("    validToDate: ").append(toIndentedString(validToDate)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
    sb.append("    keySize: ").append(toIndentedString(keySize)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    policyOid: ").append(toIndentedString(policyOid)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    signingCertficate: ").append(toIndentedString(signingCertficate)).append("\n");
    sb.append("    x509Certificate: ").append(toIndentedString(x509Certificate)).append("\n");
    sb.append("    keyUsage: ").append(toIndentedString(keyUsage)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    signingTime: ").append(toIndentedString(signingTime)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
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
