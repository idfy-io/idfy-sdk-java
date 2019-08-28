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
 * Signature
 */
@JsonDeserialize(builder = Signature.Builder.class)
public class Signature  implements Serializable {
  private final String name;  // Default value is: null

  private final String dateOfBirth;  // Default value is: null

  private final String role;  // Default value is: null

  private Signature(Builder builder) {
      name = builder.name;
      dateOfBirth = builder.dateOfBirth;
      role = builder.role;
  }

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get dateOfBirth
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}

      /**
      * Get role
      * @return role
      **/
      public String getRole() {return role;}


  public static final class Builder {
      private String name;
      private String dateOfBirth;
      private String role;

    public Builder() {
    }

    public Builder(Signature copy) {
        this.name = copy.getName();
        this.dateOfBirth = copy.getDateOfBirth();
        this.role = copy.getRole();
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder withRole(String role) {
      this.role = role;
      return this;
    }


    public Signature build() { return new Signature(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signature signature = (Signature) o;
    return Objects.equals(this.name, signature.name) &&
        Objects.equals(this.dateOfBirth, signature.dateOfBirth) &&
        Objects.equals(this.role, signature.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dateOfBirth, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
