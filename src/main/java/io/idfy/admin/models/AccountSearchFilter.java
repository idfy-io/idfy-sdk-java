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
import java.io.Serializable;

/**
 * AccountSearchFilter
 */
@JsonDeserialize(builder = AccountSearchFilter.Builder.class)
public class AccountSearchFilter  implements Serializable {
  private final String name;  // Default value is: null

  private final String orgNo;  // Default value is: null

  private final String uniCustomerNo;  // Default value is: null

  private final OffsetDateTime createdBefore;  // Default value is: null

  private final OffsetDateTime createdAfter;  // Default value is: null

  private final OffsetDateTime lastModifiedBefore;  // Default value is: null

  private final OffsetDateTime lastModifiedAfter;  // Default value is: null

  private final String dealerName;  // Default value is: null

  private final String dealerReference;  // Default value is: null

  private final Boolean enabled;  // Default value is: null

  private AccountSearchFilter(Builder builder) {
      name = builder.name;
      orgNo = builder.orgNo;
      uniCustomerNo = builder.uniCustomerNo;
      createdBefore = builder.createdBefore;
      createdAfter = builder.createdAfter;
      lastModifiedBefore = builder.lastModifiedBefore;
      lastModifiedAfter = builder.lastModifiedAfter;
      dealerName = builder.dealerName;
      dealerReference = builder.dealerReference;
      enabled = builder.enabled;
  }

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
      * Get createdBefore
      * @return createdBefore
      **/
      public OffsetDateTime getCreatedBefore() {return createdBefore;}

      /**
      * Get createdAfter
      * @return createdAfter
      **/
      public OffsetDateTime getCreatedAfter() {return createdAfter;}

      /**
      * Get lastModifiedBefore
      * @return lastModifiedBefore
      **/
      public OffsetDateTime getLastModifiedBefore() {return lastModifiedBefore;}

      /**
      * Get lastModifiedAfter
      * @return lastModifiedAfter
      **/
      public OffsetDateTime getLastModifiedAfter() {return lastModifiedAfter;}

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
      private String name;
      private String orgNo;
      private String uniCustomerNo;
      private OffsetDateTime createdBefore;
      private OffsetDateTime createdAfter;
      private OffsetDateTime lastModifiedBefore;
      private OffsetDateTime lastModifiedAfter;
      private String dealerName;
      private String dealerReference;
      private Boolean enabled;

    public Builder() {
    }

    public Builder(AccountSearchFilter copy) {
        this.name = copy.getName();
        this.orgNo = copy.getOrgNo();
        this.uniCustomerNo = copy.getUniCustomerNo();
        this.createdBefore = copy.getCreatedBefore();
        this.createdAfter = copy.getCreatedAfter();
        this.lastModifiedBefore = copy.getLastModifiedBefore();
        this.lastModifiedAfter = copy.getLastModifiedAfter();
        this.dealerName = copy.getDealerName();
        this.dealerReference = copy.getDealerReference();
        this.enabled = copy.getEnabled();
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

    public Builder withCreatedBefore(OffsetDateTime createdBefore) {
      this.createdBefore = createdBefore;
      return this;
    }

    public Builder withCreatedAfter(OffsetDateTime createdAfter) {
      this.createdAfter = createdAfter;
      return this;
    }

    public Builder withLastModifiedBefore(OffsetDateTime lastModifiedBefore) {
      this.lastModifiedBefore = lastModifiedBefore;
      return this;
    }

    public Builder withLastModifiedAfter(OffsetDateTime lastModifiedAfter) {
      this.lastModifiedAfter = lastModifiedAfter;
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


    public AccountSearchFilter build() { return new AccountSearchFilter(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSearchFilter accountSearchFilter = (AccountSearchFilter) o;
    return Objects.equals(this.name, accountSearchFilter.name) &&
        Objects.equals(this.orgNo, accountSearchFilter.orgNo) &&
        Objects.equals(this.uniCustomerNo, accountSearchFilter.uniCustomerNo) &&
        Objects.equals(this.createdBefore, accountSearchFilter.createdBefore) &&
        Objects.equals(this.createdAfter, accountSearchFilter.createdAfter) &&
        Objects.equals(this.lastModifiedBefore, accountSearchFilter.lastModifiedBefore) &&
        Objects.equals(this.lastModifiedAfter, accountSearchFilter.lastModifiedAfter) &&
        Objects.equals(this.dealerName, accountSearchFilter.dealerName) &&
        Objects.equals(this.dealerReference, accountSearchFilter.dealerReference) &&
        Objects.equals(this.enabled, accountSearchFilter.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, orgNo, uniCustomerNo, createdBefore, createdAfter, lastModifiedBefore, lastModifiedAfter, dealerName, dealerReference, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchFilter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgNo: ").append(toIndentedString(orgNo)).append("\n");
    sb.append("    uniCustomerNo: ").append(toIndentedString(uniCustomerNo)).append("\n");
    sb.append("    createdBefore: ").append(toIndentedString(createdBefore)).append("\n");
    sb.append("    createdAfter: ").append(toIndentedString(createdAfter)).append("\n");
    sb.append("    lastModifiedBefore: ").append(toIndentedString(lastModifiedBefore)).append("\n");
    sb.append("    lastModifiedAfter: ").append(toIndentedString(lastModifiedAfter)).append("\n");
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
