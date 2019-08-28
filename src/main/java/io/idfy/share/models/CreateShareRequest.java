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
import io.idfy.share.models.Recipient;
import io.idfy.share.models.Sender;
import io.idfy.share.models.Upload;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * CreateShareRequest
 */
@JsonDeserialize(builder = CreateShareRequest.Builder.class)
public class CreateShareRequest  implements Serializable {
  private final Information information;  // Default value is: null

  /**
   * List of unique things to share
   */
  private final List<Upload> content;  // Default value is: new ArrayList<>()

  /**
   * List of the recipients of this secure share
   */
  private final List<Recipient> recipients;  // Default value is: new ArrayList<>()

  private final ContactDetails contactDetails;  // Default value is: null

  /**
   * List of people sending this share.
   */
  private final List<Sender> senders;  // Default value is: new ArrayList<>()

  /**
   * Optional settings for advanced configuration.
   */
  private final Advanced advanced;  // Default value is: null

  private CreateShareRequest(Builder builder) {
      information = builder.information;
      content = builder.content;
      recipients = builder.recipients;
      contactDetails = builder.contactDetails;
      senders = builder.senders;
      advanced = builder.advanced;
  }

      /**
      * Get information
      * @return information
      **/
      public Information getInformation() {return information;}

      /**
      * List of unique things to share
      * @return content
      **/
      public List<Upload> getContent() {return content;}

      /**
      * List of the recipients of this secure share
      * @return recipients
      **/
      public List<Recipient> getRecipients() {return recipients;}

      /**
      * Get contactDetails
      * @return contactDetails
      **/
      public ContactDetails getContactDetails() {return contactDetails;}

      /**
      * List of people sending this share.
      * @return senders
      **/
      public List<Sender> getSenders() {return senders;}

      /**
      * Optional settings for advanced configuration.
      * @return advanced
      **/
      public Advanced getAdvanced() {return advanced;}


  public static final class Builder {
      private Information information;
      private List<Upload> content;
      private List<Recipient> recipients;
      private ContactDetails contactDetails;
      private List<Sender> senders;
      private Advanced advanced;

    public Builder() {
    }

    public Builder(CreateShareRequest copy) {
        this.information = copy.getInformation();
        this.content = copy.getContent();
        this.recipients = copy.getRecipients();
        this.contactDetails = copy.getContactDetails();
        this.senders = copy.getSenders();
        this.advanced = copy.getAdvanced();
    }

    public Builder withInformation(Information information) {
      this.information = information;
      return this;
    }

    public Builder withContent(List<Upload> content) {
      this.content = content;
      return this;
    }

    public Builder addContentItem(Upload contentItem) {
      this.content.add(contentItem);
      return this;
    }

    public Builder withRecipients(List<Recipient> recipients) {
      this.recipients = recipients;
      return this;
    }

    public Builder addRecipientsItem(Recipient recipientsItem) {
      this.recipients.add(recipientsItem);
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


    public CreateShareRequest build() { return new CreateShareRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShareRequest createShareRequest = (CreateShareRequest) o;
    return Objects.equals(this.information, createShareRequest.information) &&
        Objects.equals(this.content, createShareRequest.content) &&
        Objects.equals(this.recipients, createShareRequest.recipients) &&
        Objects.equals(this.contactDetails, createShareRequest.contactDetails) &&
        Objects.equals(this.senders, createShareRequest.senders) &&
        Objects.equals(this.advanced, createShareRequest.advanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(information, content, recipients, contactDetails, senders, advanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShareRequest {\n");
    
    sb.append("    information: ").append(toIndentedString(information)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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
