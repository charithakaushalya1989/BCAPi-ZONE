package com.zone.restAPI.tests.userLogin;

import com.jayway.restassured.response.Response;

import com.zone.restAPI.common.Constant;
import com.zone.restAPI.requests.userLogin.PostUserAuthRequest;
import com.zone.restAPI.utils.BCAPIRequestUtil;
import com.zone.restAPI.utils.BCAPIResponseUtil;
import com.zone.restAPI.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PostUserLoginTest extends TestBase
{
    @BeforeClass(alwaysRun = true)
    public void init(ITestContext iTestContext) throws Exception {
        iTestContext.setAttribute("feature", "Login - User Login");
    }

    @Test()
    public void testLoginToBCWithValidUserData()
    {
        PostUserAuthRequest postUserAuthRequest = new PostUserAuthRequest();
        postUserAuthRequest.setPostUserAuthRequest("web","pw2022","test123");
        Response userAuthResponse = BCAPIRequestUtil.loginToBc(postUserAuthRequest);
        softAssert.assertEquals(BCAPIResponseUtil.getResponseCode(userAuthResponse),Constant.STATUS_CODE_200,"Invalid status code return");
        softAssert.assertEquals(BCAPIResponseUtil.getValueFromResponse(userAuthResponse,"message"),"Authentication successful", "Invalid Status Return");
        softAssert.assertAll();

    }

    @Test()
    public void testLoginToBCWithInValidUserData()
    {
        PostUserAuthRequest postUserAuthRequest = new PostUserAuthRequest();
        postUserAuthRequest.setPostUserAuthRequest("web","pw2022", "test123");
        Response userAuthResponse = BCAPIRequestUtil.loginToBc(postUserAuthRequest);
        softAssert.assertEquals(BCAPIResponseUtil.getResponseCode(userAuthResponse),401,"Invalid status code return");
        softAssert.assertEquals(BCAPIResponseUtil.getValueFromResponse(userAuthResponse,"message"),"null", "Invalid Status Return");
        softAssert.assertAll();
    }
}
