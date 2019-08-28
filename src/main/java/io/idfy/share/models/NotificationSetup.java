/*
 * Idfy Secure Share
 * This endpoints enables secure sharing with multiple e-ids offered for login
 *
 * OpenAPI spec version: v1
 * 
 */

package io.idfy.share.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Setup of notifications
 */
@JsonDeserialize(builder = NotificationSetup.Builder.class)
public class NotificationSetup  implements Serializable {
  /**
   * What form of notification for creation.   Defaults to off
   */
  public enum Request {
    @JsonProperty("Off")
    OFF("Off"),
    
    @JsonProperty("SendSms")
    SENDSMS("SendSms"),
    
    @JsonProperty("SendEmail")
    SENDEMAIL("SendEmail"),
    
    @JsonProperty("SendBoth")
    SENDBOTH("SendBoth");

    private String value;

    Request(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Request fromValue(String text) {
      for (Request b : Request.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * What form of notification for creation.   Defaults to off
   */
  private final Request request;  // Default value is: null

  /**
   * What form of notification for reminder.   Defaults to off
   */
  public enum Reminder {
    @JsonProperty("Off")
    OFF("Off"),
    
    @JsonProperty("SendSms")
    SENDSMS("SendSms"),
    
    @JsonProperty("SendEmail")
    SENDEMAIL("SendEmail"),
    
    @JsonProperty("SendBoth")
    SENDBOTH("SendBoth");

    private String value;

    Reminder(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Reminder fromValue(String text) {
      for (Reminder b : Reminder.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * What form of notification for reminder.   Defaults to off
   */
  private final Reminder reminder;  // Default value is: null

  private NotificationSetup(Builder builder) {
      request = builder.request;
      reminder = builder.reminder;
  }

      /**
      * What form of notification for creation.   Defaults to off
      * @return request
      **/
      public Request getRequest() {return request;}

      /**
      * What form of notification for reminder.   Defaults to off
      * @return reminder
      **/
      public Reminder getReminder() {return reminder;}


  public static final class Builder {
      private Request request;
      private Reminder reminder;

    public Builder() {
    }

    public Builder(NotificationSetup copy) {
        this.request = copy.getRequest();
        this.reminder = copy.getReminder();
    }

    public Builder withRequest(Request request) {
      this.request = request;
      return this;
    }

    public Builder withReminder(Reminder reminder) {
      this.reminder = reminder;
      return this;
    }


    public NotificationSetup build() { return new NotificationSetup(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSetup notificationSetup = (NotificationSetup) o;
    return Objects.equals(this.request, notificationSetup.request) &&
        Objects.equals(this.reminder, notificationSetup.reminder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, reminder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSetup {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    reminder: ").append(toIndentedString(reminder)).append("\n");
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
