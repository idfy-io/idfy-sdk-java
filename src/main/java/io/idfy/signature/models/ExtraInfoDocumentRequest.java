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
import io.idfy.signature.models.ExtraInfoSignerRequestSpecialProperties;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Settings for extra information to collect about the document (e.g. prokura information).
 */
@JsonDeserialize(builder = ExtraInfoDocumentRequest.Builder.class)
public class ExtraInfoDocumentRequest  implements Serializable {
  /**
   * Gets or Sets types
   */
  public enum Types {
    @JsonProperty("rightsAndProkura")
    RIGHTSANDPROKURA("rightsAndProkura");

    private String value;

    Types(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Types fromValue(String text) {
      for (Types b : Types.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * A list of the extra information you want to order. Certain types require special properties, see documentation for more information. Additional cost will incur (with the exception of Difi company info).
   */
  private final List<Types> types;  // Default value is: new ArrayList<>()

  private final ExtraInfoSignerRequestSpecialProperties specialProperties;  // Default value is: null

  private ExtraInfoDocumentRequest(Builder builder) {
      types = builder.types;
      specialProperties = builder.specialProperties;
  }

      /**
      * A list of the extra information you want to order. Certain types require special properties, see documentation for more information. Additional cost will incur (with the exception of Difi company info).
      * @return types
      **/
      public List<Types> getTypes() {return types;}

      /**
      * Get specialProperties
      * @return specialProperties
      **/
      public ExtraInfoSignerRequestSpecialProperties getSpecialProperties() {return specialProperties;}


  public static final class Builder {
      private List<Types> types;
      private ExtraInfoSignerRequestSpecialProperties specialProperties;

    public Builder() {
    }

    public Builder(ExtraInfoDocumentRequest copy) {
        this.types = copy.getTypes();
        this.specialProperties = copy.getSpecialProperties();
    }

    public Builder withTypes(List<Types> types) {
      this.types = types;
      return this;
    }

    public Builder addTypesItem(Types typesItem) {
      if (this.types == null) {
        this.types = new ArrayList<>();
      }
      this.types.add(typesItem);
      return this;
    }

    public Builder withSpecialProperties(ExtraInfoSignerRequestSpecialProperties specialProperties) {
      this.specialProperties = specialProperties;
      return this;
    }


    public ExtraInfoDocumentRequest build() { return new ExtraInfoDocumentRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraInfoDocumentRequest extraInfoDocumentRequest = (ExtraInfoDocumentRequest) o;
    return Objects.equals(this.types, extraInfoDocumentRequest.types) &&
        Objects.equals(this.specialProperties, extraInfoDocumentRequest.specialProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, specialProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraInfoDocumentRequest {\n");
    
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    specialProperties: ").append(toIndentedString(specialProperties)).append("\n");
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
