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
import java.io.File;
import java.io.InputStream;
import java.util.UUID;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for FilesService
 */

public class FilesServiceTest {

    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final SignatureService api = new SignatureService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Retrieve file
     *
     * Retrieves the signed document file.
     */
    @Test
    public void filesGetTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        String fileFormat = new String("123");
        InputStream response = api.filesGet(documentId, fileFormat);
        assertNotNull(response);
    }
    
    /**
     * Retrieve attachment file
     *
     * Retrieves the attachment file.
     */
    @Test
    public void filesGetAttachmentTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        UUID attachmentId = UUID.randomUUID();
        String fileFormat = new String("123");
        InputStream response = api.filesGetAttachment(documentId, attachmentId, fileFormat);
        assertNotNull(response);
    }
    
    /**
     * Retrieve file for signer
     *
     * Retrieves the signed document file for the specified signer.
     */
    @Test
    public void filesGetSignerTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        UUID signerId = UUID.randomUUID();
        String fileFormat = new String("123");
        InputStream response = api.filesGetSigner(documentId, signerId, fileFormat);
        assertNotNull(response);
    }
    
    /**
     * Retrieve attachment for signer
     *
     * Retrieves the attachment file for the specified signer.
     */
    @Test
    public void filesGetSignerAttachmentTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        UUID attachmentId = UUID.randomUUID();
        UUID signerId = UUID.randomUUID();
        String fileFormat = new String("123");
        InputStream response = api.filesGetSignerAttachment(documentId, attachmentId, signerId, fileFormat);
        assertNotNull(response);
    }
    

}
