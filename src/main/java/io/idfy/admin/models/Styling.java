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
 * Styling
 */
@JsonDeserialize(builder = Styling.Builder.class)
public class Styling  implements Serializable {
  private final UUID accountId;  // Default value is: null

  private final String base64EncodedCssData;  // Default value is: null

  private final String fileName;  // Default value is: null

  private Styling(Builder builder) {
      accountId = builder.accountId;
      base64EncodedCssData = builder.base64EncodedCssData;
      fileName = builder.fileName;
  }

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Get base64EncodedCssData
      * @return base64EncodedCssData
      **/
      public String getBase64EncodedCssData() {return base64EncodedCssData;}

      /**
      * Get fileName
      * @return fileName
      **/
      public String getFileName() {return fileName;}


  public static final class Builder {
      private UUID accountId;
      private String base64EncodedCssData;
      private String fileName;

    public Builder() {
    }

    public Builder(Styling copy) {
        this.accountId = copy.getAccountId();
        this.base64EncodedCssData = copy.getBase64EncodedCssData();
        this.fileName = copy.getFileName();
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withBase64EncodedCssData(String base64EncodedCssData) {
      this.base64EncodedCssData = base64EncodedCssData;
      return this;
    }

    public Builder withFileName(String fileName) {
      this.fileName = fileName;
      return this;
    }


    public Styling build() { return new Styling(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Styling styling = (Styling) o;
    return Objects.equals(this.accountId, styling.accountId) &&
        Objects.equals(this.base64EncodedCssData, styling.base64EncodedCssData) &&
        Objects.equals(this.fileName, styling.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, base64EncodedCssData, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Styling {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    base64EncodedCssData: ").append(toIndentedString(base64EncodedCssData)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
