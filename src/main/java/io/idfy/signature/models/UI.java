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
import io.idfy.signature.models.Dialogs;
import io.idfy.signature.models.Styling;
import java.io.Serializable;

/**
 * UI settings for the signature process.
 */
@JsonDeserialize(builder = UI.Builder.class)
public class UI  implements Serializable {
  /**
   * The signer&#39;s preferred language. This language will be used when signing the document and in email/SMS notifications.  ///
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
   * The signer's preferred language. This language will be used when signing the document and in email/SMS notifications.  ///
   */
  private final Language language;  // Default value is: null

  private final Dialogs dialogs;  // Default value is: null

  private final Styling styling;  // Default value is: null

  private UI(Builder builder) {
      language = builder.language;
      dialogs = builder.dialogs;
      styling = builder.styling;
  }

      /**
      * The signer's preferred language. This language will be used when signing the document and in email/SMS notifications.  ///
      * @return language
      **/
      public Language getLanguage() {return language;}

      /**
      * Get dialogs
      * @return dialogs
      **/
      public Dialogs getDialogs() {return dialogs;}

      /**
      * Get styling
      * @return styling
      **/
      public Styling getStyling() {return styling;}


  public static final class Builder {
      private Language language;
      private Dialogs dialogs;
      private Styling styling;

    public Builder() {
    }

    public Builder(UI copy) {
        this.language = copy.getLanguage();
        this.dialogs = copy.getDialogs();
        this.styling = copy.getStyling();
    }

    public Builder withLanguage(Language language) {
      this.language = language;
      return this;
    }

    public Builder withDialogs(Dialogs dialogs) {
      this.dialogs = dialogs;
      return this;
    }

    public Builder withStyling(Styling styling) {
      this.styling = styling;
      return this;
    }


    public UI build() { return new UI(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UI UI = (UI) o;
    return Objects.equals(this.language, UI.language) &&
        Objects.equals(this.dialogs, UI.dialogs) &&
        Objects.equals(this.styling, UI.styling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, dialogs, styling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UI {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    dialogs: ").append(toIndentedString(dialogs)).append("\n");
    sb.append("    styling: ").append(toIndentedString(styling)).append("\n");
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
