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
import io.idfy.signature.models.Mobile;
import io.idfy.signature.models.OrganizationInfo;
import java.io.Serializable;

/**
 * Information about the signer.
 */
@JsonDeserialize(builder = SignerInfo.Builder.class)
public class SignerInfo  implements Serializable {
  /**
   * The signer's first name.
   */
  private final String firstName;  // Default value is: null

  /**
   * The signer's last name.
   */
  private final String lastName;  // Default value is: null

  /**
   * The signer's email adress. Define this if you are using notifications.
   */
  private final String email;  // Default value is: null

  /**
   * Prefilled social security number.
   */
  private final String socialSecurityNumber;  // Default value is: null

  private final Mobile mobile;  // Default value is: null

  private final OrganizationInfo organizationInfo;  // Default value is: null

  private SignerInfo(Builder builder) {
      firstName = builder.firstName;
      lastName = builder.lastName;
      email = builder.email;
      socialSecurityNumber = builder.socialSecurityNumber;
      mobile = builder.mobile;
      organizationInfo = builder.organizationInfo;
  }

      /**
      * The signer's first name.
      * @return firstName
      **/
      public String getFirstName() {return firstName;}

      /**
      * The signer's last name.
      * @return lastName
      **/
      public String getLastName() {return lastName;}

      /**
      * The signer's email adress. Define this if you are using notifications.
      * @return email
      **/
      public String getEmail() {return email;}

      /**
      * Prefilled social security number.
      * @return socialSecurityNumber
      **/
      public String getSocialSecurityNumber() {return socialSecurityNumber;}

      /**
      * Get mobile
      * @return mobile
      **/
      public Mobile getMobile() {return mobile;}

      /**
      * Get organizationInfo
      * @return organizationInfo
      **/
      public OrganizationInfo getOrganizationInfo() {return organizationInfo;}


  public static final class Builder {
      private String firstName;
      private String lastName;
      private String email;
      private String socialSecurityNumber;
      private Mobile mobile;
      private OrganizationInfo organizationInfo;

    public Builder() {
    }

    public Builder(SignerInfo copy) {
        this.firstName = copy.getFirstName();
        this.lastName = copy.getLastName();
        this.email = copy.getEmail();
        this.socialSecurityNumber = copy.getSocialSecurityNumber();
        this.mobile = copy.getMobile();
        this.organizationInfo = copy.getOrganizationInfo();
    }

    public Builder withFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder withEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder withSocialSecurityNumber(String socialSecurityNumber) {
      this.socialSecurityNumber = socialSecurityNumber;
      return this;
    }

    public Builder withMobile(Mobile mobile) {
      this.mobile = mobile;
      return this;
    }

    public Builder withOrganizationInfo(OrganizationInfo organizationInfo) {
      this.organizationInfo = organizationInfo;
      return this;
    }


    public SignerInfo build() { return new SignerInfo(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignerInfo signerInfo = (SignerInfo) o;
    return Objects.equals(this.firstName, signerInfo.firstName) &&
        Objects.equals(this.lastName, signerInfo.lastName) &&
        Objects.equals(this.email, signerInfo.email) &&
        Objects.equals(this.socialSecurityNumber, signerInfo.socialSecurityNumber) &&
        Objects.equals(this.mobile, signerInfo.mobile) &&
        Objects.equals(this.organizationInfo, signerInfo.organizationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, socialSecurityNumber, mobile, organizationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignerInfo {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    organizationInfo: ").append(toIndentedString(organizationInfo)).append("\n");
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
