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
import java.util.UUID;
import java.io.Serializable;

/**
 * NoBankIdMobileInitRequest
 */
@JsonDeserialize(builder = NoBankIdMobileInitRequest.Builder.class)
public class NoBankIdMobileInitRequest  implements Serializable {
  private final UUID documentId;  // Default value is: null

  private final String language;  // Default value is: null

  private final String mobile;  // Default value is: null

  private final String dateOfBirth;  // Default value is: null

  private NoBankIdMobileInitRequest(Builder builder) {
      documentId = builder.documentId;
      language = builder.language;
      mobile = builder.mobile;
      dateOfBirth = builder.dateOfBirth;
  }

      /**
      * Get documentId
      * @return documentId
      **/
      public UUID getDocumentId() {return documentId;}

      /**
      * Get language
      * @return language
      **/
      public String getLanguage() {return language;}

      /**
      * Get mobile
      * @return mobile
      **/
      public String getMobile() {return mobile;}

      /**
      * Get dateOfBirth
      * @return dateOfBirth
      **/
      public String getDateOfBirth() {return dateOfBirth;}


  public static final class Builder {
      private UUID documentId;
      private String language;
      private String mobile;
      private String dateOfBirth;

    public Builder() {
    }

    public Builder(NoBankIdMobileInitRequest copy) {
        this.documentId = copy.getDocumentId();
        this.language = copy.getLanguage();
        this.mobile = copy.getMobile();
        this.dateOfBirth = copy.getDateOfBirth();
    }

    public Builder withDocumentId(UUID documentId) {
      this.documentId = documentId;
      return this;
    }

    public Builder withLanguage(String language) {
      this.language = language;
      return this;
    }

    public Builder withMobile(String mobile) {
      this.mobile = mobile;
      return this;
    }

    public Builder withDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }


    public NoBankIdMobileInitRequest build() { return new NoBankIdMobileInitRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoBankIdMobileInitRequest noBankIdMobileInitRequest = (NoBankIdMobileInitRequest) o;
    return Objects.equals(this.documentId, noBankIdMobileInitRequest.documentId) &&
        Objects.equals(this.language, noBankIdMobileInitRequest.language) &&
        Objects.equals(this.mobile, noBankIdMobileInitRequest.mobile) &&
        Objects.equals(this.dateOfBirth, noBankIdMobileInitRequest.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, language, mobile, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoBankIdMobileInitRequest {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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
