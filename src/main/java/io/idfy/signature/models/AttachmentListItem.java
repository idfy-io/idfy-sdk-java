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
import java.util.UUID;
import java.io.Serializable;

/**
 * AttachmentListItem
 */
@JsonDeserialize(builder = AttachmentListItem.Builder.class)
public class AttachmentListItem  implements Serializable {
  /**
   * The attachment's unique identifier.
   */
  private final UUID id;  // Default value is: null

  /**
   * The title of the attachment which will be presented to the user.
   */
  private final String title;  // Default value is: null

  /**
   * An optional description of the attachment.
   */
  private final String description;  // Default value is: null

  /**
   * The type of attachment.
   */
  public enum Type {
    @JsonProperty("show_accept")
    SHOW_ACCEPT("show_accept"),
    
    @JsonProperty("read_accept")
    READ_ACCEPT("read_accept"),
    
    @JsonProperty("sign")
    SIGN("sign");

    private String value;

    Type(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Type fromValue(String text) {
      for (Type b : Type.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The type of attachment.
   */
  private final Type type;  // Default value is: null

  /**
   * Filename with file extension. <span style=\"color:red;\">We only support PDF for attachments, set `convertToPdf` to `true` if you have a convertible file type.</span>
   */
  private final String fileName;  // Default value is: null

  private AttachmentListItem(Builder builder) {
      id = builder.id;
      title = builder.title;
      description = builder.description;
      type = builder.type;
      fileName = builder.fileName;
  }

      /**
      * The attachment's unique identifier.
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * The title of the attachment which will be presented to the user.
      * @return title
      **/
      public String getTitle() {return title;}

      /**
      * An optional description of the attachment.
      * @return description
      **/
      public String getDescription() {return description;}

      /**
      * The type of attachment.
      * @return type
      **/
      public Type getType() {return type;}

      /**
      * Filename with file extension. <span style=\"color:red;\">We only support PDF for attachments, set `convertToPdf` to `true` if you have a convertible file type.</span>
      * @return fileName
      **/
      public String getFileName() {return fileName;}


  public static final class Builder {
      private UUID id;
      private String title;
      private String description;
      private Type type;
      private String fileName;

    public Builder() {
    }

    public Builder(AttachmentListItem copy) {
        this.id = copy.getId();
        this.title = copy.getTitle();
        this.description = copy.getDescription();
        this.type = copy.getType();
        this.fileName = copy.getFileName();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder withType(Type type) {
      this.type = type;
      return this;
    }

    public Builder withFileName(String fileName) {
      this.fileName = fileName;
      return this;
    }


    public AttachmentListItem build() { return new AttachmentListItem(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentListItem attachmentListItem = (AttachmentListItem) o;
    return Objects.equals(this.id, attachmentListItem.id) &&
        Objects.equals(this.title, attachmentListItem.title) &&
        Objects.equals(this.description, attachmentListItem.description) &&
        Objects.equals(this.type, attachmentListItem.type) &&
        Objects.equals(this.fileName, attachmentListItem.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, type, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
