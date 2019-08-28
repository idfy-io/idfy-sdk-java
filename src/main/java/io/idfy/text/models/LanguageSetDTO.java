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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * LanguageSetDTO
 */
@JsonDeserialize(builder = LanguageSetDTO.Builder.class)
public class LanguageSetDTO  implements Serializable {
  private final Integer id;  // Default value is: null

  private final String name;  // Default value is: null

  private final OffsetDateTime createdAt;  // Default value is: null

  private final OffsetDateTime updatedAt;  // Default value is: null

  private final Boolean isActive;  // Default value is: null

  private LanguageSetDTO(Builder builder) {
      id = builder.id;
      name = builder.name;
      createdAt = builder.createdAt;
      updatedAt = builder.updatedAt;
      isActive = builder.isActive;
  }

      /**
      * Get id
      * @return id
      **/
      public Integer getId() {return id;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get createdAt
      * @return createdAt
      **/
      public OffsetDateTime getCreatedAt() {return createdAt;}

      /**
      * Get updatedAt
      * @return updatedAt
      **/
      public OffsetDateTime getUpdatedAt() {return updatedAt;}

      /**
      * Get isActive
      * @return isActive
      **/
      public Boolean getIsActive() {return isActive;}


  public static final class Builder {
      private Integer id;
      private String name;
      private OffsetDateTime createdAt;
      private OffsetDateTime updatedAt;
      private Boolean isActive;

    public Builder() {
    }

    public Builder(LanguageSetDTO copy) {
        this.id = copy.getId();
        this.name = copy.getName();
        this.createdAt = copy.getCreatedAt();
        this.updatedAt = copy.getUpdatedAt();
        this.isActive = copy.getIsActive();
    }

    public Builder withId(Integer id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withCreatedAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder withUpdatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    public Builder withIsActive(Boolean isActive) {
      this.isActive = isActive;
      return this;
    }


    public LanguageSetDTO build() { return new LanguageSetDTO(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageSetDTO languageSetDTO = (LanguageSetDTO) o;
    return Objects.equals(this.id, languageSetDTO.id) &&
        Objects.equals(this.name, languageSetDTO.name) &&
        Objects.equals(this.createdAt, languageSetDTO.createdAt) &&
        Objects.equals(this.updatedAt, languageSetDTO.updatedAt) &&
        Objects.equals(this.isActive, languageSetDTO.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, updatedAt, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageSetDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
