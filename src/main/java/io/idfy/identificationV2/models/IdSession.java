/*
 * Idfy Identification v2
 * This endpoint enables identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID.
 *
 * OpenAPI spec version: v2
 * Contact: support@idfy.io
 */
package io.idfy.identificationV2.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * IdSession
 */
@JsonDeserialize(builder = IdSession.Builder.class)
public class IdSession  implements Serializable {
  /**
   * The session's unique identifier.
   */
  private final String id;  // Default value is: null

  /**
   * The URL to start the identification process. Only applicable to the `iframe` and `redirect` flows.
   */
  private final String url;  // Default value is: null

  /**
   * The security reference for the identification process. Only applicable to the `headless` flow.
   */
  private final String securityReference;  // Default value is: null

  private final IdSessionStatus status;  // Default value is: null

  /**
   * Time at which the session was created.
   */
  private final OffsetDateTime created;  // Default value is: null

  /**
   * Time at which the session will expire.
   */
  private final OffsetDateTime expires;  // Default value is: null

  private final IdProviderType provider;  // Default value is: null

  private final Identity identity;  // Default value is: null

  private final Environment environment;  // Default value is: null

  /**
   * A list of eID providers that can be used for identification. If not specified, the user will be able to choose from all eID's associated with your Idfy account.
   */
  private final List<IdProviderType> allowedProviders;  // Default value is: new ArrayList<IdProviderType>()

  private final Language language;  // Default value is: null

  private final IdFlow flow;  // Default value is: null

  /**
   * Request additional information about the user.
   */
  private final List<Include> include;  // Default value is: new ArrayList<Include>()

  private final RedirectSettings redirectSettings;  // Default value is: null

  private final IframeSettings iframeSettings;  // Default value is: null

  /**
   * Your external reference for the session.
   */
  private final String externalReference;  // Default value is: null

  /**
   * The department ID to mark the invoice with.
   */
  private final String departmentId;  // Default value is: null

  private final UiSettings ui;  // Default value is: null

  private final PrefilledInput prefilledInput;  // Default value is: null

  /**
   * Resources created for the session.
   */
  private final List<ExtraInfoResource> resources;  // Default value is: new ArrayList<ExtraInfoResource>()

  private final AuditTrail auditTrail;  // Default value is: null

  private final Error error;  // Default value is: null

  private IdSession(Builder builder) {
      id = builder.id;
      url = builder.url;
      securityReference = builder.securityReference;
      status = builder.status;
      created = builder.created;
      expires = builder.expires;
      provider = builder.provider;
      identity = builder.identity;
      environment = builder.environment;
      allowedProviders = builder.allowedProviders;
      language = builder.language;
      flow = builder.flow;
      include = builder.include;
      redirectSettings = builder.redirectSettings;
      iframeSettings = builder.iframeSettings;
      externalReference = builder.externalReference;
      departmentId = builder.departmentId;
      ui = builder.ui;
      prefilledInput = builder.prefilledInput;
      resources = builder.resources;
      auditTrail = builder.auditTrail;
      error = builder.error;
  }

      /**
      * The session's unique identifier.
      * @return id
      **/
      public String getId() {return id;}

      /**
      * The URL to start the identification process. Only applicable to the `iframe` and `redirect` flows.
      * @return url
      **/
      public String getUrl() {return url;}

      /**
      * The security reference for the identification process. Only applicable to the `headless` flow.
      * @return securityReference
      **/
      public String getSecurityReference() {return securityReference;}

      /**
      * Get status
      * @return status
      **/
      public IdSessionStatus getStatus() {return status;}

      /**
      * Time at which the session was created.
      * @return created
      **/
      public OffsetDateTime getCreated() {return created;}

      /**
      * Time at which the session will expire.
      * @return expires
      **/
      public OffsetDateTime getExpires() {return expires;}

      /**
      * Get provider
      * @return provider
      **/
      public IdProviderType getProvider() {return provider;}

      /**
      * Get identity
      * @return identity
      **/
      public Identity getIdentity() {return identity;}

      /**
      * Get environment
      * @return environment
      **/
      public Environment getEnvironment() {return environment;}

