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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * EventDto
 */
@JsonDeserialize(builder = EventDto.Builder.class)
public class EventDto  implements Serializable {
  private final UUID id;  // Default value is: null

  private final String type;  // Default value is: null

  private final Object payload;  // Default value is: null

  private final OffsetDateTime timestamp;  // Default value is: null

  private final UUID accountId;  // Default value is: null

  private final List<String> tags;  // Default value is: new ArrayList<>()

  private EventDto(Builder builder) {
      id = builder.id;
      type = builder.type;
      payload = builder.payload;
      timestamp = builder.timestamp;
      accountId = builder.accountId;
      tags = builder.tags;
  }

      /**
      * Get id
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * Get type
      * @return type
      **/
      public String getType() {return type;}

      /**
      * Get payload
      * @return payload
      **/
      public Object getPayload() {return payload;}

      /**
      * Get timestamp
      * @return timestamp
      **/
      public OffsetDateTime getTimestamp() {return timestamp;}

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Get tags
      * @return tags
      **/
      public List<String> getTags() {return tags;}


  public static final class Builder {
      private UUID id;
      private String type;
      private Object payload;
      private OffsetDateTime timestamp;
      private UUID accountId;
      private List<String> tags;

    public Builder() {
    }

    public Builder(EventDto copy) {
        this.id = copy.getId();
        this.type = copy.getType();
        this.payload = copy.getPayload();
        this.timestamp = copy.getTimestamp();
        this.accountId = copy.getAccountId();
        this.tags = copy.getTags();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withType(String type) {
      this.type = type;
      return this;
    }

    public Builder withPayload(Object payload) {
      this.payload = payload;
      return this;
    }

    public Builder withTimestamp(OffsetDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
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


    public EventDto build() { return new EventDto(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDto eventDto = (EventDto) o;
    return Objects.equals(this.id, eventDto.id) &&
        Objects.equals(this.type, eventDto.type) &&
        Objects.equals(this.payload, eventDto.payload) &&
        Objects.equals(this.timestamp, eventDto.timestamp) &&
        Objects.equals(this.accountId, eventDto.accountId) &&
        Objects.equals(this.tags, eventDto.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, payload, timestamp, accountId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
