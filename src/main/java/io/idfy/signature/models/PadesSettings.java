/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.signature.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * PAdES settings that can be defined if the &#x60;\&quot;pades\&quot;&#x60; package format is selected.
 */
@JsonDeserialize(builder = PadesSettings.Builder.class)
public class PadesSettings  implements Serializable {
  /**
   * The primary language of the PAdES explanatory page. Defaults to english.
   */
  public enum PrimaryLanguage {
    @JsonProperty("EN")
    EN("EN"),
    
    @JsonProperty("NO")
    NO("NO"),
    
    @JsonProperty("DA")
    DA("DA"),
    
    @JsonProperty("SV")
    SV("SV"),
    
    @JsonProperty("FI")
    FI("FI");

    private String value;

    PrimaryLanguage(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrimaryLanguage fromValue(String text) {
      for (PrimaryLanguage b : PrimaryLanguage.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The primary language of the PAdES explanatory page. Defaults to english.
   */
  private final PrimaryLanguage primaryLanguage;  // Default value is: null

  /**
   * The secondary language of the PAdES explanatory page.
   */
  public enum SecondaryLanguage {
    @JsonProperty("EN")
    EN("EN"),
    
    @JsonProperty("NO")
    NO("NO"),
    
    @JsonProperty("DA")
    DA("DA"),
    
    @JsonProperty("SV")
    SV("SV"),
    
    @JsonProperty("FI")
    FI("FI");

    private String value;

    SecondaryLanguage(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SecondaryLanguage fromValue(String text) {
      for (SecondaryLanguage b : SecondaryLanguage.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The secondary language of the PAdES explanatory page.
   */
  private final SecondaryLanguage secondaryLanguage;  // Default value is: null

  /**
   * The unique ID of PAdES template to use. Can be used if you have previously created your own custom template.
   */
  private final String padesTemplateId;  // Default value is: null

  private PadesSettings(Builder builder) {
      primaryLanguage = builder.primaryLanguage;
      secondaryLanguage = builder.secondaryLanguage;
      padesTemplateId = builder.padesTemplateId;
  }

      /**
      * The primary language of the PAdES explanatory page. Defaults to english.
      * @return primaryLanguage
      **/
      public PrimaryLanguage getPrimaryLanguage() {return primaryLanguage;}

      /**
      * The secondary language of the PAdES explanatory page.
      * @return secondaryLanguage
      **/
      public SecondaryLanguage getSecondaryLanguage() {return secondaryLanguage;}

      /**
      * The unique ID of PAdES template to use. Can be used if you have previously created your own custom template.
      * @return padesTemplateId
      **/
      public String getPadesTemplateId() {return padesTemplateId;}


  public static final class Builder {
      private PrimaryLanguage primaryLanguage;
      private SecondaryLanguage secondaryLanguage;
      private String padesTemplateId;

    public Builder() {
    }

    public Builder(PadesSettings copy) {
        this.primaryLanguage = copy.getPrimaryLanguage();
        this.secondaryLanguage = copy.getSecondaryLanguage();
        this.padesTemplateId = copy.getPadesTemplateId();
    }

    public Builder withPrimaryLanguage(PrimaryLanguage primaryLanguage) {
      this.primaryLanguage = primaryLanguage;
      return this;
    }

    public Builder withSecondaryLanguage(SecondaryLanguage secondaryLanguage) {
      this.secondaryLanguage = secondaryLanguage;
      return this;
    }

    public Builder withPadesTemplateId(String padesTemplateId) {
      this.padesTemplateId = padesTemplateId;
      return this;
    }


    public PadesSettings build() { return new PadesSettings(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PadesSettings padesSettings = (PadesSettings) o;
    return Objects.equals(this.primaryLanguage, padesSettings.primaryLanguage) &&
        Objects.equals(this.secondaryLanguage, padesSettings.secondaryLanguage) &&
        Objects.equals(this.padesTemplateId, padesSettings.padesTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryLanguage, secondaryLanguage, padesTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesSettings {\n");
    
    sb.append("    primaryLanguage: ").append(toIndentedString(primaryLanguage)).append("\n");
    sb.append("    secondaryLanguage: ").append(toIndentedString(secondaryLanguage)).append("\n");
    sb.append("    padesTemplateId: ").append(toIndentedString(padesTemplateId)).append("\n");
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
