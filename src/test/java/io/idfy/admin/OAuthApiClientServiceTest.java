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
import io.idfy.admin.models.CreateOauthAPIClientRequest;
import io.idfy.admin.models.OauthAPIClientResponse;
import io.idfy.admin.models.OauthClientId;
import io.idfy.admin.models.OauthClientListItemResponse;
import io.idfy.admin.models.UpdateOauthAPIClientRequest;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for OAuthApiClientService
 */

public class OAuthApiClientServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final AdminService api = new AdminService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create OAuth client
     *
     * Create a new oauth api client for the requested account. Requires on of the following scopes: [dealer,  oauth-token, root]
     */
    @Test
    public void createOauthClientTest() throws IdfyException, Exception {
        CreateOauthAPIClientRequest _apiClient =  new CreateOauthAPIClientRequest.Builder().build();
        OauthAPIClientResponse response = api.createOauthClient(_apiClient);
        assertNotNull(response);
    }
    
    /**
     * Delete OAuth client
     *
     * Delete oauth API client.  Requires on of the following scopes: [dealer,  oauth-token, root]
     */
    @Test
    public void deleteOauthClientTest() throws IdfyException, Exception {
        String clientId = new String("123");
        api.deleteOauthClient(clientId);
    }
    
    /**
     * Disable OAuth client
     *
     * Deactivates the requested oauth client. Requires on of the following scopes: [dealer,  oauth-token, root]
     */
    @Test
    public void disableOauthClientTest() throws IdfyException, Exception {
        OauthClientId request =  new OauthClientId.Builder().build();
        api.disableOauthClient(request);
    }
    
    /**
     * Enable OAuth client
     *
     * Activates the requested oauth client. Requires on of the following scopes: [dealer,  oauth-token, root]
     */
    @Test
    public void enableOauthClientTest() throws IdfyException, Exception {
        OauthClientId request =  new OauthClientId.Builder().build();
        api.enableOauthClient(request);
    }
    
    /**
     * List OAuth clients
     *
     * Returns a list of all oauth clients registered on requested account. Requires on of the following scopes: [dealer,  oauth-token, root]
     */
    @Test
    public void listOauthClientsTest() throws IdfyException, Exception {
        OauthClientListItemResponse[] response = api.listOauthClients();
        assertNotNull(response);
    }
    
    /**
     * Retrieve OAuth client
     *
     * Returns the requested oauth client with settings. Requires on of the following scopes: [dealer,  oauth-token, root]
     */
    @Test
    public void retrieveOauthClientTest() throws IdfyException, Exception {
        String clientId = new String("123");
        OauthAPIClientResponse response = api.retrieveOauthClient(clientId);
        assertNotNull(response);
    }
    
    /**
     * Update OAuth client
     *
     * Updates the requested oauth client on the requested account. Requires on of the following scopes: [dealer,  oauth-token, root]
     */
    @Test
    public void updateOauthClientTest() throws IdfyException, Exception {
        UpdateOauthAPIClientRequest _apiClient =  new UpdateOauthAPIClientRequest.Builder().build();
        OauthAPIClientResponse response = api.updateOauthClient(_apiClient);
        assertNotNull(response);
    }
    

}
