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
import io.idfy.information.models.PersonVervData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * PersonFullmaktPerson
 */
@JsonDeserialize(builder = PersonFullmaktPerson.Builder.class)
public class PersonFullmaktPerson  implements Serializable {
  private final Long internreferanseField;  // Default value is: null

  private final OffsetDateTime fodtDatoField;  // Default value is: null

  private final Boolean fodtDatoFieldSpecified;  // Default value is: null

  private final String navnField;  // Default value is: null

  private final String adresseField;  // Default value is: null

  private final Integer postnrField;  // Default value is: null

  private final String poststedField;  // Default value is: null

  private final String fullmaktTypeKodeField;  // Default value is: null

  private final String fullmaktTypeTekstField;  // Default value is: null

  private final String fullmaktKodeField;  // Default value is: null

  private final String fullmaktTekstField;  // Default value is: null

  private final Integer prioritetField;  // Default value is: null

  private final Boolean prioritetFieldSpecified;  // Default value is: null

  private final Integer antallField;  // Default value is: null

  private final Boolean antallFieldSpecified;  // Default value is: null

  private final Boolean obligatoriskField;  // Default value is: null

  private final Boolean obligatoriskFieldSpecified;  // Default value is: null

  private final List<PersonVervData> vervField;  // Default value is: new ArrayList<>()

  private PersonFullmaktPerson(Builder builder) {
      internreferanseField = builder.internreferanseField;
      fodtDatoField = builder.fodtDatoField;
      fodtDatoFieldSpecified = builder.fodtDatoFieldSpecified;
      navnField = builder.navnField;
      adresseField = builder.adresseField;
      postnrField = builder.postnrField;
      poststedField = builder.poststedField;
      fullmaktTypeKodeField = builder.fullmaktTypeKodeField;
      fullmaktTypeTekstField = builder.fullmaktTypeTekstField;
      fullmaktKodeField = builder.fullmaktKodeField;
      fullmaktTekstField = builder.fullmaktTekstField;
      prioritetField = builder.prioritetField;
      prioritetFieldSpecified = builder.prioritetFieldSpecified;
      antallField = builder.antallField;
      antallFieldSpecified = builder.antallFieldSpecified;
      obligatoriskField = builder.obligatoriskField;
      obligatoriskFieldSpecified = builder.obligatoriskFieldSpecified;
      vervField = builder.vervField;
  }

      /**
      * Get internreferanseField
      * @return internreferanseField
      **/
      public Long getInternreferanseField() {return internreferanseField;}

      /**
      * Get fodtDatoField
      * @return fodtDatoField
      **/
      public OffsetDateTime getFodtDatoField() {return fodtDatoField;}

      /**
      * Get fodtDatoFieldSpecified
      * @return fodtDatoFieldSpecified
      **/
      public Boolean getFodtDatoFieldSpecified() {return fodtDatoFieldSpecified;}

      /**
      * Get navnField
      * @return navnField
      **/
      public String getNavnField() {return navnField;}

      /**
      * Get adresseField
      * @return adresseField
      **/
      public String getAdresseField() {return adresseField;}

      /**
      * Get postnrField
      * @return postnrField
      **/
      public Integer getPostnrField() {return postnrField;}

      /**
      * Get poststedField
      * @return poststedField
      **/
      public String getPoststedField() {return poststedField;}

      /**
      * Get fullmaktTypeKodeField
      * @return fullmaktTypeKodeField
      **/
      public String getFullmaktTypeKodeField() {return fullmaktTypeKodeField;}

      /**
      * Get fullmaktTypeTekstField
      * @return fullmaktTypeTekstField
      **/
      public String getFullmaktTypeTekstField() {return fullmaktTypeTekstField;}

      /**
      * Get fullmaktKodeField
      * @return fullmaktKodeField
      **/
      public String getFullmaktKodeField() {return fullmaktKodeField;}

      /**
      * Get fullmaktTekstField
      * @return fullmaktTekstField
      **/
      public String getFullmaktTekstField() {return fullmaktTekstField;}

      /**
      * Get prioritetField
      * @return prioritetField
      **/
      public Integer getPrioritetField() {return prioritetField;}

      /**
      * Get prioritetFieldSpecified
      * @return prioritetFieldSpecified
      **/
      public Boolean getPrioritetFieldSpecified() {return prioritetFieldSpecified;}

      /**
      * Get antallField
      * @return antallField
      **/
      public Integer getAntallField() {return antallField;}

      /**
      * Get antallFieldSpecified
      * @return antallFieldSpecified
      **/
      public Boolean getAntallFieldSpecified() {return antallFieldSpecified;}

      /**
      * Get obligatoriskField
      * @return obligatoriskField
      **/
      public Boolean getObligatoriskField() {return obligatoriskField;}

