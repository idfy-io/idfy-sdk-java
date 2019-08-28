/*
 * Idfy Text
 * This endpoint lets you customize the texts used by various Idfy services.
 *
 * OpenAPI spec version: v1
 * 
 */


package io.idfy.text;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.text.models.LanguageDTO;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for LanguagesService
 */

public class LanguagesServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final TextService api = new TextService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * List all languages
     *
     * Returns a list of all supported languages.
     */
    @Test
    public void listAllLanguagesTest() throws IdfyException, Exception {
        LanguageDTO response = api.listAllLanguages();
        assertNotNull(response);
    }
    
    /**
     * Retrieve language
     *
     * 
     */
    @Test
    public void retrieveLanguageTest() throws IdfyException, Exception {
        Integer id = 123;
        LanguageDTO response = api.retrieveLanguage(id);
        assertNotNull(response);
    }
    

}
