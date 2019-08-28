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
import io.idfy.validation.models.SDOSigners;
import io.idfy.validation.models.Seal;
import io.idfy.validation.models.ValidationError;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * ParseSDOResponse
 */
@JsonDeserialize(builder = ParseSDOResponse.Builder.class)
public class ParseSDOResponse  implements Serializable {
  private final String requestId;  // Default value is: null

  /**
   * Reference to audit log
   */
  private final UUID auditId;  // Default value is: null

  /**
   * Is the signatures valid
   */
  private final Boolean signersValid;  // Default value is: null

  /**
   * Is the sealing of the SDO valid
   */
  private final Seal seal;  // Default value is: null

  /**
   * Signers list
   */
  private final List<SDOSigners> signers;  // Default value is: new ArrayList<>()

  /**
   * Summary
   */
  private final String summary;  // Default value is: null

  /**
   * Error messages
   */
  private final ValidationError validationError;  // Default value is: null

  /**
   * Original data from document (base64 string)
   */
  private final String signedData;  // Default value is: null

  private ParseSDOResponse(Builder builder) {
      requestId = builder.requestId;
      auditId = builder.auditId;
      signersValid = builder.signersValid;
      seal = builder.seal;
      signers = builder.signers;
      summary = builder.summary;
      validationError = builder.validationError;
      signedData = builder.signedData;
  }

      /**
      * Get requestId
      * @return requestId
      **/
      public String getRequestId() {return requestId;}

      /**
      * Reference to audit log
      * @return auditId
      **/
      public UUID getAuditId() {return auditId;}

      /**
      * Is the signatures valid
      * @return signersValid
      **/
      public Boolean getSignersValid() {return signersValid;}

      /**
      * Is the sealing of the SDO valid
      * @return seal
      **/
      public Seal getSeal() {return seal;}

      /**
      * Signers list
      * @return signers
      **/
      public List<SDOSigners> getSigners() {return signers;}

      /**
      * Summary
      * @return summary
      **/
      public String getSummary() {return summary;}

      /**
      * Error messages
      * @return validationError
      **/
      public ValidationError getValidationError() {return validationError;}

      /**
      * Original data from document (base64 string)
      * @return signedData
      **/
      public String getSignedData() {return signedData;}


  public static final class Builder {
      private String requestId;
      private UUID auditId;
      private Boolean signersValid;
      private Seal seal;
      private List<SDOSigners> signers;
      private String summary;
      private ValidationError validationError;
      private String signedData;

    public Builder() {
    }

    public Builder(ParseSDOResponse copy) {
        this.requestId = copy.getRequestId();
        this.auditId = copy.getAuditId();
        this.signersValid = copy.getSignersValid();
        this.seal = copy.getSeal();
        this.signers = copy.getSigners();
        this.summary = copy.getSummary();
        this.validationError = copy.getValidationError();
        this.signedData = copy.getSignedData();
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public Builder withAuditId(UUID auditId) {
      this.auditId = auditId;
      return this;
    }

    public Builder withSignersValid(Boolean signersValid) {
      this.signersValid = signersValid;
      return this;
    }

    public Builder withSeal(Seal seal) {
      this.seal = seal;
      return this;
    }

    public Builder withSigners(List<SDOSigners> signers) {
      this.signers = signers;
      return this;
    }

    public Builder addSignersItem(SDOSigners signersItem) {
      if (this.signers == null) {
        this.signers = new ArrayList<>();
      }
      this.signers.add(signersItem);
      return this;
    }

    public Builder withSummary(String summary) {
      this.summary = summary;
      return this;
    }

    public Builder withValidationError(ValidationError validationError) {
      this.validationError = validationError;
      return this;
    }

    public Builder withSignedData(String signedData) {
      this.signedData = signedData;
      return this;
    }


    public ParseSDOResponse build() { return new ParseSDOResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseSDOResponse parseSDOResponse = (ParseSDOResponse) o;
    return Objects.equals(this.requestId, parseSDOResponse.requestId) &&
        Objects.equals(this.auditId, parseSDOResponse.auditId) &&
        Objects.equals(this.signersValid, parseSDOResponse.signersValid) &&
        Objects.equals(this.seal, parseSDOResponse.seal) &&
        Objects.equals(this.signers, parseSDOResponse.signers) &&
        Objects.equals(this.summary, parseSDOResponse.summary) &&
        Objects.equals(this.validationError, parseSDOResponse.validationError) &&
        Objects.equals(this.signedData, parseSDOResponse.signedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, auditId, signersValid, seal, signers, summary, validationError, signedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseSDOResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    auditId: ").append(toIndentedString(auditId)).append("\n");
    sb.append("    signersValid: ").append(toIndentedString(signersValid)).append("\n");
    sb.append("    seal: ").append(toIndentedString(seal)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    validationError: ").append(toIndentedString(validationError)).append("\n");
    sb.append("    signedData: ").append(toIndentedString(signedData)).append("\n");
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
