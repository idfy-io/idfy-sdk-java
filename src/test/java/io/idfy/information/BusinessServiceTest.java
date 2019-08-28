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
import io.idfy.information.models.CompanyInformationResponse;
import io.idfy.information.models.CreditCheckCompanyResponse;
import io.idfy.information.models.DifiResponse;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for BusinessService
 */

public class BusinessServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final InformationService api = new InformationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Perform credit check
     *
     * Run a credit check on a specified company, this check will not produce any duplicate letters.               A pdf report will be awailable to download the first 48 hours.
     */
    @Test
    public void performCreditCheckTest() throws IdfyException, Exception {
        Integer orgnumber = 123;
        String userId = new String("123");
        String password = new String("123");
        String countryCode = new String("123");
        Boolean includeReport = true;
        CreditCheckCompanyResponse response = api.performCreditCheck(orgnumber, userId, password, countryCode, includeReport);
        assertNotNull(response);
    }
    
    /**
     * Retrieve information from Difi
     *
     * Query company information from difi datahotell (official data from bronnoysund), supports query by name and/or orgnumber
     */
    @Test
    public void retrieveInformationFromDifiTest() throws IdfyException, Exception {
        String orgnumber = new String("123");
        String companyname = new String("123");
        DifiResponse response = api.retrieveInformationFromDifi(orgnumber, companyname);
        assertNotNull(response);
    }
    
    /**
     * Retrieve information from Matchit
     *
     * Query company information from Matchit, Matchit uses existing information to build up their database. Supports query by name and/or orgnumber
     */
    @Test
    public void retrieveInformationFromMatchitTest() throws IdfyException, Exception {
        String companyname = new String("123");
        String orgnumber = new String("123");
        CompanyInformationResponse response = api.retrieveInformationFromMatchit(companyname, orgnumber);
        assertNotNull(response);
    }
    

}
