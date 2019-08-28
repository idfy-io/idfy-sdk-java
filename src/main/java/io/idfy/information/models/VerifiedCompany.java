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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Data retrieved before the actual screening (data enhancement).
 */
@JsonDeserialize(builder = VerifiedCompany.Builder.class)
public class VerifiedCompany  implements Serializable {
  /**
   * Business registration number
   */
  private final String regNo;  // Default value is: null

  /**
   * D-U-N-S number
   */
  private final String dunsNo;  // Default value is: null

  /**
   * Status code
   */
  private final List<String> status;  // Default value is: new ArrayList<>()

  /**
   * Name of company
   */
  private final String name;  // Default value is: null

  /**
   * Two-letter code as specified in the ISO 3166 standard
   */
  private final String nationality;  // Default value is: null

  /**
   * Name of data provider
   */
  private final String provider;  // Default value is: null

  private VerifiedCompany(Builder builder) {
      regNo = builder.regNo;
      dunsNo = builder.dunsNo;
      status = builder.status;
      name = builder.name;
      nationality = builder.nationality;
      provider = builder.provider;
  }

      /**
      * Business registration number
      * @return regNo
      **/
      public String getRegNo() {return regNo;}

      /**
      * D-U-N-S number
      * @return dunsNo
      **/
      public String getDunsNo() {return dunsNo;}

      /**
      * Status code
      * @return status
      **/
      public List<String> getStatus() {return status;}

      /**
      * Name of company
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Two-letter code as specified in the ISO 3166 standard
      * @return nationality
      **/
      public String getNationality() {return nationality;}

      /**
      * Name of data provider
      * @return provider
      **/
      public String getProvider() {return provider;}


  public static final class Builder {
      private String regNo;
      private String dunsNo;
      private List<String> status;
      private String name;
      private String nationality;
      private String provider;

    public Builder() {
    }

    public Builder(VerifiedCompany copy) {
        this.regNo = copy.getRegNo();
        this.dunsNo = copy.getDunsNo();
        this.status = copy.getStatus();
        this.name = copy.getName();
        this.nationality = copy.getNationality();
        this.provider = copy.getProvider();
    }

    public Builder withRegNo(String regNo) {
      this.regNo = regNo;
      return this;
    }

    public Builder withDunsNo(String dunsNo) {
      this.dunsNo = dunsNo;
      return this;
    }

    public Builder withStatus(List<String> status) {
      this.status = status;
      return this;
    }

    public Builder addStatusItem(String statusItem) {
      if (this.status == null) {
        this.status = new ArrayList<>();
      }
      this.status.add(statusItem);
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withNationality(String nationality) {
      this.nationality = nationality;
      return this;
    }

    public Builder withProvider(String provider) {
      this.provider = provider;
      return this;
    }


    public VerifiedCompany build() { return new VerifiedCompany(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiedCompany verifiedCompany = (VerifiedCompany) o;
    return Objects.equals(this.regNo, verifiedCompany.regNo) &&
        Objects.equals(this.dunsNo, verifiedCompany.dunsNo) &&
        Objects.equals(this.status, verifiedCompany.status) &&
        Objects.equals(this.name, verifiedCompany.name) &&
        Objects.equals(this.nationality, verifiedCompany.nationality) &&
        Objects.equals(this.provider, verifiedCompany.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regNo, dunsNo, status, name, nationality, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiedCompany {\n");
    
    sb.append("    regNo: ").append(toIndentedString(regNo)).append("\n");
    sb.append("    dunsNo: ").append(toIndentedString(dunsNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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
