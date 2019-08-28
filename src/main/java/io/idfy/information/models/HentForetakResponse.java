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
import io.idfy.information.models.Aksjonar;
import io.idfy.information.models.AvdelingData;
import io.idfy.information.models.BetaDetaljer;
import io.idfy.information.models.BetaSammendrag;
import io.idfy.information.models.Datterselskap;
import io.idfy.information.models.EiendelerForetak;
import io.idfy.information.models.EiendelerKonsern;
import io.idfy.information.models.EiendomNorge;
import io.idfy.information.models.EiendomNorgeListe;
import io.idfy.information.models.FullmaktForetak;
import io.idfy.information.models.GjeldEgenkapitalForetak;
import io.idfy.information.models.GjeldEgenkapitalKonsern;
import io.idfy.information.models.Grunnfakta;
import io.idfy.information.models.HistoriskRating;
import io.idfy.information.models.Identifikasjon;
import io.idfy.information.models.Juridisk;
import io.idfy.information.models.KonsernLink;
import io.idfy.information.models.Losore;
import io.idfy.information.models.Meldinger;
import io.idfy.information.models.NavnAdresse;
import io.idfy.information.models.NokkeltallBransje;
import io.idfy.information.models.NokkeltallForetak;
import io.idfy.information.models.NokkeltallKonsern;
import io.idfy.information.models.OkonomiDetaljerForetak;
import io.idfy.information.models.OkonomiDetaljerKonsern;
import io.idfy.information.models.OkonomiEnk;
import io.idfy.information.models.OkonomiSammendragForetak;
import io.idfy.information.models.OkonomiSammendragKonsern;
import io.idfy.information.models.Rating;
import io.idfy.information.models.Rettighetshavere;
import io.idfy.information.models.Scoring;
import io.idfy.information.models.Verv;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * HentForetakResponse
 */
@JsonDeserialize(builder = HentForetakResponse.Builder.class)
public class HentForetakResponse  implements Serializable {
  private final Identifikasjon identifikasjonField;  // Default value is: null

  private final NavnAdresse navnAdresseField;  // Default value is: null

  private final Rating ratingField;  // Default value is: null

  private final List<HistoriskRating> histRatingField;  // Default value is: new ArrayList<>()

  private final Grunnfakta grunnfaktaField;  // Default value is: null

  private final List<Juridisk> juridiskField;  // Default value is: new ArrayList<>()

  private final List<Verv> vervField;  // Default value is: new ArrayList<>()

  private final List<Aksjonar> aksjonarField;  // Default value is: new ArrayList<>()

  private final List<Datterselskap> datterselskapField;  // Default value is: new ArrayList<>()

  private final List<OkonomiEnk> okonomiEnkField;  // Default value is: new ArrayList<>()

  private final List<NokkeltallForetak> nokkeltallForetakField;  // Default value is: new ArrayList<>()

  private final List<NokkeltallBransje> nokkeltallBransjeField;  // Default value is: new ArrayList<>()

  private final List<NokkeltallKonsern> nokkeltallKonsernField;  // Default value is: new ArrayList<>()

  private final BetaSammendrag betaSammendragField;  // Default value is: null

  private final List<BetaDetaljer> betaDetaljerField;  // Default value is: new ArrayList<>()

  private final List<Losore> losoreField;  // Default value is: new ArrayList<>()

  private final EiendomNorge eiendomNorgeField;  // Default value is: null

  private final List<KonsernLink> konsernLinkField;  // Default value is: new ArrayList<>()

  private final Scoring scoringField;  // Default value is: null

  private final List<OkonomiSammendragForetak> okonomiSammendragForetakField;  // Default value is: new ArrayList<>()

  private final List<OkonomiSammendragKonsern> okonomiSammendragKonsernField;  // Default value is: new ArrayList<>()

  private final List<OkonomiDetaljerForetak> okonomiDetaljerForetakField;  // Default value is: new ArrayList<>()

  private final List<OkonomiDetaljerKonsern> okonomiDetaljerKonsernField;  // Default value is: new ArrayList<>()

  private final List<EiendelerForetak> eiendelerForetakField;  // Default value is: new ArrayList<>()

  private final List<EiendelerKonsern> eiendelerKonsernField;  // Default value is: new ArrayList<>()

  private final List<GjeldEgenkapitalForetak> gjeldEgenkapitalForetakField;  // Default value is: new ArrayList<>()

  private final List<GjeldEgenkapitalKonsern> gjeldEgenkapitalKonsernField;  // Default value is: new ArrayList<>()

  private final AvdelingData avdelingDataField;  // Default value is: null

  private final List<Rettighetshavere> rettighetshavereField;  // Default value is: new ArrayList<>()

