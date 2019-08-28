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
import io.idfy.signature.models.PadesSettings;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Settings for packaging of the signed document.
 */
@JsonDeserialize(builder = Packaging.Builder.class)
public class Packaging  implements Serializable {
  /**
   * Gets or Sets signaturePackageFormats
   */
  public enum SignaturePackageFormats {
    @JsonProperty("xades")
    XADES("xades"),
    
    @JsonProperty("pades")
    PADES("pades"),
    
    @JsonProperty("no_bankid_pades")
    NO_BANKID_PADES("no_bankid_pades");

    private String value;

    SignaturePackageFormats(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignaturePackageFormats fromValue(String text) {
      for (SignaturePackageFormats b : SignaturePackageFormats.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * A list of signature formats that will be created and made available for download after the document is signed.  See our documentation for more information about these formats. The native package format is included automatically (i.e. BankID SDO).
   */
  private final List<SignaturePackageFormats> signaturePackageFormats;  // Default value is: new ArrayList<>()

  private final PadesSettings padesSettings;  // Default value is: null

  private Packaging(Builder builder) {
      signaturePackageFormats = builder.signaturePackageFormats;
      padesSettings = builder.padesSettings;
  }

      /**
      * A list of signature formats that will be created and made available for download after the document is signed.  See our documentation for more information about these formats. The native package format is included automatically (i.e. BankID SDO).
      * @return signaturePackageFormats
      **/
      public List<SignaturePackageFormats> getSignaturePackageFormats() {return signaturePackageFormats;}

      /**
      * Get padesSettings
      * @return padesSettings
      **/
      public PadesSettings getPadesSettings() {return padesSettings;}


  public static final class Builder {
      private List<SignaturePackageFormats> signaturePackageFormats;
      private PadesSettings padesSettings;

    public Builder() {
    }

    public Builder(Packaging copy) {
        this.signaturePackageFormats = copy.getSignaturePackageFormats();
        this.padesSettings = copy.getPadesSettings();
    }

    public Builder withSignaturePackageFormats(List<SignaturePackageFormats> signaturePackageFormats) {
      this.signaturePackageFormats = signaturePackageFormats;
      return this;
    }

    public Builder addSignaturePackageFormatsItem(SignaturePackageFormats signaturePackageFormatsItem) {
      if (this.signaturePackageFormats == null) {
        this.signaturePackageFormats = new ArrayList<>();
      }
      this.signaturePackageFormats.add(signaturePackageFormatsItem);
      return this;
    }

    public Builder withPadesSettings(PadesSettings padesSettings) {
      this.padesSettings = padesSettings;
      return this;
    }


    public Packaging build() { return new Packaging(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Packaging packaging = (Packaging) o;
    return Objects.equals(this.signaturePackageFormats, packaging.signaturePackageFormats) &&
        Objects.equals(this.padesSettings, packaging.padesSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signaturePackageFormats, padesSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Packaging {\n");
    
    sb.append("    signaturePackageFormats: ").append(toIndentedString(signaturePackageFormats)).append("\n");
    sb.append("    padesSettings: ").append(toIndentedString(padesSettings)).append("\n");
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
