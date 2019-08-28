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
 * List of labels for the verified label on the footer on each page. If this is set it will override the default text. See our documentation on more info on how to customize.
 */
@JsonDeserialize(builder = CreatePdfTemplateVerifiedTemplate.Builder.class)
public class CreatePdfTemplateVerifiedTemplate  implements Serializable {
  private final String en;  // Default value is: null

  private final String no;  // Default value is: null

  private final String sv;  // Default value is: null

  private final String da;  // Default value is: null

  private final String fi;  // Default value is: null

  private CreatePdfTemplateVerifiedTemplate(Builder builder) {
      en = builder.en;
      no = builder.no;
      sv = builder.sv;
      da = builder.da;
      fi = builder.fi;
  }

      /**
      * Get en
      * @return en
      **/
      public String getEn() {return en;}

      /**
      * Get no
      * @return no
      **/
      public String getNo() {return no;}

      /**
      * Get sv
      * @return sv
      **/
      public String getSv() {return sv;}

      /**
      * Get da
      * @return da
      **/
      public String getDa() {return da;}

      /**
      * Get fi
      * @return fi
      **/
      public String getFi() {return fi;}


  public static final class Builder {
      private String en;
      private String no;
      private String sv;
      private String da;
      private String fi;

    public Builder() {
    }

    public Builder(CreatePdfTemplateVerifiedTemplate copy) {
        this.en = copy.getEn();
        this.no = copy.getNo();
        this.sv = copy.getSv();
        this.da = copy.getDa();
        this.fi = copy.getFi();
    }

    public Builder withEn(String en) {
      this.en = en;
      return this;
    }

    public Builder withNo(String no) {
      this.no = no;
      return this;
    }

    public Builder withSv(String sv) {
      this.sv = sv;
      return this;
    }

    public Builder withDa(String da) {
      this.da = da;
      return this;
    }

    public Builder withFi(String fi) {
      this.fi = fi;
      return this;
    }


    public CreatePdfTemplateVerifiedTemplate build() { return new CreatePdfTemplateVerifiedTemplate(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePdfTemplateVerifiedTemplate createPdfTemplateVerifiedTemplate = (CreatePdfTemplateVerifiedTemplate) o;
    return Objects.equals(this.en, createPdfTemplateVerifiedTemplate.en) &&
        Objects.equals(this.no, createPdfTemplateVerifiedTemplate.no) &&
        Objects.equals(this.sv, createPdfTemplateVerifiedTemplate.sv) &&
        Objects.equals(this.da, createPdfTemplateVerifiedTemplate.da) &&
        Objects.equals(this.fi, createPdfTemplateVerifiedTemplate.fi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(en, no, sv, da, fi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePdfTemplateVerifiedTemplate {\n");
    
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
    sb.append("    no: ").append(toIndentedString(no)).append("\n");
    sb.append("    sv: ").append(toIndentedString(sv)).append("\n");
    sb.append("    da: ").append(toIndentedString(da)).append("\n");
    sb.append("    fi: ").append(toIndentedString(fi)).append("\n");
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
