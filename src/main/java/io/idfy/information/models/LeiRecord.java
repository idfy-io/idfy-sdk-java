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
import io.idfy.information.models.LeiEntity;
import io.idfy.information.models.LeiExtension;
import io.idfy.information.models.LeiRegistration;
import java.io.Serializable;

/**
 * LeiRecord
 */
@JsonDeserialize(builder = LeiRecord.Builder.class)
public class LeiRecord  implements Serializable {
  private final String lei;  // Default value is: null

  private final LeiEntity entity;  // Default value is: null

  private final LeiRegistration registration;  // Default value is: null

  private final LeiExtension extension;  // Default value is: null

  private LeiRecord(Builder builder) {
      lei = builder.lei;
      entity = builder.entity;
      registration = builder.registration;
      extension = builder.extension;
  }

      /**
      * Get lei
      * @return lei
      **/
      public String getLei() {return lei;}

      /**
      * Get entity
      * @return entity
      **/
      public LeiEntity getEntity() {return entity;}

      /**
      * Get registration
      * @return registration
      **/
      public LeiRegistration getRegistration() {return registration;}

      /**
      * Get extension
      * @return extension
      **/
      public LeiExtension getExtension() {return extension;}


  public static final class Builder {
      private String lei;
      private LeiEntity entity;
      private LeiRegistration registration;
      private LeiExtension extension;

    public Builder() {
    }

    public Builder(LeiRecord copy) {
        this.lei = copy.getLei();
        this.entity = copy.getEntity();
        this.registration = copy.getRegistration();
        this.extension = copy.getExtension();
    }

    public Builder withLei(String lei) {
      this.lei = lei;
      return this;
    }

    public Builder withEntity(LeiEntity entity) {
      this.entity = entity;
      return this;
    }

    public Builder withRegistration(LeiRegistration registration) {
      this.registration = registration;
      return this;
    }

    public Builder withExtension(LeiExtension extension) {
      this.extension = extension;
      return this;
    }


    public LeiRecord build() { return new LeiRecord(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeiRecord leiRecord = (LeiRecord) o;
    return Objects.equals(this.lei, leiRecord.lei) &&
        Objects.equals(this.entity, leiRecord.entity) &&
        Objects.equals(this.registration, leiRecord.registration) &&
        Objects.equals(this.extension, leiRecord.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lei, entity, registration, extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeiRecord {\n");
    
    sb.append("    lei: ").append(toIndentedString(lei)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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
