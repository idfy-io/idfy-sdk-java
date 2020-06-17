package io.idfy.identificationV2;


import io.idfy.OAuthScope;
import io.idfy.identificationV2.models.IdSession;
import io.idfy.identificationV2.models.IdSessionCreate;
import io.idfy.identificationV2.models.PaginatedDataDto1;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for SessionsApi
 */

public class SessionsApiTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final IdentificationServiceV2 api = new IdentificationServiceV2("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
        IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    /**
     * Create session
     *
     * Creates a new identification session.
     */
    @Test
    public void createSessionTest() throws IdfyException, Exception {
        IdSessionCreate body =  new IdSessionCreate.Builder().build();
        IdSession response = api.createSession(body);
        assertNotNull(response);
    }
    /**
     * Invalidate session
     *
     * Invalidates the specified identification session.
     */
    @Test
    public void invalidateSessionTest() throws IdfyException, Exception {
        String id = new String("123");
        api.invalidateSession(id);
    }
    /**
     * List sessions
     *
     * Returns a list of previously created sessions. The session data returned from this endpoint does not contain any personal information.
     */
    @Test
    public void listSessionsTest() throws IdfyException, Exception {
        String cursor = new String("123");
        Integer limit = 123;
        PaginatedDataDto1 response = api.listSessions(cursor, limit);
        assertNotNull(response);
    }
    /**
     * Retrieve session
     *
     * Retrieves the details of a single identification session.
     */
    @Disabled("Can't deserialize date of birth to java.time.OffsetDatetime")
    @Test()
    public void retrieveSessionTest() throws IdfyException, Exception {
        String id = new String("123");
        IdSession response = api.retrieveSession(id);
        assertNotNull(response);
    }

}