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
import io.idfy.signature.models.SignerResponse;
import io.idfy.signature.models.SignerWrapper;
import java.util.UUID;
import io.idfy.signature.models.UpdateSignerRequest;
import io.idfy.signature.models.UpdateSignerRequestWrapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for SignersService
 */

public class SignersServiceTest {

    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final SignatureService api = new SignatureService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create signer
     *
     * 
     */
    @Test
    public void signersAddTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        SignerWrapper signer =  new SignerWrapper.Builder().build();
        SignerResponse response = api.signersAdd(documentId, signer);
        assertNotNull(response);
    }
    
    /**
     * Delete signer
     *
     * 
     */
    @Test
    public void signersDeleteTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        UUID signerId = UUID.randomUUID();
        api.signersDelete(documentId, signerId);
    }
    
    /**
     * Retrieve signer
     *
     * Retrieves the details of a single signer.
     */
    @Test
    public void signersGetTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        UUID signerId = UUID.randomUUID();
        SignerResponse response = api.signersGet(documentId, signerId);
        assertNotNull(response);
    }
    
    /**
     * List signers
     *
     * 
     */
    @Test
    public void signersListTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        SignerResponse[] response = api.signersList(documentId);
        assertNotNull(response);
    }
    
    /**
     * Update signer
     *
     * 
     */
    @Test
    public void signersUpdateTest() throws IdfyException, Exception {
        UUID documentId = UUID.randomUUID();
        UUID signerId = UUID.randomUUID();
        UpdateSignerRequestWrapper request =  new UpdateSignerRequestWrapper.Builder().build();
        UpdateSignerRequest response = api.signersUpdate(documentId, signerId, request);
        assertNotNull(response);
    }
    

}
