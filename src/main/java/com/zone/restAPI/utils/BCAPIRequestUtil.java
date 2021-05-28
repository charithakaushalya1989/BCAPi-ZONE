package com.zone.restAPI.utils;

import com.jayway.restassured.response.Response;
import com.zone.restAPI.common.Constant;
import com.zone.restAPI.common.Headers;
import com.zone.restAPI.common.URIs;

import com.zone.restAPI.requests.userLogin.PostUserAuthRequest;


import static com.zone.restAPI.common.Constant.*;

public class BCAPIRequestUtil {

    //Login
    public static Response loginToBc(PostUserAuthRequest postUserAuthRequest)
    {
        setExecutionEnvironmentLogin();
        String body = JacksonUtil.getAsString(postUserAuthRequest);
        Response response = RestUtil.send(Headers.getHeaders(),body, URIs.LOGIN,Constant.REQ_METHOD_POST);
        return response;
    }


    public static void setExecutionEnvironmentLogin() {
        RestUtil.API_HOST = Constant.BASE_URL+":"+Constant.PORT;
        RestUtil.BASE_PATH = LOGIN_BASE_PATH;
        RestUtil.PORT = Constant.PORT;
    }


}
