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
import io.idfy.signature.models.Error;
import io.idfy.signature.models.SignSuccess;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.io.Serializable;

/**
 * JwtPayload
 */
@JsonDeserialize(builder = JwtPayload.Builder.class)
public class JwtPayload  implements Serializable {
  /**
   * Account Id
   */
  private final UUID accountId;  // Default value is: null

  /**
   * Document Id
   */
  private final UUID documentId;  // Default value is: null

  /**
   * External document Id
   */
  private final String externalId;  // Default value is: null

  /**
   * Signer Id
   */
  private final UUID signerId;  // Default value is: null

  /**
   * External signer Id
   */
  private final String externalSignerId;  // Default value is: null

  /**
   * Error object, will be included on error
   */
  private final Error error;  // Default value is: null

  /**
   * Success object, will be included on sign success
   */
  private final SignSuccess signSuccess;  // Default value is: null

  /**
   * When the jwt expires (ISO 8601)
   */
  private final OffsetDateTime expires;  // Default value is: null

  /**
   * Set to true if user aborted
   */
  private final Boolean aborted;  // Default value is: null

  private JwtPayload(Builder builder) {
      accountId = builder.accountId;
      documentId = builder.documentId;
      externalId = builder.externalId;
      signerId = builder.signerId;
      externalSignerId = builder.externalSignerId;
      error = builder.error;
      signSuccess = builder.signSuccess;
      expires = builder.expires;
      aborted = builder.aborted;
  }

      /**
      * Account Id
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Document Id
      * @return documentId
      **/
      public UUID getDocumentId() {return documentId;}

      /**
      * External document Id
      * @return externalId
      **/
      public String getExternalId() {return externalId;}

      /**
      * Signer Id
      * @return signerId
      **/
      public UUID getSignerId() {return signerId;}

      /**
      * External signer Id
      * @return externalSignerId
      **/
      public String getExternalSignerId() {return externalSignerId;}

      /**
      * Error object, will be included on error
      * @return error
      **/
      public Error getError() {return error;}

      /**
      * Success object, will be included on sign success
      * @return signSuccess
      **/
      public SignSuccess getSignSuccess() {return signSuccess;}

      /**
      * When the jwt expires (ISO 8601)
      * @return expires
      **/
      public OffsetDateTime getExpires() {return expires;}

      /**
      * Set to true if user aborted
      * @return aborted
      **/
      public Boolean getAborted() {return aborted;}


  public static final class Builder {
      private UUID accountId;
      private UUID documentId;
      private String externalId;
      private UUID signerId;
      private String externalSignerId;
      private Error error;
      private SignSuccess signSuccess;
      private OffsetDateTime expires;
      private Boolean aborted;

    public Builder() {
    }

    public Builder(JwtPayload copy) {
        this.accountId = copy.getAccountId();
        this.documentId = copy.getDocumentId();
        this.externalId = copy.getExternalId();
        this.signerId = copy.getSignerId();
        this.externalSignerId = copy.getExternalSignerId();
        this.error = copy.getError();
        this.signSuccess = copy.getSignSuccess();
        this.expires = copy.getExpires();
        this.aborted = copy.getAborted();
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withDocumentId(UUID documentId) {
      this.documentId = documentId;
      return this;
    }

    public Builder withExternalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder withSignerId(UUID signerId) {
      this.signerId = signerId;
      return this;
    }

    public Builder withExternalSignerId(String externalSignerId) {
      this.externalSignerId = externalSignerId;
      return this;
    }

    public Builder withError(Error error) {
      this.error = error;
      return this;
    }

    public Builder withSignSuccess(SignSuccess signSuccess) {
      this.signSuccess = signSuccess;
      return this;
    }

    public Builder withExpires(OffsetDateTime expires) {
      this.expires = expires;
      return this;
    }

    public Builder withAborted(Boolean aborted) {
      this.aborted = aborted;
      return this;
    }


    public JwtPayload build() { return new JwtPayload(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JwtPayload jwtPayload = (JwtPayload) o;
    return Objects.equals(this.accountId, jwtPayload.accountId) &&
        Objects.equals(this.documentId, jwtPayload.documentId) &&
        Objects.equals(this.externalId, jwtPayload.externalId) &&
        Objects.equals(this.signerId, jwtPayload.signerId) &&
        Objects.equals(this.externalSignerId, jwtPayload.externalSignerId) &&
        Objects.equals(this.error, jwtPayload.error) &&
        Objects.equals(this.signSuccess, jwtPayload.signSuccess) &&
        Objects.equals(this.expires, jwtPayload.expires) &&
        Objects.equals(this.aborted, jwtPayload.aborted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, documentId, externalId, signerId, externalSignerId, error, signSuccess, expires, aborted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JwtPayload {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    signerId: ").append(toIndentedString(signerId)).append("\n");
    sb.append("    externalSignerId: ").append(toIndentedString(externalSignerId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    signSuccess: ").append(toIndentedString(signSuccess)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    aborted: ").append(toIndentedString(aborted)).append("\n");
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
