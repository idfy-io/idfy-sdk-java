package io.idfy;
import io.idfy.internal.infastructure.AuthManager;
import io.idfy.internal.infastructure.HttpRequestor;
import io.idfy.internal.utils.Mapper;
import io.idfy.models.IdfyException;
import io.idfy.models.IdfyResponse;
import io.idfy.models.OAuthToken;
import okhttp3.HttpUrl;

import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public abstract class IdfyBaseService {
    private String clientId;
    private String clientSecret;
    private List<OAuthScope> oAuthScopes;
    private OAuthToken oAuthToken;

    public IdfyBaseService() {
    }

    public IdfyBaseService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) throws NullPointerException {
        Objects.requireNonNull(clientId);
        Objects.requireNonNull(clientSecret);
        Objects.requireNonNull(oAuthScopes);

        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.oAuthScopes = oAuthScopes;
    }

    protected void get(HttpUrl url) throws Exception, IdfyException {
        HttpRequestor.get(url, getToken()); // Not tested yet
    }

    protected <T> CompletableFuture<T> getAsync(HttpUrl url) throws Exception, IdfyException {
        return HttpRequestor.getAsync(url, getToken())
                .thenApply(response -> {
                    return null;
                });
    }

    protected <T> T get(HttpUrl url, Class<T> classOf) throws Exception, IdfyException, IdfyException {
        return Mapper.fromJson(HttpRequestor.get(url, getToken()), classOf);
    }

    protected <T> CompletableFuture<T> getAsync(HttpUrl url, Class<T> classOf) throws Exception, IdfyException {
        return HttpRequestor.getAsync(url, getToken())
                .thenApply(response -> {
                    try {
                        return Mapper.fromJson(response, classOf);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    protected <T> T post(HttpUrl url, Object requestObject, Class<T> classOf) throws Exception, IdfyException {
        return Mapper.fromJson(
                HttpRequestor.post(url, Mapper.toJson(requestObject), getToken()),
                classOf
        );
    }

    protected <T> CompletableFuture<T> postAsync(HttpUrl url, Object requestObject, Class<T> classOf) throws Exception, IdfyException {
        return HttpRequestor.postAsync(url,  Mapper.toJson(requestObject), getToken())
                .thenApply(response -> {
                    try {
                        return Mapper.fromJson(response, classOf);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    protected void post(HttpUrl url, Object requestObject) throws Exception, IdfyException {
        HttpRequestor.post(url, Mapper.toJson(requestObject), getToken());
    }

    protected <T> CompletableFuture<T> postAsync(HttpUrl url, Object requestObject) throws Exception, IdfyException {
        return HttpRequestor.postAsync(url,  Mapper.toJson(requestObject), getToken())
                .thenApply(response -> {
                    return null;
                });
    }

    protected <T> T post(HttpUrl url, Class<T> classOf) throws Exception, IdfyException {
        return Mapper.fromJson(
                HttpRequestor.post(url, "", getToken()), classOf);
    }

    protected <T> CompletableFuture<T> postAsync(HttpUrl url, Class<T> classOf) throws Exception, IdfyException {
        return HttpRequestor.postAsync(url,  "", getToken())
                .thenApply(response -> {
                    try {
                        return Mapper.fromJson(response, classOf);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    protected void post(HttpUrl url) throws Exception, IdfyException {
        // https://github.com/square/okhttp/issues/1131#issuecomment-61930815
        // RequestBody emptyBody = RequestBody.create(null, new byte[0]);
        HttpRequestor.post(url, "", getToken());
    }

    protected <T> CompletableFuture<T> postAsync(HttpUrl url) throws Exception, IdfyException {
        return HttpRequestor.postAsync(url, "", getToken())
                .thenApply(response -> {
                    return null;
                });
    }

    protected <T> T put(HttpUrl url, Object requestObject, Class<T> classOf) throws Exception, IdfyException {
        return Mapper.fromJson(
                HttpRequestor.put(url, Mapper.toJson(requestObject), getToken()),
                classOf
        );
    }

    protected <T> CompletableFuture<T> putAsync(HttpUrl url, Object requestObject, Class<T> classOf) throws Exception, IdfyException {
        return HttpRequestor.putAsync(url, Mapper.toJson(requestObject), getToken())
                .thenApply(response -> {
                    try {
                        return Mapper.fromJson(response, classOf);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    protected void put(HttpUrl url, Object requestObject) throws Exception, IdfyException {
        HttpRequestor.put(url, Mapper.toJson(requestObject), getToken());
    }

    protected <T> CompletableFuture<T> putAsync(HttpUrl url, Object requestObject) throws Exception, IdfyException {
        return HttpRequestor.putAsync(url, Mapper.toJson(requestObject), getToken())
                .thenApply(response -> {
                    return null;
                });
    }

    protected <T> T patch(HttpUrl url, Object requestObject, Class<T> classOf) throws Exception, IdfyException {
        return Mapper.fromJson(
                HttpRequestor.patch(url, Mapper.toJson(requestObject), getToken()),
                classOf
        );
    }

    protected <T> CompletableFuture<T> patchAsync(HttpUrl url, Object requestObject, Class<T> classOf) throws Exception, IdfyException {
        return HttpRequestor.patchAsync(url, Mapper.toJson(requestObject), getToken())
                .thenApply(response -> {
                    try {
                        return Mapper.fromJson(response, classOf);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    protected void patch(HttpUrl url, Object requestObject) throws Exception, IdfyException {
        HttpRequestor.patch(url, Mapper.toJson(requestObject), getToken());
    }

    protected CompletableFuture<Void> patchAsync(HttpUrl url, Object requestObject) throws Exception, IdfyException {
        return HttpRequestor.patchAsync(url, Mapper.toJson(requestObject), getToken())
                .thenApply(response -> {
                    return null;
                });
    }

    protected void delete(HttpUrl url) throws Exception, IdfyException {
        HttpRequestor.delete(url, getToken());
    }

    protected CompletableFuture deleteAsync(HttpUrl url) throws Exception, IdfyException {
        return HttpRequestor.deleteAsync(url, getToken());
    }

    protected InputStream getFile(HttpUrl url) throws Exception, IdfyException {
        return HttpRequestor.getStream(url, getToken());
    }

    protected CompletableFuture<InputStream> getFileAsync(HttpUrl url) throws Exception, IdfyException {
        return HttpRequestor.getStreamAsync(url, getToken());
    }

    private String getToken() throws Exception, IdfyException {
        if (oAuthToken != null && oAuthToken.getExpiry().isAfter(Instant.now()))
            return oAuthToken.getAccessToken();

        oAuthToken = clientId == null
                ? AuthManager.Authorize()
                : AuthManager.Authorize(clientId, clientSecret, oAuthScopes);

        return oAuthToken.getAccessToken();
    }
}