/*
 * Notification
 * This endpoint lets you manage events that are raised when something happens in your account.  
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */


package io.idfy.notification;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.notification.models.WebhookCreateDto;
import io.idfy.notification.models.WebhookDeliveryDto;
import io.idfy.notification.models.WebhookDto;
import io.idfy.notification.models.WebhookUpdateDto;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for WebhooksService
 */

public class WebhooksServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final NotificationService api = new NotificationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create webhook
     *
     * Creates a new webhook.
     */
    @Test
    public void webhooksCreateWebhookTest() throws IdfyException, Exception {
        WebhookCreateDto newWebhook =  new WebhookCreateDto.Builder().build();
        WebhookDto response = api.webhooksCreateWebhook(newWebhook);
        assertNotNull(response);
    }
    
    /**
     * Delete webhook
     *
     * Deletes the specified webhook.
     */
    @Test
    public void webhooksDeleteWebhookTest() throws IdfyException, Exception {
        Integer id = 123;
        api.webhooksDeleteWebhook(id);
    }
    
    /**
     * Retrieve webhook
     *
     * Retrieves the details of a single webhook.
     */
    @Test
    public void webhooksGetSingleWebhookTest() throws IdfyException, Exception {
        Integer id = 123;
        WebhookDto response = api.webhooksGetSingleWebhook(id);
        assertNotNull(response);
    }
    
    /**
     * List webhook deliveries
     *
     * Returns the 10 most recent delivery attempts for a single webhook.
     */
    @Test
    public void webhooksGetWebhookDeliveriesTest() throws IdfyException, Exception {
        Integer id = 123;
        WebhookDeliveryDto response = api.webhooksGetWebhookDeliveries(id);
        assertNotNull(response);
    }
    
    /**
     * List webhooks
     *
     * Returns a list of all your webhooks.
     */
    @Test
    public void webhooksListWebhooksTest() throws IdfyException, Exception {
        WebhookDto[] response = api.webhooksListWebhooks();
        assertNotNull(response);
    }
    
    /**
     * Ping webhook
     *
     * Triggers a ping event to be sent to the webhook.
     */
    @Test
    public void webhooksPingWebhookTest() throws IdfyException, Exception {
        Integer id = 123;
        api.webhooksPingWebhook(id);
    }
    
    /**
     * Update webhook
     *
     * Updates the specified webhook with the parameters passed.  Any parameters not provided will be left unchanged.
     */
    @Test
    public void webhooksUpdateWebhookTest() throws IdfyException, Exception {
        Integer id = 123;
        WebhookUpdateDto updatedWebhook =  new WebhookUpdateDto.Builder().build();
        WebhookDto response = api.webhooksUpdateWebhook(id, updatedWebhook);
        assertNotNull(response);
    }
    

}
