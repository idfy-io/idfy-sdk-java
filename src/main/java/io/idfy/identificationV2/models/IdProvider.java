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
import java.io.Serializable;

/**
 * IdProvider
 */
@JsonDeserialize(builder = IdProvider.Builder.class)
public class IdProvider  implements Serializable {
  private final IdProviderType type;  // Default value is: null

  /**
   * The name of the ID provider.
   */
  private final String name;  // Default value is: null

  /**
   * A short description of the ID provider.
   */
  private final String description;  // Default value is: null

  /**
   * The URL to the ID provider's logo.
   */
  private final String logoUrl;  // Default value is: null

  /**
   * The URL to the ID provider's logo (negative version).
   */
  private final String logoUrlNegative;  // Default value is: null

  private IdProvider(Builder builder) {
      type = builder.type;
      name = builder.name;
      description = builder.description;
      logoUrl = builder.logoUrl;
      logoUrlNegative = builder.logoUrlNegative;
  }

      /**
      * Get type
      * @return type
      **/
      public IdProviderType getType() {return type;}

      /**
      * The name of the ID provider.
      * @return name
      **/
      public String getName() {return name;}

      /**
      * A short description of the ID provider.
      * @return description
      **/
      public String getDescription() {return description;}

      /**
      * The URL to the ID provider's logo.
      * @return logoUrl
      **/
      public String getLogoUrl() {return logoUrl;}

      /**
      * The URL to the ID provider's logo (negative version).
      * @return logoUrlNegative
      **/
      public String getLogoUrlNegative() {return logoUrlNegative;}


  public static final class Builder {
      private IdProviderType type;
      private String name;
      private String description;
      private String logoUrl;
      private String logoUrlNegative;

    public Builder() {
    }

    public Builder(IdProvider copy) {
        this.type = copy.getType();
        this.name = copy.getName();
        this.description = copy.getDescription();
        this.logoUrl = copy.getLogoUrl();
        this.logoUrlNegative = copy.getLogoUrlNegative();
    }

    public Builder withType(IdProviderType type) {
      this.type = type;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder withLogoUrl(String logoUrl) {
      this.logoUrl = logoUrl;
      return this;
    }

    public Builder withLogoUrlNegative(String logoUrlNegative) {
      this.logoUrlNegative = logoUrlNegative;
      return this;
    }


    public IdProvider build() { return new IdProvider(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdProvider idProvider = (IdProvider) o;
    return Objects.equals(this.type, idProvider.type) &&
        Objects.equals(this.name, idProvider.name) &&
        Objects.equals(this.description, idProvider.description) &&
        Objects.equals(this.logoUrl, idProvider.logoUrl) &&
        Objects.equals(this.logoUrlNegative, idProvider.logoUrlNegative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, description, logoUrl, logoUrlNegative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdProvider {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    logoUrlNegative: ").append(toIndentedString(logoUrlNegative)).append("\n");
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