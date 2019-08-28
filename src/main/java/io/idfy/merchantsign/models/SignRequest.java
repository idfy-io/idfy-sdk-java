/*
 * Idfy.MerchantSign
 * This endpoint lets you sign documents with a merchant signature. ## Last update   Last build date for this endpoint: 04.06.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.merchantsign.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * SignRequest
 */
@JsonDeserialize(builder = SignRequest.Builder.class)
public class SignRequest  implements Serializable {
  /**
   * Base 64 encoded data
   */
  private final String dataToSign;  // Default value is: null

  /**
   * Base 64 encoded xslt (optional)
   */
  private final String xslt;  // Default value is: null

  /**
   * Format of data (i.e xml)
   */
  public enum DataFormat {
    @JsonProperty("xml")
    XML("xml"),
    
    @JsonProperty("pdf")
    PDF("pdf"),
    
    @JsonProperty("txt")
    TXT("txt");

    private String value;

    DataFormat(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataFormat fromValue(String text) {
      for (DataFormat b : DataFormat.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Format of data (i.e xml)
   */
  private final DataFormat dataFormat;  // Default value is: null

  /**
   * The service reference for the signing. Will be used for auditlog, and invoicing
   */
  private final String externalReference;  // Default value is: null

  /**
   * Optional, if not set the default setting for the account will be used
   */
  public enum SigningFormat {
    @JsonProperty("use_provider_setting")
    USE_PROVIDER_SETTING("use_provider_setting"),
    
    @JsonProperty("no_bankid_seid_sdo")
    NO_BANKID_SEID_SDO("no_bankid_seid_sdo"),
    
    @JsonProperty("no_bankid_pades")
    NO_BANKID_PADES("no_bankid_pades"),
    
    @JsonProperty("no_buypass_seid_sdo")
    NO_BUYPASS_SEID_SDO("no_buypass_seid_sdo"),
    
    @JsonProperty("da_nemid_xmldsig")
    DA_NEMID_XMLDSIG("da_nemid_xmldsig"),
    
    @JsonProperty("sv_bankid_native_pkcs7")
    SV_BANKID_NATIVE_PKCS7("sv_bankid_native_pkcs7");

    private String value;

    SigningFormat(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SigningFormat fromValue(String text) {
      for (SigningFormat b : SigningFormat.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Optional, if not set the default setting for the account will be used
   */
  private final SigningFormat signingFormat;  // Default value is: null

  private SignRequest(Builder builder) {
      dataToSign = builder.dataToSign;
      xslt = builder.xslt;
      dataFormat = builder.dataFormat;
      externalReference = builder.externalReference;
      signingFormat = builder.signingFormat;
  }

      /**
      * Base 64 encoded data
      * @return dataToSign
      **/
      public String getDataToSign() {return dataToSign;}

      /**
      * Base 64 encoded xslt (optional)
      * @return xslt
      **/
      public String getXslt() {return xslt;}

      /**
      * Format of data (i.e xml)
      * @return dataFormat
      **/
      public DataFormat getDataFormat() {return dataFormat;}

      /**
      * The service reference for the signing. Will be used for auditlog, and invoicing
      * @return externalReference
      **/
      public String getExternalReference() {return externalReference;}

      /**
      * Optional, if not set the default setting for the account will be used
      * @return signingFormat
      **/
      public SigningFormat getSigningFormat() {return signingFormat;}


  public static final class Builder {
      private String dataToSign;
      private String xslt;
      private DataFormat dataFormat;
      private String externalReference;
      private SigningFormat signingFormat;

    public Builder() {
    }

    public Builder(SignRequest copy) {
        this.dataToSign = copy.getDataToSign();
        this.xslt = copy.getXslt();
        this.dataFormat = copy.getDataFormat();
        this.externalReference = copy.getExternalReference();
        this.signingFormat = copy.getSigningFormat();
    }

    public Builder withDataToSign(String dataToSign) {
      this.dataToSign = dataToSign;
      return this;
    }

    public Builder withXslt(String xslt) {
      this.xslt = xslt;
      return this;
    }

    public Builder withDataFormat(DataFormat dataFormat) {
      this.dataFormat = dataFormat;
      return this;
    }

    public Builder withExternalReference(String externalReference) {
      this.externalReference = externalReference;
      return this;
    }

    public Builder withSigningFormat(SigningFormat signingFormat) {
      this.signingFormat = signingFormat;
      return this;
    }


    public SignRequest build() { return new SignRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignRequest signRequest = (SignRequest) o;
    return Objects.equals(this.dataToSign, signRequest.dataToSign) &&
        Objects.equals(this.xslt, signRequest.xslt) &&
        Objects.equals(this.dataFormat, signRequest.dataFormat) &&
        Objects.equals(this.externalReference, signRequest.externalReference) &&
        Objects.equals(this.signingFormat, signRequest.signingFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataToSign, xslt, dataFormat, externalReference, signingFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignRequest {\n");
    
    sb.append("    dataToSign: ").append(toIndentedString(dataToSign)).append("\n");
    sb.append("    xslt: ").append(toIndentedString(xslt)).append("\n");
    sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    signingFormat: ").append(toIndentedString(signingFormat)).append("\n");
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