  private final List<EiendomNorgeListe> eiendomNorgeListeField;  // Default value is: new ArrayList<>()

  private final List<FullmaktForetak> fullmaktForetakField;  // Default value is: new ArrayList<>()

  private final List<Meldinger> meldingerField;  // Default value is: new ArrayList<>()

  private HentForetakResponse(Builder builder) {
      identifikasjonField = builder.identifikasjonField;
      navnAdresseField = builder.navnAdresseField;
      ratingField = builder.ratingField;
      histRatingField = builder.histRatingField;
      grunnfaktaField = builder.grunnfaktaField;
      juridiskField = builder.juridiskField;
      vervField = builder.vervField;
      aksjonarField = builder.aksjonarField;
      datterselskapField = builder.datterselskapField;
      okonomiEnkField = builder.okonomiEnkField;
      nokkeltallForetakField = builder.nokkeltallForetakField;
      nokkeltallBransjeField = builder.nokkeltallBransjeField;
      nokkeltallKonsernField = builder.nokkeltallKonsernField;
      betaSammendragField = builder.betaSammendragField;
      betaDetaljerField = builder.betaDetaljerField;
      losoreField = builder.losoreField;
      eiendomNorgeField = builder.eiendomNorgeField;
      konsernLinkField = builder.konsernLinkField;
      scoringField = builder.scoringField;
      okonomiSammendragForetakField = builder.okonomiSammendragForetakField;
      okonomiSammendragKonsernField = builder.okonomiSammendragKonsernField;
      okonomiDetaljerForetakField = builder.okonomiDetaljerForetakField;
      okonomiDetaljerKonsernField = builder.okonomiDetaljerKonsernField;
      eiendelerForetakField = builder.eiendelerForetakField;
      eiendelerKonsernField = builder.eiendelerKonsernField;
      gjeldEgenkapitalForetakField = builder.gjeldEgenkapitalForetakField;
      gjeldEgenkapitalKonsernField = builder.gjeldEgenkapitalKonsernField;
      avdelingDataField = builder.avdelingDataField;
      rettighetshavereField = builder.rettighetshavereField;
      eiendomNorgeListeField = builder.eiendomNorgeListeField;
      fullmaktForetakField = builder.fullmaktForetakField;
      meldingerField = builder.meldingerField;
  }

      /**
      * Get identifikasjonField
      * @return identifikasjonField
      **/
      public Identifikasjon getIdentifikasjonField() {return identifikasjonField;}

      /**
      * Get navnAdresseField
      * @return navnAdresseField
      **/
      public NavnAdresse getNavnAdresseField() {return navnAdresseField;}

      /**
      * Get ratingField
      * @return ratingField
      **/
      public Rating getRatingField() {return ratingField;}

      /**
      * Get histRatingField
      * @return histRatingField
      **/
      public List<HistoriskRating> getHistRatingField() {return histRatingField;}

      /**
      * Get grunnfaktaField
      * @return grunnfaktaField
      **/
      public Grunnfakta getGrunnfaktaField() {return grunnfaktaField;}

      /**
      * Get juridiskField
      * @return juridiskField
      **/
      public List<Juridisk> getJuridiskField() {return juridiskField;}

      /**
      * Get vervField
      * @return vervField
      **/
      public List<Verv> getVervField() {return vervField;}

      /**
      * Get aksjonarField
      * @return aksjonarField
      **/
      public List<Aksjonar> getAksjonarField() {return aksjonarField;}

      /**
      * Get datterselskapField
      * @return datterselskapField
      **/
      public List<Datterselskap> getDatterselskapField() {return datterselskapField;}

      /**
      * Get okonomiEnkField
      * @return okonomiEnkField
      **/
      public List<OkonomiEnk> getOkonomiEnkField() {return okonomiEnkField;}

      /**
      * Get nokkeltallForetakField
      * @return nokkeltallForetakField
      **/
      public List<NokkeltallForetak> getNokkeltallForetakField() {return nokkeltallForetakField;}

      /**
      * Get nokkeltallBransjeField
      * @return nokkeltallBransjeField
      **/
      public List<NokkeltallBransje> getNokkeltallBransjeField() {return nokkeltallBransjeField;}

      /**
      * Get nokkeltallKonsernField
      * @return nokkeltallKonsernField
      **/
      public List<NokkeltallKonsern> getNokkeltallKonsernField() {return nokkeltallKonsernField;}

      /**
      * Get betaSammendragField
      * @return betaSammendragField
      **/
      public BetaSammendrag getBetaSammendragField() {return betaSammendragField;}

      /**
      * Get betaDetaljerField
      * @return betaDetaljerField
      **/
      public List<BetaDetaljer> getBetaDetaljerField() {return betaDetaljerField;}

