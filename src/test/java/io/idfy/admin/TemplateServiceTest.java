/*
 * Idfy.Admin
 * In this API you can manage your account details, logo, styling or manage your openid / oauth api clients. If you are a dealer you can also manage the accounts registered to this dealer.   ## Last update   Last build date for this API: 14.01.2018  
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */


package io.idfy.admin;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.admin.models.CreatePdfTemplate;
import io.idfy.admin.models.PdfTemplate;
import io.idfy.admin.models.PdfTemplateListItem;
import io.idfy.admin.models.TemplatePreview;
import io.idfy.admin.models.TemplateWithIdPreview;
import java.util.UUID;
import io.idfy.admin.models.UpdatePdfTemplate;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for TemplateService
 */

public class TemplateServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final AdminService api = new AdminService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create template
     *
     * Creates a new PDF template
     */
    @Test
    public void createTemplateTest() throws IdfyException, Exception {
        CreatePdfTemplate model =  new CreatePdfTemplate.Builder().build();
        PdfTemplate response = api.createTemplate(model);
        assertNotNull(response);
    }
    
    /**
     * Delete template
     *
     * Deletes the PDF template
     */
    @Test
    public void deleteTemplateTest() throws IdfyException, Exception {
        UUID id = UUID.randomUUID();
        api.deleteTemplate(id);
    }
    
    /**
     * List templates for account
     *
     * Lists all the PDF template for the account
     */
    @Test
    public void listTemplatesForAccountTest() throws IdfyException, Exception {
        PdfTemplateListItem[] response = api.listTemplatesForAccount();
        assertNotNull(response);
    }
    
    /**
     * Preview template from id
     *
     * Preview your PAdES template use your own signature file or choose the xmlTemplate prefilled
     */
    @Test
    public void previewTemplateFromIdTest() throws IdfyException, Exception {
        TemplateWithIdPreview model =  new TemplateWithIdPreview.Builder().build();
        UUID id = UUID.randomUUID();
        String xmlTemplate = new String("123");
        api.previewTemplateFromId(model, id, xmlTemplate);
    }
    
    /**
     * Preview template from model
     *
     * Preview your PAdES template use your own signature file or choose the xmlTemplate prefilled
     */
    @Test
    public void previewTemplateFromModelTest() throws IdfyException, Exception {
        TemplatePreview model =  new TemplatePreview.Builder().build();
        String xmlTemplate = new String("123");
        api.previewTemplateFromModel(model, xmlTemplate);
    }
    
    /**
     * Retrieve data source
     *
     * Preview the underlaying template datasource
     */
    @Test
    public void retrieveDataSourceTest() throws IdfyException, Exception {
        TemplatePreview model =  new TemplatePreview.Builder().build();
        String xmlTempalte = new String("123");
        api.retrieveDataSource(model, xmlTempalte);
    }
    
    /**
     * Retrieve default coverpage template
     *
     * Gets the HTML used as a template for the details page if not overridden by user
     */
    @Test
    public void retrieveDefaultCoverpageTemplateTest() throws IdfyException, Exception {
        PdfTemplate response = api.retrieveDefaultCoverpageTemplate();
        assertNotNull(response);
    }
    
    /**
     * Retrieve default details template
     *
     * Gets the HTML used as a template for the details page if not overridden by user
     */
    @Disabled("Endpoint returns 'string'.")
    @Test
    public void retrieveDefaultDetailsTemplateTest() throws IdfyException, Exception {
        String language = new String("123");
        String response = api.retrieveDefaultDetailsTemplate(language);
        assertNotNull(response);
    }
    
    /**
     * Retrieve template
     *
     * Gets a PDF template
     */
    @Test
    public void retrieveTemplateTest() throws IdfyException, Exception {
        UUID id = UUID.randomUUID();
        PdfTemplate response = api.retrieveTemplate(id);
        assertNotNull(response);
    }
    
    /**
     * Update template
     *
     * Updates the given PDF template
     */
    @Test
    public void updateTemplateTest() throws IdfyException, Exception {
        UUID id = UUID.randomUUID();
        UpdatePdfTemplate model =  new UpdatePdfTemplate.Builder().build();
        PdfTemplate response = api.updateTemplate(id, model);
        assertNotNull(response);
    }
    

}
