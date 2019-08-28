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
import io.idfy.information.models.LeiNormalizations;
import java.io.Serializable;

/**
 * LeiExtension
 */
@JsonDeserialize(builder = LeiExtension.Builder.class)
public class LeiExtension  implements Serializable {
  private final LeiNormalizations normalizations;  // Default value is: null

  private LeiExtension(Builder builder) {
      normalizations = builder.normalizations;
  }

      /**
      * Get normalizations
      * @return normalizations
      **/
      public LeiNormalizations getNormalizations() {return normalizations;}


  public static final class Builder {
      private LeiNormalizations normalizations;

    public Builder() {
    }

    public Builder(LeiExtension copy) {
        this.normalizations = copy.getNormalizations();
    }

    public Builder withNormalizations(LeiNormalizations normalizations) {
      this.normalizations = normalizations;
      return this;
    }


    public LeiExtension build() { return new LeiExtension(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeiExtension leiExtension = (LeiExtension) o;
    return Objects.equals(this.normalizations, leiExtension.normalizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(normalizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeiExtension {\n");
    
    sb.append("    normalizations: ").append(toIndentedString(normalizations)).append("\n");
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
