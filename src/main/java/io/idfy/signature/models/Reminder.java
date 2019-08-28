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
 * Email/SMS notifications reminding the signers that they have an unsigned document.
 */
@JsonDeserialize(builder = Reminder.Builder.class)
public class Reminder  implements Serializable {
  /**
   * Defines a chron expression that control the interval of the reminders (Use UTC time). We use Quartz cron expressions, read more about it here: http://www.quartz-scheduler.org/documentation/quartz-2.x/tutorials/crontrigger.html.
   */
  private final String chronSchedule;  // Default value is: null

  /**
   * The maximum number of reminders to be sent for each signer.
   */
  private final Integer maxReminders;  // Default value is: null

  /**
   * A list of custom email texts to use for the notification. Default texts will be used if not specified.
   */
  private final List<Email> email;  // Default value is: new ArrayList<>()

  /**
   * A list of custom SMS texts to use for the notification. Default texts will be used if not specified.
   */
  private final List<SMS> sms;  // Default value is: new ArrayList<>()

  private Reminder(Builder builder) {
      chronSchedule = builder.chronSchedule;
      maxReminders = builder.maxReminders;
      email = builder.email;
      sms = builder.sms;
  }

      /**
      * Defines a chron expression that control the interval of the reminders (Use UTC time). We use Quartz cron expressions, read more about it here: http://www.quartz-scheduler.org/documentation/quartz-2.x/tutorials/crontrigger.html.
      * @return chronSchedule
      **/
      public String getChronSchedule() {return chronSchedule;}

      /**
      * The maximum number of reminders to be sent for each signer.
      * @return maxReminders
      **/
      public Integer getMaxReminders() {return maxReminders;}

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
      private String chronSchedule;
      private Integer maxReminders;
      private List<Email> email;
      private List<SMS> sms;

    public Builder() {
    }

    public Builder(Reminder copy) {
        this.chronSchedule = copy.getChronSchedule();
        this.maxReminders = copy.getMaxReminders();
        this.email = copy.getEmail();
        this.sms = copy.getSms();
    }

    public Builder withChronSchedule(String chronSchedule) {
      this.chronSchedule = chronSchedule;
      return this;
    }

    public Builder withMaxReminders(Integer maxReminders) {
      this.maxReminders = maxReminders;
      return this;
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


    public Reminder build() { return new Reminder(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reminder reminder = (Reminder) o;
    return Objects.equals(this.chronSchedule, reminder.chronSchedule) &&
        Objects.equals(this.maxReminders, reminder.maxReminders) &&
        Objects.equals(this.email, reminder.email) &&
        Objects.equals(this.sms, reminder.sms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chronSchedule, maxReminders, email, sms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reminder {\n");
    
    sb.append("    chronSchedule: ").append(toIndentedString(chronSchedule)).append("\n");
    sb.append("    maxReminders: ").append(toIndentedString(maxReminders)).append("\n");
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
