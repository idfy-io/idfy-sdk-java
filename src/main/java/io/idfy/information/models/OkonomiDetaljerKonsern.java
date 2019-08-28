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
import java.io.Serializable;

/**
 * OkonomiDetaljerKonsern
 */
@JsonDeserialize(builder = OkonomiDetaljerKonsern.Builder.class)
public class OkonomiDetaljerKonsern  implements Serializable {
  private final Integer regnskapsAvArField;  // Default value is: null

  private final Integer regnskapsAvMndField;  // Default value is: null

  private final Long totalinntektField;  // Default value is: null

  private final Long salgsinntekterField;  // Default value is: null

  private final Long annenDriftsinntektField;  // Default value is: null

  private final Long varekostnadField;  // Default value is: null

  private final Long beholdningsendringField;  // Default value is: null

  private final Long lonnskostnadField;  // Default value is: null

  private final Long avskrivningerField;  // Default value is: null

  private final Long nedskrivningerField;  // Default value is: null

  private final Long annenDriftskostnadField;  // Default value is: null

  private final Long driftsResultatField;  // Default value is: null

  private final Long inntektInvDatterField;  // Default value is: null

  private final Long inntektInvKonsernField;  // Default value is: null

  private final Long inntektInvAnnenField;  // Default value is: null

  private final Long renteinntektKonsernField;  // Default value is: null

  private final Long renteinntektAnnenField;  // Default value is: null

  private final Long finansinntektAnnenField;  // Default value is: null

  private final Long finansinntektField;  // Default value is: null

  private final Long verdiendringMarFinOmlopsmidlerField;  // Default value is: null

  private final Long nedskrivningMarFinOmlopsmidlerField;  // Default value is: null

  private final Long nedskrivningFinAnleggsmidlerField;  // Default value is: null

  private final Long rentekostnadKonsernField;  // Default value is: null

  private final Long annenRentekostnadField;  // Default value is: null

  private final Long annenFinanskostnadField;  // Default value is: null

  private final Long finanskostnadField;  // Default value is: null

  private final Long ordResultatForSkattField;  // Default value is: null

  private final Long skattOrdResultatField;  // Default value is: null

  private final Long ordResultatField;  // Default value is: null

  private final Long ekstraordInntektField;  // Default value is: null

  private final Long ekstraordKostnadField;  // Default value is: null

  private final Long skattEkstraordResultatField;  // Default value is: null

  private final Long sumSkattField;  // Default value is: null

  private final Long minoritetsInteresserField;  // Default value is: null

  private final Long arsResultatField;  // Default value is: null

  private final Long konsernbidragField;  // Default value is: null

  private final Long utbytteField;  // Default value is: null

  private final Long tilFondVurdForField;  // Default value is: null

  private final Long tilAnnenEgenkapitalField;  // Default value is: null

  private final Long tapKravField;  // Default value is: null

  private OkonomiDetaljerKonsern(Builder builder) {
      regnskapsAvArField = builder.regnskapsAvArField;
      regnskapsAvMndField = builder.regnskapsAvMndField;
      totalinntektField = builder.totalinntektField;
      salgsinntekterField = builder.salgsinntekterField;
      annenDriftsinntektField = builder.annenDriftsinntektField;
      varekostnadField = builder.varekostnadField;
      beholdningsendringField = builder.beholdningsendringField;
      lonnskostnadField = builder.lonnskostnadField;
      avskrivningerField = builder.avskrivningerField;
      nedskrivningerField = builder.nedskrivningerField;
      annenDriftskostnadField = builder.annenDriftskostnadField;
      driftsResultatField = builder.driftsResultatField;
      inntektInvDatterField = builder.inntektInvDatterField;
      inntektInvKonsernField = builder.inntektInvKonsernField;
      inntektInvAnnenField = builder.inntektInvAnnenField;
      renteinntektKonsernField = builder.renteinntektKonsernField;
      renteinntektAnnenField = builder.renteinntektAnnenField;
      finansinntektAnnenField = builder.finansinntektAnnenField;
      finansinntektField = builder.finansinntektField;
      verdiendringMarFinOmlopsmidlerField = builder.verdiendringMarFinOmlopsmidlerField;
      nedskrivningMarFinOmlopsmidlerField = builder.nedskrivningMarFinOmlopsmidlerField;
      nedskrivningFinAnleggsmidlerField = builder.nedskrivningFinAnleggsmidlerField;
      rentekostnadKonsernField = builder.rentekostnadKonsernField;
      annenRentekostnadField = builder.annenRentekostnadField;
      annenFinanskostnadField = builder.annenFinanskostnadField;
      finanskostnadField = builder.finanskostnadField;
      ordResultatForSkattField = builder.ordResultatForSkattField;
      skattOrdResultatField = builder.skattOrdResultatField;
      ordResultatField = builder.ordResultatField;
      ekstraordInntektField = builder.ekstraordInntektField;
      ekstraordKostnadField = builder.ekstraordKostnadField;
      skattEkstraordResultatField = builder.skattEkstraordResultatField;
      sumSkattField = builder.sumSkattField;
      minoritetsInteresserField = builder.minoritetsInteresserField;
      arsResultatField = builder.arsResultatField;
      konsernbidragField = builder.konsernbidragField;
      utbytteField = builder.utbytteField;
      tilFondVurdForField = builder.tilFondVurdForField;
      tilAnnenEgenkapitalField = builder.tilAnnenEgenkapitalField;
      tapKravField = builder.tapKravField;
  }

