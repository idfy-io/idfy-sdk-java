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
import io.idfy.admin.models.ClaimLite;
import io.idfy.admin.models.OauthSecret;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * OauthAPIClientResponse
 */
@JsonDeserialize(builder = OauthAPIClientResponse.Builder.class)
public class OauthAPIClientResponse  implements Serializable {
  private final UUID accountId;  // Default value is: null

  private final String clientId;  // Default value is: null

  private final String clientName;  // Default value is: null

  private final Boolean enabled;  // Default value is: null

  private final OffsetDateTime created;  // Default value is: null

  private final OffsetDateTime lastChanged;  // Default value is: null

  private final List<OauthSecret> clientSecrets;  // Default value is: new ArrayList<>()

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

  private final List<String> allowedScopes;  // Default value is: new ArrayList<>()

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

  private final List<ClaimLite> claims;  // Default value is: new ArrayList<>()

  /**
   * Gets or sets a value indicating whether client claims should be always included in the access tokens - or only for client credentials flow.
   */
  private final Boolean alwaysSendClientClaims;  // Default value is: null

  private final List<String> allowedCorsOrigins;  // Default value is: new ArrayList<>()

  private OauthAPIClientResponse(Builder builder) {
      accountId = builder.accountId;
      clientId = builder.clientId;
      clientName = builder.clientName;
      enabled = builder.enabled;
      created = builder.created;
      lastChanged = builder.lastChanged;
      clientSecrets = builder.clientSecrets;
      flow = builder.flow;
      allowedScopes = builder.allowedScopes;
      identityTokenLifetime = builder.identityTokenLifetime;
      accessTokenLifetime = builder.accessTokenLifetime;
      absoluteRefreshTokenLifetime = builder.absoluteRefreshTokenLifetime;
      slidingRefreshTokenLifetime = builder.slidingRefreshTokenLifetime;
      refreshTokenUsage = builder.refreshTokenUsage;
      updateAccessTokenClaimsOnRefresh = builder.updateAccessTokenClaimsOnRefresh;
      refreshTokenExpiration = builder.refreshTokenExpiration;
      accessTokenType = builder.accessTokenType;
      claims = builder.claims;
      alwaysSendClientClaims = builder.alwaysSendClientClaims;
      allowedCorsOrigins = builder.allowedCorsOrigins;
  }

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Get clientId
      * @return clientId
      **/
      public String getClientId() {return clientId;}

      /**
      * Get clientName
      * @return clientName
      **/
      public String getClientName() {return clientName;}

      /**
      * Get enabled
      * @return enabled
      **/
      public Boolean getEnabled() {return enabled;}

      /**
      * Get created
      * @return created
      **/
      public OffsetDateTime getCreated() {return created;}

      /**
      * Get lastChanged
      * @return lastChanged
      **/
      public OffsetDateTime getLastChanged() {return lastChanged;}

      /**
      * Get clientSecrets
      * @return clientSecrets
      **/
      public List<OauthSecret> getClientSecrets() {return clientSecrets;}

      /**
      * Get flow
      * @return flow
      **/
      public Flow getFlow() {return flow;}

      /**
      * Get allowedScopes
      * @return allowedScopes
      **/
      public List<String> getAllowedScopes() {return allowedScopes;}

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
      * Get claims
      * @return claims
      **/
      public List<ClaimLite> getClaims() {return claims;}

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


  public static final class Builder {
      private UUID accountId;
      private String clientId;
      private String clientName;
      private Boolean enabled;
      private OffsetDateTime created;
      private OffsetDateTime lastChanged;
      private List<OauthSecret> clientSecrets;
      private Flow flow;
      private List<String> allowedScopes;
      private Integer identityTokenLifetime;
      private Integer accessTokenLifetime;
      private Integer absoluteRefreshTokenLifetime;
      private Integer slidingRefreshTokenLifetime;
      private RefreshTokenUsage refreshTokenUsage;
      private Boolean updateAccessTokenClaimsOnRefresh;
      private RefreshTokenExpiration refreshTokenExpiration;
      private AccessTokenType accessTokenType;
      private List<ClaimLite> claims;
      private Boolean alwaysSendClientClaims;
      private List<String> allowedCorsOrigins;

    public Builder() {
    }

