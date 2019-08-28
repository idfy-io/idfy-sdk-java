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
import io.idfy.signature.models.ExtraInfoDocumentRequest;
import io.idfy.signature.models.Security;
import io.idfy.signature.models.TimeToLive;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Optional settings for advanced configuration.
 */
@JsonDeserialize(builder = Advanced.Builder.class)
public class Advanced  implements Serializable {
  /**
   * A list of tags to add to the document. These tags can be used to query for document data and will also be added to all events that are triggered for the document.
   */
  private final List<String> tags;  // Default value is: new ArrayList<>()

  /**
   * The number of attachments this document will have. Attachments can be added [here](#operation/Attachment_Create) after the document is created.  <span style=\"color: red\">If you set this value to 3, you MUST upload 3 attachments before anyone can sign the document.</span>
   */
  private final Integer attachments;  // Default value is: null

  /**
   * The number of signatures required before the document can be sealed and marked as completed.
   */
  private final Integer requiredSignatures;  // Default value is: null

  /**
   * The name of the application that created the document. Used for Idfy statistics.
   */
  private final String createdByApplication;  // Default value is: null

  /**
   * Determines if the social security number of all the signers should be retrieved after a successful signature.  Requires a certificate with permission to retrieve SSN.
   */
  private final Boolean getSocialSecurityNumber;  // Default value is: null

  private final ExtraInfoDocumentRequest extraInfo;  // Default value is: null

  private final Security security;  // Default value is: null

  private final TimeToLive timeToLive;  // Default value is: null

  /**
   * The department ID to mark the invoice with.
   */
  private final String departmentId;  // Default value is: null

  private Advanced(Builder builder) {
      tags = builder.tags;
      attachments = builder.attachments;
      requiredSignatures = builder.requiredSignatures;
      createdByApplication = builder.createdByApplication;
      getSocialSecurityNumber = builder.getSocialSecurityNumber;
      extraInfo = builder.extraInfo;
      security = builder.security;
      timeToLive = builder.timeToLive;
      departmentId = builder.departmentId;
  }

      /**
      * A list of tags to add to the document. These tags can be used to query for document data and will also be added to all events that are triggered for the document.
      * @return tags
      **/
      public List<String> getTags() {return tags;}

      /**
      * The number of attachments this document will have. Attachments can be added [here](#operation/Attachment_Create) after the document is created.  <span style=\"color: red\">If you set this value to 3, you MUST upload 3 attachments before anyone can sign the document.</span>
      * @return attachments
      **/
      public Integer getAttachments() {return attachments;}

      /**
      * The number of signatures required before the document can be sealed and marked as completed.
      * @return requiredSignatures
      **/
      public Integer getRequiredSignatures() {return requiredSignatures;}

      /**
      * The name of the application that created the document. Used for Idfy statistics.
      * @return createdByApplication
      **/
      public String getCreatedByApplication() {return createdByApplication;}

      /**
      * Determines if the social security number of all the signers should be retrieved after a successful signature.  Requires a certificate with permission to retrieve SSN.
      * @return getSocialSecurityNumber
      **/
      public Boolean getGetSocialSecurityNumber() {return getSocialSecurityNumber;}

      /**
      * Get extraInfo
      * @return extraInfo
      **/
      public ExtraInfoDocumentRequest getExtraInfo() {return extraInfo;}

      /**
      * Get security
      * @return security
      **/
      public Security getSecurity() {return security;}

      /**
      * Get timeToLive
      * @return timeToLive
      **/
      public TimeToLive getTimeToLive() {return timeToLive;}

      /**
      * The department ID to mark the invoice with.
      * @return departmentId
      **/
      public String getDepartmentId() {return departmentId;}


  public static final class Builder {
      private List<String> tags;
      private Integer attachments;
      private Integer requiredSignatures;
      private String createdByApplication;
      private Boolean getSocialSecurityNumber;
      private ExtraInfoDocumentRequest extraInfo;
      private Security security;
      private TimeToLive timeToLive;
      private String departmentId;

    public Builder() {
    }

    public Builder(Advanced copy) {
        this.tags = copy.getTags();
        this.attachments = copy.getAttachments();
        this.requiredSignatures = copy.getRequiredSignatures();
        this.createdByApplication = copy.getCreatedByApplication();
        this.getSocialSecurityNumber = copy.getGetSocialSecurityNumber();
        this.extraInfo = copy.getExtraInfo();
        this.security = copy.getSecurity();
        this.timeToLive = copy.getTimeToLive();
        this.departmentId = copy.getDepartmentId();
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

    public Builder withAttachments(Integer attachments) {
      this.attachments = attachments;
      return this;
    }

    public Builder withRequiredSignatures(Integer requiredSignatures) {
      this.requiredSignatures = requiredSignatures;
      return this;
    }

    public Builder withCreatedByApplication(String createdByApplication) {
      this.createdByApplication = createdByApplication;
      return this;
    }

    public Builder withGetSocialSecurityNumber(Boolean getSocialSecurityNumber) {
      this.getSocialSecurityNumber = getSocialSecurityNumber;
      return this;
    }

    public Builder withExtraInfo(ExtraInfoDocumentRequest extraInfo) {
      this.extraInfo = extraInfo;
      return this;
    }

    public Builder withSecurity(Security security) {
      this.security = security;
      return this;
    }

    public Builder withTimeToLive(TimeToLive timeToLive) {
      this.timeToLive = timeToLive;
      return this;
    }

    public Builder withDepartmentId(String departmentId) {
      this.departmentId = departmentId;
      return this;
    }


    public Advanced build() { return new Advanced(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Advanced advanced = (Advanced) o;
    return Objects.equals(this.tags, advanced.tags) &&
        Objects.equals(this.attachments, advanced.attachments) &&
        Objects.equals(this.requiredSignatures, advanced.requiredSignatures) &&
        Objects.equals(this.createdByApplication, advanced.createdByApplication) &&
        Objects.equals(this.getSocialSecurityNumber, advanced.getSocialSecurityNumber) &&
        Objects.equals(this.extraInfo, advanced.extraInfo) &&
        Objects.equals(this.security, advanced.security) &&
        Objects.equals(this.timeToLive, advanced.timeToLive) &&
        Objects.equals(this.departmentId, advanced.departmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, attachments, requiredSignatures, createdByApplication, getSocialSecurityNumber, extraInfo, security, timeToLive, departmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Advanced {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    requiredSignatures: ").append(toIndentedString(requiredSignatures)).append("\n");
    sb.append("    createdByApplication: ").append(toIndentedString(createdByApplication)).append("\n");
    sb.append("    getSocialSecurityNumber: ").append(toIndentedString(getSocialSecurityNumber)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
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
