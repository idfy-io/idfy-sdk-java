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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Settings for the allowed signature methods.
 */
@JsonDeserialize(builder = SignatureType.Builder.class)
public class SignatureType  implements Serializable {
  /**
   * Gets or Sets signatureMethods
   */
  public enum SignatureMethods {
    @JsonProperty("no_bankid")
    NO_BANKID("no_bankid"),
    
    @JsonProperty("no_bankid_mobile")
    NO_BANKID_MOBILE("no_bankid_mobile"),
    
    @JsonProperty("no_bankid_netcentric")
    NO_BANKID_NETCENTRIC("no_bankid_netcentric"),
    
    @JsonProperty("no_buypass")
    NO_BUYPASS("no_buypass"),
    
    @JsonProperty("no_commfides")
    NO_COMMFIDES("no_commfides"),
    
    @JsonProperty("se_bankid")
    SE_BANKID("se_bankid"),
    
    @JsonProperty("dk_nemid")
    DK_NEMID("dk_nemid"),
    
    @JsonProperty("fi_tupas")
    FI_TUPAS("fi_tupas"),
    
    @JsonProperty("fi_mobiilivarmenne")
    FI_MOBIILIVARMENNE("fi_mobiilivarmenne"),
    
    @JsonProperty("nl_digid")
    NL_DIGID("nl_digid"),
    
    @JsonProperty("es_dni")
    ES_DNI("es_dni"),
    
    @JsonProperty("ee_esteid")
    EE_ESTEID("ee_esteid"),
    
    @JsonProperty("mobile_connect")
    MOBILE_CONNECT("mobile_connect"),
    
    @JsonProperty("sms_otp")
    SMS_OTP("sms_otp"),
    
    @JsonProperty("identification_papers")
    IDENTIFICATION_PAPERS("identification_papers"),
    
    @JsonProperty("social")
    SOCIAL("social"),
    
    @JsonProperty("unknown")
    UNKNOWN("unknown");

    private String value;

    SignatureMethods(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureMethods fromValue(String text) {
      for (SignatureMethods b : SignatureMethods.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * A list of signature methods that the signer is allowed to use when signing the document.  If not specified, all available signature methods for your Idfy account will be displayed to the signer.
   */
  private final List<SignatureMethods> signatureMethods;  // Default value is: new ArrayList<>()

  /**
   * Gets or Sets mechanism
   */
  public enum Mechanism {
    @JsonProperty("pkisignature")
    PKISIGNATURE("pkisignature"),
    
    @JsonProperty("identification")
    IDENTIFICATION("identification"),
    
    @JsonProperty("handwritten")
    HANDWRITTEN("handwritten"),
    
    @JsonProperty("handwritten_with_identification")
    HANDWRITTEN_WITH_IDENTIFICATION("handwritten_with_identification");

    private String value;

    Mechanism(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Mechanism fromValue(String text) {
      for (Mechanism b : Mechanism.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final Mechanism mechanism;  // Default value is: null

  private SignatureType(Builder builder) {
      signatureMethods = builder.signatureMethods;
      mechanism = builder.mechanism;
  }

      /**
      * A list of signature methods that the signer is allowed to use when signing the document.  If not specified, all available signature methods for your Idfy account will be displayed to the signer.
      * @return signatureMethods
      **/
      public List<SignatureMethods> getSignatureMethods() {return signatureMethods;}

      /**
      * Get mechanism
      * @return mechanism
      **/
      public Mechanism getMechanism() {return mechanism;}


  public static final class Builder {
      private List<SignatureMethods> signatureMethods;
      private Mechanism mechanism;

    public Builder() {
    }

    public Builder(SignatureType copy) {
        this.signatureMethods = copy.getSignatureMethods();
        this.mechanism = copy.getMechanism();
    }

    public Builder withSignatureMethods(List<SignatureMethods> signatureMethods) {
      this.signatureMethods = signatureMethods;
      return this;
    }

    public Builder addSignatureMethodsItem(SignatureMethods signatureMethodsItem) {
      if (this.signatureMethods == null) {
        this.signatureMethods = new ArrayList<>();
      }
      this.signatureMethods.add(signatureMethodsItem);
      return this;
    }

    public Builder withMechanism(Mechanism mechanism) {
      this.mechanism = mechanism;
      return this;
    }


    public SignatureType build() { return new SignatureType(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureType signatureType = (SignatureType) o;
    return Objects.equals(this.signatureMethods, signatureType.signatureMethods) &&
        Objects.equals(this.mechanism, signatureType.mechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureMethods, mechanism);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureType {\n");
    
    sb.append("    signatureMethods: ").append(toIndentedString(signatureMethods)).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
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
