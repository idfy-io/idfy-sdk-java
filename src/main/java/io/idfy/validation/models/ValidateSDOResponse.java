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
import io.idfy.validation.models.Seal;
import io.idfy.validation.models.ValidatedSigners;
import io.idfy.validation.models.ValidationError;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * ValidateSDOResponse
 */
@JsonDeserialize(builder = ValidateSDOResponse.Builder.class)
public class ValidateSDOResponse  implements Serializable {
  private final String requestId;  // Default value is: null

  /**
   * Is the SDO valid
   */
  private final Boolean valid;  // Default value is: null

  /**
   * Is the Seal of the SDO valid
   */
  private final Seal seal;  // Default value is: null

  private final List<ValidatedSigners> signers;  // Default value is: new ArrayList<>()

  private final String summary;  // Default value is: null

  private final ValidationError validationError;  // Default value is: null

  /**
   * The AuditId vil only be set for users with an account on the API.
   */
  private final UUID auditId;  // Default value is: null

  private ValidateSDOResponse(Builder builder) {
      requestId = builder.requestId;
      valid = builder.valid;
      seal = builder.seal;
      signers = builder.signers;
      summary = builder.summary;
      validationError = builder.validationError;
      auditId = builder.auditId;
  }

      /**
      * Get requestId
      * @return requestId
      **/
      public String getRequestId() {return requestId;}

      /**
      * Is the SDO valid
      * @return valid
      **/
      public Boolean getValid() {return valid;}

      /**
      * Is the Seal of the SDO valid
      * @return seal
      **/
      public Seal getSeal() {return seal;}

      /**
      * Get signers
      * @return signers
      **/
      public List<ValidatedSigners> getSigners() {return signers;}

      /**
      * Get summary
      * @return summary
      **/
      public String getSummary() {return summary;}

      /**
      * Get validationError
      * @return validationError
      **/
      public ValidationError getValidationError() {return validationError;}

      /**
      * The AuditId vil only be set for users with an account on the API.
      * @return auditId
      **/
      public UUID getAuditId() {return auditId;}


  public static final class Builder {
      private String requestId;
      private Boolean valid;
      private Seal seal;
      private List<ValidatedSigners> signers;
      private String summary;
      private ValidationError validationError;
      private UUID auditId;

    public Builder() {
    }

    public Builder(ValidateSDOResponse copy) {
        this.requestId = copy.getRequestId();
        this.valid = copy.getValid();
        this.seal = copy.getSeal();
        this.signers = copy.getSigners();
        this.summary = copy.getSummary();
        this.validationError = copy.getValidationError();
        this.auditId = copy.getAuditId();
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public Builder withValid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    public Builder withSeal(Seal seal) {
      this.seal = seal;
      return this;
    }

    public Builder withSigners(List<ValidatedSigners> signers) {
      this.signers = signers;
      return this;
    }

    public Builder addSignersItem(ValidatedSigners signersItem) {
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

    public Builder withAuditId(UUID auditId) {
      this.auditId = auditId;
      return this;
    }


    public ValidateSDOResponse build() { return new ValidateSDOResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateSDOResponse validateSDOResponse = (ValidateSDOResponse) o;
    return Objects.equals(this.requestId, validateSDOResponse.requestId) &&
        Objects.equals(this.valid, validateSDOResponse.valid) &&
        Objects.equals(this.seal, validateSDOResponse.seal) &&
        Objects.equals(this.signers, validateSDOResponse.signers) &&
        Objects.equals(this.summary, validateSDOResponse.summary) &&
        Objects.equals(this.validationError, validateSDOResponse.validationError) &&
        Objects.equals(this.auditId, validateSDOResponse.auditId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, valid, seal, signers, summary, validationError, auditId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateSDOResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    seal: ").append(toIndentedString(seal)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    validationError: ").append(toIndentedString(validationError)).append("\n");
    sb.append("    auditId: ").append(toIndentedString(auditId)).append("\n");
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
