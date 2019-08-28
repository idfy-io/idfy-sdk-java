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
import io.idfy.validation.models.Signers;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * ValidateSDORequest
 */
@JsonDeserialize(builder = ValidateSDORequest.Builder.class)
public class ValidateSDORequest  implements Serializable {
  /**
   * Base 64 encoded SDO (Signed document)
   */
  private final String sdoData;  // Default value is: null

  /**
   * The service reference for the signing. Will be used for auditlog, and invoicing
   */
  private final String externalReference;  // Default value is: null

  /**
   * Check that the original data matches the sdo data (optional, base64 encoded)
   */
  private final String dataToValidate;  // Default value is: null

  /**
   * Add signers to validate (optional)
   */
  private final List<Signers> signersToValidate;  // Default value is: new ArrayList<>()

  private ValidateSDORequest(Builder builder) {
      sdoData = builder.sdoData;
      externalReference = builder.externalReference;
      dataToValidate = builder.dataToValidate;
      signersToValidate = builder.signersToValidate;
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
      * Check that the original data matches the sdo data (optional, base64 encoded)
      * @return dataToValidate
      **/
      public String getDataToValidate() {return dataToValidate;}

      /**
      * Add signers to validate (optional)
      * @return signersToValidate
      **/
      public List<Signers> getSignersToValidate() {return signersToValidate;}


  public static final class Builder {
      private String sdoData;
      private String externalReference;
      private String dataToValidate;
      private List<Signers> signersToValidate;

    public Builder() {
    }

    public Builder(ValidateSDORequest copy) {
        this.sdoData = copy.getSdoData();
        this.externalReference = copy.getExternalReference();
        this.dataToValidate = copy.getDataToValidate();
        this.signersToValidate = copy.getSignersToValidate();
    }

    public Builder withSdoData(String sdoData) {
      this.sdoData = sdoData;
      return this;
    }

    public Builder withExternalReference(String externalReference) {
      this.externalReference = externalReference;
      return this;
    }

    public Builder withDataToValidate(String dataToValidate) {
      this.dataToValidate = dataToValidate;
      return this;
    }

    public Builder withSignersToValidate(List<Signers> signersToValidate) {
      this.signersToValidate = signersToValidate;
      return this;
    }

    public Builder addSignersToValidateItem(Signers signersToValidateItem) {
      if (this.signersToValidate == null) {
        this.signersToValidate = new ArrayList<>();
      }
      this.signersToValidate.add(signersToValidateItem);
      return this;
    }


    public ValidateSDORequest build() { return new ValidateSDORequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateSDORequest validateSDORequest = (ValidateSDORequest) o;
    return Objects.equals(this.sdoData, validateSDORequest.sdoData) &&
        Objects.equals(this.externalReference, validateSDORequest.externalReference) &&
        Objects.equals(this.dataToValidate, validateSDORequest.dataToValidate) &&
        Objects.equals(this.signersToValidate, validateSDORequest.signersToValidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdoData, externalReference, dataToValidate, signersToValidate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateSDORequest {\n");
    
    sb.append("    sdoData: ").append(toIndentedString(sdoData)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    dataToValidate: ").append(toIndentedString(dataToValidate)).append("\n");
    sb.append("    signersToValidate: ").append(toIndentedString(signersToValidate)).append("\n");
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
