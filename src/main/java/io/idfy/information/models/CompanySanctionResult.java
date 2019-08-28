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
import io.idfy.information.models.AddressList;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * List of all Sanction items with match for the input request.
 */
@JsonDeserialize(builder = CompanySanctionResult.Builder.class)
public class CompanySanctionResult  implements Serializable {
  /**
   * Quality indicator of match. Higher number means better match.
   */
  private final Integer matchIndicator;  // Default value is: null

  /**
   * May be a text string denoting title of position, job title, etc
   */
  private final String title;  // Default value is: null

  /**
   * Additional details about what the company does
   */
  private final String function;  // Default value is: null

  /**
   * A comment of some kind may be present in some lists
   */
  private final String comment;  // Default value is: null

  /**
   * Name aliases for the company. May be none, one or more.
   */
  private final List<String> aliasList;  // Default value is: new ArrayList<>()

  /**
   * List of addresses found in the lists
   */
  private final List<AddressList> addressList;  // Default value is: new ArrayList<>()

  /**
   * URLs to source documents (May be used for further investigations)
   */
  private final List<String> urlList;  // Default value is: new ArrayList<>()

  /**
   * The name of the source list, e.g. 'EU_GLOBAL', 'PEP_Edge', 'UN_CONSOLIDATED'
   */
  private final String source;  // Default value is: null

  /**
   * External identification
   */
  private final String externalId;  // Default value is: null

  /**
   * Date of last update
   */
  private final OffsetDateTime lastUpdate;  // Default value is: null

  /**
   * Date of first update
   */
  private final OffsetDateTime firstUpdate;  // Default value is: null

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

  private CompanySanctionResult(Builder builder) {
      matchIndicator = builder.matchIndicator;
      title = builder.title;
      function = builder.function;
      comment = builder.comment;
      aliasList = builder.aliasList;
      addressList = builder.addressList;
      urlList = builder.urlList;
      source = builder.source;
      externalId = builder.externalId;
      lastUpdate = builder.lastUpdate;
      firstUpdate = builder.firstUpdate;
      name = builder.name;
      nationality = builder.nationality;
      provider = builder.provider;
  }

      /**
      * Quality indicator of match. Higher number means better match.
      * @return matchIndicator
      **/
      public Integer getMatchIndicator() {return matchIndicator;}

      /**
      * May be a text string denoting title of position, job title, etc
      * @return title
      **/
      public String getTitle() {return title;}

      /**
      * Additional details about what the company does
      * @return function
      **/
      public String getFunction() {return function;}

      /**
      * A comment of some kind may be present in some lists
      * @return comment
      **/
      public String getComment() {return comment;}

      /**
      * Name aliases for the company. May be none, one or more.
      * @return aliasList
      **/
      public List<String> getAliasList() {return aliasList;}

      /**
      * List of addresses found in the lists
      * @return addressList
      **/
      public List<AddressList> getAddressList() {return addressList;}

      /**
      * URLs to source documents (May be used for further investigations)
      * @return urlList
      **/
      public List<String> getUrlList() {return urlList;}

      /**
      * The name of the source list, e.g. 'EU_GLOBAL', 'PEP_Edge', 'UN_CONSOLIDATED'
      * @return source
      **/
      public String getSource() {return source;}

      /**
      * External identification
      * @return externalId
      **/
      public String getExternalId() {return externalId;}

      /**
      * Date of last update
      * @return lastUpdate
      **/
      public OffsetDateTime getLastUpdate() {return lastUpdate;}

      /**
      * Date of first update
      * @return firstUpdate
      **/
      public OffsetDateTime getFirstUpdate() {return firstUpdate;}

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
      private Integer matchIndicator;
      private String title;
      private String function;
      private String comment;
      private List<String> aliasList;
      private List<AddressList> addressList;
      private List<String> urlList;
      private String source;
      private String externalId;
      private OffsetDateTime lastUpdate;
      private OffsetDateTime firstUpdate;
      private String name;
      private String nationality;
      private String provider;

