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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Time-to-live settings for the document.
 */
@JsonDeserialize(builder = TimeToLive.Builder.class)
public class TimeToLive  implements Serializable {
  /**
   * Time at which the document will expire (ISO 8601). The document can not be signed after this time. Default/maximum 45 days.
   */
  private final OffsetDateTime deadline;  // Default value is: null

  /**
   * How many hours we will keep the document after it is signed or expired (deadline). Default/ maximum 7 days (168 hours). After this timespan the document and files will be permanently deleted on our side.
   */
  private final Integer deleteAfterHours;  // Default value is: null

  private TimeToLive(Builder builder) {
      deadline = builder.deadline;
      deleteAfterHours = builder.deleteAfterHours;
  }

      /**
      * Time at which the document will expire (ISO 8601). The document can not be signed after this time. Default/maximum 45 days.
      * @return deadline
      **/
      public OffsetDateTime getDeadline() {return deadline;}

      /**
      * How many hours we will keep the document after it is signed or expired (deadline). Default/ maximum 7 days (168 hours). After this timespan the document and files will be permanently deleted on our side.
      * @return deleteAfterHours
      **/
      public Integer getDeleteAfterHours() {return deleteAfterHours;}


  public static final class Builder {
      private OffsetDateTime deadline;
      private Integer deleteAfterHours;

    public Builder() {
    }

    public Builder(TimeToLive copy) {
        this.deadline = copy.getDeadline();
        this.deleteAfterHours = copy.getDeleteAfterHours();
    }

    public Builder withDeadline(OffsetDateTime deadline) {
      this.deadline = deadline;
      return this;
    }

    public Builder withDeleteAfterHours(Integer deleteAfterHours) {
      this.deleteAfterHours = deleteAfterHours;
      return this;
    }


    public TimeToLive build() { return new TimeToLive(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeToLive timeToLive = (TimeToLive) o;
    return Objects.equals(this.deadline, timeToLive.deadline) &&
        Objects.equals(this.deleteAfterHours, timeToLive.deleteAfterHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deadline, deleteAfterHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeToLive {\n");
    
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    deleteAfterHours: ").append(toIndentedString(deleteAfterHours)).append("\n");
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
