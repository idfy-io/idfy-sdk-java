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
import java.io.Serializable;

/**
 * Customize styling to make the the signature application look perfect in combination with your own application.
 */
@JsonDeserialize(builder = Styling.Builder.class)
public class Styling  implements Serializable {
  /**
   * The color theme for the application.
   */
  public enum ColorTheme {
    @JsonProperty("Default")
    DEFAULT("Default"),
    
    @JsonProperty("Black")
    BLACK("Black"),
    
    @JsonProperty("Blue")
    BLUE("Blue"),
    
    @JsonProperty("Cyan")
    CYAN("Cyan"),
    
    @JsonProperty("Dark")
    DARK("Dark"),
    
    @JsonProperty("Lime")
    LIME("Lime"),
    
    @JsonProperty("Neutral")
    NEUTRAL("Neutral"),
    
    @JsonProperty("Pink")
    PINK("Pink"),
    
    @JsonProperty("Purple")
    PURPLE("Purple"),
    
    @JsonProperty("Red")
    RED("Red"),
    
    @JsonProperty("Teal")
    TEAL("Teal"),
    
    @JsonProperty("Indigo")
    INDIGO("Indigo"),
    
    @JsonProperty("LightBlue")
    LIGHTBLUE("LightBlue"),
    
    @JsonProperty("DeepPurple")
    DEEPPURPLE("DeepPurple"),
    
    @JsonProperty("Green")
    GREEN("Green"),
    
    @JsonProperty("LightGreen")
    LIGHTGREEN("LightGreen"),
    
    @JsonProperty("Yellow")
    YELLOW("Yellow"),
    
    @JsonProperty("Amber")
    AMBER("Amber"),
    
    @JsonProperty("Orange")
    ORANGE("Orange"),
    
    @JsonProperty("DeepOrange")
    DEEPORANGE("DeepOrange"),
    
    @JsonProperty("Brown")
    BROWN("Brown"),
    
    @JsonProperty("Gray")
    GRAY("Gray"),
    
    @JsonProperty("BlueGray")
    BLUEGRAY("BlueGray");

    private String value;

    ColorTheme(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorTheme fromValue(String text) {
      for (ColorTheme b : ColorTheme.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The color theme for the application.
   */
  private final ColorTheme colorTheme;  // Default value is: null

  /**
   * The theme color mode, specify if you want it dark or light themed. Defaults to light
   */
  public enum ThemeMode {
    @JsonProperty("Default")
    DEFAULT("Default"),
    
    @JsonProperty("Light")
    LIGHT("Light"),
    
    @JsonProperty("Dark")
    DARK("Dark");

    private String value;

    ThemeMode(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ThemeMode fromValue(String text) {
      for (ThemeMode b : ThemeMode.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The theme color mode, specify if you want it dark or light themed. Defaults to light
   */
  private final ThemeMode themeMode;  // Default value is: null

  /**
   * The type of spinner to show in loading screens.
   */
  public enum Spinner {
    @JsonProperty("Document")
    DOCUMENT("Document"),
    
    @JsonProperty("Classic")
    CLASSIC("Classic"),
    
    @JsonProperty("Cubes")
    CUBES("Cubes"),
    
    @JsonProperty("Bounce")
    BOUNCE("Bounce");

    private String value;

    Spinner(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Spinner fromValue(String text) {
      for (Spinner b : Spinner.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * The type of spinner to show in loading screens.
   */
  private final Spinner spinner;  // Default value is: null

  /**
   * If you want to hide the top bar, set this property to true (can be a good choice in iframe mode)
   */
  private final Boolean hideTopBar;  // Default value is: null

  /**
   * Override the application background color (use hexadecimal value)
   */
  private final String backgroundColor;  // Default value is: null

  private Styling(Builder builder) {
      colorTheme = builder.colorTheme;
      themeMode = builder.themeMode;
      spinner = builder.spinner;
      hideTopBar = builder.hideTopBar;
      backgroundColor = builder.backgroundColor;
  }

      /**
      * The color theme for the application.
      * @return colorTheme
      **/
      public ColorTheme getColorTheme() {return colorTheme;}

      /**
      * The theme color mode, specify if you want it dark or light themed. Defaults to light
      * @return themeMode
      **/
      public ThemeMode getThemeMode() {return themeMode;}

      /**
      * The type of spinner to show in loading screens.
      * @return spinner
      **/
      public Spinner getSpinner() {return spinner;}

      /**
      * If you want to hide the top bar, set this property to true (can be a good choice in iframe mode)
      * @return hideTopBar
      **/
      public Boolean getHideTopBar() {return hideTopBar;}

      /**
      * Override the application background color (use hexadecimal value)
      * @return backgroundColor
      **/
      public String getBackgroundColor() {return backgroundColor;}


  public static final class Builder {
      private ColorTheme colorTheme;
      private ThemeMode themeMode;
      private Spinner spinner;
      private Boolean hideTopBar;
      private String backgroundColor;

    public Builder() {
    }

    public Builder(Styling copy) {
        this.colorTheme = copy.getColorTheme();
        this.themeMode = copy.getThemeMode();
        this.spinner = copy.getSpinner();
        this.hideTopBar = copy.getHideTopBar();
        this.backgroundColor = copy.getBackgroundColor();
    }

    public Builder withColorTheme(ColorTheme colorTheme) {
      this.colorTheme = colorTheme;
      return this;
    }

    public Builder withThemeMode(ThemeMode themeMode) {
      this.themeMode = themeMode;
      return this;
    }

    public Builder withSpinner(Spinner spinner) {
      this.spinner = spinner;
      return this;
    }

    public Builder withHideTopBar(Boolean hideTopBar) {
      this.hideTopBar = hideTopBar;
      return this;
    }

    public Builder withBackgroundColor(String backgroundColor) {
      this.backgroundColor = backgroundColor;
      return this;
    }


    public Styling build() { return new Styling(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Styling styling = (Styling) o;
    return Objects.equals(this.colorTheme, styling.colorTheme) &&
        Objects.equals(this.themeMode, styling.themeMode) &&
        Objects.equals(this.spinner, styling.spinner) &&
        Objects.equals(this.hideTopBar, styling.hideTopBar) &&
        Objects.equals(this.backgroundColor, styling.backgroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorTheme, themeMode, spinner, hideTopBar, backgroundColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Styling {\n");
    
    sb.append("    colorTheme: ").append(toIndentedString(colorTheme)).append("\n");
    sb.append("    themeMode: ").append(toIndentedString(themeMode)).append("\n");
    sb.append("    spinner: ").append(toIndentedString(spinner)).append("\n");
    sb.append("    hideTopBar: ").append(toIndentedString(hideTopBar)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
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
