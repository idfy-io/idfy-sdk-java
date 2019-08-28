/*
 * Idfy.Admin
 * In this API you can manage your account details, logo, styling or manage your openid / oauth api clients. If you are a dealer you can also manage the accounts registered to this dealer.   ## Last update   Last build date for this API: 14.01.2018  
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.admin.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import io.idfy.admin.models.CreatePdfTemplateDetailsPageHtml;
import io.idfy.admin.models.CreatePdfTemplateLabels;
import io.idfy.admin.models.CreatePdfTemplateVerifiedTemplate;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.io.Serializable;

/**
 * PdfTemplate
 */
@JsonDeserialize(builder = PdfTemplate.Builder.class)
public class PdfTemplate  implements Serializable {
  /**
   * Coverpage is the page added to the document at the beginning or end that show a list of the signers. This settings hides that page or put it first or last. Default firstpage
   */
  public enum CoverPageSetting {
    @JsonProperty("FIRSTPAGE")
    FIRSTPAGE("FIRSTPAGE"),
    
    @JsonProperty("LASTPAGE")
    LASTPAGE("LASTPAGE"),
    
    @JsonProperty("HIDDEN")
    HIDDEN("HIDDEN");

    private String value;

    CoverPageSetting(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CoverPageSetting fromValue(String text) {
      for (CoverPageSetting b : CoverPageSetting.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Coverpage is the page added to the document at the beginning or end that show a list of the signers. This settings hides that page or put it first or last. Default firstpage
   */
  private final CoverPageSetting coverPageSetting;  // Default value is: null

  /**
   * Coverpage is the page added to the document at the beginning or end that show a list of the signers. This settings hides that page or put it first or last. Default firstpage
   */
  private final Boolean addListOfSignaturesOnLastPageOfExistingPDF;  // Default value is: null

  /**
   * The html template for the coverpage, if this is set it will override the default template. See our documentation on more info on how to make your own custom template.
   */
  private final String coverPageHtml;  // Default value is: null

  private final CreatePdfTemplateDetailsPageHtml detailsPageHtml;  // Default value is: null

  private final CreatePdfTemplateVerifiedTemplate verifiedTemplate;  // Default value is: null

  private final CreatePdfTemplateLabels labels;  // Default value is: null

  /**
   * Include your logo in the Pdf template
   */
  private final Boolean includeLogo;  // Default value is: null

  private final UUID id;  // Default value is: null

  /**
   * The name of the Pdf template
   */
  private final String name;  // Default value is: null

  /**
   * Timestamp when the template is last edited
   */
  private final OffsetDateTime lastEdited;  // Default value is: null

  private PdfTemplate(Builder builder) {
      coverPageSetting = builder.coverPageSetting;
      addListOfSignaturesOnLastPageOfExistingPDF = builder.addListOfSignaturesOnLastPageOfExistingPDF;
      coverPageHtml = builder.coverPageHtml;
      detailsPageHtml = builder.detailsPageHtml;
      verifiedTemplate = builder.verifiedTemplate;
      labels = builder.labels;
      includeLogo = builder.includeLogo;
      id = builder.id;
      name = builder.name;
      lastEdited = builder.lastEdited;
  }

      /**
      * Coverpage is the page added to the document at the beginning or end that show a list of the signers. This settings hides that page or put it first or last. Default firstpage
      * @return coverPageSetting
      **/
      public CoverPageSetting getCoverPageSetting() {return coverPageSetting;}

      /**
      * Coverpage is the page added to the document at the beginning or end that show a list of the signers. This settings hides that page or put it first or last. Default firstpage
      * @return addListOfSignaturesOnLastPageOfExistingPDF
      **/
      public Boolean getAddListOfSignaturesOnLastPageOfExistingPDF() {return addListOfSignaturesOnLastPageOfExistingPDF;}

      /**
      * The html template for the coverpage, if this is set it will override the default template. See our documentation on more info on how to make your own custom template.
      * @return coverPageHtml
      **/
      public String getCoverPageHtml() {return coverPageHtml;}

      /**
      * Get detailsPageHtml
      * @return detailsPageHtml
      **/
      public CreatePdfTemplateDetailsPageHtml getDetailsPageHtml() {return detailsPageHtml;}

      /**
      * Get verifiedTemplate
      * @return verifiedTemplate
      **/
      public CreatePdfTemplateVerifiedTemplate getVerifiedTemplate() {return verifiedTemplate;}

      /**
      * Get labels
      * @return labels
      **/
      public CreatePdfTemplateLabels getLabels() {return labels;}

      /**
      * Include your logo in the Pdf template
      * @return includeLogo
      **/
      public Boolean getIncludeLogo() {return includeLogo;}

      /**
      * Get id
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * The name of the Pdf template
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Timestamp when the template is last edited
      * @return lastEdited
      **/
      public OffsetDateTime getLastEdited() {return lastEdited;}


  public static final class Builder {
      private CoverPageSetting coverPageSetting;
      private Boolean addListOfSignaturesOnLastPageOfExistingPDF;
      private String coverPageHtml;
      private CreatePdfTemplateDetailsPageHtml detailsPageHtml;
      private CreatePdfTemplateVerifiedTemplate verifiedTemplate;
      private CreatePdfTemplateLabels labels;
      private Boolean includeLogo;
      private UUID id;
      private String name;
      private OffsetDateTime lastEdited;

    public Builder() {
    }

    public Builder(PdfTemplate copy) {
        this.coverPageSetting = copy.getCoverPageSetting();
        this.addListOfSignaturesOnLastPageOfExistingPDF = copy.getAddListOfSignaturesOnLastPageOfExistingPDF();
        this.coverPageHtml = copy.getCoverPageHtml();
        this.detailsPageHtml = copy.getDetailsPageHtml();
        this.verifiedTemplate = copy.getVerifiedTemplate();
        this.labels = copy.getLabels();
        this.includeLogo = copy.getIncludeLogo();
        this.id = copy.getId();
        this.name = copy.getName();
        this.lastEdited = copy.getLastEdited();
    }

    public Builder withCoverPageSetting(CoverPageSetting coverPageSetting) {
      this.coverPageSetting = coverPageSetting;
      return this;
    }

    public Builder withAddListOfSignaturesOnLastPageOfExistingPDF(Boolean addListOfSignaturesOnLastPageOfExistingPDF) {
      this.addListOfSignaturesOnLastPageOfExistingPDF = addListOfSignaturesOnLastPageOfExistingPDF;
      return this;
    }

    public Builder withCoverPageHtml(String coverPageHtml) {
      this.coverPageHtml = coverPageHtml;
      return this;
    }

    public Builder withDetailsPageHtml(CreatePdfTemplateDetailsPageHtml detailsPageHtml) {
      this.detailsPageHtml = detailsPageHtml;
      return this;
    }

    public Builder withVerifiedTemplate(CreatePdfTemplateVerifiedTemplate verifiedTemplate) {
      this.verifiedTemplate = verifiedTemplate;
      return this;
    }

    public Builder withLabels(CreatePdfTemplateLabels labels) {
      this.labels = labels;
      return this;
    }

    public Builder withIncludeLogo(Boolean includeLogo) {
      this.includeLogo = includeLogo;
      return this;
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withLastEdited(OffsetDateTime lastEdited) {
      this.lastEdited = lastEdited;
      return this;
    }


    public PdfTemplate build() { return new PdfTemplate(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfTemplate pdfTemplate = (PdfTemplate) o;
    return Objects.equals(this.coverPageSetting, pdfTemplate.coverPageSetting) &&
        Objects.equals(this.addListOfSignaturesOnLastPageOfExistingPDF, pdfTemplate.addListOfSignaturesOnLastPageOfExistingPDF) &&
        Objects.equals(this.coverPageHtml, pdfTemplate.coverPageHtml) &&
        Objects.equals(this.detailsPageHtml, pdfTemplate.detailsPageHtml) &&
        Objects.equals(this.verifiedTemplate, pdfTemplate.verifiedTemplate) &&
        Objects.equals(this.labels, pdfTemplate.labels) &&
        Objects.equals(this.includeLogo, pdfTemplate.includeLogo) &&
        Objects.equals(this.id, pdfTemplate.id) &&
        Objects.equals(this.name, pdfTemplate.name) &&
        Objects.equals(this.lastEdited, pdfTemplate.lastEdited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverPageSetting, addListOfSignaturesOnLastPageOfExistingPDF, coverPageHtml, detailsPageHtml, verifiedTemplate, labels, includeLogo, id, name, lastEdited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfTemplate {\n");
    
    sb.append("    coverPageSetting: ").append(toIndentedString(coverPageSetting)).append("\n");
    sb.append("    addListOfSignaturesOnLastPageOfExistingPDF: ").append(toIndentedString(addListOfSignaturesOnLastPageOfExistingPDF)).append("\n");
    sb.append("    coverPageHtml: ").append(toIndentedString(coverPageHtml)).append("\n");
    sb.append("    detailsPageHtml: ").append(toIndentedString(detailsPageHtml)).append("\n");
    sb.append("    verifiedTemplate: ").append(toIndentedString(verifiedTemplate)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    includeLogo: ").append(toIndentedString(includeLogo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastEdited: ").append(toIndentedString(lastEdited)).append("\n");
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
