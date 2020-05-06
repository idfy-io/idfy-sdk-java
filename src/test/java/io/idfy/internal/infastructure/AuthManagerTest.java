package io.idfy.internal.infastructure;

import io.idfy.IdfyConfiguration;
import io.idfy.OAuthScope;
import io.idfy.internal.infastructure.AuthManager;
import io.idfy.models.IdfyException;
import io.idfy.models.OAuthToken;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthManagerTest {

    @Disabled
    @Test
    public void testAuthorize(){
        IdfyConfiguration.setBaseUrl("https://api.idfy.io");
        OAuthToken token = null;
        try {
            token = AuthManager.Authorize("t6b340a4f3e9849f483fe7fec5aacdd4e",
                    "7707103c7ce32afbb09e84928d46f1fb3b2c0a1e9de300a4897d6a75644a7871",
                    Arrays.asList(OAuthScope.AccountRead, OAuthScope.Identify, OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile, OAuthScope.Event));
        }catch (IdfyException e) {
            e.printStackTrace();
            int a = 5;
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(token);
        assertTrue(token.getAccessToken().length() > 0);
        assertTrue(token.getExpiry().isAfter(Instant.now()));
    }
}
