/*
 * Idfy Identification v2
 * This endpoint enables identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID.
 *
 * OpenAPI spec version: v2
 * Contact: support@idfy.io
 */
package io.idfy.identificationV2.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ExtraInfoResource
 */
@JsonDeserialize(builder = ExtraInfoResource.Builder.class)
public class ExtraInfoResource  implements Serializable {
  /**
   * The resource's unique identifier.
   */
  private final String id;  // Default value is: null

  private final ExtraInfoType type;  // Default value is: null

  /**
   * The resource's content type.
   */
  private final String contentType;  // Default value is: null

  /**
   * Time at which the resource expires.
   */
  private final OffsetDateTime expires;  // Default value is: null

  private final ExtraInfoStatus status;  // Default value is: null

  /**
   * The URL to download the resource.
   */
  private final String url;  // Default value is: null

  private ExtraInfoResource(Builder builder) {
      id = builder.id;
      type = builder.type;
      contentType = builder.contentType;
      expires = builder.expires;
      status = builder.status;
      url = builder.url;
  }

      /**
      * The resource's unique identifier.
      * @return id
      **/
      public String getId() {return id;}

      /**
      * Get type
      * @return type
      **/
      public ExtraInfoType getType() {return type;}

      /**
      * The resource's content type.
      * @return contentType
      **/
      public String getContentType() {return contentType;}

      /**
      * Time at which the resource expires.
      * @return expires
      **/
      public OffsetDateTime getExpires() {return expires;}

      /**
      * Get status
      * @return status
      **/
      public ExtraInfoStatus getStatus() {return status;}

      /**
      * The URL to download the resource.
      * @return url
      **/
      public String getUrl() {return url;}


  public static final class Builder {
      private String id;
      private ExtraInfoType type;
      private String contentType;
      private OffsetDateTime expires;
      private ExtraInfoStatus status;
      private String url;

    public Builder() {
    }

    public Builder(ExtraInfoResource copy) {
        this.id = copy.getId();
        this.type = copy.getType();
        this.contentType = copy.getContentType();
        this.expires = copy.getExpires();
        this.status = copy.getStatus();
        this.url = copy.getUrl();
    }

    public Builder withId(String id) {
      this.id = id;
      return this;
    }

    public Builder withType(ExtraInfoType type) {
      this.type = type;
      return this;
    }

    public Builder withContentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    public Builder withExpires(OffsetDateTime expires) {
      this.expires = expires;
      return this;
    }

    public Builder withStatus(ExtraInfoStatus status) {
      this.status = status;
      return this;
    }

    public Builder withUrl(String url) {
      this.url = url;
      return this;
    }


    public ExtraInfoResource build() { return new ExtraInfoResource(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraInfoResource extraInfoResource = (ExtraInfoResource) o;
    return Objects.equals(this.id, extraInfoResource.id) &&
        Objects.equals(this.type, extraInfoResource.type) &&
        Objects.equals(this.contentType, extraInfoResource.contentType) &&
        Objects.equals(this.expires, extraInfoResource.expires) &&
        Objects.equals(this.status, extraInfoResource.status) &&
        Objects.equals(this.url, extraInfoResource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, contentType, expires, status, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraInfoResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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