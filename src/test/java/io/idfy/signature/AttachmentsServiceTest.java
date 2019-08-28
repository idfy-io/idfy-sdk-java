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
import io.idfy.signature.models.AttachmentListItem;
import io.idfy.signature.models.AttachmentRequestWrapper;
import io.idfy.signature.models.AttachmentResponse;
import java.util.UUID;
import io.idfy.signature.models.UpdateAttachmentRequestWrapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for AttachmentsService
 */

public class AttachmentsServiceTest {

    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final SignatureService api = new SignatureService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create attachment
     *
     * Adds an attachments to the specified document. You can choose between different ways to make the user accept the attachment.               <span style=\"color:red;\">The attachment will be deleted when the signature job is completed or has expired</span>
     */
    @Test
    public void attachmentsCreateTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        AttachmentRequestWrapper request =  new AttachmentRequestWrapper.Builder().build();
        AttachmentResponse response = api.attachmentsCreate(documentId, request);
        assertNotNull(response);
    }
    
    /**
     * Delete attachment
     *
     * Deletes the specified attachment (Will only take affect if no one has signed the document yet)
     */
    @Test
    public void attachmentsDeleteTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        UUID attachmentId = UUID.randomUUID();
        api.attachmentsDelete(documentId, attachmentId);
    }
    
    /**
     * Retrieve attachment
     *
     * Retrieves the details of a single attachment.
     */
    @Test
    public void attachmentsGetTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        UUID attachmentId = UUID.randomUUID();
        AttachmentResponse response = api.attachmentsGet(documentId, attachmentId);
        assertNotNull(response);
    }
    
    /**
     * List attachments
     *
     * Returns a list of all attachments for the specified document.
     */
    @Test
    public void attachmentsListTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        AttachmentListItem[] response = api.attachmentsList(documentId);
        assertNotNull(response);
    }
    
    /**
     * Update attachment
     *
     * Updates the specified attachment (Will only take affect if no one has signed the document yet)
     */
    @Test
    public void attachmentsUpdateTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        UUID attachmentId = UUID.randomUUID();
        UpdateAttachmentRequestWrapper request =  new UpdateAttachmentRequestWrapper.Builder().build();
        AttachmentResponse response = api.attachmentsUpdate(documentId, attachmentId, request);
        assertNotNull(response);
    }
    

}
