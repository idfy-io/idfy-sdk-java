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
 * A dialog that will be presented before the document is signed.
 */
@JsonDeserialize(builder = DialogBefore.Builder.class)
public class DialogBefore  implements Serializable {
  /**
   * Determines if a the user must confirm that the dialog message has been read before they can continue.
   */
  private final Boolean useCheckBox;  // Default value is: null

  /**
   * The title of the dialog.
   */
  private final String title;  // Default value is: null

  /**
   * The message body of the dialog.
   */
  private final String message;  // Default value is: null

  private DialogBefore(Builder builder) {
      useCheckBox = builder.useCheckBox;
      title = builder.title;
      message = builder.message;
  }

      /**
      * Determines if a the user must confirm that the dialog message has been read before they can continue.
      * @return useCheckBox
      **/
      public Boolean getUseCheckBox() {return useCheckBox;}

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
      private Boolean useCheckBox;
      private String title;
      private String message;

    public Builder() {
    }

    public Builder(DialogBefore copy) {
        this.useCheckBox = copy.getUseCheckBox();
        this.title = copy.getTitle();
        this.message = copy.getMessage();
    }

    public Builder withUseCheckBox(Boolean useCheckBox) {
      this.useCheckBox = useCheckBox;
      return this;
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withMessage(String message) {
      this.message = message;
      return this;
    }


    public DialogBefore build() { return new DialogBefore(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialogBefore dialogBefore = (DialogBefore) o;
    return Objects.equals(this.useCheckBox, dialogBefore.useCheckBox) &&
        Objects.equals(this.title, dialogBefore.title) &&
        Objects.equals(this.message, dialogBefore.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useCheckBox, title, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogBefore {\n");
    
    sb.append("    useCheckBox: ").append(toIndentedString(useCheckBox)).append("\n");
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
