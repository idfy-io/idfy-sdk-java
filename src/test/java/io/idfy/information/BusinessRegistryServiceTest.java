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
 * API tests for BusinessRegistryService
 */

public class BusinessRegistryServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final InformationService api = new InformationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * List registration authorities
     *
     * Retrieves a list of business registration authorities globally
     */
    @Test
    public void listRegistrationAuthoritiesTest() throws IdfyException, Exception {
        api.listRegistrationAuthorities();
    }
    
    /**
     * Retrieve registration authority
     *
     * Retrieves detailed information about a specific registration authority
     */
    @Test
    public void retrieveRegistrationAuthorityTest() throws IdfyException, Exception {
        String authorityCode = new String("123");
        api.retrieveRegistrationAuthority(authorityCode);
    }
    

}
