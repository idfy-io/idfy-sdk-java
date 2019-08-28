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
@JsonDeserialize(builder = PersonSanctionResult.Builder.class)
public class PersonSanctionResult  implements Serializable {
  /**
   * Quality indicator of match. Higher number means better match.
   */
  private final Integer matchIndicator;  // Default value is: null

  /**
   * May be a text string denoting title of position, job title, etc
   */
  private final String title;  // Default value is: null

  /**
   * Additional details about what the person does
   */
  private final String function;  // Default value is: null

  /**
   * A comment of some kind may be present in some lists
   */
  private final String comment;  // Default value is: null

  /**
   * Name aliases for the person. May be none, one or more.
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
   * Name of data provider
   */
  private final String provider;  // Default value is: null

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
   * Name of person
   */
  private final String name;  // Default value is: null

  /**
   * Gender of person
   */
  public enum Gender {
    @JsonProperty("MALE")
    MALE("MALE"),
    
    @JsonProperty("FEMALE")
    FEMALE("FEMALE"),
    
    @JsonProperty("UNKNOWN")
    UNKNOWN("UNKNOWN");

    private String value;

    Gender(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Gender fromValue(String text) {
      for (Gender b : Gender.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Gender of person
   */
  private final Gender gender;  // Default value is: null

  /**
   * National Identification Number
   */
  private final String natIdNo;  // Default value is: null

  /**
   * Two-letter code as specified in the ISO 3166 standard
   */
  private final String nationality;  // Default value is: null

  /**
   * Date of birth for the person
   */
  private final String birthDate;  // Default value is: null

  private PersonSanctionResult(Builder builder) {
      matchIndicator = builder.matchIndicator;
      title = builder.title;
      function = builder.function;
      comment = builder.comment;
      aliasList = builder.aliasList;
      addressList = builder.addressList;
      urlList = builder.urlList;
      provider = builder.provider;
      source = builder.source;
      externalId = builder.externalId;
      lastUpdate = builder.lastUpdate;
      firstUpdate = builder.firstUpdate;
      name = builder.name;
      gender = builder.gender;
      natIdNo = builder.natIdNo;
      nationality = builder.nationality;
      birthDate = builder.birthDate;
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
      * Additional details about what the person does
      * @return function
      **/
      public String getFunction() {return function;}

      /**
      * A comment of some kind may be present in some lists
      * @return comment
      **/
      public String getComment() {return comment;}

      /**
      * Name aliases for the person. May be none, one or more.
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
      * Name of data provider
      * @return provider
      **/
      public String getProvider() {return provider;}

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
      * Name of person
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Gender of person
      * @return gender
      **/
      public Gender getGender() {return gender;}

      /**
      * National Identification Number
      * @return natIdNo
      **/
      public String getNatIdNo() {return natIdNo;}

      /**
      * Two-letter code as specified in the ISO 3166 standard
      * @return nationality
      **/
      public String getNationality() {return nationality;}

      /**
      * Date of birth for the person
      * @return birthDate
      **/
      public String getBirthDate() {return birthDate;}


  public static final class Builder {
      private Integer matchIndicator;
      private String title;
      private String function;
      private String comment;
      private List<String> aliasList;
      private List<AddressList> addressList;
      private List<String> urlList;
      private String provider;
      private String source;
      private String externalId;
      private OffsetDateTime lastUpdate;
      private OffsetDateTime firstUpdate;
      private String name;
      private Gender gender;
      private String natIdNo;
      private String nationality;
      private String birthDate;

    public Builder() {
    }

    public Builder(PersonSanctionResult copy) {
        this.matchIndicator = copy.getMatchIndicator();
        this.title = copy.getTitle();
        this.function = copy.getFunction();
        this.comment = copy.getComment();
        this.aliasList = copy.getAliasList();
        this.addressList = copy.getAddressList();
        this.urlList = copy.getUrlList();
        this.provider = copy.getProvider();
        this.source = copy.getSource();
        this.externalId = copy.getExternalId();
        this.lastUpdate = copy.getLastUpdate();
        this.firstUpdate = copy.getFirstUpdate();
        this.name = copy.getName();
        this.gender = copy.getGender();
        this.natIdNo = copy.getNatIdNo();
        this.nationality = copy.getNationality();
        this.birthDate = copy.getBirthDate();
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

    public Builder withProvider(String provider) {
      this.provider = provider;
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

    public Builder withGender(Gender gender) {
      this.gender = gender;
      return this;
    }

    public Builder withNatIdNo(String natIdNo) {
      this.natIdNo = natIdNo;
      return this;
    }

    public Builder withNationality(String nationality) {
      this.nationality = nationality;
      return this;
    }

    public Builder withBirthDate(String birthDate) {
      this.birthDate = birthDate;
      return this;
    }


    public PersonSanctionResult build() { return new PersonSanctionResult(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonSanctionResult personSanctionResult = (PersonSanctionResult) o;
    return Objects.equals(this.matchIndicator, personSanctionResult.matchIndicator) &&
        Objects.equals(this.title, personSanctionResult.title) &&
        Objects.equals(this.function, personSanctionResult.function) &&
        Objects.equals(this.comment, personSanctionResult.comment) &&
        Objects.equals(this.aliasList, personSanctionResult.aliasList) &&
        Objects.equals(this.addressList, personSanctionResult.addressList) &&
        Objects.equals(this.urlList, personSanctionResult.urlList) &&
        Objects.equals(this.provider, personSanctionResult.provider) &&
        Objects.equals(this.source, personSanctionResult.source) &&
        Objects.equals(this.externalId, personSanctionResult.externalId) &&
        Objects.equals(this.lastUpdate, personSanctionResult.lastUpdate) &&
        Objects.equals(this.firstUpdate, personSanctionResult.firstUpdate) &&
        Objects.equals(this.name, personSanctionResult.name) &&
        Objects.equals(this.gender, personSanctionResult.gender) &&
        Objects.equals(this.natIdNo, personSanctionResult.natIdNo) &&
        Objects.equals(this.nationality, personSanctionResult.nationality) &&
        Objects.equals(this.birthDate, personSanctionResult.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchIndicator, title, function, comment, aliasList, addressList, urlList, provider, source, externalId, lastUpdate, firstUpdate, name, gender, natIdNo, nationality, birthDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonSanctionResult {\n");
    
    sb.append("    matchIndicator: ").append(toIndentedString(matchIndicator)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    aliasList: ").append(toIndentedString(aliasList)).append("\n");
    sb.append("    addressList: ").append(toIndentedString(addressList)).append("\n");
    sb.append("    urlList: ").append(toIndentedString(urlList)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    firstUpdate: ").append(toIndentedString(firstUpdate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    natIdNo: ").append(toIndentedString(natIdNo)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
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