      /**
      * Get losoreField
      * @return losoreField
      **/
      public List<Losore> getLosoreField() {return losoreField;}

      /**
      * Get eiendomNorgeField
      * @return eiendomNorgeField
      **/
      public EiendomNorge getEiendomNorgeField() {return eiendomNorgeField;}

      /**
      * Get konsernLinkField
      * @return konsernLinkField
      **/
      public List<KonsernLink> getKonsernLinkField() {return konsernLinkField;}

      /**
      * Get scoringField
      * @return scoringField
      **/
      public Scoring getScoringField() {return scoringField;}

      /**
      * Get okonomiSammendragForetakField
      * @return okonomiSammendragForetakField
      **/
      public List<OkonomiSammendragForetak> getOkonomiSammendragForetakField() {return okonomiSammendragForetakField;}

      /**
      * Get okonomiSammendragKonsernField
      * @return okonomiSammendragKonsernField
      **/
      public List<OkonomiSammendragKonsern> getOkonomiSammendragKonsernField() {return okonomiSammendragKonsernField;}

      /**
      * Get okonomiDetaljerForetakField
      * @return okonomiDetaljerForetakField
      **/
      public List<OkonomiDetaljerForetak> getOkonomiDetaljerForetakField() {return okonomiDetaljerForetakField;}

      /**
      * Get okonomiDetaljerKonsernField
      * @return okonomiDetaljerKonsernField
      **/
      public List<OkonomiDetaljerKonsern> getOkonomiDetaljerKonsernField() {return okonomiDetaljerKonsernField;}

      /**
      * Get eiendelerForetakField
      * @return eiendelerForetakField
      **/
      public List<EiendelerForetak> getEiendelerForetakField() {return eiendelerForetakField;}

      /**
      * Get eiendelerKonsernField
      * @return eiendelerKonsernField
      **/
      public List<EiendelerKonsern> getEiendelerKonsernField() {return eiendelerKonsernField;}

      /**
      * Get gjeldEgenkapitalForetakField
      * @return gjeldEgenkapitalForetakField
      **/
      public List<GjeldEgenkapitalForetak> getGjeldEgenkapitalForetakField() {return gjeldEgenkapitalForetakField;}

      /**
      * Get gjeldEgenkapitalKonsernField
      * @return gjeldEgenkapitalKonsernField
      **/
      public List<GjeldEgenkapitalKonsern> getGjeldEgenkapitalKonsernField() {return gjeldEgenkapitalKonsernField;}

      /**
      * Get avdelingDataField
      * @return avdelingDataField
      **/
      public AvdelingData getAvdelingDataField() {return avdelingDataField;}

      /**
      * Get rettighetshavereField
      * @return rettighetshavereField
      **/
      public List<Rettighetshavere> getRettighetshavereField() {return rettighetshavereField;}

      /**
      * Get eiendomNorgeListeField
      * @return eiendomNorgeListeField
      **/
      public List<EiendomNorgeListe> getEiendomNorgeListeField() {return eiendomNorgeListeField;}

      /**
      * Get fullmaktForetakField
      * @return fullmaktForetakField
      **/
      public List<FullmaktForetak> getFullmaktForetakField() {return fullmaktForetakField;}

      /**
      * Get meldingerField
      * @return meldingerField
      **/
      public List<Meldinger> getMeldingerField() {return meldingerField;}


  public static final class Builder {
      private Identifikasjon identifikasjonField;
      private NavnAdresse navnAdresseField;
      private Rating ratingField;
      private List<HistoriskRating> histRatingField;
      private Grunnfakta grunnfaktaField;
      private List<Juridisk> juridiskField;
      private List<Verv> vervField;
      private List<Aksjonar> aksjonarField;
      private List<Datterselskap> datterselskapField;
      private List<OkonomiEnk> okonomiEnkField;
      private List<NokkeltallForetak> nokkeltallForetakField;
      private List<NokkeltallBransje> nokkeltallBransjeField;
      private List<NokkeltallKonsern> nokkeltallKonsernField;
      private BetaSammendrag betaSammendragField;
      private List<BetaDetaljer> betaDetaljerField;
      private List<Losore> losoreField;
      private EiendomNorge eiendomNorgeField;
      private List<KonsernLink> konsernLinkField;
      private Scoring scoringField;
      private List<OkonomiSammendragForetak> okonomiSammendragForetakField;
      private List<OkonomiSammendragKonsern> okonomiSammendragKonsernField;
      private List<OkonomiDetaljerForetak> okonomiDetaljerForetakField;
      private List<OkonomiDetaljerKonsern> okonomiDetaljerKonsernField;
      private List<EiendelerForetak> eiendelerForetakField;
      private List<EiendelerKonsern> eiendelerKonsernField;
      private List<GjeldEgenkapitalForetak> gjeldEgenkapitalForetakField;
      private List<GjeldEgenkapitalKonsern> gjeldEgenkapitalKonsernField;
      private AvdelingData avdelingDataField;
      private List<Rettighetshavere> rettighetshavereField;
      private List<EiendomNorgeListe> eiendomNorgeListeField;
      private List<FullmaktForetak> fullmaktForetakField;
      private List<Meldinger> meldingerField;

