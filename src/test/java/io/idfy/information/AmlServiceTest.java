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
import io.idfy.information.models.CompanyAmlResponse;
import io.idfy.information.models.PersonAmlResponse;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for AmlService
 */

public class AmlServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final InformationService api = new InformationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * B2B Identify and Screening Request
     *
     * Person screening with data enhancement enabled for nationalities where data enhancement is provided. For other nationalities the data enhancement will be skipped  **Required fields**: Name with either birthDate or ssn.
     */
    @Test
    public void b2BIdentifyAndScreeningRequestTest() throws IdfyException, Exception {
        String name = new String("123");
        String regNo = new String("123");
        String dunsNo = new String("123");
        String nationality = new String("123");
        String language = new String("123");
        Boolean includeReport = true;
        String mode = new String("123");
        CompanyAmlResponse response = api.b2BIdentifyAndScreeningRequest(name, regNo, dunsNo, nationality, language, includeReport, mode);
        assertNotNull(response);
    }
    
    /**
     * B2C Identify and Screening Request
     *
     * Person screening with data enhancement enabled for nationalities where data enhancement is provided. For other nationalities the data enhancement will be skipped  **Required fields**: Name with either birthDate or ssn.
     */
    // @Disabled("dato tull")
    @Test
    public void b2CIdentifyAndScreeningRequestTest() throws IdfyException, Exception {
        String name = new String("123");
        String ssn = new String("123");
        String birthDate = new String("123");
        String nationality = new String("123");
        String language = new String("123");
        Boolean includeReport = true;
        String mode = new String("123");
        PersonAmlResponse response = api.b2CIdentifyAndScreeningRequest(name, ssn, birthDate, nationality, language, includeReport, mode);
        assertNotNull(response);
    }
    

}
