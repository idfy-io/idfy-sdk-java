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
 * Onboarding
 */
@JsonDeserialize(builder = Onboarding.Builder.class)
public class Onboarding  implements Serializable {
  private final String heading;  // Default value is: null

  private final String leadParagraph;  // Default value is: null

  private final String logoUrl;  // Default value is: null

  private final String returnUrl;  // Default value is: null

  private Onboarding(Builder builder) {
      heading = builder.heading;
      leadParagraph = builder.leadParagraph;
      logoUrl = builder.logoUrl;
      returnUrl = builder.returnUrl;
  }

      /**
      * Get heading
      * @return heading
      **/
      public String getHeading() {return heading;}

      /**
      * Get leadParagraph
      * @return leadParagraph
      **/
      public String getLeadParagraph() {return leadParagraph;}

      /**
      * Get logoUrl
      * @return logoUrl
      **/
      public String getLogoUrl() {return logoUrl;}

      /**
      * Get returnUrl
      * @return returnUrl
      **/
      public String getReturnUrl() {return returnUrl;}


  public static final class Builder {
      private String heading;
      private String leadParagraph;
      private String logoUrl;
      private String returnUrl;

    public Builder() {
    }

    public Builder(Onboarding copy) {
        this.heading = copy.getHeading();
        this.leadParagraph = copy.getLeadParagraph();
        this.logoUrl = copy.getLogoUrl();
        this.returnUrl = copy.getReturnUrl();
    }

    public Builder withHeading(String heading) {
      this.heading = heading;
      return this;
    }

    public Builder withLeadParagraph(String leadParagraph) {
      this.leadParagraph = leadParagraph;
      return this;
    }

    public Builder withLogoUrl(String logoUrl) {
      this.logoUrl = logoUrl;
      return this;
    }

    public Builder withReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }


    public Onboarding build() { return new Onboarding(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Onboarding onboarding = (Onboarding) o;
    return Objects.equals(this.heading, onboarding.heading) &&
        Objects.equals(this.leadParagraph, onboarding.leadParagraph) &&
        Objects.equals(this.logoUrl, onboarding.logoUrl) &&
        Objects.equals(this.returnUrl, onboarding.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heading, leadParagraph, logoUrl, returnUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Onboarding {\n");
    
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    leadParagraph: ").append(toIndentedString(leadParagraph)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
