package io.idfy.admin;

import io.idfy.IdfyBaseService;
import io.idfy.OAuthScope;
import io.idfy.Urls;
import io.idfy.admin.models.*;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;
import okhttp3.HttpUrl;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class AdminService extends IdfyBaseService {
    public AdminService() {
        super();
    }

    public AdminService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    // AccountService

    /**
     * Create account
     * Requires one of the following scopes: [dealer]
     * @param accountDetails  (required)
     * @return Account
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Account createAccount(CreateAccountRequest accountDetails) throws Exception, IdfyException {
        Object localVarPostBody = accountDetails;
        // create path and map variables
        String localVarPath = "/account";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), accountDetails, Account.class);
    }

    /**
     * Create account (asynchronously)
     * Requires one of the following scopes: [dealer]
     * @param accountDetails  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Account> createAccountAsync(CreateAccountRequest accountDetails) throws Exception, IdfyException {
        Object localVarPostBody = accountDetails;
        // create path and map variables
        String localVarPath = "/account";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), accountDetails, Account.class);
    }


    /**
     * Disable account
     * Set the account as incative / disabled. Requires one of the following scopes: [root, account-write, dealer]
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void disableAccount() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/account/disable";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        post(url.build());
    }

    /**
     * Disable account (asynchronously)
     * Set the account as incative / disabled. Requires one of the following scopes: [root, account-write, dealer]
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> disableAccountAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/account/disable";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build());
    }


    /**
     * List account names
     * List names of accounts you have access to
     * @return AccountNameItem
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountNameItem[] listAccountNames() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/account/list/names";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), AccountNameItem[].class);
    }

    /**
     * List account names (asynchronously)
     * List names of accounts you have access to
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<AccountNameItem[]> listAccountNamesAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/account/list/names";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), AccountNameItem[].class);
    }


    /**
     * List accounts
     * List accounts you have access to
     * @param filterName  (optional)
     * @param filterOrgNo  (optional)
     * @param filterUniCustomerNo  (optional)
     * @param filterCreatedBefore  (optional)
     * @param filterCreatedAfter  (optional)
     * @param filterLastModifiedBefore  (optional)
     * @param filterLastModifiedAfter  (optional)
     * @param filterDealerName  (optional)
     * @param filterDealerReference  (optional)
     * @param filterEnabled  (optional)
     * @return AccountListItem
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountListItem[] listAccounts(String filterName, String filterOrgNo, String filterUniCustomerNo, OffsetDateTime filterCreatedBefore, OffsetDateTime filterCreatedAfter, OffsetDateTime filterLastModifiedBefore, OffsetDateTime filterLastModifiedAfter, String filterDealerName, String filterDealerReference, Boolean filterEnabled) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/account/list";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (filterName != null) {
            url.addQueryParameter("filter.name", filterName.toString());}
        if (filterOrgNo != null) {
            url.addQueryParameter("filter.orgNo", filterOrgNo.toString());}
        if (filterUniCustomerNo != null) {
            url.addQueryParameter("filter.uniCustomerNo", filterUniCustomerNo.toString());}
        if (filterCreatedBefore != null) {
            url.addQueryParameter("filter.createdBefore", filterCreatedBefore.toString());}
        if (filterCreatedAfter != null) {
            url.addQueryParameter("filter.createdAfter", filterCreatedAfter.toString());}
        if (filterLastModifiedBefore != null) {
            url.addQueryParameter("filter.lastModifiedBefore", filterLastModifiedBefore.toString());}
        if (filterLastModifiedAfter != null) {
            url.addQueryParameter("filter.lastModifiedAfter", filterLastModifiedAfter.toString());}
        if (filterDealerName != null) {
            url.addQueryParameter("filter.dealerName", filterDealerName.toString());}
        if (filterDealerReference != null) {
            url.addQueryParameter("filter.dealerReference", filterDealerReference.toString());}
        if (filterEnabled != null) {
            url.addQueryParameter("filter.enabled", filterEnabled.toString());}

        return get(url.build(), AccountListItem[].class);
    }

    /**
     * List accounts (asynchronously)
     * List accounts you have access to
     * @param filterName  (optional)
     * @param filterOrgNo  (optional)
     * @param filterUniCustomerNo  (optional)
     * @param filterCreatedBefore  (optional)
     * @param filterCreatedAfter  (optional)
     * @param filterLastModifiedBefore  (optional)
     * @param filterLastModifiedAfter  (optional)
     * @param filterDealerName  (optional)
     * @param filterDealerReference  (optional)
     * @param filterEnabled  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<AccountListItem[]> listAccountsAsync(String filterName, String filterOrgNo, String filterUniCustomerNo, OffsetDateTime filterCreatedBefore, OffsetDateTime filterCreatedAfter, OffsetDateTime filterLastModifiedBefore, OffsetDateTime filterLastModifiedAfter, String filterDealerName, String filterDealerReference, Boolean filterEnabled) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/account/list";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (filterName != null) {
            url.addQueryParameter("filter.name", filterName.toString());}
        if (filterOrgNo != null) {
            url.addQueryParameter("filter.orgNo", filterOrgNo.toString());}
        if (filterUniCustomerNo != null) {
            url.addQueryParameter("filter.uniCustomerNo", filterUniCustomerNo.toString());}
        if (filterCreatedBefore != null) {
            url.addQueryParameter("filter.createdBefore", filterCreatedBefore.toString());}
        if (filterCreatedAfter != null) {
            url.addQueryParameter("filter.createdAfter", filterCreatedAfter.toString());}
        if (filterLastModifiedBefore != null) {
            url.addQueryParameter("filter.lastModifiedBefore", filterLastModifiedBefore.toString());}
        if (filterLastModifiedAfter != null) {
            url.addQueryParameter("filter.lastModifiedAfter", filterLastModifiedAfter.toString());}
        if (filterDealerName != null) {
            url.addQueryParameter("filter.dealerName", filterDealerName.toString());}
        if (filterDealerReference != null) {
            url.addQueryParameter("filter.dealerReference", filterDealerReference.toString());}
        if (filterEnabled != null) {
            url.addQueryParameter("filter.enabled", filterEnabled.toString());}

        return getAsync(url.build(), AccountListItem[].class);
    }


    /**
     * Retrieve account
     * Requires one of the following scopes: [root, account-read, dealer]
     * @return Account
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Account retrieveAccount() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/account";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), Account.class);
    }

    /**
     * Retrieve account (asynchronously)
     * Requires one of the following scopes: [root, account-read, dealer]
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Account> retrieveAccountAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/account";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), Account.class);
    }


    /**
     * Retrieve account queue connection string
     * Get / create event connection string for the .net event servicebus
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void retrieveAccountQueueConnectionString() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/account/events/connectionstring";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        get(url.build());
    }

    /**
     * Retrieve account queue connection string (asynchronously)
     * Get / create event connection string for the .net event servicebus
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> retrieveAccountQueueConnectionStringAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/account/events/connectionstring";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build());
    }


    /**
     * Update account
     * Requires one of the following scopes: [root, account-write, dealer]
     * @param accountDetails  (required)
     * @return Account
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Account updateAccount(UpdateAccountRequest accountDetails) throws Exception, IdfyException {
        Object localVarPostBody = accountDetails;
        // create path and map variables
        String localVarPath = "/account";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return put(url.build(), accountDetails, Account.class);
    }

    /**
     * Update account (asynchronously)
     * Requires one of the following scopes: [root, account-write, dealer]
     * @param accountDetails  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Account> updateAccountAsync(UpdateAccountRequest accountDetails) throws Exception, IdfyException {
        Object localVarPostBody = accountDetails;
        // create path and map variables
        String localVarPath = "/account";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return putAsync(url.build(), accountDetails, Account.class);
    }


    /**
     * Update account logo
     * Upload / Update and resize account logo. Returns a url with your uploaded / resized logo. Requires one of the following scopes: [root, account-write, dealer]
     * @param accountLogo  (required)
     * @return String
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String updateAccountLogo(AccountLogo accountLogo) throws Exception, IdfyException {
        Object localVarPostBody = accountLogo;
        // create path and map variables
        String localVarPath = "/account/logo";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), accountLogo, String.class);
    }

    /**
     * Update account logo (asynchronously)
     * Upload / Update and resize account logo. Returns a url with your uploaded / resized logo. Requires one of the following scopes: [root, account-write, dealer]
     * @param accountLogo  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<String> updateAccountLogoAsync(AccountLogo accountLogo) throws Exception, IdfyException {
        Object localVarPostBody = accountLogo;
        // create path and map variables
        String localVarPath = "/account/logo";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), accountLogo, String.class);
    }


    /**
     * Update account styling
     * Upload / Update custom account css. Returns a url with your uploaded css. Requires one of the following scopes: [root, account-write, dealer]
     * @param styling  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateAccountStyling(Styling styling) throws Exception, IdfyException {
        Object localVarPostBody = styling;
        // create path and map variables
        String localVarPath = "/account/styling";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        post(url.build(), styling);
    }

    /**
     * Update account styling (asynchronously)
     * Upload / Update custom account css. Returns a url with your uploaded css. Requires one of the following scopes: [root, account-write, dealer]
     * @param styling  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> updateAccountStylingAsync(Styling styling) throws Exception, IdfyException {
        Object localVarPostBody = styling;
        // create path and map variables
        String localVarPath = "/account/styling";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), styling);
    }

    // DealerService

    /**
     * List accounts for dealer
     * Requires the following scope: [dealer-read]
     * @param dealerId Your Idfy dealer ID (required)
     * @return AccountListItem
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountListItem[] listAccountsForDealer(UUID dealerId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/dealer/{dealerId}/accounts"
                .replaceAll("\\{" + "dealerId" + "\\}", Encoder.escapeString(dealerId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), AccountListItem[].class);
    }

    /**
     * List accounts for dealer (asynchronously)
     * Requires the following scope: [dealer-read]
     * @param dealerId Your Idfy dealer ID (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<AccountListItem[]> listAccountsForDealerAsync(UUID dealerId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/dealer/{dealerId}/accounts"
                .replaceAll("\\{" + "dealerId" + "\\}", Encoder.escapeString(dealerId.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), AccountListItem[].class);
    }


    /**
     * Retrieve dealer
     * Requires the following scope: [dealer]
     * @param dealerId Your Idfy dealer ID (required)
     * @return Dealer
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dealer retrieveDealer(UUID dealerId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/dealer/{dealerId}"
                .replaceAll("\\{" + "dealerId" + "\\}", Encoder.escapeString(dealerId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), Dealer.class);
    }

    /**
     * Retrieve dealer (asynchronously)
     * Requires the following scope: [dealer]
     * @param dealerId Your Idfy dealer ID (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Dealer> retrieveDealerAsync(UUID dealerId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/dealer/{dealerId}"
                .replaceAll("\\{" + "dealerId" + "\\}", Encoder.escapeString(dealerId.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), Dealer.class);
    }


    /**
     * Update dealer
     * Update dealer credentials. Requires the following scope: [dealer]
     * @param dealerId Your Idfy dealer ID (required)
     * @param dealer  (required)
     * @return Dealer
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dealer updateDealer(UUID dealerId, Dealer dealer) throws Exception, IdfyException {
        Object localVarPostBody = dealer;
        // create path and map variables
        String localVarPath = "/dealer/{dealerId}"
                .replaceAll("\\{" + "dealerId" + "\\}", Encoder.escapeString(dealerId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), dealer, Dealer.class);
    }

    /**
     * Update dealer (asynchronously)
     * Update dealer credentials. Requires the following scope: [dealer]
     * @param dealerId Your Idfy dealer ID (required)
     * @param dealer  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Dealer> updateDealerAsync(UUID dealerId, Dealer dealer) throws Exception, IdfyException {
        Object localVarPostBody = dealer;
        // create path and map variables
        String localVarPath = "/dealer/{dealerId}"
                .replaceAll("\\{" + "dealerId" + "\\}", Encoder.escapeString(dealerId.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), dealer, Dealer.class);
    }


    /**
     * Update dealer logo
     * Set dealer Logo. Requires the following scope: [dealer]
     * @param dealerId Your Idfy dealer ID (required)
     * @param dealerLogo  (required)
     * @return String
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String updateDealerLogo(UUID dealerId, DealerLogo dealerLogo) throws Exception, IdfyException {
        Object localVarPostBody = dealerLogo;
        // create path and map variables
        String localVarPath = "/dealer/logo/{dealerId}"
                .replaceAll("\\{" + "dealerId" + "\\}", Encoder.escapeString(dealerId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), dealerLogo, String.class);
    }

    /**
     * Update dealer logo (asynchronously)
     * Set dealer Logo. Requires the following scope: [dealer]
     * @param dealerId Your Idfy dealer ID (required)
     * @param dealerLogo  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<String> updateDealerLogoAsync(UUID dealerId, DealerLogo dealerLogo) throws Exception, IdfyException {
        Object localVarPostBody = dealerLogo;
        // create path and map variables
        String localVarPath = "/dealer/logo/{dealerId}"
                .replaceAll("\\{" + "dealerId" + "\\}", Encoder.escapeString(dealerId.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), dealerLogo, String.class);
    }

    // InvoiceService

    /**
     * List account transactions
     * Returns a list of transactions for the requested account. Requires on of the following scopes: [dealer, account-read, root]
     * @param year Define a year (required)
     * @param month Define a month (0 - 12), not required (optional)
     * @param getAsCsv If this is set to true a csv file is returned insted of transactionlist (optional)
     * @return Transaction
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transaction[] listAccountTransactions(Integer year, Integer month, Boolean getAsCsv) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/invoice";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (year != null) {
            url.addQueryParameter("year", year.toString());}
        if (month != null) {
            url.addQueryParameter("month", month.toString());}
        if (getAsCsv != null) {
            url.addQueryParameter("getAsCsv", getAsCsv.toString());}

        return get(url.build(), Transaction[].class);
    }

    /**
     * List account transactions (asynchronously)
     * Returns a list of transactions for the requested account. Requires on of the following scopes: [dealer, account-read, root]
     * @param year Define a year (required)
     * @param month Define a month (0 - 12), not required (optional)
     * @param getAsCsv If this is set to true a csv file is returned insted of transactionlist (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Transaction[]> listAccountTransactionsAsync(Integer year, Integer month, Boolean getAsCsv) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/invoice";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (year != null) {
            url.addQueryParameter("year", year.toString());}
        if (month != null) {
            url.addQueryParameter("month", month.toString());}
        if (getAsCsv != null) {
            url.addQueryParameter("getAsCsv", getAsCsv.toString());}

        return getAsync(url.build(), Transaction[].class);
    }

    // OAuthApiClientService

    /**
     * Create OAuth client
     * Create a new oauth api client for the requested account. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param _apiClient  (required)
     * @return OauthAPIClientResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthAPIClientResponse createOauthClient(CreateOauthAPIClientRequest _apiClient) throws Exception, IdfyException {
        Object localVarPostBody = _apiClient;
        // create path and map variables
        String localVarPath = "/oauthclient";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), _apiClient, OauthAPIClientResponse.class);
    }

    /**
     * Create OAuth client (asynchronously)
     * Create a new oauth api client for the requested account. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param _apiClient  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<OauthAPIClientResponse> createOauthClientAsync(CreateOauthAPIClientRequest _apiClient) throws Exception, IdfyException {
        Object localVarPostBody = _apiClient;
        // create path and map variables
        String localVarPath = "/oauthclient";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), _apiClient, OauthAPIClientResponse.class);
    }


    /**
     * Delete OAuth client
     * Delete oauth API client.  Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param clientId  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteOauthClient(String clientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/oauthclient/{clientId}"
                .replaceAll("\\{" + "clientId" + "\\}", Encoder.escapeString(clientId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        delete(url.build());
    }

    /**
     * Delete OAuth client (asynchronously)
     * Delete oauth API client.  Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param clientId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> deleteOauthClientAsync(String clientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/oauthclient/{clientId}"
                .replaceAll("\\{" + "clientId" + "\\}", Encoder.escapeString(clientId.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return deleteAsync(url.build());
    }


    /**
     * Disable OAuth client
     * Deactivates the requested oauth client. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param request  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void disableOauthClient(OauthClientId request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/oauthclient/disable";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        put(url.build(), request);
    }

    /**
     * Disable OAuth client (asynchronously)
     * Deactivates the requested oauth client. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> disableOauthClientAsync(OauthClientId request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/oauthclient/disable";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return putAsync(url.build(), request);
    }


    /**
     * Enable OAuth client
     * Activates the requested oauth client. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param request  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void enableOauthClient(OauthClientId request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/oauthclient/enable";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        put(url.build(), request);
    }

    /**
     * Enable OAuth client (asynchronously)
     * Activates the requested oauth client. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> enableOauthClientAsync(OauthClientId request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/oauthclient/enable";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return putAsync(url.build(), request);
    }


    /**
     * List OAuth clients
     * Returns a list of all oauth clients registered on requested account. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @return OauthClientListItemResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthClientListItemResponse[] listOauthClients() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/oauthclient/list";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), OauthClientListItemResponse[].class);
    }

    /**
     * List OAuth clients (asynchronously)
     * Returns a list of all oauth clients registered on requested account. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<OauthClientListItemResponse[]> listOauthClientsAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/oauthclient/list";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), OauthClientListItemResponse[].class);
    }


    /**
     * Retrieve OAuth client
     * Returns the requested oauth client with settings. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param clientId  (required)
     * @return OauthAPIClientResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthAPIClientResponse retrieveOauthClient(String clientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/oauthclient/{clientId}"
                .replaceAll("\\{" + "clientId" + "\\}", Encoder.escapeString(clientId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), OauthAPIClientResponse.class);
    }

    /**
     * Retrieve OAuth client (asynchronously)
     * Returns the requested oauth client with settings. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param clientId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<OauthAPIClientResponse> retrieveOauthClientAsync(String clientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/oauthclient/{clientId}"
                .replaceAll("\\{" + "clientId" + "\\}", Encoder.escapeString(clientId.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), OauthAPIClientResponse.class);
    }


    /**
     * Update OAuth client
     * Updates the requested oauth client on the requested account. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param _apiClient  (required)
     * @return OauthAPIClientResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthAPIClientResponse updateOauthClient(UpdateOauthAPIClientRequest _apiClient) throws Exception, IdfyException {
        Object localVarPostBody = _apiClient;
        // create path and map variables
        String localVarPath = "/oauthclient";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return put(url.build(), _apiClient, OauthAPIClientResponse.class);
    }

    /**
     * Update OAuth client (asynchronously)
     * Updates the requested oauth client on the requested account. Requires on of the following scopes: [dealer,  oauth-token, root]
     * @param _apiClient  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<OauthAPIClientResponse> updateOauthClientAsync(UpdateOauthAPIClientRequest _apiClient) throws Exception, IdfyException {
        Object localVarPostBody = _apiClient;
        // create path and map variables
        String localVarPath = "/oauthclient";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return putAsync(url.build(), _apiClient, OauthAPIClientResponse.class);
    }

    // OpenIdService

    /**
     * Create OpenId client
     * Create a new openId client for the requested account. Requires on of the following scopes: [root]
     * @param client  (required)
     * @return OpenIdClientResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OpenIdClientResponse createOpenidClient(CreateOpenIdClientRequest client) throws Exception, IdfyException {
        Object localVarPostBody = client;
        // create path and map variables
        String localVarPath = "/openid";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), client, OpenIdClientResponse.class);
    }

    /**
     * Create OpenId client (asynchronously)
     * Create a new openId client for the requested account. Requires on of the following scopes: [root]
     * @param client  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<OpenIdClientResponse> createOpenidClientAsync(CreateOpenIdClientRequest client) throws Exception, IdfyException {
        Object localVarPostBody = client;
        // create path and map variables
        String localVarPath = "/openid";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), client, OpenIdClientResponse.class);
    }


    /**
     * Delete OpenId client
     * Requires on of the following scopes: [dealer,  openid-client, root]
     * @param clientId  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteOpenidClient(String clientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/openid/{clientId}"
                .replaceAll("\\{" + "clientId" + "\\}", Encoder.escapeString(clientId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        delete(url.build());
    }

    /**
     * Delete OpenId client (asynchronously)
     * Requires on of the following scopes: [dealer,  openid-client, root]
     * @param clientId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> deleteOpenidClientAsync(String clientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/openid/{clientId}"
                .replaceAll("\\{" + "clientId" + "\\}", Encoder.escapeString(clientId.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return deleteAsync(url.build());
    }


    /**
     * Disable OpenId client
     * Deactivates the requested oauth client. Requires on of the following scopes: [dealer,  openid-client, root]
     * @param request  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void disableOpenidClient(OauthClientId request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/openid/disable";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        put(url.build(), request);
    }

    /**
     * Disable OpenId client (asynchronously)
     * Deactivates the requested oauth client. Requires on of the following scopes: [dealer,  openid-client, root]
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> disableOpenidClientAsync(OauthClientId request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/openid/disable";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return putAsync(url.build(), request);
    }


    /**
     * Enable OpenId client
     * Requires on of the following scopes: [dealer,  openid-client, root]
     * @param request  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void enableOpenidClient(OauthClientId request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/openid/enable";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        put(url.build(), request);
    }

    /**
     * Enable OpenId client (asynchronously)
     * Requires on of the following scopes: [dealer,  openid-client, root]
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> enableOpenidClientAsync(OauthClientId request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/openid/enable";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return putAsync(url.build(), request);
    }


    /**
     * List OpenId clients for account
     * Returns a list of all oauth clients registered on requested account. Requires on of the following scopes: [dealer,  openid-client, root]
     * @return OauthClientListItemResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthClientListItemResponse[] listOpenidClientsForAccount() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/openid/list";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), OauthClientListItemResponse[].class);
    }

    /**
     * List OpenId clients for account (asynchronously)
     * Returns a list of all oauth clients registered on requested account. Requires on of the following scopes: [dealer,  openid-client, root]
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<OauthClientListItemResponse[]> listOpenidClientsForAccountAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/openid/list";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), OauthClientListItemResponse[].class);
    }


    /**
     * Retrieve OpenId client
     * Returns the requested oauth client with settings. Requires on of the following scopes: [dealer,  openid-client, root]
     * @param clientId  (required)
     * @return OpenIdClientResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OpenIdClientResponse retrieveOpenidClient(String clientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/openid/{clientId}"
                .replaceAll("\\{" + "clientId" + "\\}", Encoder.escapeString(clientId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), OpenIdClientResponse.class);
    }

    /**
     * Retrieve OpenId client (asynchronously)
     * Returns the requested oauth client with settings. Requires on of the following scopes: [dealer,  openid-client, root]
     * @param clientId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<OpenIdClientResponse> retrieveOpenidClientAsync(String clientId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/openid/{clientId}"
                .replaceAll("\\{" + "clientId" + "\\}", Encoder.escapeString(clientId.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), OpenIdClientResponse.class);
    }


    /**
     * Update OpenId client
     * Updates the requested openid client on the requested account. Requires on of the following scopes: [dealer,  openid-client, root]
     * @param client  (required)
     * @return OpenIdClientResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OpenIdClientResponse updateOpenidClient(UpdateOpenIdClientRequest client) throws Exception, IdfyException {
        Object localVarPostBody = client;
        // create path and map variables
        String localVarPath = "/openid";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return put(url.build(), client, OpenIdClientResponse.class);
    }

    /**
     * Update OpenId client (asynchronously)
     * Updates the requested openid client on the requested account. Requires on of the following scopes: [dealer,  openid-client, root]
     * @param client  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<OpenIdClientResponse> updateOpenidClientAsync(UpdateOpenIdClientRequest client) throws Exception, IdfyException {
        Object localVarPostBody = client;
        // create path and map variables
        String localVarPath = "/openid";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return putAsync(url.build(), client, OpenIdClientResponse.class);
    }

    // TemplateService

    /**
     * Create template
     * Creates a new PDF template
     * @param model Create PDF template body (required)
     * @return PdfTemplate
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfTemplate createTemplate(CreatePdfTemplate model) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/template";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), model, PdfTemplate.class);
    }

    /**
     * Create template (asynchronously)
     * Creates a new PDF template
     * @param model Create PDF template body (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PdfTemplate> createTemplateAsync(CreatePdfTemplate model) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/template";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), model, PdfTemplate.class);
    }


    /**
     * Delete template
     * Deletes the PDF template
     * @param id The template ID (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTemplate(UUID id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/template/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        delete(url.build());
    }

    /**
     * Delete template (asynchronously)
     * Deletes the PDF template
     * @param id The template ID (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> deleteTemplateAsync(UUID id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/template/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return deleteAsync(url.build());
    }


    /**
     * List templates for account
     * Lists all the PDF template for the account
     * @return PdfTemplateListItem
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfTemplateListItem[] listTemplatesForAccount() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/template";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), PdfTemplateListItem[].class);
    }

    /**
     * List templates for account (asynchronously)
     * Lists all the PDF template for the account
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PdfTemplateListItem[]> listTemplatesForAccountAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/template";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), PdfTemplateListItem[].class);
    }


    /**
     * Preview template from id
     * Preview your PAdES template use your own signature file or choose the xmlTemplate prefilled
     * @param model Preview model (required)
     * @param id Template Id (required)
     * @param xmlTemplate  (optional)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void previewTemplateFromId(TemplateWithIdPreview model, UUID id, String xmlTemplate) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/template/preview/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (xmlTemplate != null) {
            url.addQueryParameter("xmlTemplate", xmlTemplate.toString());}

        post(url.build(), model);
    }

    /**
     * Preview template from id (asynchronously)
     * Preview your PAdES template use your own signature file or choose the xmlTemplate prefilled
     * @param model Preview model (required)
     * @param id Template Id (required)
     * @param xmlTemplate  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> previewTemplateFromIdAsync(TemplateWithIdPreview model, UUID id, String xmlTemplate) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/template/preview/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (xmlTemplate != null) {
            url.addQueryParameter("xmlTemplate", xmlTemplate.toString());}

        return postAsync(url.build(), model);
    }


    /**
     * Preview template from model
     * Preview your PAdES template use your own signature file or choose the xmlTemplate prefilled
     * @param model Preview model (required)
     * @param xmlTemplate  (optional)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void previewTemplateFromModel(TemplatePreview model, String xmlTemplate) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/template/preview";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (xmlTemplate != null) {
            url.addQueryParameter("xmlTemplate", xmlTemplate.toString());}

        post(url.build(), model);
    }

    /**
     * Preview template from model (asynchronously)
     * Preview your PAdES template use your own signature file or choose the xmlTemplate prefilled
     * @param model Preview model (required)
     * @param xmlTemplate  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> previewTemplateFromModelAsync(TemplatePreview model, String xmlTemplate) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/template/preview";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (xmlTemplate != null) {
            url.addQueryParameter("xmlTemplate", xmlTemplate.toString());}

        return postAsync(url.build(), model);
    }


    /**
     * Retrieve data source
     * Preview the underlaying template datasource
     * @param model Preview model (required)
     * @param xmlTempalte Prefilled XmlSignature templates (optional)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void retrieveDataSource(TemplatePreview model, String xmlTempalte) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/template/datasource";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (xmlTempalte != null) {
            url.addQueryParameter("xmlTempalte", xmlTempalte.toString());}

        post(url.build(), model);
    }

    /**
     * Retrieve data source (asynchronously)
     * Preview the underlaying template datasource
     * @param model Preview model (required)
     * @param xmlTempalte Prefilled XmlSignature templates (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> retrieveDataSourceAsync(TemplatePreview model, String xmlTempalte) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/template/datasource";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (xmlTempalte != null) {
            url.addQueryParameter("xmlTempalte", xmlTempalte.toString());}

        return postAsync(url.build(), model);
    }


    /**
     * Retrieve default coverpage template
     * Gets the HTML used as a template for the details page if not overridden by user
     * @return PdfTemplate
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfTemplate retrieveDefaultCoverpageTemplate() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/template/defaults/coverpage";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), PdfTemplate.class);
    }

    /**
     * Retrieve default coverpage template (asynchronously)
     * Gets the HTML used as a template for the details page if not overridden by user
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PdfTemplate> retrieveDefaultCoverpageTemplateAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/template/defaults/coverpage";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), PdfTemplate.class);
    }


    /**
     * Retrieve default details template
     * Gets the HTML used as a template for the details page if not overridden by user
     * @param language Language of the details page (required)
     * @return String
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String retrieveDefaultDetailsTemplate(String language) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/template/defaults/details";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (language != null) {
            url.addQueryParameter("language", language.toString());}

        return get(url.build(), String.class);
    }

    /**
     * Retrieve default details template (asynchronously)
     * Gets the HTML used as a template for the details page if not overridden by user
     * @param language Language of the details page (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<String> retrieveDefaultDetailsTemplateAsync(String language) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/template/defaults/details";

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (language != null) {
            url.addQueryParameter("language", language.toString());}

        return getAsync(url.build(), String.class);
    }


    /**
     * Retrieve template
     * Gets a PDF template
     * @param id The template ID (required)
     * @return PdfTemplate
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfTemplate retrieveTemplate(UUID id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/template/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), PdfTemplate.class);
    }

    /**
     * Retrieve template (asynchronously)
     * Gets a PDF template
     * @param id The template ID (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PdfTemplate> retrieveTemplateAsync(UUID id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/template/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), PdfTemplate.class);
    }


    /**
     * Update template
     * Updates the given PDF template
     * @param id The template ID (required)
     * @param model The template body (required)
     * @return PdfTemplate
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfTemplate updateTemplate(UUID id, UpdatePdfTemplate model) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/template/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return put(url.build(), model, PdfTemplate.class);
    }

    /**
     * Update template (asynchronously)
     * Updates the given PDF template
     * @param id The template ID (required)
     * @param model The template body (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PdfTemplate> updateTemplateAsync(UUID id, UpdatePdfTemplate model) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/template/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.ADMIN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return putAsync(url.build(), model, PdfTemplate.class);
    }
}
