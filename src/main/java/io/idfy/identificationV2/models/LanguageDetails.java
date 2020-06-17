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
 * LanguageDetails
 */
@JsonDeserialize(builder = LanguageDetails.Builder.class)
public class LanguageDetails  implements Serializable {
  private final Language id;  // Default value is: null

  /**
   * Language name
   */
  private final String name;  // Default value is: null

  private LanguageDetails(Builder builder) {
      id = builder.id;
      name = builder.name;
  }

      /**
      * Get id
      * @return id
      **/
      public Language getId() {return id;}

      /**
      * Language name
      * @return name
      **/
      public String getName() {return name;}


  public static final class Builder {
      private Language id;
      private String name;

    public Builder() {
    }

    public Builder(LanguageDetails copy) {
        this.id = copy.getId();
        this.name = copy.getName();
    }

    public Builder withId(Language id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }


    public LanguageDetails build() { return new LanguageDetails(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageDetails languageDetails = (LanguageDetails) o;
    return Objects.equals(this.id, languageDetails.id) &&
        Objects.equals(this.name, languageDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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