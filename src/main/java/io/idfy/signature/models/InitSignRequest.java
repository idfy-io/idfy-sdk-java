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
import io.idfy.signature.models.AttachmentItem;
import io.idfy.signature.models.DocumentItem;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * InitSignRequest
 */
@JsonDeserialize(builder = InitSignRequest.Builder.class)
public class InitSignRequest  implements Serializable {
  private final String sessionId;  // Default value is: null

  private final UUID accountId;  // Default value is: null

  private final UUID documentId;  // Default value is: null

  /**
   * Gets or Sets language
   */
  public enum Language {
    @JsonProperty("NO")
    NO("NO"),
    
    @JsonProperty("EN")
    EN("EN"),
    
    @JsonProperty("SV")
    SV("SV"),
    
    @JsonProperty("DA")
    DA("DA"),
    
    @JsonProperty("FI")
    FI("FI");

    private String value;

    Language(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Language fromValue(String text) {
      for (Language b : Language.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final Language language;  // Default value is: null

  private final String senderName;  // Default value is: null

  private final String senderOrgNo;  // Default value is: null

  private final String senderDocumentReference;  // Default value is: null

  private final String base64DataToSign;  // Default value is: null

  private final DocumentItem documentItem;  // Default value is: null

  private final String ssn;  // Default value is: null

  private final String redirectUrl;  // Default value is: null

  private final UUID signerId;  // Default value is: null

  private final List<AttachmentItem> attachments;  // Default value is: new ArrayList<>()

  private InitSignRequest(Builder builder) {
      sessionId = builder.sessionId;
      accountId = builder.accountId;
      documentId = builder.documentId;
      language = builder.language;
      senderName = builder.senderName;
      senderOrgNo = builder.senderOrgNo;
      senderDocumentReference = builder.senderDocumentReference;
      base64DataToSign = builder.base64DataToSign;
      documentItem = builder.documentItem;
      ssn = builder.ssn;
      redirectUrl = builder.redirectUrl;
      signerId = builder.signerId;
      attachments = builder.attachments;
  }

      /**
      * Get sessionId
      * @return sessionId
      **/
      public String getSessionId() {return sessionId;}

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Get documentId
      * @return documentId
      **/
      public UUID getDocumentId() {return documentId;}

      /**
      * Get language
      * @return language
      **/
      public Language getLanguage() {return language;}

      /**
      * Get senderName
      * @return senderName
      **/
      public String getSenderName() {return senderName;}

      /**
      * Get senderOrgNo
      * @return senderOrgNo
      **/
      public String getSenderOrgNo() {return senderOrgNo;}

      /**
      * Get senderDocumentReference
      * @return senderDocumentReference
      **/
      public String getSenderDocumentReference() {return senderDocumentReference;}

      /**
      * Get base64DataToSign
      * @return base64DataToSign
      **/
      public String getBase64DataToSign() {return base64DataToSign;}

      /**
      * Get documentItem
      * @return documentItem
      **/
      public DocumentItem getDocumentItem() {return documentItem;}

      /**
      * Get ssn
      * @return ssn
      **/
      public String getSsn() {return ssn;}

      /**
      * Get redirectUrl
      * @return redirectUrl
      **/
      public String getRedirectUrl() {return redirectUrl;}

      /**
      * Get signerId
      * @return signerId
      **/
      public UUID getSignerId() {return signerId;}

      /**
      * Get attachments
      * @return attachments
      **/
      public List<AttachmentItem> getAttachments() {return attachments;}


  public static final class Builder {
      private String sessionId;
      private UUID accountId;
      private UUID documentId;
      private Language language;
      private String senderName;
      private String senderOrgNo;
      private String senderDocumentReference;
      private String base64DataToSign;
      private DocumentItem documentItem;
      private String ssn;
      private String redirectUrl;
      private UUID signerId;
      private List<AttachmentItem> attachments;

    public Builder() {
    }

    public Builder(InitSignRequest copy) {
        this.sessionId = copy.getSessionId();
        this.accountId = copy.getAccountId();
        this.documentId = copy.getDocumentId();
        this.language = copy.getLanguage();
        this.senderName = copy.getSenderName();
        this.senderOrgNo = copy.getSenderOrgNo();
        this.senderDocumentReference = copy.getSenderDocumentReference();
        this.base64DataToSign = copy.getBase64DataToSign();
        this.documentItem = copy.getDocumentItem();
        this.ssn = copy.getSsn();
        this.redirectUrl = copy.getRedirectUrl();
        this.signerId = copy.getSignerId();
        this.attachments = copy.getAttachments();
    }

    public Builder withSessionId(String sessionId) {
      this.sessionId = sessionId;
      return this;
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withDocumentId(UUID documentId) {
      this.documentId = documentId;
      return this;
    }

    public Builder withLanguage(Language language) {
      this.language = language;
      return this;
    }

    public Builder withSenderName(String senderName) {
      this.senderName = senderName;
      return this;
    }

    public Builder withSenderOrgNo(String senderOrgNo) {
      this.senderOrgNo = senderOrgNo;
      return this;
    }

    public Builder withSenderDocumentReference(String senderDocumentReference) {
      this.senderDocumentReference = senderDocumentReference;
      return this;
    }

    public Builder withBase64DataToSign(String base64DataToSign) {
      this.base64DataToSign = base64DataToSign;
      return this;
    }

    public Builder withDocumentItem(DocumentItem documentItem) {
      this.documentItem = documentItem;
      return this;
    }

    public Builder withSsn(String ssn) {
      this.ssn = ssn;
      return this;
    }

    public Builder withRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
      return this;
    }

    public Builder withSignerId(UUID signerId) {
      this.signerId = signerId;
      return this;
    }

    public Builder withAttachments(List<AttachmentItem> attachments) {
      this.attachments = attachments;
      return this;
    }

    public Builder addAttachmentsItem(AttachmentItem attachmentsItem) {
      if (this.attachments == null) {
        this.attachments = new ArrayList<>();
      }
      this.attachments.add(attachmentsItem);
      return this;
    }


    public InitSignRequest build() { return new InitSignRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitSignRequest initSignRequest = (InitSignRequest) o;
    return Objects.equals(this.sessionId, initSignRequest.sessionId) &&
        Objects.equals(this.accountId, initSignRequest.accountId) &&
        Objects.equals(this.documentId, initSignRequest.documentId) &&
        Objects.equals(this.language, initSignRequest.language) &&
        Objects.equals(this.senderName, initSignRequest.senderName) &&
        Objects.equals(this.senderOrgNo, initSignRequest.senderOrgNo) &&
        Objects.equals(this.senderDocumentReference, initSignRequest.senderDocumentReference) &&
        Objects.equals(this.base64DataToSign, initSignRequest.base64DataToSign) &&
        Objects.equals(this.documentItem, initSignRequest.documentItem) &&
        Objects.equals(this.ssn, initSignRequest.ssn) &&
        Objects.equals(this.redirectUrl, initSignRequest.redirectUrl) &&
        Objects.equals(this.signerId, initSignRequest.signerId) &&
        Objects.equals(this.attachments, initSignRequest.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, accountId, documentId, language, senderName, senderOrgNo, senderDocumentReference, base64DataToSign, documentItem, ssn, redirectUrl, signerId, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitSignRequest {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderOrgNo: ").append(toIndentedString(senderOrgNo)).append("\n");
    sb.append("    senderDocumentReference: ").append(toIndentedString(senderDocumentReference)).append("\n");
    sb.append("    base64DataToSign: ").append(toIndentedString(base64DataToSign)).append("\n");
    sb.append("    documentItem: ").append(toIndentedString(documentItem)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    signerId: ").append(toIndentedString(signerId)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
