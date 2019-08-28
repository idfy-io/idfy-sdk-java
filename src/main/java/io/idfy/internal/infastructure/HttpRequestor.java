package io.idfy.internal.infastructure;

import io.idfy.IdfyConfiguration;
import io.idfy.internal.utils.Mapper;
import io.idfy.models.IdfyError;
import io.idfy.models.IdfyException;
import io.idfy.models.IdfyResponse;
import com.squareup.okhttp.*;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.FormEncodingBuilder;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public final class HttpRequestor {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
    private static  final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");

    private static OkHttpClient client = new OkHttpClient();

    public static IdfyResponse get(HttpUrl url, String token) throws Exception, IdfyException {
        Builder builder = new Builder().url(url);

        return send(builder, token);
    }

    public static CompletableFuture<IdfyResponse> getAsync(HttpUrl url, String token) throws Exception {
        Builder builder = new Builder().url(url);

        return sendAsync(builder, token);
    }

    public static IdfyResponse post(HttpUrl url, String jsonBody, String token) throws Exception, IdfyException {
        Builder builder = new Builder().url(url).post(RequestBody.create(MEDIA_TYPE, jsonBody));

        return send(builder, token);
    }

    public static CompletableFuture<IdfyResponse> postAsync(HttpUrl url, String jsonBody, String token) throws Exception {
        Builder builder = new Builder().url(url).post(RequestBody.create(MEDIA_TYPE, jsonBody));

        return sendAsync(builder, token);
    }

    public static IdfyResponse postFormData(HttpUrl url, Map<String, String> formData, String token) throws Exception, IdfyException {
        RequestBody formBody = buildFormBody(formData);

        Builder builder = new Request.Builder().url(url).post(formBody);

        return send(builder, token);
    }
//Since there's currently no option to fetch tokens asynchronously, there's currently no need for a postFormDataAsync method.
/*
    public static CompletableFuture<IdfyResponse> postFormDataAsync(String url, List<NameValuePair> formData, String token) throws Exception {
        return sendAsync(url, RequestBuilder.post(), token, null, formData);
    }
*/
    public static IdfyResponse put(HttpUrl url, String jsonBody, String token) throws Exception, IdfyException {
        Builder builder = new Builder().url(url).put(RequestBody.create(MEDIA_TYPE, jsonBody));

        return send(builder, token);
    }

    public static CompletableFuture<IdfyResponse> putAsync(HttpUrl url, String jsonBody, String token) throws Exception {
        Builder builder = new Builder().url(url).put(RequestBody.create(MEDIA_TYPE, jsonBody));

        return sendAsync(builder, token);
    }

    public static IdfyResponse patch(HttpUrl url, String jsonBody, String token) throws Exception, IdfyException {
        Builder builder = new Builder().url(url).patch(RequestBody.create(MEDIA_TYPE, jsonBody));

        return send(builder, token);
    }

    public static CompletableFuture<IdfyResponse> patchAsync(HttpUrl url, String jsonBody, String token) throws Exception {
        Builder builder = new Builder().url(url).patch(RequestBody.create(MEDIA_TYPE, jsonBody));

        return sendAsync(builder, token);
    }

    public static IdfyResponse delete(HttpUrl url, String token) throws Exception, IdfyException {
        Builder builder = new Builder().url(url).delete();

        return send(builder, token);
    }

    public static CompletableFuture<IdfyResponse> deleteAsync(HttpUrl url, String token) throws Exception {
        Builder builder = new Builder().url(url).delete();

        return sendAsync(builder, token);
    }

    public static InputStream getStream(HttpUrl url, String token) throws Exception, IdfyException {
        Builder builder = new Builder().url(url);
        
        Request request = buildRequest(builder, token);

        return executeRawRequest(request);
    }

    public static CompletableFuture<InputStream> getStreamAsync(HttpUrl url, String token) throws Exception {
        Builder builder = new Builder().url(url);
        
        Request request = buildRequest(builder, token);

        return executeRawRequestAsync(request);
    }

    private static IdfyResponse send(Builder builder, String token)
            throws Exception, IdfyException {
        Request request = buildRequest(builder, token);

        return executeRequest(request);
    }

    private static CompletableFuture<IdfyResponse> sendAsync(Builder builder, String token) {
        Request request = buildRequest(builder, token);

        return executeRequestAsync(request);
    }

    private static Request buildRequest(Builder builder, String token) {
        try {
            builder.header("X-Idfy-SDK", IdfyConfiguration.getSDKVersion());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(token != null && !token.trim().isEmpty())
            builder.header("Authorization", String.format("Bearer %s", token));

        return createRequest(builder);
    }

    private static RequestBody buildFormBody(Map<String, String> map) {
        FormEncodingBuilder formBodyBuilder = new FormEncodingBuilder();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            formBodyBuilder.add(entry.getKey(), entry.getValue());
        }

        RequestBody formBody = formBodyBuilder.build();

        return formBody;
    }

    private static Request createRequest(Builder builder) {
       Request request = builder.build();

        return request;
    }

    private static IdfyResponse executeRequest(Request request) throws Exception, IdfyException {
        Response httpResponse = client.newCall(request).execute();

        IdfyResponse response = buildResponse(httpResponse);

        if (!httpResponse.isSuccessful()) {
            throw buildException(response, httpResponse.code());
        }
        return response;
    }

    private static CompletableFuture<IdfyResponse> executeRequestAsync(Request request) {
        CompletableFuture<IdfyResponse> response = new CompletableFuture<>();

        client.newCall(request).enqueue(new Callback() {
            @Override public void onFailure(Request call, IOException e) {
                e.printStackTrace();
            }

            @Override public void onResponse(Response externalResponse) throws IOException {
                try {
                    IdfyResponse idfyResponse;
                    try {
                        idfyResponse = buildResponse(externalResponse);
                    } catch (IOException e) {
                        response.completeExceptionally(e);
                        return;
                    }

                    if (externalResponse.isSuccessful()) {
                        response.complete(idfyResponse);
                    } else {
                        IdfyException ex = buildException(idfyResponse, externalResponse.code());
                        response.completeExceptionally(ex);
                    }

                }finally {
                    try {
                        externalResponse.body().close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        return response;
    }

    private static InputStream executeRawRequest(Request request) throws Exception, IdfyException {
        Response httpResponse = client.newCall(request).execute();
        
        if (httpResponse.isSuccessful()) {
            try {
                byte[] bytes = new byte[(int) httpResponse.body().contentLength()];
                final DataInputStream dis = new DataInputStream(httpResponse.body().byteStream());
                dis.readFully(bytes);
                return new ByteArrayInputStream(bytes);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }        

        IdfyResponse response = buildResponse(httpResponse);
        throw buildException(response, httpResponse.code());
    }

    private static CompletableFuture<InputStream> executeRawRequestAsync(Request request) {
        CompletableFuture<InputStream> response = new CompletableFuture<>();

        client.newCall(request).enqueue(new Callback() {
            @Override public void onFailure(Request call, IOException e) {
                e.printStackTrace();
            }

            @Override public void onResponse(Response externalResponse) throws IOException {
                try {
                    if (externalResponse.isSuccessful()) {  // check whether the data is empty (without consuming it) here?
                        byte[] bytes = new byte[(int) externalResponse.body().contentLength()];
                        final DataInputStream dis;

                        try {
                            dis = new DataInputStream(externalResponse.body().byteStream());
                            dis.readFully(bytes);
                            response.complete(new ByteArrayInputStream(bytes));
                            return;
                        } catch (IOException e) {
                            response.completeExceptionally(e);
                            return;
                        }
                    } else {
                        IdfyResponse idfyResponse;
                        try {
                            idfyResponse = buildResponse(externalResponse);
                        } catch (IOException e) {
                            response.completeExceptionally(e);
                            return;
                        }
                        IdfyException ex = buildException(idfyResponse, externalResponse.code());
                        response.completeExceptionally(ex);
                    }

                }finally {
                    try {
                        externalResponse.body().close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        return response;
    }


    private static IdfyResponse buildResponse(Response response) throws IOException {
        String responseJson = "";
        
        String requestId = response.header("Request-Id"); //.getValue();
        String dateStr = response.header("Date"); //.getValue();
        Date requestDate = null;
        if (dateStr != null) {
            try {
                requestDate = DATE_FORMAT.parse(dateStr);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            responseJson = response.body().string();
        } catch (Exception e) {
            System.out.println("Oops. Parsing the response json failed, or the response had no body.");
        }

        return new IdfyResponse(responseJson, requestId, requestDate);
    }

    private static IdfyException buildException(IdfyResponse response, int statusCode) {
        IdfyError idfyError = null;
        String message = "";
        String error = "";

        try {
            idfyError = Mapper.fromJson(response.getResponseJson(), IdfyError.class);
            message = idfyError.getMessage();
            error = idfyError.getError();

        } catch (IOException e) {
            String placeholder = String.format("The server returned an empty response body with status code: %s", statusCode);

            idfyError = new IdfyError();
            idfyError.setCode(placeholder);
            idfyError.setError(placeholder);
            idfyError.setMessage(placeholder);
            idfyError.setErrorDescription(placeholder);

            e.printStackTrace();
        }

        return new IdfyException(statusCode, idfyError, response, message, error);
    }
}
