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
import java.io.Serializable;

/**
 * TemplateWithIdPreview
 */
@JsonDeserialize(builder = TemplateWithIdPreview.Builder.class)
public class TemplateWithIdPreview  implements Serializable {
  /**
   * Primary language to use in the preview (required)
   */
  public enum PrimaryLanguage {
    @JsonProperty("en")
    EN("en"),
    
    @JsonProperty("no")
    NO("no"),
    
    @JsonProperty("sv")
    SV("sv"),
    
    @JsonProperty("da")
    DA("da"),
    
    @JsonProperty("fi")
    FI("fi");

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
   * Primary language to use in the preview (required)
   */
  private final PrimaryLanguage primaryLanguage;  // Default value is: null

  /**
   * Secondary language to use in the prewview (optional)
   */
  public enum SecondaryLanguage {
    @JsonProperty("en")
    EN("en"),
    
    @JsonProperty("no")
    NO("no"),
    
    @JsonProperty("sv")
    SV("sv"),
    
    @JsonProperty("da")
    DA("da"),
    
    @JsonProperty("fi")
    FI("fi");

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
   * Secondary language to use in the prewview (optional)
   */
  private final SecondaryLanguage secondaryLanguage;  // Default value is: null

  /**
   * Xml package signature in base64 encoding
   */
  private final String xmlSignature;  // Default value is: null

  private TemplateWithIdPreview(Builder builder) {
      primaryLanguage = builder.primaryLanguage;
      secondaryLanguage = builder.secondaryLanguage;
      xmlSignature = builder.xmlSignature;
  }

      /**
      * Primary language to use in the preview (required)
      * @return primaryLanguage
      **/
      public PrimaryLanguage getPrimaryLanguage() {return primaryLanguage;}

      /**
      * Secondary language to use in the prewview (optional)
      * @return secondaryLanguage
      **/
      public SecondaryLanguage getSecondaryLanguage() {return secondaryLanguage;}

      /**
      * Xml package signature in base64 encoding
      * @return xmlSignature
      **/
      public String getXmlSignature() {return xmlSignature;}


  public static final class Builder {
      private PrimaryLanguage primaryLanguage;
      private SecondaryLanguage secondaryLanguage;
      private String xmlSignature;

    public Builder() {
    }

    public Builder(TemplateWithIdPreview copy) {
        this.primaryLanguage = copy.getPrimaryLanguage();
        this.secondaryLanguage = copy.getSecondaryLanguage();
        this.xmlSignature = copy.getXmlSignature();
    }

    public Builder withPrimaryLanguage(PrimaryLanguage primaryLanguage) {
      this.primaryLanguage = primaryLanguage;
      return this;
    }

    public Builder withSecondaryLanguage(SecondaryLanguage secondaryLanguage) {
      this.secondaryLanguage = secondaryLanguage;
      return this;
    }

    public Builder withXmlSignature(String xmlSignature) {
      this.xmlSignature = xmlSignature;
      return this;
    }


    public TemplateWithIdPreview build() { return new TemplateWithIdPreview(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateWithIdPreview templateWithIdPreview = (TemplateWithIdPreview) o;
    return Objects.equals(this.primaryLanguage, templateWithIdPreview.primaryLanguage) &&
        Objects.equals(this.secondaryLanguage, templateWithIdPreview.secondaryLanguage) &&
        Objects.equals(this.xmlSignature, templateWithIdPreview.xmlSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryLanguage, secondaryLanguage, xmlSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateWithIdPreview {\n");
    
    sb.append("    primaryLanguage: ").append(toIndentedString(primaryLanguage)).append("\n");
    sb.append("    secondaryLanguage: ").append(toIndentedString(secondaryLanguage)).append("\n");
    sb.append("    xmlSignature: ").append(toIndentedString(xmlSignature)).append("\n");
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
