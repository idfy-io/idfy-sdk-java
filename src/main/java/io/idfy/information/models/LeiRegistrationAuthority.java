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
import java.io.Serializable;

/**
 * LeiRegistrationAuthority
 */
@JsonDeserialize(builder = LeiRegistrationAuthority.Builder.class)
public class LeiRegistrationAuthority  implements Serializable {
  private final String registrationAuthorityId;  // Default value is: null

  private final String registrationAuthorityEntityId;  // Default value is: null

  private LeiRegistrationAuthority(Builder builder) {
      registrationAuthorityId = builder.registrationAuthorityId;
      registrationAuthorityEntityId = builder.registrationAuthorityEntityId;
  }

      /**
      * Get registrationAuthorityId
      * @return registrationAuthorityId
      **/
      public String getRegistrationAuthorityId() {return registrationAuthorityId;}

      /**
      * Get registrationAuthorityEntityId
      * @return registrationAuthorityEntityId
      **/
      public String getRegistrationAuthorityEntityId() {return registrationAuthorityEntityId;}


  public static final class Builder {
      private String registrationAuthorityId;
      private String registrationAuthorityEntityId;

    public Builder() {
    }

    public Builder(LeiRegistrationAuthority copy) {
        this.registrationAuthorityId = copy.getRegistrationAuthorityId();
        this.registrationAuthorityEntityId = copy.getRegistrationAuthorityEntityId();
    }

    public Builder withRegistrationAuthorityId(String registrationAuthorityId) {
      this.registrationAuthorityId = registrationAuthorityId;
      return this;
    }

    public Builder withRegistrationAuthorityEntityId(String registrationAuthorityEntityId) {
      this.registrationAuthorityEntityId = registrationAuthorityEntityId;
      return this;
    }


    public LeiRegistrationAuthority build() { return new LeiRegistrationAuthority(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeiRegistrationAuthority leiRegistrationAuthority = (LeiRegistrationAuthority) o;
    return Objects.equals(this.registrationAuthorityId, leiRegistrationAuthority.registrationAuthorityId) &&
        Objects.equals(this.registrationAuthorityEntityId, leiRegistrationAuthority.registrationAuthorityEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationAuthorityId, registrationAuthorityEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeiRegistrationAuthority {\n");
    
    sb.append("    registrationAuthorityId: ").append(toIndentedString(registrationAuthorityId)).append("\n");
    sb.append("    registrationAuthorityEntityId: ").append(toIndentedString(registrationAuthorityEntityId)).append("\n");
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