      /**
      * Get regnskapsAvArField
      * @return regnskapsAvArField
      **/
      public Integer getRegnskapsAvArField() {return regnskapsAvArField;}

      /**
      * Get regnskapsAvMndField
      * @return regnskapsAvMndField
      **/
      public Integer getRegnskapsAvMndField() {return regnskapsAvMndField;}

      /**
      * Get totalinntektField
      * @return totalinntektField
      **/
      public Long getTotalinntektField() {return totalinntektField;}

      /**
      * Get salgsinntekterField
      * @return salgsinntekterField
      **/
      public Long getSalgsinntekterField() {return salgsinntekterField;}

      /**
      * Get annenDriftsinntektField
      * @return annenDriftsinntektField
      **/
      public Long getAnnenDriftsinntektField() {return annenDriftsinntektField;}

      /**
      * Get varekostnadField
      * @return varekostnadField
      **/
      public Long getVarekostnadField() {return varekostnadField;}

      /**
      * Get beholdningsendringField
      * @return beholdningsendringField
      **/
      public Long getBeholdningsendringField() {return beholdningsendringField;}

      /**
      * Get lonnskostnadField
      * @return lonnskostnadField
      **/
      public Long getLonnskostnadField() {return lonnskostnadField;}

      /**
      * Get avskrivningerField
      * @return avskrivningerField
      **/
      public Long getAvskrivningerField() {return avskrivningerField;}

      /**
      * Get nedskrivningerField
      * @return nedskrivningerField
      **/
      public Long getNedskrivningerField() {return nedskrivningerField;}

      /**
      * Get annenDriftskostnadField
      * @return annenDriftskostnadField
      **/
      public Long getAnnenDriftskostnadField() {return annenDriftskostnadField;}

      /**
      * Get driftsResultatField
      * @return driftsResultatField
      **/
      public Long getDriftsResultatField() {return driftsResultatField;}

      /**
      * Get inntektInvDatterField
      * @return inntektInvDatterField
      **/
      public Long getInntektInvDatterField() {return inntektInvDatterField;}

      /**
      * Get inntektInvKonsernField
      * @return inntektInvKonsernField
      **/
      public Long getInntektInvKonsernField() {return inntektInvKonsernField;}

      /**
      * Get inntektInvAnnenField
      * @return inntektInvAnnenField
      **/
      public Long getInntektInvAnnenField() {return inntektInvAnnenField;}

      /**
      * Get renteinntektKonsernField
      * @return renteinntektKonsernField
      **/
      public Long getRenteinntektKonsernField() {return renteinntektKonsernField;}

      /**
      * Get renteinntektAnnenField
      * @return renteinntektAnnenField
      **/
      public Long getRenteinntektAnnenField() {return renteinntektAnnenField;}

      /**
      * Get finansinntektAnnenField
      * @return finansinntektAnnenField
      **/
      public Long getFinansinntektAnnenField() {return finansinntektAnnenField;}

      /**
      * Get finansinntektField
      * @return finansinntektField
      **/
      public Long getFinansinntektField() {return finansinntektField;}

