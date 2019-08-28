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
 * TranslationDTO
 */
@JsonDeserialize(builder = TranslationDTO.Builder.class)
public class TranslationDTO  implements Serializable {
  private final Integer subjectId;  // Default value is: null

  private final String key;  // Default value is: null

  private final String language;  // Default value is: null

  private final String value;  // Default value is: null

  private final String defaultValue;  // Default value is: null

  private TranslationDTO(Builder builder) {
      subjectId = builder.subjectId;
      key = builder.key;
      language = builder.language;
      value = builder.value;
      defaultValue = builder.defaultValue;
  }

      /**
      * Get subjectId
      * @return subjectId
      **/
      public Integer getSubjectId() {return subjectId;}

      /**
      * Get key
      * @return key
      **/
      public String getKey() {return key;}

      /**
      * Get language
      * @return language
      **/
      public String getLanguage() {return language;}

      /**
      * Get value
      * @return value
      **/
      public String getValue() {return value;}

      /**
      * Get defaultValue
      * @return defaultValue
      **/
      public String getDefaultValue() {return defaultValue;}


  public static final class Builder {
      private Integer subjectId;
      private String key;
      private String language;
      private String value;
      private String defaultValue;

    public Builder() {
    }

    public Builder(TranslationDTO copy) {
        this.subjectId = copy.getSubjectId();
        this.key = copy.getKey();
        this.language = copy.getLanguage();
        this.value = copy.getValue();
        this.defaultValue = copy.getDefaultValue();
    }

    public Builder withSubjectId(Integer subjectId) {
      this.subjectId = subjectId;
      return this;
    }

    public Builder withKey(String key) {
      this.key = key;
      return this;
    }

    public Builder withLanguage(String language) {
      this.language = language;
      return this;
    }

    public Builder withValue(String value) {
      this.value = value;
      return this;
    }

    public Builder withDefaultValue(String defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }


    public TranslationDTO build() { return new TranslationDTO(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationDTO translationDTO = (TranslationDTO) o;
    return Objects.equals(this.subjectId, translationDTO.subjectId) &&
        Objects.equals(this.key, translationDTO.key) &&
        Objects.equals(this.language, translationDTO.language) &&
        Objects.equals(this.value, translationDTO.value) &&
        Objects.equals(this.defaultValue, translationDTO.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectId, key, language, value, defaultValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationDTO {\n");
    
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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
