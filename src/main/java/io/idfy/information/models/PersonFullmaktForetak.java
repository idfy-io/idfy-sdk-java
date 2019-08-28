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
import io.idfy.information.models.PersonFullmaktPerson;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * PersonFullmaktForetak
 */
@JsonDeserialize(builder = PersonFullmaktForetak.Builder.class)
public class PersonFullmaktForetak  implements Serializable {
  private final Integer dunsnrField;  // Default value is: null

  private final Integer orgnrField;  // Default value is: null

  private final String navnField;  // Default value is: null

  private final String adresseField;  // Default value is: null

  private final Integer postnrField;  // Default value is: null

  private final String poststedField;  // Default value is: null

  private final String statusKodeField;  // Default value is: null

  private final String statusTekstField;  // Default value is: null

  private final String selskapsformField;  // Default value is: null

  private final String prokuraKodeField;  // Default value is: null

  private final String prokuraTekstField;  // Default value is: null

  private final String signaturKodeField;  // Default value is: null

  private final String signaturTekstField;  // Default value is: null

  private final List<PersonFullmaktPerson> fullmaktPersonField;  // Default value is: new ArrayList<>()

  private PersonFullmaktForetak(Builder builder) {
      dunsnrField = builder.dunsnrField;
      orgnrField = builder.orgnrField;
      navnField = builder.navnField;
      adresseField = builder.adresseField;
      postnrField = builder.postnrField;
      poststedField = builder.poststedField;
      statusKodeField = builder.statusKodeField;
      statusTekstField = builder.statusTekstField;
      selskapsformField = builder.selskapsformField;
      prokuraKodeField = builder.prokuraKodeField;
      prokuraTekstField = builder.prokuraTekstField;
      signaturKodeField = builder.signaturKodeField;
      signaturTekstField = builder.signaturTekstField;
      fullmaktPersonField = builder.fullmaktPersonField;
  }

      /**
      * Get dunsnrField
      * @return dunsnrField
      **/
      public Integer getDunsnrField() {return dunsnrField;}

      /**
      * Get orgnrField
      * @return orgnrField
      **/
      public Integer getOrgnrField() {return orgnrField;}

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
      * Get statusKodeField
      * @return statusKodeField
      **/
      public String getStatusKodeField() {return statusKodeField;}

      /**
      * Get statusTekstField
      * @return statusTekstField
      **/
      public String getStatusTekstField() {return statusTekstField;}

      /**
      * Get selskapsformField
      * @return selskapsformField
      **/
      public String getSelskapsformField() {return selskapsformField;}

      /**
      * Get prokuraKodeField
      * @return prokuraKodeField
      **/
      public String getProkuraKodeField() {return prokuraKodeField;}

      /**
      * Get prokuraTekstField
      * @return prokuraTekstField
      **/
      public String getProkuraTekstField() {return prokuraTekstField;}

      /**
      * Get signaturKodeField
      * @return signaturKodeField
      **/
      public String getSignaturKodeField() {return signaturKodeField;}

      /**
      * Get signaturTekstField
      * @return signaturTekstField
      **/
      public String getSignaturTekstField() {return signaturTekstField;}

      /**
      * Get fullmaktPersonField
      * @return fullmaktPersonField
      **/
      public List<PersonFullmaktPerson> getFullmaktPersonField() {return fullmaktPersonField;}


  public static final class Builder {
      private Integer dunsnrField;
      private Integer orgnrField;
      private String navnField;
      private String adresseField;
      private Integer postnrField;
      private String poststedField;
      private String statusKodeField;
      private String statusTekstField;
      private String selskapsformField;
      private String prokuraKodeField;
      private String prokuraTekstField;
      private String signaturKodeField;
      private String signaturTekstField;
      private List<PersonFullmaktPerson> fullmaktPersonField;

    public Builder() {
    }

    public Builder(PersonFullmaktForetak copy) {
        this.dunsnrField = copy.getDunsnrField();
        this.orgnrField = copy.getOrgnrField();
        this.navnField = copy.getNavnField();
        this.adresseField = copy.getAdresseField();
        this.postnrField = copy.getPostnrField();
        this.poststedField = copy.getPoststedField();
        this.statusKodeField = copy.getStatusKodeField();
        this.statusTekstField = copy.getStatusTekstField();
        this.selskapsformField = copy.getSelskapsformField();
        this.prokuraKodeField = copy.getProkuraKodeField();
        this.prokuraTekstField = copy.getProkuraTekstField();
        this.signaturKodeField = copy.getSignaturKodeField();
        this.signaturTekstField = copy.getSignaturTekstField();
        this.fullmaktPersonField = copy.getFullmaktPersonField();
    }

