package io.idfy.notification;

import com.squareup.okhttp.HttpUrl;
import io.idfy.IdfyBaseService;
import io.idfy.OAuthScope;
import io.idfy.Urls;
import io.idfy.notification.models.*;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import java.util.List;

public class NotificationService extends IdfyBaseService {
    public NotificationService() {
        super();
    }

    public NotificationService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    /**
     * Clear all events
     * Clear all events for your account
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void eventsClear() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/events/clear";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        post(url.build());
    }

    /**
     * Clear all events (asynchronously)
     * Clear all events for your account
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> eventsClearAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/events/clear";

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build());
    }


    /**
     * List unhandled events
     * Retrieve up to 100 unhandled events for your account. After you retrieve this list the               events will be \"locked\" for 10 minutes to give you time to handle them. Please handle the events using one of the endpoints in this API to avoid retrieving the same events multiple times.
     * @param eventType Filter by event type (optional)
     * @param tags Filter the events by tags that was added to the document when you created it (comma-separated list) (optional)
     * @return EventDto
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventDto[] eventsGet(String eventType, String tags) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/events";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (eventType != null) {
            url.addQueryParameter("eventType", eventType.toString());}
        if (tags != null) {
            url.addQueryParameter("tags", tags.toString());}

        return get(url.build(), EventDto[].class);
    }

    /**
     * List unhandled events (asynchronously)
     * Retrieve up to 100 unhandled events for your account. After you retrieve this list the               events will be \"locked\" for 10 minutes to give you time to handle them. Please handle the events using one of the endpoints in this API to avoid retrieving the same events multiple times.
     * @param eventType Filter by event type (optional)
     * @param tags Filter the events by tags that was added to the document when you created it (comma-separated list) (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<EventDto[]> eventsGetAsync(String eventType, String tags) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/events";

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (eventType != null) {
            url.addQueryParameter("eventType", eventType.toString());}
        if (tags != null) {
            url.addQueryParameter("tags", tags.toString());}

        return getAsync(url.build(), EventDto[].class);
    }


    /**
     * List event types
     * Returns a list of all available event types.
     * @return EventTypeInfo
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventTypeInfo[] eventsGetEventTypes() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/events/types";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), EventTypeInfo[].class);
    }

    /**
     * List event types (asynchronously)
     * Returns a list of all available event types.
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<EventTypeInfo[]> eventsGetEventTypesAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/events/types";

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), EventTypeInfo[].class);
    }


    /**
     * Handle event
     * Mark the status of an event as handled to make sure you dont retrieve this event again.
     * @param eventId  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void eventsHandle(UUID eventId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/events/{eventId}/handle"
                .replaceAll("\\{" + "eventId" + "\\}", Encoder.escapeString(eventId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        post(url.build());
    }

    /**
     * Handle event (asynchronously)
     * Mark the status of an event as handled to make sure you dont retrieve this event again.
     * @param eventId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> eventsHandleAsync(UUID eventId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/events/{eventId}/handle"
                .replaceAll("\\{" + "eventId" + "\\}", Encoder.escapeString(eventId.toString()));

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build());
    }


    /**
     * Handle multiple events
     * Mark the status of a batch of events as handled to make sure you dont retrieve these events again.
     * @param eventIds List of event IDs to handle. (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void eventsHandleMany(List<UUID> eventIds) throws Exception, IdfyException {
        Object localVarPostBody = eventIds;
        // create path and map variables
        String localVarPath = "/events/handle";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        post(url.build(), eventIds);
    }

    /**
     * Handle multiple events (asynchronously)
     * Mark the status of a batch of events as handled to make sure you dont retrieve these events again.
     * @param eventIds List of event IDs to handle. (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> eventsHandleManyAsync(List<UUID> eventIds) throws Exception, IdfyException {
        Object localVarPostBody = eventIds;
        // create path and map variables
        String localVarPath = "/events/handle";

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), eventIds);
    }


    /**
     * Mock event
     * Creates a mock event with a sample payload. Can be used to test your event handling code.
     * @param request  (required)
     * @return EventDto
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventDto eventsMockEvent(MockEventRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/events/mock";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), request, EventDto.class);
    }

    /**
     * Mock event (asynchronously)
     * Creates a mock event with a sample payload. Can be used to test your event handling code.
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<EventDto> eventsMockEventAsync(MockEventRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/events/mock";

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), request, EventDto.class);
    }


    /**
     * Peek events
     * Peek top 100 unhandled events regardless if they are locked or not. Don't use this endpoint to handle events.
     * @param eventType Filter by event type (optional)
     * @param tags Filter the events by tags that was added to the document when you created it (comma-separated list) (optional)
     * @return EventDto
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventDto[] eventsPeek(String eventType, String tags) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/events/peek";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (eventType != null) {
            url.addQueryParameter("eventType", eventType.toString());}
        if (tags != null) {
            url.addQueryParameter("tags", tags.toString());}

        return get(url.build(), EventDto[].class);
    }

    /**
     * Peek events (asynchronously)
     * Peek top 100 unhandled events regardless if they are locked or not. Don't use this endpoint to handle events.
     * @param eventType Filter by event type (optional)
     * @param tags Filter the events by tags that was added to the document when you created it (comma-separated list) (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<EventDto[]> eventsPeekAsync(String eventType, String tags) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/events/peek";

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (eventType != null) {
            url.addQueryParameter("eventType", eventType.toString());}
        if (tags != null) {
            url.addQueryParameter("tags", tags.toString());}

        return getAsync(url.build(), EventDto[].class);
    }

    /**
     * Create webhook
     * Creates a new webhook.
     * @param newWebhook  (required)
     * @return WebhookDto
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookDto webhooksCreateWebhook(WebhookCreateDto newWebhook) throws Exception, IdfyException {
        Object localVarPostBody = newWebhook;
        // create path and map variables
        String localVarPath = "/webhooks";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), newWebhook, WebhookDto.class);
    }

    /**
     * Create webhook (asynchronously)
     * Creates a new webhook.
     * @param newWebhook  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<WebhookDto> webhooksCreateWebhookAsync(WebhookCreateDto newWebhook) throws Exception, IdfyException {
        Object localVarPostBody = newWebhook;
        // create path and map variables
        String localVarPath = "/webhooks";

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), newWebhook, WebhookDto.class);
    }


    /**
     * Delete webhook
     * Deletes the specified webhook.
     * @param id  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void webhooksDeleteWebhook(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/webhooks/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        delete(url.build());
    }

    /**
     * Delete webhook (asynchronously)
     * Deletes the specified webhook.
     * @param id  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> webhooksDeleteWebhookAsync(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/webhooks/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return deleteAsync(url.build());
    }


    /**
     * Retrieve webhook
     * Retrieves the details of a single webhook.
     * @param id  (required)
     * @return WebhookDto
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookDto webhooksGetSingleWebhook(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/webhooks/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), WebhookDto.class);
    }

    /**
     * Retrieve webhook (asynchronously)
     * Retrieves the details of a single webhook.
     * @param id  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<WebhookDto> webhooksGetSingleWebhookAsync(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/webhooks/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), WebhookDto.class);
    }


    /**
     * List webhook deliveries
     * Returns the 10 most recent delivery attempts for a single webhook.
     * @param id  (required)
     * @return WebhookDeliveryDto
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookDeliveryDto webhooksGetWebhookDeliveries(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/webhooks/{id}/deliveries"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), WebhookDeliveryDto.class);
    }

    /**
     * List webhook deliveries (asynchronously)
     * Returns the 10 most recent delivery attempts for a single webhook.
     * @param id  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<WebhookDeliveryDto> webhooksGetWebhookDeliveriesAsync(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/webhooks/{id}/deliveries"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), WebhookDeliveryDto.class);
    }


    /**
     * List webhooks
     * Returns a list of all your webhooks.
     * @return WebhookDto
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookDto[] webhooksListWebhooks() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/webhooks";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), WebhookDto[].class);
    }

    /**
     * List webhooks (asynchronously)
     * Returns a list of all your webhooks.
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<WebhookDto[]> webhooksListWebhooksAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/webhooks";

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), WebhookDto[].class);
    }


    /**
     * Ping webhook
     * Triggers a ping event to be sent to the webhook.
     * @param id  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void webhooksPingWebhook(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/webhooks/{id}/ping"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        post(url.build());
    }

    /**
     * Ping webhook (asynchronously)
     * Triggers a ping event to be sent to the webhook.
     * @param id  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> webhooksPingWebhookAsync(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/webhooks/{id}/ping"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build());
    }


    /**
     * Update webhook
     * Updates the specified webhook with the parameters passed.  Any parameters not provided will be left unchanged.
     * @param id  (required)
     * @param updatedWebhook  (required)
     * @return WebhookDto
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookDto webhooksUpdateWebhook(Integer id, WebhookUpdateDto updatedWebhook) throws Exception, IdfyException {
        Object localVarPostBody = updatedWebhook;
        // create path and map variables
        String localVarPath = "/webhooks/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patch(url.build(), updatedWebhook, WebhookDto.class);
    }

    /**
     * Update webhook (asynchronously)
     * Updates the specified webhook with the parameters passed.  Any parameters not provided will be left unchanged.
     * @param id  (required)
     * @param updatedWebhook  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<WebhookDto> webhooksUpdateWebhookAsync(Integer id, WebhookUpdateDto updatedWebhook) throws Exception, IdfyException {
        Object localVarPostBody = updatedWebhook;
        // create path and map variables
        String localVarPath = "/webhooks/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.NOTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patchAsync(url.build(), updatedWebhook, WebhookDto.class);
    }
}