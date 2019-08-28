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
import io.idfy.signature.models.Link;
import io.idfy.signature.models.Notification;
import io.idfy.signature.models.SignerResponse;
import io.idfy.signature.models.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * CreateDocumentResponse
 */
@JsonDeserialize(builder = CreateDocumentResponse.Builder.class)
public class CreateDocumentResponse  implements Serializable {
  /**
   * The document's unique identifier.
   */
  private final UUID documentId;  // Default value is: null

  /**
   * List of signers for the document.
   */
  private final List<SignerResponse> signers;  // Default value is: new ArrayList<>()

  private final Status status;  // Default value is: null

  /**
   * HATEOAS extra info links retrieved for the document.
   */
  private final List<Link> links;  // Default value is: new ArrayList<>()

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

  private CreateDocumentResponse(Builder builder) {
      documentId = builder.documentId;
      signers = builder.signers;
      status = builder.status;
      links = builder.links;
      title = builder.title;
      description = builder.description;
      externalId = builder.externalId;
      dataToSign = builder.dataToSign;
      contactDetails = builder.contactDetails;
      notification = builder.notification;
      advanced = builder.advanced;
  }

      /**
      * The document's unique identifier.
      * @return documentId
      **/
      public UUID getDocumentId() {return documentId;}

      /**
      * List of signers for the document.
      * @return signers
      **/
      public List<SignerResponse> getSigners() {return signers;}

      /**
      * Get status
      * @return status
      **/
      public Status getStatus() {return status;}

      /**
      * HATEOAS extra info links retrieved for the document.
      * @return links
      **/
      public List<Link> getLinks() {return links;}

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
      private UUID documentId;
      private List<SignerResponse> signers;
      private Status status;
      private List<Link> links;
      private String title;
      private String description;
      private String externalId;
      private DataToSign dataToSign;
      private ContactDetails contactDetails;
      private Notification notification;
      private Advanced advanced;

    public Builder() {
    }

    public Builder(CreateDocumentResponse copy) {
        this.documentId = copy.getDocumentId();
        this.signers = copy.getSigners();
        this.status = copy.getStatus();
        this.links = copy.getLinks();
        this.title = copy.getTitle();
        this.description = copy.getDescription();
        this.externalId = copy.getExternalId();
        this.dataToSign = copy.getDataToSign();
        this.contactDetails = copy.getContactDetails();
        this.notification = copy.getNotification();
        this.advanced = copy.getAdvanced();
    }

    public Builder withDocumentId(UUID documentId) {
      this.documentId = documentId;
      return this;
    }

    public Builder withSigners(List<SignerResponse> signers) {
      this.signers = signers;
      return this;
    }

    public Builder addSignersItem(SignerResponse signersItem) {
      if (this.signers == null) {
        this.signers = new ArrayList<>();
      }
      this.signers.add(signersItem);
      return this;
    }

    public Builder withStatus(Status status) {
      this.status = status;
      return this;
    }

    public Builder withLinks(List<Link> links) {
      this.links = links;
      return this;
    }

    public Builder addLinksItem(Link linksItem) {
      if (this.links == null) {
        this.links = new ArrayList<>();
      }
      this.links.add(linksItem);
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


    public CreateDocumentResponse build() { return new CreateDocumentResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDocumentResponse createDocumentResponse = (CreateDocumentResponse) o;
    return Objects.equals(this.documentId, createDocumentResponse.documentId) &&
        Objects.equals(this.signers, createDocumentResponse.signers) &&
        Objects.equals(this.status, createDocumentResponse.status) &&
        Objects.equals(this.links, createDocumentResponse.links) &&
        Objects.equals(this.title, createDocumentResponse.title) &&
        Objects.equals(this.description, createDocumentResponse.description) &&
        Objects.equals(this.externalId, createDocumentResponse.externalId) &&
        Objects.equals(this.dataToSign, createDocumentResponse.dataToSign) &&
        Objects.equals(this.contactDetails, createDocumentResponse.contactDetails) &&
        Objects.equals(this.notification, createDocumentResponse.notification) &&
        Objects.equals(this.advanced, createDocumentResponse.advanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, signers, status, links, title, description, externalId, dataToSign, contactDetails, notification, advanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDocumentResponse {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
