/*
 * Idfy Identification
 * This endpoint enables authentication/identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID. ## Last update   Last build date for this endpoint: 02.04.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.identification.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Information aboute users enviroment
 */
@JsonDeserialize(builder = EnvironmentInfo.Builder.class)
public class EnvironmentInfo  implements Serializable {
  /**
   * The users user-agent (browser/device)
   */
  private final String userAgent;  // Default value is: null

  /**
   * The IP-address of the user
   */
  private final String ipAddress;  // Default value is: null

  private EnvironmentInfo(Builder builder) {
      userAgent = builder.userAgent;
      ipAddress = builder.ipAddress;
  }

      /**
      * The users user-agent (browser/device)
      * @return userAgent
      **/
      public String getUserAgent() {return userAgent;}

      /**
      * The IP-address of the user
      * @return ipAddress
      **/
      public String getIpAddress() {return ipAddress;}


  public static final class Builder {
      private String userAgent;
      private String ipAddress;

    public Builder() {
    }

    public Builder(EnvironmentInfo copy) {
        this.userAgent = copy.getUserAgent();
        this.ipAddress = copy.getIpAddress();
    }

    public Builder withUserAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }

    public Builder withIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }


    public EnvironmentInfo build() { return new EnvironmentInfo(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentInfo environmentInfo = (EnvironmentInfo) o;
    return Objects.equals(this.userAgent, environmentInfo.userAgent) &&
        Objects.equals(this.ipAddress, environmentInfo.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAgent, ipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentInfo {\n");
    
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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
