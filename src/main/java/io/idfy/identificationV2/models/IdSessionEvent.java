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

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * IdSessionEvent
 */
@JsonDeserialize(builder = IdSessionEvent.Builder.class)
public class IdSessionEvent  implements Serializable {
  private final Integer id;  // Default value is: null

  private final String name;  // Default value is: null

  private final IdSessionEventType eventType;  // Default value is: null

  private final OffsetDateTime timestamp;  // Default value is: null

  private final Map<String, Object> eventData;  // Default value is: new HashMap<String, Object>()

  private IdSessionEvent(Builder builder) {
      id = builder.id;
      name = builder.name;
      eventType = builder.eventType;
      timestamp = builder.timestamp;
      eventData = builder.eventData;
  }

      /**
      * Get id
      * @return id
      **/
      public Integer getId() {return id;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get eventType
      * @return eventType
      **/
      public IdSessionEventType getEventType() {return eventType;}

      /**
      * Get timestamp
      * @return timestamp
      **/
      public OffsetDateTime getTimestamp() {return timestamp;}

      /**
      * Get eventData
      * @return eventData
      **/
      public Map<String, Object> getEventData() {return eventData;}


  public static final class Builder {
      private Integer id;
      private String name;
      private IdSessionEventType eventType;
      private OffsetDateTime timestamp;
      private Map<String, Object> eventData;

    public Builder() {
    }

    public Builder(IdSessionEvent copy) {
        this.id = copy.getId();
        this.name = copy.getName();
        this.eventType = copy.getEventType();
        this.timestamp = copy.getTimestamp();
        this.eventData = copy.getEventData();
    }

    public Builder withId(Integer id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withEventType(IdSessionEventType eventType) {
      this.eventType = eventType;
      return this;
    }

    public Builder withTimestamp(OffsetDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder withEventData(Map<String, Object> eventData) {
      this.eventData = eventData;
      return this;
    }

    public Builder putEventDataItem(String key, Object eventDataItem) {
      if (this.eventData == null) {
        this.eventData = new HashMap<String, Object>();
      }
      this.eventData.put(key, eventDataItem);
      return this;
    }


    public IdSessionEvent build() { return new IdSessionEvent(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdSessionEvent idSessionEvent = (IdSessionEvent) o;
    return Objects.equals(this.id, idSessionEvent.id) &&
        Objects.equals(this.name, idSessionEvent.name) &&
        Objects.equals(this.eventType, idSessionEvent.eventType) &&
        Objects.equals(this.timestamp, idSessionEvent.timestamp) &&
        Objects.equals(this.eventData, idSessionEvent.eventData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, eventType, timestamp, eventData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdSessionEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
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