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
 * API tests for GeoDataService
 */

public class GeoDataServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final InformationService api = new InformationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * List countries
     *
     * Lists all countries in the world with English name and ISO 3166-1 country code
     */
    @Test
    public void listCountriesTest() throws IdfyException, Exception {
        String lang = new String("123");
        api.listCountries(lang);
    }
    
    /**
     * List country subdivisions
     *
     * Retrieves a list over top level administrative subdivisions for a country with name and ISO 3166-2 region code
     */
    @Test
    public void listCountrySubdivisionsTest() throws IdfyException, Exception {
        String countryCode = new String("123");
        String lang = new String("123");
        api.listCountrySubdivisions(countryCode, lang);
    }
    
    /**
     * Retrieve country info
     *
     * Retrieves basic geographical information about a country
     */
    @Test
    public void retrieveCountryInfoTest() throws IdfyException, Exception {
        String countryCode = new String("123");
        String lang = new String("123");
        api.retrieveCountryInfo(countryCode, lang);
    }
    

}