    public Builder() {
    }

    public Builder(HentForetakResponse copy) {
        this.identifikasjonField = copy.getIdentifikasjonField();
        this.navnAdresseField = copy.getNavnAdresseField();
        this.ratingField = copy.getRatingField();
        this.histRatingField = copy.getHistRatingField();
        this.grunnfaktaField = copy.getGrunnfaktaField();
        this.juridiskField = copy.getJuridiskField();
        this.vervField = copy.getVervField();
        this.aksjonarField = copy.getAksjonarField();
        this.datterselskapField = copy.getDatterselskapField();
        this.okonomiEnkField = copy.getOkonomiEnkField();
        this.nokkeltallForetakField = copy.getNokkeltallForetakField();
        this.nokkeltallBransjeField = copy.getNokkeltallBransjeField();
        this.nokkeltallKonsernField = copy.getNokkeltallKonsernField();
        this.betaSammendragField = copy.getBetaSammendragField();
        this.betaDetaljerField = copy.getBetaDetaljerField();
        this.losoreField = copy.getLosoreField();
        this.eiendomNorgeField = copy.getEiendomNorgeField();
        this.konsernLinkField = copy.getKonsernLinkField();
        this.scoringField = copy.getScoringField();
        this.okonomiSammendragForetakField = copy.getOkonomiSammendragForetakField();
        this.okonomiSammendragKonsernField = copy.getOkonomiSammendragKonsernField();
        this.okonomiDetaljerForetakField = copy.getOkonomiDetaljerForetakField();
        this.okonomiDetaljerKonsernField = copy.getOkonomiDetaljerKonsernField();
        this.eiendelerForetakField = copy.getEiendelerForetakField();
        this.eiendelerKonsernField = copy.getEiendelerKonsernField();
        this.gjeldEgenkapitalForetakField = copy.getGjeldEgenkapitalForetakField();
        this.gjeldEgenkapitalKonsernField = copy.getGjeldEgenkapitalKonsernField();
        this.avdelingDataField = copy.getAvdelingDataField();
        this.rettighetshavereField = copy.getRettighetshavereField();
        this.eiendomNorgeListeField = copy.getEiendomNorgeListeField();
        this.fullmaktForetakField = copy.getFullmaktForetakField();
        this.meldingerField = copy.getMeldingerField();
    }

    public Builder withIdentifikasjonField(Identifikasjon identifikasjonField) {
      this.identifikasjonField = identifikasjonField;
      return this;
    }

    public Builder withNavnAdresseField(NavnAdresse navnAdresseField) {
      this.navnAdresseField = navnAdresseField;
      return this;
    }

    public Builder withRatingField(Rating ratingField) {
      this.ratingField = ratingField;
      return this;
    }

    public Builder withHistRatingField(List<HistoriskRating> histRatingField) {
      this.histRatingField = histRatingField;
      return this;
    }

    public Builder addHistRatingFieldItem(HistoriskRating histRatingFieldItem) {
      if (this.histRatingField == null) {
        this.histRatingField = new ArrayList<>();
      }
      this.histRatingField.add(histRatingFieldItem);
      return this;
    }

    public Builder withGrunnfaktaField(Grunnfakta grunnfaktaField) {
      this.grunnfaktaField = grunnfaktaField;
      return this;
    }

    public Builder withJuridiskField(List<Juridisk> juridiskField) {
      this.juridiskField = juridiskField;
      return this;
    }

    public Builder addJuridiskFieldItem(Juridisk juridiskFieldItem) {
      if (this.juridiskField == null) {
        this.juridiskField = new ArrayList<>();
      }
      this.juridiskField.add(juridiskFieldItem);
      return this;
    }

    public Builder withVervField(List<Verv> vervField) {
      this.vervField = vervField;
      return this;
    }

    public Builder addVervFieldItem(Verv vervFieldItem) {
      if (this.vervField == null) {
        this.vervField = new ArrayList<>();
      }
      this.vervField.add(vervFieldItem);
      return this;
    }

    public Builder withAksjonarField(List<Aksjonar> aksjonarField) {
      this.aksjonarField = aksjonarField;
      return this;
    }

    public Builder addAksjonarFieldItem(Aksjonar aksjonarFieldItem) {
      if (this.aksjonarField == null) {
        this.aksjonarField = new ArrayList<>();
      }
      this.aksjonarField.add(aksjonarFieldItem);
      return this;
    }

