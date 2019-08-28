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
import io.idfy.information.models.PersonBetaDetaljer;
import io.idfy.information.models.PersonBetaSammendrag;
import io.idfy.information.models.PersonDelomrader;
import io.idfy.information.models.PersonDisponibelInntekt;
import io.idfy.information.models.PersonEiendomListe;
import io.idfy.information.models.PersonEiendomNorge;
import io.idfy.information.models.PersonFullmaktForetak;
import io.idfy.information.models.PersonIdentifikasjon;
import io.idfy.information.models.PersonLigning;
import io.idfy.information.models.PersonLosore;
import io.idfy.information.models.PersonMeldinger;
import io.idfy.information.models.PersonNaringsInteresser;
import io.idfy.information.models.PersonNavnAdresse;
import io.idfy.information.models.PersonScoring;
import io.idfy.information.models.PersonTidligereNavnAdresse;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * PersonHentPersonResponse
 */
@JsonDeserialize(builder = PersonHentPersonResponse.Builder.class)
public class PersonHentPersonResponse  implements Serializable {
  private final PersonIdentifikasjon identifikasjonField;  // Default value is: null

  private final PersonNavnAdresse navnAdresseField;  // Default value is: null

  private final PersonScoring scoringField;  // Default value is: null

  private final List<PersonDelomrader> delomraderField;  // Default value is: new ArrayList<>()

  private final PersonBetaSammendrag betaSammendragField;  // Default value is: null

  private final List<PersonBetaDetaljer> betaDetaljerField;  // Default value is: new ArrayList<>()

  private final List<PersonLigning> ligningField;  // Default value is: new ArrayList<>()

  private final List<PersonDisponibelInntekt> disponibelInntektField;  // Default value is: new ArrayList<>()

  private final List<PersonNaringsInteresser> naringsInteresserField;  // Default value is: new ArrayList<>()

  private final PersonEiendomNorge eiendomNorgeField;  // Default value is: null

  private final List<PersonEiendomListe> eiendomListeField;  // Default value is: new ArrayList<>()

  private final List<PersonLosore> losoreField;  // Default value is: new ArrayList<>()

  private final List<PersonTidligereNavnAdresse> tidligereNavnAdresseField;  // Default value is: new ArrayList<>()

  private final List<PersonFullmaktForetak> fullmaktForetakField;  // Default value is: new ArrayList<>()

  private final List<PersonMeldinger> meldingerField;  // Default value is: new ArrayList<>()

  private PersonHentPersonResponse(Builder builder) {
      identifikasjonField = builder.identifikasjonField;
      navnAdresseField = builder.navnAdresseField;
      scoringField = builder.scoringField;
      delomraderField = builder.delomraderField;
      betaSammendragField = builder.betaSammendragField;
      betaDetaljerField = builder.betaDetaljerField;
      ligningField = builder.ligningField;
      disponibelInntektField = builder.disponibelInntektField;
      naringsInteresserField = builder.naringsInteresserField;
      eiendomNorgeField = builder.eiendomNorgeField;
      eiendomListeField = builder.eiendomListeField;
      losoreField = builder.losoreField;
      tidligereNavnAdresseField = builder.tidligereNavnAdresseField;
      fullmaktForetakField = builder.fullmaktForetakField;
      meldingerField = builder.meldingerField;
  }

      /**
      * Get identifikasjonField
      * @return identifikasjonField
      **/
      public PersonIdentifikasjon getIdentifikasjonField() {return identifikasjonField;}

      /**
      * Get navnAdresseField
      * @return navnAdresseField
      **/
      public PersonNavnAdresse getNavnAdresseField() {return navnAdresseField;}

      /**
      * Get scoringField
      * @return scoringField
      **/
      public PersonScoring getScoringField() {return scoringField;}

      /**
      * Get delomraderField
      * @return delomraderField
      **/
      public List<PersonDelomrader> getDelomraderField() {return delomraderField;}

      /**
      * Get betaSammendragField
      * @return betaSammendragField
      **/
      public PersonBetaSammendrag getBetaSammendragField() {return betaSammendragField;}

