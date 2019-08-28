/*
 * Idfy Information Services
 * This endpoint offers a lot of useful extra information including credit checks, signature / prokura checks and information regarding persons and companies.   ## Last update   Last build date for this endpoint: 13.12.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.information.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * NavnAdresse
 */
@JsonDeserialize(builder = NavnAdresse.Builder.class)
public class NavnAdresse  implements Serializable {
  private final String kodeTypeField;  // Default value is: null

  private final String kodeTekstField;  // Default value is: null

  private final String navnField;  // Default value is: null

  private final String gateAdresseField;  // Default value is: null

  private final Integer gatePostboksField;  // Default value is: null

  private final Integer gatePostnrField;  // Default value is: null

  private final String gatePoststedField;  // Default value is: null

  private final String postAdresseField;  // Default value is: null

  private final Integer postPostboksField;  // Default value is: null

  private final Integer postPostnrField;  // Default value is: null

  private final String postPoststedField;  // Default value is: null

  private NavnAdresse(Builder builder) {
      kodeTypeField = builder.kodeTypeField;
      kodeTekstField = builder.kodeTekstField;
      navnField = builder.navnField;
      gateAdresseField = builder.gateAdresseField;
      gatePostboksField = builder.gatePostboksField;
      gatePostnrField = builder.gatePostnrField;
      gatePoststedField = builder.gatePoststedField;
      postAdresseField = builder.postAdresseField;
      postPostboksField = builder.postPostboksField;
      postPostnrField = builder.postPostnrField;
      postPoststedField = builder.postPoststedField;
  }

      /**
      * Get kodeTypeField
      * @return kodeTypeField
      **/
      public String getKodeTypeField() {return kodeTypeField;}

      /**
      * Get kodeTekstField
      * @return kodeTekstField
      **/
      public String getKodeTekstField() {return kodeTekstField;}

      /**
      * Get navnField
      * @return navnField
      **/
      public String getNavnField() {return navnField;}

      /**
      * Get gateAdresseField
      * @return gateAdresseField
      **/
      public String getGateAdresseField() {return gateAdresseField;}

      /**
      * Get gatePostboksField
      * @return gatePostboksField
      **/
      public Integer getGatePostboksField() {return gatePostboksField;}

      /**
      * Get gatePostnrField
      * @return gatePostnrField
      **/
      public Integer getGatePostnrField() {return gatePostnrField;}

      /**
      * Get gatePoststedField
      * @return gatePoststedField
      **/
      public String getGatePoststedField() {return gatePoststedField;}

      /**
      * Get postAdresseField
      * @return postAdresseField
      **/
      public String getPostAdresseField() {return postAdresseField;}

      /**
      * Get postPostboksField
      * @return postPostboksField
      **/
      public Integer getPostPostboksField() {return postPostboksField;}

      /**
      * Get postPostnrField
      * @return postPostnrField
      **/
      public Integer getPostPostnrField() {return postPostnrField;}

      /**
      * Get postPoststedField
      * @return postPoststedField
      **/
      public String getPostPoststedField() {return postPoststedField;}


  public static final class Builder {
      private String kodeTypeField;
      private String kodeTekstField;
      private String navnField;
      private String gateAdresseField;
      private Integer gatePostboksField;
      private Integer gatePostnrField;
      private String gatePoststedField;
      private String postAdresseField;
      private Integer postPostboksField;
      private Integer postPostnrField;
      private String postPoststedField;

    public Builder() {
    }

    public Builder(NavnAdresse copy) {
        this.kodeTypeField = copy.getKodeTypeField();
        this.kodeTekstField = copy.getKodeTekstField();
        this.navnField = copy.getNavnField();
        this.gateAdresseField = copy.getGateAdresseField();
        this.gatePostboksField = copy.getGatePostboksField();
        this.gatePostnrField = copy.getGatePostnrField();
        this.gatePoststedField = copy.getGatePoststedField();
        this.postAdresseField = copy.getPostAdresseField();
        this.postPostboksField = copy.getPostPostboksField();
        this.postPostnrField = copy.getPostPostnrField();
        this.postPoststedField = copy.getPostPoststedField();
    }

