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
 * OrganizationResponse
 */
@JsonDeserialize(builder = OrganizationResponse.Builder.class)
public class OrganizationResponse  implements Serializable {
  private final Integer mvaNumber;  // Default value is: null

  private final String prokura;  // Default value is: null

  private final String signature;  // Default value is: null

  private final String report;  // Default value is: null

  private OrganizationResponse(Builder builder) {
      mvaNumber = builder.mvaNumber;
      prokura = builder.prokura;
      signature = builder.signature;
      report = builder.report;
  }

      /**
      * Get mvaNumber
      * @return mvaNumber
      **/
      public Integer getMvaNumber() {return mvaNumber;}

      /**
      * Get prokura
      * @return prokura
      **/
      public String getProkura() {return prokura;}

      /**
      * Get signature
      * @return signature
      **/
      public String getSignature() {return signature;}

      /**
      * Get report
      * @return report
      **/
      public String getReport() {return report;}


  public static final class Builder {
      private Integer mvaNumber;
      private String prokura;
      private String signature;
      private String report;

    public Builder() {
    }

    public Builder(OrganizationResponse copy) {
        this.mvaNumber = copy.getMvaNumber();
        this.prokura = copy.getProkura();
        this.signature = copy.getSignature();
        this.report = copy.getReport();
    }

    public Builder withMvaNumber(Integer mvaNumber) {
      this.mvaNumber = mvaNumber;
      return this;
    }

    public Builder withProkura(String prokura) {
      this.prokura = prokura;
      return this;
    }

    public Builder withSignature(String signature) {
      this.signature = signature;
      return this;
    }

    public Builder withReport(String report) {
      this.report = report;
      return this;
    }


    public OrganizationResponse build() { return new OrganizationResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationResponse organizationResponse = (OrganizationResponse) o;
    return Objects.equals(this.mvaNumber, organizationResponse.mvaNumber) &&
        Objects.equals(this.prokura, organizationResponse.prokura) &&
        Objects.equals(this.signature, organizationResponse.signature) &&
        Objects.equals(this.report, organizationResponse.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mvaNumber, prokura, signature, report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationResponse {\n");
    
    sb.append("    mvaNumber: ").append(toIndentedString(mvaNumber)).append("\n");
    sb.append("    prokura: ").append(toIndentedString(prokura)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
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
