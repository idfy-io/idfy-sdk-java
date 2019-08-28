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
import io.idfy.notification.models.WebhookConfig;
import io.idfy.notification.models.WebhookResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * WebhookDto
 */
@JsonDeserialize(builder = WebhookDto.Builder.class)
public class WebhookDto  implements Serializable {
  /**
   * The webhooks unique identifier.
   */
  private final Integer id;  // Default value is: null

  /**
   * Display name of the webhook.
   */
  private final String name;  // Default value is: null

  /**
   * Determines if the webhook is active.
   */
  private final Boolean active;  // Default value is: null

  /**
   * A list of events that the webhook triggers for.
   */
  private final List<String> events;  // Default value is: new ArrayList<>()

  private final WebhookConfig config;  // Default value is: null

  /**
   * Time at which the webhook was created.
   */
  private final OffsetDateTime createdAt;  // Default value is: null

  /**
   * Time at which the webhook was last updated.
   */
  private final OffsetDateTime updatedAt;  // Default value is: null

  private final WebhookResponse lastResponse;  // Default value is: null

  /**
   * A list of event tags that the webhook triggers for.
   */
  private final List<String> tags;  // Default value is: new ArrayList<>()

  private WebhookDto(Builder builder) {
      id = builder.id;
      name = builder.name;
      active = builder.active;
      events = builder.events;
      config = builder.config;
      createdAt = builder.createdAt;
      updatedAt = builder.updatedAt;
      lastResponse = builder.lastResponse;
      tags = builder.tags;
  }

      /**
      * The webhooks unique identifier.
      * @return id
      **/
      public Integer getId() {return id;}

      /**
      * Display name of the webhook.
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Determines if the webhook is active.
      * @return active
      **/
      public Boolean getActive() {return active;}

      /**
      * A list of events that the webhook triggers for.
      * @return events
      **/
      public List<String> getEvents() {return events;}

      /**
      * Get config
      * @return config
      **/
      public WebhookConfig getConfig() {return config;}

      /**
      * Time at which the webhook was created.
      * @return createdAt
      **/
      public OffsetDateTime getCreatedAt() {return createdAt;}

      /**
      * Time at which the webhook was last updated.
      * @return updatedAt
      **/
      public OffsetDateTime getUpdatedAt() {return updatedAt;}

      /**
      * Get lastResponse
      * @return lastResponse
      **/
      public WebhookResponse getLastResponse() {return lastResponse;}

      /**
      * A list of event tags that the webhook triggers for.
      * @return tags
      **/
      public List<String> getTags() {return tags;}


  public static final class Builder {
      private Integer id;
      private String name;
      private Boolean active;
      private List<String> events;
      private WebhookConfig config;
      private OffsetDateTime createdAt;
      private OffsetDateTime updatedAt;
      private WebhookResponse lastResponse;
      private List<String> tags;

    public Builder() {
    }

    public Builder(WebhookDto copy) {
        this.id = copy.getId();
        this.name = copy.getName();
        this.active = copy.getActive();
        this.events = copy.getEvents();
        this.config = copy.getConfig();
        this.createdAt = copy.getCreatedAt();
        this.updatedAt = copy.getUpdatedAt();
        this.lastResponse = copy.getLastResponse();
        this.tags = copy.getTags();
    }

    public Builder withId(Integer id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withActive(Boolean active) {
      this.active = active;
      return this;
    }

    public Builder withEvents(List<String> events) {
      this.events = events;
      return this;
    }

    public Builder addEventsItem(String eventsItem) {
      if (this.events == null) {
        this.events = new ArrayList<>();
      }
      this.events.add(eventsItem);
      return this;
    }

    public Builder withConfig(WebhookConfig config) {
      this.config = config;
      return this;
    }

    public Builder withCreatedAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder withUpdatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    public Builder withLastResponse(WebhookResponse lastResponse) {
      this.lastResponse = lastResponse;
      return this;
    }

    public Builder withTags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    public Builder addTagsItem(String tagsItem) {
      if (this.tags == null) {
        this.tags = new ArrayList<>();
      }
      this.tags.add(tagsItem);
      return this;
    }


    public WebhookDto build() { return new WebhookDto(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookDto webhookDto = (WebhookDto) o;
    return Objects.equals(this.id, webhookDto.id) &&
        Objects.equals(this.name, webhookDto.name) &&
        Objects.equals(this.active, webhookDto.active) &&
        Objects.equals(this.events, webhookDto.events) &&
        Objects.equals(this.config, webhookDto.config) &&
        Objects.equals(this.createdAt, webhookDto.createdAt) &&
        Objects.equals(this.updatedAt, webhookDto.updatedAt) &&
        Objects.equals(this.lastResponse, webhookDto.lastResponse) &&
        Objects.equals(this.tags, webhookDto.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, active, events, config, createdAt, updatedAt, lastResponse, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    lastResponse: ").append(toIndentedString(lastResponse)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
