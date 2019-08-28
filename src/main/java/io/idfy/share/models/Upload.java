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
import java.io.Serializable;

/**
 * Upload
 */
@JsonDeserialize(builder = Upload.Builder.class)
public class Upload  implements Serializable {
  /**
   * Unique id for share
   */
  private final String id;  // Default value is: null

  /**
   * Name of upload, will be presented to the user
   */
  private final String name;  // Default value is: null

  /**
   * What kind of content is it. Defaults to file
   */
  public enum Type {
    @JsonProperty("file")
    FILE("file");

    private String value;

    Type(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Type fromValue(String text) {
      for (Type b : Type.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * What kind of content is it. Defaults to file
   */
  private final Type type;  // Default value is: null

  private Upload(Builder builder) {
      id = builder.id;
      name = builder.name;
      type = builder.type;
  }

      /**
      * Unique id for share
      * @return id
      **/
      public String getId() {return id;}

      /**
      * Name of upload, will be presented to the user
      * @return name
      **/
      public String getName() {return name;}

      /**
      * What kind of content is it. Defaults to file
      * @return type
      **/
      public Type getType() {return type;}


  public static final class Builder {
      private String id;
      private String name;
      private Type type;

    public Builder() {
    }

    public Builder(Upload copy) {
        this.id = copy.getId();
        this.name = copy.getName();
        this.type = copy.getType();
    }

    public Builder withId(String id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withType(Type type) {
      this.type = type;
      return this;
    }


    public Upload build() { return new Upload(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Upload upload = (Upload) o;
    return Objects.equals(this.id, upload.id) &&
        Objects.equals(this.name, upload.name) &&
        Objects.equals(this.type, upload.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upload {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
