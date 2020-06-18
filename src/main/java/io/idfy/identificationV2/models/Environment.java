/*
 * Idfy Identification v2
 * This endpoint enables identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID.
 *
 * OpenAPI spec version: v2
 * Contact: support@idfy.io
 */
package io.idfy.identificationV2.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.io.Serializable;

/**
 * Details about the user&#x27;s environment.
 */
@JsonDeserialize(builder = Environment.Builder.class)
public class Environment  implements Serializable {
  /**
   * The user agent of the user's browser.
   */
  private final String userAgent;  // Default value is: null

  /**
   * The user's IP address.
   */
  private final String ipAddress;  // Default value is: null

  private Environment(Builder builder) {
      userAgent = builder.userAgent;
      ipAddress = builder.ipAddress;
  }

      /**
      * The user agent of the user's browser.
      * @return userAgent
      **/
      public String getUserAgent() {return userAgent;}

      /**
      * The user's IP address.
      * @return ipAddress
      **/
      public String getIpAddress() {return ipAddress;}


  public static final class Builder {
      private String userAgent;
      private String ipAddress;

    public Builder() {
    }

    public Builder(Environment copy) {
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


    public Environment build() { return new Environment(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Environment environment = (Environment) o;
    return Objects.equals(this.userAgent, environment.userAgent) &&
        Objects.equals(this.ipAddress, environment.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAgent, ipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    
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