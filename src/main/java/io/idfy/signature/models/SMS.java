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
 * SMS
 */
@JsonDeserialize(builder = SMS.Builder.class)
public class SMS  implements Serializable {
  /**
   * The language of the SMS notification.
   */
  public enum Language {
    @JsonProperty("EN")
    EN("EN"),
    
    @JsonProperty("NO")
    NO("NO"),
    
    @JsonProperty("DA")
    DA("DA"),
    
    @JsonProperty("SV")
    SV("SV"),
    
    @JsonProperty("FI")
    FI("FI");

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
   * The language of the SMS notification.
   */
  private final Language language;  // Default value is: null

  /**
   * The SMS notification text.
   */
  private final String text;  // Default value is: null

  /**
   * The name to use as SMS sender.
   */
  private final String sender;  // Default value is: null

  private SMS(Builder builder) {
      language = builder.language;
      text = builder.text;
      sender = builder.sender;
  }

      /**
      * The language of the SMS notification.
      * @return language
      **/
      public Language getLanguage() {return language;}

      /**
      * The SMS notification text.
      * @return text
      **/
      public String getText() {return text;}

      /**
      * The name to use as SMS sender.
      * @return sender
      **/
      public String getSender() {return sender;}


  public static final class Builder {
      private Language language;
      private String text;
      private String sender;

    public Builder() {
    }

    public Builder(SMS copy) {
        this.language = copy.getLanguage();
        this.text = copy.getText();
        this.sender = copy.getSender();
    }

    public Builder withLanguage(Language language) {
      this.language = language;
      return this;
    }

    public Builder withText(String text) {
      this.text = text;
      return this;
    }

    public Builder withSender(String sender) {
      this.sender = sender;
      return this;
    }


    public SMS build() { return new SMS(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMS SMS = (SMS) o;
    return Objects.equals(this.language, SMS.language) &&
        Objects.equals(this.text, SMS.text) &&
        Objects.equals(this.sender, SMS.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, text, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMS {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
