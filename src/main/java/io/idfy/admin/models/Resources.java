/*
 * Idfy.Admin
 * In this API you can manage your account details, logo, styling or manage your openid / oauth api clients. If you are a dealer you can also manage the accounts registered to this dealer.   ## Last update   Last build date for this API: 14.01.2018  
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.admin.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Logo / Styling
 */
@JsonDeserialize(builder = Resources.Builder.class)
public class Resources  implements Serializable {
  /**
   * The logo uploaded to this account
   */
  private final String logoUrl;  // Default value is: null

  /**
   * Custom css uploaded to this account
   */
  private final String cssUrl;  // Default value is: null

  private Resources(Builder builder) {
      logoUrl = builder.logoUrl;
      cssUrl = builder.cssUrl;
  }

      /**
      * The logo uploaded to this account
      * @return logoUrl
      **/
      public String getLogoUrl() {return logoUrl;}

      /**
      * Custom css uploaded to this account
      * @return cssUrl
      **/
      public String getCssUrl() {return cssUrl;}


  public static final class Builder {
      private String logoUrl;
      private String cssUrl;

    public Builder() {
    }

    public Builder(Resources copy) {
        this.logoUrl = copy.getLogoUrl();
        this.cssUrl = copy.getCssUrl();
    }

    public Builder withLogoUrl(String logoUrl) {
      this.logoUrl = logoUrl;
      return this;
    }

    public Builder withCssUrl(String cssUrl) {
      this.cssUrl = cssUrl;
      return this;
    }


    public Resources build() { return new Resources(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resources resources = (Resources) o;
    return Objects.equals(this.logoUrl, resources.logoUrl) &&
        Objects.equals(this.cssUrl, resources.cssUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoUrl, cssUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resources {\n");
    
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    cssUrl: ").append(toIndentedString(cssUrl)).append("\n");
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
