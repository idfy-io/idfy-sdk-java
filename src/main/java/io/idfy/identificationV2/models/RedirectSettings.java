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
 * Redirect settings when using the &#x60;redirect&#x60; flow.
 */
@JsonDeserialize(builder = RedirectSettings.Builder.class)
public class RedirectSettings  implements Serializable {
  /**
   * The URL that the user is redirected to after a successful identification.
   */
  private final String successUrl;  // Default value is: null

  /**
   * The URL that the user is redirected to if the session is aborted by the user.
   */
  private final String abortUrl;  // Default value is: null

  /**
   * The URL that the user is redirected to if something goes wrong.
   */
  private final String errorUrl;  // Default value is: null

  private RedirectSettings(Builder builder) {
      successUrl = builder.successUrl;
      abortUrl = builder.abortUrl;
      errorUrl = builder.errorUrl;
  }

      /**
      * The URL that the user is redirected to after a successful identification.
      * @return successUrl
      **/
      public String getSuccessUrl() {return successUrl;}

      /**
      * The URL that the user is redirected to if the session is aborted by the user.
      * @return abortUrl
      **/
      public String getAbortUrl() {return abortUrl;}

      /**
      * The URL that the user is redirected to if something goes wrong.
      * @return errorUrl
      **/
      public String getErrorUrl() {return errorUrl;}


  public static final class Builder {
      private String successUrl;
      private String abortUrl;
      private String errorUrl;

    public Builder() {
    }

    public Builder(RedirectSettings copy) {
        this.successUrl = copy.getSuccessUrl();
        this.abortUrl = copy.getAbortUrl();
        this.errorUrl = copy.getErrorUrl();
    }

    public Builder withSuccessUrl(String successUrl) {
      this.successUrl = successUrl;
      return this;
    }

    public Builder withAbortUrl(String abortUrl) {
      this.abortUrl = abortUrl;
      return this;
    }

    public Builder withErrorUrl(String errorUrl) {
      this.errorUrl = errorUrl;
      return this;
    }


    public RedirectSettings build() { return new RedirectSettings(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectSettings redirectSettings = (RedirectSettings) o;
    return Objects.equals(this.successUrl, redirectSettings.successUrl) &&
        Objects.equals(this.abortUrl, redirectSettings.abortUrl) &&
        Objects.equals(this.errorUrl, redirectSettings.errorUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successUrl, abortUrl, errorUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectSettings {\n");
    
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    abortUrl: ").append(toIndentedString(abortUrl)).append("\n");
    sb.append("    errorUrl: ").append(toIndentedString(errorUrl)).append("\n");
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