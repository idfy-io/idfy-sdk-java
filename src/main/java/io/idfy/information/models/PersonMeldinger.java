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
 * PersonMeldinger
 */
@JsonDeserialize(builder = PersonMeldinger.Builder.class)
public class PersonMeldinger  implements Serializable {
  private final Integer meldingsKodeField;  // Default value is: null

  private final String meldingsTekstField;  // Default value is: null

  private PersonMeldinger(Builder builder) {
      meldingsKodeField = builder.meldingsKodeField;
      meldingsTekstField = builder.meldingsTekstField;
  }

      /**
      * Get meldingsKodeField
      * @return meldingsKodeField
      **/
      public Integer getMeldingsKodeField() {return meldingsKodeField;}

      /**
      * Get meldingsTekstField
      * @return meldingsTekstField
      **/
      public String getMeldingsTekstField() {return meldingsTekstField;}


  public static final class Builder {
      private Integer meldingsKodeField;
      private String meldingsTekstField;

    public Builder() {
    }

    public Builder(PersonMeldinger copy) {
        this.meldingsKodeField = copy.getMeldingsKodeField();
        this.meldingsTekstField = copy.getMeldingsTekstField();
    }

    public Builder withMeldingsKodeField(Integer meldingsKodeField) {
      this.meldingsKodeField = meldingsKodeField;
      return this;
    }

    public Builder withMeldingsTekstField(String meldingsTekstField) {
      this.meldingsTekstField = meldingsTekstField;
      return this;
    }


    public PersonMeldinger build() { return new PersonMeldinger(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonMeldinger personMeldinger = (PersonMeldinger) o;
    return Objects.equals(this.meldingsKodeField, personMeldinger.meldingsKodeField) &&
        Objects.equals(this.meldingsTekstField, personMeldinger.meldingsTekstField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meldingsKodeField, meldingsTekstField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonMeldinger {\n");
    
    sb.append("    meldingsKodeField: ").append(toIndentedString(meldingsKodeField)).append("\n");
    sb.append("    meldingsTekstField: ").append(toIndentedString(meldingsTekstField)).append("\n");
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
