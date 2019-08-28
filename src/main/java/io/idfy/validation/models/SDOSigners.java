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
 * SDOSigners
 */
@JsonDeserialize(builder = SDOSigners.Builder.class)
public class SDOSigners  implements Serializable {
  private final Certificate certificate;  // Default value is: null

  private final String name;  // Default value is: null

  private final OffsetDateTime dateOfBirth;  // Default value is: null

  private final String pid;  // Default value is: null

  private final String ssn;  // Default value is: null

  private final OffsetDateTime signedTimestamp;  // Default value is: null

  private final Boolean valid;  // Default value is: null

  private final String ocsp;  // Default value is: null

  private final String environment;  // Default value is: null

  private SDOSigners(Builder builder) {
      certificate = builder.certificate;
      name = builder.name;
      dateOfBirth = builder.dateOfBirth;
      pid = builder.pid;
      ssn = builder.ssn;
      signedTimestamp = builder.signedTimestamp;
      valid = builder.valid;
      ocsp = builder.ocsp;
      environment = builder.environment;
  }

      /**
      * Get certificate
      * @return certificate
      **/
      public Certificate getCertificate() {return certificate;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get dateOfBirth
      * @return dateOfBirth
      **/
      public OffsetDateTime getDateOfBirth() {return dateOfBirth;}

      /**
      * Get pid
      * @return pid
      **/
      public String getPid() {return pid;}

      /**
      * Get ssn
      * @return ssn
      **/
      public String getSsn() {return ssn;}

      /**
      * Get signedTimestamp
      * @return signedTimestamp
      **/
      public OffsetDateTime getSignedTimestamp() {return signedTimestamp;}

      /**
      * Get valid
      * @return valid
      **/
      public Boolean getValid() {return valid;}

      /**
      * Get ocsp
      * @return ocsp
      **/
      public String getOcsp() {return ocsp;}

      /**
      * Get environment
      * @return environment
      **/
      public String getEnvironment() {return environment;}


  public static final class Builder {
      private Certificate certificate;
      private String name;
      private OffsetDateTime dateOfBirth;
      private String pid;
      private String ssn;
      private OffsetDateTime signedTimestamp;
      private Boolean valid;
      private String ocsp;
      private String environment;

    public Builder() {
    }

    public Builder(SDOSigners copy) {
        this.certificate = copy.getCertificate();
        this.name = copy.getName();
        this.dateOfBirth = copy.getDateOfBirth();
        this.pid = copy.getPid();
        this.ssn = copy.getSsn();
        this.signedTimestamp = copy.getSignedTimestamp();
        this.valid = copy.getValid();
        this.ocsp = copy.getOcsp();
        this.environment = copy.getEnvironment();
    }

    public Builder withCertificate(Certificate certificate) {
      this.certificate = certificate;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withDateOfBirth(OffsetDateTime dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder withPid(String pid) {
      this.pid = pid;
      return this;
    }

    public Builder withSsn(String ssn) {
      this.ssn = ssn;
      return this;
    }

    public Builder withSignedTimestamp(OffsetDateTime signedTimestamp) {
      this.signedTimestamp = signedTimestamp;
      return this;
    }

    public Builder withValid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    public Builder withOcsp(String ocsp) {
      this.ocsp = ocsp;
      return this;
    }

    public Builder withEnvironment(String environment) {
      this.environment = environment;
      return this;
    }


    public SDOSigners build() { return new SDOSigners(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDOSigners sdOSigners = (SDOSigners) o;
    return Objects.equals(this.certificate, sdOSigners.certificate) &&
        Objects.equals(this.name, sdOSigners.name) &&
        Objects.equals(this.dateOfBirth, sdOSigners.dateOfBirth) &&
        Objects.equals(this.pid, sdOSigners.pid) &&
        Objects.equals(this.ssn, sdOSigners.ssn) &&
        Objects.equals(this.signedTimestamp, sdOSigners.signedTimestamp) &&
        Objects.equals(this.valid, sdOSigners.valid) &&
        Objects.equals(this.ocsp, sdOSigners.ocsp) &&
        Objects.equals(this.environment, sdOSigners.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, name, dateOfBirth, pid, ssn, signedTimestamp, valid, ocsp, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDOSigners {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    signedTimestamp: ").append(toIndentedString(signedTimestamp)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    ocsp: ").append(toIndentedString(ocsp)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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
