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
 * AccountNameItem
 */
@JsonDeserialize(builder = AccountNameItem.Builder.class)
public class AccountNameItem  implements Serializable {
  private final UUID accountId;  // Default value is: null

  private final String name;  // Default value is: null

  private final Boolean enabled;  // Default value is: null

  private AccountNameItem(Builder builder) {
      accountId = builder.accountId;
      name = builder.name;
      enabled = builder.enabled;
  }

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get enabled
      * @return enabled
      **/
      public Boolean getEnabled() {return enabled;}


  public static final class Builder {
      private UUID accountId;
      private String name;
      private Boolean enabled;

    public Builder() {
    }

    public Builder(AccountNameItem copy) {
        this.accountId = copy.getAccountId();
        this.name = copy.getName();
        this.enabled = copy.getEnabled();
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withEnabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }


    public AccountNameItem build() { return new AccountNameItem(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountNameItem accountNameItem = (AccountNameItem) o;
    return Objects.equals(this.accountId, accountNameItem.accountId) &&
        Objects.equals(this.name, accountNameItem.name) &&
        Objects.equals(this.enabled, accountNameItem.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, name, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountNameItem {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