      /**
      * Get obligatoriskFieldSpecified
      * @return obligatoriskFieldSpecified
      **/
      public Boolean getObligatoriskFieldSpecified() {return obligatoriskFieldSpecified;}

      /**
      * Get vervField
      * @return vervField
      **/
      public List<PersonVervData> getVervField() {return vervField;}


  public static final class Builder {
      private Long internreferanseField;
      private OffsetDateTime fodtDatoField;
      private Boolean fodtDatoFieldSpecified;
      private String navnField;
      private String adresseField;
      private Integer postnrField;
      private String poststedField;
      private String fullmaktTypeKodeField;
      private String fullmaktTypeTekstField;
      private String fullmaktKodeField;
      private String fullmaktTekstField;
      private Integer prioritetField;
      private Boolean prioritetFieldSpecified;
      private Integer antallField;
      private Boolean antallFieldSpecified;
      private Boolean obligatoriskField;
      private Boolean obligatoriskFieldSpecified;
      private List<PersonVervData> vervField;

    public Builder() {
    }

    public Builder(PersonFullmaktPerson copy) {
        this.internreferanseField = copy.getInternreferanseField();
        this.fodtDatoField = copy.getFodtDatoField();
        this.fodtDatoFieldSpecified = copy.getFodtDatoFieldSpecified();
        this.navnField = copy.getNavnField();
        this.adresseField = copy.getAdresseField();
        this.postnrField = copy.getPostnrField();
        this.poststedField = copy.getPoststedField();
        this.fullmaktTypeKodeField = copy.getFullmaktTypeKodeField();
        this.fullmaktTypeTekstField = copy.getFullmaktTypeTekstField();
        this.fullmaktKodeField = copy.getFullmaktKodeField();
        this.fullmaktTekstField = copy.getFullmaktTekstField();
        this.prioritetField = copy.getPrioritetField();
        this.prioritetFieldSpecified = copy.getPrioritetFieldSpecified();
        this.antallField = copy.getAntallField();
        this.antallFieldSpecified = copy.getAntallFieldSpecified();
        this.obligatoriskField = copy.getObligatoriskField();
        this.obligatoriskFieldSpecified = copy.getObligatoriskFieldSpecified();
        this.vervField = copy.getVervField();
    }

    public Builder withInternreferanseField(Long internreferanseField) {
      this.internreferanseField = internreferanseField;
      return this;
    }

    public Builder withFodtDatoField(OffsetDateTime fodtDatoField) {
      this.fodtDatoField = fodtDatoField;
      return this;
    }

    public Builder withFodtDatoFieldSpecified(Boolean fodtDatoFieldSpecified) {
      this.fodtDatoFieldSpecified = fodtDatoFieldSpecified;
      return this;
    }

    public Builder withNavnField(String navnField) {
      this.navnField = navnField;
      return this;
    }

    public Builder withAdresseField(String adresseField) {
      this.adresseField = adresseField;
      return this;
    }

    public Builder withPostnrField(Integer postnrField) {
      this.postnrField = postnrField;
      return this;
    }

    public Builder withPoststedField(String poststedField) {
      this.poststedField = poststedField;
      return this;
    }

    public Builder withFullmaktTypeKodeField(String fullmaktTypeKodeField) {
      this.fullmaktTypeKodeField = fullmaktTypeKodeField;
      return this;
    }

    public Builder withFullmaktTypeTekstField(String fullmaktTypeTekstField) {
      this.fullmaktTypeTekstField = fullmaktTypeTekstField;
      return this;
    }

    public Builder withFullmaktKodeField(String fullmaktKodeField) {
      this.fullmaktKodeField = fullmaktKodeField;
      return this;
    }

    public Builder withFullmaktTekstField(String fullmaktTekstField) {
      this.fullmaktTekstField = fullmaktTekstField;
      return this;
    }

    public Builder withPrioritetField(Integer prioritetField) {
      this.prioritetField = prioritetField;
      return this;
    }

    public Builder withPrioritetFieldSpecified(Boolean prioritetFieldSpecified) {
      this.prioritetFieldSpecified = prioritetFieldSpecified;
      return this;
    }

    public Builder withAntallField(Integer antallField) {
      this.antallField = antallField;
      return this;
    }

    public Builder withAntallFieldSpecified(Boolean antallFieldSpecified) {
      this.antallFieldSpecified = antallFieldSpecified;
      return this;
    }

    public Builder withObligatoriskField(Boolean obligatoriskField) {
      this.obligatoriskField = obligatoriskField;
      return this;
    }

    public Builder withObligatoriskFieldSpecified(Boolean obligatoriskFieldSpecified) {
      this.obligatoriskFieldSpecified = obligatoriskFieldSpecified;
      return this;
    }

