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
import io.idfy.share.models.Authentication;
import io.idfy.share.models.Mobile;
import io.idfy.share.models.Notification;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Recipient
 */
@JsonDeserialize(builder = Recipient.Builder.class)
public class Recipient  implements Serializable {
  /**
   * Recipients first name
   */
  private final String firstName;  // Default value is: null

  /**
   * Recipients last name
   */
  private final String lastName;  // Default value is: null

  /**
   * Recipients email
   */
  private final String email;  // Default value is: null

  /**
   * How long the fileshare should be available. Must be after the moment its created, and cant be avaliable longer than 90 days.  Has to be in the ISO 8601 format
   */
  private final LocalDate expires;  // Default value is: null

  private final Mobile mobile;  // Default value is: null

  /**
   * List of content identificators the recipient can access. NOTE: If no uploads are specified, the recipient will be granted access to all files.
   */
  private final List<String> content;  // Default value is: new ArrayList<>()

  /**
   * Auth providers
   */
  private final List<Authentication> authentication;  // Default value is: new ArrayList<>()

  /**
   * How to contact the recipient
   */
  private final Notification notification;  // Default value is: null

  /**
   * Creators id
   */
  private final String externalId;  // Default value is: null

  /**
   * Restrict the recipient to login once
   */
  private final Boolean oneTimeLogin;  // Default value is: null

  private Recipient(Builder builder) {
      firstName = builder.firstName;
      lastName = builder.lastName;
      email = builder.email;
      expires = builder.expires;
      mobile = builder.mobile;
      content = builder.content;
      authentication = builder.authentication;
      notification = builder.notification;
      externalId = builder.externalId;
      oneTimeLogin = builder.oneTimeLogin;
  }

      /**
      * Recipients first name
      * @return firstName
      **/
      public String getFirstName() {return firstName;}

      /**
      * Recipients last name
      * @return lastName
      **/
      public String getLastName() {return lastName;}

      /**
      * Recipients email
      * @return email
      **/
      public String getEmail() {return email;}

      /**
      * How long the fileshare should be available. Must be after the moment its created, and cant be avaliable longer than 90 days.  Has to be in the ISO 8601 format
      * @return expires
      **/
      public LocalDate getExpires() {return expires;}

      /**
      * Get mobile
      * @return mobile
      **/
      public Mobile getMobile() {return mobile;}

      /**
      * List of content identificators the recipient can access. NOTE: If no uploads are specified, the recipient will be granted access to all files.
      * @return content
      **/
      public List<String> getContent() {return content;}

      /**
      * Auth providers
      * @return authentication
      **/
      public List<Authentication> getAuthentication() {return authentication;}

      /**
      * How to contact the recipient
      * @return notification
      **/
      public Notification getNotification() {return notification;}

      /**
      * Creators id
      * @return externalId
      **/
      public String getExternalId() {return externalId;}

      /**
      * Restrict the recipient to login once
      * @return oneTimeLogin
      **/
      public Boolean getOneTimeLogin() {return oneTimeLogin;}


  public static final class Builder {
      private String firstName;
      private String lastName;
      private String email;
      private LocalDate expires;
      private Mobile mobile;
      private List<String> content;
      private List<Authentication> authentication;
      private Notification notification;
      private String externalId;
      private Boolean oneTimeLogin;

    public Builder() {
    }

    public Builder(Recipient copy) {
        this.firstName = copy.getFirstName();
        this.lastName = copy.getLastName();
        this.email = copy.getEmail();
        this.expires = copy.getExpires();
        this.mobile = copy.getMobile();
        this.content = copy.getContent();
        this.authentication = copy.getAuthentication();
        this.notification = copy.getNotification();
        this.externalId = copy.getExternalId();
        this.oneTimeLogin = copy.getOneTimeLogin();
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

    public Builder withExpires(LocalDate expires) {
      this.expires = expires;
      return this;
    }

    public Builder withMobile(Mobile mobile) {
      this.mobile = mobile;
      return this;
    }

    public Builder withContent(List<String> content) {
      this.content = content;
      return this;
    }

    public Builder addContentItem(String contentItem) {
      if (this.content == null) {
        this.content = new ArrayList<>();
      }
      this.content.add(contentItem);
      return this;
    }

    public Builder withAuthentication(List<Authentication> authentication) {
      this.authentication = authentication;
      return this;
    }

    public Builder addAuthenticationItem(Authentication authenticationItem) {
      if (this.authentication == null) {
        this.authentication = new ArrayList<>();
      }
      this.authentication.add(authenticationItem);
      return this;
    }

    public Builder withNotification(Notification notification) {
      this.notification = notification;
      return this;
    }

    public Builder withExternalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder withOneTimeLogin(Boolean oneTimeLogin) {
      this.oneTimeLogin = oneTimeLogin;
      return this;
    }


    public Recipient build() { return new Recipient(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipient recipient = (Recipient) o;
    return Objects.equals(this.firstName, recipient.firstName) &&
        Objects.equals(this.lastName, recipient.lastName) &&
        Objects.equals(this.email, recipient.email) &&
        Objects.equals(this.expires, recipient.expires) &&
        Objects.equals(this.mobile, recipient.mobile) &&
        Objects.equals(this.content, recipient.content) &&
        Objects.equals(this.authentication, recipient.authentication) &&
        Objects.equals(this.notification, recipient.notification) &&
        Objects.equals(this.externalId, recipient.externalId) &&
        Objects.equals(this.oneTimeLogin, recipient.oneTimeLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, expires, mobile, content, authentication, notification, externalId, oneTimeLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipient {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    oneTimeLogin: ").append(toIndentedString(oneTimeLogin)).append("\n");
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
