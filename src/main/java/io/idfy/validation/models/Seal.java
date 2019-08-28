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
import io.idfy.validation.models.Certificate;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Seal
 */
@JsonDeserialize(builder = Seal.Builder.class)
public class Seal  implements Serializable {
  private final String sealedBy;  // Default value is: null

  private final OffsetDateTime sealedTimestamp;  // Default value is: null

  private final Certificate certificate;  // Default value is: null

  private final Boolean sealValid;  // Default value is: null

  private Seal(Builder builder) {
      sealedBy = builder.sealedBy;
      sealedTimestamp = builder.sealedTimestamp;
      certificate = builder.certificate;
      sealValid = builder.sealValid;
  }

      /**
      * Get sealedBy
      * @return sealedBy
      **/
      public String getSealedBy() {return sealedBy;}

      /**
      * Get sealedTimestamp
      * @return sealedTimestamp
      **/
      public OffsetDateTime getSealedTimestamp() {return sealedTimestamp;}

      /**
      * Get certificate
      * @return certificate
      **/
      public Certificate getCertificate() {return certificate;}

      /**
      * Get sealValid
      * @return sealValid
      **/
      public Boolean getSealValid() {return sealValid;}


  public static final class Builder {
      private String sealedBy;
      private OffsetDateTime sealedTimestamp;
      private Certificate certificate;
      private Boolean sealValid;

    public Builder() {
    }

    public Builder(Seal copy) {
        this.sealedBy = copy.getSealedBy();
        this.sealedTimestamp = copy.getSealedTimestamp();
        this.certificate = copy.getCertificate();
        this.sealValid = copy.getSealValid();
    }

    public Builder withSealedBy(String sealedBy) {
      this.sealedBy = sealedBy;
      return this;
    }

    public Builder withSealedTimestamp(OffsetDateTime sealedTimestamp) {
      this.sealedTimestamp = sealedTimestamp;
      return this;
    }

    public Builder withCertificate(Certificate certificate) {
      this.certificate = certificate;
      return this;
    }

    public Builder withSealValid(Boolean sealValid) {
      this.sealValid = sealValid;
      return this;
    }


    public Seal build() { return new Seal(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Seal seal = (Seal) o;
    return Objects.equals(this.sealedBy, seal.sealedBy) &&
        Objects.equals(this.sealedTimestamp, seal.sealedTimestamp) &&
        Objects.equals(this.certificate, seal.certificate) &&
        Objects.equals(this.sealValid, seal.sealValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sealedBy, sealedTimestamp, certificate, sealValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seal {\n");
    
    sb.append("    sealedBy: ").append(toIndentedString(sealedBy)).append("\n");
    sb.append("    sealedTimestamp: ").append(toIndentedString(sealedTimestamp)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    sealValid: ").append(toIndentedString(sealValid)).append("\n");
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
