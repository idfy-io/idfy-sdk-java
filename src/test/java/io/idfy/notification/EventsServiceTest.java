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
import io.idfy.notification.models.EventDto;
import io.idfy.notification.models.EventTypeInfo;
import io.idfy.notification.models.MockEventRequest;
import java.util.UUID;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for EventsService
 */

public class EventsServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final NotificationService api = new NotificationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Clear all events
     *
     * Clear all events for your account
     */
    @Test
    public void eventsClearTest() throws IdfyException, Exception {
        api.eventsClear();
    }
    
    /**
     * List unhandled events
     *
     * Retrieve up to 100 unhandled events for your account. After you retrieve this list the               events will be \"locked\" for 10 minutes to give you time to handle them. Please handle the events using one of the endpoints in this API to avoid retrieving the same events multiple times.
     */
    @Test
    public void eventsGetTest() throws IdfyException, Exception {
        String eventType = new String("123");
        String tags = new String("123");
        EventDto[] response = api.eventsGet(eventType, tags);
        assertNotNull(response);
    }
    
    /**
     * List event types
     *
     * Returns a list of all available event types.
     */
    @Test
    public void eventsGetEventTypesTest() throws IdfyException, Exception {
        EventTypeInfo[] response = api.eventsGetEventTypes();
        assertNotNull(response);
    }
    
    /**
     * Handle event
     *
     * Mark the status of an event as handled to make sure you dont retrieve this event again.
     */
    @Test
    public void eventsHandleTest() throws IdfyException, Exception {
        UUID eventId = UUID.randomUUID();
        api.eventsHandle(eventId);
    }
    
    /**
     * Handle multiple events
     *
     * Mark the status of a batch of events as handled to make sure you dont retrieve these events again.
     */
    @Test
    public void eventsHandleManyTest() throws IdfyException, Exception {
        List<UUID> eventIds =  new ArrayList<UUID>();
        api.eventsHandleMany(eventIds);
    }
    
    /**
     * Mock event
     *
     * Creates a mock event with a sample payload. Can be used to test your event handling code.
     */
    @Test
    public void eventsMockEventTest() throws IdfyException, Exception {
        MockEventRequest request =  new MockEventRequest.Builder().build();
        EventDto response = api.eventsMockEvent(request);
        assertNotNull(response);
    }
    
    /**
     * Peek events
     *
     * Peek top 100 unhandled events regardless if they are locked or not. Don't use this endpoint to handle events.
     */
    @Test
    public void eventsPeekTest() throws IdfyException, Exception {
        String eventType = new String("123");
        String tags = new String("123");
        EventDto[] response = api.eventsPeek(eventType, tags);
        assertNotNull(response);
    }
    

}
