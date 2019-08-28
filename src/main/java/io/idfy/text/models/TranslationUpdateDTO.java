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
 * TranslationUpdateDTO
 */
@JsonDeserialize(builder = TranslationUpdateDTO.Builder.class)
public class TranslationUpdateDTO  implements Serializable {
  private final String value;  // Default value is: null

  private TranslationUpdateDTO(Builder builder) {
      value = builder.value;
  }

      /**
      * Get value
      * @return value
      **/
      public String getValue() {return value;}


  public static final class Builder {
      private String value;

    public Builder() {
    }

    public Builder(TranslationUpdateDTO copy) {
        this.value = copy.getValue();
    }

    public Builder withValue(String value) {
      this.value = value;
      return this;
    }


    public TranslationUpdateDTO build() { return new TranslationUpdateDTO(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationUpdateDTO translationUpdateDTO = (TranslationUpdateDTO) o;
    return Objects.equals(this.value, translationUpdateDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationUpdateDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
