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
import io.idfy.text.models.TranslationDTO;
import io.idfy.text.models.TranslationUpdateDTO;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for TranslationsService
 */

public class TranslationsServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final TextService api = new TextService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * List translations
     *
     * Returns a list of all your translations for the given language set.
     */
    @Test
    public void listTranslationsTest() throws IdfyException, Exception {
        Integer languageSetId = 123;
        Integer translationKeyGroupId = 123;
        String language = new String("123");
        String format = new String("123");
        TranslationDTO[] response = api.listTranslations(languageSetId, translationKeyGroupId, language, format);
        assertNotNull(response);
    }
    
    /**
     * Retrieve translation
     *
     * Retrieves the details of a single translation.
     */
    @Test
    public void retrieveTranslationTest() throws IdfyException, Exception {
        Integer languageSetId = 123;
        Integer subjectId = 123;
        String languageCode = new String("123");
        TranslationDTO response = api.retrieveTranslation(languageSetId, subjectId, languageCode);
        assertNotNull(response);
    }
    
    /**
     * Update translation
     *
     * Updates the specified translation with the parameters passed.
     */
    @Test
    public void updateTranslationTest() throws IdfyException, Exception {
        Integer languageSetId = 123;
        Integer subjectId = 123;
        String languageCode = new String("123");
        TranslationUpdateDTO translationUpdate =  new TranslationUpdateDTO.Builder().build();
        api.updateTranslation(languageSetId, subjectId, languageCode, translationUpdate);
    }
    

}
