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
import io.idfy.text.models.LanguageSetCreateDTO;
import io.idfy.text.models.LanguageSetDTO;
import io.idfy.text.models.LanguageSetUpdateDTO;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for LanguageSetsService
 */

public class LanguageSetsServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final TextService api = new TextService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create language set
     *
     * Creates a new language set.
     */
    @Test
    public void createLanguageSetTest() throws IdfyException, Exception {
        LanguageSetCreateDTO newLanguageSet =  new LanguageSetCreateDTO.Builder().build();
        LanguageSetDTO response = api.createLanguageSet(newLanguageSet);
        assertNotNull(response);
    }
    
    /**
     * Delete language set
     *
     * Deletes the specified language set.
     */
    @Test
    public void deleteLanguageSetTest() throws IdfyException, Exception {
        Integer id = 123;
        api.deleteLanguageSet(id);
    }
    
    /**
     * List language sets
     *
     * Returns a list of all your language sets.
     */
    @Test
    public void listLanguageSetsTest() throws IdfyException, Exception {
        LanguageSetDTO[] response = api.listLanguageSets();
        assertNotNull(response);
    }
    
    /**
     * Retrieve language set
     *
     * Retrieves the details of a single language set.
     */
    @Test
    public void retrieveLanguageSetTest() throws IdfyException, Exception {
        Integer id = 123;
        LanguageSetDTO response = api.retrieveLanguageSet(id);
        assertNotNull(response);
    }
    
    /**
     * Update language set
     *
     * Updates the specified language set with the parameters passed.
     */
    @Test
    public void updateLanguageSetTest() throws IdfyException, Exception {
        Integer id = 123;
        LanguageSetUpdateDTO languageSetUpdate =  new LanguageSetUpdateDTO.Builder().build();
        LanguageSetDTO response = api.updateLanguageSet(id, languageSetUpdate);
        assertNotNull(response);
    }
    

}
