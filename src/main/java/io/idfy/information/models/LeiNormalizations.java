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
import io.idfy.information.models.LeiNormalization;
import java.io.Serializable;

/**
 * LeiNormalizations
 */
@JsonDeserialize(builder = LeiNormalizations.Builder.class)
public class LeiNormalizations  implements Serializable {
  private final LeiNormalization legalName;  // Default value is: null

  private LeiNormalizations(Builder builder) {
      legalName = builder.legalName;
  }

      /**
      * Get legalName
      * @return legalName
      **/
      public LeiNormalization getLegalName() {return legalName;}


  public static final class Builder {
      private LeiNormalization legalName;

    public Builder() {
    }

    public Builder(LeiNormalizations copy) {
        this.legalName = copy.getLegalName();
    }

    public Builder withLegalName(LeiNormalization legalName) {
      this.legalName = legalName;
      return this;
    }


    public LeiNormalizations build() { return new LeiNormalizations(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeiNormalizations leiNormalizations = (LeiNormalizations) o;
    return Objects.equals(this.legalName, leiNormalizations.legalName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeiNormalizations {\n");
    
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
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
