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
import io.idfy.information.models.CompanyAmlResponse;
import io.idfy.information.models.PersonAmlResponse;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * OwnersAndBoardMembers
 */
@JsonDeserialize(builder = OwnersAndBoardMembers.Builder.class)
public class OwnersAndBoardMembers  implements Serializable {
  /**
   * List of person results, same structure as documented in chapter 5.4 B2C Response, exluding “bisnodeReference”
   */
  private final List<PersonAmlResponse> persons;  // Default value is: new ArrayList<>()

  /**
   * List of company results, same structure as current table, excluding “bisnodeReference” and “ownersAndBoardMembers”
   */
  private final List<CompanyAmlResponse> companies;  // Default value is: new ArrayList<>()

  private OwnersAndBoardMembers(Builder builder) {
      persons = builder.persons;
      companies = builder.companies;
  }

      /**
      * List of person results, same structure as documented in chapter 5.4 B2C Response, exluding “bisnodeReference”
      * @return persons
      **/
      public List<PersonAmlResponse> getPersons() {return persons;}

      /**
      * List of company results, same structure as current table, excluding “bisnodeReference” and “ownersAndBoardMembers”
      * @return companies
      **/
      public List<CompanyAmlResponse> getCompanies() {return companies;}


  public static final class Builder {
      private List<PersonAmlResponse> persons;
      private List<CompanyAmlResponse> companies;

    public Builder() {
    }

    public Builder(OwnersAndBoardMembers copy) {
        this.persons = copy.getPersons();
        this.companies = copy.getCompanies();
    }

    public Builder withPersons(List<PersonAmlResponse> persons) {
      this.persons = persons;
      return this;
    }

    public Builder addPersonsItem(PersonAmlResponse personsItem) {
      if (this.persons == null) {
        this.persons = new ArrayList<>();
      }
      this.persons.add(personsItem);
      return this;
    }

    public Builder withCompanies(List<CompanyAmlResponse> companies) {
      this.companies = companies;
      return this;
    }

    public Builder addCompaniesItem(CompanyAmlResponse companiesItem) {
      if (this.companies == null) {
        this.companies = new ArrayList<>();
      }
      this.companies.add(companiesItem);
      return this;
    }


    public OwnersAndBoardMembers build() { return new OwnersAndBoardMembers(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnersAndBoardMembers ownersAndBoardMembers = (OwnersAndBoardMembers) o;
    return Objects.equals(this.persons, ownersAndBoardMembers.persons) &&
        Objects.equals(this.companies, ownersAndBoardMembers.companies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persons, companies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnersAndBoardMembers {\n");
    
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
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
