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
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for ThemesService
 */

@Disabled("500 from mock server. Works when tested against local signature environment.")
public class ThemesServiceTest {

    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final SignatureService api = new SignatureService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * List spinners
     *
     * This endpoint lists all the spinners you can use in our sign application
     */
    @Test
    public void themesListSpinnersTest() throws IdfyException, Exception {
        String[] response = api.themesListSpinners();
        assertNotNull(response);
    }
    
    /**
     * List themes
     *
     * This endpoint lists all the color themes you can use in our sign application
     */
    @Test
    public void themesListThemesTest() throws IdfyException, Exception {
        String[] response = api.themesListThemes();
        assertNotNull(response);
    }
    

}
