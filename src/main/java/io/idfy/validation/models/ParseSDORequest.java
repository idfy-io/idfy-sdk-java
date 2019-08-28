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
 * ParseSDORequest
 */
@JsonDeserialize(builder = ParseSDORequest.Builder.class)
public class ParseSDORequest  implements Serializable {
  /**
   * Base 64 encoded SDO (Signed document)
   */
  private final String sdoData;  // Default value is: null

  /**
   * The service reference for the signing. Will be used for auditlog, and invoicing
   */
  private final String externalReference;  // Default value is: null

  /**
   * Fetch social security number (Requires valid scope)
   */
  private final Boolean fetchSSN;  // Default value is: null

  private ParseSDORequest(Builder builder) {
      sdoData = builder.sdoData;
      externalReference = builder.externalReference;
      fetchSSN = builder.fetchSSN;
  }

      /**
      * Base 64 encoded SDO (Signed document)
      * @return sdoData
      **/
      public String getSdoData() {return sdoData;}

      /**
      * The service reference for the signing. Will be used for auditlog, and invoicing
      * @return externalReference
      **/
      public String getExternalReference() {return externalReference;}

      /**
      * Fetch social security number (Requires valid scope)
      * @return fetchSSN
      **/
      public Boolean getFetchSSN() {return fetchSSN;}


  public static final class Builder {
      private String sdoData;
      private String externalReference;
      private Boolean fetchSSN;

    public Builder() {
    }

    public Builder(ParseSDORequest copy) {
        this.sdoData = copy.getSdoData();
        this.externalReference = copy.getExternalReference();
        this.fetchSSN = copy.getFetchSSN();
    }

    public Builder withSdoData(String sdoData) {
      this.sdoData = sdoData;
      return this;
    }

    public Builder withExternalReference(String externalReference) {
      this.externalReference = externalReference;
      return this;
    }

    public Builder withFetchSSN(Boolean fetchSSN) {
      this.fetchSSN = fetchSSN;
      return this;
    }


    public ParseSDORequest build() { return new ParseSDORequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseSDORequest parseSDORequest = (ParseSDORequest) o;
    return Objects.equals(this.sdoData, parseSDORequest.sdoData) &&
        Objects.equals(this.externalReference, parseSDORequest.externalReference) &&
        Objects.equals(this.fetchSSN, parseSDORequest.fetchSSN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdoData, externalReference, fetchSSN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseSDORequest {\n");
    
    sb.append("    sdoData: ").append(toIndentedString(sdoData)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    fetchSSN: ").append(toIndentedString(fetchSSN)).append("\n");
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
