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
 * Juridisk
 */
@JsonDeserialize(builder = Juridisk.Builder.class)
public class Juridisk  implements Serializable {
  private final String prokuraField;  // Default value is: null

  private final String signaturField;  // Default value is: null

  private final String eierStrukturField;  // Default value is: null

  private Juridisk(Builder builder) {
      prokuraField = builder.prokuraField;
      signaturField = builder.signaturField;
      eierStrukturField = builder.eierStrukturField;
  }

      /**
      * Get prokuraField
      * @return prokuraField
      **/
      public String getProkuraField() {return prokuraField;}

      /**
      * Get signaturField
      * @return signaturField
      **/
      public String getSignaturField() {return signaturField;}

      /**
      * Get eierStrukturField
      * @return eierStrukturField
      **/
      public String getEierStrukturField() {return eierStrukturField;}


  public static final class Builder {
      private String prokuraField;
      private String signaturField;
      private String eierStrukturField;

    public Builder() {
    }

    public Builder(Juridisk copy) {
        this.prokuraField = copy.getProkuraField();
        this.signaturField = copy.getSignaturField();
        this.eierStrukturField = copy.getEierStrukturField();
    }

    public Builder withProkuraField(String prokuraField) {
      this.prokuraField = prokuraField;
      return this;
    }

    public Builder withSignaturField(String signaturField) {
      this.signaturField = signaturField;
      return this;
    }

    public Builder withEierStrukturField(String eierStrukturField) {
      this.eierStrukturField = eierStrukturField;
      return this;
    }


    public Juridisk build() { return new Juridisk(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Juridisk juridisk = (Juridisk) o;
    return Objects.equals(this.prokuraField, juridisk.prokuraField) &&
        Objects.equals(this.signaturField, juridisk.signaturField) &&
        Objects.equals(this.eierStrukturField, juridisk.eierStrukturField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prokuraField, signaturField, eierStrukturField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Juridisk {\n");
    
    sb.append("    prokuraField: ").append(toIndentedString(prokuraField)).append("\n");
    sb.append("    signaturField: ").append(toIndentedString(signaturField)).append("\n");
    sb.append("    eierStrukturField: ").append(toIndentedString(eierStrukturField)).append("\n");
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