    public Builder() {
    }

    public Builder(CompanySanctionResult copy) {
        this.matchIndicator = copy.getMatchIndicator();
        this.title = copy.getTitle();
        this.function = copy.getFunction();
        this.comment = copy.getComment();
        this.aliasList = copy.getAliasList();
        this.addressList = copy.getAddressList();
        this.urlList = copy.getUrlList();
        this.source = copy.getSource();
        this.externalId = copy.getExternalId();
        this.lastUpdate = copy.getLastUpdate();
        this.firstUpdate = copy.getFirstUpdate();
        this.name = copy.getName();
        this.nationality = copy.getNationality();
        this.provider = copy.getProvider();
    }

    public Builder withMatchIndicator(Integer matchIndicator) {
      this.matchIndicator = matchIndicator;
      return this;
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withFunction(String function) {
      this.function = function;
      return this;
    }

    public Builder withComment(String comment) {
      this.comment = comment;
      return this;
    }

    public Builder withAliasList(List<String> aliasList) {
      this.aliasList = aliasList;
      return this;
    }

    public Builder addAliasListItem(String aliasListItem) {
      if (this.aliasList == null) {
        this.aliasList = new ArrayList<>();
      }
      this.aliasList.add(aliasListItem);
      return this;
    }

    public Builder withAddressList(List<AddressList> addressList) {
      this.addressList = addressList;
      return this;
    }

    public Builder addAddressListItem(AddressList addressListItem) {
      if (this.addressList == null) {
        this.addressList = new ArrayList<>();
      }
      this.addressList.add(addressListItem);
      return this;
    }

    public Builder withUrlList(List<String> urlList) {
      this.urlList = urlList;
      return this;
    }

    public Builder addUrlListItem(String urlListItem) {
      if (this.urlList == null) {
        this.urlList = new ArrayList<>();
      }
      this.urlList.add(urlListItem);
      return this;
    }

    public Builder withSource(String source) {
      this.source = source;
      return this;
    }

    public Builder withExternalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder withLastUpdate(OffsetDateTime lastUpdate) {
      this.lastUpdate = lastUpdate;
      return this;
    }

    public Builder withFirstUpdate(OffsetDateTime firstUpdate) {
      this.firstUpdate = firstUpdate;
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


    public CompanySanctionResult build() { return new CompanySanctionResult(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanySanctionResult companySanctionResult = (CompanySanctionResult) o;
    return Objects.equals(this.matchIndicator, companySanctionResult.matchIndicator) &&
        Objects.equals(this.title, companySanctionResult.title) &&
        Objects.equals(this.function, companySanctionResult.function) &&
        Objects.equals(this.comment, companySanctionResult.comment) &&
        Objects.equals(this.aliasList, companySanctionResult.aliasList) &&
        Objects.equals(this.addressList, companySanctionResult.addressList) &&
        Objects.equals(this.urlList, companySanctionResult.urlList) &&
        Objects.equals(this.source, companySanctionResult.source) &&
        Objects.equals(this.externalId, companySanctionResult.externalId) &&
        Objects.equals(this.lastUpdate, companySanctionResult.lastUpdate) &&
        Objects.equals(this.firstUpdate, companySanctionResult.firstUpdate) &&
        Objects.equals(this.name, companySanctionResult.name) &&
        Objects.equals(this.nationality, companySanctionResult.nationality) &&
        Objects.equals(this.provider, companySanctionResult.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchIndicator, title, function, comment, aliasList, addressList, urlList, source, externalId, lastUpdate, firstUpdate, name, nationality, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanySanctionResult {\n");
    
    sb.append("    matchIndicator: ").append(toIndentedString(matchIndicator)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    aliasList: ").append(toIndentedString(aliasList)).append("\n");
    sb.append("    addressList: ").append(toIndentedString(addressList)).append("\n");
    sb.append("    urlList: ").append(toIndentedString(urlList)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    firstUpdate: ").append(toIndentedString(firstUpdate)).append("\n");
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