      /**
      * Get betaDetaljerField
      * @return betaDetaljerField
      **/
      public List<PersonBetaDetaljer> getBetaDetaljerField() {return betaDetaljerField;}

      /**
      * Get ligningField
      * @return ligningField
      **/
      public List<PersonLigning> getLigningField() {return ligningField;}

      /**
      * Get disponibelInntektField
      * @return disponibelInntektField
      **/
      public List<PersonDisponibelInntekt> getDisponibelInntektField() {return disponibelInntektField;}

      /**
      * Get naringsInteresserField
      * @return naringsInteresserField
      **/
      public List<PersonNaringsInteresser> getNaringsInteresserField() {return naringsInteresserField;}

      /**
      * Get eiendomNorgeField
      * @return eiendomNorgeField
      **/
      public PersonEiendomNorge getEiendomNorgeField() {return eiendomNorgeField;}

      /**
      * Get eiendomListeField
      * @return eiendomListeField
      **/
      public List<PersonEiendomListe> getEiendomListeField() {return eiendomListeField;}

      /**
      * Get losoreField
      * @return losoreField
      **/
      public List<PersonLosore> getLosoreField() {return losoreField;}

      /**
      * Get tidligereNavnAdresseField
      * @return tidligereNavnAdresseField
      **/
      public List<PersonTidligereNavnAdresse> getTidligereNavnAdresseField() {return tidligereNavnAdresseField;}

      /**
      * Get fullmaktForetakField
      * @return fullmaktForetakField
      **/
      public List<PersonFullmaktForetak> getFullmaktForetakField() {return fullmaktForetakField;}

      /**
      * Get meldingerField
      * @return meldingerField
      **/
      public List<PersonMeldinger> getMeldingerField() {return meldingerField;}


  public static final class Builder {
      private PersonIdentifikasjon identifikasjonField;
      private PersonNavnAdresse navnAdresseField;
      private PersonScoring scoringField;
      private List<PersonDelomrader> delomraderField;
      private PersonBetaSammendrag betaSammendragField;
      private List<PersonBetaDetaljer> betaDetaljerField;
      private List<PersonLigning> ligningField;
      private List<PersonDisponibelInntekt> disponibelInntektField;
      private List<PersonNaringsInteresser> naringsInteresserField;
      private PersonEiendomNorge eiendomNorgeField;
      private List<PersonEiendomListe> eiendomListeField;
      private List<PersonLosore> losoreField;
      private List<PersonTidligereNavnAdresse> tidligereNavnAdresseField;
      private List<PersonFullmaktForetak> fullmaktForetakField;
      private List<PersonMeldinger> meldingerField;

    public Builder() {
    }

    public Builder(PersonHentPersonResponse copy) {
        this.identifikasjonField = copy.getIdentifikasjonField();
        this.navnAdresseField = copy.getNavnAdresseField();
        this.scoringField = copy.getScoringField();
        this.delomraderField = copy.getDelomraderField();
        this.betaSammendragField = copy.getBetaSammendragField();
        this.betaDetaljerField = copy.getBetaDetaljerField();
        this.ligningField = copy.getLigningField();
        this.disponibelInntektField = copy.getDisponibelInntektField();
        this.naringsInteresserField = copy.getNaringsInteresserField();
        this.eiendomNorgeField = copy.getEiendomNorgeField();
        this.eiendomListeField = copy.getEiendomListeField();
        this.losoreField = copy.getLosoreField();
        this.tidligereNavnAdresseField = copy.getTidligereNavnAdresseField();
        this.fullmaktForetakField = copy.getFullmaktForetakField();
        this.meldingerField = copy.getMeldingerField();
    }

    public Builder withIdentifikasjonField(PersonIdentifikasjon identifikasjonField) {
      this.identifikasjonField = identifikasjonField;
      return this;
    }

    public Builder withNavnAdresseField(PersonNavnAdresse navnAdresseField) {
      this.navnAdresseField = navnAdresseField;
      return this;
    }

    public Builder withScoringField(PersonScoring scoringField) {
      this.scoringField = scoringField;
      return this;
    }

    public Builder withDelomraderField(List<PersonDelomrader> delomraderField) {
      this.delomraderField = delomraderField;
      return this;
    }

