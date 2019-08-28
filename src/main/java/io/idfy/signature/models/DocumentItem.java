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
 * DocumentItem
 */
@JsonDeserialize(builder = DocumentItem.Builder.class)
public class DocumentItem  implements Serializable {
  private final UUID id;  // Default value is: null

  private final String title;  // Default value is: null

  private final String description;  // Default value is: null

  private final String externalId;  // Default value is: null

  private final Boolean mainDocument;  // Default value is: null

  /**
   * Gets or Sets documentType
   */
  public enum DocumentType {
    @JsonProperty("PDF")
    PDF("PDF"),
    
    @JsonProperty("XML")
    XML("XML"),
    
    @JsonProperty("XSLT")
    XSLT("XSLT"),
    
    @JsonProperty("TXT")
    TXT("TXT"),
    
    @JsonProperty("HTML")
    HTML("HTML"),
    
    @JsonProperty("GENERIC")
    GENERIC("GENERIC");

    private String value;

    DocumentType(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentType fromValue(String text) {
      for (DocumentType b : DocumentType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final DocumentType documentType;  // Default value is: null

  private final String sha256Hash;  // Default value is: null

  private DocumentItem(Builder builder) {
      id = builder.id;
      title = builder.title;
      description = builder.description;
      externalId = builder.externalId;
      mainDocument = builder.mainDocument;
      documentType = builder.documentType;
      sha256Hash = builder.sha256Hash;
  }

      /**
      * Get id
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * Get title
      * @return title
      **/
      public String getTitle() {return title;}

      /**
      * Get description
      * @return description
      **/
      public String getDescription() {return description;}

      /**
      * Get externalId
      * @return externalId
      **/
      public String getExternalId() {return externalId;}

      /**
      * Get mainDocument
      * @return mainDocument
      **/
      public Boolean getMainDocument() {return mainDocument;}

      /**
      * Get documentType
      * @return documentType
      **/
      public DocumentType getDocumentType() {return documentType;}

      /**
      * Get sha256Hash
      * @return sha256Hash
      **/
      public String getSha256Hash() {return sha256Hash;}


  public static final class Builder {
      private UUID id;
      private String title;
      private String description;
      private String externalId;
      private Boolean mainDocument;
      private DocumentType documentType;
      private String sha256Hash;

    public Builder() {
    }

    public Builder(DocumentItem copy) {
        this.id = copy.getId();
        this.title = copy.getTitle();
        this.description = copy.getDescription();
        this.externalId = copy.getExternalId();
        this.mainDocument = copy.getMainDocument();
        this.documentType = copy.getDocumentType();
        this.sha256Hash = copy.getSha256Hash();
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

    public Builder withExternalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder withMainDocument(Boolean mainDocument) {
      this.mainDocument = mainDocument;
      return this;
    }

    public Builder withDocumentType(DocumentType documentType) {
      this.documentType = documentType;
      return this;
    }

    public Builder withSha256Hash(String sha256Hash) {
      this.sha256Hash = sha256Hash;
      return this;
    }


    public DocumentItem build() { return new DocumentItem(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentItem documentItem = (DocumentItem) o;
    return Objects.equals(this.id, documentItem.id) &&
        Objects.equals(this.title, documentItem.title) &&
        Objects.equals(this.description, documentItem.description) &&
        Objects.equals(this.externalId, documentItem.externalId) &&
        Objects.equals(this.mainDocument, documentItem.mainDocument) &&
        Objects.equals(this.documentType, documentItem.documentType) &&
        Objects.equals(this.sha256Hash, documentItem.sha256Hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, externalId, mainDocument, documentType, sha256Hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    mainDocument: ").append(toIndentedString(mainDocument)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    sha256Hash: ").append(toIndentedString(sha256Hash)).append("\n");
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
