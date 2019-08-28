/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.signature.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * NotificationLogItem
 */
@JsonDeserialize(builder = NotificationLogItem.Builder.class)
public class NotificationLogItem  implements Serializable {
  private final String sentTimeStamp;  // Default value is: null

  private final String title;  // Default value is: null

  private final String text;  // Default value is: null

  private final String messageType;  // Default value is: null

  private final String status;  // Default value is: null

  private final String fromAddress;  // Default value is: null

  private final String receiver;  // Default value is: null

  private NotificationLogItem(Builder builder) {
      sentTimeStamp = builder.sentTimeStamp;
      title = builder.title;
      text = builder.text;
      messageType = builder.messageType;
      status = builder.status;
      fromAddress = builder.fromAddress;
      receiver = builder.receiver;
  }

      /**
      * Get sentTimeStamp
      * @return sentTimeStamp
      **/
      public String getSentTimeStamp() {return sentTimeStamp;}

      /**
      * Get title
      * @return title
      **/
      public String getTitle() {return title;}

      /**
      * Get text
      * @return text
      **/
      public String getText() {return text;}

      /**
      * Get messageType
      * @return messageType
      **/
      public String getMessageType() {return messageType;}

      /**
      * Get status
      * @return status
      **/
      public String getStatus() {return status;}

      /**
      * Get fromAddress
      * @return fromAddress
      **/
      public String getFromAddress() {return fromAddress;}

      /**
      * Get receiver
      * @return receiver
      **/
      public String getReceiver() {return receiver;}


  public static final class Builder {
      private String sentTimeStamp;
      private String title;
      private String text;
      private String messageType;
      private String status;
      private String fromAddress;
      private String receiver;

    public Builder() {
    }

    public Builder(NotificationLogItem copy) {
        this.sentTimeStamp = copy.getSentTimeStamp();
        this.title = copy.getTitle();
        this.text = copy.getText();
        this.messageType = copy.getMessageType();
        this.status = copy.getStatus();
        this.fromAddress = copy.getFromAddress();
        this.receiver = copy.getReceiver();
    }

    public Builder withSentTimeStamp(String sentTimeStamp) {
      this.sentTimeStamp = sentTimeStamp;
      return this;
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withText(String text) {
      this.text = text;
      return this;
    }

    public Builder withMessageType(String messageType) {
      this.messageType = messageType;
      return this;
    }

    public Builder withStatus(String status) {
      this.status = status;
      return this;
    }

    public Builder withFromAddress(String fromAddress) {
      this.fromAddress = fromAddress;
      return this;
    }

    public Builder withReceiver(String receiver) {
      this.receiver = receiver;
      return this;
    }


    public NotificationLogItem build() { return new NotificationLogItem(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationLogItem notificationLogItem = (NotificationLogItem) o;
    return Objects.equals(this.sentTimeStamp, notificationLogItem.sentTimeStamp) &&
        Objects.equals(this.title, notificationLogItem.title) &&
        Objects.equals(this.text, notificationLogItem.text) &&
        Objects.equals(this.messageType, notificationLogItem.messageType) &&
        Objects.equals(this.status, notificationLogItem.status) &&
        Objects.equals(this.fromAddress, notificationLogItem.fromAddress) &&
        Objects.equals(this.receiver, notificationLogItem.receiver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentTimeStamp, title, text, messageType, status, fromAddress, receiver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationLogItem {\n");
    
    sb.append("    sentTimeStamp: ").append(toIndentedString(sentTimeStamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
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
