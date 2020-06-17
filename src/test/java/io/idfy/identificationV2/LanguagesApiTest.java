package io.idfy.identificationV2;

import io.idfy.OAuthScope;
import io.idfy.identificationV2.models.LanguageDetails;
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
 * API tests for LanguagesApi
 */

public class LanguagesApiTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final IdentificationServiceV2 api = new IdentificationServiceV2("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
        IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    /**
     * List languages
     *
     * Returns a list of supported languages.
     */
    @Test
    public void listLanguagesTest() throws IdfyException, Exception {
        LanguageDetails[] response = api.listLanguages();
        assertNotNull(response);
    }

}
