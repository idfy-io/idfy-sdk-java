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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * CreateOpenIdClientRequest
 */
@JsonDeserialize(builder = CreateOpenIdClientRequest.Builder.class)
public class CreateOpenIdClientRequest  implements Serializable {
  private final UUID accountId;  // Default value is: null

  private final String clientName;  // Default value is: null

  private final String clientUri;  // Default value is: null

  private final Boolean requireConsent;  // Default value is: null

  private final Boolean allowRememberConsent;  // Default value is: null

  /**
   * Gets or Sets flow
   */
  public enum Flow {
    @JsonProperty("AuthorizationCode")
    AUTHORIZATIONCODE("AuthorizationCode"),
    
    @JsonProperty("Implicit")
    IMPLICIT("Implicit"),
    
    @JsonProperty("Hybrid")
    HYBRID("Hybrid"),
    
    @JsonProperty("ClientCredentials")
    CLIENTCREDENTIALS("ClientCredentials"),
    
    @JsonProperty("ResourceOwner")
    RESOURCEOWNER("ResourceOwner"),
    
    @JsonProperty("Custom")
    CUSTOM("Custom"),
    
    @JsonProperty("AuthorizationCodeWithProofKey")
    AUTHORIZATIONCODEWITHPROOFKEY("AuthorizationCodeWithProofKey"),
    
    @JsonProperty("HybridWithProofKey")
    HYBRIDWITHPROOFKEY("HybridWithProofKey");

    private String value;

