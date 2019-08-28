/*
 * Notification
 * This endpoint lets you manage events that are raised when something happens in your account.  
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.notification.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * WebhookConfig
 */
@JsonDeserialize(builder = WebhookConfig.Builder.class)
public class WebhookConfig  implements Serializable {
  /**
   * The URL to which the payloads will be delivered.
   */
  private final String url;  // Default value is: null

  /**
   * Optional secret used to compute a HMAC hex digest of the payload,   which is passed with the HTTP request as an ``X-Idfy-Signature`` header.
   */
  private final String secret;  // Default value is: null

  /**
   * Determines whether to log webhook delivery attempts. Defaults to &#x60;never&#x60;.
   */
  public enum DeliveryLogging {
    @JsonProperty("never")
    NEVER("never"),
    
    @JsonProperty("failed")
    FAILED("failed"),
    
    @JsonProperty("always")
    ALWAYS("always");

    private String value;

    DeliveryLogging(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryLogging fromValue(String text) {
      for (DeliveryLogging b : DeliveryLogging.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Determines whether to log webhook delivery attempts. Defaults to `never`.
   */
  private final DeliveryLogging deliveryLogging;  // Default value is: null

  private WebhookConfig(Builder builder) {
      url = builder.url;
      secret = builder.secret;
      deliveryLogging = builder.deliveryLogging;
  }

      /**
      * The URL to which the payloads will be delivered.
      * @return url
      **/
      public String getUrl() {return url;}

      /**
      * Optional secret used to compute a HMAC hex digest of the payload,   which is passed with the HTTP request as an ``X-Idfy-Signature`` header.
      * @return secret
      **/
      public String getSecret() {return secret;}

      /**
      * Determines whether to log webhook delivery attempts. Defaults to `never`.
      * @return deliveryLogging
      **/
      public DeliveryLogging getDeliveryLogging() {return deliveryLogging;}


  public static final class Builder {
      private String url;
      private String secret;
      private DeliveryLogging deliveryLogging;

    public Builder() {
    }

    public Builder(WebhookConfig copy) {
        this.url = copy.getUrl();
        this.secret = copy.getSecret();
        this.deliveryLogging = copy.getDeliveryLogging();
    }

    public Builder withUrl(String url) {
      this.url = url;
      return this;
    }

    public Builder withSecret(String secret) {
      this.secret = secret;
      return this;
    }

    public Builder withDeliveryLogging(DeliveryLogging deliveryLogging) {
      this.deliveryLogging = deliveryLogging;
      return this;
    }


    public WebhookConfig build() { return new WebhookConfig(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookConfig webhookConfig = (WebhookConfig) o;
    return Objects.equals(this.url, webhookConfig.url) &&
        Objects.equals(this.secret, webhookConfig.secret) &&
        Objects.equals(this.deliveryLogging, webhookConfig.deliveryLogging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, secret, deliveryLogging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookConfig {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    deliveryLogging: ").append(toIndentedString(deliveryLogging)).append("\n");
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
