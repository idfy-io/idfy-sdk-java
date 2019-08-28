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
import io.idfy.share.models.ContactDetails;
import java.io.Serializable;

/**
 * UpdateShareRequest
 */
@JsonDeserialize(builder = UpdateShareRequest.Builder.class)
public class UpdateShareRequest  implements Serializable {
  /**
   * Title of the secure share, will be presented to the recipient
   */
  private final String title;  // Default value is: null

  /**
   * Descripition of secure share, will be present in standard notificaitons
   */
  private final String description;  // Default value is: null

  private final ContactDetails contactDetails;  // Default value is: null

  private UpdateShareRequest(Builder builder) {
      title = builder.title;
      description = builder.description;
      contactDetails = builder.contactDetails;
  }

      /**
      * Title of the secure share, will be presented to the recipient
      * @return title
      **/
      public String getTitle() {return title;}

      /**
      * Descripition of secure share, will be present in standard notificaitons
      * @return description
      **/
      public String getDescription() {return description;}

      /**
      * Get contactDetails
      * @return contactDetails
      **/
      public ContactDetails getContactDetails() {return contactDetails;}


  public static final class Builder {
      private String title;
      private String description;
      private ContactDetails contactDetails;

    public Builder() {
    }

    public Builder(UpdateShareRequest copy) {
        this.title = copy.getTitle();
        this.description = copy.getDescription();
        this.contactDetails = copy.getContactDetails();
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder withContactDetails(ContactDetails contactDetails) {
      this.contactDetails = contactDetails;
      return this;
    }


    public UpdateShareRequest build() { return new UpdateShareRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShareRequest updateShareRequest = (UpdateShareRequest) o;
    return Objects.equals(this.title, updateShareRequest.title) &&
        Objects.equals(this.description, updateShareRequest.description) &&
        Objects.equals(this.contactDetails, updateShareRequest.contactDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, contactDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShareRequest {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
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
