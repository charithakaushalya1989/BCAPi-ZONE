package com.zone.restAPI.utils;


import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.LogStatus;
import com.zone.restAPI.Listners.ExtentReportListner;
import org.json.JSONException;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


@Listeners(ExtentReportListner.class)
public class TestBase extends ExtentReportListner{

    public SoftAssert softAssert;
    private static String testRelease, testCaseID;

    @BeforeSuite(alwaysRun = true)
    public static void createBuild() throws JSONException {

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeEveryTest() {
        softAssert = new SoftAssert();
    }

    @BeforeClass(alwaysRun = true)
    public void init() {


    }

    @AfterMethod(alwaysRun = true)
    public void cleanUp(ITestResult result) {
        try
        {
            if(result.getStatus()==ITestResult.FAILURE)
            {
                String TestCaseName = this.getClass().getSimpleName() + " Test Case Failure";
                test.log(Status.FAIL, TestCaseName);
                //  logger.log(LogStatus.FAIL, image, this.getClass().getSimpleName() + " Test Case Failure and Title/Boolean Value Failed");
            }
            else if(result.getStatus()==ITestResult.SUCCESS)
            {
                test.log(Status.PASS, this.getClass().getSimpleName() + " Test Case Success");
            }
            else if(result.getStatus()==ITestResult.SKIP)
            {
                test.log(Status.SKIP, this.getClass().getSimpleName() + " Test Case Skipped");
            }
            //reports.endTest(test);
            reports.flush();
        }
        catch(Throwable t)
        {
            test.log(Status.ERROR,t.fillInStackTrace());
        }
    }
    @AfterClass
    public void tearDownSuite() {
        reports.flush();
       // reports.close();
    }

}
