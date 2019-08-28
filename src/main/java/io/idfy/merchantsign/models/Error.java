/*
 * Idfy.MerchantSign
 * This endpoint lets you sign documents with a merchant signature. ## Last update   Last build date for this endpoint: 04.06.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.merchantsign.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Error
 */
@JsonDeserialize(builder = Error.Builder.class)
public class Error  implements Serializable {
  private final Integer errorCode;  // Default value is: null

  private final String errorDescription;  // Default value is: null

  private Error(Builder builder) {
      errorCode = builder.errorCode;
      errorDescription = builder.errorDescription;
  }

      /**
      * Get errorCode
      * @return errorCode
      **/
      public Integer getErrorCode() {return errorCode;}

      /**
      * Get errorDescription
      * @return errorDescription
      **/
      public String getErrorDescription() {return errorDescription;}


  public static final class Builder {
      private Integer errorCode;
      private String errorDescription;

    public Builder() {
    }

    public Builder(Error copy) {
        this.errorCode = copy.getErrorCode();
        this.errorDescription = copy.getErrorDescription();
    }

    public Builder withErrorCode(Integer errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    public Builder withErrorDescription(String errorDescription) {
      this.errorDescription = errorDescription;
      return this;
    }


    public Error build() { return new Error(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.errorDescription, error.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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
