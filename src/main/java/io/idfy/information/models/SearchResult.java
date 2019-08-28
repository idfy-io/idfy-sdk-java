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
import io.idfy.information.models.LeiRecord;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * SearchResult
 */
@JsonDeserialize(builder = SearchResult.Builder.class)
public class SearchResult  implements Serializable {
  private final String nextUrl;  // Default value is: null

  private final Integer start;  // Default value is: null

  private final Integer numFound;  // Default value is: null

  private final Integer rows;  // Default value is: null

  private final List<LeiRecord> results;  // Default value is: new ArrayList<>()

  private SearchResult(Builder builder) {
      nextUrl = builder.nextUrl;
      start = builder.start;
      numFound = builder.numFound;
      rows = builder.rows;
      results = builder.results;
  }

      /**
      * Get nextUrl
      * @return nextUrl
      **/
      public String getNextUrl() {return nextUrl;}

      /**
      * Get start
      * @return start
      **/
      public Integer getStart() {return start;}

      /**
      * Get numFound
      * @return numFound
      **/
      public Integer getNumFound() {return numFound;}

      /**
      * Get rows
      * @return rows
      **/
      public Integer getRows() {return rows;}

      /**
      * Get results
      * @return results
      **/
      public List<LeiRecord> getResults() {return results;}


  public static final class Builder {
      private String nextUrl;
      private Integer start;
      private Integer numFound;
      private Integer rows;
      private List<LeiRecord> results;

    public Builder() {
    }

    public Builder(SearchResult copy) {
        this.nextUrl = copy.getNextUrl();
        this.start = copy.getStart();
        this.numFound = copy.getNumFound();
        this.rows = copy.getRows();
        this.results = copy.getResults();
    }

    public Builder withNextUrl(String nextUrl) {
      this.nextUrl = nextUrl;
      return this;
    }

    public Builder withStart(Integer start) {
      this.start = start;
      return this;
    }

    public Builder withNumFound(Integer numFound) {
      this.numFound = numFound;
      return this;
    }

    public Builder withRows(Integer rows) {
      this.rows = rows;
      return this;
    }

    public Builder withResults(List<LeiRecord> results) {
      this.results = results;
      return this;
    }

    public Builder addResultsItem(LeiRecord resultsItem) {
      if (this.results == null) {
        this.results = new ArrayList<>();
      }
      this.results.add(resultsItem);
      return this;
    }


    public SearchResult build() { return new SearchResult(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.nextUrl, searchResult.nextUrl) &&
        Objects.equals(this.start, searchResult.start) &&
        Objects.equals(this.numFound, searchResult.numFound) &&
        Objects.equals(this.rows, searchResult.rows) &&
        Objects.equals(this.results, searchResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextUrl, start, numFound, rows, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    nextUrl: ").append(toIndentedString(nextUrl)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    numFound: ").append(toIndentedString(numFound)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
