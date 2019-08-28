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
import java.util.UUID;
import java.io.Serializable;

/**
 * WebhookDeliveryDto
 */
@JsonDeserialize(builder = WebhookDeliveryDto.Builder.class)
public class WebhookDeliveryDto  implements Serializable {
  /**
   * The webhooks unique identifier.
   */
  private final UUID id;  // Default value is: null

  private final Integer webhookId;  // Default value is: null

  private final UUID eventId;  // Default value is: null

  private final OffsetDateTime timestamp;  // Default value is: null

  private final String url;  // Default value is: null

  private final Long elapsedMs;  // Default value is: null

  private final Object requestHeaders;  // Default value is: null

  private final Object requestBody;  // Default value is: null

  private final Object responseHeaders;  // Default value is: null

  private final Object responseBody;  // Default value is: null

  private final Integer responseStatusCode;  // Default value is: null

  private final String responseMessage;  // Default value is: null

  private final String errorMessage;  // Default value is: null

  private WebhookDeliveryDto(Builder builder) {
      id = builder.id;
      webhookId = builder.webhookId;
      eventId = builder.eventId;
      timestamp = builder.timestamp;
      url = builder.url;
      elapsedMs = builder.elapsedMs;
      requestHeaders = builder.requestHeaders;
      requestBody = builder.requestBody;
      responseHeaders = builder.responseHeaders;
      responseBody = builder.responseBody;
      responseStatusCode = builder.responseStatusCode;
      responseMessage = builder.responseMessage;
      errorMessage = builder.errorMessage;
  }

      /**
      * The webhooks unique identifier.
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * Get webhookId
      * @return webhookId
      **/
      public Integer getWebhookId() {return webhookId;}

      /**
      * Get eventId
      * @return eventId
      **/
      public UUID getEventId() {return eventId;}

      /**
      * Get timestamp
      * @return timestamp
      **/
      public OffsetDateTime getTimestamp() {return timestamp;}

      /**
      * Get url
      * @return url
      **/
      public String getUrl() {return url;}

      /**
      * Get elapsedMs
      * @return elapsedMs
      **/
      public Long getElapsedMs() {return elapsedMs;}

      /**
      * Get requestHeaders
      * @return requestHeaders
      **/
      public Object getRequestHeaders() {return requestHeaders;}

      /**
      * Get requestBody
      * @return requestBody
      **/
      public Object getRequestBody() {return requestBody;}

      /**
      * Get responseHeaders
      * @return responseHeaders
      **/
      public Object getResponseHeaders() {return responseHeaders;}

      /**
      * Get responseBody
      * @return responseBody
      **/
      public Object getResponseBody() {return responseBody;}

      /**
      * Get responseStatusCode
      * @return responseStatusCode
      **/
      public Integer getResponseStatusCode() {return responseStatusCode;}

      /**
      * Get responseMessage
      * @return responseMessage
      **/
      public String getResponseMessage() {return responseMessage;}

      /**
      * Get errorMessage
      * @return errorMessage
      **/
      public String getErrorMessage() {return errorMessage;}


  public static final class Builder {
      private UUID id;
      private Integer webhookId;
      private UUID eventId;
      private OffsetDateTime timestamp;
      private String url;
      private Long elapsedMs;
      private Object requestHeaders;
      private Object requestBody;
      private Object responseHeaders;
      private Object responseBody;
      private Integer responseStatusCode;
      private String responseMessage;
      private String errorMessage;

    public Builder() {
    }

    public Builder(WebhookDeliveryDto copy) {
        this.id = copy.getId();
        this.webhookId = copy.getWebhookId();
        this.eventId = copy.getEventId();
        this.timestamp = copy.getTimestamp();
        this.url = copy.getUrl();
        this.elapsedMs = copy.getElapsedMs();
        this.requestHeaders = copy.getRequestHeaders();
        this.requestBody = copy.getRequestBody();
        this.responseHeaders = copy.getResponseHeaders();
        this.responseBody = copy.getResponseBody();
        this.responseStatusCode = copy.getResponseStatusCode();
        this.responseMessage = copy.getResponseMessage();
        this.errorMessage = copy.getErrorMessage();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withWebhookId(Integer webhookId) {
      this.webhookId = webhookId;
      return this;
    }

    public Builder withEventId(UUID eventId) {
      this.eventId = eventId;
      return this;
    }

    public Builder withTimestamp(OffsetDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder withUrl(String url) {
      this.url = url;
      return this;
    }

    public Builder withElapsedMs(Long elapsedMs) {
      this.elapsedMs = elapsedMs;
      return this;
    }

    public Builder withRequestHeaders(Object requestHeaders) {
      this.requestHeaders = requestHeaders;
      return this;
    }

    public Builder withRequestBody(Object requestBody) {
      this.requestBody = requestBody;
      return this;
    }

    public Builder withResponseHeaders(Object responseHeaders) {
      this.responseHeaders = responseHeaders;
      return this;
    }

    public Builder withResponseBody(Object responseBody) {
      this.responseBody = responseBody;
      return this;
    }

    public Builder withResponseStatusCode(Integer responseStatusCode) {
      this.responseStatusCode = responseStatusCode;
      return this;
    }

    public Builder withResponseMessage(String responseMessage) {
      this.responseMessage = responseMessage;
      return this;
    }

    public Builder withErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }


    public WebhookDeliveryDto build() { return new WebhookDeliveryDto(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookDeliveryDto webhookDeliveryDto = (WebhookDeliveryDto) o;
    return Objects.equals(this.id, webhookDeliveryDto.id) &&
        Objects.equals(this.webhookId, webhookDeliveryDto.webhookId) &&
        Objects.equals(this.eventId, webhookDeliveryDto.eventId) &&
        Objects.equals(this.timestamp, webhookDeliveryDto.timestamp) &&
        Objects.equals(this.url, webhookDeliveryDto.url) &&
        Objects.equals(this.elapsedMs, webhookDeliveryDto.elapsedMs) &&
        Objects.equals(this.requestHeaders, webhookDeliveryDto.requestHeaders) &&
        Objects.equals(this.requestBody, webhookDeliveryDto.requestBody) &&
        Objects.equals(this.responseHeaders, webhookDeliveryDto.responseHeaders) &&
        Objects.equals(this.responseBody, webhookDeliveryDto.responseBody) &&
        Objects.equals(this.responseStatusCode, webhookDeliveryDto.responseStatusCode) &&
        Objects.equals(this.responseMessage, webhookDeliveryDto.responseMessage) &&
        Objects.equals(this.errorMessage, webhookDeliveryDto.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, webhookId, eventId, timestamp, url, elapsedMs, requestHeaders, requestBody, responseHeaders, responseBody, responseStatusCode, responseMessage, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookDeliveryDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    elapsedMs: ").append(toIndentedString(elapsedMs)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
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
