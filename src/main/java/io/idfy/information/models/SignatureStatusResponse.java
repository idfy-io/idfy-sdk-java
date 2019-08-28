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
import io.idfy.information.models.OrganizationResponse;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * SignatureStatusResponse
 */
@JsonDeserialize(builder = SignatureStatusResponse.Builder.class)
public class SignatureStatusResponse  implements Serializable {
  private final String requestId;  // Default value is: null

  private final List<OrganizationResponse> organizations;  // Default value is: new ArrayList<>()

  private SignatureStatusResponse(Builder builder) {
      requestId = builder.requestId;
      organizations = builder.organizations;
  }

      /**
      * Get requestId
      * @return requestId
      **/
      public String getRequestId() {return requestId;}

      /**
      * Get organizations
      * @return organizations
      **/
      public List<OrganizationResponse> getOrganizations() {return organizations;}


  public static final class Builder {
      private String requestId;
      private List<OrganizationResponse> organizations;

    public Builder() {
    }

    public Builder(SignatureStatusResponse copy) {
        this.requestId = copy.getRequestId();
        this.organizations = copy.getOrganizations();
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public Builder withOrganizations(List<OrganizationResponse> organizations) {
      this.organizations = organizations;
      return this;
    }

    public Builder addOrganizationsItem(OrganizationResponse organizationsItem) {
      if (this.organizations == null) {
        this.organizations = new ArrayList<>();
      }
      this.organizations.add(organizationsItem);
      return this;
    }


    public SignatureStatusResponse build() { return new SignatureStatusResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureStatusResponse signatureStatusResponse = (SignatureStatusResponse) o;
    return Objects.equals(this.requestId, signatureStatusResponse.requestId) &&
        Objects.equals(this.organizations, signatureStatusResponse.organizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, organizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureStatusResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
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
