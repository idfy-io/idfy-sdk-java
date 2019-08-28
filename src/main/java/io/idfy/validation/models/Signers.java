/*
 * Idfy.Validation
 * In this API you can validate signatures from the following electronic IDs (e-ID)<br/><br/>  &bull; Norwegian BankId (SDO)<br/>  ## Last update [LastUpdate] ## Last update   Last build date for this endpoint: 12.03.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.validation.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Signers
 */
@JsonDeserialize(builder = Signers.Builder.class)
public class Signers  implements Serializable {
  private final String identificator;  // Default value is: null

  /**
   * Gets or Sets identificatorType
   */
  public enum IdentificatorType {
    @JsonProperty("Unknown")
    UNKNOWN("Unknown"),
    
    @JsonProperty("BankIDUniqueId")
    BANKIDUNIQUEID("BankIDUniqueId"),
    
    @JsonProperty("SSN")
    SSN("SSN"),
    
    @JsonProperty("OrganizationNumber")
    ORGANIZATIONNUMBER("OrganizationNumber");

    private String value;

    IdentificatorType(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdentificatorType fromValue(String text) {
      for (IdentificatorType b : IdentificatorType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final IdentificatorType identificatorType;  // Default value is: null

  private Signers(Builder builder) {
      identificator = builder.identificator;
      identificatorType = builder.identificatorType;
  }

      /**
      * Get identificator
      * @return identificator
      **/
      public String getIdentificator() {return identificator;}

      /**
      * Get identificatorType
      * @return identificatorType
      **/
      public IdentificatorType getIdentificatorType() {return identificatorType;}


  public static final class Builder {
      private String identificator;
      private IdentificatorType identificatorType;

    public Builder() {
    }

    public Builder(Signers copy) {
        this.identificator = copy.getIdentificator();
        this.identificatorType = copy.getIdentificatorType();
    }

    public Builder withIdentificator(String identificator) {
      this.identificator = identificator;
      return this;
    }

    public Builder withIdentificatorType(IdentificatorType identificatorType) {
      this.identificatorType = identificatorType;
      return this;
    }


    public Signers build() { return new Signers(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signers signers = (Signers) o;
    return Objects.equals(this.identificator, signers.identificator) &&
        Objects.equals(this.identificatorType, signers.identificatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificator, identificatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signers {\n");
    
    sb.append("    identificator: ").append(toIndentedString(identificator)).append("\n");
    sb.append("    identificatorType: ").append(toIndentedString(identificatorType)).append("\n");
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
