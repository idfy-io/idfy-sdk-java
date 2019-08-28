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
import java.util.UUID;
import java.io.Serializable;

/**
 * SwedishBankIdCollectSignRequest
 */
@JsonDeserialize(builder = SwedishBankIdCollectSignRequest.Builder.class)
public class SwedishBankIdCollectSignRequest  implements Serializable {
  private final UUID accountId;  // Default value is: null

  private final String collectToken;  // Default value is: null

  private final String sessionId;  // Default value is: null

  private SwedishBankIdCollectSignRequest(Builder builder) {
      accountId = builder.accountId;
      collectToken = builder.collectToken;
      sessionId = builder.sessionId;
  }

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Get collectToken
      * @return collectToken
      **/
      public String getCollectToken() {return collectToken;}

      /**
      * Get sessionId
      * @return sessionId
      **/
      public String getSessionId() {return sessionId;}


  public static final class Builder {
      private UUID accountId;
      private String collectToken;
      private String sessionId;

    public Builder() {
    }

    public Builder(SwedishBankIdCollectSignRequest copy) {
        this.accountId = copy.getAccountId();
        this.collectToken = copy.getCollectToken();
        this.sessionId = copy.getSessionId();
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withCollectToken(String collectToken) {
      this.collectToken = collectToken;
      return this;
    }

    public Builder withSessionId(String sessionId) {
      this.sessionId = sessionId;
      return this;
    }


    public SwedishBankIdCollectSignRequest build() { return new SwedishBankIdCollectSignRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwedishBankIdCollectSignRequest swedishBankIdCollectSignRequest = (SwedishBankIdCollectSignRequest) o;
    return Objects.equals(this.accountId, swedishBankIdCollectSignRequest.accountId) &&
        Objects.equals(this.collectToken, swedishBankIdCollectSignRequest.collectToken) &&
        Objects.equals(this.sessionId, swedishBankIdCollectSignRequest.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, collectToken, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwedishBankIdCollectSignRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    collectToken: ").append(toIndentedString(collectToken)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