    public Builder(OauthAPIClientResponse copy) {
        this.accountId = copy.getAccountId();
        this.clientId = copy.getClientId();
        this.clientName = copy.getClientName();
        this.enabled = copy.getEnabled();
        this.created = copy.getCreated();
        this.lastChanged = copy.getLastChanged();
        this.clientSecrets = copy.getClientSecrets();
        this.flow = copy.getFlow();
        this.allowedScopes = copy.getAllowedScopes();
        this.identityTokenLifetime = copy.getIdentityTokenLifetime();
        this.accessTokenLifetime = copy.getAccessTokenLifetime();
        this.absoluteRefreshTokenLifetime = copy.getAbsoluteRefreshTokenLifetime();
        this.slidingRefreshTokenLifetime = copy.getSlidingRefreshTokenLifetime();
        this.refreshTokenUsage = copy.getRefreshTokenUsage();
        this.updateAccessTokenClaimsOnRefresh = copy.getUpdateAccessTokenClaimsOnRefresh();
        this.refreshTokenExpiration = copy.getRefreshTokenExpiration();
        this.accessTokenType = copy.getAccessTokenType();
        this.claims = copy.getClaims();
        this.alwaysSendClientClaims = copy.getAlwaysSendClientClaims();
        this.allowedCorsOrigins = copy.getAllowedCorsOrigins();
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withClientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    public Builder withClientName(String clientName) {
      this.clientName = clientName;
      return this;
    }

    public Builder withEnabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    public Builder withCreated(OffsetDateTime created) {
      this.created = created;
      return this;
    }

    public Builder withLastChanged(OffsetDateTime lastChanged) {
      this.lastChanged = lastChanged;
      return this;
    }

    public Builder withClientSecrets(List<OauthSecret> clientSecrets) {
      this.clientSecrets = clientSecrets;
      return this;
    }

    public Builder addClientSecretsItem(OauthSecret clientSecretsItem) {
      if (this.clientSecrets == null) {
        this.clientSecrets = new ArrayList<>();
      }
      this.clientSecrets.add(clientSecretsItem);
      return this;
    }

    public Builder withFlow(Flow flow) {
      this.flow = flow;
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

    public Builder withClaims(List<ClaimLite> claims) {
      this.claims = claims;
      return this;
    }

    public Builder addClaimsItem(ClaimLite claimsItem) {
      if (this.claims == null) {
        this.claims = new ArrayList<>();
      }
      this.claims.add(claimsItem);
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


    public OauthAPIClientResponse build() { return new OauthAPIClientResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAPIClientResponse oauthAPIClientResponse = (OauthAPIClientResponse) o;
    return Objects.equals(this.accountId, oauthAPIClientResponse.accountId) &&
        Objects.equals(this.clientId, oauthAPIClientResponse.clientId) &&
        Objects.equals(this.clientName, oauthAPIClientResponse.clientName) &&
        Objects.equals(this.enabled, oauthAPIClientResponse.enabled) &&
        Objects.equals(this.created, oauthAPIClientResponse.created) &&
        Objects.equals(this.lastChanged, oauthAPIClientResponse.lastChanged) &&
        Objects.equals(this.clientSecrets, oauthAPIClientResponse.clientSecrets) &&
        Objects.equals(this.flow, oauthAPIClientResponse.flow) &&
        Objects.equals(this.allowedScopes, oauthAPIClientResponse.allowedScopes) &&
        Objects.equals(this.identityTokenLifetime, oauthAPIClientResponse.identityTokenLifetime) &&
        Objects.equals(this.accessTokenLifetime, oauthAPIClientResponse.accessTokenLifetime) &&
        Objects.equals(this.absoluteRefreshTokenLifetime, oauthAPIClientResponse.absoluteRefreshTokenLifetime) &&
        Objects.equals(this.slidingRefreshTokenLifetime, oauthAPIClientResponse.slidingRefreshTokenLifetime) &&
        Objects.equals(this.refreshTokenUsage, oauthAPIClientResponse.refreshTokenUsage) &&
        Objects.equals(this.updateAccessTokenClaimsOnRefresh, oauthAPIClientResponse.updateAccessTokenClaimsOnRefresh) &&
        Objects.equals(this.refreshTokenExpiration, oauthAPIClientResponse.refreshTokenExpiration) &&
        Objects.equals(this.accessTokenType, oauthAPIClientResponse.accessTokenType) &&
        Objects.equals(this.claims, oauthAPIClientResponse.claims) &&
        Objects.equals(this.alwaysSendClientClaims, oauthAPIClientResponse.alwaysSendClientClaims) &&
        Objects.equals(this.allowedCorsOrigins, oauthAPIClientResponse.allowedCorsOrigins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, clientId, clientName, enabled, created, lastChanged, clientSecrets, flow, allowedScopes, identityTokenLifetime, accessTokenLifetime, absoluteRefreshTokenLifetime, slidingRefreshTokenLifetime, refreshTokenUsage, updateAccessTokenClaimsOnRefresh, refreshTokenExpiration, accessTokenType, claims, alwaysSendClientClaims, allowedCorsOrigins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAPIClientResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastChanged: ").append(toIndentedString(lastChanged)).append("\n");
    sb.append("    clientSecrets: ").append(toIndentedString(clientSecrets)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    allowedScopes: ").append(toIndentedString(allowedScopes)).append("\n");
    sb.append("    identityTokenLifetime: ").append(toIndentedString(identityTokenLifetime)).append("\n");
    sb.append("    accessTokenLifetime: ").append(toIndentedString(accessTokenLifetime)).append("\n");
    sb.append("    absoluteRefreshTokenLifetime: ").append(toIndentedString(absoluteRefreshTokenLifetime)).append("\n");
    sb.append("    slidingRefreshTokenLifetime: ").append(toIndentedString(slidingRefreshTokenLifetime)).append("\n");
    sb.append("    refreshTokenUsage: ").append(toIndentedString(refreshTokenUsage)).append("\n");
    sb.append("    updateAccessTokenClaimsOnRefresh: ").append(toIndentedString(updateAccessTokenClaimsOnRefresh)).append("\n");
    sb.append("    refreshTokenExpiration: ").append(toIndentedString(refreshTokenExpiration)).append("\n");
    sb.append("    accessTokenType: ").append(toIndentedString(accessTokenType)).append("\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
    sb.append("    alwaysSendClientClaims: ").append(toIndentedString(alwaysSendClientClaims)).append("\n");
    sb.append("    allowedCorsOrigins: ").append(toIndentedString(allowedCorsOrigins)).append("\n");
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
