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
 * EiendelerForetak
 */
@JsonDeserialize(builder = EiendelerForetak.Builder.class)
public class EiendelerForetak  implements Serializable {
  private final Integer regnskapsAvArField;  // Default value is: null

  private final Integer regnskapsAvMndField;  // Default value is: null

  private final Long sumAnleggsmidlerField;  // Default value is: null

  private final Long sumImmatrielleEiendelerField;  // Default value is: null

  private final Long forskningUtviklingField;  // Default value is: null

  private final Long konsesjonerField;  // Default value is: null

  private final Long utsattSkattefordelField;  // Default value is: null

  private final Long goodwillField;  // Default value is: null

  private final Long sumVarigeDriftsmidlerField;  // Default value is: null

  private final Long fastEiendomField;  // Default value is: null

  private final Long maskinerAnleggField;  // Default value is: null

  private final Long skipRiggFlyField;  // Default value is: null

  private final Long driftsLosoreField;  // Default value is: null

  private final Long sumFinansielleAnleggsmilderField;  // Default value is: null

  private final Long investDatterField;  // Default value is: null

  private final Long investAnnetKonsernField;  // Default value is: null

  private final Long konsernfordringField;  // Default value is: null

  private final Long investTilknyttetField;  // Default value is: null

  private final Long lanTilknyttetField;  // Default value is: null

  private final Long investAksjerField;  // Default value is: null

  private final Long obligasjonerField;  // Default value is: null

  private final Long pensjonsmidlerField;  // Default value is: null

  private final Long andreAnleggsmidlerField;  // Default value is: null

  private final Long sumOmlopsmidlerField;  // Default value is: null

  private final Long sumVarerField;  // Default value is: null

  private final Long lagerRavarerField;  // Default value is: null

  private final Long lagerUferdigeVarerField;  // Default value is: null

  private final Long lagerFerdigeVarerField;  // Default value is: null

  private final Long sumFordringerField;  // Default value is: null

  private final Long fordringerKunderField;  // Default value is: null

  private final Long fordringerAndreField;  // Default value is: null

  private final Long fordringerKonsernField;  // Default value is: null

  private final Long kravInnbetSelskapskapitalField;  // Default value is: null

  private final Long sumInvesteringerField;  // Default value is: null

  private final Long aksjerKonsernField;  // Default value is: null

  private final Long aksjerMarkedField;  // Default value is: null

  private final Long obligasjonerMarkedField;  // Default value is: null

  private final Long andreMarkedFinInvField;  // Default value is: null

  private final Long andreFinInstField;  // Default value is: null

  private final Long bankinnskuddField;  // Default value is: null

  private final Long andreOmlopsmidlerField;  // Default value is: null

  private final Long sumEiendelerField;  // Default value is: null

  private final Long pantstillelserField;  // Default value is: null