      /**
      * Get verdiendringMarFinOmlopsmidlerField
      * @return verdiendringMarFinOmlopsmidlerField
      **/
      public Long getVerdiendringMarFinOmlopsmidlerField() {return verdiendringMarFinOmlopsmidlerField;}

      /**
      * Get nedskrivningMarFinOmlopsmidlerField
      * @return nedskrivningMarFinOmlopsmidlerField
      **/
      public Long getNedskrivningMarFinOmlopsmidlerField() {return nedskrivningMarFinOmlopsmidlerField;}

      /**
      * Get nedskrivningFinAnleggsmidlerField
      * @return nedskrivningFinAnleggsmidlerField
      **/
      public Long getNedskrivningFinAnleggsmidlerField() {return nedskrivningFinAnleggsmidlerField;}

      /**
      * Get rentekostnadKonsernField
      * @return rentekostnadKonsernField
      **/
      public Long getRentekostnadKonsernField() {return rentekostnadKonsernField;}

      /**
      * Get annenRentekostnadField
      * @return annenRentekostnadField
      **/
      public Long getAnnenRentekostnadField() {return annenRentekostnadField;}

      /**
      * Get annenFinanskostnadField
      * @return annenFinanskostnadField
      **/
      public Long getAnnenFinanskostnadField() {return annenFinanskostnadField;}

      /**
      * Get finanskostnadField
      * @return finanskostnadField
      **/
      public Long getFinanskostnadField() {return finanskostnadField;}

      /**
      * Get ordResultatForSkattField
      * @return ordResultatForSkattField
      **/
      public Long getOrdResultatForSkattField() {return ordResultatForSkattField;}

      /**
      * Get skattOrdResultatField
      * @return skattOrdResultatField
      **/
      public Long getSkattOrdResultatField() {return skattOrdResultatField;}

      /**
      * Get ordResultatField
      * @return ordResultatField
      **/
      public Long getOrdResultatField() {return ordResultatField;}

      /**
      * Get ekstraordInntektField
      * @return ekstraordInntektField
      **/
      public Long getEkstraordInntektField() {return ekstraordInntektField;}

      /**
      * Get ekstraordKostnadField
      * @return ekstraordKostnadField
      **/
      public Long getEkstraordKostnadField() {return ekstraordKostnadField;}

      /**
      * Get skattEkstraordResultatField
      * @return skattEkstraordResultatField
      **/
      public Long getSkattEkstraordResultatField() {return skattEkstraordResultatField;}

      /**
      * Get sumSkattField
      * @return sumSkattField
      **/
      public Long getSumSkattField() {return sumSkattField;}

      /**
      * Get minoritetsInteresserField
      * @return minoritetsInteresserField
      **/
      public Long getMinoritetsInteresserField() {return minoritetsInteresserField;}

      /**
      * Get arsResultatField
      * @return arsResultatField
      **/
      public Long getArsResultatField() {return arsResultatField;}

      /**
      * Get konsernbidragField
      * @return konsernbidragField
      **/
      public Long getKonsernbidragField() {return konsernbidragField;}

      /**
      * Get utbytteField
      * @return utbytteField
      **/
      public Long getUtbytteField() {return utbytteField;}

      /**
      * Get tilFondVurdForField
      * @return tilFondVurdForField
      **/
      public Long getTilFondVurdForField() {return tilFondVurdForField;}

      /**
      * Get tilAnnenEgenkapitalField
      * @return tilAnnenEgenkapitalField
      **/
      public Long getTilAnnenEgenkapitalField() {return tilAnnenEgenkapitalField;}

      /**
      * Get tapKravField
      * @return tapKravField
      **/
      public Long getTapKravField() {return tapKravField;}


