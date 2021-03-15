package io.idfy.internal.infastructure;

import com.fasterxml.jackson.core.JsonProcessingException;
import okhttp3.HttpUrl;
import io.idfy.IdfyConfiguration;
import io.idfy.OAuthScope;
import io.idfy.Urls;
import io.idfy.internal.utils.Mapper;
import io.idfy.models.IdfyException;
import io.idfy.models.IdfyResponse;
import io.idfy.models.OAuthToken;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class AuthManager {
    public static OAuthToken Authorize() throws Exception, IdfyException {
        OAuthToken token = Authorize(IdfyConfiguration.getClientId(), IdfyConfiguration.getClientSecret(), IdfyConfiguration.getoAuthScopes());
        IdfyConfiguration.setOAuthToken(token);

        return IdfyConfiguration.getOAuthToken();
    }

    public static OAuthToken Authorize(String clientId, String clientSecret, List<OAuthScope> oauthScopes) throws Exception, IdfyException {
        if (clientId == null || clientSecret == null)
            throw new NullPointerException("Client credentials not set.");


        List<String> serializedScopes = oauthScopes.stream()
                .map(src -> {
                    try {
                        return Mapper.toJson(src);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                    return "";
                })
                .map(s -> s.replace("\"", ""))
                .collect(Collectors.toList());

        Map<String, String> formData = new HashMap<>();
        formData.put("grant_type", "client_credentials");
        formData.put("scope", String.join(" ", serializedScopes));
        formData.put("client_id", clientId);
        formData.put("client_secret", clientSecret);

        IdfyResponse response = HttpRequestor.postFormData(HttpUrl.parse(Urls.O_AUTH_TOKEN), formData, null);
        OAuthToken token = Mapper.fromJson(response, OAuthToken.class);

        token.setExpiry(
                Instant.now().plusSeconds(token.getExpiresIn()));
        return token;
    }
}
