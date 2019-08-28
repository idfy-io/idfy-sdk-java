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
import io.idfy.signature.models.Authentication;
import io.idfy.signature.models.DocumentSignature;
import io.idfy.signature.models.ExtraInfoSignerRequest;
import io.idfy.signature.models.Link;
import io.idfy.signature.models.Notifications;
import io.idfy.signature.models.RedirectSettings;
import io.idfy.signature.models.SignatureType;
import io.idfy.signature.models.SignerInfo;
import io.idfy.signature.models.UI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * SignerResponse
 */
@JsonDeserialize(builder = SignerResponse.Builder.class)
public class SignerResponse  implements Serializable {
  /**
   * The signer's unique identifier.
   */
  private final UUID id;  // Default value is: null

  /**
   * The URL that the signer must use to sign the document.
   */
  private final String url;  // Default value is: null

  private final DocumentSignature documentSignature;  // Default value is: null

  /**
   * HATEOAS extrainfo links retrieved for signer.
   */
  private final List<Link> links;  // Default value is: new ArrayList<>()

  /**
   * Your reference for the signer.
   */
  private final String externalSignerId;  // Default value is: null

  /**
   * Return URLs and domain settings
   */
  private final RedirectSettings redirectSettings;  // Default value is: null

  private final SignatureType signatureType;  // Default value is: null

  /**
   * Define the signers name, mobile and email if you are using notifications
   */
  private final SignerInfo signerInfo;  // Default value is: null

  /**
   * Do you want the signer to authenticate before they can see the document?
   */
  private final Authentication authentication;  // Default value is: null

  /**
   * Coming soon: Do you want to collect extra info about this specific signer? (for example personal information)
   */
  private final ExtraInfoSignerRequest extraInfo;  // Default value is: null

  private final UI ui;  // Default value is: null

  private final Notifications notifications;  // Default value is: null

  /**
   * Coming soon.
   */
  private final List<String> tags;  // Default value is: new ArrayList<>()

  /**
   * Optional order of signing for the signer.
   */
  private final Integer order;  // Default value is: null

  /**
   * Determines if the signer is required to sign the document before other signers. Any other signers will not be allowed to sign before all required signers have signed the document.
   */
  private final Boolean required;  // Default value is: null

  /**
   * The time at which the signature URL expires (ISO 8601). Specify this if you want a limited time-to-live for the URL. Defaults to the lifetime of the document.
   */
  private final OffsetDateTime signUrlExpires;  // Default value is: null

  /**
   * Get social security number for this signer only (The global variable advanced.getSocialSecurityNumber will ovveride this when sat to true).  Requires certificate with permission to retrieve social security number
   */
  private final Boolean getSocialSecurityNumber;  // Default value is: null

  private SignerResponse(Builder builder) {
      id = builder.id;
      url = builder.url;
      documentSignature = builder.documentSignature;
      links = builder.links;
      externalSignerId = builder.externalSignerId;
      redirectSettings = builder.redirectSettings;
      signatureType = builder.signatureType;
      signerInfo = builder.signerInfo;
      authentication = builder.authentication;
      extraInfo = builder.extraInfo;
      ui = builder.ui;
      notifications = builder.notifications;
      tags = builder.tags;
      order = builder.order;
      required = builder.required;
      signUrlExpires = builder.signUrlExpires;
      getSocialSecurityNumber = builder.getSocialSecurityNumber;
  }

      /**
      * The signer's unique identifier.
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * The URL that the signer must use to sign the document.
      * @return url
      **/
      public String getUrl() {return url;}

      /**
      * Get documentSignature
      * @return documentSignature
      **/
      public DocumentSignature getDocumentSignature() {return documentSignature;}

      /**
      * HATEOAS extrainfo links retrieved for signer.
      * @return links
      **/
      public List<Link> getLinks() {return links;}

      /**
      * Your reference for the signer.
      * @return externalSignerId
      **/
      public String getExternalSignerId() {return externalSignerId;}

      /**
      * Return URLs and domain settings
      * @return redirectSettings
      **/
      public RedirectSettings getRedirectSettings() {return redirectSettings;}

      /**
      * Get signatureType
      * @return signatureType
      **/
      public SignatureType getSignatureType() {return signatureType;}

      /**
      * Define the signers name, mobile and email if you are using notifications
      * @return signerInfo
      **/
      public SignerInfo getSignerInfo() {return signerInfo;}

      /**
      * Do you want the signer to authenticate before they can see the document?
      * @return authentication
      **/
      public Authentication getAuthentication() {return authentication;}

      /**
      * Coming soon: Do you want to collect extra info about this specific signer? (for example personal information)
      * @return extraInfo
      **/
      public ExtraInfoSignerRequest getExtraInfo() {return extraInfo;}

      /**
      * Get ui
      * @return ui
      **/
      public UI getUi() {return ui;}

      /**
      * Get notifications
      * @return notifications
      **/
      public Notifications getNotifications() {return notifications;}

      /**
      * Coming soon.
      * @return tags
      **/
      public List<String> getTags() {return tags;}

      /**
      * Optional order of signing for the signer.
      * @return order
      **/
      public Integer getOrder() {return order;}

      /**
      * Determines if the signer is required to sign the document before other signers. Any other signers will not be allowed to sign before all required signers have signed the document.
      * @return required
      **/
      public Boolean getRequired() {return required;}

      /**
      * The time at which the signature URL expires (ISO 8601). Specify this if you want a limited time-to-live for the URL. Defaults to the lifetime of the document.
      * @return signUrlExpires
      **/
      public OffsetDateTime getSignUrlExpires() {return signUrlExpires;}

