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
 * AccountListItem
 */
@JsonDeserialize(builder = AccountListItem.Builder.class)
public class AccountListItem  implements Serializable {
  private final UUID accountId;  // Default value is: null

  private final String name;  // Default value is: null

  private final String orgNo;  // Default value is: null

  private final String uniCustomerNo;  // Default value is: null

  private final OffsetDateTime created;  // Default value is: null

  private final OffsetDateTime lastModified;  // Default value is: null

  private final String dealerId;  // Default value is: null

  private final String dealerName;  // Default value is: null

  private final String dealerReference;  // Default value is: null

  private final Boolean enabled;  // Default value is: null

  private AccountListItem(Builder builder) {
      accountId = builder.accountId;
      name = builder.name;
      orgNo = builder.orgNo;
      uniCustomerNo = builder.uniCustomerNo;
      created = builder.created;
      lastModified = builder.lastModified;
      dealerId = builder.dealerId;
      dealerName = builder.dealerName;
      dealerReference = builder.dealerReference;
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
      * Get orgNo
      * @return orgNo
      **/
      public String getOrgNo() {return orgNo;}

      /**
      * Get uniCustomerNo
      * @return uniCustomerNo
      **/
      public String getUniCustomerNo() {return uniCustomerNo;}

      /**
      * Get created
      * @return created
      **/
      public OffsetDateTime getCreated() {return created;}

      /**
      * Get lastModified
      * @return lastModified
      **/
      public OffsetDateTime getLastModified() {return lastModified;}

      /**
      * Get dealerId
      * @return dealerId
      **/
      public String getDealerId() {return dealerId;}

      /**
      * Get dealerName
      * @return dealerName
      **/
      public String getDealerName() {return dealerName;}

      /**
      * Get dealerReference
      * @return dealerReference
      **/
      public String getDealerReference() {return dealerReference;}

      /**
      * Get enabled
      * @return enabled
      **/
      public Boolean getEnabled() {return enabled;}


  public static final class Builder {
      private UUID accountId;
      private String name;
      private String orgNo;
      private String uniCustomerNo;
      private OffsetDateTime created;
      private OffsetDateTime lastModified;
      private String dealerId;
      private String dealerName;
      private String dealerReference;
      private Boolean enabled;

    public Builder() {
    }

    public Builder(AccountListItem copy) {
        this.accountId = copy.getAccountId();
        this.name = copy.getName();
        this.orgNo = copy.getOrgNo();
        this.uniCustomerNo = copy.getUniCustomerNo();
        this.created = copy.getCreated();
        this.lastModified = copy.getLastModified();
        this.dealerId = copy.getDealerId();
        this.dealerName = copy.getDealerName();
        this.dealerReference = copy.getDealerReference();
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

    public Builder withOrgNo(String orgNo) {
      this.orgNo = orgNo;
      return this;
    }

    public Builder withUniCustomerNo(String uniCustomerNo) {
      this.uniCustomerNo = uniCustomerNo;
      return this;
    }

    public Builder withCreated(OffsetDateTime created) {
      this.created = created;
      return this;
    }

    public Builder withLastModified(OffsetDateTime lastModified) {
      this.lastModified = lastModified;
      return this;
    }

    public Builder withDealerId(String dealerId) {
      this.dealerId = dealerId;
      return this;
    }

    public Builder withDealerName(String dealerName) {
      this.dealerName = dealerName;
      return this;
    }

    public Builder withDealerReference(String dealerReference) {
      this.dealerReference = dealerReference;
      return this;
    }

    public Builder withEnabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }


    public AccountListItem build() { return new AccountListItem(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountListItem accountListItem = (AccountListItem) o;
    return Objects.equals(this.accountId, accountListItem.accountId) &&
        Objects.equals(this.name, accountListItem.name) &&
        Objects.equals(this.orgNo, accountListItem.orgNo) &&
        Objects.equals(this.uniCustomerNo, accountListItem.uniCustomerNo) &&
        Objects.equals(this.created, accountListItem.created) &&
        Objects.equals(this.lastModified, accountListItem.lastModified) &&
        Objects.equals(this.dealerId, accountListItem.dealerId) &&
        Objects.equals(this.dealerName, accountListItem.dealerName) &&
        Objects.equals(this.dealerReference, accountListItem.dealerReference) &&
        Objects.equals(this.enabled, accountListItem.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, name, orgNo, uniCustomerNo, created, lastModified, dealerId, dealerName, dealerReference, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountListItem {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgNo: ").append(toIndentedString(orgNo)).append("\n");
    sb.append("    uniCustomerNo: ").append(toIndentedString(uniCustomerNo)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    dealerId: ").append(toIndentedString(dealerId)).append("\n");
    sb.append("    dealerName: ").append(toIndentedString(dealerName)).append("\n");
    sb.append("    dealerReference: ").append(toIndentedString(dealerReference)).append("\n");
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
