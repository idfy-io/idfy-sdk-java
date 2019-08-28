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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * List of labels for the templates, this are used in the html templates. If this is set it will override the default labels. See our documentation on more info on how to customize.
 */
@JsonDeserialize(builder = CreatePdfTemplateLabels.Builder.class)
public class CreatePdfTemplateLabels  implements Serializable {
  private final Map<String, String> en;  // Default value is: new HashMap<>()

  private final Map<String, String> no;  // Default value is: new HashMap<>()

  private final Map<String, String> sv;  // Default value is: new HashMap<>()

  private final Map<String, String> da;  // Default value is: new HashMap<>()

  private final Map<String, String> fi;  // Default value is: new HashMap<>()

  private CreatePdfTemplateLabels(Builder builder) {
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
      public Map<String, String> getEn() {return en;}

      /**
      * Get no
      * @return no
      **/
      public Map<String, String> getNo() {return no;}

      /**
      * Get sv
      * @return sv
      **/
      public Map<String, String> getSv() {return sv;}

      /**
      * Get da
      * @return da
      **/
      public Map<String, String> getDa() {return da;}

      /**
      * Get fi
      * @return fi
      **/
      public Map<String, String> getFi() {return fi;}


  public static final class Builder {
      private Map<String, String> en;
      private Map<String, String> no;
      private Map<String, String> sv;
      private Map<String, String> da;
      private Map<String, String> fi;

    public Builder() {
    }

    public Builder(CreatePdfTemplateLabels copy) {
        this.en = copy.getEn();
        this.no = copy.getNo();
        this.sv = copy.getSv();
        this.da = copy.getDa();
        this.fi = copy.getFi();
    }

    public Builder withEn(Map<String, String> en) {
      this.en = en;
      return this;
    }

    public Builder putEnItem(String key, String enItem) {
      if (this.en == null) {
        this.en = new HashMap<>();
      }
      this.en.put(key, enItem);
      return this;
    }

    public Builder withNo(Map<String, String> no) {
      this.no = no;
      return this;
    }

    public Builder putNoItem(String key, String noItem) {
      if (this.no == null) {
        this.no = new HashMap<>();
      }
      this.no.put(key, noItem);
      return this;
    }

    public Builder withSv(Map<String, String> sv) {
      this.sv = sv;
      return this;
    }

    public Builder putSvItem(String key, String svItem) {
      if (this.sv == null) {
        this.sv = new HashMap<>();
      }
      this.sv.put(key, svItem);
      return this;
    }

    public Builder withDa(Map<String, String> da) {
      this.da = da;
      return this;
    }

    public Builder putDaItem(String key, String daItem) {
      if (this.da == null) {
        this.da = new HashMap<>();
      }
      this.da.put(key, daItem);
      return this;
    }

    public Builder withFi(Map<String, String> fi) {
      this.fi = fi;
      return this;
    }

    public Builder putFiItem(String key, String fiItem) {
      if (this.fi == null) {
        this.fi = new HashMap<>();
      }
      this.fi.put(key, fiItem);
      return this;
    }


    public CreatePdfTemplateLabels build() { return new CreatePdfTemplateLabels(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePdfTemplateLabels createPdfTemplateLabels = (CreatePdfTemplateLabels) o;
    return Objects.equals(this.en, createPdfTemplateLabels.en) &&
        Objects.equals(this.no, createPdfTemplateLabels.no) &&
        Objects.equals(this.sv, createPdfTemplateLabels.sv) &&
        Objects.equals(this.da, createPdfTemplateLabels.da) &&
        Objects.equals(this.fi, createPdfTemplateLabels.fi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(en, no, sv, da, fi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePdfTemplateLabels {\n");
    
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
