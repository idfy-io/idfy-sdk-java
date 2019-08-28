/*
 * Idfy Identification
 * This endpoint enables authentication/identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID. ## Last update   Last build date for this endpoint: 02.04.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */


package io.idfy.identification;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.identification.models.CreateIdentificationRequest;
import io.idfy.identification.models.CreateIdentificationResponse;
import io.idfy.identification.models.IdentificationCompleteResponse;
import io.idfy.identification.models.IdentificationResponse;
import io.idfy.identification.models.InvalidateIdentificationRequest;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for IdentificationSessionService
 */

public class IdentificationSessionServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final IdentificationService api = new IdentificationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create session
     *
     * Creates a new identification session
     */
    @Test
    public void createSessionTest() throws IdfyException, Exception {
        CreateIdentificationRequest request =  new CreateIdentificationRequest.Builder().build();
        CreateIdentificationResponse response = api.createSession(request);
        assertNotNull(response);
    }
    
    /**
     * Invalidate session
     *
     * Invalidates an identification session to avoid using the same request twice. Remark: if the session has status ERROR it will not be invalidated.
     */
    @Test
    public void invalidateSessionTest() throws IdfyException, Exception {
        InvalidateIdentificationRequest value =  new InvalidateIdentificationRequest.Builder().build();
        api.invalidateSession(value);
    }
    
    /**
     * Retrieve session response
     *
     * Retrieves the response of a single identifaction session.  REMARK: Only authenticate users when the identitication status is equal to SUCCESS.
     */
    @Test
    public void retrieveSessionResponseTest() throws IdfyException, Exception {
        String requestId = new String("123");
        Boolean metaData = true;
        IdentificationResponse response = api.retrieveSessionResponse(requestId, metaData);
        assertNotNull(response);
    }
    
    /**
     * Retrieve session status
     *
     * Retrieves the status of a single identification session.
     */
    @Test
    public void retrieveSessionStatusTest() throws IdfyException, Exception {
        String requestId = new String("123");
        IdentificationCompleteResponse response = api.retrieveSessionStatus(requestId);
        assertNotNull(response);
    }
    

}