    public Builder withDatterselskapField(List<Datterselskap> datterselskapField) {
      this.datterselskapField = datterselskapField;
      return this;
    }

    public Builder addDatterselskapFieldItem(Datterselskap datterselskapFieldItem) {
      if (this.datterselskapField == null) {
        this.datterselskapField = new ArrayList<>();
      }
      this.datterselskapField.add(datterselskapFieldItem);
      return this;
    }

    public Builder withOkonomiEnkField(List<OkonomiEnk> okonomiEnkField) {
      this.okonomiEnkField = okonomiEnkField;
      return this;
    }

    public Builder addOkonomiEnkFieldItem(OkonomiEnk okonomiEnkFieldItem) {
      if (this.okonomiEnkField == null) {
        this.okonomiEnkField = new ArrayList<>();
      }
      this.okonomiEnkField.add(okonomiEnkFieldItem);
      return this;
    }

    public Builder withNokkeltallForetakField(List<NokkeltallForetak> nokkeltallForetakField) {
      this.nokkeltallForetakField = nokkeltallForetakField;
      return this;
    }

    public Builder addNokkeltallForetakFieldItem(NokkeltallForetak nokkeltallForetakFieldItem) {
      if (this.nokkeltallForetakField == null) {
        this.nokkeltallForetakField = new ArrayList<>();
      }
      this.nokkeltallForetakField.add(nokkeltallForetakFieldItem);
      return this;
    }

    public Builder withNokkeltallBransjeField(List<NokkeltallBransje> nokkeltallBransjeField) {
      this.nokkeltallBransjeField = nokkeltallBransjeField;
      return this;
    }

    public Builder addNokkeltallBransjeFieldItem(NokkeltallBransje nokkeltallBransjeFieldItem) {
      if (this.nokkeltallBransjeField == null) {
        this.nokkeltallBransjeField = new ArrayList<>();
      }
      this.nokkeltallBransjeField.add(nokkeltallBransjeFieldItem);
      return this;
    }

    public Builder withNokkeltallKonsernField(List<NokkeltallKonsern> nokkeltallKonsernField) {
      this.nokkeltallKonsernField = nokkeltallKonsernField;
      return this;
    }

    public Builder addNokkeltallKonsernFieldItem(NokkeltallKonsern nokkeltallKonsernFieldItem) {
      if (this.nokkeltallKonsernField == null) {
        this.nokkeltallKonsernField = new ArrayList<>();
      }
      this.nokkeltallKonsernField.add(nokkeltallKonsernFieldItem);
      return this;
    }

    public Builder withBetaSammendragField(BetaSammendrag betaSammendragField) {
      this.betaSammendragField = betaSammendragField;
      return this;
    }

    public Builder withBetaDetaljerField(List<BetaDetaljer> betaDetaljerField) {
      this.betaDetaljerField = betaDetaljerField;
      return this;
    }

    public Builder addBetaDetaljerFieldItem(BetaDetaljer betaDetaljerFieldItem) {
      if (this.betaDetaljerField == null) {
        this.betaDetaljerField = new ArrayList<>();
      }
      this.betaDetaljerField.add(betaDetaljerFieldItem);
      return this;
    }

    public Builder withLosoreField(List<Losore> losoreField) {
      this.losoreField = losoreField;
      return this;
    }

    public Builder addLosoreFieldItem(Losore losoreFieldItem) {
      if (this.losoreField == null) {
        this.losoreField = new ArrayList<>();
      }
      this.losoreField.add(losoreFieldItem);
      return this;
    }

    public Builder withEiendomNorgeField(EiendomNorge eiendomNorgeField) {
      this.eiendomNorgeField = eiendomNorgeField;
      return this;
    }

    public Builder withKonsernLinkField(List<KonsernLink> konsernLinkField) {
      this.konsernLinkField = konsernLinkField;
      return this;
    }

    public Builder addKonsernLinkFieldItem(KonsernLink konsernLinkFieldItem) {
      if (this.konsernLinkField == null) {
        this.konsernLinkField = new ArrayList<>();
      }
      this.konsernLinkField.add(konsernLinkFieldItem);
      return this;
    }

    public Builder withScoringField(Scoring scoringField) {
      this.scoringField = scoringField;
      return this;
    }

    public Builder withOkonomiSammendragForetakField(List<OkonomiSammendragForetak> okonomiSammendragForetakField) {
      this.okonomiSammendragForetakField = okonomiSammendragForetakField;
      return this;
    }

