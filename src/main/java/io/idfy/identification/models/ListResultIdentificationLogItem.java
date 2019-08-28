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
import io.idfy.identification.models.IdentificationLogItem;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * ListResultIdentificationLogItem
 */
@JsonDeserialize(builder = ListResultIdentificationLogItem.Builder.class)
public class ListResultIdentificationLogItem  implements Serializable {
  /**
   * Link to the next results if not set there are less then the return limit of 1000
   */
  private final String nextLink;  // Default value is: null

  /**
   * The total amount of links (pages) for the list
   */
  private final Integer totalLinks;  // Default value is: null

  /**
   * List of results
   */
  private final List<IdentificationLogItem> list;  // Default value is: new ArrayList<>()

  private ListResultIdentificationLogItem(Builder builder) {
      nextLink = builder.nextLink;
      totalLinks = builder.totalLinks;
      list = builder.list;
  }

      /**
      * Link to the next results if not set there are less then the return limit of 1000
      * @return nextLink
      **/
      public String getNextLink() {return nextLink;}

      /**
      * The total amount of links (pages) for the list
      * @return totalLinks
      **/
      public Integer getTotalLinks() {return totalLinks;}

      /**
      * List of results
      * @return list
      **/
      public List<IdentificationLogItem> getList() {return list;}


  public static final class Builder {
      private String nextLink;
      private Integer totalLinks;
      private List<IdentificationLogItem> list;

    public Builder() {
    }

    public Builder(ListResultIdentificationLogItem copy) {
        this.nextLink = copy.getNextLink();
        this.totalLinks = copy.getTotalLinks();
        this.list = copy.getList();
    }

    public Builder withNextLink(String nextLink) {
      this.nextLink = nextLink;
      return this;
    }

    public Builder withTotalLinks(Integer totalLinks) {
      this.totalLinks = totalLinks;
      return this;
    }

    public Builder withList(List<IdentificationLogItem> list) {
      this.list = list;
      return this;
    }

    public Builder addListItem(IdentificationLogItem listItem) {
      if (this.list == null) {
        this.list = new ArrayList<>();
      }
      this.list.add(listItem);
      return this;
    }


    public ListResultIdentificationLogItem build() { return new ListResultIdentificationLogItem(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResultIdentificationLogItem listResultIdentificationLogItem = (ListResultIdentificationLogItem) o;
    return Objects.equals(this.nextLink, listResultIdentificationLogItem.nextLink) &&
        Objects.equals(this.totalLinks, listResultIdentificationLogItem.totalLinks) &&
        Objects.equals(this.list, listResultIdentificationLogItem.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextLink, totalLinks, list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResultIdentificationLogItem {\n");
    
    sb.append("    nextLink: ").append(toIndentedString(nextLink)).append("\n");
    sb.append("    totalLinks: ").append(toIndentedString(totalLinks)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
