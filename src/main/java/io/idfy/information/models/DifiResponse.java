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
import io.idfy.information.models.CompanyInfoDifiResponse;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * DifiResponse
 */
@JsonDeserialize(builder = DifiResponse.Builder.class)
public class DifiResponse  implements Serializable {
  private final List<CompanyInfoDifiResponse> organizations;  // Default value is: new ArrayList<>()

  private final String rawData;  // Default value is: null

  private final String requestId;  // Default value is: null

  private DifiResponse(Builder builder) {
      organizations = builder.organizations;
      rawData = builder.rawData;
      requestId = builder.requestId;
  }

      /**
      * Get organizations
      * @return organizations
      **/
      public List<CompanyInfoDifiResponse> getOrganizations() {return organizations;}

      /**
      * Get rawData
      * @return rawData
      **/
      public String getRawData() {return rawData;}

      /**
      * Get requestId
      * @return requestId
      **/
      public String getRequestId() {return requestId;}


  public static final class Builder {
      private List<CompanyInfoDifiResponse> organizations;
      private String rawData;
      private String requestId;

    public Builder() {
    }

    public Builder(DifiResponse copy) {
        this.organizations = copy.getOrganizations();
        this.rawData = copy.getRawData();
        this.requestId = copy.getRequestId();
    }

    public Builder withOrganizations(List<CompanyInfoDifiResponse> organizations) {
      this.organizations = organizations;
      return this;
    }

    public Builder addOrganizationsItem(CompanyInfoDifiResponse organizationsItem) {
      if (this.organizations == null) {
        this.organizations = new ArrayList<>();
      }
      this.organizations.add(organizationsItem);
      return this;
    }

    public Builder withRawData(String rawData) {
      this.rawData = rawData;
      return this;
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }


    public DifiResponse build() { return new DifiResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DifiResponse difiResponse = (DifiResponse) o;
    return Objects.equals(this.organizations, difiResponse.organizations) &&
        Objects.equals(this.rawData, difiResponse.rawData) &&
        Objects.equals(this.requestId, difiResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizations, rawData, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DifiResponse {\n");
    
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