    public Builder addOkonomiSammendragForetakFieldItem(OkonomiSammendragForetak okonomiSammendragForetakFieldItem) {
      if (this.okonomiSammendragForetakField == null) {
        this.okonomiSammendragForetakField = new ArrayList<>();
      }
      this.okonomiSammendragForetakField.add(okonomiSammendragForetakFieldItem);
      return this;
    }

    public Builder withOkonomiSammendragKonsernField(List<OkonomiSammendragKonsern> okonomiSammendragKonsernField) {
      this.okonomiSammendragKonsernField = okonomiSammendragKonsernField;
      return this;
    }

    public Builder addOkonomiSammendragKonsernFieldItem(OkonomiSammendragKonsern okonomiSammendragKonsernFieldItem) {
      if (this.okonomiSammendragKonsernField == null) {
        this.okonomiSammendragKonsernField = new ArrayList<>();
      }
      this.okonomiSammendragKonsernField.add(okonomiSammendragKonsernFieldItem);
      return this;
    }

    public Builder withOkonomiDetaljerForetakField(List<OkonomiDetaljerForetak> okonomiDetaljerForetakField) {
      this.okonomiDetaljerForetakField = okonomiDetaljerForetakField;
      return this;
    }

    public Builder addOkonomiDetaljerForetakFieldItem(OkonomiDetaljerForetak okonomiDetaljerForetakFieldItem) {
      if (this.okonomiDetaljerForetakField == null) {
        this.okonomiDetaljerForetakField = new ArrayList<>();
      }
      this.okonomiDetaljerForetakField.add(okonomiDetaljerForetakFieldItem);
      return this;
    }

    public Builder withOkonomiDetaljerKonsernField(List<OkonomiDetaljerKonsern> okonomiDetaljerKonsernField) {
      this.okonomiDetaljerKonsernField = okonomiDetaljerKonsernField;
      return this;
    }

    public Builder addOkonomiDetaljerKonsernFieldItem(OkonomiDetaljerKonsern okonomiDetaljerKonsernFieldItem) {
      if (this.okonomiDetaljerKonsernField == null) {
        this.okonomiDetaljerKonsernField = new ArrayList<>();
      }
      this.okonomiDetaljerKonsernField.add(okonomiDetaljerKonsernFieldItem);
      return this;
    }

    public Builder withEiendelerForetakField(List<EiendelerForetak> eiendelerForetakField) {
      this.eiendelerForetakField = eiendelerForetakField;
      return this;
    }

    public Builder addEiendelerForetakFieldItem(EiendelerForetak eiendelerForetakFieldItem) {
      if (this.eiendelerForetakField == null) {
        this.eiendelerForetakField = new ArrayList<>();
      }
      this.eiendelerForetakField.add(eiendelerForetakFieldItem);
      return this;
    }

    public Builder withEiendelerKonsernField(List<EiendelerKonsern> eiendelerKonsernField) {
      this.eiendelerKonsernField = eiendelerKonsernField;
      return this;
    }

    public Builder addEiendelerKonsernFieldItem(EiendelerKonsern eiendelerKonsernFieldItem) {
      if (this.eiendelerKonsernField == null) {
        this.eiendelerKonsernField = new ArrayList<>();
      }
      this.eiendelerKonsernField.add(eiendelerKonsernFieldItem);
      return this;
    }

    public Builder withGjeldEgenkapitalForetakField(List<GjeldEgenkapitalForetak> gjeldEgenkapitalForetakField) {
      this.gjeldEgenkapitalForetakField = gjeldEgenkapitalForetakField;
      return this;
    }

    public Builder addGjeldEgenkapitalForetakFieldItem(GjeldEgenkapitalForetak gjeldEgenkapitalForetakFieldItem) {
      if (this.gjeldEgenkapitalForetakField == null) {
        this.gjeldEgenkapitalForetakField = new ArrayList<>();
      }
      this.gjeldEgenkapitalForetakField.add(gjeldEgenkapitalForetakFieldItem);
      return this;
    }

    public Builder withGjeldEgenkapitalKonsernField(List<GjeldEgenkapitalKonsern> gjeldEgenkapitalKonsernField) {
      this.gjeldEgenkapitalKonsernField = gjeldEgenkapitalKonsernField;
      return this;
    }

    public Builder addGjeldEgenkapitalKonsernFieldItem(GjeldEgenkapitalKonsern gjeldEgenkapitalKonsernFieldItem) {
      if (this.gjeldEgenkapitalKonsernField == null) {
        this.gjeldEgenkapitalKonsernField = new ArrayList<>();
      }
      this.gjeldEgenkapitalKonsernField.add(gjeldEgenkapitalKonsernFieldItem);
      return this;
    }

    public Builder withAvdelingDataField(AvdelingData avdelingDataField) {
      this.avdelingDataField = avdelingDataField;
      return this;
    }

