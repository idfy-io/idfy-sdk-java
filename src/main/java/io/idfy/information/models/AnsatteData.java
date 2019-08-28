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
 * AnsatteData
 */
@JsonDeserialize(builder = AnsatteData.Builder.class)
public class AnsatteData  implements Serializable {
  private final Integer ansatteArField;  // Default value is: null

  private final Integer ansatteAntallField;  // Default value is: null

  private AnsatteData(Builder builder) {
      ansatteArField = builder.ansatteArField;
      ansatteAntallField = builder.ansatteAntallField;
  }

      /**
      * Get ansatteArField
      * @return ansatteArField
      **/
      public Integer getAnsatteArField() {return ansatteArField;}

      /**
      * Get ansatteAntallField
      * @return ansatteAntallField
      **/
      public Integer getAnsatteAntallField() {return ansatteAntallField;}


  public static final class Builder {
      private Integer ansatteArField;
      private Integer ansatteAntallField;

    public Builder() {
    }

    public Builder(AnsatteData copy) {
        this.ansatteArField = copy.getAnsatteArField();
        this.ansatteAntallField = copy.getAnsatteAntallField();
    }

    public Builder withAnsatteArField(Integer ansatteArField) {
      this.ansatteArField = ansatteArField;
      return this;
    }

    public Builder withAnsatteAntallField(Integer ansatteAntallField) {
      this.ansatteAntallField = ansatteAntallField;
      return this;
    }


    public AnsatteData build() { return new AnsatteData(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnsatteData ansatteData = (AnsatteData) o;
    return Objects.equals(this.ansatteArField, ansatteData.ansatteArField) &&
        Objects.equals(this.ansatteAntallField, ansatteData.ansatteAntallField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ansatteArField, ansatteAntallField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnsatteData {\n");
    
    sb.append("    ansatteArField: ").append(toIndentedString(ansatteArField)).append("\n");
    sb.append("    ansatteAntallField: ").append(toIndentedString(ansatteAntallField)).append("\n");
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
