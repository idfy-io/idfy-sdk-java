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
 * Role
 */
@JsonDeserialize(builder = Role.Builder.class)
public class Role  implements Serializable {
  /**
   * Gets or Sets code
   */
  public enum Code {
    @JsonProperty("Unknown")
    UNKNOWN("Unknown"),
    
    @JsonProperty("CHAIRMAN_OF_THE_BOARD")
    CHAIRMAN_OF_THE_BOARD("CHAIRMAN_OF_THE_BOARD"),
    
    @JsonProperty("DEPUTY_CHAIRMAN_OF_THE_BOARD")
    DEPUTY_CHAIRMAN_OF_THE_BOARD("DEPUTY_CHAIRMAN_OF_THE_BOARD"),
    
    @JsonProperty("BOARD_MEMBER")
    BOARD_MEMBER("BOARD_MEMBER"),
    
    @JsonProperty("EMPLOYEES_REPRESENTATIVE")
    EMPLOYEES_REPRESENTATIVE("EMPLOYEES_REPRESENTATIVE"),
    
    @JsonProperty("DEPUTY_BOARD_MEMBER")
    DEPUTY_BOARD_MEMBER("DEPUTY_BOARD_MEMBER"),
    
    @JsonProperty("OBSERVER")
    OBSERVER("OBSERVER"),
    
    @JsonProperty("REPRESENTATIVE_FOREIGN_ENTITY")
    REPRESENTATIVE_FOREIGN_ENTITY("REPRESENTATIVE_FOREIGN_ENTITY"),
    
    @JsonProperty("LIABLE_PARTNER")
    LIABLE_PARTNER("LIABLE_PARTNER"),
    
    @JsonProperty("CEO")
    CEO("CEO"),
    
    @JsonProperty("COMPANY_SECRETARY")
    COMPANY_SECRETARY("COMPANY_SECRETARY"),
    
    @JsonProperty("AUDITOR")
    AUDITOR("AUDITOR"),
    
    @JsonProperty("AUDIT_EXEMPTION")
    AUDIT_EXEMPTION("AUDIT_EXEMPTION"),
    
    @JsonProperty("CERTIFIED_ACCOUNTANT")
    CERTIFIED_ACCOUNTANT("CERTIFIED_ACCOUNTANT"),
    
    @JsonProperty("CONTACT")
    CONTACT("CONTACT");

    private String value;

    Code(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Code fromValue(String text) {
      for (Code b : Code.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final Code code;  // Default value is: null

  private final String description;  // Default value is: null

  private Role(Builder builder) {
      code = builder.code;
      description = builder.description;
  }

      /**
      * Get code
      * @return code
      **/
      public Code getCode() {return code;}

      /**
      * Get description
      * @return description
      **/
      public String getDescription() {return description;}


  public static final class Builder {
      private Code code;
      private String description;

    public Builder() {
    }

    public Builder(Role copy) {
        this.code = copy.getCode();
        this.description = copy.getDescription();
    }

    public Builder withCode(Code code) {
      this.code = code;
      return this;
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }


    public Role build() { return new Role(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.code, role.code) &&
        Objects.equals(this.description, role.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
