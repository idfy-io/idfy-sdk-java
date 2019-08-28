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
import io.idfy.information.models.PepResult;
import io.idfy.information.models.PersonSanctionResult;
import io.idfy.information.models.VerifiedPerson;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * PersonAmlResponse
 */
@JsonDeserialize(builder = PersonAmlResponse.Builder.class)
public class PersonAmlResponse  implements Serializable {
  /**
   * Reference identifying the current request. May be used for tracing
   */
  private final String bisnodeReference;  // Default value is: null

  /**
   * List of all Sanction items with match for the input request.
   */
  private final List<PersonSanctionResult> sanctionResults;  // Default value is: new ArrayList<>()

  /**
   * List of all PEP items with match for the input request.
   */
  private final List<PepResult> pepResults;  // Default value is: new ArrayList<>()

  /**
   * Data retrieved before the actual screening (data enhancement).
   */
  private final VerifiedPerson verifiedPerson;  // Default value is: null

  /**
   * Response message could for example be: No result from PEP and/or SANCTION screening.
   */
  private final String message;  // Default value is: null

  /**
   * Reference to downloadable PDF report (if includeReport is set to true in request)
   */
  private final String report;  // Default value is: null

  private PersonAmlResponse(Builder builder) {
      bisnodeReference = builder.bisnodeReference;
      sanctionResults = builder.sanctionResults;
      pepResults = builder.pepResults;
      verifiedPerson = builder.verifiedPerson;
      message = builder.message;
      report = builder.report;
  }

      /**
      * Reference identifying the current request. May be used for tracing
      * @return bisnodeReference
      **/
      public String getBisnodeReference() {return bisnodeReference;}

      /**
      * List of all Sanction items with match for the input request.
      * @return sanctionResults
      **/
      public List<PersonSanctionResult> getSanctionResults() {return sanctionResults;}

      /**
      * List of all PEP items with match for the input request.
      * @return pepResults
      **/
      public List<PepResult> getPepResults() {return pepResults;}

      /**
      * Data retrieved before the actual screening (data enhancement).
      * @return verifiedPerson
      **/
      public VerifiedPerson getVerifiedPerson() {return verifiedPerson;}

      /**
      * Response message could for example be: No result from PEP and/or SANCTION screening.
      * @return message
      **/
      public String getMessage() {return message;}

      /**
      * Reference to downloadable PDF report (if includeReport is set to true in request)
      * @return report
      **/
      public String getReport() {return report;}


  public static final class Builder {
      private String bisnodeReference;
      private List<PersonSanctionResult> sanctionResults;
      private List<PepResult> pepResults;
      private VerifiedPerson verifiedPerson;
      private String message;
      private String report;

    public Builder() {
    }

    public Builder(PersonAmlResponse copy) {
        this.bisnodeReference = copy.getBisnodeReference();
        this.sanctionResults = copy.getSanctionResults();
        this.pepResults = copy.getPepResults();
        this.verifiedPerson = copy.getVerifiedPerson();
        this.message = copy.getMessage();
        this.report = copy.getReport();
    }

    public Builder withBisnodeReference(String bisnodeReference) {
      this.bisnodeReference = bisnodeReference;
      return this;
    }

    public Builder withSanctionResults(List<PersonSanctionResult> sanctionResults) {
      this.sanctionResults = sanctionResults;
      return this;
    }

    public Builder addSanctionResultsItem(PersonSanctionResult sanctionResultsItem) {
      if (this.sanctionResults == null) {
        this.sanctionResults = new ArrayList<>();
      }
      this.sanctionResults.add(sanctionResultsItem);
      return this;
    }

    public Builder withPepResults(List<PepResult> pepResults) {
      this.pepResults = pepResults;
      return this;
    }

    public Builder addPepResultsItem(PepResult pepResultsItem) {
      if (this.pepResults == null) {
        this.pepResults = new ArrayList<>();
      }
      this.pepResults.add(pepResultsItem);
      return this;
    }

    public Builder withVerifiedPerson(VerifiedPerson verifiedPerson) {
      this.verifiedPerson = verifiedPerson;
      return this;
    }

    public Builder withMessage(String message) {
      this.message = message;
      return this;
    }

    public Builder withReport(String report) {
      this.report = report;
      return this;
    }


    public PersonAmlResponse build() { return new PersonAmlResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonAmlResponse personAmlResponse = (PersonAmlResponse) o;
    return Objects.equals(this.bisnodeReference, personAmlResponse.bisnodeReference) &&
        Objects.equals(this.sanctionResults, personAmlResponse.sanctionResults) &&
        Objects.equals(this.pepResults, personAmlResponse.pepResults) &&
        Objects.equals(this.verifiedPerson, personAmlResponse.verifiedPerson) &&
        Objects.equals(this.message, personAmlResponse.message) &&
        Objects.equals(this.report, personAmlResponse.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bisnodeReference, sanctionResults, pepResults, verifiedPerson, message, report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonAmlResponse {\n");
    
    sb.append("    bisnodeReference: ").append(toIndentedString(bisnodeReference)).append("\n");
    sb.append("    sanctionResults: ").append(toIndentedString(sanctionResults)).append("\n");
    sb.append("    pepResults: ").append(toIndentedString(pepResults)).append("\n");
    sb.append("    verifiedPerson: ").append(toIndentedString(verifiedPerson)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
