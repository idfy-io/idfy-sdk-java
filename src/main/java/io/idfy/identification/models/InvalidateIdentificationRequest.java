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
 * Invalidates a identifyrequest so that it cannot be used twice.
 */
@JsonDeserialize(builder = InvalidateIdentificationRequest.Builder.class)
public class InvalidateIdentificationRequest  implements Serializable {
  /**
   * The requestid of the identification process
   */
  private final String requestId;  // Default value is: null

  private InvalidateIdentificationRequest(Builder builder) {
      requestId = builder.requestId;
  }

      /**
      * The requestid of the identification process
      * @return requestId
      **/
      public String getRequestId() {return requestId;}


  public static final class Builder {
      private String requestId;

    public Builder() {
    }

    public Builder(InvalidateIdentificationRequest copy) {
        this.requestId = copy.getRequestId();
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }


    public InvalidateIdentificationRequest build() { return new InvalidateIdentificationRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidateIdentificationRequest invalidateIdentificationRequest = (InvalidateIdentificationRequest) o;
    return Objects.equals(this.requestId, invalidateIdentificationRequest.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidateIdentificationRequest {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
