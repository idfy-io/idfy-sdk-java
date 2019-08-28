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
 * ValidatedSigners
 */
@JsonDeserialize(builder = ValidatedSigners.Builder.class)
public class ValidatedSigners  implements Serializable {
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

  private final Boolean valid;  // Default value is: null

  private final String name;  // Default value is: null

  private ValidatedSigners(Builder builder) {
      identificator = builder.identificator;
      identificatorType = builder.identificatorType;
      valid = builder.valid;
      name = builder.name;
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

      /**
      * Get valid
      * @return valid
      **/
      public Boolean getValid() {return valid;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}


  public static final class Builder {
      private String identificator;
      private IdentificatorType identificatorType;
      private Boolean valid;
      private String name;

    public Builder() {
    }

    public Builder(ValidatedSigners copy) {
        this.identificator = copy.getIdentificator();
        this.identificatorType = copy.getIdentificatorType();
        this.valid = copy.getValid();
        this.name = copy.getName();
    }

    public Builder withIdentificator(String identificator) {
      this.identificator = identificator;
      return this;
    }

    public Builder withIdentificatorType(IdentificatorType identificatorType) {
      this.identificatorType = identificatorType;
      return this;
    }

    public Builder withValid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }


    public ValidatedSigners build() { return new ValidatedSigners(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatedSigners validatedSigners = (ValidatedSigners) o;
    return Objects.equals(this.identificator, validatedSigners.identificator) &&
        Objects.equals(this.identificatorType, validatedSigners.identificatorType) &&
        Objects.equals(this.valid, validatedSigners.valid) &&
        Objects.equals(this.name, validatedSigners.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificator, identificatorType, valid, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatedSigners {\n");
    
    sb.append("    identificator: ").append(toIndentedString(identificator)).append("\n");
    sb.append("    identificatorType: ").append(toIndentedString(identificatorType)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
