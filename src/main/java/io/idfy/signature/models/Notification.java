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
import io.idfy.signature.models.CanceledReceipt;
import io.idfy.signature.models.ExpiredReceipt;
import io.idfy.signature.models.FinalReceipt;
import io.idfy.signature.models.Reminder;
import io.idfy.signature.models.SignRequest;
import io.idfy.signature.models.SignatureReceipt;
import java.io.Serializable;

/**
 * Settings for custom notification texts. Remark: Also requires you to setup notifications for each signer you want to notify.
 */
@JsonDeserialize(builder = Notification.Builder.class)
public class Notification  implements Serializable {
  private final SignRequest signRequest;  // Default value is: null

  private final Reminder reminder;  // Default value is: null

  private final SignatureReceipt signatureReceipt;  // Default value is: null

  private final FinalReceipt finalReceipt;  // Default value is: null

  private final CanceledReceipt canceledReceipt;  // Default value is: null

  private final ExpiredReceipt expiredReceipt;  // Default value is: null

  private Notification(Builder builder) {
      signRequest = builder.signRequest;
      reminder = builder.reminder;
      signatureReceipt = builder.signatureReceipt;
      finalReceipt = builder.finalReceipt;
      canceledReceipt = builder.canceledReceipt;
      expiredReceipt = builder.expiredReceipt;
  }

      /**
      * Get signRequest
      * @return signRequest
      **/
      public SignRequest getSignRequest() {return signRequest;}

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
      * Get canceledReceipt
      * @return canceledReceipt
      **/
      public CanceledReceipt getCanceledReceipt() {return canceledReceipt;}

      /**
      * Get expiredReceipt
      * @return expiredReceipt
      **/
      public ExpiredReceipt getExpiredReceipt() {return expiredReceipt;}


  public static final class Builder {
      private SignRequest signRequest;
      private Reminder reminder;
      private SignatureReceipt signatureReceipt;
      private FinalReceipt finalReceipt;
      private CanceledReceipt canceledReceipt;
      private ExpiredReceipt expiredReceipt;

    public Builder() {
    }

    public Builder(Notification copy) {
        this.signRequest = copy.getSignRequest();
        this.reminder = copy.getReminder();
        this.signatureReceipt = copy.getSignatureReceipt();
        this.finalReceipt = copy.getFinalReceipt();
        this.canceledReceipt = copy.getCanceledReceipt();
        this.expiredReceipt = copy.getExpiredReceipt();
    }

    public Builder withSignRequest(SignRequest signRequest) {
      this.signRequest = signRequest;
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

    public Builder withCanceledReceipt(CanceledReceipt canceledReceipt) {
      this.canceledReceipt = canceledReceipt;
      return this;
    }

    public Builder withExpiredReceipt(ExpiredReceipt expiredReceipt) {
      this.expiredReceipt = expiredReceipt;
      return this;
    }


    public Notification build() { return new Notification(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.signRequest, notification.signRequest) &&
        Objects.equals(this.reminder, notification.reminder) &&
        Objects.equals(this.signatureReceipt, notification.signatureReceipt) &&
        Objects.equals(this.finalReceipt, notification.finalReceipt) &&
        Objects.equals(this.canceledReceipt, notification.canceledReceipt) &&
        Objects.equals(this.expiredReceipt, notification.expiredReceipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signRequest, reminder, signatureReceipt, finalReceipt, canceledReceipt, expiredReceipt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    signRequest: ").append(toIndentedString(signRequest)).append("\n");
    sb.append("    reminder: ").append(toIndentedString(reminder)).append("\n");
    sb.append("    signatureReceipt: ").append(toIndentedString(signatureReceipt)).append("\n");
    sb.append("    finalReceipt: ").append(toIndentedString(finalReceipt)).append("\n");
    sb.append("    canceledReceipt: ").append(toIndentedString(canceledReceipt)).append("\n");
    sb.append("    expiredReceipt: ").append(toIndentedString(expiredReceipt)).append("\n");
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
