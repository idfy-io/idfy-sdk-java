/*
 * Idfy Identification
 * This endpoint enables authentication/identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID. ## Last update   Last build date for this endpoint: 02.04.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.identification.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import io.idfy.identification.models.IFrameSettings;
import io.idfy.identification.models.ReturnUrls;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * Creates a Identity request
 */
@JsonDeserialize(builder = CreateIdentificationRequest.Builder.class)
public class CreateIdentificationRequest  implements Serializable {
  /**
   * The identityprovider to use for the identification, if not set the user will get a list of all the e-ID assosiated with your account to choose from.
   */
  public enum IdentityProvider {
    @JsonProperty("UNKNOWN")
    UNKNOWN("UNKNOWN"),
    
    @JsonProperty("NO_BANKID_MOBILE")
    NO_BANKID_MOBILE("NO_BANKID_MOBILE"),
    
    @JsonProperty("NO_BANKID_WEB")
    NO_BANKID_WEB("NO_BANKID_WEB"),
    
    @JsonProperty("SWE_BANKID")
    SWE_BANKID("SWE_BANKID"),
    
    @JsonProperty("SWE_BANKID_MOBILE")
    SWE_BANKID_MOBILE("SWE_BANKID_MOBILE"),
    
    @JsonProperty("NO_BUYPASS")
    NO_BUYPASS("NO_BUYPASS"),
    
    @JsonProperty("DA_NEMID")
    DA_NEMID("DA_NEMID"),
    
    @JsonProperty("FI_TUPAS")
    FI_TUPAS("FI_TUPAS"),
    
    @JsonProperty("FI_MOBIILIVARMENNE")
    FI_MOBIILIVARMENNE("FI_MOBIILIVARMENNE");

    private String value;

