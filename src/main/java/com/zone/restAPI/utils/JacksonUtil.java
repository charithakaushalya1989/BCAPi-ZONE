package com.zone.restAPI.utils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zone.restAPI.utils.RequestBase;
import com.zone.restAPI.utils.ResponseBase;
import com.zone.restAPI.requests.userLogin.PostUserAuthRequest;

import java.io.IOException;
import java.util.Arrays;

public class JacksonUtil {
    public JacksonUtil() {
    }

    public static String getAsString(PostUserAuthRequest requestBase) {
        return getAsString(requestBase, false);
    }

    public static final String getAsString(RequestBase body, boolean ignoreNull) {
        ObjectMapper mapper = new ObjectMapper();
        if (ignoreNull) {
            mapper.setSerializationInclusion(Include.NON_NULL);
        }

        String jsonInString = "";

        try {
            jsonInString = mapper.writeValueAsString(body);
        } catch (JsonProcessingException var5) {
            jsonInString = Arrays.toString(var5.getStackTrace());
        }

        return jsonInString;
    }

    public static String getAsArrayString(RequestBase... requestBase) {
        return getAsArrayString(true, requestBase);
    }

    public static String getAsArrayString(boolean ignoreNull, RequestBase... requestBase) {
        ObjectMapper mapper = new ObjectMapper();
        if (ignoreNull) {
            mapper.setSerializationInclusion(Include.NON_NULL);
        }

        String jsonInString = "";

        try {
            jsonInString = mapper.writeValueAsString(requestBase);
        } catch (JsonProcessingException var5) {
            jsonInString = Arrays.toString(var5.getStackTrace());
        }

        return jsonInString;
    }

    public static RequestBase getRequestAsObject(String jsonString, boolean ignoreNull) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        if (ignoreNull) {
            mapper.setSerializationInclusion(Include.NON_NULL);
        }

        return (RequestBase)mapper.readValue(jsonString, RequestBase.class);
    }

    public static ResponseBase getResponseAsObject(String jsonString, boolean ignoreNull) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        if (ignoreNull) {
            mapper.setSerializationInclusion(Include.NON_NULL);
        }

        return (ResponseBase)mapper.readValue(jsonString, ResponseBase.class);
    }

    public static ResponseBase getResponseAsObject(String jsonString, boolean ignoreNull, Class<?> cls) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        if (ignoreNull) {
            mapper.setSerializationInclusion(Include.NON_NULL);
        }

        return (ResponseBase)mapper.readValue(jsonString, cls);
    }
}