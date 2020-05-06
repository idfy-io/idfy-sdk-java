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
import io.idfy.admin.models.Account;
import io.idfy.admin.models.AccountListItem;
import io.idfy.admin.models.AccountLogo;
import io.idfy.admin.models.AccountNameItem;
import io.idfy.admin.models.CreateAccountRequest;
import java.time.OffsetDateTime;
import io.idfy.admin.models.Styling;
import io.idfy.admin.models.UpdateAccountRequest;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for AccountService
 */

public class AccountServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final AdminService api = new AdminService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create account
     *
     * Requires one of the following scopes: [dealer]
     */
    @Disabled
    @Test
    public void createAccountTest() throws IdfyException, Exception {
        CreateAccountRequest accountDetails =  new CreateAccountRequest.Builder().build();
        Account response = api.createAccount(accountDetails);
        assertNotNull(response);
    }
    
    /**
     * Disable account
     *
     * Set the account as incative / disabled. Requires one of the following scopes: [root, account-write, dealer]
     */
    @Test
    public void disableAccountTest() throws IdfyException, Exception {
        api.disableAccount();
    }
    
    /**
     * List account names
     *
     * List names of accounts you have access to
     */
    @Test
    public void listAccountNamesTest() throws IdfyException, Exception {
        AccountNameItem[] response = api.listAccountNames();
        assertNotNull(response);
    }
    
    /**
     * List accounts
     *
     * List accounts you have access to
     */
    @Test
    public void listAccountsTest() throws IdfyException, Exception {
        String filterName = new String("123");
        String filterOrgNo = new String("123");
        String filterUniCustomerNo = new String("123");
        OffsetDateTime filterCreatedBefore = OffsetDateTime.now();
        OffsetDateTime filterCreatedAfter = OffsetDateTime.now();
        OffsetDateTime filterLastModifiedBefore = OffsetDateTime.now();
        OffsetDateTime filterLastModifiedAfter = OffsetDateTime.now();
        String filterDealerName = new String("123");
        String filterDealerReference = new String("123");
        Boolean filterEnabled = true;
        AccountListItem[] response = api.listAccounts(filterName, filterOrgNo, filterUniCustomerNo, filterCreatedBefore, filterCreatedAfter, filterLastModifiedBefore, filterLastModifiedAfter, filterDealerName, filterDealerReference, filterEnabled);
        assertNotNull(response);
    }
    
    /**
     * Retrieve account
     *
     * Requires one of the following scopes: [root, account-read, dealer]
     */
    @Test
    public void retrieveAccountTest() throws IdfyException, Exception {
        Account response = api.retrieveAccount();
        assertNotNull(response);
    }
    
    /**
     * Retrieve account queue connection string
     *
     * Get / create event connection string for the .net event servicebus
     */
    @Disabled("Mock server returns 200 with empty body instead of 201")
    @Test
    public void retrieveAccountQueueConnectionStringTest() throws IdfyException, Exception {
        api.retrieveAccountQueueConnectionString();
    }
    
    /**
     * Update account
     *
     * Requires one of the following scopes: [root, account-write, dealer]
     */
    @Test
    public void updateAccountTest() throws IdfyException, Exception {
        UpdateAccountRequest accountDetails =  new UpdateAccountRequest.Builder().build();
        Account response = api.updateAccount(accountDetails);
        assertNotNull(response);
    }
    
    /**
     * Update account logo
     *
     * Upload / Update and resize account logo. Returns a url with your uploaded / resized logo. Requires one of the following scopes: [root, account-write, dealer]
     */
    @Disabled("Endpoint returns string")
    @Test
    public void updateAccountLogoTest() throws IdfyException, Exception {
        AccountLogo accountLogo =  new AccountLogo.Builder().build();
        String response = api.updateAccountLogo(accountLogo);
        assertNotNull(response);
    }
    
    /**
     * Update account styling
     *
     * Upload / Update custom account css. Returns a url with your uploaded css. Requires one of the following scopes: [root, account-write, dealer]
     */
    @Test
    public void updateAccountStylingTest() throws IdfyException, Exception {
        Styling styling =  new Styling.Builder().build();
        api.updateAccountStyling(styling);
    }
    

}
