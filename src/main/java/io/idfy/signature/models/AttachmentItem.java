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
 * AttachmentItem
 */
@JsonDeserialize(builder = AttachmentItem.Builder.class)
public class AttachmentItem  implements Serializable {
  private final String title;  // Default value is: null

  private final String checksum;  // Default value is: null

  private AttachmentItem(Builder builder) {
      title = builder.title;
      checksum = builder.checksum;
  }

      /**
      * Get title
      * @return title
      **/
      public String getTitle() {return title;}

      /**
      * Get checksum
      * @return checksum
      **/
      public String getChecksum() {return checksum;}


  public static final class Builder {
      private String title;
      private String checksum;

    public Builder() {
    }

    public Builder(AttachmentItem copy) {
        this.title = copy.getTitle();
        this.checksum = copy.getChecksum();
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withChecksum(String checksum) {
      this.checksum = checksum;
      return this;
    }


    public AttachmentItem build() { return new AttachmentItem(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentItem attachmentItem = (AttachmentItem) o;
    return Objects.equals(this.title, attachmentItem.title) &&
        Objects.equals(this.checksum, attachmentItem.checksum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, checksum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentItem {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
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
