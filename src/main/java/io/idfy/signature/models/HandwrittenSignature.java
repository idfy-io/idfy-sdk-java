/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.signature.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * HandwrittenSignature
 */
@JsonDeserialize(builder = HandwrittenSignature.Builder.class)
public class HandwrittenSignature  implements Serializable {
  private final String signature;  // Default value is: null

  private final String firstName;  // Default value is: null

  private final String lastName;  // Default value is: null

  private HandwrittenSignature(Builder builder) {
      signature = builder.signature;
      firstName = builder.firstName;
      lastName = builder.lastName;
  }

      /**
      * Get signature
      * @return signature
      **/
      public String getSignature() {return signature;}

      /**
      * Get firstName
      * @return firstName
      **/
      public String getFirstName() {return firstName;}

      /**
      * Get lastName
      * @return lastName
      **/
      public String getLastName() {return lastName;}


  public static final class Builder {
      private String signature;
      private String firstName;
      private String lastName;

    public Builder() {
    }

    public Builder(HandwrittenSignature copy) {
        this.signature = copy.getSignature();
        this.firstName = copy.getFirstName();
        this.lastName = copy.getLastName();
    }

    public Builder withSignature(String signature) {
      this.signature = signature;
      return this;
    }

    public Builder withFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }


    public HandwrittenSignature build() { return new HandwrittenSignature(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HandwrittenSignature handwrittenSignature = (HandwrittenSignature) o;
    return Objects.equals(this.signature, handwrittenSignature.signature) &&
        Objects.equals(this.firstName, handwrittenSignature.firstName) &&
        Objects.equals(this.lastName, handwrittenSignature.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HandwrittenSignature {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
