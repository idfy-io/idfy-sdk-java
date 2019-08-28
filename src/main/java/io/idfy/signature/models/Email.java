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
 * Email
 */
@JsonDeserialize(builder = Email.Builder.class)
public class Email  implements Serializable {
  /**
   * The language of the email notification.
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
   * The language of the email notification.
   */
  private final Language language;  // Default value is: null

  /**
   * The email subject.
   */
  private final String subject;  // Default value is: null

  /**
   * The email notification body. Plain text and markdown is supported.
   */
  private final String text;  // Default value is: null

  /**
   * The name to use as email sender.
   */
  private final String senderName;  // Default value is: null

  private Email(Builder builder) {
      language = builder.language;
      subject = builder.subject;
      text = builder.text;
      senderName = builder.senderName;
  }

      /**
      * The language of the email notification.
      * @return language
      **/
      public Language getLanguage() {return language;}

      /**
      * The email subject.
      * @return subject
      **/
      public String getSubject() {return subject;}

      /**
      * The email notification body. Plain text and markdown is supported.
      * @return text
      **/
      public String getText() {return text;}

      /**
      * The name to use as email sender.
      * @return senderName
      **/
      public String getSenderName() {return senderName;}


  public static final class Builder {
      private Language language;
      private String subject;
      private String text;
      private String senderName;

    public Builder() {
    }

    public Builder(Email copy) {
        this.language = copy.getLanguage();
        this.subject = copy.getSubject();
        this.text = copy.getText();
        this.senderName = copy.getSenderName();
    }

    public Builder withLanguage(Language language) {
      this.language = language;
      return this;
    }

    public Builder withSubject(String subject) {
      this.subject = subject;
      return this;
    }

    public Builder withText(String text) {
      this.text = text;
      return this;
    }

    public Builder withSenderName(String senderName) {
      this.senderName = senderName;
      return this;
    }


    public Email build() { return new Email(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Email email = (Email) o;
    return Objects.equals(this.language, email.language) &&
        Objects.equals(this.subject, email.subject) &&
        Objects.equals(this.text, email.text) &&
        Objects.equals(this.senderName, email.senderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, subject, text, senderName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
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
