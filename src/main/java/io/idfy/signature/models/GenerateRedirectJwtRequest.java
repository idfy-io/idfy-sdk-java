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
import java.util.UUID;
import java.io.Serializable;

/**
 * GenerateRedirectJwtRequest
 */
@JsonDeserialize(builder = GenerateRedirectJwtRequest.Builder.class)
public class GenerateRedirectJwtRequest  implements Serializable {
  private final UUID accountId;  // Default value is: null

  private final UUID documentId;  // Default value is: null

  private final UUID signerId;  // Default value is: null

  private final String sessionId;  // Default value is: null

  /**
   * Gets or Sets status
   */
  public enum Status {
    @JsonProperty("UNKOWN")
    UNKOWN("UNKOWN"),
    
    @JsonProperty("SUCCESS")
    SUCCESS("SUCCESS"),
    
    @JsonProperty("ABORTED")
    ABORTED("ABORTED"),
    
    @JsonProperty("ERROR")
    ERROR("ERROR");

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

  private final Status status;  // Default value is: null

  private final Error error;  // Default value is: null

  private GenerateRedirectJwtRequest(Builder builder) {
      accountId = builder.accountId;
      documentId = builder.documentId;
      signerId = builder.signerId;
      sessionId = builder.sessionId;
      status = builder.status;
      error = builder.error;
  }

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Get documentId
      * @return documentId
      **/
      public UUID getDocumentId() {return documentId;}

      /**
      * Get signerId
      * @return signerId
      **/
      public UUID getSignerId() {return signerId;}

      /**
      * Get sessionId
      * @return sessionId
      **/
      public String getSessionId() {return sessionId;}

      /**
      * Get status
      * @return status
      **/
      public Status getStatus() {return status;}

      /**
      * Get error
      * @return error
      **/
      public Error getError() {return error;}


  public static final class Builder {
      private UUID accountId;
      private UUID documentId;
      private UUID signerId;
      private String sessionId;
      private Status status;
      private Error error;

    public Builder() {
    }

    public Builder(GenerateRedirectJwtRequest copy) {
        this.accountId = copy.getAccountId();
        this.documentId = copy.getDocumentId();
        this.signerId = copy.getSignerId();
        this.sessionId = copy.getSessionId();
        this.status = copy.getStatus();
        this.error = copy.getError();
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withDocumentId(UUID documentId) {
      this.documentId = documentId;
      return this;
    }

    public Builder withSignerId(UUID signerId) {
      this.signerId = signerId;
      return this;
    }

    public Builder withSessionId(String sessionId) {
      this.sessionId = sessionId;
      return this;
    }

    public Builder withStatus(Status status) {
      this.status = status;
      return this;
    }

    public Builder withError(Error error) {
      this.error = error;
      return this;
    }


    public GenerateRedirectJwtRequest build() { return new GenerateRedirectJwtRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateRedirectJwtRequest generateRedirectJwtRequest = (GenerateRedirectJwtRequest) o;
    return Objects.equals(this.accountId, generateRedirectJwtRequest.accountId) &&
        Objects.equals(this.documentId, generateRedirectJwtRequest.documentId) &&
        Objects.equals(this.signerId, generateRedirectJwtRequest.signerId) &&
        Objects.equals(this.sessionId, generateRedirectJwtRequest.sessionId) &&
        Objects.equals(this.status, generateRedirectJwtRequest.status) &&
        Objects.equals(this.error, generateRedirectJwtRequest.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, documentId, signerId, sessionId, status, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateRedirectJwtRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    signerId: ").append(toIndentedString(signerId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
