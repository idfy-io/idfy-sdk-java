package io.idfy.deposit;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.HttpUrl;

import io.idfy.OAuthScope;
import io.idfy.IdfyBaseService;
import io.idfy.Urls;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;
import io.idfy.deposit.models.*;
import org.w3c.dom.Text;

import java.io.InputStream;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class DepositService extends IdfyBaseService {
    public DepositService() {
        super();
    }

    public DepositService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    /**
     * Cancel deposit
     * Cancel the deposit, funds that have been locked will be released to the tenant.
     * @param id  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void cancelDeposit(UUID id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/personal/{id}/cancel"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        post(url.build());
    }

    /**
     * Cancel deposit (asynchronously)
     * Cancel the deposit, funds that have been locked will be released to the tenant.
     * @param id  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> cancelDepositAsync(UUID id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/personal/{id}/cancel"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build());
    }

    /**
     * Create deposit
     * Create a new deposit
     * @param model  (optional)
     * @return CreateDepositResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateDepositResponse createDeposit(CreateDepositRequest model) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/personal";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), model, CreateDepositResponse.class);
    }

    /**
     * Create deposit (asynchronously)
     * Create a new deposit
     * @param model  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CreateDepositResponse> createDepositAsync(CreateDepositRequest model) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/personal";

        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), model, CreateDepositResponse.class);
    }


    /**
     * List deposit summaries
     * Queries your deposits using the provided arguments
     * @param fromDate Optional, limit the results to those created from a date (ISO 8601) (optional)
     * @param status Optional, limit the results to those with the provided status. (optional)
     * @param offset  (optional, default to 0)
     * @param limit Optional. Set how many results you want per page, max: 1000 (optional, default to 300)
     * @return CollectionWithPagingDepositSummary
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionWithPagingDepositSummary listDepositSummaries(OffsetDateTime fromDate, String status, Integer offset, Integer limit) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/personal/summary";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (fromDate != null) {
            url.addQueryParameter("fromDate", fromDate.toString());}
        if (status != null) {
            url.addQueryParameter("status", status.toString());}
        if (offset != null) {
            url.addQueryParameter("offset", offset.toString());}
        if (limit != null) {
            url.addQueryParameter("limit", limit.toString());}

        return get(url.build(), CollectionWithPagingDepositSummary.class);
    }

    /**
     * List deposit summaries (asynchronously)
     * Queries your deposits using the provided arguments
     * @param fromDate Optional, limit the results to those created from a date (ISO 8601) (optional)
     * @param status Optional, limit the results to those with the provided status. (optional)
     * @param offset  (optional, default to 0)
     * @param limit Optional. Set how many results you want per page, max: 1000 (optional, default to 300)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CollectionWithPagingDepositSummary> listDepositSummariesAsync(OffsetDateTime fromDate, String status, Integer offset, Integer limit) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/personal/summary";

        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (fromDate != null) {
            url.addQueryParameter("fromDate", fromDate.toString());}
        if (status != null) {
            url.addQueryParameter("status", status.toString());}
        if (offset != null) {
            url.addQueryParameter("offset", offset.toString());}
        if (limit != null) {
            url.addQueryParameter("limit", limit.toString());}

        return getAsync(url.build(), CollectionWithPagingDepositSummary.class);
    }


    /**
     * Release deposit
     * Releases the deposit
     * @param id  (required)
     * @param request  (optional)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void releaseDeposit(UUID id, TerminateRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/personal/{id}/terminate"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        post(url.build(), request);
    }

    /**
     * Release deposit (asynchronously)
     * Releases the deposit
     * @param id  (required)
     * @param request  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> releaseDepositAsync(UUID id, TerminateRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/personal/{id}/terminate"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), request);
    }


    /**
     * Retrieve deposit
     * Retrieves the deposit with the given id
     * @param id  (required)
     * @param queryPayment Query the deposit for payment if possible, only valid for statuses: `SIGNED` or `PAID_PARTIAL` (optional, default to false)
     * @return CreateDepositResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateDepositResponse retrieveDeposit(UUID id, Boolean queryPayment) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/personal/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (queryPayment != null) {
            url.addQueryParameter("queryPayment", queryPayment.toString());}

        return get(url.build(), CreateDepositResponse.class);
    }

    /**
     * Retrieve deposit (asynchronously)
     * Retrieves the deposit with the given id
     * @param id  (required)
     * @param queryPayment Query the deposit for payment if possible, only valid for statuses: `SIGNED` or `PAID_PARTIAL` (optional, default to false)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CreateDepositResponse> retrieveDepositAsync(UUID id, Boolean queryPayment) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/personal/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (queryPayment != null) {
            url.addQueryParameter("queryPayment", queryPayment.toString());}

        return getAsync(url.build(), CreateDepositResponse.class);
    }


    /**
     * Update deposit
     * Updates the deposit
     * @param id  (required)
     * @param model  (optional)
     * @return CreateDepositResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateDepositResponse updateDeposit(UUID id, UpdateDepositRequest model) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/personal/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patch(url.build(), model, CreateDepositResponse.class);
    }

    /**
     * Update deposit (asynchronously)
     * Updates the deposit
     * @param id  (required)
     * @param model  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CreateDepositResponse> updateDepositAsync(UUID id, UpdateDepositRequest model) throws Exception, IdfyException {
        Object localVarPostBody = model;
        // create path and map variables
        String localVarPath = "/personal/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.DEPOSIT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patchAsync(url.build(), model, CreateDepositResponse.class);
    }
}
