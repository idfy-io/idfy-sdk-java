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
import java.time.OffsetDateTime;
import java.util.UUID;
import java.io.Serializable;

/**
 * MerchantSignTransaction
 */
@JsonDeserialize(builder = MerchantSignTransaction.Builder.class)
public class MerchantSignTransaction  implements Serializable {
  /**
   * Transaction Id
   */
  private final UUID id;  // Default value is: null

  /**
   * Your account Id
   */
  private final UUID accountId;  // Default value is: null

  /**
   * Audit log Id
   */
  private final UUID auditLogReference;  // Default value is: null

  /**
   * External Reference
   */
  private final String externalReference;  // Default value is: null

  /**
   * The oauth client used in this transaction
   */
  private final String oauthClientId;  // Default value is: null

  /**
   * Ip address
   */
  private final String ipAddress;  // Default value is: null

  /**
   * Xslt sha256 hash
   */
  private final String xslt;  // Default value is: null

  /**
   * Data to sign sha256 hash
   */
  private final String dataToSign;  // Default value is: null

  /**
   * Signed data sha256 hash
   */
  private final String result;  // Default value is: null

  /**
   * Certificate
   */
  private final String certificate;  // Default value is: null

  /**
   * Log save time
   */
  private final OffsetDateTime timeStamp;  // Default value is: null

  /**
   * For pades retrieval
   */
  private final UUID signedDocumentId;  // Default value is: null

  private final Boolean padesCreated;  // Default value is: null

  private final Boolean padesRetrieved;  // Default value is: null

  private final Boolean padesDeleted;  // Default value is: null

  private MerchantSignTransaction(Builder builder) {
      id = builder.id;
      accountId = builder.accountId;
      auditLogReference = builder.auditLogReference;
      externalReference = builder.externalReference;
      oauthClientId = builder.oauthClientId;
      ipAddress = builder.ipAddress;
      xslt = builder.xslt;
      dataToSign = builder.dataToSign;
      result = builder.result;
      certificate = builder.certificate;
      timeStamp = builder.timeStamp;
      signedDocumentId = builder.signedDocumentId;
      padesCreated = builder.padesCreated;
      padesRetrieved = builder.padesRetrieved;
      padesDeleted = builder.padesDeleted;
  }

      /**
      * Transaction Id
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * Your account Id
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Audit log Id
      * @return auditLogReference
      **/
      public UUID getAuditLogReference() {return auditLogReference;}

      /**
      * External Reference
      * @return externalReference
      **/
      public String getExternalReference() {return externalReference;}

      /**
      * The oauth client used in this transaction
      * @return oauthClientId
      **/
      public String getOauthClientId() {return oauthClientId;}

      /**
      * Ip address
      * @return ipAddress
      **/
      public String getIpAddress() {return ipAddress;}

      /**
      * Xslt sha256 hash
      * @return xslt
      **/
      public String getXslt() {return xslt;}

      /**
      * Data to sign sha256 hash
      * @return dataToSign
      **/
      public String getDataToSign() {return dataToSign;}

      /**
      * Signed data sha256 hash
      * @return result
      **/
      public String getResult() {return result;}

      /**
      * Certificate
      * @return certificate
      **/
      public String getCertificate() {return certificate;}

      /**
      * Log save time
      * @return timeStamp
      **/
      public OffsetDateTime getTimeStamp() {return timeStamp;}

      /**
      * For pades retrieval
      * @return signedDocumentId
      **/
      public UUID getSignedDocumentId() {return signedDocumentId;}

      /**
      * Get padesCreated
      * @return padesCreated
      **/
      public Boolean getPadesCreated() {return padesCreated;}

      /**
      * Get padesRetrieved
      * @return padesRetrieved
      **/
      public Boolean getPadesRetrieved() {return padesRetrieved;}

      /**
      * Get padesDeleted
      * @return padesDeleted
      **/
      public Boolean getPadesDeleted() {return padesDeleted;}


  public static final class Builder {
      private UUID id;
      private UUID accountId;
      private UUID auditLogReference;
      private String externalReference;
      private String oauthClientId;
      private String ipAddress;
      private String xslt;
      private String dataToSign;
      private String result;
      private String certificate;
      private OffsetDateTime timeStamp;
      private UUID signedDocumentId;
      private Boolean padesCreated;
      private Boolean padesRetrieved;
      private Boolean padesDeleted;

    public Builder() {
    }

