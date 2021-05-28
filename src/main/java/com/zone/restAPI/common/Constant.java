package com.zone.restAPI.common;

public class Constant
{


    public static final String TEST_ENV = System.getProperty("test.env", "QA-PHASE2-UI-ECS1");
    public static String BASE_ENV = System.getProperty("base.env", "qa");
    public static final String BASE_DOMAIN = System.getProperty("base.domain", "");
    public static final String BASE_URL = System.getProperty("base.url", "https://accounts.google.com/AddSession?hl=en&continue=https://mail.google.com/mail&service=mail&ec=GAlAFw");


    public static final String LOGIN_BASE_PATH = System.getProperty("po.base.path", "/auth");


    public static final int PORT = Integer.parseInt(System.getProperty("api.port", "8080"));

    public static final String REQ_METHOD_GET = "GET";
    public static final String REQ_METHOD_POST = "POST";
    public static final String REQ_METHOD_PUT = "PUT";
    public static final String REQ_METHOD_DELETE = "DELETE";




    //API status Codes
    public static final int STATUS_CODE_200 = 200;
    public static final int STATUS_CODE_417 = 417;





}
