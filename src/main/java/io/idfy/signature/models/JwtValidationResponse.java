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
import io.idfy.signature.models.JwtPayload;
import java.io.Serializable;

/**
 * JwtValidationResponse
 */
@JsonDeserialize(builder = JwtValidationResponse.Builder.class)
public class JwtValidationResponse  implements Serializable {
  /**
   * True if jwt is valid
   */
  private final Boolean jwtValid;  // Default value is: null

  /**
   * True if expired
   */
  private final Boolean expired;  // Default value is: null

  /**
   * Payload (valid data if jwt is valid)
   */
  private final JwtPayload jwtPayload;  // Default value is: null

  /**
   * Error message if not valid jwt
   */
  private final String error;  // Default value is: null

  private JwtValidationResponse(Builder builder) {
      jwtValid = builder.jwtValid;
      expired = builder.expired;
      jwtPayload = builder.jwtPayload;
      error = builder.error;
  }

      /**
      * True if jwt is valid
      * @return jwtValid
      **/
      public Boolean getJwtValid() {return jwtValid;}

      /**
      * True if expired
      * @return expired
      **/
      public Boolean getExpired() {return expired;}

      /**
      * Payload (valid data if jwt is valid)
      * @return jwtPayload
      **/
      public JwtPayload getJwtPayload() {return jwtPayload;}

      /**
      * Error message if not valid jwt
      * @return error
      **/
      public String getError() {return error;}


  public static final class Builder {
      private Boolean jwtValid;
      private Boolean expired;
      private JwtPayload jwtPayload;
      private String error;

    public Builder() {
    }

    public Builder(JwtValidationResponse copy) {
        this.jwtValid = copy.getJwtValid();
        this.expired = copy.getExpired();
        this.jwtPayload = copy.getJwtPayload();
        this.error = copy.getError();
    }

    public Builder withJwtValid(Boolean jwtValid) {
      this.jwtValid = jwtValid;
      return this;
    }

    public Builder withExpired(Boolean expired) {
      this.expired = expired;
      return this;
    }

    public Builder withJwtPayload(JwtPayload jwtPayload) {
      this.jwtPayload = jwtPayload;
      return this;
    }

    public Builder withError(String error) {
      this.error = error;
      return this;
    }


    public JwtValidationResponse build() { return new JwtValidationResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JwtValidationResponse jwtValidationResponse = (JwtValidationResponse) o;
    return Objects.equals(this.jwtValid, jwtValidationResponse.jwtValid) &&
        Objects.equals(this.expired, jwtValidationResponse.expired) &&
        Objects.equals(this.jwtPayload, jwtValidationResponse.jwtPayload) &&
        Objects.equals(this.error, jwtValidationResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwtValid, expired, jwtPayload, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JwtValidationResponse {\n");
    
    sb.append("    jwtValid: ").append(toIndentedString(jwtValid)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    jwtPayload: ").append(toIndentedString(jwtPayload)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
