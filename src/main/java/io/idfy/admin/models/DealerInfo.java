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
import java.util.UUID;
import java.io.Serializable;

/**
 * Dealer information
 */
@JsonDeserialize(builder = DealerInfo.Builder.class)
public class DealerInfo  implements Serializable {
  private final UUID id;  // Default value is: null

  private final String reference;  // Default value is: null

  private DealerInfo(Builder builder) {
      id = builder.id;
      reference = builder.reference;
  }

      /**
      * Get id
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * Get reference
      * @return reference
      **/
      public String getReference() {return reference;}


  public static final class Builder {
      private UUID id;
      private String reference;

    public Builder() {
    }

    public Builder(DealerInfo copy) {
        this.id = copy.getId();
        this.reference = copy.getReference();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withReference(String reference) {
      this.reference = reference;
      return this;
    }


    public DealerInfo build() { return new DealerInfo(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealerInfo dealerInfo = (DealerInfo) o;
    return Objects.equals(this.id, dealerInfo.id) &&
        Objects.equals(this.reference, dealerInfo.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealerInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
