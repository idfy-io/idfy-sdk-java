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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Audit trail.
 */
@JsonDeserialize(builder = AuditTrail.Builder.class)
public class AuditTrail  implements Serializable {
  /**
   * PEM encoded certificate used to identify the user.
   */
  private final String certificate;  // Default value is: null

  /**
   * Events raised for the current session.
   */
  private final List<IdSessionEvent> events;  // Default value is: new ArrayList<IdSessionEvent>()

  private AuditTrail(Builder builder) {
      certificate = builder.certificate;
      events = builder.events;
  }

      /**
      * PEM encoded certificate used to identify the user.
      * @return certificate
      **/
      public String getCertificate() {return certificate;}

      /**
      * Events raised for the current session.
      * @return events
      **/
      public List<IdSessionEvent> getEvents() {return events;}


  public static final class Builder {
      private String certificate;
      private List<IdSessionEvent> events;

    public Builder() {
    }

    public Builder(AuditTrail copy) {
        this.certificate = copy.getCertificate();
        this.events = copy.getEvents();
    }

    public Builder withCertificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    public Builder withEvents(List<IdSessionEvent> events) {
      this.events = events;
      return this;
    }

    public Builder addEventsItem(IdSessionEvent eventsItem) {
      if (this.events == null) {
        this.events = new ArrayList<IdSessionEvent>();
      }
      this.events.add(eventsItem);
      return this;
    }


    public AuditTrail build() { return new AuditTrail(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditTrail auditTrail = (AuditTrail) o;
    return Objects.equals(this.certificate, auditTrail.certificate) &&
        Objects.equals(this.events, auditTrail.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrail {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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