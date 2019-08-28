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
 * MockEventRequest
 */
@JsonDeserialize(builder = MockEventRequest.Builder.class)
public class MockEventRequest  implements Serializable {
  /**
   * Event type to mock
   */
  private final String eventType;  // Default value is: null

  private MockEventRequest(Builder builder) {
      eventType = builder.eventType;
  }

      /**
      * Event type to mock
      * @return eventType
      **/
      public String getEventType() {return eventType;}


  public static final class Builder {
      private String eventType;

    public Builder() {
    }

    public Builder(MockEventRequest copy) {
        this.eventType = copy.getEventType();
    }

    public Builder withEventType(String eventType) {
      this.eventType = eventType;
      return this;
    }


    public MockEventRequest build() { return new MockEventRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MockEventRequest mockEventRequest = (MockEventRequest) o;
    return Objects.equals(this.eventType, mockEventRequest.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MockEventRequest {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
