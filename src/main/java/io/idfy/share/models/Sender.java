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
import io.idfy.share.models.Mobile;
import java.io.Serializable;

/**
 * Sender
 */
@JsonDeserialize(builder = Sender.Builder.class)
public class Sender  implements Serializable {
  /**
   * Email
   */
  private final String email;  // Default value is: null

  private final Mobile mobile;  // Default value is: null

  /**
   * What kind of notifications does this sender want to receive, defaults to off
   */
  public enum NotificationType {
    @JsonProperty("Off")
    OFF("Off"),
    
    @JsonProperty("SendSms")
    SENDSMS("SendSms"),
    
    @JsonProperty("SendEmail")
    SENDEMAIL("SendEmail"),
    
    @JsonProperty("SendBoth")
    SENDBOTH("SendBoth");

    private String value;

    NotificationType(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationType fromValue(String text) {
      for (NotificationType b : NotificationType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * What kind of notifications does this sender want to receive, defaults to off
   */
  private final NotificationType notificationType;  // Default value is: null

  /**
   * At what events does this sender want to be notified. Defaults to none
   */
  public enum NotificationEvent {
    @JsonProperty("None")
    NONE("None"),
    
    @JsonProperty("Single")
    SINGLE("Single"),
    
    @JsonProperty("Both")
    BOTH("Both"),
    
    @JsonProperty("All")
    ALL("All");

    private String value;

    NotificationEvent(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationEvent fromValue(String text) {
      for (NotificationEvent b : NotificationEvent.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * At what events does this sender want to be notified. Defaults to none
   */
  private final NotificationEvent notificationEvent;  // Default value is: null

  private Sender(Builder builder) {
      email = builder.email;
      mobile = builder.mobile;
      notificationType = builder.notificationType;
      notificationEvent = builder.notificationEvent;
  }

      /**
      * Email
      * @return email
      **/
      public String getEmail() {return email;}

      /**
      * Get mobile
      * @return mobile
      **/
      public Mobile getMobile() {return mobile;}

      /**
      * What kind of notifications does this sender want to receive, defaults to off
      * @return notificationType
      **/
      public NotificationType getNotificationType() {return notificationType;}

      /**
      * At what events does this sender want to be notified. Defaults to none
      * @return notificationEvent
      **/
      public NotificationEvent getNotificationEvent() {return notificationEvent;}


  public static final class Builder {
      private String email;
      private Mobile mobile;
      private NotificationType notificationType;
      private NotificationEvent notificationEvent;

    public Builder() {
    }

    public Builder(Sender copy) {
        this.email = copy.getEmail();
        this.mobile = copy.getMobile();
        this.notificationType = copy.getNotificationType();
        this.notificationEvent = copy.getNotificationEvent();
    }

    public Builder withEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder withMobile(Mobile mobile) {
      this.mobile = mobile;
      return this;
    }

    public Builder withNotificationType(NotificationType notificationType) {
      this.notificationType = notificationType;
      return this;
    }

    public Builder withNotificationEvent(NotificationEvent notificationEvent) {
      this.notificationEvent = notificationEvent;
      return this;
    }


    public Sender build() { return new Sender(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sender sender = (Sender) o;
    return Objects.equals(this.email, sender.email) &&
        Objects.equals(this.mobile, sender.mobile) &&
        Objects.equals(this.notificationType, sender.notificationType) &&
        Objects.equals(this.notificationEvent, sender.notificationEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, mobile, notificationType, notificationEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sender {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    notificationEvent: ").append(toIndentedString(notificationEvent)).append("\n");
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