  private EiendelerForetak(Builder builder) {
      regnskapsAvArField = builder.regnskapsAvArField;
      regnskapsAvMndField = builder.regnskapsAvMndField;
      sumAnleggsmidlerField = builder.sumAnleggsmidlerField;
      sumImmatrielleEiendelerField = builder.sumImmatrielleEiendelerField;
      forskningUtviklingField = builder.forskningUtviklingField;
      konsesjonerField = builder.konsesjonerField;
      utsattSkattefordelField = builder.utsattSkattefordelField;
      goodwillField = builder.goodwillField;
      sumVarigeDriftsmidlerField = builder.sumVarigeDriftsmidlerField;
      fastEiendomField = builder.fastEiendomField;
      maskinerAnleggField = builder.maskinerAnleggField;
      skipRiggFlyField = builder.skipRiggFlyField;
      driftsLosoreField = builder.driftsLosoreField;
      sumFinansielleAnleggsmilderField = builder.sumFinansielleAnleggsmilderField;
      investDatterField = builder.investDatterField;
      investAnnetKonsernField = builder.investAnnetKonsernField;
      konsernfordringField = builder.konsernfordringField;
      investTilknyttetField = builder.investTilknyttetField;
      lanTilknyttetField = builder.lanTilknyttetField;
      investAksjerField = builder.investAksjerField;
      obligasjonerField = builder.obligasjonerField;
      pensjonsmidlerField = builder.pensjonsmidlerField;
      andreAnleggsmidlerField = builder.andreAnleggsmidlerField;
      sumOmlopsmidlerField = builder.sumOmlopsmidlerField;
      sumVarerField = builder.sumVarerField;
      lagerRavarerField = builder.lagerRavarerField;
      lagerUferdigeVarerField = builder.lagerUferdigeVarerField;
      lagerFerdigeVarerField = builder.lagerFerdigeVarerField;
      sumFordringerField = builder.sumFordringerField;
      fordringerKunderField = builder.fordringerKunderField;
      fordringerAndreField = builder.fordringerAndreField;
      fordringerKonsernField = builder.fordringerKonsernField;
      kravInnbetSelskapskapitalField = builder.kravInnbetSelskapskapitalField;
      sumInvesteringerField = builder.sumInvesteringerField;
      aksjerKonsernField = builder.aksjerKonsernField;
      aksjerMarkedField = builder.aksjerMarkedField;
      obligasjonerMarkedField = builder.obligasjonerMarkedField;
      andreMarkedFinInvField = builder.andreMarkedFinInvField;
      andreFinInstField = builder.andreFinInstField;
      bankinnskuddField = builder.bankinnskuddField;
      andreOmlopsmidlerField = builder.andreOmlopsmidlerField;
      sumEiendelerField = builder.sumEiendelerField;
      pantstillelserField = builder.pantstillelserField;
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
      * Get sumAnleggsmidlerField
      * @return sumAnleggsmidlerField
      **/
      public Long getSumAnleggsmidlerField() {return sumAnleggsmidlerField;}

      /**
      * Get sumImmatrielleEiendelerField
      * @return sumImmatrielleEiendelerField
      **/
      public Long getSumImmatrielleEiendelerField() {return sumImmatrielleEiendelerField;}

      /**
      * Get forskningUtviklingField
      * @return forskningUtviklingField
      **/
      public Long getForskningUtviklingField() {return forskningUtviklingField;}

      /**
      * Get konsesjonerField
      * @return konsesjonerField
      **/
      public Long getKonsesjonerField() {return konsesjonerField;}

      /**
      * Get utsattSkattefordelField
      * @return utsattSkattefordelField
      **/
      public Long getUtsattSkattefordelField() {return utsattSkattefordelField;}

      /**
      * Get goodwillField
      * @return goodwillField
      **/
      public Long getGoodwillField() {return goodwillField;}

      /**
      * Get sumVarigeDriftsmidlerField
      * @return sumVarigeDriftsmidlerField
      **/
      public Long getSumVarigeDriftsmidlerField() {return sumVarigeDriftsmidlerField;}

      /**
      * Get fastEiendomField
      * @return fastEiendomField
      **/
      public Long getFastEiendomField() {return fastEiendomField;}

      /**
      * Get maskinerAnleggField
      * @return maskinerAnleggField
      **/
      public Long getMaskinerAnleggField() {return maskinerAnleggField;}

      /**
      * Get skipRiggFlyField
      * @return skipRiggFlyField
      **/
      public Long getSkipRiggFlyField() {return skipRiggFlyField;}

      /**
      * Get driftsLosoreField
      * @return driftsLosoreField
      **/
      public Long getDriftsLosoreField() {return driftsLosoreField;}

      /**
      * Get sumFinansielleAnleggsmilderField
      * @return sumFinansielleAnleggsmilderField
      **/
      public Long getSumFinansielleAnleggsmilderField() {return sumFinansielleAnleggsmilderField;}

      /**
      * Get investDatterField
      * @return investDatterField
      **/
      public Long getInvestDatterField() {return investDatterField;}

      /**
      * Get investAnnetKonsernField
      * @return investAnnetKonsernField
      **/
      public Long getInvestAnnetKonsernField() {return investAnnetKonsernField;}

      /**
      * Get konsernfordringField
      * @return konsernfordringField
      **/
      public Long getKonsernfordringField() {return konsernfordringField;}

      /**
      * Get investTilknyttetField
      * @return investTilknyttetField
      **/
      public Long getInvestTilknyttetField() {return investTilknyttetField;}

      /**
      * Get lanTilknyttetField
      * @return lanTilknyttetField
      **/
      public Long getLanTilknyttetField() {return lanTilknyttetField;}

      /**
      * Get investAksjerField
      * @return investAksjerField
      **/
      public Long getInvestAksjerField() {return investAksjerField;}

      /**
      * Get obligasjonerField
      * @return obligasjonerField
      **/
      public Long getObligasjonerField() {return obligasjonerField;}

      /**
      * Get pensjonsmidlerField
      * @return pensjonsmidlerField
      **/
      public Long getPensjonsmidlerField() {return pensjonsmidlerField;}

      /**
      * Get andreAnleggsmidlerField
      * @return andreAnleggsmidlerField
      **/
      public Long getAndreAnleggsmidlerField() {return andreAnleggsmidlerField;}

      /**
      * Get sumOmlopsmidlerField
      * @return sumOmlopsmidlerField
      **/
      public Long getSumOmlopsmidlerField() {return sumOmlopsmidlerField;}

      /**
      * Get sumVarerField
      * @return sumVarerField
      **/
      public Long getSumVarerField() {return sumVarerField;}

      /**
      * Get lagerRavarerField
      * @return lagerRavarerField
      **/
      public Long getLagerRavarerField() {return lagerRavarerField;}

      /**
      * Get lagerUferdigeVarerField
      * @return lagerUferdigeVarerField
      **/
      public Long getLagerUferdigeVarerField() {return lagerUferdigeVarerField;}

      /**
      * Get lagerFerdigeVarerField
      * @return lagerFerdigeVarerField
      **/
      public Long getLagerFerdigeVarerField() {return lagerFerdigeVarerField;}

      /**
      * Get sumFordringerField
      * @return sumFordringerField
      **/
      public Long getSumFordringerField() {return sumFordringerField;}

      /**
      * Get fordringerKunderField
      * @return fordringerKunderField
      **/
      public Long getFordringerKunderField() {return fordringerKunderField;}

      /**
      * Get fordringerAndreField
      * @return fordringerAndreField
      **/
      public Long getFordringerAndreField() {return fordringerAndreField;}

      /**
      * Get fordringerKonsernField
      * @return fordringerKonsernField
      **/
      public Long getFordringerKonsernField() {return fordringerKonsernField;}

      /**
      * Get kravInnbetSelskapskapitalField
      * @return kravInnbetSelskapskapitalField
      **/
      public Long getKravInnbetSelskapskapitalField() {return kravInnbetSelskapskapitalField;}

      /**
      * Get sumInvesteringerField
      * @return sumInvesteringerField
      **/
      public Long getSumInvesteringerField() {return sumInvesteringerField;}

      /**
      * Get aksjerKonsernField
      * @return aksjerKonsernField
      **/
      public Long getAksjerKonsernField() {return aksjerKonsernField;}

      /**
      * Get aksjerMarkedField
      * @return aksjerMarkedField
      **/
      public Long getAksjerMarkedField() {return aksjerMarkedField;}

      /**
      * Get obligasjonerMarkedField
      * @return obligasjonerMarkedField
      **/
      public Long getObligasjonerMarkedField() {return obligasjonerMarkedField;}

      /**
      * Get andreMarkedFinInvField
      * @return andreMarkedFinInvField
      **/
      public Long getAndreMarkedFinInvField() {return andreMarkedFinInvField;}

      /**
      * Get andreFinInstField
      * @return andreFinInstField
      **/
      public Long getAndreFinInstField() {return andreFinInstField;}

      /**
      * Get bankinnskuddField
      * @return bankinnskuddField
      **/
      public Long getBankinnskuddField() {return bankinnskuddField;}

      /**
      * Get andreOmlopsmidlerField
      * @return andreOmlopsmidlerField
      **/
      public Long getAndreOmlopsmidlerField() {return andreOmlopsmidlerField;}

      /**
      * Get sumEiendelerField
      * @return sumEiendelerField
      **/
      public Long getSumEiendelerField() {return sumEiendelerField;}

      /**
      * Get pantstillelserField
      * @return pantstillelserField
      **/
      public Long getPantstillelserField() {return pantstillelserField;}


  public static final class Builder {
      private Integer regnskapsAvArField;
      private Integer regnskapsAvMndField;
      private Long sumAnleggsmidlerField;
      private Long sumImmatrielleEiendelerField;
      private Long forskningUtviklingField;
      private Long konsesjonerField;
      private Long utsattSkattefordelField;
      private Long goodwillField;
      private Long sumVarigeDriftsmidlerField;
      private Long fastEiendomField;
      private Long maskinerAnleggField;
      private Long skipRiggFlyField;
      private Long driftsLosoreField;
      private Long sumFinansielleAnleggsmilderField;
      private Long investDatterField;
      private Long investAnnetKonsernField;
      private Long konsernfordringField;
      private Long investTilknyttetField;
      private Long lanTilknyttetField;
      private Long investAksjerField;
      private Long obligasjonerField;
      private Long pensjonsmidlerField;
      private Long andreAnleggsmidlerField;
      private Long sumOmlopsmidlerField;
      private Long sumVarerField;
      private Long lagerRavarerField;
      private Long lagerUferdigeVarerField;
      private Long lagerFerdigeVarerField;
      private Long sumFordringerField;
      private Long fordringerKunderField;
      private Long fordringerAndreField;
      private Long fordringerKonsernField;
      private Long kravInnbetSelskapskapitalField;
      private Long sumInvesteringerField;
      private Long aksjerKonsernField;
      private Long aksjerMarkedField;
      private Long obligasjonerMarkedField;
      private Long andreMarkedFinInvField;
      private Long andreFinInstField;
      private Long bankinnskuddField;
      private Long andreOmlopsmidlerField;
      private Long sumEiendelerField;
      private Long pantstillelserField;

    public Builder() {
    }

    public Builder(EiendelerForetak copy) {
        this.regnskapsAvArField = copy.getRegnskapsAvArField();
        this.regnskapsAvMndField = copy.getRegnskapsAvMndField();
        this.sumAnleggsmidlerField = copy.getSumAnleggsmidlerField();
        this.sumImmatrielleEiendelerField = copy.getSumImmatrielleEiendelerField();
        this.forskningUtviklingField = copy.getForskningUtviklingField();
        this.konsesjonerField = copy.getKonsesjonerField();
        this.utsattSkattefordelField = copy.getUtsattSkattefordelField();
        this.goodwillField = copy.getGoodwillField();
        this.sumVarigeDriftsmidlerField = copy.getSumVarigeDriftsmidlerField();
        this.fastEiendomField = copy.getFastEiendomField();
        this.maskinerAnleggField = copy.getMaskinerAnleggField();
        this.skipRiggFlyField = copy.getSkipRiggFlyField();
        this.driftsLosoreField = copy.getDriftsLosoreField();
        this.sumFinansielleAnleggsmilderField = copy.getSumFinansielleAnleggsmilderField();
        this.investDatterField = copy.getInvestDatterField();
        this.investAnnetKonsernField = copy.getInvestAnnetKonsernField();
        this.konsernfordringField = copy.getKonsernfordringField();
        this.investTilknyttetField = copy.getInvestTilknyttetField();
        this.lanTilknyttetField = copy.getLanTilknyttetField();
        this.investAksjerField = copy.getInvestAksjerField();
        this.obligasjonerField = copy.getObligasjonerField();
        this.pensjonsmidlerField = copy.getPensjonsmidlerField();
        this.andreAnleggsmidlerField = copy.getAndreAnleggsmidlerField();
        this.sumOmlopsmidlerField = copy.getSumOmlopsmidlerField();
        this.sumVarerField = copy.getSumVarerField();
        this.lagerRavarerField = copy.getLagerRavarerField();
        this.lagerUferdigeVarerField = copy.getLagerUferdigeVarerField();
        this.lagerFerdigeVarerField = copy.getLagerFerdigeVarerField();
        this.sumFordringerField = copy.getSumFordringerField();
        this.fordringerKunderField = copy.getFordringerKunderField();
        this.fordringerAndreField = copy.getFordringerAndreField();
        this.fordringerKonsernField = copy.getFordringerKonsernField();
        this.kravInnbetSelskapskapitalField = copy.getKravInnbetSelskapskapitalField();
        this.sumInvesteringerField = copy.getSumInvesteringerField();
        this.aksjerKonsernField = copy.getAksjerKonsernField();
        this.aksjerMarkedField = copy.getAksjerMarkedField();
        this.obligasjonerMarkedField = copy.getObligasjonerMarkedField();
        this.andreMarkedFinInvField = copy.getAndreMarkedFinInvField();
        this.andreFinInstField = copy.getAndreFinInstField();
        this.bankinnskuddField = copy.getBankinnskuddField();
        this.andreOmlopsmidlerField = copy.getAndreOmlopsmidlerField();
        this.sumEiendelerField = copy.getSumEiendelerField();
        this.pantstillelserField = copy.getPantstillelserField();
    }

    public Builder withRegnskapsAvArField(Integer regnskapsAvArField) {
      this.regnskapsAvArField = regnskapsAvArField;
      return this;
    }

    public Builder withRegnskapsAvMndField(Integer regnskapsAvMndField) {
      this.regnskapsAvMndField = regnskapsAvMndField;
      return this;
    }

    public Builder withSumAnleggsmidlerField(Long sumAnleggsmidlerField) {
      this.sumAnleggsmidlerField = sumAnleggsmidlerField;
      return this;
    }

    public Builder withSumImmatrielleEiendelerField(Long sumImmatrielleEiendelerField) {
      this.sumImmatrielleEiendelerField = sumImmatrielleEiendelerField;
      return this;
    }

    public Builder withForskningUtviklingField(Long forskningUtviklingField) {
      this.forskningUtviklingField = forskningUtviklingField;
      return this;
    }

    public Builder withKonsesjonerField(Long konsesjonerField) {
      this.konsesjonerField = konsesjonerField;
      return this;
    }

    public Builder withUtsattSkattefordelField(Long utsattSkattefordelField) {
      this.utsattSkattefordelField = utsattSkattefordelField;
      return this;
    }

    public Builder withGoodwillField(Long goodwillField) {
      this.goodwillField = goodwillField;
      return this;
    }

    public Builder withSumVarigeDriftsmidlerField(Long sumVarigeDriftsmidlerField) {
      this.sumVarigeDriftsmidlerField = sumVarigeDriftsmidlerField;
      return this;
    }

    public Builder withFastEiendomField(Long fastEiendomField) {
      this.fastEiendomField = fastEiendomField;
      return this;
    }

    public Builder withMaskinerAnleggField(Long maskinerAnleggField) {
      this.maskinerAnleggField = maskinerAnleggField;
      return this;
    }

    public Builder withSkipRiggFlyField(Long skipRiggFlyField) {
      this.skipRiggFlyField = skipRiggFlyField;
      return this;
    }

    public Builder withDriftsLosoreField(Long driftsLosoreField) {
      this.driftsLosoreField = driftsLosoreField;
      return this;
    }

    public Builder withSumFinansielleAnleggsmilderField(Long sumFinansielleAnleggsmilderField) {
      this.sumFinansielleAnleggsmilderField = sumFinansielleAnleggsmilderField;
      return this;
    }

    public Builder withInvestDatterField(Long investDatterField) {
      this.investDatterField = investDatterField;
      return this;
    }

    public Builder withInvestAnnetKonsernField(Long investAnnetKonsernField) {
      this.investAnnetKonsernField = investAnnetKonsernField;
      return this;
    }

    public Builder withKonsernfordringField(Long konsernfordringField) {
      this.konsernfordringField = konsernfordringField;
      return this;
    }

    public Builder withInvestTilknyttetField(Long investTilknyttetField) {
      this.investTilknyttetField = investTilknyttetField;
      return this;
    }

    public Builder withLanTilknyttetField(Long lanTilknyttetField) {
      this.lanTilknyttetField = lanTilknyttetField;
      return this;
    }

    public Builder withInvestAksjerField(Long investAksjerField) {
      this.investAksjerField = investAksjerField;
      return this;
    }

    public Builder withObligasjonerField(Long obligasjonerField) {
      this.obligasjonerField = obligasjonerField;
      return this;
    }

    public Builder withPensjonsmidlerField(Long pensjonsmidlerField) {
      this.pensjonsmidlerField = pensjonsmidlerField;
      return this;
    }

    public Builder withAndreAnleggsmidlerField(Long andreAnleggsmidlerField) {
      this.andreAnleggsmidlerField = andreAnleggsmidlerField;
      return this;
    }

    public Builder withSumOmlopsmidlerField(Long sumOmlopsmidlerField) {
      this.sumOmlopsmidlerField = sumOmlopsmidlerField;
      return this;
    }

    public Builder withSumVarerField(Long sumVarerField) {
      this.sumVarerField = sumVarerField;
      return this;
    }

    public Builder withLagerRavarerField(Long lagerRavarerField) {
      this.lagerRavarerField = lagerRavarerField;
      return this;
    }

    public Builder withLagerUferdigeVarerField(Long lagerUferdigeVarerField) {
      this.lagerUferdigeVarerField = lagerUferdigeVarerField;
      return this;
    }

    public Builder withLagerFerdigeVarerField(Long lagerFerdigeVarerField) {
      this.lagerFerdigeVarerField = lagerFerdigeVarerField;
      return this;
    }

    public Builder withSumFordringerField(Long sumFordringerField) {
      this.sumFordringerField = sumFordringerField;
      return this;
    }

    public Builder withFordringerKunderField(Long fordringerKunderField) {
      this.fordringerKunderField = fordringerKunderField;
      return this;
    }

    public Builder withFordringerAndreField(Long fordringerAndreField) {
      this.fordringerAndreField = fordringerAndreField;
      return this;
    }

    public Builder withFordringerKonsernField(Long fordringerKonsernField) {
      this.fordringerKonsernField = fordringerKonsernField;
      return this;
    }

    public Builder withKravInnbetSelskapskapitalField(Long kravInnbetSelskapskapitalField) {
      this.kravInnbetSelskapskapitalField = kravInnbetSelskapskapitalField;
      return this;
    }

    public Builder withSumInvesteringerField(Long sumInvesteringerField) {
      this.sumInvesteringerField = sumInvesteringerField;
      return this;
    }

    public Builder withAksjerKonsernField(Long aksjerKonsernField) {
      this.aksjerKonsernField = aksjerKonsernField;
      return this;
    }

    public Builder withAksjerMarkedField(Long aksjerMarkedField) {
      this.aksjerMarkedField = aksjerMarkedField;
      return this;
    }

    public Builder withObligasjonerMarkedField(Long obligasjonerMarkedField) {
      this.obligasjonerMarkedField = obligasjonerMarkedField;
      return this;
    }

    public Builder withAndreMarkedFinInvField(Long andreMarkedFinInvField) {
      this.andreMarkedFinInvField = andreMarkedFinInvField;
      return this;
    }

    public Builder withAndreFinInstField(Long andreFinInstField) {
      this.andreFinInstField = andreFinInstField;
      return this;
    }

    public Builder withBankinnskuddField(Long bankinnskuddField) {
      this.bankinnskuddField = bankinnskuddField;
      return this;
    }

    public Builder withAndreOmlopsmidlerField(Long andreOmlopsmidlerField) {
      this.andreOmlopsmidlerField = andreOmlopsmidlerField;
      return this;
    }

    public Builder withSumEiendelerField(Long sumEiendelerField) {
      this.sumEiendelerField = sumEiendelerField;
      return this;
    }

    public Builder withPantstillelserField(Long pantstillelserField) {
      this.pantstillelserField = pantstillelserField;
      return this;
    }


    public EiendelerForetak build() { return new EiendelerForetak(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EiendelerForetak eiendelerForetak = (EiendelerForetak) o;
    return Objects.equals(this.regnskapsAvArField, eiendelerForetak.regnskapsAvArField) &&
        Objects.equals(this.regnskapsAvMndField, eiendelerForetak.regnskapsAvMndField) &&
        Objects.equals(this.sumAnleggsmidlerField, eiendelerForetak.sumAnleggsmidlerField) &&
        Objects.equals(this.sumImmatrielleEiendelerField, eiendelerForetak.sumImmatrielleEiendelerField) &&
        Objects.equals(this.forskningUtviklingField, eiendelerForetak.forskningUtviklingField) &&
        Objects.equals(this.konsesjonerField, eiendelerForetak.konsesjonerField) &&
        Objects.equals(this.utsattSkattefordelField, eiendelerForetak.utsattSkattefordelField) &&
        Objects.equals(this.goodwillField, eiendelerForetak.goodwillField) &&
        Objects.equals(this.sumVarigeDriftsmidlerField, eiendelerForetak.sumVarigeDriftsmidlerField) &&
        Objects.equals(this.fastEiendomField, eiendelerForetak.fastEiendomField) &&
        Objects.equals(this.maskinerAnleggField, eiendelerForetak.maskinerAnleggField) &&
        Objects.equals(this.skipRiggFlyField, eiendelerForetak.skipRiggFlyField) &&
        Objects.equals(this.driftsLosoreField, eiendelerForetak.driftsLosoreField) &&
        Objects.equals(this.sumFinansielleAnleggsmilderField, eiendelerForetak.sumFinansielleAnleggsmilderField) &&
        Objects.equals(this.investDatterField, eiendelerForetak.investDatterField) &&
        Objects.equals(this.investAnnetKonsernField, eiendelerForetak.investAnnetKonsernField) &&
        Objects.equals(this.konsernfordringField, eiendelerForetak.konsernfordringField) &&
        Objects.equals(this.investTilknyttetField, eiendelerForetak.investTilknyttetField) &&
        Objects.equals(this.lanTilknyttetField, eiendelerForetak.lanTilknyttetField) &&
        Objects.equals(this.investAksjerField, eiendelerForetak.investAksjerField) &&
        Objects.equals(this.obligasjonerField, eiendelerForetak.obligasjonerField) &&
        Objects.equals(this.pensjonsmidlerField, eiendelerForetak.pensjonsmidlerField) &&
        Objects.equals(this.andreAnleggsmidlerField, eiendelerForetak.andreAnleggsmidlerField) &&
        Objects.equals(this.sumOmlopsmidlerField, eiendelerForetak.sumOmlopsmidlerField) &&
        Objects.equals(this.sumVarerField, eiendelerForetak.sumVarerField) &&
        Objects.equals(this.lagerRavarerField, eiendelerForetak.lagerRavarerField) &&
        Objects.equals(this.lagerUferdigeVarerField, eiendelerForetak.lagerUferdigeVarerField) &&
        Objects.equals(this.lagerFerdigeVarerField, eiendelerForetak.lagerFerdigeVarerField) &&
        Objects.equals(this.sumFordringerField, eiendelerForetak.sumFordringerField) &&
        Objects.equals(this.fordringerKunderField, eiendelerForetak.fordringerKunderField) &&
        Objects.equals(this.fordringerAndreField, eiendelerForetak.fordringerAndreField) &&
        Objects.equals(this.fordringerKonsernField, eiendelerForetak.fordringerKonsernField) &&
        Objects.equals(this.kravInnbetSelskapskapitalField, eiendelerForetak.kravInnbetSelskapskapitalField) &&
        Objects.equals(this.sumInvesteringerField, eiendelerForetak.sumInvesteringerField) &&
        Objects.equals(this.aksjerKonsernField, eiendelerForetak.aksjerKonsernField) &&
        Objects.equals(this.aksjerMarkedField, eiendelerForetak.aksjerMarkedField) &&
        Objects.equals(this.obligasjonerMarkedField, eiendelerForetak.obligasjonerMarkedField) &&
        Objects.equals(this.andreMarkedFinInvField, eiendelerForetak.andreMarkedFinInvField) &&
        Objects.equals(this.andreFinInstField, eiendelerForetak.andreFinInstField) &&
        Objects.equals(this.bankinnskuddField, eiendelerForetak.bankinnskuddField) &&
        Objects.equals(this.andreOmlopsmidlerField, eiendelerForetak.andreOmlopsmidlerField) &&
        Objects.equals(this.sumEiendelerField, eiendelerForetak.sumEiendelerField) &&
        Objects.equals(this.pantstillelserField, eiendelerForetak.pantstillelserField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regnskapsAvArField, regnskapsAvMndField, sumAnleggsmidlerField, sumImmatrielleEiendelerField, forskningUtviklingField, konsesjonerField, utsattSkattefordelField, goodwillField, sumVarigeDriftsmidlerField, fastEiendomField, maskinerAnleggField, skipRiggFlyField, driftsLosoreField, sumFinansielleAnleggsmilderField, investDatterField, investAnnetKonsernField, konsernfordringField, investTilknyttetField, lanTilknyttetField, investAksjerField, obligasjonerField, pensjonsmidlerField, andreAnleggsmidlerField, sumOmlopsmidlerField, sumVarerField, lagerRavarerField, lagerUferdigeVarerField, lagerFerdigeVarerField, sumFordringerField, fordringerKunderField, fordringerAndreField, fordringerKonsernField, kravInnbetSelskapskapitalField, sumInvesteringerField, aksjerKonsernField, aksjerMarkedField, obligasjonerMarkedField, andreMarkedFinInvField, andreFinInstField, bankinnskuddField, andreOmlopsmidlerField, sumEiendelerField, pantstillelserField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EiendelerForetak {\n");
    
    sb.append("    regnskapsAvArField: ").append(toIndentedString(regnskapsAvArField)).append("\n");
    sb.append("    regnskapsAvMndField: ").append(toIndentedString(regnskapsAvMndField)).append("\n");
    sb.append("    sumAnleggsmidlerField: ").append(toIndentedString(sumAnleggsmidlerField)).append("\n");
    sb.append("    sumImmatrielleEiendelerField: ").append(toIndentedString(sumImmatrielleEiendelerField)).append("\n");
    sb.append("    forskningUtviklingField: ").append(toIndentedString(forskningUtviklingField)).append("\n");
    sb.append("    konsesjonerField: ").append(toIndentedString(konsesjonerField)).append("\n");
    sb.append("    utsattSkattefordelField: ").append(toIndentedString(utsattSkattefordelField)).append("\n");
    sb.append("    goodwillField: ").append(toIndentedString(goodwillField)).append("\n");
    sb.append("    sumVarigeDriftsmidlerField: ").append(toIndentedString(sumVarigeDriftsmidlerField)).append("\n");
    sb.append("    fastEiendomField: ").append(toIndentedString(fastEiendomField)).append("\n");
    sb.append("    maskinerAnleggField: ").append(toIndentedString(maskinerAnleggField)).append("\n");
    sb.append("    skipRiggFlyField: ").append(toIndentedString(skipRiggFlyField)).append("\n");
    sb.append("    driftsLosoreField: ").append(toIndentedString(driftsLosoreField)).append("\n");
    sb.append("    sumFinansielleAnleggsmilderField: ").append(toIndentedString(sumFinansielleAnleggsmilderField)).append("\n");
    sb.append("    investDatterField: ").append(toIndentedString(investDatterField)).append("\n");
    sb.append("    investAnnetKonsernField: ").append(toIndentedString(investAnnetKonsernField)).append("\n");
    sb.append("    konsernfordringField: ").append(toIndentedString(konsernfordringField)).append("\n");
    sb.append("    investTilknyttetField: ").append(toIndentedString(investTilknyttetField)).append("\n");
    sb.append("    lanTilknyttetField: ").append(toIndentedString(lanTilknyttetField)).append("\n");
    sb.append("    investAksjerField: ").append(toIndentedString(investAksjerField)).append("\n");
    sb.append("    obligasjonerField: ").append(toIndentedString(obligasjonerField)).append("\n");
    sb.append("    pensjonsmidlerField: ").append(toIndentedString(pensjonsmidlerField)).append("\n");
    sb.append("    andreAnleggsmidlerField: ").append(toIndentedString(andreAnleggsmidlerField)).append("\n");
    sb.append("    sumOmlopsmidlerField: ").append(toIndentedString(sumOmlopsmidlerField)).append("\n");
    sb.append("    sumVarerField: ").append(toIndentedString(sumVarerField)).append("\n");
    sb.append("    lagerRavarerField: ").append(toIndentedString(lagerRavarerField)).append("\n");
    sb.append("    lagerUferdigeVarerField: ").append(toIndentedString(lagerUferdigeVarerField)).append("\n");
    sb.append("    lagerFerdigeVarerField: ").append(toIndentedString(lagerFerdigeVarerField)).append("\n");
    sb.append("    sumFordringerField: ").append(toIndentedString(sumFordringerField)).append("\n");
    sb.append("    fordringerKunderField: ").append(toIndentedString(fordringerKunderField)).append("\n");
    sb.append("    fordringerAndreField: ").append(toIndentedString(fordringerAndreField)).append("\n");
    sb.append("    fordringerKonsernField: ").append(toIndentedString(fordringerKonsernField)).append("\n");
    sb.append("    kravInnbetSelskapskapitalField: ").append(toIndentedString(kravInnbetSelskapskapitalField)).append("\n");
    sb.append("    sumInvesteringerField: ").append(toIndentedString(sumInvesteringerField)).append("\n");
    sb.append("    aksjerKonsernField: ").append(toIndentedString(aksjerKonsernField)).append("\n");
    sb.append("    aksjerMarkedField: ").append(toIndentedString(aksjerMarkedField)).append("\n");
    sb.append("    obligasjonerMarkedField: ").append(toIndentedString(obligasjonerMarkedField)).append("\n");
    sb.append("    andreMarkedFinInvField: ").append(toIndentedString(andreMarkedFinInvField)).append("\n");
    sb.append("    andreFinInstField: ").append(toIndentedString(andreFinInstField)).append("\n");
    sb.append("    bankinnskuddField: ").append(toIndentedString(bankinnskuddField)).append("\n");
    sb.append("    andreOmlopsmidlerField: ").append(toIndentedString(andreOmlopsmidlerField)).append("\n");
    sb.append("    sumEiendelerField: ").append(toIndentedString(sumEiendelerField)).append("\n");
    sb.append("    pantstillelserField: ").append(toIndentedString(pantstillelserField)).append("\n");
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
