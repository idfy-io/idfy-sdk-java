/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.signature.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * Notification setup for the signer. All notifications defaults to &#x60;\&quot;off\&quot;&#x60;.
 */
@JsonDeserialize(builder = NotificationsSetup.Builder.class)
public class NotificationsSetup  implements Serializable {
  /**
   * Gets or Sets request
   */
  public enum Request {
    @JsonProperty("off")
    OFF("off"),
    
    @JsonProperty("sendSms")
    SENDSMS("sendSms"),
    
    @JsonProperty("sendEmail")
    SENDEMAIL("sendEmail"),
    
    @JsonProperty("sendBoth")
    SENDBOTH("sendBoth");

    private String value;

    Request(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Request fromValue(String text) {
      for (Request b : Request.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final Request request;  // Default value is: null

  /**
   * Gets or Sets reminder
   */
  public enum Reminder {
    @JsonProperty("off")
    OFF("off"),
    
    @JsonProperty("sendSms")
    SENDSMS("sendSms"),
    
    @JsonProperty("sendEmail")
    SENDEMAIL("sendEmail"),
    
    @JsonProperty("sendBoth")
    SENDBOTH("sendBoth");

    private String value;

    Reminder(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Reminder fromValue(String text) {
      for (Reminder b : Reminder.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final Reminder reminder;  // Default value is: null

  /**
   * Gets or Sets signatureReceipt
   */
  public enum SignatureReceipt {
    @JsonProperty("off")
    OFF("off"),
    
    @JsonProperty("sendSms")
    SENDSMS("sendSms"),
    
    @JsonProperty("sendEmail")
    SENDEMAIL("sendEmail"),
    
    @JsonProperty("sendBoth")
    SENDBOTH("sendBoth");

    private String value;

    SignatureReceipt(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureReceipt fromValue(String text) {
      for (SignatureReceipt b : SignatureReceipt.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final SignatureReceipt signatureReceipt;  // Default value is: null

  /**
   * Gets or Sets finalReceipt
   */
  public enum FinalReceipt {
    @JsonProperty("off")
    OFF("off"),
    
    @JsonProperty("sendSms")
    SENDSMS("sendSms"),
    
    @JsonProperty("sendEmail")
    SENDEMAIL("sendEmail"),
    
    @JsonProperty("sendBoth")
    SENDBOTH("sendBoth");

    private String value;

    FinalReceipt(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FinalReceipt fromValue(String text) {
      for (FinalReceipt b : FinalReceipt.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final FinalReceipt finalReceipt;  // Default value is: null

  /**
   * Gets or Sets canceled
   */
  public enum Canceled {
    @JsonProperty("off")
    OFF("off"),
    
    @JsonProperty("sendSms")
    SENDSMS("sendSms"),
    
    @JsonProperty("sendEmail")
    SENDEMAIL("sendEmail"),
    
    @JsonProperty("sendBoth")
    SENDBOTH("sendBoth");

    private String value;

    Canceled(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Canceled fromValue(String text) {
      for (Canceled b : Canceled.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final Canceled canceled;  // Default value is: null

  /**
   * Gets or Sets expired
   */
  public enum Expired {
    @JsonProperty("off")
    OFF("off"),
    
    @JsonProperty("sendSms")
    SENDSMS("sendSms"),
    
    @JsonProperty("sendEmail")
    SENDEMAIL("sendEmail"),
    
    @JsonProperty("sendBoth")
    SENDBOTH("sendBoth");

    private String value;

    Expired(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Expired fromValue(String text) {
      for (Expired b : Expired.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private final Expired expired;  // Default value is: null

  private NotificationsSetup(Builder builder) {
      request = builder.request;
      reminder = builder.reminder;
      signatureReceipt = builder.signatureReceipt;
      finalReceipt = builder.finalReceipt;
      canceled = builder.canceled;
      expired = builder.expired;
  }

      /**
      * Get request
      * @return request
      **/
      public Request getRequest() {return request;}

      /**
      * Get reminder
      * @return reminder
      **/
      public Reminder getReminder() {return reminder;}

      /**
      * Get signatureReceipt
      * @return signatureReceipt
      **/
      public SignatureReceipt getSignatureReceipt() {return signatureReceipt;}

      /**
      * Get finalReceipt
      * @return finalReceipt
      **/
      public FinalReceipt getFinalReceipt() {return finalReceipt;}

      /**
      * Get canceled
      * @return canceled
      **/
      public Canceled getCanceled() {return canceled;}

      /**
      * Get expired
      * @return expired
      **/
      public Expired getExpired() {return expired;}


  public static final class Builder {
      private Request request;
      private Reminder reminder;
      private SignatureReceipt signatureReceipt;
      private FinalReceipt finalReceipt;
      private Canceled canceled;
      private Expired expired;

    public Builder() {
    }

    public Builder(NotificationsSetup copy) {
        this.request = copy.getRequest();
        this.reminder = copy.getReminder();
        this.signatureReceipt = copy.getSignatureReceipt();
        this.finalReceipt = copy.getFinalReceipt();
        this.canceled = copy.getCanceled();
        this.expired = copy.getExpired();
    }

    public Builder withRequest(Request request) {
      this.request = request;
      return this;
    }

    public Builder withReminder(Reminder reminder) {
      this.reminder = reminder;
      return this;
    }

    public Builder withSignatureReceipt(SignatureReceipt signatureReceipt) {
      this.signatureReceipt = signatureReceipt;
      return this;
    }

    public Builder withFinalReceipt(FinalReceipt finalReceipt) {
      this.finalReceipt = finalReceipt;
      return this;
    }

    public Builder withCanceled(Canceled canceled) {
      this.canceled = canceled;
      return this;
    }

    public Builder withExpired(Expired expired) {
      this.expired = expired;
      return this;
    }


    public NotificationsSetup build() { return new NotificationsSetup(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationsSetup notificationsSetup = (NotificationsSetup) o;
    return Objects.equals(this.request, notificationsSetup.request) &&
        Objects.equals(this.reminder, notificationsSetup.reminder) &&
        Objects.equals(this.signatureReceipt, notificationsSetup.signatureReceipt) &&
        Objects.equals(this.finalReceipt, notificationsSetup.finalReceipt) &&
        Objects.equals(this.canceled, notificationsSetup.canceled) &&
        Objects.equals(this.expired, notificationsSetup.expired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, reminder, signatureReceipt, finalReceipt, canceled, expired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationsSetup {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    reminder: ").append(toIndentedString(reminder)).append("\n");
    sb.append("    signatureReceipt: ").append(toIndentedString(signatureReceipt)).append("\n");
    sb.append("    finalReceipt: ").append(toIndentedString(finalReceipt)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
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
