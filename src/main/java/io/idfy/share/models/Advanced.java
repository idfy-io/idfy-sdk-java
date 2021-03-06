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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Optional settings for advanced configuration
 */
@JsonDeserialize(builder = Advanced.Builder.class)
public class Advanced  implements Serializable {
  /**
   * A list of tags to add to the document. These tags can be used to query for  share data and will also be added to all events that are triggered for the document.
   */
  private final List<String> tags;  // Default value is: new ArrayList<>()

  private Advanced(Builder builder) {
      tags = builder.tags;
  }

      /**
      * A list of tags to add to the document. These tags can be used to query for  share data and will also be added to all events that are triggered for the document.
      * @return tags
      **/
      public List<String> getTags() {return tags;}


  public static final class Builder {
      private List<String> tags;

    public Builder() {
    }

    public Builder(Advanced copy) {
        this.tags = copy.getTags();
    }

    public Builder withTags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    public Builder addTagsItem(String tagsItem) {
      if (this.tags == null) {
        this.tags = new ArrayList<>();
      }
      this.tags.add(tagsItem);
      return this;
    }


    public Advanced build() { return new Advanced(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Advanced advanced = (Advanced) o;
    return Objects.equals(this.tags, advanced.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Advanced {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
