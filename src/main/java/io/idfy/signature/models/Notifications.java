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
import io.idfy.signature.models.NotificationsSetup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * Email/SMS notification settings for the signer.
 */
@JsonDeserialize(builder = Notifications.Builder.class)
public class Notifications  implements Serializable {
  private final NotificationsSetup setup;  // Default value is: null

  /**
   * If you create your own notifications texts (See the root object -&gt; Notification), you can create your own merge fields with your own keys.   You can then specify the text you want to insert in these fields per signer in this dictionary. Set the dictionary key to the same value as the merge field value in your notification text, and the value to the text you want us to merge in.
   */
  private final Map<String, String> mergeFields;  // Default value is: new HashMap<>()

  private Notifications(Builder builder) {
      setup = builder.setup;
      mergeFields = builder.mergeFields;
  }

      /**
      * Get setup
      * @return setup
      **/
      public NotificationsSetup getSetup() {return setup;}

      /**
      * If you create your own notifications texts (See the root object -&gt; Notification), you can create your own merge fields with your own keys.   You can then specify the text you want to insert in these fields per signer in this dictionary. Set the dictionary key to the same value as the merge field value in your notification text, and the value to the text you want us to merge in.
      * @return mergeFields
      **/
      public Map<String, String> getMergeFields() {return mergeFields;}


  public static final class Builder {
      private NotificationsSetup setup;
      private Map<String, String> mergeFields;

    public Builder() {
    }

    public Builder(Notifications copy) {
        this.setup = copy.getSetup();
        this.mergeFields = copy.getMergeFields();
    }

    public Builder withSetup(NotificationsSetup setup) {
      this.setup = setup;
      return this;
    }

    public Builder withMergeFields(Map<String, String> mergeFields) {
      this.mergeFields = mergeFields;
      return this;
    }

    public Builder putMergeFieldsItem(String key, String mergeFieldsItem) {
      if (this.mergeFields == null) {
        this.mergeFields = new HashMap<>();
      }
      this.mergeFields.put(key, mergeFieldsItem);
      return this;
    }


    public Notifications build() { return new Notifications(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notifications notifications = (Notifications) o;
    return Objects.equals(this.setup, notifications.setup) &&
        Objects.equals(this.mergeFields, notifications.mergeFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setup, mergeFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notifications {\n");
    
    sb.append("    setup: ").append(toIndentedString(setup)).append("\n");
    sb.append("    mergeFields: ").append(toIndentedString(mergeFields)).append("\n");
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