    public Builder(MerchantSignTransaction copy) {
        this.id = copy.getId();
        this.accountId = copy.getAccountId();
        this.auditLogReference = copy.getAuditLogReference();
        this.externalReference = copy.getExternalReference();
        this.oauthClientId = copy.getOauthClientId();
        this.ipAddress = copy.getIpAddress();
        this.xslt = copy.getXslt();
        this.dataToSign = copy.getDataToSign();
        this.result = copy.getResult();
        this.certificate = copy.getCertificate();
        this.timeStamp = copy.getTimeStamp();
        this.signedDocumentId = copy.getSignedDocumentId();
        this.padesCreated = copy.getPadesCreated();
        this.padesRetrieved = copy.getPadesRetrieved();
        this.padesDeleted = copy.getPadesDeleted();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withAuditLogReference(UUID auditLogReference) {
      this.auditLogReference = auditLogReference;
      return this;
    }

    public Builder withExternalReference(String externalReference) {
      this.externalReference = externalReference;
      return this;
    }

    public Builder withOauthClientId(String oauthClientId) {
      this.oauthClientId = oauthClientId;
      return this;
    }

    public Builder withIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }

    public Builder withXslt(String xslt) {
      this.xslt = xslt;
      return this;
    }

    public Builder withDataToSign(String dataToSign) {
      this.dataToSign = dataToSign;
      return this;
    }

    public Builder withResult(String result) {
      this.result = result;
      return this;
    }

    public Builder withCertificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    public Builder withTimeStamp(OffsetDateTime timeStamp) {
      this.timeStamp = timeStamp;
      return this;
    }

    public Builder withSignedDocumentId(UUID signedDocumentId) {
      this.signedDocumentId = signedDocumentId;
      return this;
    }

    public Builder withPadesCreated(Boolean padesCreated) {
      this.padesCreated = padesCreated;
      return this;
    }

    public Builder withPadesRetrieved(Boolean padesRetrieved) {
      this.padesRetrieved = padesRetrieved;
      return this;
    }

    public Builder withPadesDeleted(Boolean padesDeleted) {
      this.padesDeleted = padesDeleted;
      return this;
    }


    public MerchantSignTransaction build() { return new MerchantSignTransaction(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantSignTransaction merchantSignTransaction = (MerchantSignTransaction) o;
    return Objects.equals(this.id, merchantSignTransaction.id) &&
        Objects.equals(this.accountId, merchantSignTransaction.accountId) &&
        Objects.equals(this.auditLogReference, merchantSignTransaction.auditLogReference) &&
        Objects.equals(this.externalReference, merchantSignTransaction.externalReference) &&
        Objects.equals(this.oauthClientId, merchantSignTransaction.oauthClientId) &&
        Objects.equals(this.ipAddress, merchantSignTransaction.ipAddress) &&
        Objects.equals(this.xslt, merchantSignTransaction.xslt) &&
        Objects.equals(this.dataToSign, merchantSignTransaction.dataToSign) &&
        Objects.equals(this.result, merchantSignTransaction.result) &&
        Objects.equals(this.certificate, merchantSignTransaction.certificate) &&
        Objects.equals(this.timeStamp, merchantSignTransaction.timeStamp) &&
        Objects.equals(this.signedDocumentId, merchantSignTransaction.signedDocumentId) &&
        Objects.equals(this.padesCreated, merchantSignTransaction.padesCreated) &&
        Objects.equals(this.padesRetrieved, merchantSignTransaction.padesRetrieved) &&
        Objects.equals(this.padesDeleted, merchantSignTransaction.padesDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, auditLogReference, externalReference, oauthClientId, ipAddress, xslt, dataToSign, result, certificate, timeStamp, signedDocumentId, padesCreated, padesRetrieved, padesDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantSignTransaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    auditLogReference: ").append(toIndentedString(auditLogReference)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    oauthClientId: ").append(toIndentedString(oauthClientId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    xslt: ").append(toIndentedString(xslt)).append("\n");
    sb.append("    dataToSign: ").append(toIndentedString(dataToSign)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    signedDocumentId: ").append(toIndentedString(signedDocumentId)).append("\n");
    sb.append("    padesCreated: ").append(toIndentedString(padesCreated)).append("\n");
    sb.append("    padesRetrieved: ").append(toIndentedString(padesRetrieved)).append("\n");
    sb.append("    padesDeleted: ").append(toIndentedString(padesDeleted)).append("\n");
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
