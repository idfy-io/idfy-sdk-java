/*
 * Idfy Identification
 * This endpoint enables authentication/identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID. ## Last update   Last build date for this endpoint: 02.04.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.identification.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * IdentificationCompleteResponse
 */
@JsonDeserialize(builder = IdentificationCompleteResponse.Builder.class)
public class IdentificationCompleteResponse  implements Serializable {
  /**
   * Is the idenfication process done?
   */
  private final Boolean done;  // Default value is: null

  private IdentificationCompleteResponse(Builder builder) {
      done = builder.done;
  }

      /**
      * Is the idenfication process done?
      * @return done
      **/
      public Boolean getDone() {return done;}


  public static final class Builder {
      private Boolean done;

    public Builder() {
    }

    public Builder(IdentificationCompleteResponse copy) {
        this.done = copy.getDone();
    }

    public Builder withDone(Boolean done) {
      this.done = done;
      return this;
    }


    public IdentificationCompleteResponse build() { return new IdentificationCompleteResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationCompleteResponse identificationCompleteResponse = (IdentificationCompleteResponse) o;
    return Objects.equals(this.done, identificationCompleteResponse.done);
  }

  @Override
  public int hashCode() {
    return Objects.hash(done);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationCompleteResponse {\n");
    
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
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
