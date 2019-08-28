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
 * EiendomNorge
 */
@JsonDeserialize(builder = EiendomNorge.Builder.class)
public class EiendomNorge  implements Serializable {
  private final String svarEiendomNorgeField;  // Default value is: null

  private EiendomNorge(Builder builder) {
      svarEiendomNorgeField = builder.svarEiendomNorgeField;
  }

      /**
      * Get svarEiendomNorgeField
      * @return svarEiendomNorgeField
      **/
      public String getSvarEiendomNorgeField() {return svarEiendomNorgeField;}


  public static final class Builder {
      private String svarEiendomNorgeField;

    public Builder() {
    }

    public Builder(EiendomNorge copy) {
        this.svarEiendomNorgeField = copy.getSvarEiendomNorgeField();
    }

    public Builder withSvarEiendomNorgeField(String svarEiendomNorgeField) {
      this.svarEiendomNorgeField = svarEiendomNorgeField;
      return this;
    }


    public EiendomNorge build() { return new EiendomNorge(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EiendomNorge eiendomNorge = (EiendomNorge) o;
    return Objects.equals(this.svarEiendomNorgeField, eiendomNorge.svarEiendomNorgeField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(svarEiendomNorgeField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EiendomNorge {\n");
    
    sb.append("    svarEiendomNorgeField: ").append(toIndentedString(svarEiendomNorgeField)).append("\n");
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