    public Builder addDelomraderFieldItem(PersonDelomrader delomraderFieldItem) {
      if (this.delomraderField == null) {
        this.delomraderField = new ArrayList<>();
      }
      this.delomraderField.add(delomraderFieldItem);
      return this;
    }

    public Builder withBetaSammendragField(PersonBetaSammendrag betaSammendragField) {
      this.betaSammendragField = betaSammendragField;
      return this;
    }

    public Builder withBetaDetaljerField(List<PersonBetaDetaljer> betaDetaljerField) {
      this.betaDetaljerField = betaDetaljerField;
      return this;
    }

    public Builder addBetaDetaljerFieldItem(PersonBetaDetaljer betaDetaljerFieldItem) {
      if (this.betaDetaljerField == null) {
        this.betaDetaljerField = new ArrayList<>();
      }
      this.betaDetaljerField.add(betaDetaljerFieldItem);
      return this;
    }

    public Builder withLigningField(List<PersonLigning> ligningField) {
      this.ligningField = ligningField;
      return this;
    }

    public Builder addLigningFieldItem(PersonLigning ligningFieldItem) {
      if (this.ligningField == null) {
        this.ligningField = new ArrayList<>();
      }
      this.ligningField.add(ligningFieldItem);
      return this;
    }

    public Builder withDisponibelInntektField(List<PersonDisponibelInntekt> disponibelInntektField) {
      this.disponibelInntektField = disponibelInntektField;
      return this;
    }

    public Builder addDisponibelInntektFieldItem(PersonDisponibelInntekt disponibelInntektFieldItem) {
      if (this.disponibelInntektField == null) {
        this.disponibelInntektField = new ArrayList<>();
      }
      this.disponibelInntektField.add(disponibelInntektFieldItem);
      return this;
    }

    public Builder withNaringsInteresserField(List<PersonNaringsInteresser> naringsInteresserField) {
      this.naringsInteresserField = naringsInteresserField;
      return this;
    }

    public Builder addNaringsInteresserFieldItem(PersonNaringsInteresser naringsInteresserFieldItem) {
      if (this.naringsInteresserField == null) {
        this.naringsInteresserField = new ArrayList<>();
      }
      this.naringsInteresserField.add(naringsInteresserFieldItem);
      return this;
    }

    public Builder withEiendomNorgeField(PersonEiendomNorge eiendomNorgeField) {
      this.eiendomNorgeField = eiendomNorgeField;
      return this;
    }

    public Builder withEiendomListeField(List<PersonEiendomListe> eiendomListeField) {
      this.eiendomListeField = eiendomListeField;
      return this;
    }

    public Builder addEiendomListeFieldItem(PersonEiendomListe eiendomListeFieldItem) {
      if (this.eiendomListeField == null) {
        this.eiendomListeField = new ArrayList<>();
      }
      this.eiendomListeField.add(eiendomListeFieldItem);
      return this;
    }

    public Builder withLosoreField(List<PersonLosore> losoreField) {
      this.losoreField = losoreField;
      return this;
    }

    public Builder addLosoreFieldItem(PersonLosore losoreFieldItem) {
      if (this.losoreField == null) {
        this.losoreField = new ArrayList<>();
      }
      this.losoreField.add(losoreFieldItem);
      return this;
    }

    public Builder withTidligereNavnAdresseField(List<PersonTidligereNavnAdresse> tidligereNavnAdresseField) {
      this.tidligereNavnAdresseField = tidligereNavnAdresseField;
      return this;
    }

    public Builder addTidligereNavnAdresseFieldItem(PersonTidligereNavnAdresse tidligereNavnAdresseFieldItem) {
      if (this.tidligereNavnAdresseField == null) {
        this.tidligereNavnAdresseField = new ArrayList<>();
      }
      this.tidligereNavnAdresseField.add(tidligereNavnAdresseFieldItem);
      return this;
    }

    public Builder withFullmaktForetakField(List<PersonFullmaktForetak> fullmaktForetakField) {
      this.fullmaktForetakField = fullmaktForetakField;
      return this;
    }

