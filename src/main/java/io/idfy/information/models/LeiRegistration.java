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
import io.idfy.information.models.ManagingLou;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * LeiRegistration
 */
@JsonDeserialize(builder = LeiRegistration.Builder.class)
public class LeiRegistration  implements Serializable {
  private final OffsetDateTime initialRegistrationDate;  // Default value is: null

  private final String registrationStatus;  // Default value is: null

  private final String validationSources;  // Default value is: null

  private final OffsetDateTime lastUpdateDate;  // Default value is: null

  private final OffsetDateTime nextRenewalDate;  // Default value is: null

  private final ManagingLou managingLou;  // Default value is: null

  private LeiRegistration(Builder builder) {
      initialRegistrationDate = builder.initialRegistrationDate;
      registrationStatus = builder.registrationStatus;
      validationSources = builder.validationSources;
      lastUpdateDate = builder.lastUpdateDate;
      nextRenewalDate = builder.nextRenewalDate;
      managingLou = builder.managingLou;
  }

      /**
      * Get initialRegistrationDate
      * @return initialRegistrationDate
      **/
      public OffsetDateTime getInitialRegistrationDate() {return initialRegistrationDate;}

      /**
      * Get registrationStatus
      * @return registrationStatus
      **/
      public String getRegistrationStatus() {return registrationStatus;}

      /**
      * Get validationSources
      * @return validationSources
      **/
      public String getValidationSources() {return validationSources;}

      /**
      * Get lastUpdateDate
      * @return lastUpdateDate
      **/
      public OffsetDateTime getLastUpdateDate() {return lastUpdateDate;}

      /**
      * Get nextRenewalDate
      * @return nextRenewalDate
      **/
      public OffsetDateTime getNextRenewalDate() {return nextRenewalDate;}

      /**
      * Get managingLou
      * @return managingLou
      **/
      public ManagingLou getManagingLou() {return managingLou;}


  public static final class Builder {
      private OffsetDateTime initialRegistrationDate;
      private String registrationStatus;
      private String validationSources;
      private OffsetDateTime lastUpdateDate;
      private OffsetDateTime nextRenewalDate;
      private ManagingLou managingLou;

    public Builder() {
    }

    public Builder(LeiRegistration copy) {
        this.initialRegistrationDate = copy.getInitialRegistrationDate();
        this.registrationStatus = copy.getRegistrationStatus();
        this.validationSources = copy.getValidationSources();
        this.lastUpdateDate = copy.getLastUpdateDate();
        this.nextRenewalDate = copy.getNextRenewalDate();
        this.managingLou = copy.getManagingLou();
    }

    public Builder withInitialRegistrationDate(OffsetDateTime initialRegistrationDate) {
      this.initialRegistrationDate = initialRegistrationDate;
      return this;
    }

    public Builder withRegistrationStatus(String registrationStatus) {
      this.registrationStatus = registrationStatus;
      return this;
    }

    public Builder withValidationSources(String validationSources) {
      this.validationSources = validationSources;
      return this;
    }

    public Builder withLastUpdateDate(OffsetDateTime lastUpdateDate) {
      this.lastUpdateDate = lastUpdateDate;
      return this;
    }

    public Builder withNextRenewalDate(OffsetDateTime nextRenewalDate) {
      this.nextRenewalDate = nextRenewalDate;
      return this;
    }

    public Builder withManagingLou(ManagingLou managingLou) {
      this.managingLou = managingLou;
      return this;
    }


    public LeiRegistration build() { return new LeiRegistration(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeiRegistration leiRegistration = (LeiRegistration) o;
    return Objects.equals(this.initialRegistrationDate, leiRegistration.initialRegistrationDate) &&
        Objects.equals(this.registrationStatus, leiRegistration.registrationStatus) &&
        Objects.equals(this.validationSources, leiRegistration.validationSources) &&
        Objects.equals(this.lastUpdateDate, leiRegistration.lastUpdateDate) &&
        Objects.equals(this.nextRenewalDate, leiRegistration.nextRenewalDate) &&
        Objects.equals(this.managingLou, leiRegistration.managingLou);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialRegistrationDate, registrationStatus, validationSources, lastUpdateDate, nextRenewalDate, managingLou);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeiRegistration {\n");
    
    sb.append("    initialRegistrationDate: ").append(toIndentedString(initialRegistrationDate)).append("\n");
    sb.append("    registrationStatus: ").append(toIndentedString(registrationStatus)).append("\n");
    sb.append("    validationSources: ").append(toIndentedString(validationSources)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    nextRenewalDate: ").append(toIndentedString(nextRenewalDate)).append("\n");
    sb.append("    managingLou: ").append(toIndentedString(managingLou)).append("\n");
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
