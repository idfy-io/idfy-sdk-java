package io.idfy.merchantsign;

import okhttp3.HttpUrl;
import io.idfy.IdfyBaseService;
import io.idfy.OAuthScope;
import io.idfy.Urls;
import io.idfy.merchantsign.models.*;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import java.util.List;

public class MerchantSignService extends IdfyBaseService {
    public MerchantSignService() {
        super();
    }

    public MerchantSignService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    /**
     * Retrieve transaction
     * Retrieves a single transaction.
     * @param transactionId  (required)
     * @return MerchantSignTransaction
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MerchantSignTransaction signatureGet(UUID transactionId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/signature/{transactionId}"
                .replaceAll("\\{" + "transactionId" + "\\}", Encoder.escapeString(transactionId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.MERCHANT_SIGN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), MerchantSignTransaction.class);
    }

    /**
     * Retrieve transaction (asynchronously)
     * Retrieves a single transaction.
     * @param transactionId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<MerchantSignTransaction> signatureGetAsync(UUID transactionId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/signature/{transactionId}"
                .replaceAll("\\{" + "transactionId" + "\\}", Encoder.escapeString(transactionId.toString()));

        localVarPath = Urls.MERCHANT_SIGN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), MerchantSignTransaction.class);
    }


    /**
     * List transactions
     * Returns a list of transactions.
     * @param oauthClientId  (required)
     * @param fromDate Date in ticks (optional)
     * @param toDate Date in ticks (optional)
     * @return MerchantSignTransaction
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MerchantSignTransaction[] signatureList(String oauthClientId, Long fromDate, Long toDate) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/signature/list";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.MERCHANT_SIGN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (oauthClientId != null) {
            url.addQueryParameter("oauthClientId", oauthClientId.toString());}
        if (fromDate != null) {
            url.addQueryParameter("fromDate", fromDate.toString());}
        if (toDate != null) {
            url.addQueryParameter("toDate", toDate.toString());}

        return get(url.build(), MerchantSignTransaction[].class);
    }

    /**
     * List transactions (asynchronously)
     * Returns a list of transactions.
     * @param oauthClientId  (required)
     * @param fromDate Date in ticks (optional)
     * @param toDate Date in ticks (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<MerchantSignTransaction[]> signatureListAsync(String oauthClientId, Long fromDate, Long toDate) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/signature/list";

        localVarPath = Urls.MERCHANT_SIGN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (oauthClientId != null) {
            url.addQueryParameter("oauthClientId", oauthClientId.toString());}
        if (fromDate != null) {
            url.addQueryParameter("fromDate", fromDate.toString());}
        if (toDate != null) {
            url.addQueryParameter("toDate", toDate.toString());}

        return getAsync(url.build(), MerchantSignTransaction[].class);
    }


    /**
     * Retrieve pades
     * Retrieve pades of signed pdf file. This endpoint will only work on the api.idfy.no endpoint
     * @param signedDocumentId  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void signatureRetrievePades(UUID signedDocumentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/signature/pades/{signedDocumentId}"
                .replaceAll("\\{" + "signedDocumentId" + "\\}", Encoder.escapeString(signedDocumentId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.MERCHANT_SIGN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        get(url.build());
    }

    /**
     * Retrieve pades (asynchronously)
     * Retrieve pades of signed pdf file. This endpoint will only work on the api.idfy.no endpoint
     * @param signedDocumentId  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> signatureRetrievePadesAsync(UUID signedDocumentId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/signature/pades/{signedDocumentId}"
                .replaceAll("\\{" + "signedDocumentId" + "\\}", Encoder.escapeString(signedDocumentId.toString()));

        localVarPath = Urls.MERCHANT_SIGN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build());
    }


    /**
     * Create merchant signature
     *
     * @param request  (required)
     * @return SignResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignResponse signatureSign(SignRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/signature";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.MERCHANT_SIGN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), request, SignResponse.class);
    }

    /**
     * Create merchant signature (asynchronously)
     *
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<SignResponse> signatureSignAsync(SignRequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/signature";

        localVarPath = Urls.MERCHANT_SIGN.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), request, SignResponse.class);
    }
}

