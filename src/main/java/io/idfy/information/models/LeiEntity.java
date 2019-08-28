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
import io.idfy.information.models.LeiEntityAddress;
import io.idfy.information.models.LeiLegalForm;
import io.idfy.information.models.LeiRegistrationAuthority;
import java.io.Serializable;

/**
 * LeiEntity
 */
@JsonDeserialize(builder = LeiEntity.Builder.class)
public class LeiEntity  implements Serializable {
  private final LeiEntityAddress headquartersAddress;  // Default value is: null

  private final LeiEntityAddress legalAddress;  // Default value is: null

  private final String legalJurisdiction;  // Default value is: null

  private final String legalName;  // Default value is: null

  private final String entityStatus;  // Default value is: null

  private final String entityCategory;  // Default value is: null

  private final LeiLegalForm legalForm;  // Default value is: null

  private final LeiRegistrationAuthority registrationAuthority;  // Default value is: null

  private LeiEntity(Builder builder) {
      headquartersAddress = builder.headquartersAddress;
      legalAddress = builder.legalAddress;
      legalJurisdiction = builder.legalJurisdiction;
      legalName = builder.legalName;
      entityStatus = builder.entityStatus;
      entityCategory = builder.entityCategory;
      legalForm = builder.legalForm;
      registrationAuthority = builder.registrationAuthority;
  }

      /**
      * Get headquartersAddress
      * @return headquartersAddress
      **/
      public LeiEntityAddress getHeadquartersAddress() {return headquartersAddress;}

      /**
      * Get legalAddress
      * @return legalAddress
      **/
      public LeiEntityAddress getLegalAddress() {return legalAddress;}

      /**
      * Get legalJurisdiction
      * @return legalJurisdiction
      **/
      public String getLegalJurisdiction() {return legalJurisdiction;}

      /**
      * Get legalName
      * @return legalName
      **/
      public String getLegalName() {return legalName;}

      /**
      * Get entityStatus
      * @return entityStatus
      **/
      public String getEntityStatus() {return entityStatus;}

      /**
      * Get entityCategory
      * @return entityCategory
      **/
      public String getEntityCategory() {return entityCategory;}

      /**
      * Get legalForm
      * @return legalForm
      **/
      public LeiLegalForm getLegalForm() {return legalForm;}

      /**
      * Get registrationAuthority
      * @return registrationAuthority
      **/
      public LeiRegistrationAuthority getRegistrationAuthority() {return registrationAuthority;}


  public static final class Builder {
      private LeiEntityAddress headquartersAddress;
      private LeiEntityAddress legalAddress;
      private String legalJurisdiction;
      private String legalName;
      private String entityStatus;
      private String entityCategory;
      private LeiLegalForm legalForm;
      private LeiRegistrationAuthority registrationAuthority;

    public Builder() {
    }

    public Builder(LeiEntity copy) {
        this.headquartersAddress = copy.getHeadquartersAddress();
        this.legalAddress = copy.getLegalAddress();
        this.legalJurisdiction = copy.getLegalJurisdiction();
        this.legalName = copy.getLegalName();
        this.entityStatus = copy.getEntityStatus();
        this.entityCategory = copy.getEntityCategory();
        this.legalForm = copy.getLegalForm();
        this.registrationAuthority = copy.getRegistrationAuthority();
    }

    public Builder withHeadquartersAddress(LeiEntityAddress headquartersAddress) {
      this.headquartersAddress = headquartersAddress;
      return this;
    }

    public Builder withLegalAddress(LeiEntityAddress legalAddress) {
      this.legalAddress = legalAddress;
      return this;
    }

    public Builder withLegalJurisdiction(String legalJurisdiction) {
      this.legalJurisdiction = legalJurisdiction;
      return this;
    }

    public Builder withLegalName(String legalName) {
      this.legalName = legalName;
      return this;
    }

    public Builder withEntityStatus(String entityStatus) {
      this.entityStatus = entityStatus;
      return this;
    }

    public Builder withEntityCategory(String entityCategory) {
      this.entityCategory = entityCategory;
      return this;
    }

    public Builder withLegalForm(LeiLegalForm legalForm) {
      this.legalForm = legalForm;
      return this;
    }

    public Builder withRegistrationAuthority(LeiRegistrationAuthority registrationAuthority) {
      this.registrationAuthority = registrationAuthority;
      return this;
    }


    public LeiEntity build() { return new LeiEntity(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeiEntity leiEntity = (LeiEntity) o;
    return Objects.equals(this.headquartersAddress, leiEntity.headquartersAddress) &&
        Objects.equals(this.legalAddress, leiEntity.legalAddress) &&
        Objects.equals(this.legalJurisdiction, leiEntity.legalJurisdiction) &&
        Objects.equals(this.legalName, leiEntity.legalName) &&
        Objects.equals(this.entityStatus, leiEntity.entityStatus) &&
        Objects.equals(this.entityCategory, leiEntity.entityCategory) &&
        Objects.equals(this.legalForm, leiEntity.legalForm) &&
        Objects.equals(this.registrationAuthority, leiEntity.registrationAuthority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headquartersAddress, legalAddress, legalJurisdiction, legalName, entityStatus, entityCategory, legalForm, registrationAuthority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeiEntity {\n");
    
    sb.append("    headquartersAddress: ").append(toIndentedString(headquartersAddress)).append("\n");
    sb.append("    legalAddress: ").append(toIndentedString(legalAddress)).append("\n");
    sb.append("    legalJurisdiction: ").append(toIndentedString(legalJurisdiction)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    entityStatus: ").append(toIndentedString(entityStatus)).append("\n");
    sb.append("    entityCategory: ").append(toIndentedString(entityCategory)).append("\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
    sb.append("    registrationAuthority: ").append(toIndentedString(registrationAuthority)).append("\n");
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
