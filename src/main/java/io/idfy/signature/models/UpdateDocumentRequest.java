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
import io.idfy.signature.models.Advanced;
import io.idfy.signature.models.ContactDetails;
import io.idfy.signature.models.Notification;
import java.io.Serializable;

/**
 * UpdateDocumentRequest
 */
@JsonDeserialize(builder = UpdateDocumentRequest.Builder.class)
public class UpdateDocumentRequest  implements Serializable {
  private final String title;  // Default value is: null

  private final String description;  // Default value is: null

  private final Notification notification;  // Default value is: null

  private final ContactDetails contactDetails;  // Default value is: null

  private final Advanced advanced;  // Default value is: null

  private UpdateDocumentRequest(Builder builder) {
      title = builder.title;
      description = builder.description;
      notification = builder.notification;
      contactDetails = builder.contactDetails;
      advanced = builder.advanced;
  }

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
      * Get notification
      * @return notification
      **/
      public Notification getNotification() {return notification;}

      /**
      * Get contactDetails
      * @return contactDetails
      **/
      public ContactDetails getContactDetails() {return contactDetails;}

      /**
      * Get advanced
      * @return advanced
      **/
      public Advanced getAdvanced() {return advanced;}


  public static final class Builder {
      private String title;
      private String description;
      private Notification notification;
      private ContactDetails contactDetails;
      private Advanced advanced;

    public Builder() {
    }

    public Builder(UpdateDocumentRequest copy) {
        this.title = copy.getTitle();
        this.description = copy.getDescription();
        this.notification = copy.getNotification();
        this.contactDetails = copy.getContactDetails();
        this.advanced = copy.getAdvanced();
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder withNotification(Notification notification) {
      this.notification = notification;
      return this;
    }

    public Builder withContactDetails(ContactDetails contactDetails) {
      this.contactDetails = contactDetails;
      return this;
    }

    public Builder withAdvanced(Advanced advanced) {
      this.advanced = advanced;
      return this;
    }


    public UpdateDocumentRequest build() { return new UpdateDocumentRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDocumentRequest updateDocumentRequest = (UpdateDocumentRequest) o;
    return Objects.equals(this.title, updateDocumentRequest.title) &&
        Objects.equals(this.description, updateDocumentRequest.description) &&
        Objects.equals(this.notification, updateDocumentRequest.notification) &&
        Objects.equals(this.contactDetails, updateDocumentRequest.contactDetails) &&
        Objects.equals(this.advanced, updateDocumentRequest.advanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, notification, contactDetails, advanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDocumentRequest {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
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
