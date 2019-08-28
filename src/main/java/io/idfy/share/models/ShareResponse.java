/*
 * Idfy Secure Share
 * This endpoints enables secure sharing with multiple e-ids offered for login
 *
 * OpenAPI spec version: v1
 * 
 */

package io.idfy.share.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import io.idfy.share.models.Advanced;
import io.idfy.share.models.ContactDetails;
import io.idfy.share.models.Information;
import io.idfy.share.models.RecipientResponse;
import io.idfy.share.models.Sender;
import io.idfy.share.models.ServerUpload;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * ShareResponse
 */
@JsonDeserialize(builder = ShareResponse.Builder.class)
public class ShareResponse  implements Serializable {
  /**
   * Unique identifier
   */
  private final UUID id;  // Default value is: null

  private final Information information;  // Default value is: null

  /**
   * List of recipients
   */
  private final List<RecipientResponse> recipients;  // Default value is: new ArrayList<>()

  /**
   * List of content
   */
  private final List<ServerUpload> content;  // Default value is: new ArrayList<>()

  /**
   * Number of documents uploaded
   */
  private final Integer uploadedDocuments;  // Default value is: null

  /**
   * Creation time
   */
  private final OffsetDateTime created;  // Default value is: null

  /**
   * All content opened or expired
   */
  private final Boolean done;  // Default value is: null

  /**
   * Deleted by creator
   */
  private final Boolean deleted;  // Default value is: null

  private final ContactDetails contactDetails;  // Default value is: null

  /**
   * Senders
   */
  private final List<Sender> senders;  // Default value is: new ArrayList<>()

  /**
   * Optional settings for advanced configuration
   */
  private final Advanced advanced;  // Default value is: null

  private ShareResponse(Builder builder) {
      id = builder.id;
      information = builder.information;
      recipients = builder.recipients;
      content = builder.content;
      uploadedDocuments = builder.uploadedDocuments;
      created = builder.created;
      done = builder.done;
      deleted = builder.deleted;
      contactDetails = builder.contactDetails;
      senders = builder.senders;
      advanced = builder.advanced;
  }

      /**
      * Unique identifier
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * Get information
      * @return information
      **/
      public Information getInformation() {return information;}

      /**
      * List of recipients
      * @return recipients
      **/
      public List<RecipientResponse> getRecipients() {return recipients;}

      /**
      * List of content
      * @return content
      **/
      public List<ServerUpload> getContent() {return content;}

      /**
      * Number of documents uploaded
      * @return uploadedDocuments
      **/
      public Integer getUploadedDocuments() {return uploadedDocuments;}

      /**
      * Creation time
      * @return created
      **/
      public OffsetDateTime getCreated() {return created;}

      /**
      * All content opened or expired
      * @return done
      **/
      public Boolean getDone() {return done;}

      /**
      * Deleted by creator
      * @return deleted
      **/
      public Boolean getDeleted() {return deleted;}

      /**
      * Get contactDetails
      * @return contactDetails
      **/
      public ContactDetails getContactDetails() {return contactDetails;}

      /**
      * Senders
      * @return senders
      **/
      public List<Sender> getSenders() {return senders;}

      /**
      * Optional settings for advanced configuration
      * @return advanced
      **/
      public Advanced getAdvanced() {return advanced;}


  public static final class Builder {
      private UUID id;
      private Information information;
      private List<RecipientResponse> recipients;
      private List<ServerUpload> content;
      private Integer uploadedDocuments;
      private OffsetDateTime created;
      private Boolean done;
      private Boolean deleted;
      private ContactDetails contactDetails;
      private List<Sender> senders;
      private Advanced advanced;

    public Builder() {
    }

    public Builder(ShareResponse copy) {
        this.id = copy.getId();
        this.information = copy.getInformation();
        this.recipients = copy.getRecipients();
        this.content = copy.getContent();
        this.uploadedDocuments = copy.getUploadedDocuments();
        this.created = copy.getCreated();
        this.done = copy.getDone();
        this.deleted = copy.getDeleted();
        this.contactDetails = copy.getContactDetails();
        this.senders = copy.getSenders();
        this.advanced = copy.getAdvanced();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withInformation(Information information) {
      this.information = information;
      return this;
    }

    public Builder withRecipients(List<RecipientResponse> recipients) {
      this.recipients = recipients;
      return this;
    }

    public Builder addRecipientsItem(RecipientResponse recipientsItem) {
      if (this.recipients == null) {
        this.recipients = new ArrayList<>();
      }
      this.recipients.add(recipientsItem);
      return this;
    }

    public Builder withContent(List<ServerUpload> content) {
      this.content = content;
      return this;
    }

    public Builder addContentItem(ServerUpload contentItem) {
      if (this.content == null) {
        this.content = new ArrayList<>();
      }
      this.content.add(contentItem);
      return this;
    }

    public Builder withUploadedDocuments(Integer uploadedDocuments) {
      this.uploadedDocuments = uploadedDocuments;
      return this;
    }

    public Builder withCreated(OffsetDateTime created) {
      this.created = created;
      return this;
    }

    public Builder withDone(Boolean done) {
      this.done = done;
      return this;
    }

    public Builder withDeleted(Boolean deleted) {
      this.deleted = deleted;
      return this;
    }

    public Builder withContactDetails(ContactDetails contactDetails) {
      this.contactDetails = contactDetails;
      return this;
    }

    public Builder withSenders(List<Sender> senders) {
      this.senders = senders;
      return this;
    }

    public Builder addSendersItem(Sender sendersItem) {
      if (this.senders == null) {
        this.senders = new ArrayList<>();
      }
      this.senders.add(sendersItem);
      return this;
    }

    public Builder withAdvanced(Advanced advanced) {
      this.advanced = advanced;
      return this;
    }


    public ShareResponse build() { return new ShareResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareResponse shareResponse = (ShareResponse) o;
    return Objects.equals(this.id, shareResponse.id) &&
        Objects.equals(this.information, shareResponse.information) &&
        Objects.equals(this.recipients, shareResponse.recipients) &&
        Objects.equals(this.content, shareResponse.content) &&
        Objects.equals(this.uploadedDocuments, shareResponse.uploadedDocuments) &&
        Objects.equals(this.created, shareResponse.created) &&
        Objects.equals(this.done, shareResponse.done) &&
        Objects.equals(this.deleted, shareResponse.deleted) &&
        Objects.equals(this.contactDetails, shareResponse.contactDetails) &&
        Objects.equals(this.senders, shareResponse.senders) &&
        Objects.equals(this.advanced, shareResponse.advanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, information, recipients, content, uploadedDocuments, created, done, deleted, contactDetails, senders, advanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    information: ").append(toIndentedString(information)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    uploadedDocuments: ").append(toIndentedString(uploadedDocuments)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
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
