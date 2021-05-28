package com.zone.restAPI.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.response.Response;
import com.zone.restAPI.utils.RestUtil;

import java.io.IOException;

public class BCAPIResponseUtil
{
    public static int getResponseCode(Response response) {
        return RestUtil.getResponseCode(response);
    }

    public static String getValueFromResponse(Response response, String key) {
        return RestUtil.getValue(response, key);
    }

    public static String getValuesFromHeader(Response response,String key)
    {
        String cookie = response.header(key);
        return cookie;
    }

    public static <R> Object getResponseAsObject(String response, Class<R> classType) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return mapper.readValue(response, classType);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
