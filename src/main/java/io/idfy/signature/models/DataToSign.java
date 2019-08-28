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
import io.idfy.signature.models.Packaging;
import java.io.Serializable;

/**
 * The data that will be signed.
 */
@JsonDeserialize(builder = DataToSign.Builder.class)
public class DataToSign  implements Serializable {
  /**
   * Base64-encoded string of the document, UTF-8-encoded.   (this field will be null after we retrieve the initial request, to retrieve the data at a later time you should use the files controller)
   */
  private final String base64Content;  // Default value is: null

  /**
   * Stylesheet to be included if you are uploading XML.
   */
  private final String base64ContentStyleSheet;  // Default value is: null

  /**
   * The document file name. Must include a valid file extension (.pdf, .xml, .txt, .doc, .docx, .rtf, .ott, odt).
   */
  private final String fileName;  // Default value is: null

  /**
   * Determines if the document should be converted to PDF. Supported formats are word documents, rich text format, and OpenOffice (.doc, .docx, .rtf, .odt, .ott).  Remark: When using this, the converted document (and not the original) is the one that will be signed.
   */
  private final Boolean convertToPDF;  // Default value is: null

  private final Packaging packaging;  // Default value is: null

  private DataToSign(Builder builder) {
      base64Content = builder.base64Content;
      base64ContentStyleSheet = builder.base64ContentStyleSheet;
      fileName = builder.fileName;
      convertToPDF = builder.convertToPDF;
      packaging = builder.packaging;
  }

      /**
      * Base64-encoded string of the document, UTF-8-encoded.   (this field will be null after we retrieve the initial request, to retrieve the data at a later time you should use the files controller)
      * @return base64Content
      **/
      public String getBase64Content() {return base64Content;}

      /**
      * Stylesheet to be included if you are uploading XML.
      * @return base64ContentStyleSheet
      **/
      public String getBase64ContentStyleSheet() {return base64ContentStyleSheet;}

      /**
      * The document file name. Must include a valid file extension (.pdf, .xml, .txt, .doc, .docx, .rtf, .ott, odt).
      * @return fileName
      **/
      public String getFileName() {return fileName;}

      /**
      * Determines if the document should be converted to PDF. Supported formats are word documents, rich text format, and OpenOffice (.doc, .docx, .rtf, .odt, .ott).  Remark: When using this, the converted document (and not the original) is the one that will be signed.
      * @return convertToPDF
      **/
      public Boolean getConvertToPDF() {return convertToPDF;}

      /**
      * Get packaging
      * @return packaging
      **/
      public Packaging getPackaging() {return packaging;}


  public static final class Builder {
      private String base64Content;
      private String base64ContentStyleSheet;
      private String fileName;
      private Boolean convertToPDF;
      private Packaging packaging;

    public Builder() {
    }

    public Builder(DataToSign copy) {
        this.base64Content = copy.getBase64Content();
        this.base64ContentStyleSheet = copy.getBase64ContentStyleSheet();
        this.fileName = copy.getFileName();
        this.convertToPDF = copy.getConvertToPDF();
        this.packaging = copy.getPackaging();
    }

    public Builder withBase64Content(String base64Content) {
      this.base64Content = base64Content;
      return this;
    }

    public Builder withBase64ContentStyleSheet(String base64ContentStyleSheet) {
      this.base64ContentStyleSheet = base64ContentStyleSheet;
      return this;
    }

    public Builder withFileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    public Builder withConvertToPDF(Boolean convertToPDF) {
      this.convertToPDF = convertToPDF;
      return this;
    }

    public Builder withPackaging(Packaging packaging) {
      this.packaging = packaging;
      return this;
    }


    public DataToSign build() { return new DataToSign(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataToSign dataToSign = (DataToSign) o;
    return Objects.equals(this.base64Content, dataToSign.base64Content) &&
        Objects.equals(this.base64ContentStyleSheet, dataToSign.base64ContentStyleSheet) &&
        Objects.equals(this.fileName, dataToSign.fileName) &&
        Objects.equals(this.convertToPDF, dataToSign.convertToPDF) &&
        Objects.equals(this.packaging, dataToSign.packaging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64Content, base64ContentStyleSheet, fileName, convertToPDF, packaging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataToSign {\n");
    
    sb.append("    base64Content: ").append(toIndentedString(base64Content)).append("\n");
    sb.append("    base64ContentStyleSheet: ").append(toIndentedString(base64ContentStyleSheet)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    convertToPDF: ").append(toIndentedString(convertToPDF)).append("\n");
    sb.append("    packaging: ").append(toIndentedString(packaging)).append("\n");
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