    public Builder withRettighetshavereField(List<Rettighetshavere> rettighetshavereField) {
      this.rettighetshavereField = rettighetshavereField;
      return this;
    }

    public Builder addRettighetshavereFieldItem(Rettighetshavere rettighetshavereFieldItem) {
      if (this.rettighetshavereField == null) {
        this.rettighetshavereField = new ArrayList<>();
      }
      this.rettighetshavereField.add(rettighetshavereFieldItem);
      return this;
    }

    public Builder withEiendomNorgeListeField(List<EiendomNorgeListe> eiendomNorgeListeField) {
      this.eiendomNorgeListeField = eiendomNorgeListeField;
      return this;
    }

    public Builder addEiendomNorgeListeFieldItem(EiendomNorgeListe eiendomNorgeListeFieldItem) {
      if (this.eiendomNorgeListeField == null) {
        this.eiendomNorgeListeField = new ArrayList<>();
      }
      this.eiendomNorgeListeField.add(eiendomNorgeListeFieldItem);
      return this;
    }

    public Builder withFullmaktForetakField(List<FullmaktForetak> fullmaktForetakField) {
      this.fullmaktForetakField = fullmaktForetakField;
      return this;
    }

    public Builder addFullmaktForetakFieldItem(FullmaktForetak fullmaktForetakFieldItem) {
      if (this.fullmaktForetakField == null) {
        this.fullmaktForetakField = new ArrayList<>();
      }
      this.fullmaktForetakField.add(fullmaktForetakFieldItem);
      return this;
    }

    public Builder withMeldingerField(List<Meldinger> meldingerField) {
      this.meldingerField = meldingerField;
      return this;
    }

    public Builder addMeldingerFieldItem(Meldinger meldingerFieldItem) {
      if (this.meldingerField == null) {
        this.meldingerField = new ArrayList<>();
      }
      this.meldingerField.add(meldingerFieldItem);
      return this;
    }


