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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * OauthSecret
 */
@JsonDeserialize(builder = OauthSecret.Builder.class)
public class OauthSecret  implements Serializable {
  private final String description;  // Default value is: null

  private final String value;  // Default value is: null

  private final OffsetDateTime expiration;  // Default value is: null

  private final String type;  // Default value is: null

  private OauthSecret(Builder builder) {
      description = builder.description;
      value = builder.value;
      expiration = builder.expiration;
      type = builder.type;
  }

      /**
      * Get description
      * @return description
      **/
      public String getDescription() {return description;}

      /**
      * Get value
      * @return value
      **/
      public String getValue() {return value;}

      /**
      * Get expiration
      * @return expiration
      **/
      public OffsetDateTime getExpiration() {return expiration;}

      /**
      * Get type
      * @return type
      **/
      public String getType() {return type;}


  public static final class Builder {
      private String description;
      private String value;
      private OffsetDateTime expiration;
      private String type;

    public Builder() {
    }

    public Builder(OauthSecret copy) {
        this.description = copy.getDescription();
        this.value = copy.getValue();
        this.expiration = copy.getExpiration();
        this.type = copy.getType();
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder withValue(String value) {
      this.value = value;
      return this;
    }

    public Builder withExpiration(OffsetDateTime expiration) {
      this.expiration = expiration;
      return this;
    }

    public Builder withType(String type) {
      this.type = type;
      return this;
    }


    public OauthSecret build() { return new OauthSecret(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthSecret oauthSecret = (OauthSecret) o;
    return Objects.equals(this.description, oauthSecret.description) &&
        Objects.equals(this.value, oauthSecret.value) &&
        Objects.equals(this.expiration, oauthSecret.expiration) &&
        Objects.equals(this.type, oauthSecret.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, value, expiration, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthSecret {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
