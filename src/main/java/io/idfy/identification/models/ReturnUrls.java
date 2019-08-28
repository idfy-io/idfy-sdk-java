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
 * Return urls for the identity request
 */
@JsonDeserialize(builder = ReturnUrls.Builder.class)
public class ReturnUrls  implements Serializable {
  /**
   * The url to be redirected to if the identification process fails. This url supports the following placeholders: [0] statuscode, [1] requestId, [2] ExternalReference (your unique id).
   */
  private final String error;  // Default value is: null

  /**
   * The url to be redirected to if the user aborts the identification process. This url supports the following placeholders: [1] requestId, [2] ExternalReference (your unique id).
   */
  private final String abort;  // Default value is: null

  /**
   * The return urls to be redirected to after the identification process is a success. This url supports the following placeholders: [1] requestId, [2] ExternalReference (your unique id).
   */
  private final String success;  // Default value is: null

  private ReturnUrls(Builder builder) {
      error = builder.error;
      abort = builder.abort;
      success = builder.success;
  }

      /**
      * The url to be redirected to if the identification process fails. This url supports the following placeholders: [0] statuscode, [1] requestId, [2] ExternalReference (your unique id).
      * @return error
      **/
      public String getError() {return error;}

      /**
      * The url to be redirected to if the user aborts the identification process. This url supports the following placeholders: [1] requestId, [2] ExternalReference (your unique id).
      * @return abort
      **/
      public String getAbort() {return abort;}

      /**
      * The return urls to be redirected to after the identification process is a success. This url supports the following placeholders: [1] requestId, [2] ExternalReference (your unique id).
      * @return success
      **/
      public String getSuccess() {return success;}


  public static final class Builder {
      private String error;
      private String abort;
      private String success;

    public Builder() {
    }

    public Builder(ReturnUrls copy) {
        this.error = copy.getError();
        this.abort = copy.getAbort();
        this.success = copy.getSuccess();
    }

    public Builder withError(String error) {
      this.error = error;
      return this;
    }

    public Builder withAbort(String abort) {
      this.abort = abort;
      return this;
    }

    public Builder withSuccess(String success) {
      this.success = success;
      return this;
    }


    public ReturnUrls build() { return new ReturnUrls(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnUrls returnUrls = (ReturnUrls) o;
    return Objects.equals(this.error, returnUrls.error) &&
        Objects.equals(this.abort, returnUrls.abort) &&
        Objects.equals(this.success, returnUrls.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, abort, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnUrls {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    abort: ").append(toIndentedString(abort)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