    public HentForetakResponse build() { return new HentForetakResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HentForetakResponse hentForetakResponse = (HentForetakResponse) o;
    return Objects.equals(this.identifikasjonField, hentForetakResponse.identifikasjonField) &&
        Objects.equals(this.navnAdresseField, hentForetakResponse.navnAdresseField) &&
        Objects.equals(this.ratingField, hentForetakResponse.ratingField) &&
        Objects.equals(this.histRatingField, hentForetakResponse.histRatingField) &&
        Objects.equals(this.grunnfaktaField, hentForetakResponse.grunnfaktaField) &&
        Objects.equals(this.juridiskField, hentForetakResponse.juridiskField) &&
        Objects.equals(this.vervField, hentForetakResponse.vervField) &&
        Objects.equals(this.aksjonarField, hentForetakResponse.aksjonarField) &&
        Objects.equals(this.datterselskapField, hentForetakResponse.datterselskapField) &&
        Objects.equals(this.okonomiEnkField, hentForetakResponse.okonomiEnkField) &&
        Objects.equals(this.nokkeltallForetakField, hentForetakResponse.nokkeltallForetakField) &&
        Objects.equals(this.nokkeltallBransjeField, hentForetakResponse.nokkeltallBransjeField) &&
        Objects.equals(this.nokkeltallKonsernField, hentForetakResponse.nokkeltallKonsernField) &&
        Objects.equals(this.betaSammendragField, hentForetakResponse.betaSammendragField) &&
        Objects.equals(this.betaDetaljerField, hentForetakResponse.betaDetaljerField) &&
        Objects.equals(this.losoreField, hentForetakResponse.losoreField) &&
        Objects.equals(this.eiendomNorgeField, hentForetakResponse.eiendomNorgeField) &&
        Objects.equals(this.konsernLinkField, hentForetakResponse.konsernLinkField) &&
        Objects.equals(this.scoringField, hentForetakResponse.scoringField) &&
        Objects.equals(this.okonomiSammendragForetakField, hentForetakResponse.okonomiSammendragForetakField) &&
        Objects.equals(this.okonomiSammendragKonsernField, hentForetakResponse.okonomiSammendragKonsernField) &&
        Objects.equals(this.okonomiDetaljerForetakField, hentForetakResponse.okonomiDetaljerForetakField) &&
        Objects.equals(this.okonomiDetaljerKonsernField, hentForetakResponse.okonomiDetaljerKonsernField) &&
        Objects.equals(this.eiendelerForetakField, hentForetakResponse.eiendelerForetakField) &&
        Objects.equals(this.eiendelerKonsernField, hentForetakResponse.eiendelerKonsernField) &&
        Objects.equals(this.gjeldEgenkapitalForetakField, hentForetakResponse.gjeldEgenkapitalForetakField) &&
        Objects.equals(this.gjeldEgenkapitalKonsernField, hentForetakResponse.gjeldEgenkapitalKonsernField) &&
        Objects.equals(this.avdelingDataField, hentForetakResponse.avdelingDataField) &&
        Objects.equals(this.rettighetshavereField, hentForetakResponse.rettighetshavereField) &&
        Objects.equals(this.eiendomNorgeListeField, hentForetakResponse.eiendomNorgeListeField) &&
        Objects.equals(this.fullmaktForetakField, hentForetakResponse.fullmaktForetakField) &&
        Objects.equals(this.meldingerField, hentForetakResponse.meldingerField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifikasjonField, navnAdresseField, ratingField, histRatingField, grunnfaktaField, juridiskField, vervField, aksjonarField, datterselskapField, okonomiEnkField, nokkeltallForetakField, nokkeltallBransjeField, nokkeltallKonsernField, betaSammendragField, betaDetaljerField, losoreField, eiendomNorgeField, konsernLinkField, scoringField, okonomiSammendragForetakField, okonomiSammendragKonsernField, okonomiDetaljerForetakField, okonomiDetaljerKonsernField, eiendelerForetakField, eiendelerKonsernField, gjeldEgenkapitalForetakField, gjeldEgenkapitalKonsernField, avdelingDataField, rettighetshavereField, eiendomNorgeListeField, fullmaktForetakField, meldingerField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HentForetakResponse {\n");
    
    sb.append("    identifikasjonField: ").append(toIndentedString(identifikasjonField)).append("\n");
    sb.append("    navnAdresseField: ").append(toIndentedString(navnAdresseField)).append("\n");
    sb.append("    ratingField: ").append(toIndentedString(ratingField)).append("\n");
    sb.append("    histRatingField: ").append(toIndentedString(histRatingField)).append("\n");
    sb.append("    grunnfaktaField: ").append(toIndentedString(grunnfaktaField)).append("\n");
    sb.append("    juridiskField: ").append(toIndentedString(juridiskField)).append("\n");
    sb.append("    vervField: ").append(toIndentedString(vervField)).append("\n");
    sb.append("    aksjonarField: ").append(toIndentedString(aksjonarField)).append("\n");
    sb.append("    datterselskapField: ").append(toIndentedString(datterselskapField)).append("\n");
    sb.append("    okonomiEnkField: ").append(toIndentedString(okonomiEnkField)).append("\n");
    sb.append("    nokkeltallForetakField: ").append(toIndentedString(nokkeltallForetakField)).append("\n");
    sb.append("    nokkeltallBransjeField: ").append(toIndentedString(nokkeltallBransjeField)).append("\n");
    sb.append("    nokkeltallKonsernField: ").append(toIndentedString(nokkeltallKonsernField)).append("\n");
    sb.append("    betaSammendragField: ").append(toIndentedString(betaSammendragField)).append("\n");
    sb.append("    betaDetaljerField: ").append(toIndentedString(betaDetaljerField)).append("\n");
    sb.append("    losoreField: ").append(toIndentedString(losoreField)).append("\n");
    sb.append("    eiendomNorgeField: ").append(toIndentedString(eiendomNorgeField)).append("\n");
    sb.append("    konsernLinkField: ").append(toIndentedString(konsernLinkField)).append("\n");
    sb.append("    scoringField: ").append(toIndentedString(scoringField)).append("\n");
    sb.append("    okonomiSammendragForetakField: ").append(toIndentedString(okonomiSammendragForetakField)).append("\n");
    sb.append("    okonomiSammendragKonsernField: ").append(toIndentedString(okonomiSammendragKonsernField)).append("\n");
    sb.append("    okonomiDetaljerForetakField: ").append(toIndentedString(okonomiDetaljerForetakField)).append("\n");
    sb.append("    okonomiDetaljerKonsernField: ").append(toIndentedString(okonomiDetaljerKonsernField)).append("\n");
    sb.append("    eiendelerForetakField: ").append(toIndentedString(eiendelerForetakField)).append("\n");
    sb.append("    eiendelerKonsernField: ").append(toIndentedString(eiendelerKonsernField)).append("\n");
    sb.append("    gjeldEgenkapitalForetakField: ").append(toIndentedString(gjeldEgenkapitalForetakField)).append("\n");
    sb.append("    gjeldEgenkapitalKonsernField: ").append(toIndentedString(gjeldEgenkapitalKonsernField)).append("\n");
    sb.append("    avdelingDataField: ").append(toIndentedString(avdelingDataField)).append("\n");
    sb.append("    rettighetshavereField: ").append(toIndentedString(rettighetshavereField)).append("\n");
    sb.append("    eiendomNorgeListeField: ").append(toIndentedString(eiendomNorgeListeField)).append("\n");
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
