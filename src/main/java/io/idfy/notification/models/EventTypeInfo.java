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
 * EventTypeInfo
 */
@JsonDeserialize(builder = EventTypeInfo.Builder.class)
public class EventTypeInfo  implements Serializable {
  /**
   * Event type
   */
  public enum Id {
    @JsonProperty("document_before_deleted")
    BEFORE_DELETED("document_before_deleted"),
    
    @JsonProperty("document_canceled")
    CANCELED("document_canceled"),
    
    @JsonProperty("document_created")
    CREATED("document_created"),
    
    @JsonProperty("document_deleted")
    DELETED("document_deleted"),
    
    @JsonProperty("document_expired")
    EXPIRED("document_expired"),
    
    @JsonProperty("document_email_opened")
    EMAIL_OPENED("document_email_opened"),
    
    @JsonProperty("document_form_partially_signed")
    FORM_PARTIALLY_SIGNED("document_form_partially_signed"),
    
    @JsonProperty("document_form_signed")
    FORM_SIGNED("document_form_signed"),
    
    @JsonProperty("document_link_opened")
    LINK_OPENED("document_link_opened"),
    
    @JsonProperty("document_packaged")
    PACKAGED("document_packaged"),
    
    @JsonProperty("document_partially_signed")
    PARTIALLY_SIGNED("document_partially_signed"),
    
    @JsonProperty("document_read")
    READ("document_read"),
    
    @JsonProperty("document_signed")
    SIGNED("document_signed");

    private String value;

    Id(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Id fromValue(String text) {
      for (Id b : Id.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Event type
   */
  private final Id id;  // Default value is: null

  /**
   * Display name of the event
   */
  private final String name;  // Default value is: null

  /**
   * Description of the event
   */
  private final String description;  // Default value is: null

  private EventTypeInfo(Builder builder) {
      id = builder.id;
      name = builder.name;
      description = builder.description;
  }

      /**
      * Event type
      * @return id
      **/
      public Id getId() {return id;}

      /**
      * Display name of the event
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Description of the event
      * @return description
      **/
      public String getDescription() {return description;}


  public static final class Builder {
      private Id id;
      private String name;
      private String description;

    public Builder() {
    }

    public Builder(EventTypeInfo copy) {
        this.id = copy.getId();
        this.name = copy.getName();
        this.description = copy.getDescription();
    }

    public Builder withId(Id id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }


    public EventTypeInfo build() { return new EventTypeInfo(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTypeInfo eventTypeInfo = (EventTypeInfo) o;
    return Objects.equals(this.id, eventTypeInfo.id) &&
        Objects.equals(this.name, eventTypeInfo.name) &&
        Objects.equals(this.description, eventTypeInfo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTypeInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
