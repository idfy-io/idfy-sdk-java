/*
 * Idfy Secure Share
 * This endpoints enables secure sharing with multiple e-ids offered for login
 *
 * OpenAPI spec version: v1
 * 
 */


package io.idfy.share;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.share.models.Recipient;
import io.idfy.share.models.RecipientResponse;
import io.idfy.share.models.UpdateRecipent;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for RecipientsService
 */

public class RecipientsServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final ShareService api = new ShareService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create recipient
     *
     * Creates a new recipient
     */
    @Test
    public void createRecipientTest() throws IdfyException, Exception {
        String id = new String("123");
        Recipient newRecipient =  new Recipient.Builder().build();
        RecipientResponse response = api.createRecipient(id, newRecipient);
        assertNotNull(response);
    }
    
    /**
     * Delete recipient
     *
     * 
     */
    @Test
    public void deleteRecipientTest() throws IdfyException, Exception {
        String id = new String("123");
        String recipientId = new String("123");
        api.deleteRecipient(id, recipientId);
    }
    
    /**
     * List recipients
     *
     * Retrieves a list of all recipients on bucket
     */
    @Disabled("Example contains a single item instead of a list containing a single item")
    @Test
    public void listRecipientsTest() throws IdfyException, Exception {
        String id = new String("123");
        RecipientResponse[] response = api.listRecipients(id);
        assertNotNull(response);
    }
    
    /**
     * Retrieve recipient
     *
     * Retrieves a single recipient
     */
    @Test
    public void retrieveRecipientTest() throws IdfyException, Exception {
        String id = new String("123");
        String recipientId = new String("123");
        RecipientResponse response = api.retrieveRecipient(id, recipientId);
        assertNotNull(response);
    }
    
    /**
     * Update recipient
     *
     * Updates specified recipient
     */
    @Test
    public void updateRecipientTest() throws IdfyException, Exception {
        String id = new String("123");
        String recipientId = new String("123");
        UpdateRecipent updatedRecipient =  new UpdateRecipent.Builder().build();
        RecipientResponse response = api.updateRecipient(id, recipientId, updatedRecipient);
        assertNotNull(response);
    }
    

}
