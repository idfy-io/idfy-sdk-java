/*
 * Idfy.MerchantSign
 * This endpoint lets you sign documents with a merchant signature. ## Last update   Last build date for this endpoint: 04.06.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */


package io.idfy.merchantsign;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.merchantsign.models.MerchantSignTransaction;
import io.idfy.merchantsign.models.SignRequest;
import io.idfy.merchantsign.models.SignResponse;
import java.util.UUID;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for SignatureService
 */

public class SignatureServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final MerchantSignService api = new MerchantSignService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Retrieve transaction
     *
     * Retrieves a single transaction.
     */
    @Test
    public void signatureGetTest() throws IdfyException, Exception {
        UUID transactionId = UUID.randomUUID();
        MerchantSignTransaction response = api.signatureGet(transactionId);
        assertNotNull(response);
    }
    
    /**
     * List transactions
     *
     * Returns a list of transactions.
     */
    @Test
    public void signatureListTest() throws IdfyException, Exception {
        String oauthClientId = new String("123");
        Long fromDate = 123L;
        Long toDate = 123L;
        MerchantSignTransaction[] response = api.signatureList(oauthClientId, fromDate, toDate);
        assertNotNull(response);
    }
    
    /**
     * Retrieve pades
     *
     * Retrieve pades of signed pdf file. This endpoint will only work on the api.idfy.no endpoint
     */
    @Test
    public void signatureRetrievePadesTest() throws IdfyException, Exception {
        UUID signedDocumentId = UUID.randomUUID();
        api.signatureRetrievePades(signedDocumentId);
    }
    
    /**
     * Create merchant signature
     *
     * 
     */
    @Test
    public void signatureSignTest() throws IdfyException, Exception {
        SignRequest request =  new SignRequest.Builder().build();
        SignResponse response = api.signatureSign(request);
        assertNotNull(response);
    }
    

}
