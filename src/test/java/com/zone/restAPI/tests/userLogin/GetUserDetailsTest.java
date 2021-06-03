package com.zone.restAPI.tests.userLogin;

import com.jayway.restassured.response.Response;
import com.zone.restAPI.common.BCApiException;
import com.zone.restAPI.common.Constant;
import com.zone.restAPI.response.userDetails.GetUserDetailsResponse;
import com.zone.restAPI.utils.BCAPIRequestUtil;
import com.zone.restAPI.utils.BCAPIResponseUtil;
import com.zone.restAPI.utils.HelperUtil;
import com.zone.restAPI.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetUserDetailsTest extends TestBase{
    private static int indexFromResponse;

    @BeforeClass(alwaysRun = true)
    public void init(ITestContext iTestContext) throws Exception {
        iTestContext.setAttribute("feature", "User - User Details");
    }

    @Test(priority = 1)
    public void verifyUserDetailsTest() throws BCApiException {
        Response getUserDetailsResponse=BCAPIRequestUtil.getUserDetails();
        GetUserDetailsResponse getUserDetails = (GetUserDetailsResponse) BCAPIResponseUtil.getResponseAsObject(getUserDetailsResponse.asString(), GetUserDetailsResponse.class);
        indexFromResponse = HelperUtil.getArrayIndexFromResponseObject(getUserDetailsResponse.asString(),"/data","firstName","Chathuranganie");
        String userName = getUserDetails.data.get(indexFromResponse).firstName;
        softAssert.assertEquals(BCAPIResponseUtil.getResponseCode(getUserDetailsResponse),Constant.STATUS_CODE_200,"Invalid status code return");
        softAssert.assertEquals(userName,"Chathuranganie");
        softAssert.assertAll();
    }
}
