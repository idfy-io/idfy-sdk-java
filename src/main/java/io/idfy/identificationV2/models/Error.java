/*
 * Idfy Identification v2
 * This endpoint enables identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID.
 *
 * OpenAPI spec version: v2
 * Contact: support@idfy.io
 */
package io.idfy.identificationV2.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.io.Serializable;

/**
 * Error details.
 */
@JsonDeserialize(builder = Error.Builder.class)
public class Error  implements Serializable {
  /**
   * An error message providing details about the error.
   */
  private final String message;  // Default value is: null

  /**
   * The error code reported.
   */
  private final String code;  // Default value is: null

  /**
   * The error code reported from the eID provider that was used.
   */
  private final String providerCode;  // Default value is: null

  private Error(Builder builder) {
      message = builder.message;
      code = builder.code;
      providerCode = builder.providerCode;
  }

      /**
      * An error message providing details about the error.
      * @return message
      **/
      public String getMessage() {return message;}

      /**
      * The error code reported.
      * @return code
      **/
      public String getCode() {return code;}

      /**
      * The error code reported from the eID provider that was used.
      * @return providerCode
      **/
      public String getProviderCode() {return providerCode;}


  public static final class Builder {
      private String message;
      private String code;
      private String providerCode;

    public Builder() {
    }

    public Builder(Error copy) {
        this.message = copy.getMessage();
        this.code = copy.getCode();
        this.providerCode = copy.getProviderCode();
    }

    public Builder withMessage(String message) {
      this.message = message;
      return this;
    }

    public Builder withCode(String code) {
      this.code = code;
      return this;
    }

    public Builder withProviderCode(String providerCode) {
      this.providerCode = providerCode;
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
    return Objects.equals(this.message, error.message) &&
        Objects.equals(this.code, error.code) &&
        Objects.equals(this.providerCode, error.providerCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, providerCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
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