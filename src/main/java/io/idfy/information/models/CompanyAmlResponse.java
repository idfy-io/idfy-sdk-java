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
import io.idfy.information.models.CompanySanctionResult;
import io.idfy.information.models.OwnersAndBoardMembers;
import io.idfy.information.models.VerifiedCompany;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * CompanyAmlResponse
 */
@JsonDeserialize(builder = CompanyAmlResponse.Builder.class)
public class CompanyAmlResponse  implements Serializable {
  /**
   * Reference identifying the current request. May be used for tracing
   */
  private final String bisnodeReference;  // Default value is: null

  /**
   * Data retrieved before the actual screening (data enhancement).
   */
  private final VerifiedCompany verifiedCompany;  // Default value is: null

  /**
   * List of all Sanction items with match for the input request.
   */
  private final List<CompanySanctionResult> sanctionResults;  // Default value is: new ArrayList<>()

  /**
   * Response message could for example be: No result from PEP and/or SANCTION screening.
   */
  private final String message;  // Default value is: null

  /**
   * Results for owners and board members
   */
  private final OwnersAndBoardMembers ownersAndBoardMembers;  // Default value is: null

  /**
   * Reference to downloadable PDF report (if includeReport is set to true in request)
   */
  private final String report;  // Default value is: null

  private CompanyAmlResponse(Builder builder) {
      bisnodeReference = builder.bisnodeReference;
      verifiedCompany = builder.verifiedCompany;
      sanctionResults = builder.sanctionResults;
      message = builder.message;
      ownersAndBoardMembers = builder.ownersAndBoardMembers;
      report = builder.report;
  }

      /**
      * Reference identifying the current request. May be used for tracing
      * @return bisnodeReference
      **/
      public String getBisnodeReference() {return bisnodeReference;}

      /**
      * Data retrieved before the actual screening (data enhancement).
      * @return verifiedCompany
      **/
      public VerifiedCompany getVerifiedCompany() {return verifiedCompany;}

      /**
      * List of all Sanction items with match for the input request.
      * @return sanctionResults
      **/
      public List<CompanySanctionResult> getSanctionResults() {return sanctionResults;}

      /**
      * Response message could for example be: No result from PEP and/or SANCTION screening.
      * @return message
      **/
      public String getMessage() {return message;}

      /**
      * Results for owners and board members
      * @return ownersAndBoardMembers
      **/
      public OwnersAndBoardMembers getOwnersAndBoardMembers() {return ownersAndBoardMembers;}

      /**
      * Reference to downloadable PDF report (if includeReport is set to true in request)
      * @return report
      **/
      public String getReport() {return report;}


  public static final class Builder {
      private String bisnodeReference;
      private VerifiedCompany verifiedCompany;
      private List<CompanySanctionResult> sanctionResults;
      private String message;
      private OwnersAndBoardMembers ownersAndBoardMembers;
      private String report;

    public Builder() {
    }

    public Builder(CompanyAmlResponse copy) {
        this.bisnodeReference = copy.getBisnodeReference();
        this.verifiedCompany = copy.getVerifiedCompany();
        this.sanctionResults = copy.getSanctionResults();
        this.message = copy.getMessage();
        this.ownersAndBoardMembers = copy.getOwnersAndBoardMembers();
        this.report = copy.getReport();
    }

    public Builder withBisnodeReference(String bisnodeReference) {
      this.bisnodeReference = bisnodeReference;
      return this;
    }

    public Builder withVerifiedCompany(VerifiedCompany verifiedCompany) {
      this.verifiedCompany = verifiedCompany;
      return this;
    }

    public Builder withSanctionResults(List<CompanySanctionResult> sanctionResults) {
      this.sanctionResults = sanctionResults;
      return this;
    }

    public Builder addSanctionResultsItem(CompanySanctionResult sanctionResultsItem) {
      if (this.sanctionResults == null) {
        this.sanctionResults = new ArrayList<>();
      }
      this.sanctionResults.add(sanctionResultsItem);
      return this;
    }

    public Builder withMessage(String message) {
      this.message = message;
      return this;
    }

    public Builder withOwnersAndBoardMembers(OwnersAndBoardMembers ownersAndBoardMembers) {
      this.ownersAndBoardMembers = ownersAndBoardMembers;
      return this;
    }

    public Builder withReport(String report) {
      this.report = report;
      return this;
    }


    public CompanyAmlResponse build() { return new CompanyAmlResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyAmlResponse companyAmlResponse = (CompanyAmlResponse) o;
    return Objects.equals(this.bisnodeReference, companyAmlResponse.bisnodeReference) &&
        Objects.equals(this.verifiedCompany, companyAmlResponse.verifiedCompany) &&
        Objects.equals(this.sanctionResults, companyAmlResponse.sanctionResults) &&
        Objects.equals(this.message, companyAmlResponse.message) &&
        Objects.equals(this.ownersAndBoardMembers, companyAmlResponse.ownersAndBoardMembers) &&
        Objects.equals(this.report, companyAmlResponse.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bisnodeReference, verifiedCompany, sanctionResults, message, ownersAndBoardMembers, report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyAmlResponse {\n");
    
    sb.append("    bisnodeReference: ").append(toIndentedString(bisnodeReference)).append("\n");
    sb.append("    verifiedCompany: ").append(toIndentedString(verifiedCompany)).append("\n");
    sb.append("    sanctionResults: ").append(toIndentedString(sanctionResults)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    ownersAndBoardMembers: ").append(toIndentedString(ownersAndBoardMembers)).append("\n");
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
