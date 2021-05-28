package com.zone.restAPI.common;

import java.util.HashMap;
import java.util.Map;

public class Headers
{
    public Headers() {
    }

    private static final String APPLICATION_JSON = "application/json";

    public static Map<String, String> getHeadersWithCookie(String cookie)
    {
        HashMap<String,String> headers = new HashMap<>();
        headers.put("Content-Type",APPLICATION_JSON);
        headers.put("Cookie",cookie);

        return headers;
    }
    public static Map<String, String> getHeadersWithCookieUserName(String cookie,String UserName)
    {
        HashMap<String,String> headers = new HashMap<>();
        headers.put("Content-Type",APPLICATION_JSON);
        headers.put("Cookie",cookie);
        headers.put("userid","OPS$"+UserName);

        return headers;
    }
    public static Map<String, String> getHeadersWithCookieAndUserId(String cookie,String UserId)
    {
        HashMap<String,String> headers = new HashMap<>();
        headers.put("Content-Type",APPLICATION_JSON);
        headers.put("Cookie",cookie);
        headers.put("UserId",UserId);
        return headers;
    }
    public static Map<String, String> getHeaders()
    {
        HashMap<String,String> headers = new HashMap<>();
        headers.put("Content-Type",APPLICATION_JSON);
        return headers;
    }

    public static Map<String, String> getHeadersWithCookieUserIdAndOpco(String cookie, String UserId, String opcoNumber)
    {
        HashMap<String,String> headers = new HashMap<>();
        headers.put("Content-Type",APPLICATION_JSON);
        headers.put("Cookie",cookie);
        headers.put("UserId",UserId);
        headers.put("opcoNumber",opcoNumber);
        return headers;
    }

    public static Map<String, String> getHeadersWithCookiUserIdOpcoGlobalMethod(String cookie,String opcoNumber,String UserId,String globalMethod)
    {
        HashMap<String,String> headers = new HashMap<>();
        headers.put("Content-Type",APPLICATION_JSON);
        headers.put("Cookie",cookie);
        headers.put("opcoNumber",opcoNumber);
        headers.put("UserId",UserId);
        headers.put("globalMethod",globalMethod);
        return headers;
    }
}
