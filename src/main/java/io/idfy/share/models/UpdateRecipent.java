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
 * UpdateRecipent
 */
@JsonDeserialize(builder = UpdateRecipent.Builder.class)
public class UpdateRecipent  implements Serializable {
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
   * How long the fileshare should be available
   */
  private final LocalDate expires;  // Default value is: null

  private final Mobile mobile;  // Default value is: null

  /**
   * List of content identificators the recipient can access
   */
  private final List<String> uploads;  // Default value is: new ArrayList<>()

  /**
   * Auth providers
   */
  private final List<Authentication> authentication;  // Default value is: new ArrayList<>()

  private final Notification notification;  // Default value is: null

  /**
   * Creators id
   */
  private final String externalId;  // Default value is: null

  /**
   * Restrict the recipient to login once
   */
  private final Boolean oneTimeLogin;  // Default value is: null

  private UpdateRecipent(Builder builder) {
      firstName = builder.firstName;
      lastName = builder.lastName;
      email = builder.email;
      expires = builder.expires;
      mobile = builder.mobile;
      uploads = builder.uploads;
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
      * How long the fileshare should be available
      * @return expires
      **/
      public LocalDate getExpires() {return expires;}

      /**
      * Get mobile
      * @return mobile
      **/
      public Mobile getMobile() {return mobile;}

      /**
      * List of content identificators the recipient can access
      * @return uploads
      **/
      public List<String> getUploads() {return uploads;}

      /**
      * Auth providers
      * @return authentication
      **/
      public List<Authentication> getAuthentication() {return authentication;}

      /**
      * Get notification
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
      private List<String> uploads;
      private List<Authentication> authentication;
      private Notification notification;
      private String externalId;
      private Boolean oneTimeLogin;

    public Builder() {
    }

    public Builder(UpdateRecipent copy) {
        this.firstName = copy.getFirstName();
        this.lastName = copy.getLastName();
        this.email = copy.getEmail();
        this.expires = copy.getExpires();
        this.mobile = copy.getMobile();
        this.uploads = copy.getUploads();
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

    public Builder withUploads(List<String> uploads) {
      this.uploads = uploads;
      return this;
    }

    public Builder addUploadsItem(String uploadsItem) {
      if (this.uploads == null) {
        this.uploads = new ArrayList<>();
      }
      this.uploads.add(uploadsItem);
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


    public UpdateRecipent build() { return new UpdateRecipent(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRecipent updateRecipent = (UpdateRecipent) o;
    return Objects.equals(this.firstName, updateRecipent.firstName) &&
        Objects.equals(this.lastName, updateRecipent.lastName) &&
        Objects.equals(this.email, updateRecipent.email) &&
        Objects.equals(this.expires, updateRecipent.expires) &&
        Objects.equals(this.mobile, updateRecipent.mobile) &&
        Objects.equals(this.uploads, updateRecipent.uploads) &&
        Objects.equals(this.authentication, updateRecipent.authentication) &&
        Objects.equals(this.notification, updateRecipent.notification) &&
        Objects.equals(this.externalId, updateRecipent.externalId) &&
        Objects.equals(this.oneTimeLogin, updateRecipent.oneTimeLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, expires, mobile, uploads, authentication, notification, externalId, oneTimeLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRecipent {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    uploads: ").append(toIndentedString(uploads)).append("\n");
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
