/*
 * Idfy.MerchantSign
 * This endpoint lets you sign documents with a merchant signature. ## Last update   Last build date for this endpoint: 04.06.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.merchantsign.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import io.idfy.merchantsign.models.Error;
import java.util.UUID;
import java.io.Serializable;

/**
 * SignResponse
 */
@JsonDeserialize(builder = SignResponse.Builder.class)
public class SignResponse  implements Serializable {
  /**
   * base 64 encoded signed data
   */
  private final String signedData;  // Default value is: null

  /**
   * Reference Id to audit log
   */
  private final UUID auditLogReference;  // Default value is: null

  /**
   * Signing format
   */
  public enum SigningFormat {
    @JsonProperty("use_provider_setting")
    USE_PROVIDER_SETTING("use_provider_setting"),
    
    @JsonProperty("no_bankid_seid_sdo")
    NO_BANKID_SEID_SDO("no_bankid_seid_sdo"),
    
    @JsonProperty("no_bankid_pades")
    NO_BANKID_PADES("no_bankid_pades"),
    
    @JsonProperty("no_buypass_seid_sdo")
    NO_BUYPASS_SEID_SDO("no_buypass_seid_sdo"),
    
    @JsonProperty("da_nemid_xmldsig")
    DA_NEMID_XMLDSIG("da_nemid_xmldsig"),
    
    @JsonProperty("sv_bankid_native_pkcs7")
    SV_BANKID_NATIVE_PKCS7("sv_bankid_native_pkcs7");

    private String value;

    SigningFormat(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SigningFormat fromValue(String text) {
      for (SigningFormat b : SigningFormat.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Signing format
   */
  private final SigningFormat signingFormat;  // Default value is: null

  /**
   * Error message
   */
  private final Error error;  // Default value is: null

  /**
   * Signed with certificate
   */
  private final String signCertificateBase64String;  // Default value is: null

  /**
   * Id to look up the transaction at a later time
   */
  private final UUID transactionId;  // Default value is: null

  /**
   * Id to retrieve signed file (pades)
   */
  private final UUID signedDocumentId;  // Default value is: null

  private SignResponse(Builder builder) {
      signedData = builder.signedData;
      auditLogReference = builder.auditLogReference;
      signingFormat = builder.signingFormat;
      error = builder.error;
      signCertificateBase64String = builder.signCertificateBase64String;
      transactionId = builder.transactionId;
      signedDocumentId = builder.signedDocumentId;
  }

      /**
      * base 64 encoded signed data
      * @return signedData
      **/
      public String getSignedData() {return signedData;}

      /**
      * Reference Id to audit log
      * @return auditLogReference
      **/
      public UUID getAuditLogReference() {return auditLogReference;}

      /**
      * Signing format
      * @return signingFormat
      **/
      public SigningFormat getSigningFormat() {return signingFormat;}

      /**
      * Error message
      * @return error
      **/
      public Error getError() {return error;}

      /**
      * Signed with certificate
      * @return signCertificateBase64String
      **/
      public String getSignCertificateBase64String() {return signCertificateBase64String;}

      /**
      * Id to look up the transaction at a later time
      * @return transactionId
      **/
      public UUID getTransactionId() {return transactionId;}

      /**
      * Id to retrieve signed file (pades)
      * @return signedDocumentId
      **/
      public UUID getSignedDocumentId() {return signedDocumentId;}


  public static final class Builder {
      private String signedData;
      private UUID auditLogReference;
      private SigningFormat signingFormat;
      private Error error;
      private String signCertificateBase64String;
      private UUID transactionId;
      private UUID signedDocumentId;

    public Builder() {
    }

    public Builder(SignResponse copy) {
        this.signedData = copy.getSignedData();
        this.auditLogReference = copy.getAuditLogReference();
        this.signingFormat = copy.getSigningFormat();
        this.error = copy.getError();
        this.signCertificateBase64String = copy.getSignCertificateBase64String();
        this.transactionId = copy.getTransactionId();
        this.signedDocumentId = copy.getSignedDocumentId();
    }

    public Builder withSignedData(String signedData) {
      this.signedData = signedData;
      return this;
    }

    public Builder withAuditLogReference(UUID auditLogReference) {
      this.auditLogReference = auditLogReference;
      return this;
    }

    public Builder withSigningFormat(SigningFormat signingFormat) {
      this.signingFormat = signingFormat;
      return this;
    }

    public Builder withError(Error error) {
      this.error = error;
      return this;
    }

    public Builder withSignCertificateBase64String(String signCertificateBase64String) {
      this.signCertificateBase64String = signCertificateBase64String;
      return this;
    }

    public Builder withTransactionId(UUID transactionId) {
      this.transactionId = transactionId;
      return this;
    }

    public Builder withSignedDocumentId(UUID signedDocumentId) {
      this.signedDocumentId = signedDocumentId;
      return this;
    }


    public SignResponse build() { return new SignResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignResponse signResponse = (SignResponse) o;
    return Objects.equals(this.signedData, signResponse.signedData) &&
        Objects.equals(this.auditLogReference, signResponse.auditLogReference) &&
        Objects.equals(this.signingFormat, signResponse.signingFormat) &&
        Objects.equals(this.error, signResponse.error) &&
        Objects.equals(this.signCertificateBase64String, signResponse.signCertificateBase64String) &&
        Objects.equals(this.transactionId, signResponse.transactionId) &&
        Objects.equals(this.signedDocumentId, signResponse.signedDocumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedData, auditLogReference, signingFormat, error, signCertificateBase64String, transactionId, signedDocumentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignResponse {\n");
    
    sb.append("    signedData: ").append(toIndentedString(signedData)).append("\n");
    sb.append("    auditLogReference: ").append(toIndentedString(auditLogReference)).append("\n");
    sb.append("    signingFormat: ").append(toIndentedString(signingFormat)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    signCertificateBase64String: ").append(toIndentedString(signCertificateBase64String)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    signedDocumentId: ").append(toIndentedString(signedDocumentId)).append("\n");
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
