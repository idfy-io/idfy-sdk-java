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
import io.idfy.signature.models.DialogAfter;
import io.idfy.signature.models.DialogBefore;
import java.io.Serializable;

/**
 * Dialogs that will be prestented to the signer in the signature process.
 */
@JsonDeserialize(builder = Dialogs.Builder.class)
public class Dialogs  implements Serializable {
  private final DialogBefore before;  // Default value is: null

  private final DialogAfter after;  // Default value is: null

  private Dialogs(Builder builder) {
      before = builder.before;
      after = builder.after;
  }

      /**
      * Get before
      * @return before
      **/
      public DialogBefore getBefore() {return before;}

      /**
      * Get after
      * @return after
      **/
      public DialogAfter getAfter() {return after;}


  public static final class Builder {
      private DialogBefore before;
      private DialogAfter after;

    public Builder() {
    }

    public Builder(Dialogs copy) {
        this.before = copy.getBefore();
        this.after = copy.getAfter();
    }

    public Builder withBefore(DialogBefore before) {
      this.before = before;
      return this;
    }

    public Builder withAfter(DialogAfter after) {
      this.after = after;
      return this;
    }


    public Dialogs build() { return new Dialogs(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dialogs dialogs = (Dialogs) o;
    return Objects.equals(this.before, dialogs.before) &&
        Objects.equals(this.after, dialogs.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(before, after);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dialogs {\n");
    
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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
