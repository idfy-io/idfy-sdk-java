/*
 * Idfy Identification
 * This endpoint enables authentication/identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID. ## Last update   Last build date for this endpoint: 02.04.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.identification.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * iFrame settings  REMARK! If using iframe the parent site have to be on https
 */
@JsonDeserialize(builder = IFrameSettings.Builder.class)
public class IFrameSettings  implements Serializable {
  /**
   * The domain of the site hosting the iFrame, this is used for the CSP policy and must be correct.
   */
  private final String domain;  // Default value is: null

  /**
   * Should WebMessaging be used for redirect of the iFrame parent, modern browsers have some issues with childs redirecting parents without the same origin. To use this include this script: https://signerecommon.blob.core.windows.net/files/signereid_webmessaging.js
   */
  private final Boolean webMessaging;  // Default value is: null

  /**
   * Height of the frame when used in iFrame.
   */
  private final Integer height;  // Default value is: null

  private IFrameSettings(Builder builder) {
      domain = builder.domain;
      webMessaging = builder.webMessaging;
      height = builder.height;
  }

      /**
      * The domain of the site hosting the iFrame, this is used for the CSP policy and must be correct.
      * @return domain
      **/
      public String getDomain() {return domain;}

      /**
      * Should WebMessaging be used for redirect of the iFrame parent, modern browsers have some issues with childs redirecting parents without the same origin. To use this include this script: https://signerecommon.blob.core.windows.net/files/signereid_webmessaging.js
      * @return webMessaging
      **/
      public Boolean getWebMessaging() {return webMessaging;}

      /**
      * Height of the frame when used in iFrame.
      * @return height
      **/
      public Integer getHeight() {return height;}


  public static final class Builder {
      private String domain;
      private Boolean webMessaging;
      private Integer height;

    public Builder() {
    }

    public Builder(IFrameSettings copy) {
        this.domain = copy.getDomain();
        this.webMessaging = copy.getWebMessaging();
        this.height = copy.getHeight();
    }

    public Builder withDomain(String domain) {
      this.domain = domain;
      return this;
    }

    public Builder withWebMessaging(Boolean webMessaging) {
      this.webMessaging = webMessaging;
      return this;
    }

    public Builder withHeight(Integer height) {
      this.height = height;
      return this;
    }


    public IFrameSettings build() { return new IFrameSettings(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IFrameSettings iFrameSettings = (IFrameSettings) o;
    return Objects.equals(this.domain, iFrameSettings.domain) &&
        Objects.equals(this.webMessaging, iFrameSettings.webMessaging) &&
        Objects.equals(this.height, iFrameSettings.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, webMessaging, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IFrameSettings {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    webMessaging: ").append(toIndentedString(webMessaging)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