    public Builder withDunsnrField(Integer dunsnrField) {
      this.dunsnrField = dunsnrField;
      return this;
    }

    public Builder withOrgnrField(Integer orgnrField) {
      this.orgnrField = orgnrField;
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

    public Builder withStatusKodeField(String statusKodeField) {
      this.statusKodeField = statusKodeField;
      return this;
    }

    public Builder withStatusTekstField(String statusTekstField) {
      this.statusTekstField = statusTekstField;
      return this;
    }

    public Builder withSelskapsformField(String selskapsformField) {
      this.selskapsformField = selskapsformField;
      return this;
    }

    public Builder withProkuraKodeField(String prokuraKodeField) {
      this.prokuraKodeField = prokuraKodeField;
      return this;
    }

    public Builder withProkuraTekstField(String prokuraTekstField) {
      this.prokuraTekstField = prokuraTekstField;
      return this;
    }

    public Builder withSignaturKodeField(String signaturKodeField) {
      this.signaturKodeField = signaturKodeField;
      return this;
    }

    public Builder withSignaturTekstField(String signaturTekstField) {
      this.signaturTekstField = signaturTekstField;
      return this;
    }

    public Builder withFullmaktPersonField(List<PersonFullmaktPerson> fullmaktPersonField) {
      this.fullmaktPersonField = fullmaktPersonField;
      return this;
    }

    public Builder addFullmaktPersonFieldItem(PersonFullmaktPerson fullmaktPersonFieldItem) {
      if (this.fullmaktPersonField == null) {
        this.fullmaktPersonField = new ArrayList<>();
      }
      this.fullmaktPersonField.add(fullmaktPersonFieldItem);
      return this;
    }


    public PersonFullmaktForetak build() { return new PersonFullmaktForetak(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonFullmaktForetak personFullmaktForetak = (PersonFullmaktForetak) o;
    return Objects.equals(this.dunsnrField, personFullmaktForetak.dunsnrField) &&
        Objects.equals(this.orgnrField, personFullmaktForetak.orgnrField) &&
        Objects.equals(this.navnField, personFullmaktForetak.navnField) &&
        Objects.equals(this.adresseField, personFullmaktForetak.adresseField) &&
        Objects.equals(this.postnrField, personFullmaktForetak.postnrField) &&
        Objects.equals(this.poststedField, personFullmaktForetak.poststedField) &&
        Objects.equals(this.statusKodeField, personFullmaktForetak.statusKodeField) &&
        Objects.equals(this.statusTekstField, personFullmaktForetak.statusTekstField) &&
        Objects.equals(this.selskapsformField, personFullmaktForetak.selskapsformField) &&
        Objects.equals(this.prokuraKodeField, personFullmaktForetak.prokuraKodeField) &&
        Objects.equals(this.prokuraTekstField, personFullmaktForetak.prokuraTekstField) &&
        Objects.equals(this.signaturKodeField, personFullmaktForetak.signaturKodeField) &&
        Objects.equals(this.signaturTekstField, personFullmaktForetak.signaturTekstField) &&
        Objects.equals(this.fullmaktPersonField, personFullmaktForetak.fullmaktPersonField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dunsnrField, orgnrField, navnField, adresseField, postnrField, poststedField, statusKodeField, statusTekstField, selskapsformField, prokuraKodeField, prokuraTekstField, signaturKodeField, signaturTekstField, fullmaktPersonField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonFullmaktForetak {\n");
    
    sb.append("    dunsnrField: ").append(toIndentedString(dunsnrField)).append("\n");
    sb.append("    orgnrField: ").append(toIndentedString(orgnrField)).append("\n");
    sb.append("    navnField: ").append(toIndentedString(navnField)).append("\n");
    sb.append("    adresseField: ").append(toIndentedString(adresseField)).append("\n");
    sb.append("    postnrField: ").append(toIndentedString(postnrField)).append("\n");
    sb.append("    poststedField: ").append(toIndentedString(poststedField)).append("\n");
    sb.append("    statusKodeField: ").append(toIndentedString(statusKodeField)).append("\n");
    sb.append("    statusTekstField: ").append(toIndentedString(statusTekstField)).append("\n");
    sb.append("    selskapsformField: ").append(toIndentedString(selskapsformField)).append("\n");
    sb.append("    prokuraKodeField: ").append(toIndentedString(prokuraKodeField)).append("\n");
    sb.append("    prokuraTekstField: ").append(toIndentedString(prokuraTekstField)).append("\n");
    sb.append("    signaturKodeField: ").append(toIndentedString(signaturKodeField)).append("\n");
    sb.append("    signaturTekstField: ").append(toIndentedString(signaturTekstField)).append("\n");
    sb.append("    fullmaktPersonField: ").append(toIndentedString(fullmaktPersonField)).append("\n");
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
