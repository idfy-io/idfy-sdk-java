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
 * PersonArsaksData
 */
@JsonDeserialize(builder = PersonArsaksData.Builder.class)
public class PersonArsaksData  implements Serializable {
  private final String arsaksKodeField;  // Default value is: null

  private final String arsaksTekstField;  // Default value is: null

  private PersonArsaksData(Builder builder) {
      arsaksKodeField = builder.arsaksKodeField;
      arsaksTekstField = builder.arsaksTekstField;
  }

      /**
      * Get arsaksKodeField
      * @return arsaksKodeField
      **/
      public String getArsaksKodeField() {return arsaksKodeField;}

      /**
      * Get arsaksTekstField
      * @return arsaksTekstField
      **/
      public String getArsaksTekstField() {return arsaksTekstField;}


  public static final class Builder {
      private String arsaksKodeField;
      private String arsaksTekstField;

    public Builder() {
    }

    public Builder(PersonArsaksData copy) {
        this.arsaksKodeField = copy.getArsaksKodeField();
        this.arsaksTekstField = copy.getArsaksTekstField();
    }

    public Builder withArsaksKodeField(String arsaksKodeField) {
      this.arsaksKodeField = arsaksKodeField;
      return this;
    }

    public Builder withArsaksTekstField(String arsaksTekstField) {
      this.arsaksTekstField = arsaksTekstField;
      return this;
    }


    public PersonArsaksData build() { return new PersonArsaksData(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonArsaksData personArsaksData = (PersonArsaksData) o;
    return Objects.equals(this.arsaksKodeField, personArsaksData.arsaksKodeField) &&
        Objects.equals(this.arsaksTekstField, personArsaksData.arsaksTekstField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arsaksKodeField, arsaksTekstField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonArsaksData {\n");
    
    sb.append("    arsaksKodeField: ").append(toIndentedString(arsaksKodeField)).append("\n");
    sb.append("    arsaksTekstField: ").append(toIndentedString(arsaksTekstField)).append("\n");
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