    public Builder withKodeTypeField(String kodeTypeField) {
      this.kodeTypeField = kodeTypeField;
      return this;
    }

    public Builder withKodeTekstField(String kodeTekstField) {
      this.kodeTekstField = kodeTekstField;
      return this;
    }

    public Builder withNavnField(String navnField) {
      this.navnField = navnField;
      return this;
    }

    public Builder withGateAdresseField(String gateAdresseField) {
      this.gateAdresseField = gateAdresseField;
      return this;
    }

    public Builder withGatePostboksField(Integer gatePostboksField) {
      this.gatePostboksField = gatePostboksField;
      return this;
    }

    public Builder withGatePostnrField(Integer gatePostnrField) {
      this.gatePostnrField = gatePostnrField;
      return this;
    }

    public Builder withGatePoststedField(String gatePoststedField) {
      this.gatePoststedField = gatePoststedField;
      return this;
    }

    public Builder withPostAdresseField(String postAdresseField) {
      this.postAdresseField = postAdresseField;
      return this;
    }

    public Builder withPostPostboksField(Integer postPostboksField) {
      this.postPostboksField = postPostboksField;
      return this;
    }

    public Builder withPostPostnrField(Integer postPostnrField) {
      this.postPostnrField = postPostnrField;
      return this;
    }

    public Builder withPostPoststedField(String postPoststedField) {
      this.postPoststedField = postPoststedField;
      return this;
    }


    public NavnAdresse build() { return new NavnAdresse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NavnAdresse navnAdresse = (NavnAdresse) o;
    return Objects.equals(this.kodeTypeField, navnAdresse.kodeTypeField) &&
        Objects.equals(this.kodeTekstField, navnAdresse.kodeTekstField) &&
        Objects.equals(this.navnField, navnAdresse.navnField) &&
        Objects.equals(this.gateAdresseField, navnAdresse.gateAdresseField) &&
        Objects.equals(this.gatePostboksField, navnAdresse.gatePostboksField) &&
        Objects.equals(this.gatePostnrField, navnAdresse.gatePostnrField) &&
        Objects.equals(this.gatePoststedField, navnAdresse.gatePoststedField) &&
        Objects.equals(this.postAdresseField, navnAdresse.postAdresseField) &&
        Objects.equals(this.postPostboksField, navnAdresse.postPostboksField) &&
        Objects.equals(this.postPostnrField, navnAdresse.postPostnrField) &&
        Objects.equals(this.postPoststedField, navnAdresse.postPoststedField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kodeTypeField, kodeTekstField, navnField, gateAdresseField, gatePostboksField, gatePostnrField, gatePoststedField, postAdresseField, postPostboksField, postPostnrField, postPoststedField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NavnAdresse {\n");
    
    sb.append("    kodeTypeField: ").append(toIndentedString(kodeTypeField)).append("\n");
    sb.append("    kodeTekstField: ").append(toIndentedString(kodeTekstField)).append("\n");
    sb.append("    navnField: ").append(toIndentedString(navnField)).append("\n");
    sb.append("    gateAdresseField: ").append(toIndentedString(gateAdresseField)).append("\n");
    sb.append("    gatePostboksField: ").append(toIndentedString(gatePostboksField)).append("\n");
    sb.append("    gatePostnrField: ").append(toIndentedString(gatePostnrField)).append("\n");
    sb.append("    gatePoststedField: ").append(toIndentedString(gatePoststedField)).append("\n");
    sb.append("    postAdresseField: ").append(toIndentedString(postAdresseField)).append("\n");
    sb.append("    postPostboksField: ").append(toIndentedString(postPostboksField)).append("\n");
    sb.append("    postPostnrField: ").append(toIndentedString(postPostnrField)).append("\n");
    sb.append("    postPoststedField: ").append(toIndentedString(postPoststedField)).append("\n");
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
