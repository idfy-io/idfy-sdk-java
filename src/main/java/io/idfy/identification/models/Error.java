/*
 * Idfy Identification
 * This endpoint enables authentication/identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID. ## Last update   Last build date for this endpoint: 02.04.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.identification.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Error details information
 */
@JsonDeserialize(builder = Error.Builder.class)
public class Error  implements Serializable {
  /**
   * The error code from the Identity provider
   */
  private final String nativeErrorCode;  // Default value is: null

  /**
   * The error code for the error
   */
  private final String errorCode;  // Default value is: null

  /**
   * Error message
   */
  private final String errorMessage;  // Default value is: null

  private Error(Builder builder) {
      nativeErrorCode = builder.nativeErrorCode;
      errorCode = builder.errorCode;
      errorMessage = builder.errorMessage;
  }

      /**
      * The error code from the Identity provider
      * @return nativeErrorCode
      **/
      public String getNativeErrorCode() {return nativeErrorCode;}

      /**
      * The error code for the error
      * @return errorCode
      **/
      public String getErrorCode() {return errorCode;}

      /**
      * Error message
      * @return errorMessage
      **/
      public String getErrorMessage() {return errorMessage;}


  public static final class Builder {
      private String nativeErrorCode;
      private String errorCode;
      private String errorMessage;

    public Builder() {
    }

    public Builder(Error copy) {
        this.nativeErrorCode = copy.getNativeErrorCode();
        this.errorCode = copy.getErrorCode();
        this.errorMessage = copy.getErrorMessage();
    }

    public Builder withNativeErrorCode(String nativeErrorCode) {
      this.nativeErrorCode = nativeErrorCode;
      return this;
    }

    public Builder withErrorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    public Builder withErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
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
    return Objects.equals(this.nativeErrorCode, error.nativeErrorCode) &&
        Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.errorMessage, error.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nativeErrorCode, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    nativeErrorCode: ").append(toIndentedString(nativeErrorCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
