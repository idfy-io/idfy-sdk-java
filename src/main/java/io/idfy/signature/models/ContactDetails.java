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
import java.io.Serializable;

/**
 * The company&#39;s contact information.
 */
@JsonDeserialize(builder = ContactDetails.Builder.class)
public class ContactDetails  implements Serializable {
  /**
   * The name of the company.
   */
  private final String name;  // Default value is: null

  /**
   * The phone number of the company.
   */
  private final String phone;  // Default value is: null

  /**
   * The email address of the company.
   */
  private final String email;  // Default value is: null

  /**
   * The URL to the company's website.
   */
  private final String url;  // Default value is: null

  private ContactDetails(Builder builder) {
      name = builder.name;
      phone = builder.phone;
      email = builder.email;
      url = builder.url;
  }

      /**
      * The name of the company.
      * @return name
      **/
      public String getName() {return name;}

      /**
      * The phone number of the company.
      * @return phone
      **/
      public String getPhone() {return phone;}

      /**
      * The email address of the company.
      * @return email
      **/
      public String getEmail() {return email;}

      /**
      * The URL to the company's website.
      * @return url
      **/
      public String getUrl() {return url;}


  public static final class Builder {
      private String name;
      private String phone;
      private String email;
      private String url;

    public Builder() {
    }

    public Builder(ContactDetails copy) {
        this.name = copy.getName();
        this.phone = copy.getPhone();
        this.email = copy.getEmail();
        this.url = copy.getUrl();
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withPhone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder withEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder withUrl(String url) {
      this.url = url;
      return this;
    }


    public ContactDetails build() { return new ContactDetails(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDetails contactDetails = (ContactDetails) o;
    return Objects.equals(this.name, contactDetails.name) &&
        Objects.equals(this.phone, contactDetails.phone) &&
        Objects.equals(this.email, contactDetails.email) &&
        Objects.equals(this.url, contactDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, email, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
