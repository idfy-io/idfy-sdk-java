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
import io.idfy.notification.models.WebhookCreateConfig;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * WebhookCreateDto
 */
@JsonDeserialize(builder = WebhookCreateDto.Builder.class)
public class WebhookCreateDto  implements Serializable {
  /**
   * Display name of the webhook.
   */
  private final String name;  // Default value is: null

  /**
   * Determines whether the webhook is active or not.
   */
  private final Boolean active;  // Default value is: null

  /**
   * A list of events that the webhook triggers for.
   */
  private final List<String> events;  // Default value is: new ArrayList<>()

  private final WebhookCreateConfig config;  // Default value is: null

  /**
   * An optional list of event tags that the webhook triggers for.
   */
  private final List<String> tags;  // Default value is: new ArrayList<>()

  private WebhookCreateDto(Builder builder) {
      name = builder.name;
      active = builder.active;
      events = builder.events;
      config = builder.config;
      tags = builder.tags;
  }

      /**
      * Display name of the webhook.
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Determines whether the webhook is active or not.
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
      public WebhookCreateConfig getConfig() {return config;}

      /**
      * An optional list of event tags that the webhook triggers for.
      * @return tags
      **/
      public List<String> getTags() {return tags;}


  public static final class Builder {
      private String name;
      private Boolean active;
      private List<String> events;
      private WebhookCreateConfig config;
      private List<String> tags;

    public Builder() {
    }

    public Builder(WebhookCreateDto copy) {
        this.name = copy.getName();
        this.active = copy.getActive();
        this.events = copy.getEvents();
        this.config = copy.getConfig();
        this.tags = copy.getTags();
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
      this.events.add(eventsItem);
      return this;
    }

    public Builder withConfig(WebhookCreateConfig config) {
      this.config = config;
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


    public WebhookCreateDto build() { return new WebhookCreateDto(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookCreateDto webhookCreateDto = (WebhookCreateDto) o;
    return Objects.equals(this.name, webhookCreateDto.name) &&
        Objects.equals(this.active, webhookCreateDto.active) &&
        Objects.equals(this.events, webhookCreateDto.events) &&
        Objects.equals(this.config, webhookCreateDto.config) &&
        Objects.equals(this.tags, webhookCreateDto.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, active, events, config, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookCreateDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
