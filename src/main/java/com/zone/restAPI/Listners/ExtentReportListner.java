package com.zone.restAPI.Listners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class ExtentReportListner implements ITestListener {
    protected static ExtentReports reports;
    protected static ExtentTest test;
    protected static ExtentHtmlReporter html;


    private static String resultpath = "test";

    private static String getResultPath() {
        resultpath = "test";//new SimpleDateFormat("yyyy-MM-dd hh-mm.ss").format(new Date());
        if (!new File(resultpath).isDirectory()) {
            new File(resultpath);
        }
        return resultpath;
    }

    String ReportLocation = "test-output/Report/" + resultpath + "/";
    @Override
    public void onTestStart(ITestResult result) {
        test = reports.createTest(result.getMethod().getMethodName());
        test.log(Status.INFO, result.getMethod().getMethodName());
        //System.out.println(result.getTestClass().getTestName());
        System.out.println(result.getMethod().getMethodName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test is pass");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test is fail");
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test is skipped");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }
    @Override
    public void onStart(ITestContext context) {
        //OLD extend report
        /*System.out.println(ReportLocation + "  ReportLocation");
        reports = new ExtentReports(ReportLocation + "ExtentReport.html");
        reports
                .addSystemInfo("Host Name", "ZONE24")
                .addSystemInfo("Environment", "API")
                .addSystemInfo("User Name", "Pasindu Akalanka");
        reports.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));*/
        //Html reports
        html = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/Report/test/ExtentReport.html");
        reports = new ExtentReports();
        reports.attachReporter(html);
        html.config().setReportName("API");
        html.config().setTheme(Theme.DARK);
        html.config().setDocumentTitle("API Automation");
    }
    @Override
    public void onFinish(ITestContext context) {
        //reports.endTest(test);
        reports.flush();

    }
}
