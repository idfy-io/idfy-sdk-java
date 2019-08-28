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
import io.idfy.information.models.Signature;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * OtherSignatures
 */
@JsonDeserialize(builder = OtherSignatures.Builder.class)
public class OtherSignatures  implements Serializable {
  private final Integer requiredNumberOfOthers;  // Default value is: null

  private final List<Signature> list;  // Default value is: new ArrayList<>()

  private OtherSignatures(Builder builder) {
      requiredNumberOfOthers = builder.requiredNumberOfOthers;
      list = builder.list;
  }

      /**
      * Get requiredNumberOfOthers
      * @return requiredNumberOfOthers
      **/
      public Integer getRequiredNumberOfOthers() {return requiredNumberOfOthers;}

      /**
      * Get list
      * @return list
      **/
      public List<Signature> getList() {return list;}


  public static final class Builder {
      private Integer requiredNumberOfOthers;
      private List<Signature> list;

    public Builder() {
    }

    public Builder(OtherSignatures copy) {
        this.requiredNumberOfOthers = copy.getRequiredNumberOfOthers();
        this.list = copy.getList();
    }

    public Builder withRequiredNumberOfOthers(Integer requiredNumberOfOthers) {
      this.requiredNumberOfOthers = requiredNumberOfOthers;
      return this;
    }

    public Builder withList(List<Signature> list) {
      this.list = list;
      return this;
    }

    public Builder addListItem(Signature listItem) {
      if (this.list == null) {
        this.list = new ArrayList<>();
      }
      this.list.add(listItem);
      return this;
    }


    public OtherSignatures build() { return new OtherSignatures(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherSignatures otherSignatures = (OtherSignatures) o;
    return Objects.equals(this.requiredNumberOfOthers, otherSignatures.requiredNumberOfOthers) &&
        Objects.equals(this.list, otherSignatures.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredNumberOfOthers, list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherSignatures {\n");
    
    sb.append("    requiredNumberOfOthers: ").append(toIndentedString(requiredNumberOfOthers)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
