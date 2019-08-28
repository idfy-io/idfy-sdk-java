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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * WebhookResponse
 */
@JsonDeserialize(builder = WebhookResponse.Builder.class)
public class WebhookResponse  implements Serializable {
  /**
   * The status code returned by the webhook endpoint on last delivery attempt.
   */
  private final Integer code;  // Default value is: null

  /**
   * The message returned by the webhook endpoint on last delivery attempt.
   */
  private final String message;  // Default value is: null

  /**
   * Time at which the last delivery attempt was made.
   */
  private final OffsetDateTime timestamp;  // Default value is: null

  private WebhookResponse(Builder builder) {
      code = builder.code;
      message = builder.message;
      timestamp = builder.timestamp;
  }

      /**
      * The status code returned by the webhook endpoint on last delivery attempt.
      * @return code
      **/
      public Integer getCode() {return code;}

      /**
      * The message returned by the webhook endpoint on last delivery attempt.
      * @return message
      **/
      public String getMessage() {return message;}

      /**
      * Time at which the last delivery attempt was made.
      * @return timestamp
      **/
      public OffsetDateTime getTimestamp() {return timestamp;}


  public static final class Builder {
      private Integer code;
      private String message;
      private OffsetDateTime timestamp;

    public Builder() {
    }

    public Builder(WebhookResponse copy) {
        this.code = copy.getCode();
        this.message = copy.getMessage();
        this.timestamp = copy.getTimestamp();
    }

    public Builder withCode(Integer code) {
      this.code = code;
      return this;
    }

    public Builder withMessage(String message) {
      this.message = message;
      return this;
    }

    public Builder withTimestamp(OffsetDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }


    public WebhookResponse build() { return new WebhookResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.code, webhookResponse.code) &&
        Objects.equals(this.message, webhookResponse.message) &&
        Objects.equals(this.timestamp, webhookResponse.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
