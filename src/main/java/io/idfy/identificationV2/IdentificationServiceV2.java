package io.idfy.identificationV2;

import io.idfy.IdfyBaseService;
import io.idfy.OAuthScope;
import io.idfy.Urls;
import io.idfy.identificationV2.models.*;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;
import com.squareup.okhttp.HttpUrl;
import io.idfy.internal.utils.Encoder;

import java.io.InputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;


public class IdentificationServiceV2 extends IdfyBaseService {
    public IdentificationServiceV2() {
        super();
    }

    public IdentificationServiceV2(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    // SessionsApi

    /**
     * Create session
     * Creates a new identification session.
     * @param body  (optional)
     * @return IdSession
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdSession createSession(IdSessionCreate body) throws Exception, IdfyException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/sessions";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), body, IdSession.class);
    }

    /**
     * Create session (asynchronously)
     * Creates a new identification session.
     * @param body  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<IdSession> createSessionAsync(IdSessionCreate body) throws Exception, IdfyException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/sessions";

        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), body, IdSession.class);
    }


    /**
     * Invalidate session
     * Invalidates the specified identification session.
     * @param id The session's unique identifier. (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void invalidateSession(String id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/sessions/{id}/invalidate"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        post(url.build());
    }

    /**
     * Invalidate session (asynchronously)
     * Invalidates the specified identification session.
     * @param id The session's unique identifier. (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> invalidateSessionAsync(String id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/sessions/{id}/invalidate"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build());
    }


    /**
     * List sessions
     * Returns a list of previously created sessions. The session data returned from this endpoint does not contain any personal information.
     * @param cursor The cursor to send to the endpoint to receive the next batch of responses. (optional)
     * @param limit The maximum number of items to return. Defaults to `25`. (optional)
     * @return PaginatedDataDto1
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedDataDto1 listSessions(String cursor, Integer limit) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/sessions";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (cursor != null) {
            url.addQueryParameter("cursor", cursor.toString());}
        if (limit != null) {
            url.addQueryParameter("limit", limit.toString());}

        return get(url.build(), PaginatedDataDto1.class);
    }

    /**
     * List sessions (asynchronously)
     * Returns a list of previously created sessions. The session data returned from this endpoint does not contain any personal information.
     * @param cursor The cursor to send to the endpoint to receive the next batch of responses. (optional)
     * @param limit The maximum number of items to return. Defaults to `25`. (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PaginatedDataDto1> listSessionsAsync(String cursor, Integer limit) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/sessions";

        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (cursor != null) {
            url.addQueryParameter("cursor", cursor.toString());}
        if (limit != null) {
            url.addQueryParameter("limit", limit.toString());}

        return getAsync(url.build(), PaginatedDataDto1.class);
    }


    /**
     * Retrieve session
     * Retrieves the details of a single identification session.
     * @param id The session's unique identifier. (required)
     * @return IdSession
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdSession retrieveSession(String id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/sessions/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), IdSession.class);
    }

    /**
     * Retrieve session (asynchronously)
     * Retrieves the details of a single identification session.
     * @param id The session's unique identifier. (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<IdSession> retrieveSessionAsync(String id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/sessions/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), IdSession.class);
    }

    // LanguagesApi

    /**
     * List languages
     * Returns a list of supported languages.
     * @return LanguageDetails
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LanguageDetails[] listLanguages() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/languages";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), LanguageDetails[].class);
    }

    /**
     * List languages (asynchronously)
     * Returns a list of supported languages.
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<LanguageDetails[]> listLanguagesAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/languages";

        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), LanguageDetails[].class);
    }
    
    // IdProvidersApi

    /**
     * List ID providers
     * Returns a list of all the supported ID providers.
     * @param language The language to use for name and description. Defaults to `en` (english). (optional)
     * @return IdProvider
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdProvider[] listIDProviders(TranslationLanguage language) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/id-providers";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (language != null) {
            url.addQueryParameter("language", language.toString());}

        return get(url.build(), IdProvider[].class);
    }

    /**
     * List ID providers (asynchronously)
     * Returns a list of all the supported ID providers.
     * @param language The language to use for name and description. Defaults to `en` (english). (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<IdProvider[]> listIDProvidersAsync(TranslationLanguage language) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/id-providers";

        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (language != null) {
            url.addQueryParameter("language", language.toString());}

        return getAsync(url.build(), IdProvider[].class);
    }


    /**
     * List ID providers for account
     * Returns a list of all the ID providers available for the requester's account.
     * @param language The language to use for name and description. Defaults to `en` (english). (optional)
     * @return IdProvider
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdProvider[] listIDProvidersForAccount(TranslationLanguage language) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/id-providers/account";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (language != null) {
            url.addQueryParameter("language", language.toString());}

        return get(url.build(), IdProvider[].class);
    }

    /**
     * List ID providers for account (asynchronously)
     * Returns a list of all the ID providers available for the requester's account.
     * @param language The language to use for name and description. Defaults to `en` (english). (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<IdProvider[]> listIDProvidersForAccountAsync(TranslationLanguage language) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/id-providers/account";

        localVarPath = Urls.IDENTIFICATIONV2.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (language != null) {
            url.addQueryParameter("language", language.toString());}

        return getAsync(url.build(), IdProvider[].class);
    }
}
