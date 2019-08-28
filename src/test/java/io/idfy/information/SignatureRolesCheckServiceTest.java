/*
 * Idfy Information Services
 * This endpoint offers a lot of useful extra information including credit checks, signature / prokura checks and information regarding persons and companies.   ## Last update   Last build date for this endpoint: 13.12.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */


package io.idfy.information;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.information.models.SignatureCheckRequest;
import io.idfy.information.models.SignatureRights;
import io.idfy.information.models.SignatureStatusResponse;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for SignatureRolesCheckService
 */

public class SignatureRolesCheckServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final InformationService api = new InformationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Check signatures / prokura
     *
     * Check if received signatures and/or prokura are valid. This call allows you to do this check for multiple organizations simulataneously.  A valid date of birth in this format [ddMMyy] is required. The persons last name plus minimum one other part of the signees name (first, (middle) and last name has to be separated by whitespace, comma or ;).   A report that explains the validity of the signatures can be included.
     */
    @Test
    public void checkSignaturesProkuraTest() throws IdfyException, Exception {
        SignatureCheckRequest data =  new SignatureCheckRequest.Builder().build();
        Boolean includereport = true;
        String countrycode = new String("123");
        SignatureStatusResponse response = api.checkSignaturesProkura(data, includereport, countrycode);
        assertNotNull(response);
    }
    
    /**
     * Get rights
     *
     * Check which person(s) that has the right to sign documents in an organization. You will receive lists with names and date of birth for the persons allowed for signing / prokura.
     */
    @Test
    public void getRightsTest() throws IdfyException, Exception {
        String orgnumber = new String("123");
        String countrycode = new String("123");
        SignatureRights response = api.getRights(orgnumber, countrycode);
        assertNotNull(response);
    }
    

}
