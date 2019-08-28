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
import io.idfy.share.models.UploadResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * Recipient of the secure share
 */
@JsonDeserialize(builder = RecipientResponse.Builder.class)
public class RecipientResponse  implements Serializable {
  /**
   * Unique identifier
   */
  private final UUID id;  // Default value is: null

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
   * How long the secure share will be available for the recipient
   */
  private final OffsetDateTime expires;  // Default value is: null

  private final Mobile mobile;  // Default value is: null

  /**
   * List of uploads the recipient can access
   */
  private final List<UploadResponse> content;  // Default value is: new ArrayList<>()

  /**
   * Creators id
   */
  private final String externalId;  // Default value is: null

  /**
   * The url sent to the recipient
   */
  private final String url;  // Default value is: null

  /**
   * List of valid authentication methods and corresponding info like ssn
   */
  private final List<Authentication> authentication;  // Default value is: new ArrayList<>()

  /**
   * Restrict the recipient to login once
   */
  private final Boolean oneTimeLogin;  // Default value is: null

  /**
   * How we should notify the recipient
   */
  private final Notification notification;  // Default value is: null

  private RecipientResponse(Builder builder) {
      id = builder.id;
      firstName = builder.firstName;
      lastName = builder.lastName;
      email = builder.email;
      expires = builder.expires;
      mobile = builder.mobile;
      content = builder.content;
      externalId = builder.externalId;
      url = builder.url;
      authentication = builder.authentication;
      oneTimeLogin = builder.oneTimeLogin;
      notification = builder.notification;
  }

      /**
      * Unique identifier
      * @return id
      **/
      public UUID getId() {return id;}

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
      * How long the secure share will be available for the recipient
      * @return expires
      **/
      public OffsetDateTime getExpires() {return expires;}

      /**
      * Get mobile
      * @return mobile
      **/
      public Mobile getMobile() {return mobile;}

      /**
      * List of uploads the recipient can access
      * @return content
      **/
      public List<UploadResponse> getContent() {return content;}

      /**
      * Creators id
      * @return externalId
      **/
      public String getExternalId() {return externalId;}

      /**
      * The url sent to the recipient
      * @return url
      **/
      public String getUrl() {return url;}

      /**
      * List of valid authentication methods and corresponding info like ssn
      * @return authentication
      **/
      public List<Authentication> getAuthentication() {return authentication;}

      /**
      * Restrict the recipient to login once
      * @return oneTimeLogin
      **/
      public Boolean getOneTimeLogin() {return oneTimeLogin;}

      /**
      * How we should notify the recipient
      * @return notification
      **/
      public Notification getNotification() {return notification;}


  public static final class Builder {
      private UUID id;
      private String firstName;
      private String lastName;
      private String email;
      private OffsetDateTime expires;
      private Mobile mobile;
      private List<UploadResponse> content;
      private String externalId;
      private String url;
      private List<Authentication> authentication;
      private Boolean oneTimeLogin;
      private Notification notification;

    public Builder() {
    }

    public Builder(RecipientResponse copy) {
        this.id = copy.getId();
        this.firstName = copy.getFirstName();
        this.lastName = copy.getLastName();
        this.email = copy.getEmail();
        this.expires = copy.getExpires();
        this.mobile = copy.getMobile();
        this.content = copy.getContent();
        this.externalId = copy.getExternalId();
        this.url = copy.getUrl();
        this.authentication = copy.getAuthentication();
        this.oneTimeLogin = copy.getOneTimeLogin();
        this.notification = copy.getNotification();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
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

    public Builder withExpires(OffsetDateTime expires) {
      this.expires = expires;
      return this;
    }

    public Builder withMobile(Mobile mobile) {
      this.mobile = mobile;
      return this;
    }

    public Builder withContent(List<UploadResponse> content) {
      this.content = content;
      return this;
    }

    public Builder addContentItem(UploadResponse contentItem) {
      if (this.content == null) {
        this.content = new ArrayList<>();
      }
      this.content.add(contentItem);
      return this;
    }

    public Builder withExternalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder withUrl(String url) {
      this.url = url;
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

    public Builder withOneTimeLogin(Boolean oneTimeLogin) {
      this.oneTimeLogin = oneTimeLogin;
      return this;
    }

    public Builder withNotification(Notification notification) {
      this.notification = notification;
      return this;
    }


    public RecipientResponse build() { return new RecipientResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientResponse recipientResponse = (RecipientResponse) o;
    return Objects.equals(this.id, recipientResponse.id) &&
        Objects.equals(this.firstName, recipientResponse.firstName) &&
        Objects.equals(this.lastName, recipientResponse.lastName) &&
        Objects.equals(this.email, recipientResponse.email) &&
        Objects.equals(this.expires, recipientResponse.expires) &&
        Objects.equals(this.mobile, recipientResponse.mobile) &&
        Objects.equals(this.content, recipientResponse.content) &&
        Objects.equals(this.externalId, recipientResponse.externalId) &&
        Objects.equals(this.url, recipientResponse.url) &&
        Objects.equals(this.authentication, recipientResponse.authentication) &&
        Objects.equals(this.oneTimeLogin, recipientResponse.oneTimeLogin) &&
        Objects.equals(this.notification, recipientResponse.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, expires, mobile, content, externalId, url, authentication, oneTimeLogin, notification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    oneTimeLogin: ").append(toIndentedString(oneTimeLogin)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
