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
import io.idfy.admin.models.AccountListItem;
import io.idfy.admin.models.Dealer;
import io.idfy.admin.models.DealerLogo;
import java.util.UUID;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for DealerService
 */

public class DealerServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final AdminService api = new AdminService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * List accounts for dealer
     *
     * Requires the following scope: [dealer-read]
     */
    @Test
    public void listAccountsForDealerTest() throws IdfyException, Exception {
        UUID dealerId = UUID.randomUUID();
        AccountListItem[] response = api.listAccountsForDealer(dealerId);
        assertNotNull(response);
    }
    
    /**
     * Retrieve dealer
     *
     * Requires the following scope: [dealer]
     */
    @Test
    public void retrieveDealerTest() throws IdfyException, Exception {
        UUID dealerId = UUID.randomUUID();
        Dealer response = api.retrieveDealer(dealerId);
        assertNotNull(response);
    }
    
    /**
     * Update dealer
     *
     * Update dealer credentials. Requires the following scope: [dealer]
     */
    @Test
    public void updateDealerTest() throws IdfyException, Exception {
        UUID dealerId = UUID.randomUUID();
        Dealer dealer =  new Dealer.Builder().build();
        Dealer response = api.updateDealer(dealerId, dealer);
        assertNotNull(response);
    }
    
    /**
     * Update dealer logo
     *
     * Set dealer Logo. Requires the following scope: [dealer]
     */
    @Disabled
    @Test
    public void updateDealerLogoTest() throws IdfyException, Exception {
        UUID dealerId = UUID.randomUUID();
        DealerLogo dealerLogo =  new DealerLogo.Builder().build();
        String response = api.updateDealerLogo(dealerId, dealerLogo);
        assertNotNull(response);
    }
    

}
