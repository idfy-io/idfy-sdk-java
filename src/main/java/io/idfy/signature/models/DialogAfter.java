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
 * A dialog that will be presented after the document is signed.
 */
@JsonDeserialize(builder = DialogAfter.Builder.class)
public class DialogAfter  implements Serializable {
  /**
   * The title of the dialog.
   */
  private final String title;  // Default value is: null

  /**
   * The message body of the dialog.
   */
  private final String message;  // Default value is: null

  private DialogAfter(Builder builder) {
      title = builder.title;
      message = builder.message;
  }

      /**
      * The title of the dialog.
      * @return title
      **/
      public String getTitle() {return title;}

      /**
      * The message body of the dialog.
      * @return message
      **/
      public String getMessage() {return message;}


  public static final class Builder {
      private String title;
      private String message;

    public Builder() {
    }

    public Builder(DialogAfter copy) {
        this.title = copy.getTitle();
        this.message = copy.getMessage();
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withMessage(String message) {
      this.message = message;
      return this;
    }


    public DialogAfter build() { return new DialogAfter(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialogAfter dialogAfter = (DialogAfter) o;
    return Objects.equals(this.title, dialogAfter.title) &&
        Objects.equals(this.message, dialogAfter.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogAfter {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