  public static final class Builder {
      private Integer regnskapsAvArField;
      private Integer regnskapsAvMndField;
      private Long totalinntektField;
      private Long salgsinntekterField;
      private Long annenDriftsinntektField;
      private Long varekostnadField;
      private Long beholdningsendringField;
      private Long lonnskostnadField;
      private Long avskrivningerField;
      private Long nedskrivningerField;
      private Long annenDriftskostnadField;
      private Long driftsResultatField;
      private Long inntektInvDatterField;
      private Long inntektInvKonsernField;
      private Long inntektInvAnnenField;
      private Long renteinntektKonsernField;
      private Long renteinntektAnnenField;
      private Long finansinntektAnnenField;
      private Long finansinntektField;
      private Long verdiendringMarFinOmlopsmidlerField;
      private Long nedskrivningMarFinOmlopsmidlerField;
      private Long nedskrivningFinAnleggsmidlerField;
      private Long rentekostnadKonsernField;
      private Long annenRentekostnadField;
      private Long annenFinanskostnadField;
      private Long finanskostnadField;
      private Long ordResultatForSkattField;
      private Long skattOrdResultatField;
      private Long ordResultatField;
      private Long ekstraordInntektField;
      private Long ekstraordKostnadField;
      private Long skattEkstraordResultatField;
      private Long sumSkattField;
      private Long minoritetsInteresserField;
      private Long arsResultatField;
      private Long konsernbidragField;
      private Long utbytteField;
      private Long tilFondVurdForField;
      private Long tilAnnenEgenkapitalField;
      private Long tapKravField;

    public Builder() {
    }

    public Builder(OkonomiDetaljerKonsern copy) {
        this.regnskapsAvArField = copy.getRegnskapsAvArField();
        this.regnskapsAvMndField = copy.getRegnskapsAvMndField();
        this.totalinntektField = copy.getTotalinntektField();
        this.salgsinntekterField = copy.getSalgsinntekterField();
        this.annenDriftsinntektField = copy.getAnnenDriftsinntektField();
        this.varekostnadField = copy.getVarekostnadField();
        this.beholdningsendringField = copy.getBeholdningsendringField();
        this.lonnskostnadField = copy.getLonnskostnadField();
        this.avskrivningerField = copy.getAvskrivningerField();
        this.nedskrivningerField = copy.getNedskrivningerField();
        this.annenDriftskostnadField = copy.getAnnenDriftskostnadField();
        this.driftsResultatField = copy.getDriftsResultatField();
        this.inntektInvDatterField = copy.getInntektInvDatterField();
        this.inntektInvKonsernField = copy.getInntektInvKonsernField();
        this.inntektInvAnnenField = copy.getInntektInvAnnenField();
        this.renteinntektKonsernField = copy.getRenteinntektKonsernField();
        this.renteinntektAnnenField = copy.getRenteinntektAnnenField();
        this.finansinntektAnnenField = copy.getFinansinntektAnnenField();
        this.finansinntektField = copy.getFinansinntektField();
        this.verdiendringMarFinOmlopsmidlerField = copy.getVerdiendringMarFinOmlopsmidlerField();
        this.nedskrivningMarFinOmlopsmidlerField = copy.getNedskrivningMarFinOmlopsmidlerField();
        this.nedskrivningFinAnleggsmidlerField = copy.getNedskrivningFinAnleggsmidlerField();
        this.rentekostnadKonsernField = copy.getRentekostnadKonsernField();
        this.annenRentekostnadField = copy.getAnnenRentekostnadField();
        this.annenFinanskostnadField = copy.getAnnenFinanskostnadField();
        this.finanskostnadField = copy.getFinanskostnadField();
        this.ordResultatForSkattField = copy.getOrdResultatForSkattField();
        this.skattOrdResultatField = copy.getSkattOrdResultatField();
        this.ordResultatField = copy.getOrdResultatField();
        this.ekstraordInntektField = copy.getEkstraordInntektField();
        this.ekstraordKostnadField = copy.getEkstraordKostnadField();
        this.skattEkstraordResultatField = copy.getSkattEkstraordResultatField();
        this.sumSkattField = copy.getSumSkattField();
        this.minoritetsInteresserField = copy.getMinoritetsInteresserField();
        this.arsResultatField = copy.getArsResultatField();
        this.konsernbidragField = copy.getKonsernbidragField();
        this.utbytteField = copy.getUtbytteField();
        this.tilFondVurdForField = copy.getTilFondVurdForField();
        this.tilAnnenEgenkapitalField = copy.getTilAnnenEgenkapitalField();
        this.tapKravField = copy.getTapKravField();
    }

    public Builder withRegnskapsAvArField(Integer regnskapsAvArField) {
      this.regnskapsAvArField = regnskapsAvArField;
      return this;
    }

