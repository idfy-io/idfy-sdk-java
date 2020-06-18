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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * PaginatedDataDto1
 */
@JsonDeserialize(builder = PaginatedDataDto1.Builder.class)
public class PaginatedDataDto1  implements Serializable {
  /**
   * The limit of the current paging options.
   */
  private final Integer limit;  // Default value is: null

  /**
   * The cursor to send to the endpoint to receive the next batch of responses.
   */
  private final String nextCursor;  // Default value is: null

  /**
   * An array containing the actual response elements.
   */
  private final List<IdSession> data;  // Default value is: new ArrayList<IdSession>()

  private PaginatedDataDto1(Builder builder) {
      limit = builder.limit;
      nextCursor = builder.nextCursor;
      data = builder.data;
  }

      /**
      * The limit of the current paging options.
      * @return limit
      **/
      public Integer getLimit() {return limit;}

      /**
      * The cursor to send to the endpoint to receive the next batch of responses.
      * @return nextCursor
      **/
      public String getNextCursor() {return nextCursor;}

      /**
      * An array containing the actual response elements.
      * @return data
      **/
      public List<IdSession> getData() {return data;}


  public static final class Builder {
      private Integer limit;
      private String nextCursor;
      private List<IdSession> data;

    public Builder() {
    }

    public Builder(PaginatedDataDto1 copy) {
        this.limit = copy.getLimit();
        this.nextCursor = copy.getNextCursor();
        this.data = copy.getData();
    }

    public Builder withLimit(Integer limit) {
      this.limit = limit;
      return this;
    }

    public Builder withNextCursor(String nextCursor) {
      this.nextCursor = nextCursor;
      return this;
    }

    public Builder withData(List<IdSession> data) {
      this.data = data;
      return this;
    }

    public Builder addDataItem(IdSession dataItem) {
      if (this.data == null) {
        this.data = new ArrayList<IdSession>();
      }
      this.data.add(dataItem);
      return this;
    }


    public PaginatedDataDto1 build() { return new PaginatedDataDto1(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedDataDto1 paginatedDataDto1 = (PaginatedDataDto1) o;
    return Objects.equals(this.limit, paginatedDataDto1.limit) &&
        Objects.equals(this.nextCursor, paginatedDataDto1.nextCursor) &&
        Objects.equals(this.data, paginatedDataDto1.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, nextCursor, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedDataDto1 {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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