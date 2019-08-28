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
 * The signer&#39;s organization info.
 */
@JsonDeserialize(builder = OrganizationInfo.Builder.class)
public class OrganizationInfo  implements Serializable {
  private final String orgNo;  // Default value is: null

  private final String companyName;  // Default value is: null

  private final String countryCode;  // Default value is: null

  private OrganizationInfo(Builder builder) {
      orgNo = builder.orgNo;
      companyName = builder.companyName;
      countryCode = builder.countryCode;
  }

      /**
      * Get orgNo
      * @return orgNo
      **/
      public String getOrgNo() {return orgNo;}

      /**
      * Get companyName
      * @return companyName
      **/
      public String getCompanyName() {return companyName;}

      /**
      * Get countryCode
      * @return countryCode
      **/
      public String getCountryCode() {return countryCode;}


  public static final class Builder {
      private String orgNo;
      private String companyName;
      private String countryCode;

    public Builder() {
    }

    public Builder(OrganizationInfo copy) {
        this.orgNo = copy.getOrgNo();
        this.companyName = copy.getCompanyName();
        this.countryCode = copy.getCountryCode();
    }

    public Builder withOrgNo(String orgNo) {
      this.orgNo = orgNo;
      return this;
    }

    public Builder withCompanyName(String companyName) {
      this.companyName = companyName;
      return this;
    }

    public Builder withCountryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }


    public OrganizationInfo build() { return new OrganizationInfo(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationInfo organizationInfo = (OrganizationInfo) o;
    return Objects.equals(this.orgNo, organizationInfo.orgNo) &&
        Objects.equals(this.companyName, organizationInfo.companyName) &&
        Objects.equals(this.countryCode, organizationInfo.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgNo, companyName, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationInfo {\n");
    
    sb.append("    orgNo: ").append(toIndentedString(orgNo)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
