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
import io.idfy.identification.models.CreateBankIDMobileRequest;
import io.idfy.identification.models.CreateBankIDMobileResponse;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for NorwegianBankIdService
 */

public class NorwegianBankIdServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final IdentificationService api = new IdentificationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create mobile session
     *
     * Creates a new BankID mobile session to start the identification process. Returns request ID and a merchant reference.  If the user does not have BankID mobile or invalid data was input, this will be indicated by the InvalidMobileNumberOrDateOfBirth parameter being returned as true.  If an error occured, the response will contain an error object with an error code and error message.
     */
    @Test
    public void createMobileSessionTest() throws IdfyException, Exception {
        CreateBankIDMobileRequest model =  new CreateBankIDMobileRequest.Builder().build();
        CreateBankIDMobileResponse response = api.createMobileSession(model);
        assertNotNull(response);
    }
    

}
