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
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for MobileInfoService
 */

public class MobileInfoServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final InformationService api = new InformationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Mobile info
     *
     * With this enpoints a user can fill out a form with one click. Per now the user have to be a telenor customer to retrieve information from this endpoint.             The url received here can be used in an iframe or a popupwindow, we will then deliever the user information with webmessageing.             <br /><br />             Flow:<br />             1) Get url from this endpoint<br />             2) Open a popup window or an iframe with this url as src<br />             3) User authenticates and gives you permission to retrieve user information<br />             4) User is redirected to the callback endpoint, we connect to the serviceprovider API and retrieves the information about the user<br />             5) We use webmessaging so you can collect the information
     */
    @Disabled("Endpoint returns 'string'.")
    @Test
    public void mobileInfoTest() throws IdfyException, Exception {
        String serviceProvider = new String("123");
        String responseMode = new String("123");
        String response = api.mobileInfo(serviceProvider, responseMode);
        assertNotNull(response);
    }
    

}
