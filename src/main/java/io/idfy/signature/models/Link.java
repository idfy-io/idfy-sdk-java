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
import java.io.Serializable;

/**
 * Link
 */
@JsonDeserialize(builder = Link.Builder.class)
public class Link  implements Serializable {
  private final String href;  // Default value is: null

  private final String rel;  // Default value is: null

  private final String contentType;  // Default value is: null

  private final String error;  // Default value is: null

  /**
   * Gets or Sets resourceStatus
   */
  public enum ResourceStatus {
    @JsonProperty("Unknown")
    UNKNOWN("Unknown"),
    
    @JsonProperty("NotReady")
    NOTREADY("NotReady"),
    
    @JsonProperty("Success")
    SUCCESS("Success"),
    
    @JsonProperty("Error")
    ERROR("Error"),
    
    @JsonProperty("NotFound")
    NOTFOUND("NotFound"),
    
    @JsonProperty("BadInput")
    BADINPUT("BadInput"),
    
    @JsonProperty("ServiceUnavailable")
    SERVICEUNAVAILABLE("ServiceUnavailable"),
    
    @JsonProperty("Unauthorized")
    UNAUTHORIZED("Unauthorized"),
    
    @JsonProperty("TimeOut")
    TIMEOUT("TimeOut");

    private String value;

    ResourceStatus(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResourceStatus fromValue(String text) {
      for (ResourceStatus b : ResourceStatus.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final ResourceStatus resourceStatus;  // Default value is: null

  private Link(Builder builder) {
      href = builder.href;
      rel = builder.rel;
      contentType = builder.contentType;
      error = builder.error;
      resourceStatus = builder.resourceStatus;
  }

      /**
      * Get href
      * @return href
      **/
      public String getHref() {return href;}

      /**
      * Get rel
      * @return rel
      **/
      public String getRel() {return rel;}

      /**
      * Get contentType
      * @return contentType
      **/
      public String getContentType() {return contentType;}

      /**
      * Get error
      * @return error
      **/
      public String getError() {return error;}

      /**
      * Get resourceStatus
      * @return resourceStatus
      **/
      public ResourceStatus getResourceStatus() {return resourceStatus;}


  public static final class Builder {
      private String href;
      private String rel;
      private String contentType;
      private String error;
      private ResourceStatus resourceStatus;

    public Builder() {
    }

    public Builder(Link copy) {
        this.href = copy.getHref();
        this.rel = copy.getRel();
        this.contentType = copy.getContentType();
        this.error = copy.getError();
        this.resourceStatus = copy.getResourceStatus();
    }

    public Builder withHref(String href) {
      this.href = href;
      return this;
    }

    public Builder withRel(String rel) {
      this.rel = rel;
      return this;
    }

    public Builder withContentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    public Builder withError(String error) {
      this.error = error;
      return this;
    }

    public Builder withResourceStatus(ResourceStatus resourceStatus) {
      this.resourceStatus = resourceStatus;
      return this;
    }


    public Link build() { return new Link(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.href, link.href) &&
        Objects.equals(this.rel, link.rel) &&
        Objects.equals(this.contentType, link.contentType) &&
        Objects.equals(this.error, link.error) &&
        Objects.equals(this.resourceStatus, link.resourceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, rel, contentType, error, resourceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
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
