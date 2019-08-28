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
 * Other account settings
 */
@JsonDeserialize(builder = Settings.Builder.class)
public class Settings  implements Serializable {
  private final String smSSender;  // Default value is: null

  private Settings(Builder builder) {
      smSSender = builder.smSSender;
  }

      /**
      * Get smSSender
      * @return smSSender
      **/
      public String getSmSSender() {return smSSender;}


  public static final class Builder {
      private String smSSender;

    public Builder() {
    }

    public Builder(Settings copy) {
        this.smSSender = copy.getSmSSender();
    }

    public Builder withSmSSender(String smSSender) {
      this.smSSender = smSSender;
      return this;
    }


    public Settings build() { return new Settings(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;
    return Objects.equals(this.smSSender, settings.smSSender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smSSender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    
    sb.append("    smSSender: ").append(toIndentedString(smSSender)).append("\n");
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
