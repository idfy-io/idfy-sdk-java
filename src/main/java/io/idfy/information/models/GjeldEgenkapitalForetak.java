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
 * GjeldEgenkapitalForetak
 */
@JsonDeserialize(builder = GjeldEgenkapitalForetak.Builder.class)
public class GjeldEgenkapitalForetak  implements Serializable {
  private final Integer regnskapsAvArField;  // Default value is: null

  private final Integer regnskapsAvMndField;  // Default value is: null

  private final Long sumEgenkapitalField;  // Default value is: null

  private final Long innskuttEgenkapitalField;  // Default value is: null

  private final Long selskapskapitalField;  // Default value is: null

  private final Long egneAksjerField;  // Default value is: null

  private final Long overkursfondField;  // Default value is: null

  private final Long opptjentEgenkapitalField;  // Default value is: null

  private final Long fondForVurdField;  // Default value is: null

  private final Long annenEgenkapitalField;  // Default value is: null

  private final Long minoritetsinteresserField;  // Default value is: null

  private final Long sumGjeldField;  // Default value is: null

  private final Long avsetningForpliktelserField;  // Default value is: null

  private final Long pensjonForpliktelserField;  // Default value is: null

  private final Long utsattSkattField;  // Default value is: null

  private final Long andreAvsetningerField;  // Default value is: null

  private final Long sumLangsiktigGjeldField;  // Default value is: null

  private final Long annenLangsiktigGjeldField;  // Default value is: null

  private final Long konvertibleLanLangField;  // Default value is: null

  private final Long obligasjonsLanField;  // Default value is: null

  private final Long gjeldKredittLangField;  // Default value is: null

  private final Long gjeldKonsernLangField;  // Default value is: null

  private final Long ansvarligLanekapitalField;  // Default value is: null

  private final Long ovrigLangsiktigGjeldField;  // Default value is: null

  private final Long sumKortsiktigGjeldField;  // Default value is: null

  private final Long konvertibleLanKortField;  // Default value is: null

  private final Long sertifikatLanField;  // Default value is: null

  private final Long gjeldKredittKortField;  // Default value is: null

  private final Long kassakredittField;  // Default value is: null

  private final Long leverandorGjeldField;  // Default value is: null

  private final Long betalbarSkattField;  // Default value is: null

  private final Long skyldOffentligAvgiftField;  // Default value is: null

  private final Long gjeldKonsernKortField;  // Default value is: null

  private final Long utbytteField;  // Default value is: null

  private final Long annenKortsiktigGjeldField;  // Default value is: null

  private final Long sumGjeldEgenkapitalField;  // Default value is: null

  private final Long kassekredittlimitField;  // Default value is: null

  private final Long skyldKonsernbidragField;  // Default value is: null

  private final Long avdragLangsiktigGjeldField;  // Default value is: null

