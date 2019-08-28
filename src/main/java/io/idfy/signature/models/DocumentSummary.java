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
import io.idfy.signature.models.ExtendedDocumentSignature;
import io.idfy.signature.models.Status;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * A summary containing core information about a document
 */
@JsonDeserialize(builder = DocumentSummary.Builder.class)
public class DocumentSummary  implements Serializable {
  /**
   * Document id
   */
  private final UUID documentId;  // Default value is: null

  /**
   * Account id
   */
  private final UUID accountId;  // Default value is: null

  /**
   * Document title
   */
  private final String title;  // Default value is: null

  /**
   * Document description
   */
  private final String description;  // Default value is: null

  /**
   * When was the document last updated (ISO8601)
   */
  private final OffsetDateTime lastUpdated;  // Default value is: null

  /**
   * The sign deadline for the document (ISO8601)
   */
  private final OffsetDateTime deadline;  // Default value is: null

  /**
   * When was all the signatures processed (ISO8601)
   */
  private final OffsetDateTime signedDate;  // Default value is: null

  /**
   * Document status
   */
  private final Status status;  // Default value is: null

  /**
   * External document Id (your Id)
   */
  private final String externalId;  // Default value is: null

  /**
   * All the signatures received on this document
   */
  private final List<ExtendedDocumentSignature> documentSignatures;  // Default value is: new ArrayList<>()

  /**
   * The number of required signatures on the document
   */
  private final Integer requiredSignatures;  // Default value is: null

  /**
   * How many signatures is completed right now
   */
  private final Integer currentSignatures;  // Default value is: null

  /**
   * Document tags
   */
  private final List<String> tags;  // Default value is: new ArrayList<>()

  /**
   * A list of attachment Id's
   */
  private final List<UUID> attachments;  // Default value is: new ArrayList<>()

  /**
   * A list of all the signers on the document
   */
  private final List<UUID> signers;  // Default value is: new ArrayList<>()

  /**
   * When the document was created (ISO 8601)
   */
  private final OffsetDateTime created;  // Default value is: null

  private DocumentSummary(Builder builder) {
      documentId = builder.documentId;
      accountId = builder.accountId;
      title = builder.title;
      description = builder.description;
      lastUpdated = builder.lastUpdated;
      deadline = builder.deadline;
      signedDate = builder.signedDate;
      status = builder.status;
      externalId = builder.externalId;
      documentSignatures = builder.documentSignatures;
      requiredSignatures = builder.requiredSignatures;
      currentSignatures = builder.currentSignatures;
      tags = builder.tags;
      attachments = builder.attachments;
      signers = builder.signers;
      created = builder.created;
  }

      /**
      * Document id
      * @return documentId
      **/
      public UUID getDocumentId() {return documentId;}

      /**
      * Account id
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Document title
      * @return title
      **/
      public String getTitle() {return title;}

      /**
      * Document description
      * @return description
      **/
      public String getDescription() {return description;}

      /**
      * When was the document last updated (ISO8601)
      * @return lastUpdated
      **/
      public OffsetDateTime getLastUpdated() {return lastUpdated;}

      /**
      * The sign deadline for the document (ISO8601)
      * @return deadline
      **/
      public OffsetDateTime getDeadline() {return deadline;}

      /**
      * When was all the signatures processed (ISO8601)
      * @return signedDate
      **/
      public OffsetDateTime getSignedDate() {return signedDate;}

      /**
      * Document status
      * @return status
      **/
      public Status getStatus() {return status;}

      /**
      * External document Id (your Id)
      * @return externalId
      **/
      public String getExternalId() {return externalId;}

      /**
      * All the signatures received on this document
      * @return documentSignatures
      **/
      public List<ExtendedDocumentSignature> getDocumentSignatures() {return documentSignatures;}

      /**
      * The number of required signatures on the document
      * @return requiredSignatures
      **/
      public Integer getRequiredSignatures() {return requiredSignatures;}

      /**
      * How many signatures is completed right now
      * @return currentSignatures
      **/
      public Integer getCurrentSignatures() {return currentSignatures;}

      /**
      * Document tags
      * @return tags
      **/
      public List<String> getTags() {return tags;}

      /**
      * A list of attachment Id's
      * @return attachments
      **/
      public List<UUID> getAttachments() {return attachments;}

      /**
      * A list of all the signers on the document
      * @return signers
      **/
      public List<UUID> getSigners() {return signers;}

      /**
      * When the document was created (ISO 8601)
      * @return created
      **/
      public OffsetDateTime getCreated() {return created;}


