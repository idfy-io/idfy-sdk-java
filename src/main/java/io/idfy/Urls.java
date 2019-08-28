package io.idfy;

public final class Urls {
    public static final String BASE_URL = IdfyConfiguration.getBaseUrl();

    static final String DEFAULT_BASE_URL = "https://api.idfy.io";

    static final String DEFAULT_O_AUTH_BASE_URL = BASE_URL;

    static final String TEST_BASE_URL = "http://localhost:5000";

    public static final String O_AUTH_TOKEN = String.format("%s/oauth/connect/token", IdfyConfiguration.getOAuthBaseUrl());

    public static final String SIGNATURE = String.format("%s/signature", BASE_URL);

    public static final String SIGNATURE_DOCUMENTS =  String.format("%s/documents", SIGNATURE);

    public static final String NOTIFICATION = String.format("%s/notification", BASE_URL);

    public static final String IDENTIFICATION = String.format("%s/identification", BASE_URL);

    public static final String MERCHANT_SIGN = String.format("%s/merchant", BASE_URL);

    public static final String JWT = String.format("%s/jwt", BASE_URL);

    public static final String VALIDATION = String.format("%s/validation", BASE_URL);

    public static final String ADMIN = String.format("%s/admin", BASE_URL);

    public static final String INFORMATION = String.format("%s/information", BASE_URL);

    public static final String TEXT = String.format("%s/text", BASE_URL);

    public static final String DEPOSIT = String.format("%s/deposit", BASE_URL);

    public static final String SHARE = String.format("%s/share", BASE_URL);
}
