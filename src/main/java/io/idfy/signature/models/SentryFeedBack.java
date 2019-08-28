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
 * SentryFeedBack
 */
@JsonDeserialize(builder = SentryFeedBack.Builder.class)
public class SentryFeedBack  implements Serializable {
  private final String email;  // Default value is: null

  private final String name;  // Default value is: null

  private final String comments;  // Default value is: null

  private final String eventId;  // Default value is: null

  private SentryFeedBack(Builder builder) {
      email = builder.email;
      name = builder.name;
      comments = builder.comments;
      eventId = builder.eventId;
  }

      /**
      * Get email
      * @return email
      **/
      public String getEmail() {return email;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get comments
      * @return comments
      **/
      public String getComments() {return comments;}

      /**
      * Get eventId
      * @return eventId
      **/
      public String getEventId() {return eventId;}


  public static final class Builder {
      private String email;
      private String name;
      private String comments;
      private String eventId;

    public Builder() {
    }

    public Builder(SentryFeedBack copy) {
        this.email = copy.getEmail();
        this.name = copy.getName();
        this.comments = copy.getComments();
        this.eventId = copy.getEventId();
    }

    public Builder withEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withComments(String comments) {
      this.comments = comments;
      return this;
    }

    public Builder withEventId(String eventId) {
      this.eventId = eventId;
      return this;
    }


    public SentryFeedBack build() { return new SentryFeedBack(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentryFeedBack sentryFeedBack = (SentryFeedBack) o;
    return Objects.equals(this.email, sentryFeedBack.email) &&
        Objects.equals(this.name, sentryFeedBack.name) &&
        Objects.equals(this.comments, sentryFeedBack.comments) &&
        Objects.equals(this.eventId, sentryFeedBack.eventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, comments, eventId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentryFeedBack {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
