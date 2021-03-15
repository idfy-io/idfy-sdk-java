package io.idfy.share;

import okhttp3.HttpUrl;
import io.idfy.IdfyBaseService;
import io.idfy.OAuthScope;
import io.idfy.Urls;
import io.idfy.share.models.*;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import java.util.List;

public class ShareService extends IdfyBaseService {
    public ShareService() {
        super();
    }

    public ShareService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    /**
     * Create recipient
     * Creates a new recipient
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @param newRecipient  (optional)
     * @return RecipientResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RecipientResponse createRecipient(String id, Recipient newRecipient) throws Exception, IdfyException {
        Object localVarPostBody = newRecipient;
        // create path and map variables
        String localVarPath = "/buckets/{id}/recipients"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), newRecipient, RecipientResponse.class);
    }

    /**
     * Create recipient (asynchronously)
     * Creates a new recipient
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @param newRecipient  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<RecipientResponse> createRecipientAsync(String id, Recipient newRecipient) throws Exception, IdfyException {
        Object localVarPostBody = newRecipient;
        // create path and map variables
        String localVarPath = "/buckets/{id}/recipients"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), newRecipient, RecipientResponse.class);
    }


    /**
     * Delete recipient
     *
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @param recipientId The unique identifier for recipient (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteRecipient(String id, String recipientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}/recipients/{recipientId}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()))
                .replaceAll("\\{" + "recipientId" + "\\}", Encoder.escapeString(recipientId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        delete(url.build());
    }

    /**
     * Delete recipient (asynchronously)
     *
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @param recipientId The unique identifier for recipient (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> deleteRecipientAsync(String id, String recipientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}/recipients/{recipientId}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()))
                .replaceAll("\\{" + "recipientId" + "\\}", Encoder.escapeString(recipientId.toString()));

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return deleteAsync(url.build());
    }


    /**
     * List recipients
     * Retrieves a list of all recipients on bucket
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @return RecipientResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RecipientResponse[] listRecipients(String id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}/recipients"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), RecipientResponse[].class);
    }

    /**
     * List recipients (asynchronously)
     * Retrieves a list of all recipients on bucket
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<RecipientResponse[]> listRecipientsAsync(String id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}/recipients"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), RecipientResponse[].class);
    }


    /**
     * Retrieve recipient
     * Retrieves a single recipient
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @param recipientId The unique identifier for the recipient (required)
     * @return RecipientResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RecipientResponse retrieveRecipient(String id, String recipientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}/recipients/{recipientId}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()))
                .replaceAll("\\{" + "recipientId" + "\\}", Encoder.escapeString(recipientId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), RecipientResponse.class);
    }

    /**
     * Retrieve recipient (asynchronously)
     * Retrieves a single recipient
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @param recipientId The unique identifier for the recipient (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<RecipientResponse> retrieveRecipientAsync(String id, String recipientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}/recipients/{recipientId}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()))
                .replaceAll("\\{" + "recipientId" + "\\}", Encoder.escapeString(recipientId.toString()));

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), RecipientResponse.class);
    }


    /**
     * Update recipient
     * Updates specified recipient
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @param recipientId The unique identifier for the recipient (required)
     * @param updatedRecipient  (optional)
     * @return RecipientResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RecipientResponse updateRecipient(String id, String recipientId, UpdateRecipent updatedRecipient) throws Exception, IdfyException {
        Object localVarPostBody = updatedRecipient;
        // create path and map variables
        String localVarPath = "/buckets/{id}/recipients/{recipientId}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()))
                .replaceAll("\\{" + "recipientId" + "\\}", Encoder.escapeString(recipientId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patch(url.build(), updatedRecipient, RecipientResponse.class);
    }

    /**
     * Update recipient (asynchronously)
     * Updates specified recipient
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @param recipientId The unique identifier for the recipient (required)
     * @param updatedRecipient  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<RecipientResponse> updateRecipientAsync(String id, String recipientId, UpdateRecipent updatedRecipient) throws Exception, IdfyException {
        Object localVarPostBody = updatedRecipient;
        // create path and map variables
        String localVarPath = "/buckets/{id}/recipients/{recipientId}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()))
                .replaceAll("\\{" + "recipientId" + "\\}", Encoder.escapeString(recipientId.toString()));

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patchAsync(url.build(), updatedRecipient, RecipientResponse.class);
    }

    /**
     * Create secure bucket
     * Creates a new secure bucket. In the response you will receive an id to retrieve info about the share at a later time and upload content.
     * @param request  (optional)
     * @return ShareResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShareResponse createSecureBucket(CreateShareRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/buckets";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), request, ShareResponse.class);
    }

    /**
     * Create secure bucket (asynchronously)
     * Creates a new secure bucket. In the response you will receive an id to retrieve info about the share at a later time and upload content.
     * @param request  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<ShareResponse> createSecureBucketAsync(CreateShareRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/buckets";

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), request, ShareResponse.class);
    }


    /**
     * Delete secure bucket
     * Deletes the specified secure bucket.
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSecureBucket(String id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        delete(url.build());
    }

    /**
     * Delete secure bucket (asynchronously)
     * Deletes the specified secure bucket.
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> deleteSecureBucketAsync(String id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return deleteAsync(url.build());
    }


    /**
     * List secure buckets
     * Returns a list of all your secure buckets
     * @return ShareResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShareResponse[] listSecureBuckets() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), ShareResponse[].class);
    }

    /**
     * List secure buckets (asynchronously)
     * Returns a list of all your secure buckets
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<ShareResponse[]> listSecureBucketsAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets";

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), ShareResponse[].class);
    }


    /**
     * Retrieve secure bucket
     * Retrieves details of a single secure bucket
     * @param id The unique identifier returned after the creation of the secure share (required)
     * @return ShareResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShareResponse retrieveSecureBucket(String id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), ShareResponse.class);
    }

    /**
     * Retrieve secure bucket (asynchronously)
     * Retrieves details of a single secure bucket
     * @param id The unique identifier returned after the creation of the secure share (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<ShareResponse> retrieveSecureBucketAsync(String id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), ShareResponse.class);
    }


    /**
     * Update secure bucket
     *
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @param request  (optional)
     * @return ShareResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShareResponse updateSecureBucket(String id, UpdateShareRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/buckets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patch(url.build(), request, ShareResponse.class);
    }

    /**
     * Update secure bucket (asynchronously)
     *
     * @param id The unique identifier returned after the creation of the secure bucket (required)
     * @param request  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<ShareResponse> updateSecureBucketAsync(String id, UpdateShareRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/buckets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patchAsync(url.build(), request, ShareResponse.class);
    }


    /**
     * Upload content
     * Upload content to an existing bucket. The content will be deleted when the secure bucket expires. The content type has to be multipart/form-data;
     * @param id The unique identifier returned after the creation of the secure share (required)
     * @param contentId The unique identifier specified during creation for content (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void uploadContent(String id, String contentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}/upload/{contentId}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()))
                .replaceAll("\\{" + "contentId" + "\\}", Encoder.escapeString(contentId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        post(url.build());
    }

    /**
     * Upload content (asynchronously)
     * Upload content to an existing bucket. The content will be deleted when the secure bucket expires. The content type has to be multipart/form-data;
     * @param id The unique identifier returned after the creation of the secure share (required)
     * @param contentId The unique identifier specified during creation for content (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> uploadContentAsync(String id, String contentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/buckets/{id}/upload/{contentId}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()))
                .replaceAll("\\{" + "contentId" + "\\}", Encoder.escapeString(contentId.toString()));

        localVarPath = Urls.SHARE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build());
    }
}
