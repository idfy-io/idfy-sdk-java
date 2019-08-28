/*
 * Idfy Identification
 * This endpoint enables authentication/identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID. ## Last update   Last build date for this endpoint: 02.04.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.identification.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import io.idfy.identification.models.Error;
import java.io.Serializable;

/**
 * The reponse of the create BankID mobile request
 */
@JsonDeserialize(builder = CreateBankIDMobileResponse.Builder.class)
public class CreateBankIDMobileResponse  implements Serializable {
  /**
   * Signere requestid used to get the reponse form server afterwards
   */
  private final String requestId;  // Default value is: null

  /**
   * The merchant ref to show to the end user (SNILL BANK)
   */
  private final String merchantRef;  // Default value is: null

  /**
   * Information about error if the identification process failed. (Only set if an error occured, if not is null)
   */
  private final Error error;  // Default value is: null

  /**
   * Status if the request started without errors
   */
  private final Boolean OK;  // Default value is: null

  /**
   * Indicates if the Mobile number of the date of birth was invalid. These could be 2 things:   1 the user does not have BankID mobile,   2. Wrong input data (the combination of mobile and date of birth does not match
   */
  private final Boolean invalidMobileNumberOrDateOfBirth;  // Default value is: null

  private CreateBankIDMobileResponse(Builder builder) {
      requestId = builder.requestId;
      merchantRef = builder.merchantRef;
      error = builder.error;
      OK = builder.OK;
      invalidMobileNumberOrDateOfBirth = builder.invalidMobileNumberOrDateOfBirth;
  }

      /**
      * Signere requestid used to get the reponse form server afterwards
      * @return requestId
      **/
      public String getRequestId() {return requestId;}

      /**
      * The merchant ref to show to the end user (SNILL BANK)
      * @return merchantRef
      **/
      public String getMerchantRef() {return merchantRef;}

      /**
      * Information about error if the identification process failed. (Only set if an error occured, if not is null)
      * @return error
      **/
      public Error getError() {return error;}

      /**
      * Status if the request started without errors
      * @return OK
      **/
      public Boolean getOK() {return OK;}

      /**
      * Indicates if the Mobile number of the date of birth was invalid. These could be 2 things:   1 the user does not have BankID mobile,   2. Wrong input data (the combination of mobile and date of birth does not match
      * @return invalidMobileNumberOrDateOfBirth
      **/
      public Boolean getInvalidMobileNumberOrDateOfBirth() {return invalidMobileNumberOrDateOfBirth;}


  public static final class Builder {
      private String requestId;
      private String merchantRef;
      private Error error;
      private Boolean OK;
      private Boolean invalidMobileNumberOrDateOfBirth;

    public Builder() {
    }

    public Builder(CreateBankIDMobileResponse copy) {
        this.requestId = copy.getRequestId();
        this.merchantRef = copy.getMerchantRef();
        this.error = copy.getError();
        this.OK = copy.getOK();
        this.invalidMobileNumberOrDateOfBirth = copy.getInvalidMobileNumberOrDateOfBirth();
    }

    public Builder withRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public Builder withMerchantRef(String merchantRef) {
      this.merchantRef = merchantRef;
      return this;
    }

    public Builder withError(Error error) {
      this.error = error;
      return this;
    }

    public Builder withOK(Boolean OK) {
      this.OK = OK;
      return this;
    }

    public Builder withInvalidMobileNumberOrDateOfBirth(Boolean invalidMobileNumberOrDateOfBirth) {
      this.invalidMobileNumberOrDateOfBirth = invalidMobileNumberOrDateOfBirth;
      return this;
    }


    public CreateBankIDMobileResponse build() { return new CreateBankIDMobileResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBankIDMobileResponse createBankIDMobileResponse = (CreateBankIDMobileResponse) o;
    return Objects.equals(this.requestId, createBankIDMobileResponse.requestId) &&
        Objects.equals(this.merchantRef, createBankIDMobileResponse.merchantRef) &&
        Objects.equals(this.error, createBankIDMobileResponse.error) &&
        Objects.equals(this.OK, createBankIDMobileResponse.OK) &&
        Objects.equals(this.invalidMobileNumberOrDateOfBirth, createBankIDMobileResponse.invalidMobileNumberOrDateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, merchantRef, error, OK, invalidMobileNumberOrDateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBankIDMobileResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    merchantRef: ").append(toIndentedString(merchantRef)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    OK: ").append(toIndentedString(OK)).append("\n");
    sb.append("    invalidMobileNumberOrDateOfBirth: ").append(toIndentedString(invalidMobileNumberOrDateOfBirth)).append("\n");
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
