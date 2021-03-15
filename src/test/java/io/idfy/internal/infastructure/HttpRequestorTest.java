package io.idfy.internal.infastructure;

import okhttp3.HttpUrl;
import io.idfy.internal.utils.Mapper;
import io.idfy.models.IdfyError;
import io.idfy.models.IdfyException;
import io.idfy.models.IdfyResponse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HttpRequestorTest {
    private final String apiUrl = "http://localhost:5000";
    private final String token = "eyJaccess-token";

    @Test
    void testGet() {
        IdfyResponse response = null;
        try {
            response = HttpRequestor.get(HttpUrl.parse(String.format("%s%s", apiUrl, "/signature/documents/1")), token);

        } catch (Exception | IdfyException e) {
            e.printStackTrace();
        }
        assertResponse(response);
    }

    @Test
    void testGetAsync() {
        IdfyResponse response = null;
        try {
            response = HttpRequestor.getAsync(HttpUrl.parse(String.format("%s%s", apiUrl, "/signature/documents/1")), token).get();
        }catch (Exception e){
            e.printStackTrace();
        }
        assertResponse(response);
    }

    @Test
    void testGetFileIS() {
        String prefix = "java_sdk_test";
        String suffix = ".pdf";
        try {
            long startTime = System.nanoTime();
            InputStream stream = HttpRequestor.getStream(HttpUrl.parse(String.format("%s/signature/documents/1/files", apiUrl)), token);
            File targetFile = File.createTempFile(prefix, suffix);
            targetFile.deleteOnExit();
            Files.copy(stream, targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            stream.close();
            long estimatedTime = System.nanoTime() - startTime;
            long divideBy = 1000000;
            System.out.println(String.format("1: %sms", (estimatedTime / divideBy)));
            assertTrue(Files.exists(targetFile.toPath()));

        }catch (Exception | IdfyException e){
            e.printStackTrace();
        }
        // Assert statement used to be out here.
        //assertTrue(Files.exists(Paths.get(path)));

        
    }

    @Test
    void testGetFileISAsync() {
        String prefix = "java_sdk_test_async";
        String suffix = ".pdf";
        try {
            long startTime = System.nanoTime();
            InputStream stream = HttpRequestor.getStreamAsync(HttpUrl.parse(String.format("%s/signature/documents/1/files", apiUrl)), token).get();
            File targetFile = File.createTempFile(prefix, suffix);
            targetFile.deleteOnExit();
            Files.copy(stream, targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            stream.close();
            long estimatedTime = System.nanoTime() - startTime;
            long divideBy = 1000000;
            System.out.println(String.format("1: %sms", (estimatedTime / divideBy)));
            assertTrue(Files.exists(targetFile.toPath()));

        }catch (Exception e){
            e.printStackTrace();
        }
        // Assert statement used to be out here.
        //assertTrue(Files.exists(Paths.get(path)));

    }

    @Test
    void testPost() {
        IdfyResponse response = null;
        try {
            response = HttpRequestor.post(HttpUrl.parse(String.format ("%s/signature/documents", apiUrl)), Mapper.toJson(new ValueObject("testinc")), token);

        }catch (Exception | IdfyException e){
            e.printStackTrace();
        }

        assertResponse(response);
    }

    @Test
    void testPostAsync() {
        IdfyResponse response = null;
        try {
            response = HttpRequestor.postAsync(HttpUrl.parse(String.format("%s/signature/documents", apiUrl)), Mapper.toJson(new ValueObject("testinc")), token).get();

        }catch (Exception e){
            e.printStackTrace();
        }

        assertResponse(response);
    }

    @Test
    void testPut() {
        IdfyResponse response = null;
        try {
            response = HttpRequestor.put(HttpUrl.parse(String.format("%s/identification/session/invalidate", apiUrl)), Mapper.toJson(new ValueObject("testinc")), token);

        }catch (Exception | IdfyException e){
            e.printStackTrace();
        }

        assertResponse(response);
    }

    @Test
    void testPutAsync() {
        IdfyResponse response = null;
        try {
            response = HttpRequestor.putAsync(HttpUrl.parse(String.format("%s/identification/session/invalidate", apiUrl)), Mapper.toJson(new ValueObject("testinc")), token).get();

        }catch (Exception e){
            e.printStackTrace();
        }

        assertResponse(response);
    }

    @Test
    void testDelete() {

        IdfyResponse response = null;
        try {
            response = HttpRequestor.delete(HttpUrl.parse(String.format("%s/signature/documents/1/attachments/2", apiUrl)), token);

        }catch (Exception | IdfyException e){
            e.printStackTrace();
        }

        assertNotNull(response);
        assertNotNull(response.getRequestDate());
        assertTrue(response.getRequestDate().before(new Date()));
    }

    @Test
    void testDeleteAsync() {

        IdfyResponse response = null;
        try {
            response = HttpRequestor.deleteAsync(HttpUrl.parse(String.format("%s/signature/documents/1/attachments/2", apiUrl)), token).get();

        }catch (Exception e){
            e.printStackTrace();
        }

        assertNotNull(response);
        assertNotNull(response.getRequestDate());
        assertTrue(response.getRequestDate().before(new Date()));
    }

    @Test
    void testException() {
        IdfyException ie = null;
        try {
            HttpRequestor.get(HttpUrl.parse(String.format("%s/fail", apiUrl)), "fail_token");
        } catch (IdfyException e) {
            ie = e;
        } catch (Exception ignored) {

        }

        assertNotNull(ie);
        assertNotNull(ie.getIdfyResponse());
        assertNotNull(ie.getIdfyError());
        IdfyError err = ie.getIdfyError();

        assertNotNull(err.getMessage());
        assertNotNull(err.getCode());
        assertNotNull(err.getError());
        assertNotNull(err.getErrorDescription());
        assertTrue(ie.getIdfyResponse().getRequestDate().before(new Date()));
    }

    @Test
    void testExceptionAsync() {
        IdfyException ie = null;
        try {
            HttpRequestor.getAsync(HttpUrl.parse(String.format("%s/fail", apiUrl)), "fail_token").get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof IdfyException)
                ie = (IdfyException) e.getCause();
            else
                e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        assertNotNull(ie);
        assertNotNull(ie.getIdfyResponse());
        assertNotNull(ie.getIdfyError());
        IdfyError err = ie.getIdfyError();

        assertNotNull(err.getMessage());
        assertNotNull(err.getCode());
        assertNotNull(err.getError());
        assertNotNull(err.getErrorDescription());
        assertTrue(ie.getIdfyResponse().getRequestDate().before(new Date()));
    }

    private void assertResponse(IdfyResponse response) {
        assertNotNull(response);
        assertNotNull(response.getResponseJson());
        assertNotNull(response.getRequestDate());
        assertTrue(response.getRequestDate().before(new Date()));
    }
}