      /**
      * A list of eID providers that can be used for identification. If not specified, the user will be able to choose from all eID's associated with your Idfy account.
      * @return allowedProviders
      **/
      public List<IdProviderType> getAllowedProviders() {return allowedProviders;}

      /**
      * Get language
      * @return language
      **/
      public Language getLanguage() {return language;}

      /**
      * Get flow
      * @return flow
      **/
      public IdFlow getFlow() {return flow;}

      /**
      * Request additional information about the user.
      * @return include
      **/
      public List<Include> getInclude() {return include;}

      /**
      * Get redirectSettings
      * @return redirectSettings
      **/
      public RedirectSettings getRedirectSettings() {return redirectSettings;}

      /**
      * Get iframeSettings
      * @return iframeSettings
      **/
      public IframeSettings getIframeSettings() {return iframeSettings;}

      /**
      * Your external reference for the session.
      * @return externalReference
      **/
      public String getExternalReference() {return externalReference;}

      /**
      * The department ID to mark the invoice with.
      * @return departmentId
      **/
      public String getDepartmentId() {return departmentId;}

      /**
      * Get ui
      * @return ui
      **/
      public UiSettings getUi() {return ui;}

      /**
      * Get prefilledInput
      * @return prefilledInput
      **/
      public PrefilledInput getPrefilledInput() {return prefilledInput;}

      /**
      * Resources created for the session.
      * @return resources
      **/
      public List<ExtraInfoResource> getResources() {return resources;}

      /**
      * Get auditTrail
      * @return auditTrail
      **/
      public AuditTrail getAuditTrail() {return auditTrail;}

      /**
      * Get error
      * @return error
      **/
      public Error getError() {return error;}


  public static final class Builder {
      private String id;
      private String url;
      private String securityReference;
      private IdSessionStatus status;
      private OffsetDateTime created;
      private OffsetDateTime expires;
      private IdProviderType provider;
      private Identity identity;
      private Environment environment;
      private List<IdProviderType> allowedProviders;
      private Language language;
      private IdFlow flow;
      private List<Include> include;
      private RedirectSettings redirectSettings;
      private IframeSettings iframeSettings;
      private String externalReference;
      private String departmentId;
      private UiSettings ui;
      private PrefilledInput prefilledInput;
      private List<ExtraInfoResource> resources;
      private AuditTrail auditTrail;
      private Error error;

    public Builder() {
    }

    public Builder(IdSession copy) {
        this.id = copy.getId();
        this.url = copy.getUrl();
        this.securityReference = copy.getSecurityReference();
        this.status = copy.getStatus();
        this.created = copy.getCreated();
        this.expires = copy.getExpires();
        this.provider = copy.getProvider();
        this.identity = copy.getIdentity();
        this.environment = copy.getEnvironment();
        this.allowedProviders = copy.getAllowedProviders();
        this.language = copy.getLanguage();
        this.flow = copy.getFlow();
        this.include = copy.getInclude();
        this.redirectSettings = copy.getRedirectSettings();
        this.iframeSettings = copy.getIframeSettings();
        this.externalReference = copy.getExternalReference();
        this.departmentId = copy.getDepartmentId();
        this.ui = copy.getUi();
        this.prefilledInput = copy.getPrefilledInput();
        this.resources = copy.getResources();
        this.auditTrail = copy.getAuditTrail();
        this.error = copy.getError();
    }

    public Builder withId(String id) {
      this.id = id;
      return this;
    }

    public Builder withUrl(String url) {
      this.url = url;
      return this;
    }

    public Builder withSecurityReference(String securityReference) {
      this.securityReference = securityReference;
      return this;
    }

    public Builder withStatus(IdSessionStatus status) {
      this.status = status;
      return this;
    }

    public Builder withCreated(OffsetDateTime created) {
      this.created = created;
      return this;
    }

    public Builder withExpires(OffsetDateTime expires) {
      this.expires = expires;
      return this;
    }

    public Builder withProvider(IdProviderType provider) {
      this.provider = provider;
      return this;
    }

    public Builder withIdentity(Identity identity) {
      this.identity = identity;
      return this;
    }

    public Builder withEnvironment(Environment environment) {
      this.environment = environment;
      return this;
    }

    public Builder withAllowedProviders(List<IdProviderType> allowedProviders) {
      this.allowedProviders = allowedProviders;
      return this;
    }

