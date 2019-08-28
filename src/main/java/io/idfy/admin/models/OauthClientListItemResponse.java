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
import java.time.OffsetDateTime;
import java.util.UUID;
import java.io.Serializable;

/**
 * OauthClientListItemResponse
 */
@JsonDeserialize(builder = OauthClientListItemResponse.Builder.class)
public class OauthClientListItemResponse  implements Serializable {
  private final String clientId;  // Default value is: null

  private final Boolean enabled;  // Default value is: null

  private final String clientName;  // Default value is: null

  private final UUID accountId;  // Default value is: null

  private final OffsetDateTime created;  // Default value is: null

  private final OffsetDateTime lastChanged;  // Default value is: null

  private OauthClientListItemResponse(Builder builder) {
      clientId = builder.clientId;
      enabled = builder.enabled;
      clientName = builder.clientName;
      accountId = builder.accountId;
      created = builder.created;
      lastChanged = builder.lastChanged;
  }

      /**
      * Get clientId
      * @return clientId
      **/
      public String getClientId() {return clientId;}

      /**
      * Get enabled
      * @return enabled
      **/
      public Boolean getEnabled() {return enabled;}

      /**
      * Get clientName
      * @return clientName
      **/
      public String getClientName() {return clientName;}

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Get created
      * @return created
      **/
      public OffsetDateTime getCreated() {return created;}

      /**
      * Get lastChanged
      * @return lastChanged
      **/
      public OffsetDateTime getLastChanged() {return lastChanged;}


  public static final class Builder {
      private String clientId;
      private Boolean enabled;
      private String clientName;
      private UUID accountId;
      private OffsetDateTime created;
      private OffsetDateTime lastChanged;

    public Builder() {
    }

    public Builder(OauthClientListItemResponse copy) {
        this.clientId = copy.getClientId();
        this.enabled = copy.getEnabled();
        this.clientName = copy.getClientName();
        this.accountId = copy.getAccountId();
        this.created = copy.getCreated();
        this.lastChanged = copy.getLastChanged();
    }

    public Builder withClientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    public Builder withEnabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    public Builder withClientName(String clientName) {
      this.clientName = clientName;
      return this;
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withCreated(OffsetDateTime created) {
      this.created = created;
      return this;
    }

    public Builder withLastChanged(OffsetDateTime lastChanged) {
      this.lastChanged = lastChanged;
      return this;
    }


    public OauthClientListItemResponse build() { return new OauthClientListItemResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthClientListItemResponse oauthClientListItemResponse = (OauthClientListItemResponse) o;
    return Objects.equals(this.clientId, oauthClientListItemResponse.clientId) &&
        Objects.equals(this.enabled, oauthClientListItemResponse.enabled) &&
        Objects.equals(this.clientName, oauthClientListItemResponse.clientName) &&
        Objects.equals(this.accountId, oauthClientListItemResponse.accountId) &&
        Objects.equals(this.created, oauthClientListItemResponse.created) &&
        Objects.equals(this.lastChanged, oauthClientListItemResponse.lastChanged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, enabled, clientName, accountId, created, lastChanged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthClientListItemResponse {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastChanged: ").append(toIndentedString(lastChanged)).append("\n");
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
