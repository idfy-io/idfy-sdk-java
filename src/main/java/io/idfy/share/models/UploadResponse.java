/*
 * Idfy Secure Share
 * This endpoints enables secure sharing with multiple e-ids offered for login
 *
 * OpenAPI spec version: v1
 * 
 */

package io.idfy.share.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Upload information
 */
@JsonDeserialize(builder = UploadResponse.Builder.class)
public class UploadResponse  implements Serializable {
  /**
   * Name of content
   */
  private final String name;  // Default value is: null

  /**
   * If the recipient has opened the file
   */
  private final Boolean opened;  // Default value is: null

  /**
   * When the file was last opened
   */
  private final OffsetDateTime openedDate;  // Default value is: null

  private UploadResponse(Builder builder) {
      name = builder.name;
      opened = builder.opened;
      openedDate = builder.openedDate;
  }

      /**
      * Name of content
      * @return name
      **/
      public String getName() {return name;}

      /**
      * If the recipient has opened the file
      * @return opened
      **/
      public Boolean getOpened() {return opened;}

      /**
      * When the file was last opened
      * @return openedDate
      **/
      public OffsetDateTime getOpenedDate() {return openedDate;}


  public static final class Builder {
      private String name;
      private Boolean opened;
      private OffsetDateTime openedDate;

    public Builder() {
    }

    public Builder(UploadResponse copy) {
        this.name = copy.getName();
        this.opened = copy.getOpened();
        this.openedDate = copy.getOpenedDate();
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withOpened(Boolean opened) {
      this.opened = opened;
      return this;
    }

    public Builder withOpenedDate(OffsetDateTime openedDate) {
      this.openedDate = openedDate;
      return this;
    }


    public UploadResponse build() { return new UploadResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadResponse uploadResponse = (UploadResponse) o;
    return Objects.equals(this.name, uploadResponse.name) &&
        Objects.equals(this.opened, uploadResponse.opened) &&
        Objects.equals(this.openedDate, uploadResponse.openedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, opened, openedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    opened: ").append(toIndentedString(opened)).append("\n");
    sb.append("    openedDate: ").append(toIndentedString(openedDate)).append("\n");
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
