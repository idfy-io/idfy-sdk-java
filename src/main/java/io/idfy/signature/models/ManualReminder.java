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
import io.idfy.signature.models.SignerOverrides;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * ManualReminder
 */
@JsonDeserialize(builder = ManualReminder.Builder.class)
public class ManualReminder  implements Serializable {
  /**
   * Set what kind of reminders to send
   */
  public enum NotificationSetting {
    @JsonProperty("off")
    OFF("off"),
    
    @JsonProperty("sendSms")
    SENDSMS("sendSms"),
    
    @JsonProperty("sendEmail")
    SENDEMAIL("sendEmail"),
    
    @JsonProperty("sendBoth")
    SENDBOTH("sendBoth");

    private String value;

    NotificationSetting(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationSetting fromValue(String text) {
      for (NotificationSetting b : NotificationSetting.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  /**
   * Set what kind of reminders to send
   */
  private final NotificationSetting notificationSetting;  // Default value is: null

  /**
   * Optional: Define the signers that should receive this reminder (if not signed). Dictionary with signer id as key, you can ovveride the signer email/phone as value
   */
  private final Map<String, SignerOverrides> signers;  // Default value is: new HashMap<>()

  private ManualReminder(Builder builder) {
      notificationSetting = builder.notificationSetting;
      signers = builder.signers;
  }

      /**
      * Set what kind of reminders to send
      * @return notificationSetting
      **/
      public NotificationSetting getNotificationSetting() {return notificationSetting;}

      /**
      * Optional: Define the signers that should receive this reminder (if not signed). Dictionary with signer id as key, you can ovveride the signer email/phone as value
      * @return signers
      **/
      public Map<String, SignerOverrides> getSigners() {return signers;}


  public static final class Builder {
      private NotificationSetting notificationSetting;
      private Map<String, SignerOverrides> signers;

    public Builder() {
    }

    public Builder(ManualReminder copy) {
        this.notificationSetting = copy.getNotificationSetting();
        this.signers = copy.getSigners();
    }

    public Builder withNotificationSetting(NotificationSetting notificationSetting) {
      this.notificationSetting = notificationSetting;
      return this;
    }

    public Builder withSigners(Map<String, SignerOverrides> signers) {
      this.signers = signers;
      return this;
    }

    public Builder putSignersItem(String key, SignerOverrides signersItem) {
      if (this.signers == null) {
        this.signers = new HashMap<>();
      }
      this.signers.put(key, signersItem);
      return this;
    }


    public ManualReminder build() { return new ManualReminder(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualReminder manualReminder = (ManualReminder) o;
    return Objects.equals(this.notificationSetting, manualReminder.notificationSetting) &&
        Objects.equals(this.signers, manualReminder.signers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationSetting, signers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualReminder {\n");
    
    sb.append("    notificationSetting: ").append(toIndentedString(notificationSetting)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
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