    public Builder addAllowedProvidersItem(IdProviderType allowedProvidersItem) {
      if (this.allowedProviders == null) {
        this.allowedProviders = new ArrayList<IdProviderType>();
      }
      this.allowedProviders.add(allowedProvidersItem);
      return this;
    }

    public Builder withLanguage(Language language) {
      this.language = language;
      return this;
    }

    public Builder withFlow(IdFlow flow) {
      this.flow = flow;
      return this;
    }

    public Builder withInclude(List<Include> include) {
      this.include = include;
      return this;
    }

    public Builder addIncludeItem(Include includeItem) {
      if (this.include == null) {
        this.include = new ArrayList<Include>();
      }
      this.include.add(includeItem);
      return this;
    }

    public Builder withRedirectSettings(RedirectSettings redirectSettings) {
      this.redirectSettings = redirectSettings;
      return this;
    }

    public Builder withIframeSettings(IframeSettings iframeSettings) {
      this.iframeSettings = iframeSettings;
      return this;
    }

    public Builder withExternalReference(String externalReference) {
      this.externalReference = externalReference;
      return this;
    }

    public Builder withDepartmentId(String departmentId) {
      this.departmentId = departmentId;
      return this;
    }

    public Builder withUi(UiSettings ui) {
      this.ui = ui;
      return this;
    }

    public Builder withPrefilledInput(PrefilledInput prefilledInput) {
      this.prefilledInput = prefilledInput;
      return this;
    }

    public Builder withResources(List<ExtraInfoResource> resources) {
      this.resources = resources;
      return this;
    }

    public Builder addResourcesItem(ExtraInfoResource resourcesItem) {
      if (this.resources == null) {
        this.resources = new ArrayList<ExtraInfoResource>();
      }
      this.resources.add(resourcesItem);
      return this;
    }

    public Builder withAuditTrail(AuditTrail auditTrail) {
      this.auditTrail = auditTrail;
      return this;
    }

    public Builder withError(Error error) {
      this.error = error;
      return this;
    }


    public IdSession build() { return new IdSession(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdSession idSession = (IdSession) o;
    return Objects.equals(this.id, idSession.id) &&
        Objects.equals(this.url, idSession.url) &&
        Objects.equals(this.securityReference, idSession.securityReference) &&
        Objects.equals(this.status, idSession.status) &&
        Objects.equals(this.created, idSession.created) &&
        Objects.equals(this.expires, idSession.expires) &&
        Objects.equals(this.provider, idSession.provider) &&
        Objects.equals(this.identity, idSession.identity) &&
        Objects.equals(this.environment, idSession.environment) &&
        Objects.equals(this.allowedProviders, idSession.allowedProviders) &&
        Objects.equals(this.language, idSession.language) &&
        Objects.equals(this.flow, idSession.flow) &&
        Objects.equals(this.include, idSession.include) &&
        Objects.equals(this.redirectSettings, idSession.redirectSettings) &&
        Objects.equals(this.iframeSettings, idSession.iframeSettings) &&
        Objects.equals(this.externalReference, idSession.externalReference) &&
        Objects.equals(this.departmentId, idSession.departmentId) &&
        Objects.equals(this.ui, idSession.ui) &&
        Objects.equals(this.prefilledInput, idSession.prefilledInput) &&
        Objects.equals(this.resources, idSession.resources) &&
        Objects.equals(this.auditTrail, idSession.auditTrail) &&
        Objects.equals(this.error, idSession.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, securityReference, status, created, expires, provider, identity, environment, allowedProviders, language, flow, include, redirectSettings, iframeSettings, externalReference, departmentId, ui, prefilledInput, resources, auditTrail, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    securityReference: ").append(toIndentedString(securityReference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    allowedProviders: ").append(toIndentedString(allowedProviders)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    redirectSettings: ").append(toIndentedString(redirectSettings)).append("\n");
    sb.append("    iframeSettings: ").append(toIndentedString(iframeSettings)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    ui: ").append(toIndentedString(ui)).append("\n");
    sb.append("    prefilledInput: ").append(toIndentedString(prefilledInput)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    auditTrail: ").append(toIndentedString(auditTrail)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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