/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.signature.models;

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
  /**
   * Idfy error message
   */
  private final String errorMessage;  // Default value is: null

  /**
   * Idfy error code
   */
  private final String errorCode;  // Default value is: null

  /**
   * Eid provider error message
   */
  private final String eidErrorMessage;  // Default value is: null

  /**
   * Eid provider error code
   */
  private final String eidErrorCode;  // Default value is: null

  private Error(Builder builder) {
      errorMessage = builder.errorMessage;
      errorCode = builder.errorCode;
      eidErrorMessage = builder.eidErrorMessage;
      eidErrorCode = builder.eidErrorCode;
  }

      /**
      * Idfy error message
      * @return errorMessage
      **/
      public String getErrorMessage() {return errorMessage;}

      /**
      * Idfy error code
      * @return errorCode
      **/
      public String getErrorCode() {return errorCode;}

      /**
      * Eid provider error message
      * @return eidErrorMessage
      **/
      public String getEidErrorMessage() {return eidErrorMessage;}

      /**
      * Eid provider error code
      * @return eidErrorCode
      **/
      public String getEidErrorCode() {return eidErrorCode;}


  public static final class Builder {
      private String errorMessage;
      private String errorCode;
      private String eidErrorMessage;
      private String eidErrorCode;

    public Builder() {
    }

    public Builder(Error copy) {
        this.errorMessage = copy.getErrorMessage();
        this.errorCode = copy.getErrorCode();
        this.eidErrorMessage = copy.getEidErrorMessage();
        this.eidErrorCode = copy.getEidErrorCode();
    }

    public Builder withErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    public Builder withErrorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    public Builder withEidErrorMessage(String eidErrorMessage) {
      this.eidErrorMessage = eidErrorMessage;
      return this;
    }

    public Builder withEidErrorCode(String eidErrorCode) {
      this.eidErrorCode = eidErrorCode;
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
    return Objects.equals(this.errorMessage, error.errorMessage) &&
        Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.eidErrorMessage, error.eidErrorMessage) &&
        Objects.equals(this.eidErrorCode, error.eidErrorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorCode, eidErrorMessage, eidErrorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    eidErrorMessage: ").append(toIndentedString(eidErrorMessage)).append("\n");
    sb.append("    eidErrorCode: ").append(toIndentedString(eidErrorCode)).append("\n");
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
