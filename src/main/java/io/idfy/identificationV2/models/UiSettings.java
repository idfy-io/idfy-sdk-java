/*
 * Idfy Identification v2
 * This endpoint enables identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID.
 *
 * OpenAPI spec version: v2
 * Contact: support@idfy.io
 */
package io.idfy.identificationV2.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.io.Serializable;

/**
 * UI settings for the identification process.
 */
@JsonDeserialize(builder = UiSettings.Builder.class)
public class UiSettings  implements Serializable {
  /**
   * Whether to hide the logo and title of the selected eID provider.
   */
  private final Boolean hideProviderHeader;  // Default value is: null

  /**
   * Whether to hide the footer with the language switcher.
   */
  private final Boolean hideFooter;  // Default value is: null

  private final ThemeMode themeMode;  // Default value is: null

  private final ColorTheme colorTheme;  // Default value is: null

  private UiSettings(Builder builder) {
      hideProviderHeader = builder.hideProviderHeader;
      hideFooter = builder.hideFooter;
      themeMode = builder.themeMode;
      colorTheme = builder.colorTheme;
  }

      /**
      * Whether to hide the logo and title of the selected eID provider.
      * @return hideProviderHeader
      **/
      public Boolean getisHideProviderHeader() {return hideProviderHeader;}

      /**
      * Whether to hide the footer with the language switcher.
      * @return hideFooter
      **/
      public Boolean getisHideFooter() {return hideFooter;}

      /**
      * Get themeMode
      * @return themeMode
      **/
      public ThemeMode getThemeMode() {return themeMode;}

      /**
      * Get colorTheme
      * @return colorTheme
      **/
      public ColorTheme getColorTheme() {return colorTheme;}


  public static final class Builder {
      private Boolean hideProviderHeader;
      private Boolean hideFooter;
      private ThemeMode themeMode;
      private ColorTheme colorTheme;

    public Builder() {
    }

    public Builder(UiSettings copy) {
        this.hideProviderHeader = copy.getisHideProviderHeader();
        this.hideFooter = copy.getisHideFooter();
        this.themeMode = copy.getThemeMode();
        this.colorTheme = copy.getColorTheme();
    }

    public Builder withHideProviderHeader(Boolean hideProviderHeader) {
      this.hideProviderHeader = hideProviderHeader;
      return this;
    }

    public Builder withHideFooter(Boolean hideFooter) {
      this.hideFooter = hideFooter;
      return this;
    }

    public Builder withThemeMode(ThemeMode themeMode) {
      this.themeMode = themeMode;
      return this;
    }

    public Builder withColorTheme(ColorTheme colorTheme) {
      this.colorTheme = colorTheme;
      return this;
    }


    public UiSettings build() { return new UiSettings(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiSettings uiSettings = (UiSettings) o;
    return Objects.equals(this.hideProviderHeader, uiSettings.hideProviderHeader) &&
        Objects.equals(this.hideFooter, uiSettings.hideFooter) &&
        Objects.equals(this.themeMode, uiSettings.themeMode) &&
        Objects.equals(this.colorTheme, uiSettings.colorTheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideProviderHeader, hideFooter, themeMode, colorTheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiSettings {\n");
    
    sb.append("    hideProviderHeader: ").append(toIndentedString(hideProviderHeader)).append("\n");
    sb.append("    hideFooter: ").append(toIndentedString(hideFooter)).append("\n");
    sb.append("    themeMode: ").append(toIndentedString(themeMode)).append("\n");
    sb.append("    colorTheme: ").append(toIndentedString(colorTheme)).append("\n");
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