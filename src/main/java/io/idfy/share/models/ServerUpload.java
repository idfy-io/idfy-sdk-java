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
 * ServerUpload
 */
@JsonDeserialize(builder = ServerUpload.Builder.class)
public class ServerUpload  implements Serializable {
  private final String id;  // Default value is: null

  private final String name;  // Default value is: null

  private final String content;  // Default value is: null

  /**
   * Gets or Sets type
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

  private final Type type;  // Default value is: null

  private ServerUpload(Builder builder) {
      id = builder.id;
      name = builder.name;
      content = builder.content;
      type = builder.type;
  }

      /**
      * Get id
      * @return id
      **/
      public String getId() {return id;}

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get content
      * @return content
      **/
      public String getContent() {return content;}

      /**
      * Get type
      * @return type
      **/
      public Type getType() {return type;}


  public static final class Builder {
      private String id;
      private String name;
      private String content;
      private Type type;

    public Builder() {
    }

    public Builder(ServerUpload copy) {
        this.id = copy.getId();
        this.name = copy.getName();
        this.content = copy.getContent();
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

    public Builder withContent(String content) {
      this.content = content;
      return this;
    }

    public Builder withType(Type type) {
      this.type = type;
      return this;
    }


    public ServerUpload build() { return new ServerUpload(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerUpload serverUpload = (ServerUpload) o;
    return Objects.equals(this.id, serverUpload.id) &&
        Objects.equals(this.name, serverUpload.name) &&
        Objects.equals(this.content, serverUpload.content) &&
        Objects.equals(this.type, serverUpload.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, content, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerUpload {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
