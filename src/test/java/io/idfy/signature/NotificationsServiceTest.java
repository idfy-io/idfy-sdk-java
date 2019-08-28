/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */


package io.idfy.signature;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.signature.models.ManualReminder;
import io.idfy.signature.models.NotificationLogItem;
import java.util.UUID;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for NotificationsService
 */

public class NotificationsServiceTest {

    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final SignatureService api = new SignatureService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * List notifications
     *
     * Returns a list of all notifications that has been sent / attempted sent for a document
     */
    @Test
    public void notificationsListTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        NotificationLogItem[] response = api.notificationsList(documentId);
        assertNotNull(response);
    }
    
    /**
     * Send reminders
     *
     * If you want to send out reminders to all/some of the signers manually you can do it here.
     */
    @Test
    public void notificationsSendManualReminderTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        ManualReminder manualReminder =  new ManualReminder.Builder().build();
        ManualReminder response = api.notificationsSendManualReminder(documentId, manualReminder);
        assertNotNull(response);
    }
    

}
