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
 * LeiLegalForm
 */
@JsonDeserialize(builder = LeiLegalForm.Builder.class)
public class LeiLegalForm  implements Serializable {
  private final String otherLegalForm;  // Default value is: null

  private final String entityLegalFormCode;  // Default value is: null

  private LeiLegalForm(Builder builder) {
      otherLegalForm = builder.otherLegalForm;
      entityLegalFormCode = builder.entityLegalFormCode;
  }

      /**
      * Get otherLegalForm
      * @return otherLegalForm
      **/
      public String getOtherLegalForm() {return otherLegalForm;}

      /**
      * Get entityLegalFormCode
      * @return entityLegalFormCode
      **/
      public String getEntityLegalFormCode() {return entityLegalFormCode;}


  public static final class Builder {
      private String otherLegalForm;
      private String entityLegalFormCode;

    public Builder() {
    }

    public Builder(LeiLegalForm copy) {
        this.otherLegalForm = copy.getOtherLegalForm();
        this.entityLegalFormCode = copy.getEntityLegalFormCode();
    }

    public Builder withOtherLegalForm(String otherLegalForm) {
      this.otherLegalForm = otherLegalForm;
      return this;
    }

    public Builder withEntityLegalFormCode(String entityLegalFormCode) {
      this.entityLegalFormCode = entityLegalFormCode;
      return this;
    }


    public LeiLegalForm build() { return new LeiLegalForm(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeiLegalForm leiLegalForm = (LeiLegalForm) o;
    return Objects.equals(this.otherLegalForm, leiLegalForm.otherLegalForm) &&
        Objects.equals(this.entityLegalFormCode, leiLegalForm.entityLegalFormCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherLegalForm, entityLegalFormCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeiLegalForm {\n");
    
    sb.append("    otherLegalForm: ").append(toIndentedString(otherLegalForm)).append("\n");
    sb.append("    entityLegalFormCode: ").append(toIndentedString(entityLegalFormCode)).append("\n");
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
