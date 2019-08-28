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
 * Transaction
 */
@JsonDeserialize(builder = Transaction.Builder.class)
public class Transaction  implements Serializable {
  private final String accountId;  // Default value is: null

  /**
   * Number of transactions for the selected date
   */
  private final Integer count;  // Default value is: null

  /**
   * Uni micro customer number
   */
  private final Integer customerNumber;  // Default value is: null

  private final OffsetDateTime date;  // Default value is: null

  /**
   * Transaction description
   */
  private final String description;  // Default value is: null

  private final String externalRecordID;  // Default value is: null

  private final String externalRef;  // Default value is: null

  /**
   * Transaction ID
   */
  private final String ID;  // Default value is: null

  private final String internalRef;  // Default value is: null

  private final Integer mvaNumber;  // Default value is: null

  /**
   * Transaction Product ID
   */
  private final String productID;  // Default value is: null

  private Transaction(Builder builder) {
      accountId = builder.accountId;
      count = builder.count;
      customerNumber = builder.customerNumber;
      date = builder.date;
      description = builder.description;
      externalRecordID = builder.externalRecordID;
      externalRef = builder.externalRef;
      ID = builder.ID;
      internalRef = builder.internalRef;
      mvaNumber = builder.mvaNumber;
      productID = builder.productID;
  }

      /**
      * Get accountId
      * @return accountId
      **/
      public String getAccountId() {return accountId;}

      /**
      * Number of transactions for the selected date
      * @return count
      **/
      public Integer getCount() {return count;}

      /**
      * Uni micro customer number
      * @return customerNumber
      **/
      public Integer getCustomerNumber() {return customerNumber;}

      /**
      * Get date
      * @return date
      **/
      public OffsetDateTime getDate() {return date;}

      /**
      * Transaction description
      * @return description
      **/
      public String getDescription() {return description;}

      /**
      * Get externalRecordID
      * @return externalRecordID
      **/
      public String getExternalRecordID() {return externalRecordID;}

      /**
      * Get externalRef
      * @return externalRef
      **/
      public String getExternalRef() {return externalRef;}

      /**
      * Transaction ID
      * @return ID
      **/
      public String getID() {return ID;}

      /**
      * Get internalRef
      * @return internalRef
      **/
      public String getInternalRef() {return internalRef;}

      /**
      * Get mvaNumber
      * @return mvaNumber
      **/
      public Integer getMvaNumber() {return mvaNumber;}

      /**
      * Transaction Product ID
      * @return productID
      **/
      public String getProductID() {return productID;}


  public static final class Builder {
      private String accountId;
      private Integer count;
      private Integer customerNumber;
      private OffsetDateTime date;
      private String description;
      private String externalRecordID;
      private String externalRef;
      private String ID;
      private String internalRef;
      private Integer mvaNumber;
      private String productID;

    public Builder() {
    }

    public Builder(Transaction copy) {
        this.accountId = copy.getAccountId();
        this.count = copy.getCount();
        this.customerNumber = copy.getCustomerNumber();
        this.date = copy.getDate();
        this.description = copy.getDescription();
        this.externalRecordID = copy.getExternalRecordID();
        this.externalRef = copy.getExternalRef();
        this.ID = copy.getID();
        this.internalRef = copy.getInternalRef();
        this.mvaNumber = copy.getMvaNumber();
        this.productID = copy.getProductID();
    }

    public Builder withAccountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withCount(Integer count) {
      this.count = count;
      return this;
    }

    public Builder withCustomerNumber(Integer customerNumber) {
      this.customerNumber = customerNumber;
      return this;
    }

    public Builder withDate(OffsetDateTime date) {
      this.date = date;
      return this;
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder withExternalRecordID(String externalRecordID) {
      this.externalRecordID = externalRecordID;
      return this;
    }

    public Builder withExternalRef(String externalRef) {
      this.externalRef = externalRef;
      return this;
    }

    public Builder withID(String ID) {
      this.ID = ID;
      return this;
    }

    public Builder withInternalRef(String internalRef) {
      this.internalRef = internalRef;
      return this;
    }

    public Builder withMvaNumber(Integer mvaNumber) {
      this.mvaNumber = mvaNumber;
      return this;
    }

    public Builder withProductID(String productID) {
      this.productID = productID;
      return this;
    }


    public Transaction build() { return new Transaction(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.accountId, transaction.accountId) &&
        Objects.equals(this.count, transaction.count) &&
        Objects.equals(this.customerNumber, transaction.customerNumber) &&
        Objects.equals(this.date, transaction.date) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.externalRecordID, transaction.externalRecordID) &&
        Objects.equals(this.externalRef, transaction.externalRef) &&
        Objects.equals(this.ID, transaction.ID) &&
        Objects.equals(this.internalRef, transaction.internalRef) &&
        Objects.equals(this.mvaNumber, transaction.mvaNumber) &&
        Objects.equals(this.productID, transaction.productID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, count, customerNumber, date, description, externalRecordID, externalRef, ID, internalRef, mvaNumber, productID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalRecordID: ").append(toIndentedString(externalRecordID)).append("\n");
    sb.append("    externalRef: ").append(toIndentedString(externalRef)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    internalRef: ").append(toIndentedString(internalRef)).append("\n");
    sb.append("    mvaNumber: ").append(toIndentedString(mvaNumber)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
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
