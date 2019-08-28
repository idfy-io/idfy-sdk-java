package io.idfy.internal.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Remove this whole class if OkHttp's "parser" works as expected.

public class Encoder {

    /**
     * Escape the given string to be used as URL query value.
     *
     * @param str String to be escaped
     * @return Escaped string
     */
    public static String escapeString(String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

}
