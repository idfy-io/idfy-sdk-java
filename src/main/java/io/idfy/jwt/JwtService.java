package io.idfy.jwt;

import okhttp3.HttpUrl;
import io.idfy.IdfyBaseService;
import io.idfy.OAuthScope;
import io.idfy.Urls;
import io.idfy.jwt.models.JwtValidationResultDto;
import io.idfy.jwt.models.ValidateJwtDto;
import io.idfy.models.IdfyException;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class JwtService extends IdfyBaseService {
    public JwtService() {
        super();
    }

    public JwtService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    /**
     * Validate JWT
     *
     * @param request  (optional)
     * @return JwtValidationResultDto
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JwtValidationResultDto jwtValidatePost(ValidateJwtDto request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/jwt/validate";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.JWT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), request, JwtValidationResultDto.class);
    }

    /**
     * Validate JWT (asynchronously)
     *
     * @param request  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<JwtValidationResultDto> jwtValidatePostAsync(ValidateJwtDto request) throws Exception, IdfyException {
        Object localVarPostBody = request;
        // create path and map variables
        String localVarPath = "/jwt/validate";

        localVarPath = Urls.JWT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), request, JwtValidationResultDto.class);
    }
}

