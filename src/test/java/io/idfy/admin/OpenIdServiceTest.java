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
import io.idfy.admin.models.CreateOpenIdClientRequest;
import io.idfy.admin.models.OauthClientId;
import io.idfy.admin.models.OauthClientListItemResponse;
import io.idfy.admin.models.OpenIdClientResponse;
import io.idfy.admin.models.UpdateOpenIdClientRequest;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for OpenIdService
 */

public class OpenIdServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final AdminService api = new AdminService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create OpenId client
     *
     * Create a new openId client for the requested account. Requires on of the following scopes: [root]
     */
    @Test
    public void createOpenidClientTest() throws IdfyException, Exception {
        CreateOpenIdClientRequest client =  new CreateOpenIdClientRequest.Builder().build();
        OpenIdClientResponse response = api.createOpenidClient(client);
        assertNotNull(response);
    }
    
    /**
     * Delete OpenId client
     *
     * Requires on of the following scopes: [dealer,  openid-client, root]
     */
    @Test
    public void deleteOpenidClientTest() throws IdfyException, Exception {
        String clientId = new String("123");
        api.deleteOpenidClient(clientId);
    }
    
    /**
     * Disable OpenId client
     *
     * Deactivates the requested oauth client. Requires on of the following scopes: [dealer,  openid-client, root]
     */
    @Test
    public void disableOpenidClientTest() throws IdfyException, Exception {
        OauthClientId request =  new OauthClientId.Builder().build();
        api.disableOpenidClient(request);
    }
    
    /**
     * Enable OpenId client
     *
     * Requires on of the following scopes: [dealer,  openid-client, root]
     */
    @Test
    public void enableOpenidClientTest() throws IdfyException, Exception {
        OauthClientId request =  new OauthClientId.Builder().build();
        api.enableOpenidClient(request);
    }
    
    /**
     * List OpenId clients for account
     *
     * Returns a list of all oauth clients registered on requested account. Requires on of the following scopes: [dealer,  openid-client, root]
     */
    @Test
    public void listOpenidClientsForAccountTest() throws IdfyException, Exception {
        OauthClientListItemResponse[] response = api.listOpenidClientsForAccount();
        assertNotNull(response);
    }
    
    /**
     * Retrieve OpenId client
     *
     * Returns the requested oauth client with settings. Requires on of the following scopes: [dealer,  openid-client, root]
     */
    @Test
    public void retrieveOpenidClientTest() throws IdfyException, Exception {
        String clientId = new String("123");
        OpenIdClientResponse response = api.retrieveOpenidClient(clientId);
        assertNotNull(response);
    }
    
    /**
     * Update OpenId client
     *
     * Updates the requested openid client on the requested account. Requires on of the following scopes: [dealer,  openid-client, root]
     */
    @Test
    public void updateOpenidClientTest() throws IdfyException, Exception {
        UpdateOpenIdClientRequest client =  new UpdateOpenIdClientRequest.Builder().build();
        OpenIdClientResponse response = api.updateOpenidClient(client);
        assertNotNull(response);
    }
    

}
