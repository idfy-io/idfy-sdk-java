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
import io.idfy.admin.models.Transaction;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for InvoiceService
 */

public class InvoiceServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final AdminService api = new AdminService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * List account transactions
     *
     * Returns a list of transactions for the requested account. Requires on of the following scopes: [dealer, account-read, root]
     */
    @Disabled
    @Test
    public void listAccountTransactionsTest() throws IdfyException, Exception {
        Integer year = 123;
        Integer month = 123;
        Boolean getAsCsv = true;
        Transaction[] response = api.listAccountTransactions(year, month, getAsCsv);
        assertNotNull(response);
    }
    

}
