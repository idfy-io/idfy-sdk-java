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
import java.time.OffsetDateTime;
import java.util.UUID;
import java.io.Serializable;

/**
 * PdfTemplateListItem
 */
@JsonDeserialize(builder = PdfTemplateListItem.Builder.class)
public class PdfTemplateListItem  implements Serializable {
  private final UUID id;  // Default value is: null

  /**
   * The name of the Pdf template
   */
  private final String name;  // Default value is: null

  /**
   * Timestamp when the template is last edited
   */
  private final OffsetDateTime lastEdited;  // Default value is: null

  private PdfTemplateListItem(Builder builder) {
      id = builder.id;
      name = builder.name;
      lastEdited = builder.lastEdited;
  }

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
      private UUID id;
      private String name;
      private OffsetDateTime lastEdited;

    public Builder() {
    }

    public Builder(PdfTemplateListItem copy) {
        this.id = copy.getId();
        this.name = copy.getName();
        this.lastEdited = copy.getLastEdited();
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


    public PdfTemplateListItem build() { return new PdfTemplateListItem(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfTemplateListItem pdfTemplateListItem = (PdfTemplateListItem) o;
    return Objects.equals(this.id, pdfTemplateListItem.id) &&
        Objects.equals(this.name, pdfTemplateListItem.name) &&
        Objects.equals(this.lastEdited, pdfTemplateListItem.lastEdited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastEdited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfTemplateListItem {\n");
    
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
