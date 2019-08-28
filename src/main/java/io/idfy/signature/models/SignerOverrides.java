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
import io.idfy.signature.models.Mobile;
import java.io.Serializable;

/**
 * SignerOverrides
 */
@JsonDeserialize(builder = SignerOverrides.Builder.class)
public class SignerOverrides  implements Serializable {
  /**
   * Set a new email address on the signer (all fututre notifications to this specific signer will be sent to this email)
   */
  private final String emailOverride;  // Default value is: null

  private final Mobile mobileOverride;  // Default value is: null

  private SignerOverrides(Builder builder) {
      emailOverride = builder.emailOverride;
      mobileOverride = builder.mobileOverride;
  }

      /**
      * Set a new email address on the signer (all fututre notifications to this specific signer will be sent to this email)
      * @return emailOverride
      **/
      public String getEmailOverride() {return emailOverride;}

      /**
      * Get mobileOverride
      * @return mobileOverride
      **/
      public Mobile getMobileOverride() {return mobileOverride;}


  public static final class Builder {
      private String emailOverride;
      private Mobile mobileOverride;

    public Builder() {
    }

    public Builder(SignerOverrides copy) {
        this.emailOverride = copy.getEmailOverride();
        this.mobileOverride = copy.getMobileOverride();
    }

    public Builder withEmailOverride(String emailOverride) {
      this.emailOverride = emailOverride;
      return this;
    }

    public Builder withMobileOverride(Mobile mobileOverride) {
      this.mobileOverride = mobileOverride;
      return this;
    }


    public SignerOverrides build() { return new SignerOverrides(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignerOverrides signerOverrides = (SignerOverrides) o;
    return Objects.equals(this.emailOverride, signerOverrides.emailOverride) &&
        Objects.equals(this.mobileOverride, signerOverrides.mobileOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailOverride, mobileOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignerOverrides {\n");
    
    sb.append("    emailOverride: ").append(toIndentedString(emailOverride)).append("\n");
    sb.append("    mobileOverride: ").append(toIndentedString(mobileOverride)).append("\n");
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
