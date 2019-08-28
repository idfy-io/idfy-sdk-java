/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */


package io.idfy.signature;

import io.idfy.IdfyConfiguration;
import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.signature.models.CollectionWithPagingDocumentSummary;
import io.idfy.signature.models.CreateDocumentRequestWrapper;
import io.idfy.signature.models.CreateDocumentResponse;
import io.idfy.signature.models.DocumentSummary;
import java.time.OffsetDateTime;
import io.idfy.signature.models.Status;

import java.util.*;

import io.idfy.signature.models.UpdateDocumentRequest;
import io.idfy.signature.models.UpdateDocumentRequestWrapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * API tests for DocumentsService
 */

public class DocumentsServiceTest {

    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final SignatureService api = new SignatureService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
        IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }


    /**
     * Cancel document
     *
     *
     */
    @Test
    public void documentsCancelTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        String reason = new String("123");
        api.documentsCancel(documentId, reason);
    }

    /**
     * Create document
     *
     * Creates a new document. In the response you will receive a document ID to retrieve info about the document at a later time.   You also receive a URL and unique identifier per signer.
     */
    @Test
    public void documentsCreateTest() throws IdfyException, Exception {
        CreateDocumentRequestWrapper request =  new CreateDocumentRequestWrapper.Builder().build();
        CreateDocumentResponse response = api.documentsCreate(request);
        assertNotNull(response);
    }

    /**
     * Retrieve document
     *
     * Retrieves details of a single document.
     */
    @Test
    public void documentsGetTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        CreateDocumentResponse response = api.documentsGet(documentId);
        assertNotNull(response);
    }

    /**
     * List document summaries
     *
     * Queries your documents using the provided parameters.
     */
    @Test
    public void documentsGetCollectionTest() throws IdfyException, Exception {
        String externalId = new String("123");
        UUID signerId = UUID.randomUUID();
        String externalSignerId = new String("123");
        OffsetDateTime fromDate = OffsetDateTime.now();
        OffsetDateTime toDate = OffsetDateTime.now();
        OffsetDateTime lastUpdated = OffsetDateTime.now();
        OffsetDateTime signedDate = OffsetDateTime.now();
        String nameOfSigner = new String("123");
        String title = new String("123");
        String status = new String("123");
        String tags = new String("123");
        Integer offset = 123;
        Integer limit = 123;
        UUID accountId = UUID.randomUUID();
        CollectionWithPagingDocumentSummary response = api.documentsGetCollection(externalId, signerId, externalSignerId, fromDate, toDate, lastUpdated, signedDate, nameOfSigner, title, status, tags, offset, limit, accountId);
        assertNotNull(response);
    }

    /**
     * Retrieve document summary
     *
     * Get information about a document
     */
    @Test
    public void documentsGetSummaryTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        DocumentSummary response = api.documentsGetSummary(documentId);
        assertNotNull(response);
    }

    /**
     * Retrieve document status
     *
     * Get the status of a document
     */
    @Test
    public void documentsStatusTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        Status response = api.documentsStatus(documentId);
        assertNotNull(response);
    }

    /**
     * Update document
     *
     *
     */
    @Test
    public void documentsUpdateTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        UpdateDocumentRequestWrapper request =  new UpdateDocumentRequestWrapper.Builder().build();
        UpdateDocumentRequest response = api.documentsUpdate(documentId, request);
        assertNotNull(response);
    }


}