    public Builder withRegnskapsAvMndField(Integer regnskapsAvMndField) {
      this.regnskapsAvMndField = regnskapsAvMndField;
      return this;
    }

    public Builder withTotalinntektField(Long totalinntektField) {
      this.totalinntektField = totalinntektField;
      return this;
    }

    public Builder withSalgsinntekterField(Long salgsinntekterField) {
      this.salgsinntekterField = salgsinntekterField;
      return this;
    }

    public Builder withAnnenDriftsinntektField(Long annenDriftsinntektField) {
      this.annenDriftsinntektField = annenDriftsinntektField;
      return this;
    }

    public Builder withVarekostnadField(Long varekostnadField) {
      this.varekostnadField = varekostnadField;
      return this;
    }

    public Builder withBeholdningsendringField(Long beholdningsendringField) {
      this.beholdningsendringField = beholdningsendringField;
      return this;
    }

    public Builder withLonnskostnadField(Long lonnskostnadField) {
      this.lonnskostnadField = lonnskostnadField;
      return this;
    }

    public Builder withAvskrivningerField(Long avskrivningerField) {
      this.avskrivningerField = avskrivningerField;
      return this;
    }

    public Builder withNedskrivningerField(Long nedskrivningerField) {
      this.nedskrivningerField = nedskrivningerField;
      return this;
    }

    public Builder withAnnenDriftskostnadField(Long annenDriftskostnadField) {
      this.annenDriftskostnadField = annenDriftskostnadField;
      return this;
    }

    public Builder withDriftsResultatField(Long driftsResultatField) {
      this.driftsResultatField = driftsResultatField;
      return this;
    }

    public Builder withInntektInvDatterField(Long inntektInvDatterField) {
      this.inntektInvDatterField = inntektInvDatterField;
      return this;
    }

    public Builder withInntektInvKonsernField(Long inntektInvKonsernField) {
      this.inntektInvKonsernField = inntektInvKonsernField;
      return this;
    }

    public Builder withInntektInvAnnenField(Long inntektInvAnnenField) {
      this.inntektInvAnnenField = inntektInvAnnenField;
      return this;
    }

    public Builder withRenteinntektKonsernField(Long renteinntektKonsernField) {
      this.renteinntektKonsernField = renteinntektKonsernField;
      return this;
    }

    public Builder withRenteinntektAnnenField(Long renteinntektAnnenField) {
      this.renteinntektAnnenField = renteinntektAnnenField;
      return this;
    }

    public Builder withFinansinntektAnnenField(Long finansinntektAnnenField) {
      this.finansinntektAnnenField = finansinntektAnnenField;
      return this;
    }

    public Builder withFinansinntektField(Long finansinntektField) {
      this.finansinntektField = finansinntektField;
      return this;
    }

    public Builder withVerdiendringMarFinOmlopsmidlerField(Long verdiendringMarFinOmlopsmidlerField) {
      this.verdiendringMarFinOmlopsmidlerField = verdiendringMarFinOmlopsmidlerField;
      return this;
    }

    public Builder withNedskrivningMarFinOmlopsmidlerField(Long nedskrivningMarFinOmlopsmidlerField) {
      this.nedskrivningMarFinOmlopsmidlerField = nedskrivningMarFinOmlopsmidlerField;
      return this;
    }

    public Builder withNedskrivningFinAnleggsmidlerField(Long nedskrivningFinAnleggsmidlerField) {
      this.nedskrivningFinAnleggsmidlerField = nedskrivningFinAnleggsmidlerField;
      return this;
    }

    public Builder withRentekostnadKonsernField(Long rentekostnadKonsernField) {
      this.rentekostnadKonsernField = rentekostnadKonsernField;
      return this;
    }

    public Builder withAnnenRentekostnadField(Long annenRentekostnadField) {
      this.annenRentekostnadField = annenRentekostnadField;
      return this;
    }

    public Builder withAnnenFinanskostnadField(Long annenFinanskostnadField) {
      this.annenFinanskostnadField = annenFinanskostnadField;
      return this;
    }

    public Builder withFinanskostnadField(Long finanskostnadField) {
      this.finanskostnadField = finanskostnadField;
      return this;
    }