    Flow(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Flow fromValue(String text) {
      for (Flow b : Flow.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final Flow flow;  // Default value is: null

  private final Boolean allowClientCredentialsOnly;  // Default value is: null

  private final List<String> redirectUris;  // Default value is: new ArrayList<>()

  private final List<String> postLogoutRedirectUris;  // Default value is: new ArrayList<>()

  /**
   * Specifies logout URI at client for HTTP based logout.
   */
  private final String logoutUri;  // Default value is: null

  /**
   * Specifies if the client will always show a confirmation page for sign-out. Defaults to false.
   */
  private final Boolean requireSignOutPrompt;  // Default value is: null

  private final List<String> allowedScopes;  // Default value is: new ArrayList<>()

  /**
   * Gets or Sets identityProviderRestrictions
   */
  public enum IdentityProviderRestrictions {
    @JsonProperty("NO_BANKID_MOBILE")
    NO_BANKID_MOBILE("NO_BANKID_MOBILE"),
    
    @JsonProperty("NO_BANKID_WEB")
    NO_BANKID_WEB("NO_BANKID_WEB"),
    
    @JsonProperty("SWE_BANKID")
    SWE_BANKID("SWE_BANKID"),
    
    @JsonProperty("NO_BUYPASS")
    NO_BUYPASS("NO_BUYPASS"),
    
    @JsonProperty("DA_NEMID")
    DA_NEMID("DA_NEMID"),
    
    @JsonProperty("FI_TUPAS")
    FI_TUPAS("FI_TUPAS"),
    
    @JsonProperty("MOBILECONNECT")
    MOBILECONNECT("MOBILECONNECT"),
    
    @JsonProperty("SMS_OTP")
    SMS_OTP("SMS_OTP"),
    
    @JsonProperty("Facebook")
    FACEBOOK("Facebook"),
    
    @JsonProperty("Google")
    GOOGLE("Google"),
    
    @JsonProperty("LinkedIn")
    LINKEDIN("LinkedIn"),
    
    @JsonProperty("GitHub")
    GITHUB("GitHub"),
    
    @JsonProperty("Microsoft")
    MICROSOFT("Microsoft");

    private String value;

    IdentityProviderRestrictions(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdentityProviderRestrictions fromValue(String text) {
      for (IdentityProviderRestrictions b : IdentityProviderRestrictions.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Setup which id providers that should be allowed to use
   */
  private final List<IdentityProviderRestrictions> identityProviderRestrictions;  // Default value is: new ArrayList<>()

  /**
   * Lifetime of identity token in seconds (defaults to 300 seconds / 5 minutes)
   */
  private final Integer identityTokenLifetime;  // Default value is: null

  /**
   * Lifetime of access token in seconds (defaults to 3600 seconds / 1 hour)
   */
  private final Integer accessTokenLifetime;  // Default value is: null

  /**
   * Maximum lifetime of a refresh token in seconds. Defaults to 2592000 seconds / 30 days
   */
  private final Integer absoluteRefreshTokenLifetime;  // Default value is: null

  /**
   * Sliding lifetime of a refresh token in seconds. Defaults to 1296000 seconds / 15 days
   */
  private final Integer slidingRefreshTokenLifetime;  // Default value is: null

  /**
   * Gets or Sets refreshTokenUsage
   */
  public enum RefreshTokenUsage {
    @JsonProperty("ReUse")
    REUSE("ReUse"),
    
    @JsonProperty("OneTimeOnly")
    ONETIMEONLY("OneTimeOnly");

    private String value;

    RefreshTokenUsage(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefreshTokenUsage fromValue(String text) {
      for (RefreshTokenUsage b : RefreshTokenUsage.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final RefreshTokenUsage refreshTokenUsage;  // Default value is: null

  /**
   * Gets or sets a value indicating whether the access token (and its claims) should be updated on a refresh token request.
   */
  private final Boolean updateAccessTokenClaimsOnRefresh;  // Default value is: null

  /**
   * Gets or Sets refreshTokenExpiration
   */
  public enum RefreshTokenExpiration {
    @JsonProperty("Sliding")
    SLIDING("Sliding"),
    
    @JsonProperty("Absolute")
    ABSOLUTE("Absolute");

    private String value;

    RefreshTokenExpiration(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefreshTokenExpiration fromValue(String text) {
      for (RefreshTokenExpiration b : RefreshTokenExpiration.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final RefreshTokenExpiration refreshTokenExpiration;  // Default value is: null

  /**
   * Gets or Sets accessTokenType
   */
  public enum AccessTokenType {
    @JsonProperty("Jwt")
    JWT("Jwt"),
    
    @JsonProperty("Reference")
    REFERENCE("Reference");

    private String value;

    AccessTokenType(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessTokenType fromValue(String text) {
      for (AccessTokenType b : AccessTokenType.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final AccessTokenType accessTokenType;  // Default value is: null

  /**
   * Gets or sets a value indicating whether JWT access tokens should include an identifier
   */
  private final Boolean includeJwtId;  // Default value is: null

  /**
   * Gets or sets a value indicating whether client claims should be always included in the access tokens - or only for client credentials flow.
   */
  private final Boolean alwaysSendClientClaims;  // Default value is: null

  private final List<String> allowedCorsOrigins;  // Default value is: new ArrayList<>()

  private final Boolean allowAccessTokensViaBrowser;  // Default value is: null

  private CreateOpenIdClientRequest(Builder builder) {
      accountId = builder.accountId;
      clientName = builder.clientName;
      clientUri = builder.clientUri;
      requireConsent = builder.requireConsent;
      allowRememberConsent = builder.allowRememberConsent;
      flow = builder.flow;
      allowClientCredentialsOnly = builder.allowClientCredentialsOnly;
      redirectUris = builder.redirectUris;
      postLogoutRedirectUris = builder.postLogoutRedirectUris;
      logoutUri = builder.logoutUri;
      requireSignOutPrompt = builder.requireSignOutPrompt;
      allowedScopes = builder.allowedScopes;
      identityProviderRestrictions = builder.identityProviderRestrictions;
      identityTokenLifetime = builder.identityTokenLifetime;
      accessTokenLifetime = builder.accessTokenLifetime;
      absoluteRefreshTokenLifetime = builder.absoluteRefreshTokenLifetime;
      slidingRefreshTokenLifetime = builder.slidingRefreshTokenLifetime;
      refreshTokenUsage = builder.refreshTokenUsage;
      updateAccessTokenClaimsOnRefresh = builder.updateAccessTokenClaimsOnRefresh;
      refreshTokenExpiration = builder.refreshTokenExpiration;
      accessTokenType = builder.accessTokenType;
      includeJwtId = builder.includeJwtId;
      alwaysSendClientClaims = builder.alwaysSendClientClaims;
      allowedCorsOrigins = builder.allowedCorsOrigins;
      allowAccessTokensViaBrowser = builder.allowAccessTokensViaBrowser;
  }

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Get clientName
      * @return clientName
      **/
      public String getClientName() {return clientName;}

      /**
      * Get clientUri
      * @return clientUri
      **/
      public String getClientUri() {return clientUri;}

      /**
      * Get requireConsent
      * @return requireConsent
      **/
      public Boolean getRequireConsent() {return requireConsent;}

      /**
      * Get allowRememberConsent
      * @return allowRememberConsent
      **/
      public Boolean getAllowRememberConsent() {return allowRememberConsent;}

      /**
      * Get flow
      * @return flow
      **/
      public Flow getFlow() {return flow;}

      /**
      * Get allowClientCredentialsOnly
      * @return allowClientCredentialsOnly
      **/
      public Boolean getAllowClientCredentialsOnly() {return allowClientCredentialsOnly;}

      /**
      * Get redirectUris
      * @return redirectUris
      **/
      public List<String> getRedirectUris() {return redirectUris;}

      /**
      * Get postLogoutRedirectUris
      * @return postLogoutRedirectUris
      **/
      public List<String> getPostLogoutRedirectUris() {return postLogoutRedirectUris;}

      /**
      * Specifies logout URI at client for HTTP based logout.
      * @return logoutUri
      **/
      public String getLogoutUri() {return logoutUri;}

      /**
      * Specifies if the client will always show a confirmation page for sign-out. Defaults to false.
      * @return requireSignOutPrompt
      **/
      public Boolean getRequireSignOutPrompt() {return requireSignOutPrompt;}

      /**
      * Get allowedScopes
      * @return allowedScopes
      **/
      public List<String> getAllowedScopes() {return allowedScopes;}

      /**
      * Setup which id providers that should be allowed to use
      * @return identityProviderRestrictions
      **/
      public List<IdentityProviderRestrictions> getIdentityProviderRestrictions() {return identityProviderRestrictions;}

      /**
      * Lifetime of identity token in seconds (defaults to 300 seconds / 5 minutes)
      * @return identityTokenLifetime
      **/
      public Integer getIdentityTokenLifetime() {return identityTokenLifetime;}

      /**
      * Lifetime of access token in seconds (defaults to 3600 seconds / 1 hour)
      * @return accessTokenLifetime
      **/
      public Integer getAccessTokenLifetime() {return accessTokenLifetime;}

      /**
      * Maximum lifetime of a refresh token in seconds. Defaults to 2592000 seconds / 30 days
      * @return absoluteRefreshTokenLifetime
      **/
      public Integer getAbsoluteRefreshTokenLifetime() {return absoluteRefreshTokenLifetime;}

      /**
      * Sliding lifetime of a refresh token in seconds. Defaults to 1296000 seconds / 15 days
      * @return slidingRefreshTokenLifetime
      **/
      public Integer getSlidingRefreshTokenLifetime() {return slidingRefreshTokenLifetime;}

      /**
      * Get refreshTokenUsage
      * @return refreshTokenUsage
      **/
      public RefreshTokenUsage getRefreshTokenUsage() {return refreshTokenUsage;}

      /**
      * Gets or sets a value indicating whether the access token (and its claims) should be updated on a refresh token request.
      * @return updateAccessTokenClaimsOnRefresh
      **/
      public Boolean getUpdateAccessTokenClaimsOnRefresh() {return updateAccessTokenClaimsOnRefresh;}

      /**
      * Get refreshTokenExpiration
      * @return refreshTokenExpiration
      **/
      public RefreshTokenExpiration getRefreshTokenExpiration() {return refreshTokenExpiration;}

      /**
      * Get accessTokenType
      * @return accessTokenType
      **/
      public AccessTokenType getAccessTokenType() {return accessTokenType;}

      /**
      * Gets or sets a value indicating whether JWT access tokens should include an identifier
      * @return includeJwtId
      **/
      public Boolean getIncludeJwtId() {return includeJwtId;}

      /**
      * Gets or sets a value indicating whether client claims should be always included in the access tokens - or only for client credentials flow.
      * @return alwaysSendClientClaims
      **/
      public Boolean getAlwaysSendClientClaims() {return alwaysSendClientClaims;}

      /**
      * Get allowedCorsOrigins
      * @return allowedCorsOrigins
      **/
      public List<String> getAllowedCorsOrigins() {return allowedCorsOrigins;}

      /**
      * Get allowAccessTokensViaBrowser
      * @return allowAccessTokensViaBrowser
      **/
      public Boolean getAllowAccessTokensViaBrowser() {return allowAccessTokensViaBrowser;}


  public static final class Builder {
      private UUID accountId;
      private String clientName;
      private String clientUri;
      private Boolean requireConsent;
      private Boolean allowRememberConsent;
      private Flow flow;
      private Boolean allowClientCredentialsOnly;
      private List<String> redirectUris;
      private List<String> postLogoutRedirectUris;
      private String logoutUri;
      private Boolean requireSignOutPrompt;
      private List<String> allowedScopes;
      private List<IdentityProviderRestrictions> identityProviderRestrictions;
      private Integer identityTokenLifetime;
      private Integer accessTokenLifetime;
      private Integer absoluteRefreshTokenLifetime;
      private Integer slidingRefreshTokenLifetime;
      private RefreshTokenUsage refreshTokenUsage;
      private Boolean updateAccessTokenClaimsOnRefresh;
      private RefreshTokenExpiration refreshTokenExpiration;
      private AccessTokenType accessTokenType;
      private Boolean includeJwtId;
      private Boolean alwaysSendClientClaims;
      private List<String> allowedCorsOrigins;
      private Boolean allowAccessTokensViaBrowser;

    public Builder() {
    }

    public Builder(CreateOpenIdClientRequest copy) {
        this.accountId = copy.getAccountId();
        this.clientName = copy.getClientName();
        this.clientUri = copy.getClientUri();
        this.requireConsent = copy.getRequireConsent();
        this.allowRememberConsent = copy.getAllowRememberConsent();
        this.flow = copy.getFlow();
        this.allowClientCredentialsOnly = copy.getAllowClientCredentialsOnly();
        this.redirectUris = copy.getRedirectUris();
        this.postLogoutRedirectUris = copy.getPostLogoutRedirectUris();
        this.logoutUri = copy.getLogoutUri();
        this.requireSignOutPrompt = copy.getRequireSignOutPrompt();
        this.allowedScopes = copy.getAllowedScopes();
        this.identityProviderRestrictions = copy.getIdentityProviderRestrictions();
        this.identityTokenLifetime = copy.getIdentityTokenLifetime();
        this.accessTokenLifetime = copy.getAccessTokenLifetime();
        this.absoluteRefreshTokenLifetime = copy.getAbsoluteRefreshTokenLifetime();
        this.slidingRefreshTokenLifetime = copy.getSlidingRefreshTokenLifetime();
        this.refreshTokenUsage = copy.getRefreshTokenUsage();
        this.updateAccessTokenClaimsOnRefresh = copy.getUpdateAccessTokenClaimsOnRefresh();
        this.refreshTokenExpiration = copy.getRefreshTokenExpiration();
        this.accessTokenType = copy.getAccessTokenType();
        this.includeJwtId = copy.getIncludeJwtId();
        this.alwaysSendClientClaims = copy.getAlwaysSendClientClaims();
        this.allowedCorsOrigins = copy.getAllowedCorsOrigins();
        this.allowAccessTokensViaBrowser = copy.getAllowAccessTokensViaBrowser();
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withClientName(String clientName) {
      this.clientName = clientName;
      return this;
    }

    public Builder withClientUri(String clientUri) {
      this.clientUri = clientUri;
      return this;
    }

    public Builder withRequireConsent(Boolean requireConsent) {
      this.requireConsent = requireConsent;
      return this;
    }

    public Builder withAllowRememberConsent(Boolean allowRememberConsent) {
      this.allowRememberConsent = allowRememberConsent;
      return this;
    }

    public Builder withFlow(Flow flow) {
      this.flow = flow;
      return this;
    }

    public Builder withAllowClientCredentialsOnly(Boolean allowClientCredentialsOnly) {
      this.allowClientCredentialsOnly = allowClientCredentialsOnly;
      return this;
    }

    public Builder withRedirectUris(List<String> redirectUris) {
      this.redirectUris = redirectUris;
      return this;
    }

    public Builder addRedirectUrisItem(String redirectUrisItem) {
      this.redirectUris.add(redirectUrisItem);
      return this;
    }

    public Builder withPostLogoutRedirectUris(List<String> postLogoutRedirectUris) {
      this.postLogoutRedirectUris = postLogoutRedirectUris;
      return this;
    }

    public Builder addPostLogoutRedirectUrisItem(String postLogoutRedirectUrisItem) {
      if (this.postLogoutRedirectUris == null) {
        this.postLogoutRedirectUris = new ArrayList<>();
      }
      this.postLogoutRedirectUris.add(postLogoutRedirectUrisItem);
      return this;
    }

    public Builder withLogoutUri(String logoutUri) {
      this.logoutUri = logoutUri;
      return this;
    }

    public Builder withRequireSignOutPrompt(Boolean requireSignOutPrompt) {
      this.requireSignOutPrompt = requireSignOutPrompt;
      return this;
    }

    public Builder withAllowedScopes(List<String> allowedScopes) {
      this.allowedScopes = allowedScopes;
      return this;
    }

    public Builder addAllowedScopesItem(String allowedScopesItem) {
      if (this.allowedScopes == null) {
        this.allowedScopes = new ArrayList<>();
      }
      this.allowedScopes.add(allowedScopesItem);
      return this;
    }

    public Builder withIdentityProviderRestrictions(List<IdentityProviderRestrictions> identityProviderRestrictions) {
      this.identityProviderRestrictions = identityProviderRestrictions;
      return this;
    }

    public Builder addIdentityProviderRestrictionsItem(IdentityProviderRestrictions identityProviderRestrictionsItem) {
      if (this.identityProviderRestrictions == null) {
        this.identityProviderRestrictions = new ArrayList<>();
      }
      this.identityProviderRestrictions.add(identityProviderRestrictionsItem);
      return this;
    }

    public Builder withIdentityTokenLifetime(Integer identityTokenLifetime) {
      this.identityTokenLifetime = identityTokenLifetime;
      return this;
    }

    public Builder withAccessTokenLifetime(Integer accessTokenLifetime) {
      this.accessTokenLifetime = accessTokenLifetime;
      return this;
    }

    public Builder withAbsoluteRefreshTokenLifetime(Integer absoluteRefreshTokenLifetime) {
      this.absoluteRefreshTokenLifetime = absoluteRefreshTokenLifetime;
      return this;
    }

    public Builder withSlidingRefreshTokenLifetime(Integer slidingRefreshTokenLifetime) {
      this.slidingRefreshTokenLifetime = slidingRefreshTokenLifetime;
      return this;
    }

    public Builder withRefreshTokenUsage(RefreshTokenUsage refreshTokenUsage) {
      this.refreshTokenUsage = refreshTokenUsage;
      return this;
    }

    public Builder withUpdateAccessTokenClaimsOnRefresh(Boolean updateAccessTokenClaimsOnRefresh) {
      this.updateAccessTokenClaimsOnRefresh = updateAccessTokenClaimsOnRefresh;
      return this;
    }

    public Builder withRefreshTokenExpiration(RefreshTokenExpiration refreshTokenExpiration) {
      this.refreshTokenExpiration = refreshTokenExpiration;
      return this;
    }

    public Builder withAccessTokenType(AccessTokenType accessTokenType) {
      this.accessTokenType = accessTokenType;
      return this;
    }

    public Builder withIncludeJwtId(Boolean includeJwtId) {
      this.includeJwtId = includeJwtId;
      return this;
    }

    public Builder withAlwaysSendClientClaims(Boolean alwaysSendClientClaims) {
      this.alwaysSendClientClaims = alwaysSendClientClaims;
      return this;
    }

    public Builder withAllowedCorsOrigins(List<String> allowedCorsOrigins) {
      this.allowedCorsOrigins = allowedCorsOrigins;
      return this;
    }

    public Builder addAllowedCorsOriginsItem(String allowedCorsOriginsItem) {
      if (this.allowedCorsOrigins == null) {
        this.allowedCorsOrigins = new ArrayList<>();
      }
      this.allowedCorsOrigins.add(allowedCorsOriginsItem);
      return this;
    }

    public Builder withAllowAccessTokensViaBrowser(Boolean allowAccessTokensViaBrowser) {
      this.allowAccessTokensViaBrowser = allowAccessTokensViaBrowser;
      return this;
    }


    public CreateOpenIdClientRequest build() { return new CreateOpenIdClientRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOpenIdClientRequest createOpenIdClientRequest = (CreateOpenIdClientRequest) o;
    return Objects.equals(this.accountId, createOpenIdClientRequest.accountId) &&
        Objects.equals(this.clientName, createOpenIdClientRequest.clientName) &&
        Objects.equals(this.clientUri, createOpenIdClientRequest.clientUri) &&
        Objects.equals(this.requireConsent, createOpenIdClientRequest.requireConsent) &&
        Objects.equals(this.allowRememberConsent, createOpenIdClientRequest.allowRememberConsent) &&
        Objects.equals(this.flow, createOpenIdClientRequest.flow) &&
        Objects.equals(this.allowClientCredentialsOnly, createOpenIdClientRequest.allowClientCredentialsOnly) &&
        Objects.equals(this.redirectUris, createOpenIdClientRequest.redirectUris) &&
        Objects.equals(this.postLogoutRedirectUris, createOpenIdClientRequest.postLogoutRedirectUris) &&
        Objects.equals(this.logoutUri, createOpenIdClientRequest.logoutUri) &&
        Objects.equals(this.requireSignOutPrompt, createOpenIdClientRequest.requireSignOutPrompt) &&
        Objects.equals(this.allowedScopes, createOpenIdClientRequest.allowedScopes) &&
        Objects.equals(this.identityProviderRestrictions, createOpenIdClientRequest.identityProviderRestrictions) &&
        Objects.equals(this.identityTokenLifetime, createOpenIdClientRequest.identityTokenLifetime) &&
        Objects.equals(this.accessTokenLifetime, createOpenIdClientRequest.accessTokenLifetime) &&
        Objects.equals(this.absoluteRefreshTokenLifetime, createOpenIdClientRequest.absoluteRefreshTokenLifetime) &&
        Objects.equals(this.slidingRefreshTokenLifetime, createOpenIdClientRequest.slidingRefreshTokenLifetime) &&
        Objects.equals(this.refreshTokenUsage, createOpenIdClientRequest.refreshTokenUsage) &&
        Objects.equals(this.updateAccessTokenClaimsOnRefresh, createOpenIdClientRequest.updateAccessTokenClaimsOnRefresh) &&
        Objects.equals(this.refreshTokenExpiration, createOpenIdClientRequest.refreshTokenExpiration) &&
        Objects.equals(this.accessTokenType, createOpenIdClientRequest.accessTokenType) &&
        Objects.equals(this.includeJwtId, createOpenIdClientRequest.includeJwtId) &&
        Objects.equals(this.alwaysSendClientClaims, createOpenIdClientRequest.alwaysSendClientClaims) &&
        Objects.equals(this.allowedCorsOrigins, createOpenIdClientRequest.allowedCorsOrigins) &&
        Objects.equals(this.allowAccessTokensViaBrowser, createOpenIdClientRequest.allowAccessTokensViaBrowser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, clientName, clientUri, requireConsent, allowRememberConsent, flow, allowClientCredentialsOnly, redirectUris, postLogoutRedirectUris, logoutUri, requireSignOutPrompt, allowedScopes, identityProviderRestrictions, identityTokenLifetime, accessTokenLifetime, absoluteRefreshTokenLifetime, slidingRefreshTokenLifetime, refreshTokenUsage, updateAccessTokenClaimsOnRefresh, refreshTokenExpiration, accessTokenType, includeJwtId, alwaysSendClientClaims, allowedCorsOrigins, allowAccessTokensViaBrowser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOpenIdClientRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append("\n");
    sb.append("    requireConsent: ").append(toIndentedString(requireConsent)).append("\n");
    sb.append("    allowRememberConsent: ").append(toIndentedString(allowRememberConsent)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    allowClientCredentialsOnly: ").append(toIndentedString(allowClientCredentialsOnly)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    postLogoutRedirectUris: ").append(toIndentedString(postLogoutRedirectUris)).append("\n");
    sb.append("    logoutUri: ").append(toIndentedString(logoutUri)).append("\n");
    sb.append("    requireSignOutPrompt: ").append(toIndentedString(requireSignOutPrompt)).append("\n");
    sb.append("    allowedScopes: ").append(toIndentedString(allowedScopes)).append("\n");
    sb.append("    identityProviderRestrictions: ").append(toIndentedString(identityProviderRestrictions)).append("\n");
    sb.append("    identityTokenLifetime: ").append(toIndentedString(identityTokenLifetime)).append("\n");
    sb.append("    accessTokenLifetime: ").append(toIndentedString(accessTokenLifetime)).append("\n");
    sb.append("    absoluteRefreshTokenLifetime: ").append(toIndentedString(absoluteRefreshTokenLifetime)).append("\n");
    sb.append("    slidingRefreshTokenLifetime: ").append(toIndentedString(slidingRefreshTokenLifetime)).append("\n");
    sb.append("    refreshTokenUsage: ").append(toIndentedString(refreshTokenUsage)).append("\n");
    sb.append("    updateAccessTokenClaimsOnRefresh: ").append(toIndentedString(updateAccessTokenClaimsOnRefresh)).append("\n");
    sb.append("    refreshTokenExpiration: ").append(toIndentedString(refreshTokenExpiration)).append("\n");
    sb.append("    accessTokenType: ").append(toIndentedString(accessTokenType)).append("\n");
    sb.append("    includeJwtId: ").append(toIndentedString(includeJwtId)).append("\n");
    sb.append("    alwaysSendClientClaims: ").append(toIndentedString(alwaysSendClientClaims)).append("\n");
    sb.append("    allowedCorsOrigins: ").append(toIndentedString(allowedCorsOrigins)).append("\n");
    sb.append("    allowAccessTokensViaBrowser: ").append(toIndentedString(allowAccessTokensViaBrowser)).append("\n");
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
