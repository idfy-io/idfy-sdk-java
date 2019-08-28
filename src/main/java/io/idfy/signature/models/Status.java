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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * The status of the document.
 */
@JsonDeserialize(builder = Status.Builder.class)
public class Status  implements Serializable {
  /**
   * The overall status of the document.
   */
  public enum DocumentStatus {
    @JsonProperty("unsigned")
    UNSIGNED("unsigned"),
    
    @JsonProperty("waiting_for_attachments")
    WAITING_FOR_ATTACHMENTS("waiting_for_attachments"),
    
    @JsonProperty("partialsigned")
    PARTIALSIGNED("partialsigned"),
    
    @JsonProperty("signed")
    SIGNED("signed"),
    
    @JsonProperty("canceled")
    CANCELED("canceled"),
    
    @JsonProperty("expired")
    EXPIRED("expired");

    private String value;

    DocumentStatus(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentStatus fromValue(String text) {
      for (DocumentStatus b : DocumentStatus.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The overall status of the document.
   */
  private final DocumentStatus documentStatus;  // Default value is: null

  /**
   * Gets or Sets completedPackages
   */
  public enum CompletedPackages {
    @JsonProperty("unsigned")
    UNSIGNED("unsigned"),
    
    @JsonProperty("native")
    NATIVE("native"),
    
    @JsonProperty("standard_packaging")
    STANDARD_PACKAGING("standard_packaging"),
    
    @JsonProperty("pades")
    PADES("pades"),
    
    @JsonProperty("xades")
    XADES("xades");

    private String value;

    CompletedPackages(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompletedPackages fromValue(String text) {
      for (CompletedPackages b : CompletedPackages.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * A list of all the completed files/packages for the main document.
   */
  private final List<CompletedPackages> completedPackages;  // Default value is: new ArrayList<>()

                  /**
   * Gets or Sets attachmentPackages
   */
  public enum AttachmentPackages {
    @JsonProperty("unsigned")
    UNSIGNED("unsigned"),
    
    @JsonProperty("native")
    NATIVE("native"),
    
    @JsonProperty("standard_packaging")
    STANDARD_PACKAGING("standard_packaging"),
    
    @JsonProperty("pades")
    PADES("pades"),
    
    @JsonProperty("xades")
    XADES("xades");

    private String value;

    AttachmentPackages(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttachmentPackages fromValue(String text) {
      for (AttachmentPackages b : AttachmentPackages.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * A set of key-value pairs with all the completed packages for the signable attachments, where the key is equal to the attachment's ID.
   */
  private final Map<String, List<AttachmentPackages>> attachmentPackages;  // Default value is: new HashMap<>()

  private Status(Builder builder) {
      documentStatus = builder.documentStatus;
      completedPackages = builder.completedPackages;
      attachmentPackages = builder.attachmentPackages;
  }

      /**
      * The overall status of the document.
      * @return documentStatus
      **/
      public DocumentStatus getDocumentStatus() {return documentStatus;}

      /**
      * A list of all the completed files/packages for the main document.
      * @return completedPackages
      **/
      public List<CompletedPackages> getCompletedPackages() {return completedPackages;}

      /**
      * A set of key-value pairs with all the completed packages for the signable attachments, where the key is equal to the attachment's ID.
      * @return attachmentPackages
      **/
      public Map<String, List<AttachmentPackages>> getAttachmentPackages() {return attachmentPackages;}


  public static final class Builder {
      private DocumentStatus documentStatus;
      private List<CompletedPackages> completedPackages;
      private Map<String, List<AttachmentPackages>> attachmentPackages;

    public Builder() {
    }

    public Builder(Status copy) {
        this.documentStatus = copy.getDocumentStatus();
        this.completedPackages = copy.getCompletedPackages();
        this.attachmentPackages = copy.getAttachmentPackages();
    }

    public Builder withDocumentStatus(DocumentStatus documentStatus) {
      this.documentStatus = documentStatus;
      return this;
    }

    public Builder withCompletedPackages(List<CompletedPackages> completedPackages) {
      this.completedPackages = completedPackages;
      return this;
    }

    public Builder addCompletedPackagesItem(CompletedPackages completedPackagesItem) {
      if (this.completedPackages == null) {
        this.completedPackages = new ArrayList<>();
      }
      this.completedPackages.add(completedPackagesItem);
      return this;
    }

    public Builder withAttachmentPackages(Map<String, List<AttachmentPackages>> attachmentPackages) {
      this.attachmentPackages = attachmentPackages;
      return this;
    }

    public Builder putAttachmentPackagesItem(String key, List<AttachmentPackages> attachmentPackagesItem) {
      if (this.attachmentPackages == null) {
        this.attachmentPackages = new HashMap<>();
      }
      this.attachmentPackages.put(key, attachmentPackagesItem);
      return this;
    }


    public Status build() { return new Status(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.documentStatus, status.documentStatus) &&
        Objects.equals(this.completedPackages, status.completedPackages) &&
        Objects.equals(this.attachmentPackages, status.attachmentPackages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentStatus, completedPackages, attachmentPackages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    documentStatus: ").append(toIndentedString(documentStatus)).append("\n");
    sb.append("    completedPackages: ").append(toIndentedString(completedPackages)).append("\n");
    sb.append("    attachmentPackages: ").append(toIndentedString(attachmentPackages)).append("\n");
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