    public Builder addFullmaktForetakFieldItem(PersonFullmaktForetak fullmaktForetakFieldItem) {
      if (this.fullmaktForetakField == null) {
        this.fullmaktForetakField = new ArrayList<>();
      }
      this.fullmaktForetakField.add(fullmaktForetakFieldItem);
      return this;
    }

    public Builder withMeldingerField(List<PersonMeldinger> meldingerField) {
      this.meldingerField = meldingerField;
      return this;
    }

    public Builder addMeldingerFieldItem(PersonMeldinger meldingerFieldItem) {
      if (this.meldingerField == null) {
        this.meldingerField = new ArrayList<>();
      }
      this.meldingerField.add(meldingerFieldItem);
      return this;
    }


    public PersonHentPersonResponse build() { return new PersonHentPersonResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonHentPersonResponse personHentPersonResponse = (PersonHentPersonResponse) o;
    return Objects.equals(this.identifikasjonField, personHentPersonResponse.identifikasjonField) &&
        Objects.equals(this.navnAdresseField, personHentPersonResponse.navnAdresseField) &&
        Objects.equals(this.scoringField, personHentPersonResponse.scoringField) &&
        Objects.equals(this.delomraderField, personHentPersonResponse.delomraderField) &&
        Objects.equals(this.betaSammendragField, personHentPersonResponse.betaSammendragField) &&
        Objects.equals(this.betaDetaljerField, personHentPersonResponse.betaDetaljerField) &&
        Objects.equals(this.ligningField, personHentPersonResponse.ligningField) &&
        Objects.equals(this.disponibelInntektField, personHentPersonResponse.disponibelInntektField) &&
        Objects.equals(this.naringsInteresserField, personHentPersonResponse.naringsInteresserField) &&
        Objects.equals(this.eiendomNorgeField, personHentPersonResponse.eiendomNorgeField) &&
        Objects.equals(this.eiendomListeField, personHentPersonResponse.eiendomListeField) &&
        Objects.equals(this.losoreField, personHentPersonResponse.losoreField) &&
        Objects.equals(this.tidligereNavnAdresseField, personHentPersonResponse.tidligereNavnAdresseField) &&
        Objects.equals(this.fullmaktForetakField, personHentPersonResponse.fullmaktForetakField) &&
        Objects.equals(this.meldingerField, personHentPersonResponse.meldingerField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifikasjonField, navnAdresseField, scoringField, delomraderField, betaSammendragField, betaDetaljerField, ligningField, disponibelInntektField, naringsInteresserField, eiendomNorgeField, eiendomListeField, losoreField, tidligereNavnAdresseField, fullmaktForetakField, meldingerField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonHentPersonResponse {\n");
    
    sb.append("    identifikasjonField: ").append(toIndentedString(identifikasjonField)).append("\n");
    sb.append("    navnAdresseField: ").append(toIndentedString(navnAdresseField)).append("\n");
    sb.append("    scoringField: ").append(toIndentedString(scoringField)).append("\n");
    sb.append("    delomraderField: ").append(toIndentedString(delomraderField)).append("\n");
    sb.append("    betaSammendragField: ").append(toIndentedString(betaSammendragField)).append("\n");
    sb.append("    betaDetaljerField: ").append(toIndentedString(betaDetaljerField)).append("\n");
    sb.append("    ligningField: ").append(toIndentedString(ligningField)).append("\n");
    sb.append("    disponibelInntektField: ").append(toIndentedString(disponibelInntektField)).append("\n");
    sb.append("    naringsInteresserField: ").append(toIndentedString(naringsInteresserField)).append("\n");
    sb.append("    eiendomNorgeField: ").append(toIndentedString(eiendomNorgeField)).append("\n");
    sb.append("    eiendomListeField: ").append(toIndentedString(eiendomListeField)).append("\n");
    sb.append("    losoreField: ").append(toIndentedString(losoreField)).append("\n");
    sb.append("    tidligereNavnAdresseField: ").append(toIndentedString(tidligereNavnAdresseField)).append("\n");
    sb.append("    fullmaktForetakField: ").append(toIndentedString(fullmaktForetakField)).append("\n");
    sb.append("    meldingerField: ").append(toIndentedString(meldingerField)).append("\n");
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
