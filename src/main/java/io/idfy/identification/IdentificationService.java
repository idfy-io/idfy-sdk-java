package io.idfy.identification;

/*
 * Idfy Identification
 * This endpoint enables authentication/identification through multiple identity providers such as Norwegian BankID, Swedish BankID and NemID. ## Last update   Last build date for this endpoint: 02.04.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

import okhttp3.HttpUrl;
import io.idfy.IdfyBaseService;
import io.idfy.OAuthScope;
//import io.idfy.signature.models.IdentificationLogItem;
//import io.idfy.signature.models.ListResultIdentificationLogItem;
import java.util.UUID;

import io.idfy.Urls;
import io.idfy.identification.models.*;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;
import okhttp3.HttpUrl;
import io.idfy.internal.utils.Encoder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class IdentificationService extends IdfyBaseService {
    public IdentificationService() {
        super();
    }

    public IdentificationService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    // IdentificationSessionService

    /**
     * Create session
     * Creates a new identification session
     * @param request  (required)
     * @return CreateIdentificationResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateIdentificationResponse createSession(CreateIdentificationRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/session";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), request, CreateIdentificationResponse.class);
    }

    /**
     * Create session (asynchronously)
     * Creates a new identification session
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CreateIdentificationResponse> createSessionAsync(CreateIdentificationRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/session";

        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), request, CreateIdentificationResponse.class);
    }


    /**
     * Invalidate session
     * Invalidates an identification session to avoid using the same request twice. Remark: if the session has status ERROR it will not be invalidated.
     * @param value A request object (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void invalidateSession(InvalidateIdentificationRequest value) throws Exception, IdfyException {
        Object localVarPostBody = value;
        // create path and map variables
        String localVarPath = "/session/invalidate";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        put(url.build(), value);
    }

    /**
     * Invalidate session (asynchronously)
     * Invalidates an identification session to avoid using the same request twice. Remark: if the session has status ERROR it will not be invalidated.
     * @param value A request object (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> invalidateSessionAsync(InvalidateIdentificationRequest value) throws Exception, IdfyException {
        Object localVarPostBody = value;
        // create path and map variables
        String localVarPath = "/session/invalidate";

        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return putAsync(url.build(), value);
    }


    /**
     * Retrieve session response
     * Retrieves the response of a single identifaction session.  REMARK: Only authenticate users when the identitication status is equal to SUCCESS.
     * @param requestId The unique identifier returned in the creation of the session (required)
     * @param metaData Whether metadata should be included in the response, only set to true if needed (addons and user ceritifcate) (optional)
     * @return IdentificationResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdentificationResponse retrieveSessionResponse(String requestId, Boolean metaData) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/session";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (requestId != null) {
            url.addQueryParameter("requestId", requestId.toString());}
        if (metaData != null) {
            url.addQueryParameter("metaData", metaData.toString());}

        return get(url.build(), IdentificationResponse.class);
    }

    /**
     * Retrieve session response (asynchronously)
     * Retrieves the response of a single identifaction session.  REMARK: Only authenticate users when the identitication status is equal to SUCCESS.
     * @param requestId The unique identifier returned in the creation of the session (required)
     * @param metaData Whether metadata should be included in the response, only set to true if needed (addons and user ceritifcate) (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<IdentificationResponse> retrieveSessionResponseAsync(String requestId, Boolean metaData) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/session";

        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (requestId != null) {
            url.addQueryParameter("requestId", requestId.toString());}
        if (metaData != null) {
            url.addQueryParameter("metaData", metaData.toString());}

        return getAsync(url.build(), IdentificationResponse.class);
    }


    /**
     * Retrieve session status
     * Retrieves the status of a single identification session.
     * @param requestId The requestId returned in the creation of the request (required)
     * @return IdentificationCompleteResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdentificationCompleteResponse retrieveSessionStatus(String requestId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/session/status";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (requestId != null) {
            url.addQueryParameter("requestId", requestId.toString());}

        return get(url.build(), IdentificationCompleteResponse.class);
    }

    /**
     * Retrieve session status (asynchronously)
     * Retrieves the status of a single identification session.
     * @param requestId The requestId returned in the creation of the request (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<IdentificationCompleteResponse> retrieveSessionStatusAsync(String requestId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/session/status";

        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (requestId != null) {
            url.addQueryParameter("requestId", requestId.toString());}

        return getAsync(url.build(), IdentificationCompleteResponse.class);
    }

    // LogService

    /**
     * List log entries
     * Gets an  list of historic identification sessions (older than 14 days) by the filter below fetched the last 1000 with a link to next page.   Remark: Log entries are updated with a little delay (min 5 minutes max 25 minutes).
     * @param year The year to fetch the sessions from (required)
     * @param month Optional: Filter on month (optional)
     * @param day Optional: Filter on day (optional)
     * @param status Optional: Filter on status (optional)
     * @param identityProviderType Optional: Filter on identity provider (optional)
     * @param externalId The merchants reference to the identification process (optional)
     * @param name Optional: Filter on the name of the user (optional)
     * @param skip Number of pages to skip (optional)
     * @param pageSize Number of results in each page (max 1000) (optional)
     * @return ListResultIdentificationLogItem
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListResultIdentificationLogItem listLogEntries(Integer year, Integer month, Integer day, String status, String identityProviderType, String externalId, String name, Integer skip, Integer pageSize) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/log/filter/{year}"
                .replaceAll("\\{" + "year" + "\\}", Encoder.escapeString(year.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (month != null) {
            url.addQueryParameter("month", month.toString());}
        if (day != null) {
            url.addQueryParameter("day", day.toString());}
        if (status != null) {
            url.addQueryParameter("status", status.toString());}
        if (identityProviderType != null) {
            url.addQueryParameter("identityProviderType", identityProviderType.toString());}
        if (externalId != null) {
            url.addQueryParameter("externalId", externalId.toString());}
        if (name != null) {
            url.addQueryParameter("name", name.toString());}
        if (skip != null) {
            url.addQueryParameter("skip", skip.toString());}
        if (pageSize != null) {
            url.addQueryParameter("pageSize", pageSize.toString());}

        return get(url.build(), ListResultIdentificationLogItem.class);
    }

    /**
     * List log entries (asynchronously)
     * Gets an  list of historic identification sessions (older than 14 days) by the filter below fetched the last 1000 with a link to next page.   Remark: Log entries are updated with a little delay (min 5 minutes max 25 minutes).
     * @param year The year to fetch the sessions from (required)
     * @param month Optional: Filter on month (optional)
     * @param day Optional: Filter on day (optional)
     * @param status Optional: Filter on status (optional)
     * @param identityProviderType Optional: Filter on identity provider (optional)
     * @param externalId The merchants reference to the identification process (optional)
     * @param name Optional: Filter on the name of the user (optional)
     * @param skip Number of pages to skip (optional)
     * @param pageSize Number of results in each page (max 1000) (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<ListResultIdentificationLogItem> listLogEntriesAsync(Integer year, Integer month, Integer day, String status, String identityProviderType, String externalId, String name, Integer skip, Integer pageSize) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/log/filter/{year}"
                .replaceAll("\\{" + "year" + "\\}", Encoder.escapeString(year.toString()));

        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (month != null) {
            url.addQueryParameter("month", month.toString());}
        if (day != null) {
            url.addQueryParameter("day", day.toString());}
        if (status != null) {
            url.addQueryParameter("status", status.toString());}
        if (identityProviderType != null) {
            url.addQueryParameter("identityProviderType", identityProviderType.toString());}
        if (externalId != null) {
            url.addQueryParameter("externalId", externalId.toString());}
        if (name != null) {
            url.addQueryParameter("name", name.toString());}
        if (skip != null) {
            url.addQueryParameter("skip", skip.toString());}
        if (pageSize != null) {
            url.addQueryParameter("pageSize", pageSize.toString());}

        return getAsync(url.build(), ListResultIdentificationLogItem.class);
    }


    /**
     * Retrieve a log entry
     * Gets an historic identification session (older than 14 days)  Remark: Log entries are updated with a little delay (min 5 minutes max 25 minutes).
     * @param requestId A request object (required)
     * @param accountId If dealer with multiple accounts. Specify accountId for the session, otherwise ignore (optional)
     * @return IdentificationLogItem
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdentificationLogItem retrieveALogEntry(String requestId, UUID accountId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/log/requestId/{requestId}"
                .replaceAll("\\{" + "requestId" + "\\}", Encoder.escapeString(requestId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (accountId != null) {
            url.addQueryParameter("accountId", accountId.toString());}

        return get(url.build(), IdentificationLogItem.class);
    }

    /**
     * Retrieve a log entry (asynchronously)
     * Gets an historic identification session (older than 14 days)  Remark: Log entries are updated with a little delay (min 5 minutes max 25 minutes).
     * @param requestId A request object (required)
     * @param accountId If dealer with multiple accounts. Specify accountId for the session, otherwise ignore (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<IdentificationLogItem> retrieveALogEntryAsync(String requestId, UUID accountId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/log/requestId/{requestId}"
                .replaceAll("\\{" + "requestId" + "\\}", Encoder.escapeString(requestId.toString()));

        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (accountId != null) {
            url.addQueryParameter("accountId", accountId.toString());}

        return getAsync(url.build(), IdentificationLogItem.class);
    }

    // NorwegianBankIdService

    /**
     * Create mobile session
     * Creates a new BankID mobile session to start the identification process. Returns request ID and a merchant reference.  If the user does not have BankID mobile or invalid data was input, this will be indicated by the InvalidMobileNumberOrDateOfBirth parameter being returned as true.  If an error occured, the response will contain an error object with an error code and error message.
     * @param model  (required)
     * @return CreateBankIDMobileResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateBankIDMobileResponse createMobileSession(CreateBankIDMobileRequest model) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/no/bankid/mobile";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), localVarPostBody, CreateBankIDMobileResponse.class);
    }

    /**
     * Create mobile session (asynchronously)
     * Creates a new BankID mobile session to start the identification process. Returns request ID and a merchant reference.  If the user does not have BankID mobile or invalid data was input, this will be indicated by the InvalidMobileNumberOrDateOfBirth parameter being returned as true.  If an error occured, the response will contain an error object with an error code and error message.
     * @param model  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CreateBankIDMobileResponse> createMobileSessionAsync(CreateBankIDMobileRequest model) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/no/bankid/mobile";

        localVarPath = Urls.IDENTIFICATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), localVarPostBody, CreateBankIDMobileResponse.class);
    }


}

