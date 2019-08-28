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
import java.io.Serializable;

/**
 * Company contact person
 */
@JsonDeserialize(builder = Contact.Builder.class)
public class Contact  implements Serializable {
  private final String name;  // Default value is: null

  private final String phone;  // Default value is: null

  private final String mobile;  // Default value is: null

  private final String email;  // Default value is: null

  private Contact(Builder builder) {
      name = builder.name;
      phone = builder.phone;
      mobile = builder.mobile;
      email = builder.email;
  }

      /**
      * Get name
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Get phone
      * @return phone
      **/
      public String getPhone() {return phone;}

      /**
      * Get mobile
      * @return mobile
      **/
      public String getMobile() {return mobile;}

      /**
      * Get email
      * @return email
      **/
      public String getEmail() {return email;}


  public static final class Builder {
      private String name;
      private String phone;
      private String mobile;
      private String email;

    public Builder() {
    }

    public Builder(Contact copy) {
        this.name = copy.getName();
        this.phone = copy.getPhone();
        this.mobile = copy.getMobile();
        this.email = copy.getEmail();
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withPhone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder withMobile(String mobile) {
      this.mobile = mobile;
      return this;
    }

    public Builder withEmail(String email) {
      this.email = email;
      return this;
    }


    public Contact build() { return new Contact(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.name, contact.name) &&
        Objects.equals(this.phone, contact.phone) &&
        Objects.equals(this.mobile, contact.mobile) &&
        Objects.equals(this.email, contact.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, mobile, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
