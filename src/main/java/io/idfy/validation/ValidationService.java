package io.idfy.validation;


import io.idfy.IdfyBaseService;
import io.idfy.OAuthScope;
import io.idfy.Urls;
import io.idfy.validation.models.*;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;
import okhttp3.HttpUrl;


import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import java.util.List;

public class ValidationService extends IdfyBaseService {
    public ValidationService() {
        super();
    }

    public ValidationService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    /**
     * Parse and validate sdo
     * This service validates and parses the signatures on the SDOdata, to validate/parse the SDO we use the validation component from bankID norway.   This endpoint parses the SDO to readable data and provides you with information about the signatures and document.
     * @param request  (required)
     * @return ParseSDOResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParseSDOResponse noBankIDValidationParseSDO(ParseSDORequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/no/bankid/parse";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.VALIDATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), request, ParseSDOResponse.class);
    }

    /**
     * Parse and validate sdo (asynchronously)
     * This service validates and parses the signatures on the SDOdata, to validate/parse the SDO we use the validation component from bankID norway.   This endpoint parses the SDO to readable data and provides you with information about the signatures and document.
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<ParseSDOResponse> noBankIDValidationParseSDOAsync(ParseSDORequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/no/bankid/parse";

        localVarPath = Urls.VALIDATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), request, ParseSDOResponse.class);
    }


    /**
     * Validate SDO
     * This service validates the signatures on the SDOdata, to validate the SDO we use the validation component from BankID Norway.   In this endpoint you can also include the data from the original document to validate that they matches the SDO data, the same goes for the signatures. (Ssn is only available if you have an account and validate-ssn scope)
     * @param request  (required)
     * @return ValidateSDOResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ValidateSDOResponse noBankIDValidationValidateSDO(ValidateSDORequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/no/bankid/validate";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.VALIDATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), request, ValidateSDOResponse.class);
    }

    /**
     * Validate SDO (asynchronously)
     * This service validates the signatures on the SDOdata, to validate the SDO we use the validation component from BankID Norway.   In this endpoint you can also include the data from the original document to validate that they matches the SDO data, the same goes for the signatures. (Ssn is only available if you have an account and validate-ssn scope)
     * @param request  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<ValidateSDOResponse> noBankIDValidationValidateSDOAsync(ValidateSDORequest request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/no/bankid/validate";

        localVarPath = Urls.VALIDATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), request, ValidateSDOResponse.class);
    }
}