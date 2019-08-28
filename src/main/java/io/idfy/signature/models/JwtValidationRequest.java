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
 * Jwt validation request
 */
@JsonDeserialize(builder = JwtValidationRequest.Builder.class)
public class JwtValidationRequest  implements Serializable {
  /**
   * The JWT to be validated as an string
   */
  private final String jwt;  // Default value is: null

  private JwtValidationRequest(Builder builder) {
      jwt = builder.jwt;
  }

      /**
      * The JWT to be validated as an string
      * @return jwt
      **/
      public String getJwt() {return jwt;}


  public static final class Builder {
      private String jwt;

    public Builder() {
    }

    public Builder(JwtValidationRequest copy) {
        this.jwt = copy.getJwt();
    }

    public Builder withJwt(String jwt) {
      this.jwt = jwt;
      return this;
    }


    public JwtValidationRequest build() { return new JwtValidationRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JwtValidationRequest jwtValidationRequest = (JwtValidationRequest) o;
    return Objects.equals(this.jwt, jwtValidationRequest.jwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JwtValidationRequest {\n");
    
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
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
