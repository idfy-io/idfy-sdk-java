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
import java.io.Serializable;

/**
 * Information about the secure share
 */
@JsonDeserialize(builder = Information.Builder.class)
public class Information  implements Serializable {
  /**
   * Title of the secure share, will be presented to the recipient
   */
  private final String title;  // Default value is: null

  /**
   * Descripition of secure share, will be present in standard notificaitons
   */
  private final String description;  // Default value is: null

  /**
   * Creators id for the secure share
   */
  private final String externalId;  // Default value is: null

  /**
   * Department id
   */
  private final String departmentId;  // Default value is: null

  /**
   * Information not avaliable before the recipient has authenticated itself
   */
  private final String confidentialInfo;  // Default value is: null

  private Information(Builder builder) {
      title = builder.title;
      description = builder.description;
      externalId = builder.externalId;
      departmentId = builder.departmentId;
      confidentialInfo = builder.confidentialInfo;
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
      * Creators id for the secure share
      * @return externalId
      **/
      public String getExternalId() {return externalId;}

      /**
      * Department id
      * @return departmentId
      **/
      public String getDepartmentId() {return departmentId;}

      /**
      * Information not avaliable before the recipient has authenticated itself
      * @return confidentialInfo
      **/
      public String getConfidentialInfo() {return confidentialInfo;}


  public static final class Builder {
      private String title;
      private String description;
      private String externalId;
      private String departmentId;
      private String confidentialInfo;

    public Builder() {
    }

    public Builder(Information copy) {
        this.title = copy.getTitle();
        this.description = copy.getDescription();
        this.externalId = copy.getExternalId();
        this.departmentId = copy.getDepartmentId();
        this.confidentialInfo = copy.getConfidentialInfo();
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

    public Builder withDepartmentId(String departmentId) {
      this.departmentId = departmentId;
      return this;
    }

    public Builder withConfidentialInfo(String confidentialInfo) {
      this.confidentialInfo = confidentialInfo;
      return this;
    }


    public Information build() { return new Information(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Information information = (Information) o;
    return Objects.equals(this.title, information.title) &&
        Objects.equals(this.description, information.description) &&
        Objects.equals(this.externalId, information.externalId) &&
        Objects.equals(this.departmentId, information.departmentId) &&
        Objects.equals(this.confidentialInfo, information.confidentialInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, externalId, departmentId, confidentialInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Information {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    confidentialInfo: ").append(toIndentedString(confidentialInfo)).append("\n");
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
