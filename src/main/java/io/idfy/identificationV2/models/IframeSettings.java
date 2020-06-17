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

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Iframe settings when using the &#x60;iframe&#x60; flow.
 */
@JsonDeserialize(builder = IframeSettings.Builder.class)
public class IframeSettings  implements Serializable {
  /**
   * Parent domains that will iframe the session.
   */
  private final List<String> parentDomains;  // Default value is: new ArrayList<String>()

  /**
   * Target origin for cross domain messaging.
   */
  private final String postMessageTargetOrigin;  // Default value is: null

  private IframeSettings(Builder builder) {
      parentDomains = builder.parentDomains;
      postMessageTargetOrigin = builder.postMessageTargetOrigin;
  }

      /**
      * Parent domains that will iframe the session.
      * @return parentDomains
      **/
      public List<String> getParentDomains() {return parentDomains;}

      /**
      * Target origin for cross domain messaging.
      * @return postMessageTargetOrigin
      **/
      public String getPostMessageTargetOrigin() {return postMessageTargetOrigin;}


  public static final class Builder {
      private List<String> parentDomains;
      private String postMessageTargetOrigin;

    public Builder() {
    }

    public Builder(IframeSettings copy) {
        this.parentDomains = copy.getParentDomains();
        this.postMessageTargetOrigin = copy.getPostMessageTargetOrigin();
    }

    public Builder withParentDomains(List<String> parentDomains) {
      this.parentDomains = parentDomains;
      return this;
    }

    public Builder addParentDomainsItem(String parentDomainsItem) {
      if (this.parentDomains == null) {
        this.parentDomains = new ArrayList<String>();
      }
      this.parentDomains.add(parentDomainsItem);
      return this;
    }

    public Builder withPostMessageTargetOrigin(String postMessageTargetOrigin) {
      this.postMessageTargetOrigin = postMessageTargetOrigin;
      return this;
    }


    public IframeSettings build() { return new IframeSettings(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IframeSettings iframeSettings = (IframeSettings) o;
    return Objects.equals(this.parentDomains, iframeSettings.parentDomains) &&
        Objects.equals(this.postMessageTargetOrigin, iframeSettings.postMessageTargetOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentDomains, postMessageTargetOrigin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IframeSettings {\n");
    
    sb.append("    parentDomains: ").append(toIndentedString(parentDomains)).append("\n");
    sb.append("    postMessageTargetOrigin: ").append(toIndentedString(postMessageTargetOrigin)).append("\n");
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