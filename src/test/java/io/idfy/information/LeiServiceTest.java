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
import io.idfy.information.models.LeiRecord;
import io.idfy.information.models.SearchResult;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for LeiService
 */

public class LeiServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final InformationService api = new InformationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Query LEI records
     *
     * QueryLeiRecords for LEI-registered entities with filters
     */
    @Test
    public void queryLEIRecordsTest() throws IdfyException, Exception {
        String countryCode = new String("123");
        String lei = new String("123");
        String legalNameContains = new String("123");
        String legalNameEquals = new String("123");
        String registrationAuthorityEntityId = new String("123");
        Integer pageSize = 123;
        Integer page = 123;
        SearchResult response = api.queryLEIRecords(countryCode, lei, legalNameContains, legalNameEquals, registrationAuthorityEntityId, pageSize, page);
        assertNotNull(response);
    }
    
    /**
     * Retrieve LEI record
     *
     * Retrieve the entity record for a given LEI
     */
    @Test
    public void retrieveLEIRecordTest() throws IdfyException, Exception {
        String lei = new String("123");
        LeiRecord response = api.retrieveLEIRecord(lei);
        assertNotNull(response);
    }
    

}
