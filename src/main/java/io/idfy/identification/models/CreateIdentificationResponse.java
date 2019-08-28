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
 * The response of the Create Identitiy request
 */
@JsonDeserialize(builder = CreateIdentificationResponse.Builder.class)
public class CreateIdentificationResponse  implements Serializable {
  /**
   * The url to use as src for iframe or to redirect the user to
   */
  private final String url;  // Default value is: null

  /**
   * Requestid used to get the reponse form server afterwards
   */
  private final String requestId;  // Default value is: null

  private CreateIdentificationResponse(Builder builder) {
      url = builder.url;
      requestId = builder.requestId;
  }

      /**
      * The url to use as src for iframe or to redirect the user to
      * @return url
      **/
      public String getUrl() {return url;}

      /**
      * Requestid used to get the reponse form server afterwards
      * @return requestId
      **/
      public String getRequestId() {return requestId;}


  public static final class Builder {
      private String url;
      private String requestId;

    public Builder() {
    }

    public Builder(CreateIdentificationResponse copy) {
        this.url = copy.getUrl();
        this.requestId = copy.getRequestId();
    }

    public Builder withUrl(String url) {
      this.url = url;
      return this;
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }


    public CreateIdentificationResponse build() { return new CreateIdentificationResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIdentificationResponse createIdentificationResponse = (CreateIdentificationResponse) o;
    return Objects.equals(this.url, createIdentificationResponse.url) &&
        Objects.equals(this.requestId, createIdentificationResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIdentificationResponse {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
