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
 * PersonDelomrader
 */
@JsonDeserialize(builder = PersonDelomrader.Builder.class)
public class PersonDelomrader  implements Serializable {
  private final String delomradeKodeField;  // Default value is: null

  private final String delomradeTekstField;  // Default value is: null

  private final String bedommelseKodeField;  // Default value is: null

  private final String bedommelseTekstField;  // Default value is: null

  private PersonDelomrader(Builder builder) {
      delomradeKodeField = builder.delomradeKodeField;
      delomradeTekstField = builder.delomradeTekstField;
      bedommelseKodeField = builder.bedommelseKodeField;
      bedommelseTekstField = builder.bedommelseTekstField;
  }

      /**
      * Get delomradeKodeField
      * @return delomradeKodeField
      **/
      public String getDelomradeKodeField() {return delomradeKodeField;}

      /**
      * Get delomradeTekstField
      * @return delomradeTekstField
      **/
      public String getDelomradeTekstField() {return delomradeTekstField;}

      /**
      * Get bedommelseKodeField
      * @return bedommelseKodeField
      **/
      public String getBedommelseKodeField() {return bedommelseKodeField;}

      /**
      * Get bedommelseTekstField
      * @return bedommelseTekstField
      **/
      public String getBedommelseTekstField() {return bedommelseTekstField;}


  public static final class Builder {
      private String delomradeKodeField;
      private String delomradeTekstField;
      private String bedommelseKodeField;
      private String bedommelseTekstField;

    public Builder() {
    }

    public Builder(PersonDelomrader copy) {
        this.delomradeKodeField = copy.getDelomradeKodeField();
        this.delomradeTekstField = copy.getDelomradeTekstField();
        this.bedommelseKodeField = copy.getBedommelseKodeField();
        this.bedommelseTekstField = copy.getBedommelseTekstField();
    }

    public Builder withDelomradeKodeField(String delomradeKodeField) {
      this.delomradeKodeField = delomradeKodeField;
      return this;
    }

    public Builder withDelomradeTekstField(String delomradeTekstField) {
      this.delomradeTekstField = delomradeTekstField;
      return this;
    }

    public Builder withBedommelseKodeField(String bedommelseKodeField) {
      this.bedommelseKodeField = bedommelseKodeField;
      return this;
    }

    public Builder withBedommelseTekstField(String bedommelseTekstField) {
      this.bedommelseTekstField = bedommelseTekstField;
      return this;
    }


    public PersonDelomrader build() { return new PersonDelomrader(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonDelomrader personDelomrader = (PersonDelomrader) o;
    return Objects.equals(this.delomradeKodeField, personDelomrader.delomradeKodeField) &&
        Objects.equals(this.delomradeTekstField, personDelomrader.delomradeTekstField) &&
        Objects.equals(this.bedommelseKodeField, personDelomrader.bedommelseKodeField) &&
        Objects.equals(this.bedommelseTekstField, personDelomrader.bedommelseTekstField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delomradeKodeField, delomradeTekstField, bedommelseKodeField, bedommelseTekstField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonDelomrader {\n");
    
    sb.append("    delomradeKodeField: ").append(toIndentedString(delomradeKodeField)).append("\n");
    sb.append("    delomradeTekstField: ").append(toIndentedString(delomradeTekstField)).append("\n");
    sb.append("    bedommelseKodeField: ").append(toIndentedString(bedommelseKodeField)).append("\n");
    sb.append("    bedommelseTekstField: ").append(toIndentedString(bedommelseTekstField)).append("\n");
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
