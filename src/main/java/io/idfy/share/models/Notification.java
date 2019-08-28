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
import io.idfy.share.models.NotificationSetup;
import java.io.Serializable;

/**
 * Options for notification
 */
@JsonDeserialize(builder = Notification.Builder.class)
public class Notification  implements Serializable {
  private final NotificationSetup setup;  // Default value is: null

  /**
   * Language for the notifications  Defaults to Norwegian
   */
  public enum Language {
    @JsonProperty("No")
    NO("No"),
    
    @JsonProperty("En")
    EN("En");

    private String value;

    Language(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Language fromValue(String text) {
      for (Language b : Language.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Language for the notifications  Defaults to Norwegian
   */
  private final Language language;  // Default value is: null

  private Notification(Builder builder) {
      setup = builder.setup;
      language = builder.language;
  }

      /**
      * Get setup
      * @return setup
      **/
      public NotificationSetup getSetup() {return setup;}

      /**
      * Language for the notifications  Defaults to Norwegian
      * @return language
      **/
      public Language getLanguage() {return language;}


  public static final class Builder {
      private NotificationSetup setup;
      private Language language;

    public Builder() {
    }

    public Builder(Notification copy) {
        this.setup = copy.getSetup();
        this.language = copy.getLanguage();
    }

    public Builder withSetup(NotificationSetup setup) {
      this.setup = setup;
      return this;
    }

    public Builder withLanguage(Language language) {
      this.language = language;
      return this;
    }


    public Notification build() { return new Notification(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.setup, notification.setup) &&
        Objects.equals(this.language, notification.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setup, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    setup: ").append(toIndentedString(setup)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
