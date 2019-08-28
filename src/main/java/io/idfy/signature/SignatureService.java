package io.idfy.signature;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.HttpUrl;

import io.idfy.OAuthScope;
import io.idfy.IdfyBaseService;
import io.idfy.Urls;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;
import io.idfy.signature.models.*;

import java.io.InputStream;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class SignatureService extends IdfyBaseService {
    public SignatureService() {
        super();
    }

    public SignatureService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    // DocumentsApi

    /**
     * Cancel document
     *
     * @param documentId  (required)
     * @param reason  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void documentsCancel(UUID documentId, String reason) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/cancel"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (reason != null) {
            url.addQueryParameter("reason", reason.toString());}

        post(url.build());
    }

    /**
     * Cancel document (asynchronously)
     *
     * @param documentId  (required)
     * @param reason  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> documentsCancelAsync(UUID documentId, String reason) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/cancel"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (reason != null) {
            url.addQueryParameter("reason", reason.toString());}

        return postAsync(url.build());
    }


    /**
     * Create document
     * Creates a new document. In the response you will receive a document ID to retrieve info about the document at a later time.   You also receive a URL and unique identifier per signer.
     * @param request  (required)
     * @return CreateDocumentResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateDocumentResponse documentsCreate(CreateDocumentRequestWrapper request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/documents";

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), request, CreateDocumentResponse.class);
    }

    /**
     * Create document (asynchronously)
     * Creates a new document. In the response you will receive a document ID to retrieve info about the document at a later time.   You also receive a URL and unique identifier per signer.
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CreateDocumentResponse> documentsCreateAsync(CreateDocumentRequestWrapper request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/documents";

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), request, CreateDocumentResponse.class);
    }


    /**
     * Retrieve document
     * Retrieves details of a single document.
     * @param documentId  (required)
     * @return CreateDocumentResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateDocumentResponse documentsGet(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), CreateDocumentResponse.class);
    }

    /**
     * Retrieve document (asynchronously)
     * Retrieves details of a single document.
     * @param documentId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CreateDocumentResponse> documentsGetAsync(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), CreateDocumentResponse.class);
    }


    /**
     * List document summaries
     * Queries your documents using the provided parameters.
     * @param externalId Documents external id (optional)
     * @param signerId Signer Id (optional)
     * @param externalSignerId External signer Id (optional)
     * @param fromDate Documents created from date (ticks) (optional)
     * @param toDate Documents created to date (ticks) (optional)
     * @param lastUpdated Documents updated after this date (ticks) (optional)
     * @param signedDate Documents signed after this date (ticks) (optional)
     * @param nameOfSigner Name of signer (optional)
     * @param title  (optional)
     * @param status Document status (optional)
     * @param tags Document tags (optional)
     * @param offset Used for paging (will be automatically set in response links) (optional)
     * @param limit Set how many results you want per page (max/default 100) (optional)
     * @param accountId  (optional)
     * @return CollectionWithPagingDocumentSummary
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionWithPagingDocumentSummary documentsGetCollection(String externalId, UUID signerId, String externalSignerId, OffsetDateTime fromDate, OffsetDateTime toDate, OffsetDateTime lastUpdated, OffsetDateTime signedDate, String nameOfSigner, String title, String status, String tags, Integer offset, Integer limit, UUID accountId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/summary";

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (externalId != null) {
            url.addQueryParameter("externalId", externalId.toString());}
        if (signerId != null) {
            url.addQueryParameter("signerId", signerId.toString());}
        if (externalSignerId != null) {
            url.addQueryParameter("externalSignerId", externalSignerId.toString());}
        if (fromDate != null) {
            url.addQueryParameter("fromDate", fromDate.toString());}
        if (toDate != null) {
            url.addQueryParameter("toDate", toDate.toString());}
        if (lastUpdated != null) {
            url.addQueryParameter("lastUpdated", lastUpdated.toString());}
        if (signedDate != null) {
            url.addQueryParameter("signedDate", signedDate.toString());}
        if (nameOfSigner != null) {
            url.addQueryParameter("nameOfSigner", nameOfSigner.toString());}
        if (title != null) {
            url.addQueryParameter("title", title.toString());}
        if (status != null) {
            url.addQueryParameter("status", status.toString());}
        if (tags != null) {
            url.addQueryParameter("tags", tags.toString());}
        if (offset != null) {
            url.addQueryParameter("offset", offset.toString());}
        if (limit != null) {
            url.addQueryParameter("limit", limit.toString());}
        if (accountId != null) {
            url.addQueryParameter("accountId", accountId.toString());}

        return get(url.build(), CollectionWithPagingDocumentSummary.class);
    }

    /**
     * List document summaries (asynchronously)
     * Queries your documents using the provided parameters.
     * @param externalId Documents external id (optional)
     * @param signerId Signer Id (optional)
     * @param externalSignerId External signer Id (optional)
     * @param fromDate Documents created from date (ticks) (optional)
     * @param toDate Documents created to date (ticks) (optional)
     * @param lastUpdated Documents updated after this date (ticks) (optional)
     * @param signedDate Documents signed after this date (ticks) (optional)
     * @param nameOfSigner Name of signer (optional)
     * @param title  (optional)
     * @param status Document status (optional)
     * @param tags Document tags (optional)
     * @param offset Used for paging (will be automatically set in response links) (optional)
     * @param limit Set how many results you want per page (max/default 100) (optional)
     * @param accountId  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CollectionWithPagingDocumentSummary> documentsGetCollectionAsync(String externalId, UUID signerId, String externalSignerId, OffsetDateTime fromDate, OffsetDateTime toDate, OffsetDateTime lastUpdated, OffsetDateTime signedDate, String nameOfSigner, String title, String status, String tags, Integer offset, Integer limit, UUID accountId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/summary";

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (externalId != null) {
            url.addQueryParameter("externalId", externalId.toString());}
        if (signerId != null) {
            url.addQueryParameter("signerId", signerId.toString());}
        if (externalSignerId != null) {
            url.addQueryParameter("externalSignerId", externalSignerId.toString());}
        if (fromDate != null) {
            url.addQueryParameter("fromDate", fromDate.toString());}
        if (toDate != null) {
            url.addQueryParameter("toDate", toDate.toString());}
        if (lastUpdated != null) {
            url.addQueryParameter("lastUpdated", lastUpdated.toString());}
        if (signedDate != null) {
            url.addQueryParameter("signedDate", signedDate.toString());}
        if (nameOfSigner != null) {
            url.addQueryParameter("nameOfSigner", nameOfSigner.toString());}
        if (title != null) {
            url.addQueryParameter("title", title.toString());}
        if (status != null) {
            url.addQueryParameter("status", status.toString());}
        if (tags != null) {
            url.addQueryParameter("tags", tags.toString());}
        if (offset != null) {
            url.addQueryParameter("offset", offset.toString());}
        if (limit != null) {
            url.addQueryParameter("limit", limit.toString());}
        if (accountId != null) {
            url.addQueryParameter("accountId", accountId.toString());}

        return getAsync(url.build(), CollectionWithPagingDocumentSummary.class);
    }


    /**
     * Retrieve document summary
     * Get information about a document
     * @param documentId  (required)
     * @return DocumentSummary
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentSummary documentsGetSummary(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/summary"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), DocumentSummary.class);
    }

    /**
     * Retrieve document summary (asynchronously)
     * Get information about a document
     * @param documentId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<DocumentSummary> documentsGetSummaryAsync(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/summary"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), DocumentSummary.class);
    }


    /**
     * Retrieve document status
     * Get the status of a document
     * @param documentId  (required)
     * @return Status
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Status documentsStatus(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/status"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), Status.class);
    }

    /**
     * Retrieve document status (asynchronously)
     * Get the status of a document
     * @param documentId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Status> documentsStatusAsync(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/status"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), Status.class);
    }


    /**
     * Update document
     *
     * @param documentId  (required)
     * @param request  (required)
     * @return UpdateDocumentRequest
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateDocumentRequest documentsUpdate(UUID documentId, UpdateDocumentRequestWrapper request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/documents/{documentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patch(url.build(), request, UpdateDocumentRequest.class);
    }

    /**
     * Update document (asynchronously)
     *
     * @param documentId  (required)
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<UpdateDocumentRequest> documentsUpdateAsync(UUID documentId, UpdateDocumentRequestWrapper request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/documents/{documentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patchAsync(url.build(), request, UpdateDocumentRequest.class);
    }

    // FilesApi

    /**
     * Retrieve file
     * Retrieves the signed document file.
     * @param documentId  (required)
     * @param fileFormat  (required)
     * @return File
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InputStream filesGet(UUID documentId, String fileFormat) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/files"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (fileFormat != null) {
            url.addQueryParameter("fileFormat", fileFormat.toString());}

        return getFile(url.build());
    }

    /**
     * Retrieve file (asynchronously)
     * Retrieves the signed document file.
     * @param documentId  (required)
     * @param fileFormat  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<InputStream> filesGetAsync(UUID documentId, String fileFormat) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/files"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (fileFormat != null) {
            url.addQueryParameter("fileFormat", fileFormat.toString());}

        return getFileAsync(url.build());
    }


    /**
     * Retrieve attachment file
     * Retrieves the attachment file.
     * @param documentId  (required)
     * @param attachmentId  (required)
     * @param fileFormat  (required)
     * @return File
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InputStream filesGetAttachment(UUID documentId, UUID attachmentId, String fileFormat) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/files/attachments/{attachmentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "attachmentId" + "\\}", Encoder.escapeString(attachmentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (fileFormat != null) {
            url.addQueryParameter("fileFormat", fileFormat.toString());}

        return getFile(url.build());
    }

    /**
     * Retrieve attachment file (asynchronously)
     * Retrieves the attachment file.
     * @param documentId  (required)
     * @param attachmentId  (required)
     * @param fileFormat  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<InputStream> filesGetAttachmentAsync(UUID documentId, UUID attachmentId, String fileFormat) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/files/attachments/{attachmentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "attachmentId" + "\\}", Encoder.escapeString(attachmentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (fileFormat != null) {
            url.addQueryParameter("fileFormat", fileFormat.toString());}

        return getFileAsync(url.build());
    }


    /**
     * Retrieve file for signer
     * Retrieves the signed document file for the specified signer.
     * @param documentId  (required)
     * @param signerId The signers Id (required)
     * @param fileFormat  (required)
     * @return File
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InputStream filesGetSigner(UUID documentId, UUID signerId, String fileFormat) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/files/signers/{signerId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "signerId" + "\\}", Encoder.escapeString(signerId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (fileFormat != null) {
            url.addQueryParameter("fileFormat", fileFormat.toString());}

        return getFile(url.build());
    }

    /**
     * Retrieve file for signer (asynchronously)
     * Retrieves the signed document file for the specified signer.
     * @param documentId  (required)
     * @param signerId The signers Id (required)
     * @param fileFormat  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<InputStream> filesGetSignerAsync(UUID documentId, UUID signerId, String fileFormat) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/files/signers/{signerId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "signerId" + "\\}", Encoder.escapeString(signerId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (fileFormat != null) {
            url.addQueryParameter("fileFormat", fileFormat.toString());}

        return getFileAsync(url.build());
    }


    /**
     * Retrieve attachment for signer
     * Retrieves the attachment file for the specified signer.
     * @param documentId  (required)
     * @param attachmentId  (required)
     * @param signerId The signers Id (required)
     * @param fileFormat  (required)
     * @return File
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InputStream filesGetSignerAttachment(UUID documentId, UUID attachmentId, UUID signerId, String fileFormat) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/files/attachments/{attachmentId}/signers/{signerId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "attachmentId" + "\\}", Encoder.escapeString(attachmentId.toString()))
                .replaceAll("\\{" + "signerId" + "\\}", Encoder.escapeString(signerId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (fileFormat != null) {
            url.addQueryParameter("fileFormat", fileFormat.toString());}

        return getFile(url.build());
    }

    /**
     * Retrieve attachment for signer (asynchronously)
     * Retrieves the attachment file for the specified signer.
     * @param documentId  (required)
     * @param attachmentId  (required)
     * @param signerId The signers Id (required)
     * @param fileFormat  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<InputStream> filesGetSignerAttachmentAsync(UUID documentId, UUID attachmentId, UUID signerId, String fileFormat) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/files/attachments/{attachmentId}/signers/{signerId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "attachmentId" + "\\}", Encoder.escapeString(attachmentId.toString()))
                .replaceAll("\\{" + "signerId" + "\\}", Encoder.escapeString(signerId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (fileFormat != null) {
            url.addQueryParameter("fileFormat", fileFormat.toString());}

        return getFileAsync(url.build());
    }

    // AttachmentsApi

    /**
     * Create attachment
     * Adds an attachments to the specified document. You can choose between different ways to make the user accept the attachment.               <span style=\"color:red;\">The attachment will be deleted when the signature job is completed or has expired</span>
     * @param documentId  (required)
     * @param request  (required)
     * @return AttachmentResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AttachmentResponse attachmentsCreate(UUID documentId, AttachmentRequestWrapper request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/documents/{documentId}/attachments"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), request, AttachmentResponse.class);
    }

    /**
     * Create attachment (asynchronously)
     * Adds an attachments to the specified document. You can choose between different ways to make the user accept the attachment.               <span style=\"color:red;\">The attachment will be deleted when the signature job is completed or has expired</span>
     * @param documentId  (required)
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<AttachmentResponse> attachmentsCreateAsync(UUID documentId, AttachmentRequestWrapper request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/documents/{documentId}/attachments"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), request, AttachmentResponse.class);
    }


    /**
     * Delete attachment
     * Deletes the specified attachment (Will only take affect if no one has signed the document yet)
     * @param documentId  (required)
     * @param attachmentId  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void attachmentsDelete(UUID documentId, UUID attachmentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/attachments/{attachmentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "attachmentId" + "\\}", Encoder.escapeString(attachmentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        delete(url.build());
    }

    /**
     * Delete attachment (asynchronously)
     * Deletes the specified attachment (Will only take affect if no one has signed the document yet)
     * @param documentId  (required)
     * @param attachmentId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> attachmentsDeleteAsync(UUID documentId, UUID attachmentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/attachments/{attachmentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "attachmentId" + "\\}", Encoder.escapeString(attachmentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return deleteAsync(url.build());
    }


    /**
     * Retrieve attachment
     * Retrieves the details of a single attachment.
     * @param documentId  (required)
     * @param attachmentId  (required)
     * @return AttachmentResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AttachmentResponse attachmentsGet(UUID documentId, UUID attachmentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/attachments/{attachmentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "attachmentId" + "\\}", Encoder.escapeString(attachmentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), AttachmentResponse.class);
    }

    /**
     * Retrieve attachment (asynchronously)
     * Retrieves the details of a single attachment.
     * @param documentId  (required)
     * @param attachmentId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<AttachmentResponse> attachmentsGetAsync(UUID documentId, UUID attachmentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/attachments/{attachmentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "attachmentId" + "\\}", Encoder.escapeString(attachmentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), AttachmentResponse.class);
    }


    /**
     * List attachments
     * Returns a list of all attachments for the specified document.
     * @param documentId  (required)
     * @return AttachmentListItem
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AttachmentListItem[] attachmentsList(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/attachments"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), AttachmentListItem[].class);
    }

    /**
     * List attachments (asynchronously)
     * Returns a list of all attachments for the specified document.
     * @param documentId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<AttachmentListItem[]> attachmentsListAsync(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/attachments"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), AttachmentListItem[].class);
    }


    /**
     * Update attachment
     * Updates the specified attachment (Will only take affect if no one has signed the document yet)
     * @param documentId  (required)
     * @param attachmentId  (required)
     * @param request  (required)
     * @return AttachmentResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AttachmentResponse attachmentsUpdate(UUID documentId, UUID attachmentId, UpdateAttachmentRequestWrapper request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/documents/{documentId}/attachments/{attachmentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "attachmentId" + "\\}", Encoder.escapeString(attachmentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patch(url.build(), request, AttachmentResponse.class);
    }

    /**
     * Update attachment (asynchronously)
     * Updates the specified attachment (Will only take affect if no one has signed the document yet)
     * @param documentId  (required)
     * @param attachmentId  (required)
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<AttachmentResponse> attachmentsUpdateAsync(UUID documentId, UUID attachmentId, UpdateAttachmentRequestWrapper request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/documents/{documentId}/attachments/{attachmentId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "attachmentId" + "\\}", Encoder.escapeString(attachmentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patchAsync(url.build(), request, AttachmentResponse.class);
    }

    // NotificationsApi

    /**
     * List notifications
     * Returns a list of all notifications that has been sent / attempted sent for a document
     * @param documentId  (required)
     * @return NotificationLogItem
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NotificationLogItem[] notificationsList(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/notifications"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), NotificationLogItem[].class);
    }

    /**
     * List notifications (asynchronously)
     * Returns a list of all notifications that has been sent / attempted sent for a document
     * @param documentId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<NotificationLogItem[]> notificationsListAsync(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/notifications"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), NotificationLogItem[].class);
    }


    /**
     * Send reminders
     * If you want to send out reminders to all/some of the signers manually you can do it here.
     * @param documentId  (required)
     * @param manualReminder  (required)
     * @return ManualReminder
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ManualReminder notificationsSendManualReminder(UUID documentId, ManualReminder manualReminder) throws Exception, IdfyException {
        Object localVarPostBody = manualReminder;
        // create path and map variables
        String localVarPath = "/documents/{documentId}/notifications/reminder"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), manualReminder, ManualReminder.class);
    }

    /**
     * Send reminders (asynchronously)
     * If you want to send out reminders to all/some of the signers manually you can do it here.
     * @param documentId  (required)
     * @param manualReminder  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<ManualReminder> notificationsSendManualReminderAsync(UUID documentId, ManualReminder manualReminder) throws Exception, IdfyException {
        Object localVarPostBody = manualReminder;
        // create path and map variables
        String localVarPath = "/documents/{documentId}/notifications/reminder"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), manualReminder, ManualReminder.class);
    }

    // SignersApi

    /**
     * Create signer
     *
     * @param documentId  (required)
     * @param signer  (required)
     * @return SignerResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignerResponse signersAdd(UUID documentId, SignerWrapper signer) throws Exception, IdfyException {
        Object localVarPostBody = signer;
        // create path and map variables
        String localVarPath = "/documents/{documentId}/signers"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), signer, SignerResponse.class);
    }

    /**
     * Create signer (asynchronously)
     *
     * @param documentId  (required)
     * @param signer  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<SignerResponse> signersAddAsync(UUID documentId, SignerWrapper signer) throws Exception, IdfyException {
        Object localVarPostBody = signer;
        // create path and map variables
        String localVarPath = "/documents/{documentId}/signers"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), signer, SignerResponse.class);
    }


    /**
     * Delete signer
     *
     * @param documentId  (required)
     * @param signerId  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void signersDelete(UUID documentId, UUID signerId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/signers/{signerId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "signerId" + "\\}", Encoder.escapeString(signerId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        delete(url.build());
    }

    /**
     * Delete signer (asynchronously)
     *
     * @param documentId  (required)
     * @param signerId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> signersDeleteAsync(UUID documentId, UUID signerId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/signers/{signerId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "signerId" + "\\}", Encoder.escapeString(signerId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return deleteAsync(url.build());
    }


    /**
     * Retrieve signer
     * Retrieves the details of a single signer.
     * @param documentId  (required)
     * @param signerId  (required)
     * @return SignerResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignerResponse signersGet(UUID documentId, UUID signerId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/signers/{signerId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "signerId" + "\\}", Encoder.escapeString(signerId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), SignerResponse.class);
    }

    /**
     * Retrieve signer (asynchronously)
     * Retrieves the details of a single signer.
     * @param documentId  (required)
     * @param signerId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<SignerResponse> signersGetAsync(UUID documentId, UUID signerId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/signers/{signerId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "signerId" + "\\}", Encoder.escapeString(signerId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), SignerResponse.class);
    }


    /**
     * List signers
     *
     * @param documentId  (required)
     * @return SignerResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignerResponse[] signersList(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/signers"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), SignerResponse[].class);
    }

    /**
     * List signers (asynchronously)
     *
     * @param documentId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<SignerResponse[]> signersListAsync(UUID documentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/documents/{documentId}/signers"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), SignerResponse[].class);
    }


    /**
     * Update signer
     *
     * @param documentId  (required)
     * @param signerId  (required)
     * @param request  (required)
     * @return UpdateSignerRequest
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateSignerRequest signersUpdate(UUID documentId, UUID signerId, UpdateSignerRequestWrapper request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/documents/{documentId}/signers/{signerId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "signerId" + "\\}", Encoder.escapeString(signerId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patch(url.build(), request, UpdateSignerRequest.class);
    }

    /**
     * Update signer (asynchronously)
     *
     * @param documentId  (required)
     * @param signerId  (required)
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<UpdateSignerRequest> signersUpdateAsync(UUID documentId, UUID signerId, UpdateSignerRequestWrapper request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/documents/{documentId}/signers/{signerId}"
                .replaceAll("\\{" + "documentId" + "\\}", Encoder.escapeString(documentId.toString()))
                .replaceAll("\\{" + "signerId" + "\\}", Encoder.escapeString(signerId.toString()));

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patchAsync(url.build(), request, UpdateSignerRequest.class);
    }

    // ThemesApi

    /**
     * List spinners
     * This endpoint lists all the spinners you can use in our sign application
     * @return String
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String[] themesListSpinners() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/themes/list/spinners";

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), String[].class);
    }

    /**
     * List spinners (asynchronously)
     * This endpoint lists all the spinners you can use in our sign application
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<String[]> themesListSpinnersAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/themes/list/spinners";

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), String[].class);
    }


    /**
     * List themes
     * This endpoint lists all the color themes you can use in our sign application
     * @return String
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String[] themesListThemes() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/themes/list/themes";

        localVarPath = Urls.SIGNATURE.concat(localVarPath);

        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), String[].class);
    }

    /**
     * List themes (asynchronously)
     * This endpoint lists all the color themes you can use in our sign application
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<String[]> themesListThemesAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/themes/list/themes";

        localVarPath = Urls.SIGNATURE.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), String[].class);
    }
}