    public Builder withOrdResultatForSkattField(Long ordResultatForSkattField) {
      this.ordResultatForSkattField = ordResultatForSkattField;
      return this;
    }

    public Builder withSkattOrdResultatField(Long skattOrdResultatField) {
      this.skattOrdResultatField = skattOrdResultatField;
      return this;
    }

    public Builder withOrdResultatField(Long ordResultatField) {
      this.ordResultatField = ordResultatField;
      return this;
    }

    public Builder withEkstraordInntektField(Long ekstraordInntektField) {
      this.ekstraordInntektField = ekstraordInntektField;
      return this;
    }

    public Builder withEkstraordKostnadField(Long ekstraordKostnadField) {
      this.ekstraordKostnadField = ekstraordKostnadField;
      return this;
    }

    public Builder withSkattEkstraordResultatField(Long skattEkstraordResultatField) {
      this.skattEkstraordResultatField = skattEkstraordResultatField;
      return this;
    }

    public Builder withSumSkattField(Long sumSkattField) {
      this.sumSkattField = sumSkattField;
      return this;
    }

    public Builder withMinoritetsInteresserField(Long minoritetsInteresserField) {
      this.minoritetsInteresserField = minoritetsInteresserField;
      return this;
    }

    public Builder withArsResultatField(Long arsResultatField) {
      this.arsResultatField = arsResultatField;
      return this;
    }

    public Builder withKonsernbidragField(Long konsernbidragField) {
      this.konsernbidragField = konsernbidragField;
      return this;
    }

    public Builder withUtbytteField(Long utbytteField) {
      this.utbytteField = utbytteField;
      return this;
    }

    public Builder withTilFondVurdForField(Long tilFondVurdForField) {
      this.tilFondVurdForField = tilFondVurdForField;
      return this;
    }

    public Builder withTilAnnenEgenkapitalField(Long tilAnnenEgenkapitalField) {
      this.tilAnnenEgenkapitalField = tilAnnenEgenkapitalField;
      return this;
    }

    public Builder withTapKravField(Long tapKravField) {
      this.tapKravField = tapKravField;
      return this;
    }


