/*
 * Idfy.Validation
 * In this API you can validate signatures from the following electronic IDs (e-ID)<br/><br/>  &bull; Norwegian BankId (SDO)<br/>  ## Last update [LastUpdate] ## Last update   Last build date for this endpoint: 12.03.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.validation.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * X509Certificate
 */
@JsonDeserialize(builder = X509Certificate.Builder.class)
public class X509Certificate  implements Serializable {
  private final String rawData;  // Default value is: null

  private X509Certificate(Builder builder) {
      rawData = builder.rawData;
  }

      /**
      * Get rawData
      * @return rawData
      **/
      public String getRawData() {return rawData;}


  public static final class Builder {
      private String rawData;

    public Builder() {
    }

    public Builder(X509Certificate copy) {
        this.rawData = copy.getRawData();
    }

    public Builder withRawData(String rawData) {
      this.rawData = rawData;
      return this;
    }


    public X509Certificate build() { return new X509Certificate(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    X509Certificate x509Certificate = (X509Certificate) o;
    return Objects.equals(this.rawData, x509Certificate.rawData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class X509Certificate {\n");
    
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
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
