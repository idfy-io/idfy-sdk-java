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

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.io.Serializable;

/**
 * IdSessionCreate
 */
@JsonDeserialize(builder = IdSessionCreate.Builder.class)
public class IdSessionCreate  implements Serializable {
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

  private IdSessionCreate(Builder builder) {
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
  }

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


  public static final class Builder {
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

    public Builder() {
    }

    public Builder(IdSessionCreate copy) {
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


    public IdSessionCreate build() { return new IdSessionCreate(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdSessionCreate idSessionCreate = (IdSessionCreate) o;
    return Objects.equals(this.allowedProviders, idSessionCreate.allowedProviders) &&
        Objects.equals(this.language, idSessionCreate.language) &&
        Objects.equals(this.flow, idSessionCreate.flow) &&
        Objects.equals(this.include, idSessionCreate.include) &&
        Objects.equals(this.redirectSettings, idSessionCreate.redirectSettings) &&
        Objects.equals(this.iframeSettings, idSessionCreate.iframeSettings) &&
        Objects.equals(this.externalReference, idSessionCreate.externalReference) &&
        Objects.equals(this.departmentId, idSessionCreate.departmentId) &&
        Objects.equals(this.ui, idSessionCreate.ui) &&
        Objects.equals(this.prefilledInput, idSessionCreate.prefilledInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedProviders, language, flow, include, redirectSettings, iframeSettings, externalReference, departmentId, ui, prefilledInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdSessionCreate {\n");
    
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