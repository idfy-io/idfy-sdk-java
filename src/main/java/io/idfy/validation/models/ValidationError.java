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
 * ValidationError
 */
@JsonDeserialize(builder = ValidationError.Builder.class)
public class ValidationError  implements Serializable {
  /**
   * Null if no errors is registered
   */
  private final String errorCode;  // Default value is: null

  /**
   * Null if no errors is registered
   */
  private final String errorMessage;  // Default value is: null

  private ValidationError(Builder builder) {
      errorCode = builder.errorCode;
      errorMessage = builder.errorMessage;
  }

      /**
      * Null if no errors is registered
      * @return errorCode
      **/
      public String getErrorCode() {return errorCode;}

      /**
      * Null if no errors is registered
      * @return errorMessage
      **/
      public String getErrorMessage() {return errorMessage;}


  public static final class Builder {
      private String errorCode;
      private String errorMessage;

    public Builder() {
    }

    public Builder(ValidationError copy) {
        this.errorCode = copy.getErrorCode();
        this.errorMessage = copy.getErrorMessage();
    }

    public Builder withErrorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    public Builder withErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }


    public ValidationError build() { return new ValidationError(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.errorCode, validationError.errorCode) &&
        Objects.equals(this.errorMessage, validationError.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    
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
