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
import io.idfy.information.models.SignatureObject;
import java.io.Serializable;

/**
 * SignatureRights
 */
@JsonDeserialize(builder = SignatureRights.Builder.class)
public class SignatureRights  implements Serializable {
  private final Integer mvaNumber;  // Default value is: null

  private final String name;  // Default value is: null

  private final SignatureObject signatur;  // Default value is: null

  private final SignatureObject prokura;  // Default value is: null

  private final String report;  // Default value is: null

  private final String requestId;  // Default value is: null

  private final String reportId;  // Default value is: null

  private SignatureRights(Builder builder) {
      mvaNumber = builder.mvaNumber;
      name = builder.name;
      signatur = builder.signatur;
      prokura = builder.prokura;
      report = builder.report;
      requestId = builder.requestId;
      reportId = builder.reportId;
  }

      /**
      * Get mvaNumber
      * @return mvaNumber
      **/
      public Integer getMvaNumber() {return mvaNumber;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get signatur
      * @return signatur
      **/
      public SignatureObject getSignatur() {return signatur;}

      /**
      * Get prokura
      * @return prokura
      **/
      public SignatureObject getProkura() {return prokura;}

      /**
      * Get report
      * @return report
      **/
      public String getReport() {return report;}

      /**
      * Get requestId
      * @return requestId
      **/
      public String getRequestId() {return requestId;}

      /**
      * Get reportId
      * @return reportId
      **/
      public String getReportId() {return reportId;}


  public static final class Builder {
      private Integer mvaNumber;
      private String name;
      private SignatureObject signatur;
      private SignatureObject prokura;
      private String report;
      private String requestId;
      private String reportId;

    public Builder() {
    }

    public Builder(SignatureRights copy) {
        this.mvaNumber = copy.getMvaNumber();
        this.name = copy.getName();
        this.signatur = copy.getSignatur();
        this.prokura = copy.getProkura();
        this.report = copy.getReport();
        this.requestId = copy.getRequestId();
        this.reportId = copy.getReportId();
    }

    public Builder withMvaNumber(Integer mvaNumber) {
      this.mvaNumber = mvaNumber;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withSignatur(SignatureObject signatur) {
      this.signatur = signatur;
      return this;
    }

    public Builder withProkura(SignatureObject prokura) {
      this.prokura = prokura;
      return this;
    }

    public Builder withReport(String report) {
      this.report = report;
      return this;
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public Builder withReportId(String reportId) {
      this.reportId = reportId;
      return this;
    }


    public SignatureRights build() { return new SignatureRights(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureRights signatureRights = (SignatureRights) o;
    return Objects.equals(this.mvaNumber, signatureRights.mvaNumber) &&
        Objects.equals(this.name, signatureRights.name) &&
        Objects.equals(this.signatur, signatureRights.signatur) &&
        Objects.equals(this.prokura, signatureRights.prokura) &&
        Objects.equals(this.report, signatureRights.report) &&
        Objects.equals(this.requestId, signatureRights.requestId) &&
        Objects.equals(this.reportId, signatureRights.reportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mvaNumber, name, signatur, prokura, report, requestId, reportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureRights {\n");
    
    sb.append("    mvaNumber: ").append(toIndentedString(mvaNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signatur: ").append(toIndentedString(signatur)).append("\n");
    sb.append("    prokura: ").append(toIndentedString(prokura)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
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