  private GjeldEgenkapitalForetak(Builder builder) {
      regnskapsAvArField = builder.regnskapsAvArField;
      regnskapsAvMndField = builder.regnskapsAvMndField;
      sumEgenkapitalField = builder.sumEgenkapitalField;
      innskuttEgenkapitalField = builder.innskuttEgenkapitalField;
      selskapskapitalField = builder.selskapskapitalField;
      egneAksjerField = builder.egneAksjerField;
      overkursfondField = builder.overkursfondField;
      opptjentEgenkapitalField = builder.opptjentEgenkapitalField;
      fondForVurdField = builder.fondForVurdField;
      annenEgenkapitalField = builder.annenEgenkapitalField;
      minoritetsinteresserField = builder.minoritetsinteresserField;
      sumGjeldField = builder.sumGjeldField;
      avsetningForpliktelserField = builder.avsetningForpliktelserField;
      pensjonForpliktelserField = builder.pensjonForpliktelserField;
      utsattSkattField = builder.utsattSkattField;
      andreAvsetningerField = builder.andreAvsetningerField;
      sumLangsiktigGjeldField = builder.sumLangsiktigGjeldField;
      annenLangsiktigGjeldField = builder.annenLangsiktigGjeldField;
      konvertibleLanLangField = builder.konvertibleLanLangField;
      obligasjonsLanField = builder.obligasjonsLanField;
      gjeldKredittLangField = builder.gjeldKredittLangField;
      gjeldKonsernLangField = builder.gjeldKonsernLangField;
      ansvarligLanekapitalField = builder.ansvarligLanekapitalField;
      ovrigLangsiktigGjeldField = builder.ovrigLangsiktigGjeldField;
      sumKortsiktigGjeldField = builder.sumKortsiktigGjeldField;
      konvertibleLanKortField = builder.konvertibleLanKortField;
      sertifikatLanField = builder.sertifikatLanField;
      gjeldKredittKortField = builder.gjeldKredittKortField;
      kassakredittField = builder.kassakredittField;
      leverandorGjeldField = builder.leverandorGjeldField;
      betalbarSkattField = builder.betalbarSkattField;
      skyldOffentligAvgiftField = builder.skyldOffentligAvgiftField;
      gjeldKonsernKortField = builder.gjeldKonsernKortField;
      utbytteField = builder.utbytteField;
      annenKortsiktigGjeldField = builder.annenKortsiktigGjeldField;
      sumGjeldEgenkapitalField = builder.sumGjeldEgenkapitalField;
      kassekredittlimitField = builder.kassekredittlimitField;
      skyldKonsernbidragField = builder.skyldKonsernbidragField;
      avdragLangsiktigGjeldField = builder.avdragLangsiktigGjeldField;
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
      * Get sumEgenkapitalField
      * @return sumEgenkapitalField
      **/
      public Long getSumEgenkapitalField() {return sumEgenkapitalField;}

      /**
      * Get innskuttEgenkapitalField
      * @return innskuttEgenkapitalField
      **/
      public Long getInnskuttEgenkapitalField() {return innskuttEgenkapitalField;}

      /**
      * Get selskapskapitalField
      * @return selskapskapitalField
      **/
      public Long getSelskapskapitalField() {return selskapskapitalField;}

      /**
      * Get egneAksjerField
      * @return egneAksjerField
      **/
      public Long getEgneAksjerField() {return egneAksjerField;}

      /**
      * Get overkursfondField
      * @return overkursfondField
      **/
      public Long getOverkursfondField() {return overkursfondField;}

      /**
      * Get opptjentEgenkapitalField
      * @return opptjentEgenkapitalField
      **/
      public Long getOpptjentEgenkapitalField() {return opptjentEgenkapitalField;}

      /**
      * Get fondForVurdField
      * @return fondForVurdField
      **/
      public Long getFondForVurdField() {return fondForVurdField;}

      /**
      * Get annenEgenkapitalField
      * @return annenEgenkapitalField
      **/
      public Long getAnnenEgenkapitalField() {return annenEgenkapitalField;}

      /**
      * Get minoritetsinteresserField
      * @return minoritetsinteresserField
      **/
      public Long getMinoritetsinteresserField() {return minoritetsinteresserField;}

      /**
      * Get sumGjeldField
      * @return sumGjeldField
      **/
      public Long getSumGjeldField() {return sumGjeldField;}

      /**
      * Get avsetningForpliktelserField
      * @return avsetningForpliktelserField
      **/
      public Long getAvsetningForpliktelserField() {return avsetningForpliktelserField;}

      /**
      * Get pensjonForpliktelserField
      * @return pensjonForpliktelserField
      **/
      public Long getPensjonForpliktelserField() {return pensjonForpliktelserField;}

      /**
      * Get utsattSkattField
      * @return utsattSkattField
      **/
      public Long getUtsattSkattField() {return utsattSkattField;}

      /**
      * Get andreAvsetningerField
      * @return andreAvsetningerField
      **/
      public Long getAndreAvsetningerField() {return andreAvsetningerField;}

      /**
      * Get sumLangsiktigGjeldField
      * @return sumLangsiktigGjeldField
      **/
      public Long getSumLangsiktigGjeldField() {return sumLangsiktigGjeldField;}

      /**
      * Get annenLangsiktigGjeldField
      * @return annenLangsiktigGjeldField
      **/
      public Long getAnnenLangsiktigGjeldField() {return annenLangsiktigGjeldField;}

      /**
      * Get konvertibleLanLangField
      * @return konvertibleLanLangField
      **/
      public Long getKonvertibleLanLangField() {return konvertibleLanLangField;}

      /**
      * Get obligasjonsLanField
      * @return obligasjonsLanField
      **/
      public Long getObligasjonsLanField() {return obligasjonsLanField;}

      /**
      * Get gjeldKredittLangField
      * @return gjeldKredittLangField
      **/
      public Long getGjeldKredittLangField() {return gjeldKredittLangField;}

      /**
      * Get gjeldKonsernLangField
      * @return gjeldKonsernLangField
      **/
      public Long getGjeldKonsernLangField() {return gjeldKonsernLangField;}

      /**
      * Get ansvarligLanekapitalField
      * @return ansvarligLanekapitalField
      **/
      public Long getAnsvarligLanekapitalField() {return ansvarligLanekapitalField;}

      /**
      * Get ovrigLangsiktigGjeldField
      * @return ovrigLangsiktigGjeldField
      **/
      public Long getOvrigLangsiktigGjeldField() {return ovrigLangsiktigGjeldField;}

      /**
      * Get sumKortsiktigGjeldField
      * @return sumKortsiktigGjeldField
      **/
      public Long getSumKortsiktigGjeldField() {return sumKortsiktigGjeldField;}

      /**
      * Get konvertibleLanKortField
      * @return konvertibleLanKortField
      **/
      public Long getKonvertibleLanKortField() {return konvertibleLanKortField;}

      /**
      * Get sertifikatLanField
      * @return sertifikatLanField
      **/
      public Long getSertifikatLanField() {return sertifikatLanField;}

      /**
      * Get gjeldKredittKortField
      * @return gjeldKredittKortField
      **/
      public Long getGjeldKredittKortField() {return gjeldKredittKortField;}

      /**
      * Get kassakredittField
      * @return kassakredittField
      **/
      public Long getKassakredittField() {return kassakredittField;}

      /**
      * Get leverandorGjeldField
      * @return leverandorGjeldField
      **/
      public Long getLeverandorGjeldField() {return leverandorGjeldField;}

      /**
      * Get betalbarSkattField
      * @return betalbarSkattField
      **/
      public Long getBetalbarSkattField() {return betalbarSkattField;}

      /**
      * Get skyldOffentligAvgiftField
      * @return skyldOffentligAvgiftField
      **/
      public Long getSkyldOffentligAvgiftField() {return skyldOffentligAvgiftField;}

      /**
      * Get gjeldKonsernKortField
      * @return gjeldKonsernKortField
      **/
      public Long getGjeldKonsernKortField() {return gjeldKonsernKortField;}

      /**
      * Get utbytteField
      * @return utbytteField
      **/
      public Long getUtbytteField() {return utbytteField;}

      /**
      * Get annenKortsiktigGjeldField
      * @return annenKortsiktigGjeldField
      **/
      public Long getAnnenKortsiktigGjeldField() {return annenKortsiktigGjeldField;}

      /**
      * Get sumGjeldEgenkapitalField
      * @return sumGjeldEgenkapitalField
      **/
      public Long getSumGjeldEgenkapitalField() {return sumGjeldEgenkapitalField;}

      /**
      * Get kassekredittlimitField
      * @return kassekredittlimitField
      **/
      public Long getKassekredittlimitField() {return kassekredittlimitField;}

      /**
      * Get skyldKonsernbidragField
      * @return skyldKonsernbidragField
      **/
      public Long getSkyldKonsernbidragField() {return skyldKonsernbidragField;}

      /**
      * Get avdragLangsiktigGjeldField
      * @return avdragLangsiktigGjeldField
      **/
      public Long getAvdragLangsiktigGjeldField() {return avdragLangsiktigGjeldField;}


  public static final class Builder {
      private Integer regnskapsAvArField;
      private Integer regnskapsAvMndField;
      private Long sumEgenkapitalField;
      private Long innskuttEgenkapitalField;
      private Long selskapskapitalField;
      private Long egneAksjerField;
      private Long overkursfondField;
      private Long opptjentEgenkapitalField;
      private Long fondForVurdField;
      private Long annenEgenkapitalField;
      private Long minoritetsinteresserField;
      private Long sumGjeldField;
      private Long avsetningForpliktelserField;
      private Long pensjonForpliktelserField;
      private Long utsattSkattField;
      private Long andreAvsetningerField;
      private Long sumLangsiktigGjeldField;
      private Long annenLangsiktigGjeldField;
      private Long konvertibleLanLangField;
      private Long obligasjonsLanField;
      private Long gjeldKredittLangField;
      private Long gjeldKonsernLangField;
      private Long ansvarligLanekapitalField;
      private Long ovrigLangsiktigGjeldField;
      private Long sumKortsiktigGjeldField;
      private Long konvertibleLanKortField;
      private Long sertifikatLanField;
      private Long gjeldKredittKortField;
      private Long kassakredittField;
      private Long leverandorGjeldField;
      private Long betalbarSkattField;
      private Long skyldOffentligAvgiftField;
      private Long gjeldKonsernKortField;
      private Long utbytteField;
      private Long annenKortsiktigGjeldField;
      private Long sumGjeldEgenkapitalField;
      private Long kassekredittlimitField;
      private Long skyldKonsernbidragField;
      private Long avdragLangsiktigGjeldField;

    public Builder() {
    }

    public Builder(GjeldEgenkapitalForetak copy) {
        this.regnskapsAvArField = copy.getRegnskapsAvArField();
        this.regnskapsAvMndField = copy.getRegnskapsAvMndField();
        this.sumEgenkapitalField = copy.getSumEgenkapitalField();
        this.innskuttEgenkapitalField = copy.getInnskuttEgenkapitalField();
        this.selskapskapitalField = copy.getSelskapskapitalField();
        this.egneAksjerField = copy.getEgneAksjerField();
        this.overkursfondField = copy.getOverkursfondField();
        this.opptjentEgenkapitalField = copy.getOpptjentEgenkapitalField();
        this.fondForVurdField = copy.getFondForVurdField();
        this.annenEgenkapitalField = copy.getAnnenEgenkapitalField();
        this.minoritetsinteresserField = copy.getMinoritetsinteresserField();
        this.sumGjeldField = copy.getSumGjeldField();
        this.avsetningForpliktelserField = copy.getAvsetningForpliktelserField();
        this.pensjonForpliktelserField = copy.getPensjonForpliktelserField();
        this.utsattSkattField = copy.getUtsattSkattField();
        this.andreAvsetningerField = copy.getAndreAvsetningerField();
        this.sumLangsiktigGjeldField = copy.getSumLangsiktigGjeldField();
        this.annenLangsiktigGjeldField = copy.getAnnenLangsiktigGjeldField();
        this.konvertibleLanLangField = copy.getKonvertibleLanLangField();
        this.obligasjonsLanField = copy.getObligasjonsLanField();
        this.gjeldKredittLangField = copy.getGjeldKredittLangField();
        this.gjeldKonsernLangField = copy.getGjeldKonsernLangField();
        this.ansvarligLanekapitalField = copy.getAnsvarligLanekapitalField();
        this.ovrigLangsiktigGjeldField = copy.getOvrigLangsiktigGjeldField();
        this.sumKortsiktigGjeldField = copy.getSumKortsiktigGjeldField();
        this.konvertibleLanKortField = copy.getKonvertibleLanKortField();
        this.sertifikatLanField = copy.getSertifikatLanField();
        this.gjeldKredittKortField = copy.getGjeldKredittKortField();
        this.kassakredittField = copy.getKassakredittField();
        this.leverandorGjeldField = copy.getLeverandorGjeldField();
        this.betalbarSkattField = copy.getBetalbarSkattField();
        this.skyldOffentligAvgiftField = copy.getSkyldOffentligAvgiftField();
        this.gjeldKonsernKortField = copy.getGjeldKonsernKortField();
        this.utbytteField = copy.getUtbytteField();
        this.annenKortsiktigGjeldField = copy.getAnnenKortsiktigGjeldField();
        this.sumGjeldEgenkapitalField = copy.getSumGjeldEgenkapitalField();
        this.kassekredittlimitField = copy.getKassekredittlimitField();
        this.skyldKonsernbidragField = copy.getSkyldKonsernbidragField();
        this.avdragLangsiktigGjeldField = copy.getAvdragLangsiktigGjeldField();
    }

    public Builder withRegnskapsAvArField(Integer regnskapsAvArField) {
      this.regnskapsAvArField = regnskapsAvArField;
      return this;
    }

    public Builder withRegnskapsAvMndField(Integer regnskapsAvMndField) {
      this.regnskapsAvMndField = regnskapsAvMndField;
      return this;
    }

    public Builder withSumEgenkapitalField(Long sumEgenkapitalField) {
      this.sumEgenkapitalField = sumEgenkapitalField;
      return this;
    }

    public Builder withInnskuttEgenkapitalField(Long innskuttEgenkapitalField) {
      this.innskuttEgenkapitalField = innskuttEgenkapitalField;
      return this;
    }

    public Builder withSelskapskapitalField(Long selskapskapitalField) {
      this.selskapskapitalField = selskapskapitalField;
      return this;
    }

    public Builder withEgneAksjerField(Long egneAksjerField) {
      this.egneAksjerField = egneAksjerField;
      return this;
    }

    public Builder withOverkursfondField(Long overkursfondField) {
      this.overkursfondField = overkursfondField;
      return this;
    }

    public Builder withOpptjentEgenkapitalField(Long opptjentEgenkapitalField) {
      this.opptjentEgenkapitalField = opptjentEgenkapitalField;
      return this;
    }

    public Builder withFondForVurdField(Long fondForVurdField) {
      this.fondForVurdField = fondForVurdField;
      return this;
    }

    public Builder withAnnenEgenkapitalField(Long annenEgenkapitalField) {
      this.annenEgenkapitalField = annenEgenkapitalField;
      return this;
    }

    public Builder withMinoritetsinteresserField(Long minoritetsinteresserField) {
      this.minoritetsinteresserField = minoritetsinteresserField;
      return this;
    }

    public Builder withSumGjeldField(Long sumGjeldField) {
      this.sumGjeldField = sumGjeldField;
      return this;
    }

    public Builder withAvsetningForpliktelserField(Long avsetningForpliktelserField) {
      this.avsetningForpliktelserField = avsetningForpliktelserField;
      return this;
    }

    public Builder withPensjonForpliktelserField(Long pensjonForpliktelserField) {
      this.pensjonForpliktelserField = pensjonForpliktelserField;
      return this;
    }

    public Builder withUtsattSkattField(Long utsattSkattField) {
      this.utsattSkattField = utsattSkattField;
      return this;
    }

    public Builder withAndreAvsetningerField(Long andreAvsetningerField) {
      this.andreAvsetningerField = andreAvsetningerField;
      return this;
    }

    public Builder withSumLangsiktigGjeldField(Long sumLangsiktigGjeldField) {
      this.sumLangsiktigGjeldField = sumLangsiktigGjeldField;
      return this;
    }

    public Builder withAnnenLangsiktigGjeldField(Long annenLangsiktigGjeldField) {
      this.annenLangsiktigGjeldField = annenLangsiktigGjeldField;
      return this;
    }

    public Builder withKonvertibleLanLangField(Long konvertibleLanLangField) {
      this.konvertibleLanLangField = konvertibleLanLangField;
      return this;
    }

    public Builder withObligasjonsLanField(Long obligasjonsLanField) {
      this.obligasjonsLanField = obligasjonsLanField;
      return this;
    }

    public Builder withGjeldKredittLangField(Long gjeldKredittLangField) {
      this.gjeldKredittLangField = gjeldKredittLangField;
      return this;
    }

    public Builder withGjeldKonsernLangField(Long gjeldKonsernLangField) {
      this.gjeldKonsernLangField = gjeldKonsernLangField;
      return this;
    }

    public Builder withAnsvarligLanekapitalField(Long ansvarligLanekapitalField) {
      this.ansvarligLanekapitalField = ansvarligLanekapitalField;
      return this;
    }

    public Builder withOvrigLangsiktigGjeldField(Long ovrigLangsiktigGjeldField) {
      this.ovrigLangsiktigGjeldField = ovrigLangsiktigGjeldField;
      return this;
    }

    public Builder withSumKortsiktigGjeldField(Long sumKortsiktigGjeldField) {
      this.sumKortsiktigGjeldField = sumKortsiktigGjeldField;
      return this;
    }

    public Builder withKonvertibleLanKortField(Long konvertibleLanKortField) {
      this.konvertibleLanKortField = konvertibleLanKortField;
      return this;
    }

    public Builder withSertifikatLanField(Long sertifikatLanField) {
      this.sertifikatLanField = sertifikatLanField;
      return this;
    }

    public Builder withGjeldKredittKortField(Long gjeldKredittKortField) {
      this.gjeldKredittKortField = gjeldKredittKortField;
      return this;
    }

    public Builder withKassakredittField(Long kassakredittField) {
      this.kassakredittField = kassakredittField;
      return this;
    }

    public Builder withLeverandorGjeldField(Long leverandorGjeldField) {
      this.leverandorGjeldField = leverandorGjeldField;
      return this;
    }

    public Builder withBetalbarSkattField(Long betalbarSkattField) {
      this.betalbarSkattField = betalbarSkattField;
      return this;
    }

    public Builder withSkyldOffentligAvgiftField(Long skyldOffentligAvgiftField) {
      this.skyldOffentligAvgiftField = skyldOffentligAvgiftField;
      return this;
    }

    public Builder withGjeldKonsernKortField(Long gjeldKonsernKortField) {
      this.gjeldKonsernKortField = gjeldKonsernKortField;
      return this;
    }

    public Builder withUtbytteField(Long utbytteField) {
      this.utbytteField = utbytteField;
      return this;
    }

    public Builder withAnnenKortsiktigGjeldField(Long annenKortsiktigGjeldField) {
      this.annenKortsiktigGjeldField = annenKortsiktigGjeldField;
      return this;
    }

    public Builder withSumGjeldEgenkapitalField(Long sumGjeldEgenkapitalField) {
      this.sumGjeldEgenkapitalField = sumGjeldEgenkapitalField;
      return this;
    }

    public Builder withKassekredittlimitField(Long kassekredittlimitField) {
      this.kassekredittlimitField = kassekredittlimitField;
      return this;
    }

    public Builder withSkyldKonsernbidragField(Long skyldKonsernbidragField) {
      this.skyldKonsernbidragField = skyldKonsernbidragField;
      return this;
    }

    public Builder withAvdragLangsiktigGjeldField(Long avdragLangsiktigGjeldField) {
      this.avdragLangsiktigGjeldField = avdragLangsiktigGjeldField;
      return this;
    }


    public GjeldEgenkapitalForetak build() { return new GjeldEgenkapitalForetak(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GjeldEgenkapitalForetak gjeldEgenkapitalForetak = (GjeldEgenkapitalForetak) o;
    return Objects.equals(this.regnskapsAvArField, gjeldEgenkapitalForetak.regnskapsAvArField) &&
        Objects.equals(this.regnskapsAvMndField, gjeldEgenkapitalForetak.regnskapsAvMndField) &&
        Objects.equals(this.sumEgenkapitalField, gjeldEgenkapitalForetak.sumEgenkapitalField) &&
        Objects.equals(this.innskuttEgenkapitalField, gjeldEgenkapitalForetak.innskuttEgenkapitalField) &&
        Objects.equals(this.selskapskapitalField, gjeldEgenkapitalForetak.selskapskapitalField) &&
        Objects.equals(this.egneAksjerField, gjeldEgenkapitalForetak.egneAksjerField) &&
        Objects.equals(this.overkursfondField, gjeldEgenkapitalForetak.overkursfondField) &&
        Objects.equals(this.opptjentEgenkapitalField, gjeldEgenkapitalForetak.opptjentEgenkapitalField) &&
        Objects.equals(this.fondForVurdField, gjeldEgenkapitalForetak.fondForVurdField) &&
        Objects.equals(this.annenEgenkapitalField, gjeldEgenkapitalForetak.annenEgenkapitalField) &&
        Objects.equals(this.minoritetsinteresserField, gjeldEgenkapitalForetak.minoritetsinteresserField) &&
        Objects.equals(this.sumGjeldField, gjeldEgenkapitalForetak.sumGjeldField) &&
        Objects.equals(this.avsetningForpliktelserField, gjeldEgenkapitalForetak.avsetningForpliktelserField) &&
        Objects.equals(this.pensjonForpliktelserField, gjeldEgenkapitalForetak.pensjonForpliktelserField) &&
        Objects.equals(this.utsattSkattField, gjeldEgenkapitalForetak.utsattSkattField) &&
        Objects.equals(this.andreAvsetningerField, gjeldEgenkapitalForetak.andreAvsetningerField) &&
        Objects.equals(this.sumLangsiktigGjeldField, gjeldEgenkapitalForetak.sumLangsiktigGjeldField) &&
        Objects.equals(this.annenLangsiktigGjeldField, gjeldEgenkapitalForetak.annenLangsiktigGjeldField) &&
        Objects.equals(this.konvertibleLanLangField, gjeldEgenkapitalForetak.konvertibleLanLangField) &&
        Objects.equals(this.obligasjonsLanField, gjeldEgenkapitalForetak.obligasjonsLanField) &&
        Objects.equals(this.gjeldKredittLangField, gjeldEgenkapitalForetak.gjeldKredittLangField) &&
        Objects.equals(this.gjeldKonsernLangField, gjeldEgenkapitalForetak.gjeldKonsernLangField) &&
        Objects.equals(this.ansvarligLanekapitalField, gjeldEgenkapitalForetak.ansvarligLanekapitalField) &&
        Objects.equals(this.ovrigLangsiktigGjeldField, gjeldEgenkapitalForetak.ovrigLangsiktigGjeldField) &&
        Objects.equals(this.sumKortsiktigGjeldField, gjeldEgenkapitalForetak.sumKortsiktigGjeldField) &&
        Objects.equals(this.konvertibleLanKortField, gjeldEgenkapitalForetak.konvertibleLanKortField) &&
        Objects.equals(this.sertifikatLanField, gjeldEgenkapitalForetak.sertifikatLanField) &&
        Objects.equals(this.gjeldKredittKortField, gjeldEgenkapitalForetak.gjeldKredittKortField) &&
        Objects.equals(this.kassakredittField, gjeldEgenkapitalForetak.kassakredittField) &&
        Objects.equals(this.leverandorGjeldField, gjeldEgenkapitalForetak.leverandorGjeldField) &&
        Objects.equals(this.betalbarSkattField, gjeldEgenkapitalForetak.betalbarSkattField) &&
        Objects.equals(this.skyldOffentligAvgiftField, gjeldEgenkapitalForetak.skyldOffentligAvgiftField) &&
        Objects.equals(this.gjeldKonsernKortField, gjeldEgenkapitalForetak.gjeldKonsernKortField) &&
        Objects.equals(this.utbytteField, gjeldEgenkapitalForetak.utbytteField) &&
        Objects.equals(this.annenKortsiktigGjeldField, gjeldEgenkapitalForetak.annenKortsiktigGjeldField) &&
        Objects.equals(this.sumGjeldEgenkapitalField, gjeldEgenkapitalForetak.sumGjeldEgenkapitalField) &&
        Objects.equals(this.kassekredittlimitField, gjeldEgenkapitalForetak.kassekredittlimitField) &&
        Objects.equals(this.skyldKonsernbidragField, gjeldEgenkapitalForetak.skyldKonsernbidragField) &&
        Objects.equals(this.avdragLangsiktigGjeldField, gjeldEgenkapitalForetak.avdragLangsiktigGjeldField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regnskapsAvArField, regnskapsAvMndField, sumEgenkapitalField, innskuttEgenkapitalField, selskapskapitalField, egneAksjerField, overkursfondField, opptjentEgenkapitalField, fondForVurdField, annenEgenkapitalField, minoritetsinteresserField, sumGjeldField, avsetningForpliktelserField, pensjonForpliktelserField, utsattSkattField, andreAvsetningerField, sumLangsiktigGjeldField, annenLangsiktigGjeldField, konvertibleLanLangField, obligasjonsLanField, gjeldKredittLangField, gjeldKonsernLangField, ansvarligLanekapitalField, ovrigLangsiktigGjeldField, sumKortsiktigGjeldField, konvertibleLanKortField, sertifikatLanField, gjeldKredittKortField, kassakredittField, leverandorGjeldField, betalbarSkattField, skyldOffentligAvgiftField, gjeldKonsernKortField, utbytteField, annenKortsiktigGjeldField, sumGjeldEgenkapitalField, kassekredittlimitField, skyldKonsernbidragField, avdragLangsiktigGjeldField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GjeldEgenkapitalForetak {\n");
    
    sb.append("    regnskapsAvArField: ").append(toIndentedString(regnskapsAvArField)).append("\n");
    sb.append("    regnskapsAvMndField: ").append(toIndentedString(regnskapsAvMndField)).append("\n");
    sb.append("    sumEgenkapitalField: ").append(toIndentedString(sumEgenkapitalField)).append("\n");
    sb.append("    innskuttEgenkapitalField: ").append(toIndentedString(innskuttEgenkapitalField)).append("\n");
    sb.append("    selskapskapitalField: ").append(toIndentedString(selskapskapitalField)).append("\n");
    sb.append("    egneAksjerField: ").append(toIndentedString(egneAksjerField)).append("\n");
    sb.append("    overkursfondField: ").append(toIndentedString(overkursfondField)).append("\n");
    sb.append("    opptjentEgenkapitalField: ").append(toIndentedString(opptjentEgenkapitalField)).append("\n");
    sb.append("    fondForVurdField: ").append(toIndentedString(fondForVurdField)).append("\n");
    sb.append("    annenEgenkapitalField: ").append(toIndentedString(annenEgenkapitalField)).append("\n");
    sb.append("    minoritetsinteresserField: ").append(toIndentedString(minoritetsinteresserField)).append("\n");
    sb.append("    sumGjeldField: ").append(toIndentedString(sumGjeldField)).append("\n");
    sb.append("    avsetningForpliktelserField: ").append(toIndentedString(avsetningForpliktelserField)).append("\n");
    sb.append("    pensjonForpliktelserField: ").append(toIndentedString(pensjonForpliktelserField)).append("\n");
    sb.append("    utsattSkattField: ").append(toIndentedString(utsattSkattField)).append("\n");
    sb.append("    andreAvsetningerField: ").append(toIndentedString(andreAvsetningerField)).append("\n");
    sb.append("    sumLangsiktigGjeldField: ").append(toIndentedString(sumLangsiktigGjeldField)).append("\n");
    sb.append("    annenLangsiktigGjeldField: ").append(toIndentedString(annenLangsiktigGjeldField)).append("\n");
    sb.append("    konvertibleLanLangField: ").append(toIndentedString(konvertibleLanLangField)).append("\n");
    sb.append("    obligasjonsLanField: ").append(toIndentedString(obligasjonsLanField)).append("\n");
    sb.append("    gjeldKredittLangField: ").append(toIndentedString(gjeldKredittLangField)).append("\n");
    sb.append("    gjeldKonsernLangField: ").append(toIndentedString(gjeldKonsernLangField)).append("\n");
    sb.append("    ansvarligLanekapitalField: ").append(toIndentedString(ansvarligLanekapitalField)).append("\n");
    sb.append("    ovrigLangsiktigGjeldField: ").append(toIndentedString(ovrigLangsiktigGjeldField)).append("\n");
    sb.append("    sumKortsiktigGjeldField: ").append(toIndentedString(sumKortsiktigGjeldField)).append("\n");
    sb.append("    konvertibleLanKortField: ").append(toIndentedString(konvertibleLanKortField)).append("\n");
    sb.append("    sertifikatLanField: ").append(toIndentedString(sertifikatLanField)).append("\n");
    sb.append("    gjeldKredittKortField: ").append(toIndentedString(gjeldKredittKortField)).append("\n");
    sb.append("    kassakredittField: ").append(toIndentedString(kassakredittField)).append("\n");
    sb.append("    leverandorGjeldField: ").append(toIndentedString(leverandorGjeldField)).append("\n");
    sb.append("    betalbarSkattField: ").append(toIndentedString(betalbarSkattField)).append("\n");
    sb.append("    skyldOffentligAvgiftField: ").append(toIndentedString(skyldOffentligAvgiftField)).append("\n");
    sb.append("    gjeldKonsernKortField: ").append(toIndentedString(gjeldKonsernKortField)).append("\n");
    sb.append("    utbytteField: ").append(toIndentedString(utbytteField)).append("\n");
    sb.append("    annenKortsiktigGjeldField: ").append(toIndentedString(annenKortsiktigGjeldField)).append("\n");
    sb.append("    sumGjeldEgenkapitalField: ").append(toIndentedString(sumGjeldEgenkapitalField)).append("\n");
    sb.append("    kassekredittlimitField: ").append(toIndentedString(kassekredittlimitField)).append("\n");
    sb.append("    skyldKonsernbidragField: ").append(toIndentedString(skyldKonsernbidragField)).append("\n");
    sb.append("    avdragLangsiktigGjeldField: ").append(toIndentedString(avdragLangsiktigGjeldField)).append("\n");
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
