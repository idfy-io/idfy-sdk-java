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
import io.idfy.signature.models.DocumentSummary;
import io.idfy.signature.models.Links;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * CollectionWithPagingDocumentSummary
 */
@JsonDeserialize(builder = CollectionWithPagingDocumentSummary.Builder.class)
public class CollectionWithPagingDocumentSummary  implements Serializable {
  /**
   * The offset of the current page.
   */
  private final Integer offset;  // Default value is: null

  /**
   * The limit of the current paging options.
   */
  private final Integer limit;  // Default value is: null

  /**
   * The total size of the collection (irrespective of any paging options).
   */
  private final Long size;  // Default value is: null

  private final Links links;  // Default value is: null

  private final List<DocumentSummary> data;  // Default value is: new ArrayList<>()

  private CollectionWithPagingDocumentSummary(Builder builder) {
      offset = builder.offset;
      limit = builder.limit;
      size = builder.size;
      links = builder.links;
      data = builder.data;
  }

      /**
      * The offset of the current page.
      * @return offset
      **/
      public Integer getOffset() {return offset;}

      /**
      * The limit of the current paging options.
      * @return limit
      **/
      public Integer getLimit() {return limit;}

      /**
      * The total size of the collection (irrespective of any paging options).
      * @return size
      **/
      public Long getSize() {return size;}

      /**
      * Get links
      * @return links
      **/
      public Links getLinks() {return links;}

      /**
      * Get data
      * @return data
      **/
      public List<DocumentSummary> getData() {return data;}


  public static final class Builder {
      private Integer offset;
      private Integer limit;
      private Long size;
      private Links links;
      private List<DocumentSummary> data;

    public Builder() {
    }

    public Builder(CollectionWithPagingDocumentSummary copy) {
        this.offset = copy.getOffset();
        this.limit = copy.getLimit();
        this.size = copy.getSize();
        this.links = copy.getLinks();
        this.data = copy.getData();
    }

    public Builder withOffset(Integer offset) {
      this.offset = offset;
      return this;
    }

    public Builder withLimit(Integer limit) {
      this.limit = limit;
      return this;
    }

    public Builder withSize(Long size) {
      this.size = size;
      return this;
    }

    public Builder withLinks(Links links) {
      this.links = links;
      return this;
    }

    public Builder withData(List<DocumentSummary> data) {
      this.data = data;
      return this;
    }

    public Builder addDataItem(DocumentSummary dataItem) {
      if (this.data == null) {
        this.data = new ArrayList<>();
      }
      this.data.add(dataItem);
      return this;
    }


    public CollectionWithPagingDocumentSummary build() { return new CollectionWithPagingDocumentSummary(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionWithPagingDocumentSummary collectionWithPagingDocumentSummary = (CollectionWithPagingDocumentSummary) o;
    return Objects.equals(this.offset, collectionWithPagingDocumentSummary.offset) &&
        Objects.equals(this.limit, collectionWithPagingDocumentSummary.limit) &&
        Objects.equals(this.size, collectionWithPagingDocumentSummary.size) &&
        Objects.equals(this.links, collectionWithPagingDocumentSummary.links) &&
        Objects.equals(this.data, collectionWithPagingDocumentSummary.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, size, links, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionWithPagingDocumentSummary {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