    public OkonomiDetaljerKonsern build() { return new OkonomiDetaljerKonsern(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OkonomiDetaljerKonsern okonomiDetaljerKonsern = (OkonomiDetaljerKonsern) o;
    return Objects.equals(this.regnskapsAvArField, okonomiDetaljerKonsern.regnskapsAvArField) &&
        Objects.equals(this.regnskapsAvMndField, okonomiDetaljerKonsern.regnskapsAvMndField) &&
        Objects.equals(this.totalinntektField, okonomiDetaljerKonsern.totalinntektField) &&
        Objects.equals(this.salgsinntekterField, okonomiDetaljerKonsern.salgsinntekterField) &&
        Objects.equals(this.annenDriftsinntektField, okonomiDetaljerKonsern.annenDriftsinntektField) &&
        Objects.equals(this.varekostnadField, okonomiDetaljerKonsern.varekostnadField) &&
        Objects.equals(this.beholdningsendringField, okonomiDetaljerKonsern.beholdningsendringField) &&
        Objects.equals(this.lonnskostnadField, okonomiDetaljerKonsern.lonnskostnadField) &&
        Objects.equals(this.avskrivningerField, okonomiDetaljerKonsern.avskrivningerField) &&
        Objects.equals(this.nedskrivningerField, okonomiDetaljerKonsern.nedskrivningerField) &&
        Objects.equals(this.annenDriftskostnadField, okonomiDetaljerKonsern.annenDriftskostnadField) &&
        Objects.equals(this.driftsResultatField, okonomiDetaljerKonsern.driftsResultatField) &&
        Objects.equals(this.inntektInvDatterField, okonomiDetaljerKonsern.inntektInvDatterField) &&
        Objects.equals(this.inntektInvKonsernField, okonomiDetaljerKonsern.inntektInvKonsernField) &&
        Objects.equals(this.inntektInvAnnenField, okonomiDetaljerKonsern.inntektInvAnnenField) &&
        Objects.equals(this.renteinntektKonsernField, okonomiDetaljerKonsern.renteinntektKonsernField) &&
        Objects.equals(this.renteinntektAnnenField, okonomiDetaljerKonsern.renteinntektAnnenField) &&
        Objects.equals(this.finansinntektAnnenField, okonomiDetaljerKonsern.finansinntektAnnenField) &&
        Objects.equals(this.finansinntektField, okonomiDetaljerKonsern.finansinntektField) &&
        Objects.equals(this.verdiendringMarFinOmlopsmidlerField, okonomiDetaljerKonsern.verdiendringMarFinOmlopsmidlerField) &&
        Objects.equals(this.nedskrivningMarFinOmlopsmidlerField, okonomiDetaljerKonsern.nedskrivningMarFinOmlopsmidlerField) &&
        Objects.equals(this.nedskrivningFinAnleggsmidlerField, okonomiDetaljerKonsern.nedskrivningFinAnleggsmidlerField) &&
        Objects.equals(this.rentekostnadKonsernField, okonomiDetaljerKonsern.rentekostnadKonsernField) &&
        Objects.equals(this.annenRentekostnadField, okonomiDetaljerKonsern.annenRentekostnadField) &&
        Objects.equals(this.annenFinanskostnadField, okonomiDetaljerKonsern.annenFinanskostnadField) &&
        Objects.equals(this.finanskostnadField, okonomiDetaljerKonsern.finanskostnadField) &&
        Objects.equals(this.ordResultatForSkattField, okonomiDetaljerKonsern.ordResultatForSkattField) &&
        Objects.equals(this.skattOrdResultatField, okonomiDetaljerKonsern.skattOrdResultatField) &&
        Objects.equals(this.ordResultatField, okonomiDetaljerKonsern.ordResultatField) &&
        Objects.equals(this.ekstraordInntektField, okonomiDetaljerKonsern.ekstraordInntektField) &&
        Objects.equals(this.ekstraordKostnadField, okonomiDetaljerKonsern.ekstraordKostnadField) &&
        Objects.equals(this.skattEkstraordResultatField, okonomiDetaljerKonsern.skattEkstraordResultatField) &&
        Objects.equals(this.sumSkattField, okonomiDetaljerKonsern.sumSkattField) &&
        Objects.equals(this.minoritetsInteresserField, okonomiDetaljerKonsern.minoritetsInteresserField) &&
        Objects.equals(this.arsResultatField, okonomiDetaljerKonsern.arsResultatField) &&
        Objects.equals(this.konsernbidragField, okonomiDetaljerKonsern.konsernbidragField) &&
        Objects.equals(this.utbytteField, okonomiDetaljerKonsern.utbytteField) &&
        Objects.equals(this.tilFondVurdForField, okonomiDetaljerKonsern.tilFondVurdForField) &&
        Objects.equals(this.tilAnnenEgenkapitalField, okonomiDetaljerKonsern.tilAnnenEgenkapitalField) &&
        Objects.equals(this.tapKravField, okonomiDetaljerKonsern.tapKravField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regnskapsAvArField, regnskapsAvMndField, totalinntektField, salgsinntekterField, annenDriftsinntektField, varekostnadField, beholdningsendringField, lonnskostnadField, avskrivningerField, nedskrivningerField, annenDriftskostnadField, driftsResultatField, inntektInvDatterField, inntektInvKonsernField, inntektInvAnnenField, renteinntektKonsernField, renteinntektAnnenField, finansinntektAnnenField, finansinntektField, verdiendringMarFinOmlopsmidlerField, nedskrivningMarFinOmlopsmidlerField, nedskrivningFinAnleggsmidlerField, rentekostnadKonsernField, annenRentekostnadField, annenFinanskostnadField, finanskostnadField, ordResultatForSkattField, skattOrdResultatField, ordResultatField, ekstraordInntektField, ekstraordKostnadField, skattEkstraordResultatField, sumSkattField, minoritetsInteresserField, arsResultatField, konsernbidragField, utbytteField, tilFondVurdForField, tilAnnenEgenkapitalField, tapKravField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OkonomiDetaljerKonsern {\n");
    
    sb.append("    regnskapsAvArField: ").append(toIndentedString(regnskapsAvArField)).append("\n");
    sb.append("    regnskapsAvMndField: ").append(toIndentedString(regnskapsAvMndField)).append("\n");
    sb.append("    totalinntektField: ").append(toIndentedString(totalinntektField)).append("\n");
    sb.append("    salgsinntekterField: ").append(toIndentedString(salgsinntekterField)).append("\n");
    sb.append("    annenDriftsinntektField: ").append(toIndentedString(annenDriftsinntektField)).append("\n");
    sb.append("    varekostnadField: ").append(toIndentedString(varekostnadField)).append("\n");
    sb.append("    beholdningsendringField: ").append(toIndentedString(beholdningsendringField)).append("\n");
    sb.append("    lonnskostnadField: ").append(toIndentedString(lonnskostnadField)).append("\n");
    sb.append("    avskrivningerField: ").append(toIndentedString(avskrivningerField)).append("\n");
    sb.append("    nedskrivningerField: ").append(toIndentedString(nedskrivningerField)).append("\n");
    sb.append("    annenDriftskostnadField: ").append(toIndentedString(annenDriftskostnadField)).append("\n");
    sb.append("    driftsResultatField: ").append(toIndentedString(driftsResultatField)).append("\n");
    sb.append("    inntektInvDatterField: ").append(toIndentedString(inntektInvDatterField)).append("\n");
    sb.append("    inntektInvKonsernField: ").append(toIndentedString(inntektInvKonsernField)).append("\n");
    sb.append("    inntektInvAnnenField: ").append(toIndentedString(inntektInvAnnenField)).append("\n");
    sb.append("    renteinntektKonsernField: ").append(toIndentedString(renteinntektKonsernField)).append("\n");
    sb.append("    renteinntektAnnenField: ").append(toIndentedString(renteinntektAnnenField)).append("\n");
    sb.append("    finansinntektAnnenField: ").append(toIndentedString(finansinntektAnnenField)).append("\n");
    sb.append("    finansinntektField: ").append(toIndentedString(finansinntektField)).append("\n");
    sb.append("    verdiendringMarFinOmlopsmidlerField: ").append(toIndentedString(verdiendringMarFinOmlopsmidlerField)).append("\n");
    sb.append("    nedskrivningMarFinOmlopsmidlerField: ").append(toIndentedString(nedskrivningMarFinOmlopsmidlerField)).append("\n");
    sb.append("    nedskrivningFinAnleggsmidlerField: ").append(toIndentedString(nedskrivningFinAnleggsmidlerField)).append("\n");
    sb.append("    rentekostnadKonsernField: ").append(toIndentedString(rentekostnadKonsernField)).append("\n");
    sb.append("    annenRentekostnadField: ").append(toIndentedString(annenRentekostnadField)).append("\n");
    sb.append("    annenFinanskostnadField: ").append(toIndentedString(annenFinanskostnadField)).append("\n");
    sb.append("    finanskostnadField: ").append(toIndentedString(finanskostnadField)).append("\n");
    sb.append("    ordResultatForSkattField: ").append(toIndentedString(ordResultatForSkattField)).append("\n");
    sb.append("    skattOrdResultatField: ").append(toIndentedString(skattOrdResultatField)).append("\n");
    sb.append("    ordResultatField: ").append(toIndentedString(ordResultatField)).append("\n");
    sb.append("    ekstraordInntektField: ").append(toIndentedString(ekstraordInntektField)).append("\n");
    sb.append("    ekstraordKostnadField: ").append(toIndentedString(ekstraordKostnadField)).append("\n");
    sb.append("    skattEkstraordResultatField: ").append(toIndentedString(skattEkstraordResultatField)).append("\n");
    sb.append("    sumSkattField: ").append(toIndentedString(sumSkattField)).append("\n");
    sb.append("    minoritetsInteresserField: ").append(toIndentedString(minoritetsInteresserField)).append("\n");
    sb.append("    arsResultatField: ").append(toIndentedString(arsResultatField)).append("\n");
    sb.append("    konsernbidragField: ").append(toIndentedString(konsernbidragField)).append("\n");
    sb.append("    utbytteField: ").append(toIndentedString(utbytteField)).append("\n");
    sb.append("    tilFondVurdForField: ").append(toIndentedString(tilFondVurdForField)).append("\n");
    sb.append("    tilAnnenEgenkapitalField: ").append(toIndentedString(tilAnnenEgenkapitalField)).append("\n");
    sb.append("    tapKravField: ").append(toIndentedString(tapKravField)).append("\n");
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
