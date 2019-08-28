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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Security settings.
 */
@JsonDeserialize(builder = Security.Builder.class)
public class Security  implements Serializable {
  /**
   * (Coming soon) Determines if the link is one-time use.
   */
  private final Boolean oneTimeUse;  // Default value is: null

  /**
   * (Coming soon) A list of IP addresses that are allowed to see / sign the document.
   */
  private final List<String> ipWhiteList;  // Default value is: new ArrayList<>()

  private Security(Builder builder) {
      oneTimeUse = builder.oneTimeUse;
      ipWhiteList = builder.ipWhiteList;
  }

      /**
      * (Coming soon) Determines if the link is one-time use.
      * @return oneTimeUse
      **/
      public Boolean getOneTimeUse() {return oneTimeUse;}

      /**
      * (Coming soon) A list of IP addresses that are allowed to see / sign the document.
      * @return ipWhiteList
      **/
      public List<String> getIpWhiteList() {return ipWhiteList;}


  public static final class Builder {
      private Boolean oneTimeUse;
      private List<String> ipWhiteList;

    public Builder() {
    }

    public Builder(Security copy) {
        this.oneTimeUse = copy.getOneTimeUse();
        this.ipWhiteList = copy.getIpWhiteList();
    }

    public Builder withOneTimeUse(Boolean oneTimeUse) {
      this.oneTimeUse = oneTimeUse;
      return this;
    }

    public Builder withIpWhiteList(List<String> ipWhiteList) {
      this.ipWhiteList = ipWhiteList;
      return this;
    }

    public Builder addIpWhiteListItem(String ipWhiteListItem) {
      if (this.ipWhiteList == null) {
        this.ipWhiteList = new ArrayList<>();
      }
      this.ipWhiteList.add(ipWhiteListItem);
      return this;
    }


    public Security build() { return new Security(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Security security = (Security) o;
    return Objects.equals(this.oneTimeUse, security.oneTimeUse) &&
        Objects.equals(this.ipWhiteList, security.ipWhiteList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneTimeUse, ipWhiteList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Security {\n");
    
    sb.append("    oneTimeUse: ").append(toIndentedString(oneTimeUse)).append("\n");
    sb.append("    ipWhiteList: ").append(toIndentedString(ipWhiteList)).append("\n");
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