  public static final class Builder {
      private UUID documentId;
      private UUID accountId;
      private String title;
      private String description;
      private OffsetDateTime lastUpdated;
      private OffsetDateTime deadline;
      private OffsetDateTime signedDate;
      private Status status;
      private String externalId;
      private List<ExtendedDocumentSignature> documentSignatures;
      private Integer requiredSignatures;
      private Integer currentSignatures;
      private List<String> tags;
      private List<UUID> attachments;
      private List<UUID> signers;
      private OffsetDateTime created;

    public Builder() {
    }

    public Builder(DocumentSummary copy) {
        this.documentId = copy.getDocumentId();
        this.accountId = copy.getAccountId();
        this.title = copy.getTitle();
        this.description = copy.getDescription();
        this.lastUpdated = copy.getLastUpdated();
        this.deadline = copy.getDeadline();
        this.signedDate = copy.getSignedDate();
        this.status = copy.getStatus();
        this.externalId = copy.getExternalId();
        this.documentSignatures = copy.getDocumentSignatures();
        this.requiredSignatures = copy.getRequiredSignatures();
        this.currentSignatures = copy.getCurrentSignatures();
        this.tags = copy.getTags();
        this.attachments = copy.getAttachments();
        this.signers = copy.getSigners();
        this.created = copy.getCreated();
    }

    public Builder withDocumentId(UUID documentId) {
      this.documentId = documentId;
      return this;
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
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

    public Builder withLastUpdated(OffsetDateTime lastUpdated) {
      this.lastUpdated = lastUpdated;
      return this;
    }

    public Builder withDeadline(OffsetDateTime deadline) {
      this.deadline = deadline;
      return this;
    }

    public Builder withSignedDate(OffsetDateTime signedDate) {
      this.signedDate = signedDate;
      return this;
    }

    public Builder withStatus(Status status) {
      this.status = status;
      return this;
    }

    public Builder withExternalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder withDocumentSignatures(List<ExtendedDocumentSignature> documentSignatures) {
      this.documentSignatures = documentSignatures;
      return this;
    }

    public Builder addDocumentSignaturesItem(ExtendedDocumentSignature documentSignaturesItem) {
      if (this.documentSignatures == null) {
        this.documentSignatures = new ArrayList<>();
      }
      this.documentSignatures.add(documentSignaturesItem);
      return this;
    }

    public Builder withRequiredSignatures(Integer requiredSignatures) {
      this.requiredSignatures = requiredSignatures;
      return this;
    }

    public Builder withCurrentSignatures(Integer currentSignatures) {
      this.currentSignatures = currentSignatures;
      return this;
    }

    public Builder withTags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    public Builder addTagsItem(String tagsItem) {
      if (this.tags == null) {
        this.tags = new ArrayList<>();
      }
      this.tags.add(tagsItem);
      return this;
    }

    public Builder withAttachments(List<UUID> attachments) {
      this.attachments = attachments;
      return this;
    }

    public Builder addAttachmentsItem(UUID attachmentsItem) {
      if (this.attachments == null) {
        this.attachments = new ArrayList<>();
      }
      this.attachments.add(attachmentsItem);
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

    public Builder withCreated(OffsetDateTime created) {
      this.created = created;
      return this;
    }


    public DocumentSummary build() { return new DocumentSummary(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSummary documentSummary = (DocumentSummary) o;
    return Objects.equals(this.documentId, documentSummary.documentId) &&
        Objects.equals(this.accountId, documentSummary.accountId) &&
        Objects.equals(this.title, documentSummary.title) &&
        Objects.equals(this.description, documentSummary.description) &&
        Objects.equals(this.lastUpdated, documentSummary.lastUpdated) &&
        Objects.equals(this.deadline, documentSummary.deadline) &&
        Objects.equals(this.signedDate, documentSummary.signedDate) &&
        Objects.equals(this.status, documentSummary.status) &&
        Objects.equals(this.externalId, documentSummary.externalId) &&
        Objects.equals(this.documentSignatures, documentSummary.documentSignatures) &&
        Objects.equals(this.requiredSignatures, documentSummary.requiredSignatures) &&
        Objects.equals(this.currentSignatures, documentSummary.currentSignatures) &&
        Objects.equals(this.tags, documentSummary.tags) &&
        Objects.equals(this.attachments, documentSummary.attachments) &&
        Objects.equals(this.signers, documentSummary.signers) &&
        Objects.equals(this.created, documentSummary.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, accountId, title, description, lastUpdated, deadline, signedDate, status, externalId, documentSignatures, requiredSignatures, currentSignatures, tags, attachments, signers, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSummary {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    signedDate: ").append(toIndentedString(signedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    documentSignatures: ").append(toIndentedString(documentSignatures)).append("\n");
    sb.append("    requiredSignatures: ").append(toIndentedString(requiredSignatures)).append("\n");
    sb.append("    currentSignatures: ").append(toIndentedString(currentSignatures)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
