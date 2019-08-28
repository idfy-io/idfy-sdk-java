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
import io.idfy.information.models.OrganizationRequest;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * SignatureCheckRequest
 */
@JsonDeserialize(builder = SignatureCheckRequest.Builder.class)
public class SignatureCheckRequest  implements Serializable {
  private final List<OrganizationRequest> organizations;  // Default value is: new ArrayList<>()

  private SignatureCheckRequest(Builder builder) {
      organizations = builder.organizations;
  }

      /**
      * Get organizations
      * @return organizations
      **/
      public List<OrganizationRequest> getOrganizations() {return organizations;}


  public static final class Builder {
      private List<OrganizationRequest> organizations;

    public Builder() {
    }

    public Builder(SignatureCheckRequest copy) {
        this.organizations = copy.getOrganizations();
    }

    public Builder withOrganizations(List<OrganizationRequest> organizations) {
      this.organizations = organizations;
      return this;
    }

    public Builder addOrganizationsItem(OrganizationRequest organizationsItem) {
      if (this.organizations == null) {
        this.organizations = new ArrayList<>();
      }
      this.organizations.add(organizationsItem);
      return this;
    }


    public SignatureCheckRequest build() { return new SignatureCheckRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureCheckRequest signatureCheckRequest = (SignatureCheckRequest) o;
    return Objects.equals(this.organizations, signatureCheckRequest.organizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureCheckRequest {\n");
    
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
