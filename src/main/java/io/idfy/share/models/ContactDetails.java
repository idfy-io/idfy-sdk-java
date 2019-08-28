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
import java.io.Serializable;

/**
 * Contact details for creator of secure share, will be presented to recipient.
 */
@JsonDeserialize(builder = ContactDetails.Builder.class)
public class ContactDetails  implements Serializable {
  /**
   * Name to present to the recipient
   */
  private final String name;  // Default value is: null

  /**
   * Phonenumber recipient can contact
   */
  private final String phone;  // Default value is: null

  /**
   * Email recipient can contact
   */
  private final String email;  // Default value is: null

  /**
   * Web page the recipient can visit
   */
  private final String url;  // Default value is: null

  private ContactDetails(Builder builder) {
      name = builder.name;
      phone = builder.phone;
      email = builder.email;
      url = builder.url;
  }

      /**
      * Name to present to the recipient
      * @return name
      **/
      public String getName() {return name;}

      /**
      * Phonenumber recipient can contact
      * @return phone
      **/
      public String getPhone() {return phone;}

      /**
      * Email recipient can contact
      * @return email
      **/
      public String getEmail() {return email;}

      /**
      * Web page the recipient can visit
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
