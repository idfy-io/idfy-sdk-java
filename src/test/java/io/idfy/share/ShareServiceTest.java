/*
 * Idfy Secure Share
 * This endpoints enables secure sharing with multiple e-ids offered for login
 *
 * OpenAPI spec version: v1
 * 
 */


package io.idfy.share;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.share.models.CreateShareRequest;
import io.idfy.share.models.ShareResponse;
import io.idfy.share.models.UpdateShareRequest;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for ShareService
 */

public class ShareServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final ShareService api = new ShareService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Create secure bucket
     *
     * Creates a new secure bucket. In the response you will receive an id to retrieve info about the share at a later time and upload content.
     */
    @Disabled("The example response uses 'string' instead of a valid UUID/GUID.")
    @Test
    public void createSecureBucketTest() throws IdfyException, Exception {
        CreateShareRequest request =  new CreateShareRequest.Builder().build();
        ShareResponse response = api.createSecureBucket(request);
        assertNotNull(response);
    }
    
    /**
     * Delete secure bucket
     *
     * Deletes the specified secure bucket.
     */
    @Test
    public void deleteSecureBucketTest() throws IdfyException, Exception {
        String id = new String("123");
        api.deleteSecureBucket(id);
    }
    
    /**
     * List secure buckets
     *
     * Returns a list of all your secure buckets
     */
    @Disabled("The example response for the “List Secure Buckets” endpoint is a single item instead of a list containing a single item. ")
    @Test
    public void listSecureBucketsTest() throws IdfyException, Exception {
        ShareResponse[] response = api.listSecureBuckets();
        assertNotNull(response);
    }
    
    /**
     * Retrieve secure bucket
     *
     * Retrieves details of a single secure bucket
     */
    @Test
    public void retrieveSecureBucketTest() throws IdfyException, Exception {
        String id = new String("123");
        ShareResponse response = api.retrieveSecureBucket(id);
        assertNotNull(response);
    }
    
    /**
     * Update secure bucket
     *
     * 
     */
    @Test
    public void updateSecureBucketTest() throws IdfyException, Exception {
        String id = new String("123");
        UpdateShareRequest request =  new UpdateShareRequest.Builder().build();
        ShareResponse response = api.updateSecureBucket(id, request);
        assertNotNull(response);
    }
    
    /**
     * Upload content
     *
     * Upload content to an existing bucket. The content will be deleted when the secure bucket expires. The content type has to be multipart/form-data;
     */
    @Test
    public void uploadContentTest() throws IdfyException, Exception {
        String id = new String("123");
        String contentId = new String("123");
        api.uploadContent(id, contentId);
    }
    

}
