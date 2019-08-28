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
import io.idfy.identification.models.IdentificationLogItem;
import io.idfy.identification.models.ListResultIdentificationLogItem;
import java.util.UUID;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for LogService
 */

public class LogServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final IdentificationService api = new IdentificationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * List log entries
     *
     * Gets an  list of historic identification sessions (older than 14 days) by the filter below fetched the last 1000 with a link to next page.   Remark: Log entries are updated with a little delay (min 5 minutes max 25 minutes).
     */
    @Test
    public void listLogEntriesTest() throws IdfyException, Exception {
        Integer year = 123;
        Integer month = 123;
        Integer day = 123;
        String status = new String("123");
        String identityProviderType = new String("123");
        String externalId = new String("123");
        String name = new String("123");
        Integer skip = 123;
        Integer pageSize = 123;
        ListResultIdentificationLogItem response = api.listLogEntries(year, month, day, status, identityProviderType, externalId, name, skip, pageSize);
        assertNotNull(response);
    }
    
    /**
     * Retrieve a log entry
     *
     * Gets an historic identification session (older than 14 days)  Remark: Log entries are updated with a little delay (min 5 minutes max 25 minutes).
     */
    @Test
    public void retrieveALogEntryTest() throws IdfyException, Exception {
        String requestId = new String("123");
        UUID accountId = UUID.randomUUID();
        IdentificationLogItem response = api.retrieveALogEntry(requestId, accountId);
        assertNotNull(response);
    }
    

}
