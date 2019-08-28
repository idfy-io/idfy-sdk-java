/*
 * Idfy Text
 * This endpoint lets you customize the texts used by various Idfy services.
 *
 * OpenAPI spec version: v1
 * 
 */

package io.idfy.text.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * LanguageSetCreateDTO
 */
@JsonDeserialize(builder = LanguageSetCreateDTO.Builder.class)
public class LanguageSetCreateDTO  implements Serializable {
  private final String name;  // Default value is: null

  private final Boolean isActive;  // Default value is: null

  private LanguageSetCreateDTO(Builder builder) {
      name = builder.name;
      isActive = builder.isActive;
  }

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get isActive
      * @return isActive
      **/
      public Boolean getIsActive() {return isActive;}


  public static final class Builder {
      private String name;
      private Boolean isActive;

    public Builder() {
    }

    public Builder(LanguageSetCreateDTO copy) {
        this.name = copy.getName();
        this.isActive = copy.getIsActive();
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withIsActive(Boolean isActive) {
      this.isActive = isActive;
      return this;
    }


    public LanguageSetCreateDTO build() { return new LanguageSetCreateDTO(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageSetCreateDTO languageSetCreateDTO = (LanguageSetCreateDTO) o;
    return Objects.equals(this.name, languageSetCreateDTO.name) &&
        Objects.equals(this.isActive, languageSetCreateDTO.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageSetCreateDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