    IdentityProvider(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdentityProvider fromValue(String text) {
      for (IdentityProvider b : IdentityProvider.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The identityprovider to use for the identification, if not set the user will get a list of all the e-ID assosiated with your account to choose from.
   */
  private final IdentityProvider identityProvider;  // Default value is: null

  /**
   * The return urls to be redirected to after the identification process is done
   */
  private final ReturnUrls returnUrls;  // Default value is: null

  /**
   * If the identity process should be done in an iframe this settings object would have to set. The redirect is then done in javascript.
   */
  private final IFrameSettings iFrame;  // Default value is: null

  /**
   * The language to be used for the identification process, if not set the language of the users browser will be used.
   */
  public enum Language {
    @JsonProperty("NO")
    NO("NO"),
    
    @JsonProperty("EN")
    EN("EN"),
    
    @JsonProperty("SV")
    SV("SV"),
    
    @JsonProperty("DA")
    DA("DA"),
    
    @JsonProperty("FI")
    FI("FI");

    private String value;

    Language(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Language fromValue(String text) {
      for (Language b : Language.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The language to be used for the identification process, if not set the language of the users browser will be used.
   */
  private final Language language;  // Default value is: null

  /**
   * Should the socialsecuritynumber be fetched from the identityprovider? Beware that there is an extra cost of doing this every time and one need permission to do it.
   */
  private final Boolean getSocialSecurityNumber;  // Default value is: null

  /**
   * If this is specified then the client will be prefilled with this value. (supported by Norwegian BankID, NemID and Tupas)
   */
  private final String preFilledSocialSecurityNumber;  // Default value is: null

  /**
   * Title of the identification page (Used when redirecting on larger devices). Not used in iFrame mode
   */
  private final String pageTitle;  // Default value is: null

  /**
   * The merchants reference to the identification process, this will also be used to identify an identification in a detailed invoice. It is an advantage if this is unique for each API call.
   */
  private final String externalReference;  // Default value is: null

  /**
   * List of addon data that can be orderd. The result will be in MetaData list of the reponse
   */
  private final Map<String, String> addonservices;  // Default value is: new HashMap<>()

  private CreateIdentificationRequest(Builder builder) {
      identityProvider = builder.identityProvider;
      returnUrls = builder.returnUrls;
      iFrame = builder.iFrame;
      language = builder.language;
      getSocialSecurityNumber = builder.getSocialSecurityNumber;
      preFilledSocialSecurityNumber = builder.preFilledSocialSecurityNumber;
      pageTitle = builder.pageTitle;
      externalReference = builder.externalReference;
      addonservices = builder.addonservices;
  }

      /**
      * The identityprovider to use for the identification, if not set the user will get a list of all the e-ID assosiated with your account to choose from.
      * @return identityProvider
      **/
      public IdentityProvider getIdentityProvider() {return identityProvider;}

      /**
      * The return urls to be redirected to after the identification process is done
      * @return returnUrls
      **/
      public ReturnUrls getReturnUrls() {return returnUrls;}

      /**
      * If the identity process should be done in an iframe this settings object would have to set. The redirect is then done in javascript.
      * @return iFrame
      **/
      public IFrameSettings getIFrame() {return iFrame;}

      /**
      * The language to be used for the identification process, if not set the language of the users browser will be used.
      * @return language
      **/
      public Language getLanguage() {return language;}

      /**
      * Should the socialsecuritynumber be fetched from the identityprovider? Beware that there is an extra cost of doing this every time and one need permission to do it.
      * @return getSocialSecurityNumber
      **/
      public Boolean getGetSocialSecurityNumber() {return getSocialSecurityNumber;}

      /**
      * If this is specified then the client will be prefilled with this value. (supported by Norwegian BankID, NemID and Tupas)
      * @return preFilledSocialSecurityNumber
      **/
      public String getPreFilledSocialSecurityNumber() {return preFilledSocialSecurityNumber;}

      /**
      * Title of the identification page (Used when redirecting on larger devices). Not used in iFrame mode
      * @return pageTitle
      **/
      public String getPageTitle() {return pageTitle;}

      /**
      * The merchants reference to the identification process, this will also be used to identify an identification in a detailed invoice. It is an advantage if this is unique for each API call.
      * @return externalReference
      **/
      public String getExternalReference() {return externalReference;}

      /**
      * List of addon data that can be orderd. The result will be in MetaData list of the reponse
      * @return addonservices
      **/
      public Map<String, String> getAddonservices() {return addonservices;}


  public static final class Builder {
      private IdentityProvider identityProvider;
      private ReturnUrls returnUrls;
      private IFrameSettings iFrame;
      private Language language;
      private Boolean getSocialSecurityNumber;
      private String preFilledSocialSecurityNumber;
      private String pageTitle;
      private String externalReference;
      private Map<String, String> addonservices;

    public Builder() {
    }

    public Builder(CreateIdentificationRequest copy) {
        this.identityProvider = copy.getIdentityProvider();
        this.returnUrls = copy.getReturnUrls();
        this.iFrame = copy.getIFrame();
        this.language = copy.getLanguage();
        this.getSocialSecurityNumber = copy.getGetSocialSecurityNumber();
        this.preFilledSocialSecurityNumber = copy.getPreFilledSocialSecurityNumber();
        this.pageTitle = copy.getPageTitle();
        this.externalReference = copy.getExternalReference();
        this.addonservices = copy.getAddonservices();
    }

    public Builder withIdentityProvider(IdentityProvider identityProvider) {
      this.identityProvider = identityProvider;
      return this;
    }

    public Builder withReturnUrls(ReturnUrls returnUrls) {
      this.returnUrls = returnUrls;
      return this;
    }

    public Builder withIFrame(IFrameSettings iFrame) {
      this.iFrame = iFrame;
      return this;
    }

    public Builder withLanguage(Language language) {
      this.language = language;
      return this;
    }

    public Builder withGetSocialSecurityNumber(Boolean getSocialSecurityNumber) {
      this.getSocialSecurityNumber = getSocialSecurityNumber;
      return this;
    }

    public Builder withPreFilledSocialSecurityNumber(String preFilledSocialSecurityNumber) {
      this.preFilledSocialSecurityNumber = preFilledSocialSecurityNumber;
      return this;
    }

    public Builder withPageTitle(String pageTitle) {
      this.pageTitle = pageTitle;
      return this;
    }

    public Builder withExternalReference(String externalReference) {
      this.externalReference = externalReference;
      return this;
    }

    public Builder withAddonservices(Map<String, String> addonservices) {
      this.addonservices = addonservices;
      return this;
    }

    public Builder putAddonservicesItem(String key, String addonservicesItem) {
      if (this.addonservices == null) {
        this.addonservices = new HashMap<>();
      }
      this.addonservices.put(key, addonservicesItem);
      return this;
    }


    public CreateIdentificationRequest build() { return new CreateIdentificationRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIdentificationRequest createIdentificationRequest = (CreateIdentificationRequest) o;
    return Objects.equals(this.identityProvider, createIdentificationRequest.identityProvider) &&
        Objects.equals(this.returnUrls, createIdentificationRequest.returnUrls) &&
        Objects.equals(this.iFrame, createIdentificationRequest.iFrame) &&
        Objects.equals(this.language, createIdentificationRequest.language) &&
        Objects.equals(this.getSocialSecurityNumber, createIdentificationRequest.getSocialSecurityNumber) &&
        Objects.equals(this.preFilledSocialSecurityNumber, createIdentificationRequest.preFilledSocialSecurityNumber) &&
        Objects.equals(this.pageTitle, createIdentificationRequest.pageTitle) &&
        Objects.equals(this.externalReference, createIdentificationRequest.externalReference) &&
        Objects.equals(this.addonservices, createIdentificationRequest.addonservices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityProvider, returnUrls, iFrame, language, getSocialSecurityNumber, preFilledSocialSecurityNumber, pageTitle, externalReference, addonservices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIdentificationRequest {\n");
    
    sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
    sb.append("    returnUrls: ").append(toIndentedString(returnUrls)).append("\n");
    sb.append("    iFrame: ").append(toIndentedString(iFrame)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    getSocialSecurityNumber: ").append(toIndentedString(getSocialSecurityNumber)).append("\n");
    sb.append("    preFilledSocialSecurityNumber: ").append(toIndentedString(preFilledSocialSecurityNumber)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    addonservices: ").append(toIndentedString(addonservices)).append("\n");
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
