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
import io.idfy.information.models.OtherSignatures;
import io.idfy.information.models.RequiredSignatures;
import java.io.Serializable;

/**
 * SignatureObject
 */
@JsonDeserialize(builder = SignatureObject.Builder.class)
public class SignatureObject  implements Serializable {
  private final String requirementsDescription;  // Default value is: null

  private final RequiredSignatures required;  // Default value is: null

  private final OtherSignatures others;  // Default value is: null

  private SignatureObject(Builder builder) {
      requirementsDescription = builder.requirementsDescription;
      required = builder.required;
      others = builder.others;
  }

      /**
      * Get requirementsDescription
      * @return requirementsDescription
      **/
      public String getRequirementsDescription() {return requirementsDescription;}

      /**
      * Get required
      * @return required
      **/
      public RequiredSignatures getRequired() {return required;}

      /**
      * Get others
      * @return others
      **/
      public OtherSignatures getOthers() {return others;}


  public static final class Builder {
      private String requirementsDescription;
      private RequiredSignatures required;
      private OtherSignatures others;

    public Builder() {
    }

    public Builder(SignatureObject copy) {
        this.requirementsDescription = copy.getRequirementsDescription();
        this.required = copy.getRequired();
        this.others = copy.getOthers();
    }

    public Builder withRequirementsDescription(String requirementsDescription) {
      this.requirementsDescription = requirementsDescription;
      return this;
    }

    public Builder withRequired(RequiredSignatures required) {
      this.required = required;
      return this;
    }

    public Builder withOthers(OtherSignatures others) {
      this.others = others;
      return this;
    }


    public SignatureObject build() { return new SignatureObject(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureObject signatureObject = (SignatureObject) o;
    return Objects.equals(this.requirementsDescription, signatureObject.requirementsDescription) &&
        Objects.equals(this.required, signatureObject.required) &&
        Objects.equals(this.others, signatureObject.others);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirementsDescription, required, others);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureObject {\n");
    
    sb.append("    requirementsDescription: ").append(toIndentedString(requirementsDescription)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
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
