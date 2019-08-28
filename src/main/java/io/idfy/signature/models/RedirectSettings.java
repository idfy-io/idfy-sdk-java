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
 * Settings for redirect.
 */
@JsonDeserialize(builder = RedirectSettings.Builder.class)
public class RedirectSettings  implements Serializable {
  /**
   * Defines the redirect mode to use for the signer.
   */
  public enum RedirectMode {
    @JsonProperty("donot_redirect")
    DONOT_REDIRECT("donot_redirect"),
    
    @JsonProperty("redirect")
    REDIRECT("redirect"),
    
    @JsonProperty("iframe_with_webmessaging")
    IFRAME_WITH_WEBMESSAGING("iframe_with_webmessaging"),
    
    @JsonProperty("iframe_with_redirect")
    IFRAME_WITH_REDIRECT("iframe_with_redirect"),
    
    @JsonProperty("iframe_with_redirect_and_webmessaging")
    IFRAME_WITH_REDIRECT_AND_WEBMESSAGING("iframe_with_redirect_and_webmessaging");

    private String value;

    RedirectMode(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RedirectMode fromValue(String text) {
      for (RedirectMode b : RedirectMode.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Defines the redirect mode to use for the signer.
   */
  private final RedirectMode redirectMode;  // Default value is: null

  /**
   * The domain your website is hosted on.  <span style=\"color: red;\">Required if you specify one of the iframe redirect modes for the signer.</span>
   */
  private final String domain;  // Default value is: null

  /**
   * The URL that the signer is redirected to if something goes wrong. <span style=\"color: red;\">Required if you use redirect for the signer.</span>
   */
  private final String error;  // Default value is: null

  /**
   * The URL that the signer is redirected to if the signing is cancelled. <span style=\"color: red;\">Required if you use redirect for the signer.</span>
   */
  private final String cancel;  // Default value is: null

  /**
   * The URL that the signer is redirected to after a successful signing. <span style=\"color: red;\">Required if you use redirect for the signer.</span>
   */
  private final String success;  // Default value is: null

  private RedirectSettings(Builder builder) {
      redirectMode = builder.redirectMode;
      domain = builder.domain;
      error = builder.error;
      cancel = builder.cancel;
      success = builder.success;
  }

      /**
      * Defines the redirect mode to use for the signer.
      * @return redirectMode
      **/
      public RedirectMode getRedirectMode() {return redirectMode;}

      /**
      * The domain your website is hosted on.  <span style=\"color: red;\">Required if you specify one of the iframe redirect modes for the signer.</span>
      * @return domain
      **/
      public String getDomain() {return domain;}

      /**
      * The URL that the signer is redirected to if something goes wrong. <span style=\"color: red;\">Required if you use redirect for the signer.</span>
      * @return error
      **/
      public String getError() {return error;}

      /**
      * The URL that the signer is redirected to if the signing is cancelled. <span style=\"color: red;\">Required if you use redirect for the signer.</span>
      * @return cancel
      **/
      public String getCancel() {return cancel;}

      /**
      * The URL that the signer is redirected to after a successful signing. <span style=\"color: red;\">Required if you use redirect for the signer.</span>
      * @return success
      **/
      public String getSuccess() {return success;}


  public static final class Builder {
      private RedirectMode redirectMode;
      private String domain;
      private String error;
      private String cancel;
      private String success;

    public Builder() {
    }

    public Builder(RedirectSettings copy) {
        this.redirectMode = copy.getRedirectMode();
        this.domain = copy.getDomain();
        this.error = copy.getError();
        this.cancel = copy.getCancel();
        this.success = copy.getSuccess();
    }

    public Builder withRedirectMode(RedirectMode redirectMode) {
      this.redirectMode = redirectMode;
      return this;
    }

    public Builder withDomain(String domain) {
      this.domain = domain;
      return this;
    }

    public Builder withError(String error) {
      this.error = error;
      return this;
    }

    public Builder withCancel(String cancel) {
      this.cancel = cancel;
      return this;
    }

    public Builder withSuccess(String success) {
      this.success = success;
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
    return Objects.equals(this.redirectMode, redirectSettings.redirectMode) &&
        Objects.equals(this.domain, redirectSettings.domain) &&
        Objects.equals(this.error, redirectSettings.error) &&
        Objects.equals(this.cancel, redirectSettings.cancel) &&
        Objects.equals(this.success, redirectSettings.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectMode, domain, error, cancel, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectSettings {\n");
    
    sb.append("    redirectMode: ").append(toIndentedString(redirectMode)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
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