    public Builder withVervField(List<PersonVervData> vervField) {
      this.vervField = vervField;
      return this;
    }

    public Builder addVervFieldItem(PersonVervData vervFieldItem) {
      if (this.vervField == null) {
        this.vervField = new ArrayList<>();
      }
      this.vervField.add(vervFieldItem);
      return this;
    }


    public PersonFullmaktPerson build() { return new PersonFullmaktPerson(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonFullmaktPerson personFullmaktPerson = (PersonFullmaktPerson) o;
    return Objects.equals(this.internreferanseField, personFullmaktPerson.internreferanseField) &&
        Objects.equals(this.fodtDatoField, personFullmaktPerson.fodtDatoField) &&
        Objects.equals(this.fodtDatoFieldSpecified, personFullmaktPerson.fodtDatoFieldSpecified) &&
        Objects.equals(this.navnField, personFullmaktPerson.navnField) &&
        Objects.equals(this.adresseField, personFullmaktPerson.adresseField) &&
        Objects.equals(this.postnrField, personFullmaktPerson.postnrField) &&
        Objects.equals(this.poststedField, personFullmaktPerson.poststedField) &&
        Objects.equals(this.fullmaktTypeKodeField, personFullmaktPerson.fullmaktTypeKodeField) &&
        Objects.equals(this.fullmaktTypeTekstField, personFullmaktPerson.fullmaktTypeTekstField) &&
        Objects.equals(this.fullmaktKodeField, personFullmaktPerson.fullmaktKodeField) &&
        Objects.equals(this.fullmaktTekstField, personFullmaktPerson.fullmaktTekstField) &&
        Objects.equals(this.prioritetField, personFullmaktPerson.prioritetField) &&
        Objects.equals(this.prioritetFieldSpecified, personFullmaktPerson.prioritetFieldSpecified) &&
        Objects.equals(this.antallField, personFullmaktPerson.antallField) &&
        Objects.equals(this.antallFieldSpecified, personFullmaktPerson.antallFieldSpecified) &&
        Objects.equals(this.obligatoriskField, personFullmaktPerson.obligatoriskField) &&
        Objects.equals(this.obligatoriskFieldSpecified, personFullmaktPerson.obligatoriskFieldSpecified) &&
        Objects.equals(this.vervField, personFullmaktPerson.vervField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internreferanseField, fodtDatoField, fodtDatoFieldSpecified, navnField, adresseField, postnrField, poststedField, fullmaktTypeKodeField, fullmaktTypeTekstField, fullmaktKodeField, fullmaktTekstField, prioritetField, prioritetFieldSpecified, antallField, antallFieldSpecified, obligatoriskField, obligatoriskFieldSpecified, vervField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonFullmaktPerson {\n");
    
    sb.append("    internreferanseField: ").append(toIndentedString(internreferanseField)).append("\n");
    sb.append("    fodtDatoField: ").append(toIndentedString(fodtDatoField)).append("\n");
    sb.append("    fodtDatoFieldSpecified: ").append(toIndentedString(fodtDatoFieldSpecified)).append("\n");
    sb.append("    navnField: ").append(toIndentedString(navnField)).append("\n");
    sb.append("    adresseField: ").append(toIndentedString(adresseField)).append("\n");
    sb.append("    postnrField: ").append(toIndentedString(postnrField)).append("\n");
    sb.append("    poststedField: ").append(toIndentedString(poststedField)).append("\n");
    sb.append("    fullmaktTypeKodeField: ").append(toIndentedString(fullmaktTypeKodeField)).append("\n");
    sb.append("    fullmaktTypeTekstField: ").append(toIndentedString(fullmaktTypeTekstField)).append("\n");
    sb.append("    fullmaktKodeField: ").append(toIndentedString(fullmaktKodeField)).append("\n");
    sb.append("    fullmaktTekstField: ").append(toIndentedString(fullmaktTekstField)).append("\n");
    sb.append("    prioritetField: ").append(toIndentedString(prioritetField)).append("\n");
    sb.append("    prioritetFieldSpecified: ").append(toIndentedString(prioritetFieldSpecified)).append("\n");
    sb.append("    antallField: ").append(toIndentedString(antallField)).append("\n");
    sb.append("    antallFieldSpecified: ").append(toIndentedString(antallFieldSpecified)).append("\n");
    sb.append("    obligatoriskField: ").append(toIndentedString(obligatoriskField)).append("\n");
    sb.append("    obligatoriskFieldSpecified: ").append(toIndentedString(obligatoriskFieldSpecified)).append("\n");
    sb.append("    vervField: ").append(toIndentedString(vervField)).append("\n");
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
