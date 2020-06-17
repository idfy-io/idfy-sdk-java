package io.idfy.identificationV2;

import io.idfy.OAuthScope;
import io.idfy.identificationV2.models.IdProvider;
import io.idfy.identificationV2.models.TranslationLanguage;
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
 * API tests for IdProvidersApi
 */

public class IdProvidersApiTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final IdentificationServiceV2 api = new IdentificationServiceV2("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
        IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    /**
     * List ID providers
     *
     * Returns a list of all the supported ID providers.
     */
    @Test
    public void listIDProvidersTest() throws IdfyException, Exception {
        TranslationLanguage language = TranslationLanguage.EN;
        IdProvider[] response = api.listIDProviders(language);
        assertNotNull(response);
    }
    /**
     * List ID providers for account
     *
     * Returns a list of all the ID providers available for the requester's account.
     */
    @Test
    public void listIDProvidersForAccountTest() throws IdfyException, Exception {
        TranslationLanguage language = TranslationLanguage.EN;
        IdProvider[] response = api.listIDProvidersForAccount(language);
        assertNotNull(response);
    }

}
