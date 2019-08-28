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
import io.idfy.information.models.CheckSignature;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * OrganizationRequest
 */
@JsonDeserialize(builder = OrganizationRequest.Builder.class)
public class OrganizationRequest  implements Serializable {
  private final String orgNumber;  // Default value is: null

  private final Boolean prokura;  // Default value is: null

  private final Boolean signature;  // Default value is: null

  private final List<CheckSignature> signatures;  // Default value is: new ArrayList<>()

  private OrganizationRequest(Builder builder) {
      orgNumber = builder.orgNumber;
      prokura = builder.prokura;
      signature = builder.signature;
      signatures = builder.signatures;
  }

      /**
      * Get orgNumber
      * @return orgNumber
      **/
      public String getOrgNumber() {return orgNumber;}

      /**
      * Get prokura
      * @return prokura
      **/
      public Boolean getProkura() {return prokura;}

      /**
      * Get signature
      * @return signature
      **/
      public Boolean getSignature() {return signature;}

      /**
      * Get signatures
      * @return signatures
      **/
      public List<CheckSignature> getSignatures() {return signatures;}


  public static final class Builder {
      private String orgNumber;
      private Boolean prokura;
      private Boolean signature;
      private List<CheckSignature> signatures;

    public Builder() {
    }

    public Builder(OrganizationRequest copy) {
        this.orgNumber = copy.getOrgNumber();
        this.prokura = copy.getProkura();
        this.signature = copy.getSignature();
        this.signatures = copy.getSignatures();
    }

    public Builder withOrgNumber(String orgNumber) {
      this.orgNumber = orgNumber;
      return this;
    }

    public Builder withProkura(Boolean prokura) {
      this.prokura = prokura;
      return this;
    }

    public Builder withSignature(Boolean signature) {
      this.signature = signature;
      return this;
    }

    public Builder withSignatures(List<CheckSignature> signatures) {
      this.signatures = signatures;
      return this;
    }

    public Builder addSignaturesItem(CheckSignature signaturesItem) {
      if (this.signatures == null) {
        this.signatures = new ArrayList<>();
      }
      this.signatures.add(signaturesItem);
      return this;
    }


    public OrganizationRequest build() { return new OrganizationRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationRequest organizationRequest = (OrganizationRequest) o;
    return Objects.equals(this.orgNumber, organizationRequest.orgNumber) &&
        Objects.equals(this.prokura, organizationRequest.prokura) &&
        Objects.equals(this.signature, organizationRequest.signature) &&
        Objects.equals(this.signatures, organizationRequest.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgNumber, prokura, signature, signatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationRequest {\n");
    
    sb.append("    orgNumber: ").append(toIndentedString(orgNumber)).append("\n");
    sb.append("    prokura: ").append(toIndentedString(prokura)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
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
