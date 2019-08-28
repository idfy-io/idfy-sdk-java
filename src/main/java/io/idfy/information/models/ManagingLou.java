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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * ManagingLou
 */
@JsonDeserialize(builder = ManagingLou.Builder.class)
public class ManagingLou  implements Serializable {
  private final String lei;  // Default value is: null

  private final String prefix;  // Default value is: null

  private final String name;  // Default value is: null

  private final String website;  // Default value is: null

  private final String operational;  // Default value is: null

  private final OffsetDateTime endorsementDate;  // Default value is: null

  private final String sponsor;  // Default value is: null

  private final String sponsorCountry;  // Default value is: null

  private ManagingLou(Builder builder) {
      lei = builder.lei;
      prefix = builder.prefix;
      name = builder.name;
      website = builder.website;
      operational = builder.operational;
      endorsementDate = builder.endorsementDate;
      sponsor = builder.sponsor;
      sponsorCountry = builder.sponsorCountry;
  }

      /**
      * Get lei
      * @return lei
      **/
      public String getLei() {return lei;}

      /**
      * Get prefix
      * @return prefix
      **/
      public String getPrefix() {return prefix;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get website
      * @return website
      **/
      public String getWebsite() {return website;}

      /**
      * Get operational
      * @return operational
      **/
      public String getOperational() {return operational;}

      /**
      * Get endorsementDate
      * @return endorsementDate
      **/
      public OffsetDateTime getEndorsementDate() {return endorsementDate;}

      /**
      * Get sponsor
      * @return sponsor
      **/
      public String getSponsor() {return sponsor;}

      /**
      * Get sponsorCountry
      * @return sponsorCountry
      **/
      public String getSponsorCountry() {return sponsorCountry;}


  public static final class Builder {
      private String lei;
      private String prefix;
      private String name;
      private String website;
      private String operational;
      private OffsetDateTime endorsementDate;
      private String sponsor;
      private String sponsorCountry;

    public Builder() {
    }

    public Builder(ManagingLou copy) {
        this.lei = copy.getLei();
        this.prefix = copy.getPrefix();
        this.name = copy.getName();
        this.website = copy.getWebsite();
        this.operational = copy.getOperational();
        this.endorsementDate = copy.getEndorsementDate();
        this.sponsor = copy.getSponsor();
        this.sponsorCountry = copy.getSponsorCountry();
    }

    public Builder withLei(String lei) {
      this.lei = lei;
      return this;
    }

    public Builder withPrefix(String prefix) {
      this.prefix = prefix;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withWebsite(String website) {
      this.website = website;
      return this;
    }

    public Builder withOperational(String operational) {
      this.operational = operational;
      return this;
    }

    public Builder withEndorsementDate(OffsetDateTime endorsementDate) {
      this.endorsementDate = endorsementDate;
      return this;
    }

    public Builder withSponsor(String sponsor) {
      this.sponsor = sponsor;
      return this;
    }

    public Builder withSponsorCountry(String sponsorCountry) {
      this.sponsorCountry = sponsorCountry;
      return this;
    }


    public ManagingLou build() { return new ManagingLou(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagingLou managingLou = (ManagingLou) o;
    return Objects.equals(this.lei, managingLou.lei) &&
        Objects.equals(this.prefix, managingLou.prefix) &&
        Objects.equals(this.name, managingLou.name) &&
        Objects.equals(this.website, managingLou.website) &&
        Objects.equals(this.operational, managingLou.operational) &&
        Objects.equals(this.endorsementDate, managingLou.endorsementDate) &&
        Objects.equals(this.sponsor, managingLou.sponsor) &&
        Objects.equals(this.sponsorCountry, managingLou.sponsorCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lei, prefix, name, website, operational, endorsementDate, sponsor, sponsorCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagingLou {\n");
    
    sb.append("    lei: ").append(toIndentedString(lei)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    operational: ").append(toIndentedString(operational)).append("\n");
    sb.append("    endorsementDate: ").append(toIndentedString(endorsementDate)).append("\n");
    sb.append("    sponsor: ").append(toIndentedString(sponsor)).append("\n");
    sb.append("    sponsorCountry: ").append(toIndentedString(sponsorCountry)).append("\n");
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
