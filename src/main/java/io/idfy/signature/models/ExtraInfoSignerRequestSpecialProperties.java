/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.signature.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * A set of key-value pairs with special properties, see documentation for more information.
 */
@JsonDeserialize(builder = ExtraInfoSignerRequestSpecialProperties.Builder.class)
public class ExtraInfoSignerRequestSpecialProperties  implements Serializable {
  private final String bisnodeUsername;  // Default value is: null

  private final String bisnodePassword;  // Default value is: null

  private final String includePdfReports;  // Default value is: null

  private final String officialUsername;  // Default value is: null

  private final String officialPassword;  // Default value is: null

  private final String officialReason;  // Default value is: null

  private final String officialSystem;  // Default value is: null

  private final String amlNationality;  // Default value is: null

  private final String amlLanguage;  // Default value is: null

  private final String amlMode;  // Default value is: null

  private ExtraInfoSignerRequestSpecialProperties(Builder builder) {
      bisnodeUsername = builder.bisnodeUsername;
      bisnodePassword = builder.bisnodePassword;
      includePdfReports = builder.includePdfReports;
      officialUsername = builder.officialUsername;
      officialPassword = builder.officialPassword;
      officialReason = builder.officialReason;
      officialSystem = builder.officialSystem;
      amlNationality = builder.amlNationality;
      amlLanguage = builder.amlLanguage;
      amlMode = builder.amlMode;
  }

      /**
      * Get bisnodeUsername
      * @return bisnodeUsername
      **/
      public String getBisnodeUsername() {return bisnodeUsername;}

      /**
      * Get bisnodePassword
      * @return bisnodePassword
      **/
      public String getBisnodePassword() {return bisnodePassword;}

      /**
      * Get includePdfReports
      * @return includePdfReports
      **/
      public String getIncludePdfReports() {return includePdfReports;}

      /**
      * Get officialUsername
      * @return officialUsername
      **/
      public String getOfficialUsername() {return officialUsername;}

      /**
      * Get officialPassword
      * @return officialPassword
      **/
      public String getOfficialPassword() {return officialPassword;}

      /**
      * Get officialReason
      * @return officialReason
      **/
      public String getOfficialReason() {return officialReason;}

      /**
      * Get officialSystem
      * @return officialSystem
      **/
      public String getOfficialSystem() {return officialSystem;}

      /**
      * Get amlNationality
      * @return amlNationality
      **/
      public String getAmlNationality() {return amlNationality;}

      /**
      * Get amlLanguage
      * @return amlLanguage
      **/
      public String getAmlLanguage() {return amlLanguage;}

      /**
      * Get amlMode
      * @return amlMode
      **/
      public String getAmlMode() {return amlMode;}


  public static final class Builder {
      private String bisnodeUsername;
      private String bisnodePassword;
      private String includePdfReports;
      private String officialUsername;
      private String officialPassword;
      private String officialReason;
      private String officialSystem;
      private String amlNationality;
      private String amlLanguage;
      private String amlMode;

    public Builder() {
    }

    public Builder(ExtraInfoSignerRequestSpecialProperties copy) {
        this.bisnodeUsername = copy.getBisnodeUsername();
        this.bisnodePassword = copy.getBisnodePassword();
        this.includePdfReports = copy.getIncludePdfReports();
        this.officialUsername = copy.getOfficialUsername();
        this.officialPassword = copy.getOfficialPassword();
        this.officialReason = copy.getOfficialReason();
        this.officialSystem = copy.getOfficialSystem();
        this.amlNationality = copy.getAmlNationality();
        this.amlLanguage = copy.getAmlLanguage();
        this.amlMode = copy.getAmlMode();
    }

    public Builder withBisnodeUsername(String bisnodeUsername) {
      this.bisnodeUsername = bisnodeUsername;
      return this;
    }

    public Builder withBisnodePassword(String bisnodePassword) {
      this.bisnodePassword = bisnodePassword;
      return this;
    }

    public Builder withIncludePdfReports(String includePdfReports) {
      this.includePdfReports = includePdfReports;
      return this;
    }

    public Builder withOfficialUsername(String officialUsername) {
      this.officialUsername = officialUsername;
      return this;
    }

    public Builder withOfficialPassword(String officialPassword) {
      this.officialPassword = officialPassword;
      return this;
    }

    public Builder withOfficialReason(String officialReason) {
      this.officialReason = officialReason;
      return this;
    }

    public Builder withOfficialSystem(String officialSystem) {
      this.officialSystem = officialSystem;
      return this;
    }

    public Builder withAmlNationality(String amlNationality) {
      this.amlNationality = amlNationality;
      return this;
    }

    public Builder withAmlLanguage(String amlLanguage) {
      this.amlLanguage = amlLanguage;
      return this;
    }

    public Builder withAmlMode(String amlMode) {
      this.amlMode = amlMode;
      return this;
    }


    public ExtraInfoSignerRequestSpecialProperties build() { return new ExtraInfoSignerRequestSpecialProperties(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraInfoSignerRequestSpecialProperties extraInfoSignerRequestSpecialProperties = (ExtraInfoSignerRequestSpecialProperties) o;
    return Objects.equals(this.bisnodeUsername, extraInfoSignerRequestSpecialProperties.bisnodeUsername) &&
        Objects.equals(this.bisnodePassword, extraInfoSignerRequestSpecialProperties.bisnodePassword) &&
        Objects.equals(this.includePdfReports, extraInfoSignerRequestSpecialProperties.includePdfReports) &&
        Objects.equals(this.officialUsername, extraInfoSignerRequestSpecialProperties.officialUsername) &&
        Objects.equals(this.officialPassword, extraInfoSignerRequestSpecialProperties.officialPassword) &&
        Objects.equals(this.officialReason, extraInfoSignerRequestSpecialProperties.officialReason) &&
        Objects.equals(this.officialSystem, extraInfoSignerRequestSpecialProperties.officialSystem) &&
        Objects.equals(this.amlNationality, extraInfoSignerRequestSpecialProperties.amlNationality) &&
        Objects.equals(this.amlLanguage, extraInfoSignerRequestSpecialProperties.amlLanguage) &&
        Objects.equals(this.amlMode, extraInfoSignerRequestSpecialProperties.amlMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bisnodeUsername, bisnodePassword, includePdfReports, officialUsername, officialPassword, officialReason, officialSystem, amlNationality, amlLanguage, amlMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraInfoSignerRequestSpecialProperties {\n");
    
    sb.append("    bisnodeUsername: ").append(toIndentedString(bisnodeUsername)).append("\n");
    sb.append("    bisnodePassword: ").append(toIndentedString(bisnodePassword)).append("\n");
    sb.append("    includePdfReports: ").append(toIndentedString(includePdfReports)).append("\n");
    sb.append("    officialUsername: ").append(toIndentedString(officialUsername)).append("\n");
    sb.append("    officialPassword: ").append(toIndentedString(officialPassword)).append("\n");
    sb.append("    officialReason: ").append(toIndentedString(officialReason)).append("\n");
    sb.append("    officialSystem: ").append(toIndentedString(officialSystem)).append("\n");
    sb.append("    amlNationality: ").append(toIndentedString(amlNationality)).append("\n");
    sb.append("    amlLanguage: ").append(toIndentedString(amlLanguage)).append("\n");
    sb.append("    amlMode: ").append(toIndentedString(amlMode)).append("\n");
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
