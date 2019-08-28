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
import io.idfy.signature.models.DataToSign;
import io.idfy.signature.models.Notification;
import io.idfy.signature.models.SignerWrapper;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * CreateDocumentRequestWrapper
 */
@JsonDeserialize(builder = CreateDocumentRequestWrapper.Builder.class)
public class CreateDocumentRequestWrapper  implements Serializable {
  private final List<SignerWrapper> signers;  // Default value is: new ArrayList<>()

  /**
   * The title of the document which will be presented to the user.
   */
  private final String title;  // Default value is: null

  /**
   * The description of the document.
   */
  private final String description;  // Default value is: null

  /**
   * Your reference to this document.
   */
  private final String externalId;  // Default value is: null

  private final DataToSign dataToSign;  // Default value is: null

  private final ContactDetails contactDetails;  // Default value is: null

  private final Notification notification;  // Default value is: null

  private final Advanced advanced;  // Default value is: null

  private CreateDocumentRequestWrapper(Builder builder) {
      signers = builder.signers;
      title = builder.title;
      description = builder.description;
      externalId = builder.externalId;
      dataToSign = builder.dataToSign;
      contactDetails = builder.contactDetails;
      notification = builder.notification;
      advanced = builder.advanced;
  }

      /**
      * Get signers
      * @return signers
      **/
      public List<SignerWrapper> getSigners() {return signers;}

      /**
      * The title of the document which will be presented to the user.
      * @return title
      **/
      public String getTitle() {return title;}

      /**
      * The description of the document.
      * @return description
      **/
      public String getDescription() {return description;}

      /**
      * Your reference to this document.
      * @return externalId
      **/
      public String getExternalId() {return externalId;}

      /**
      * Get dataToSign
      * @return dataToSign
      **/
      public DataToSign getDataToSign() {return dataToSign;}

      /**
      * Get contactDetails
      * @return contactDetails
      **/
      public ContactDetails getContactDetails() {return contactDetails;}

      /**
      * Get notification
      * @return notification
      **/
      public Notification getNotification() {return notification;}

      /**
      * Get advanced
      * @return advanced
      **/
      public Advanced getAdvanced() {return advanced;}


  public static final class Builder {
      private List<SignerWrapper> signers;
      private String title;
      private String description;
      private String externalId;
      private DataToSign dataToSign;
      private ContactDetails contactDetails;
      private Notification notification;
      private Advanced advanced;

    public Builder() {
    }

    public Builder(CreateDocumentRequestWrapper copy) {
        this.signers = copy.getSigners();
        this.title = copy.getTitle();
        this.description = copy.getDescription();
        this.externalId = copy.getExternalId();
        this.dataToSign = copy.getDataToSign();
        this.contactDetails = copy.getContactDetails();
        this.notification = copy.getNotification();
        this.advanced = copy.getAdvanced();
    }

    public Builder withSigners(List<SignerWrapper> signers) {
      this.signers = signers;
      return this;
    }

    public Builder addSignersItem(SignerWrapper signersItem) {
      this.signers.add(signersItem);
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

    public Builder withDataToSign(DataToSign dataToSign) {
      this.dataToSign = dataToSign;
      return this;
    }

    public Builder withContactDetails(ContactDetails contactDetails) {
      this.contactDetails = contactDetails;
      return this;
    }

    public Builder withNotification(Notification notification) {
      this.notification = notification;
      return this;
    }

    public Builder withAdvanced(Advanced advanced) {
      this.advanced = advanced;
      return this;
    }


    public CreateDocumentRequestWrapper build() { return new CreateDocumentRequestWrapper(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDocumentRequestWrapper createDocumentRequestWrapper = (CreateDocumentRequestWrapper) o;
    return Objects.equals(this.signers, createDocumentRequestWrapper.signers) &&
        Objects.equals(this.title, createDocumentRequestWrapper.title) &&
        Objects.equals(this.description, createDocumentRequestWrapper.description) &&
        Objects.equals(this.externalId, createDocumentRequestWrapper.externalId) &&
        Objects.equals(this.dataToSign, createDocumentRequestWrapper.dataToSign) &&
        Objects.equals(this.contactDetails, createDocumentRequestWrapper.contactDetails) &&
        Objects.equals(this.notification, createDocumentRequestWrapper.notification) &&
        Objects.equals(this.advanced, createDocumentRequestWrapper.advanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signers, title, description, externalId, dataToSign, contactDetails, notification, advanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDocumentRequestWrapper {\n");
    
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    dataToSign: ").append(toIndentedString(dataToSign)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
