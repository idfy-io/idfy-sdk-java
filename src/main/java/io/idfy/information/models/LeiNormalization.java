/*
 * Idfy Information Services
 * This endpoint offers a lot of useful extra information including credit checks, signature / prokura checks and information regarding persons and companies.   ## Last update   Last build date for this endpoint: 13.12.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.information.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * LeiNormalization
 */
@JsonDeserialize(builder = LeiNormalization.Builder.class)
public class LeiNormalization  implements Serializable {
  private final String cleaned;  // Default value is: null

  private final String normalized;  // Default value is: null

  private LeiNormalization(Builder builder) {
      cleaned = builder.cleaned;
      normalized = builder.normalized;
  }

      /**
      * Get cleaned
      * @return cleaned
      **/
      public String getCleaned() {return cleaned;}

      /**
      * Get normalized
      * @return normalized
      **/
      public String getNormalized() {return normalized;}


  public static final class Builder {
      private String cleaned;
      private String normalized;

    public Builder() {
    }

    public Builder(LeiNormalization copy) {
        this.cleaned = copy.getCleaned();
        this.normalized = copy.getNormalized();
    }

    public Builder withCleaned(String cleaned) {
      this.cleaned = cleaned;
      return this;
    }

    public Builder withNormalized(String normalized) {
      this.normalized = normalized;
      return this;
    }


    public LeiNormalization build() { return new LeiNormalization(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeiNormalization leiNormalization = (LeiNormalization) o;
    return Objects.equals(this.cleaned, leiNormalization.cleaned) &&
        Objects.equals(this.normalized, leiNormalization.normalized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleaned, normalized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeiNormalization {\n");
    
    sb.append("    cleaned: ").append(toIndentedString(cleaned)).append("\n");
    sb.append("    normalized: ").append(toIndentedString(normalized)).append("\n");
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
