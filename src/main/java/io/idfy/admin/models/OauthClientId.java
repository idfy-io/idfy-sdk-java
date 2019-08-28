/*
 * Idfy.Admin
 * In this API you can manage your account details, logo, styling or manage your openid / oauth api clients. If you are a dealer you can also manage the accounts registered to this dealer.   ## Last update   Last build date for this API: 14.01.2018  
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.admin.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.io.Serializable;

/**
 * OauthClientId
 */
@JsonDeserialize(builder = OauthClientId.Builder.class)
public class OauthClientId  implements Serializable {
  private final String clientId;  // Default value is: null

  private final UUID accountId;  // Default value is: null

  private OauthClientId(Builder builder) {
      clientId = builder.clientId;
      accountId = builder.accountId;
  }

      /**
      * Get clientId
      * @return clientId
      **/
      public String getClientId() {return clientId;}

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}


  public static final class Builder {
      private String clientId;
      private UUID accountId;

    public Builder() {
    }

    public Builder(OauthClientId copy) {
        this.clientId = copy.getClientId();
        this.accountId = copy.getAccountId();
    }

    public Builder withClientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }


    public OauthClientId build() { return new OauthClientId(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthClientId oauthClientId = (OauthClientId) o;
    return Objects.equals(this.clientId, oauthClientId.clientId) &&
        Objects.equals(this.accountId, oauthClientId.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthClientId {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
