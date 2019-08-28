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
 * LanguageDTO
 */
@JsonDeserialize(builder = LanguageDTO.Builder.class)
public class LanguageDTO  implements Serializable {
  private final Integer id;  // Default value is: null

  private final String code;  // Default value is: null

  private final String name;  // Default value is: null

  private LanguageDTO(Builder builder) {
      id = builder.id;
      code = builder.code;
      name = builder.name;
  }

      /**
      * Get id
      * @return id
      **/
      public Integer getId() {return id;}

      /**
      * Get code
      * @return code
      **/
      public String getCode() {return code;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}


  public static final class Builder {
      private Integer id;
      private String code;
      private String name;

    public Builder() {
    }

    public Builder(LanguageDTO copy) {
        this.id = copy.getId();
        this.code = copy.getCode();
        this.name = copy.getName();
    }

    public Builder withId(Integer id) {
      this.id = id;
      return this;
    }

    public Builder withCode(String code) {
      this.code = code;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }


    public LanguageDTO build() { return new LanguageDTO(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageDTO languageDTO = (LanguageDTO) o;
    return Objects.equals(this.id, languageDTO.id) &&
        Objects.equals(this.code, languageDTO.code) &&
        Objects.equals(this.name, languageDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
