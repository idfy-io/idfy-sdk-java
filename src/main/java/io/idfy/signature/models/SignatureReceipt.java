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
import io.idfy.signature.models.Email;
import io.idfy.signature.models.SMS;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Email/SMS notifications as a receipt for a successful signature.
 */
@JsonDeserialize(builder = SignatureReceipt.Builder.class)
public class SignatureReceipt  implements Serializable {
  /**
   * A list of custom email texts to use for the notification. Default texts will be used if not specified.
   */
  private final List<Email> email;  // Default value is: new ArrayList<>()

  /**
   * A list of custom SMS texts to use for the notification. Default texts will be used if not specified.
   */
  private final List<SMS> sms;  // Default value is: new ArrayList<>()

  private SignatureReceipt(Builder builder) {
      email = builder.email;
      sms = builder.sms;
  }

      /**
      * A list of custom email texts to use for the notification. Default texts will be used if not specified.
      * @return email
      **/
      public List<Email> getEmail() {return email;}

      /**
      * A list of custom SMS texts to use for the notification. Default texts will be used if not specified.
      * @return sms
      **/
      public List<SMS> getSms() {return sms;}


  public static final class Builder {
      private List<Email> email;
      private List<SMS> sms;

    public Builder() {
    }

    public Builder(SignatureReceipt copy) {
        this.email = copy.getEmail();
        this.sms = copy.getSms();
    }

    public Builder withEmail(List<Email> email) {
      this.email = email;
      return this;
    }

    public Builder addEmailItem(Email emailItem) {
      if (this.email == null) {
        this.email = new ArrayList<>();
      }
      this.email.add(emailItem);
      return this;
    }

    public Builder withSms(List<SMS> sms) {
      this.sms = sms;
      return this;
    }

    public Builder addSmsItem(SMS smsItem) {
      if (this.sms == null) {
        this.sms = new ArrayList<>();
      }
      this.sms.add(smsItem);
      return this;
    }


    public SignatureReceipt build() { return new SignatureReceipt(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureReceipt signatureReceipt = (SignatureReceipt) o;
    return Objects.equals(this.email, signatureReceipt.email) &&
        Objects.equals(this.sms, signatureReceipt.sms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, sms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureReceipt {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
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