      /**
      * Get social security number for this signer only (The global variable advanced.getSocialSecurityNumber will ovveride this when sat to true).  Requires certificate with permission to retrieve social security number
      * @return getSocialSecurityNumber
      **/
      public Boolean getGetSocialSecurityNumber() {return getSocialSecurityNumber;}


  public static final class Builder {
      private UUID id;
      private String url;
      private DocumentSignature documentSignature;
      private List<Link> links;
      private String externalSignerId;
      private RedirectSettings redirectSettings;
      private SignatureType signatureType;
      private SignerInfo signerInfo;
      private Authentication authentication;
      private ExtraInfoSignerRequest extraInfo;
      private UI ui;
      private Notifications notifications;
      private List<String> tags;
      private Integer order;
      private Boolean required;
      private OffsetDateTime signUrlExpires;
      private Boolean getSocialSecurityNumber;

    public Builder() {
    }

    public Builder(SignerResponse copy) {
        this.id = copy.getId();
        this.url = copy.getUrl();
        this.documentSignature = copy.getDocumentSignature();
        this.links = copy.getLinks();
        this.externalSignerId = copy.getExternalSignerId();
        this.redirectSettings = copy.getRedirectSettings();
        this.signatureType = copy.getSignatureType();
        this.signerInfo = copy.getSignerInfo();
        this.authentication = copy.getAuthentication();
        this.extraInfo = copy.getExtraInfo();
        this.ui = copy.getUi();
        this.notifications = copy.getNotifications();
        this.tags = copy.getTags();
        this.order = copy.getOrder();
        this.required = copy.getRequired();
        this.signUrlExpires = copy.getSignUrlExpires();
        this.getSocialSecurityNumber = copy.getGetSocialSecurityNumber();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withUrl(String url) {
      this.url = url;
      return this;
    }

    public Builder withDocumentSignature(DocumentSignature documentSignature) {
      this.documentSignature = documentSignature;
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

    public Builder withExternalSignerId(String externalSignerId) {
      this.externalSignerId = externalSignerId;
      return this;
    }

    public Builder withRedirectSettings(RedirectSettings redirectSettings) {
      this.redirectSettings = redirectSettings;
      return this;
    }

    public Builder withSignatureType(SignatureType signatureType) {
      this.signatureType = signatureType;
      return this;
    }

    public Builder withSignerInfo(SignerInfo signerInfo) {
      this.signerInfo = signerInfo;
      return this;
    }

    public Builder withAuthentication(Authentication authentication) {
      this.authentication = authentication;
      return this;
    }

    public Builder withExtraInfo(ExtraInfoSignerRequest extraInfo) {
      this.extraInfo = extraInfo;
      return this;
    }

    public Builder withUi(UI ui) {
      this.ui = ui;
      return this;
    }

    public Builder withNotifications(Notifications notifications) {
      this.notifications = notifications;
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

    public Builder withOrder(Integer order) {
      this.order = order;
      return this;
    }

    public Builder withRequired(Boolean required) {
      this.required = required;
      return this;
    }

    public Builder withSignUrlExpires(OffsetDateTime signUrlExpires) {
      this.signUrlExpires = signUrlExpires;
      return this;
    }

    public Builder withGetSocialSecurityNumber(Boolean getSocialSecurityNumber) {
      this.getSocialSecurityNumber = getSocialSecurityNumber;
      return this;
    }


    public SignerResponse build() { return new SignerResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignerResponse signerResponse = (SignerResponse) o;
    return Objects.equals(this.id, signerResponse.id) &&
        Objects.equals(this.url, signerResponse.url) &&
        Objects.equals(this.documentSignature, signerResponse.documentSignature) &&
        Objects.equals(this.links, signerResponse.links) &&
        Objects.equals(this.externalSignerId, signerResponse.externalSignerId) &&
        Objects.equals(this.redirectSettings, signerResponse.redirectSettings) &&
        Objects.equals(this.signatureType, signerResponse.signatureType) &&
        Objects.equals(this.signerInfo, signerResponse.signerInfo) &&
        Objects.equals(this.authentication, signerResponse.authentication) &&
        Objects.equals(this.extraInfo, signerResponse.extraInfo) &&
        Objects.equals(this.ui, signerResponse.ui) &&
        Objects.equals(this.notifications, signerResponse.notifications) &&
        Objects.equals(this.tags, signerResponse.tags) &&
        Objects.equals(this.order, signerResponse.order) &&
        Objects.equals(this.required, signerResponse.required) &&
        Objects.equals(this.signUrlExpires, signerResponse.signUrlExpires) &&
        Objects.equals(this.getSocialSecurityNumber, signerResponse.getSocialSecurityNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, documentSignature, links, externalSignerId, redirectSettings, signatureType, signerInfo, authentication, extraInfo, ui, notifications, tags, order, required, signUrlExpires, getSocialSecurityNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignerResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    documentSignature: ").append(toIndentedString(documentSignature)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    externalSignerId: ").append(toIndentedString(externalSignerId)).append("\n");
    sb.append("    redirectSettings: ").append(toIndentedString(redirectSettings)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    signerInfo: ").append(toIndentedString(signerInfo)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    ui: ").append(toIndentedString(ui)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    signUrlExpires: ").append(toIndentedString(signUrlExpires)).append("\n");
    sb.append("    getSocialSecurityNumber: ").append(toIndentedString(getSocialSecurityNumber)).append("\n");
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
