package io.idfy;

import io.idfy.models.OAuthToken;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public final class IdfyConfiguration
{
    private static Duration httpTimeout;
    private static String baseUrl;
    private static String oAuthBaseUrl;
    private static String clientId;
    private static String clientSecret;
    private static List<OAuthScope> oAuthScopes;
    private static OAuthToken oAuthToken;

    public static void setClientCredentials(String clientId, String clientSecret, List<OAuthScope> oAuthScopes)
    {
        IdfyConfiguration.clientId = clientId;
        IdfyConfiguration.clientSecret = clientSecret;
        IdfyConfiguration.oAuthScopes = oAuthScopes;
    }

    public static String getBaseUrl() {
        if(baseUrl == null || baseUrl.trim().isEmpty())
            return Urls.DEFAULT_BASE_URL;
        return baseUrl;
    }

    public static void setBaseUrl(String baseUrl) {
        IdfyConfiguration.baseUrl = baseUrl;
    }

    public static String getOAuthBaseUrl() {
        if(oAuthBaseUrl == null || oAuthBaseUrl.trim().isEmpty())
            return Urls.DEFAULT_O_AUTH_BASE_URL;
        return oAuthBaseUrl;
    }

    public static void setOAuthBaseUrl(String oAuthBaseUrl) {
        IdfyConfiguration.oAuthBaseUrl = oAuthBaseUrl;
    }

    public static Duration getHttpTimeout() {
        return httpTimeout;
    }

    public static void setHttpTimeout(Duration httpTimeout) {
        IdfyConfiguration.httpTimeout = httpTimeout;
    }

    public static OAuthToken getOAuthToken() {
        return oAuthToken;
    }

    public static void setOAuthToken(io.idfy.models.OAuthToken OAuthToken) {
        IdfyConfiguration.oAuthToken = OAuthToken;
    }

    public static String getClientId() {
        return clientId;
    }

    public static String getClientSecret() {
        return clientSecret;
    }

    public static List<OAuthScope> getoAuthScopes() {
        return oAuthScopes;
    }

    public static String getSDKVersion() throws IOException {
        final Properties properties = new Properties();
        properties.load(IdfyConfiguration.class.getClassLoader().getResourceAsStream("project.properties"));
        return properties.getProperty("version");
    }
}


