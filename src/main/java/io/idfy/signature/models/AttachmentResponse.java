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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * AttachmentResponse
 */
@JsonDeserialize(builder = AttachmentResponse.Builder.class)
public class AttachmentResponse  implements Serializable {
  /**
   * The attachment's unique identifier.
   */
  private final UUID id;  // Default value is: null

  /**
   * Filename with file extension. <span style=\"color:red;\">We only support PDF for attachments, set `convertToPdf` to `true` if you have a convertible file type.</span>
   */
  private final String fileName;  // Default value is: null

  /**
   * The title of the attachment which will be presented to the user.
   */
  private final String title;  // Default value is: null

  /**
   * Base64-encoded attachment (UTF-8-encoded)
   */
  private final String data;  // Default value is: null

  /**
   * Determines if the attachment should be converted to PDF. See our documentation for supported file types.
   */
  private final Boolean convertToPdf;  // Default value is: null

  /**
   * An optional list of signers that should be able to see / sign the attachment.
   */
  private final List<UUID> signers;  // Default value is: new ArrayList<>()

  /**
   * An optional description of the attachment.
   */
  private final String description;  // Default value is: null

  /**
   * The type of attachment. Choose between the following:  * &lt;b&gt;show_accept:&lt;/b&gt; The signer will see the attachment before signing the main document (is default now)  * &lt;b&gt;read_accept:&lt;/b&gt; The signer have to see the entire document before they can continue,   * &lt;b&gt;sign:&lt;/b&gt; The signer has to sign the attachment (extra cost per signature)
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
   * The type of attachment. Choose between the following:  * <b>show_accept:</b> The signer will see the attachment before signing the main document (is default now)  * <b>read_accept:</b> The signer have to see the entire document before they can continue,   * <b>sign:</b> The signer has to sign the attachment (extra cost per signature)
   */
  private final Type type;  // Default value is: null

  private AttachmentResponse(Builder builder) {
      id = builder.id;
      fileName = builder.fileName;
      title = builder.title;
      data = builder.data;
      convertToPdf = builder.convertToPdf;
      signers = builder.signers;
      description = builder.description;
      type = builder.type;
  }

      /**
      * The attachment's unique identifier.
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * Filename with file extension. <span style=\"color:red;\">We only support PDF for attachments, set `convertToPdf` to `true` if you have a convertible file type.</span>
      * @return fileName
      **/
      public String getFileName() {return fileName;}

      /**
      * The title of the attachment which will be presented to the user.
      * @return title
      **/
      public String getTitle() {return title;}

      /**
      * Base64-encoded attachment (UTF-8-encoded)
      * @return data
      **/
      public String getData() {return data;}

      /**
      * Determines if the attachment should be converted to PDF. See our documentation for supported file types.
      * @return convertToPdf
      **/
      public Boolean getConvertToPdf() {return convertToPdf;}

      /**
      * An optional list of signers that should be able to see / sign the attachment.
      * @return signers
      **/
      public List<UUID> getSigners() {return signers;}

      /**
      * An optional description of the attachment.
      * @return description
      **/
      public String getDescription() {return description;}

      /**
      * The type of attachment. Choose between the following:  * <b>show_accept:</b> The signer will see the attachment before signing the main document (is default now)  * <b>read_accept:</b> The signer have to see the entire document before they can continue,   * <b>sign:</b> The signer has to sign the attachment (extra cost per signature)
      * @return type
      **/
      public Type getType() {return type;}


  public static final class Builder {
      private UUID id;
      private String fileName;
      private String title;
      private String data;
      private Boolean convertToPdf;
      private List<UUID> signers;
      private String description;
      private Type type;

    public Builder() {
    }

    public Builder(AttachmentResponse copy) {
        this.id = copy.getId();
        this.fileName = copy.getFileName();
        this.title = copy.getTitle();
        this.data = copy.getData();
        this.convertToPdf = copy.getConvertToPdf();
        this.signers = copy.getSigners();
        this.description = copy.getDescription();
        this.type = copy.getType();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withFileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withData(String data) {
      this.data = data;
      return this;
    }

    public Builder withConvertToPdf(Boolean convertToPdf) {
      this.convertToPdf = convertToPdf;
      return this;
    }

    public Builder withSigners(List<UUID> signers) {
      this.signers = signers;
      return this;
    }

    public Builder addSignersItem(UUID signersItem) {
      if (this.signers == null) {
        this.signers = new ArrayList<>();
      }
      this.signers.add(signersItem);
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


    public AttachmentResponse build() { return new AttachmentResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentResponse attachmentResponse = (AttachmentResponse) o;
    return Objects.equals(this.id, attachmentResponse.id) &&
        Objects.equals(this.fileName, attachmentResponse.fileName) &&
        Objects.equals(this.title, attachmentResponse.title) &&
        Objects.equals(this.data, attachmentResponse.data) &&
        Objects.equals(this.convertToPdf, attachmentResponse.convertToPdf) &&
        Objects.equals(this.signers, attachmentResponse.signers) &&
        Objects.equals(this.description, attachmentResponse.description) &&
        Objects.equals(this.type, attachmentResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileName, title, data, convertToPdf, signers, description, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    convertToPdf: ").append(toIndentedString(convertToPdf)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
