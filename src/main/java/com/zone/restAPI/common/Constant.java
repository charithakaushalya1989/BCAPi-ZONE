package com.zone.restAPI.common;

public class Constant
{


    public static final String TEST_ENV = System.getProperty("test.env", "QA-PHASE2-UI-ECS1");
    public static String BASE_ENV = System.getProperty("base.env", "qa");
    public static final String BASE_DOMAIN = System.getProperty("base.domain", "");
    public static final String BASE_URL = System.getProperty("base.url", "https://fmsi-ccqa.kronos.com");


    public static final String LOGIN_BASE_PATH = System.getProperty("po.base.path", "/Login");
    public static final String ADMIN_BASE_PATH = System.getProperty("po.base.path", "/Admin");


    public static final int PORT = Integer.parseInt(System.getProperty("api.port", "8080"));

    public static final String TOKEN= "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IjUxRkYxRjc5MkEwNTE3NDFFNkREMEU3MDRCOTA3OUE5QUNENDNCOEIiLCJ0eXAiOiJhdCtqd3QiLCJ4NXQiOiJVZjhmZVNvRkYwSG0zUTV3UzVCNXFhelVPNHMifQ.eyJuYmYiOjE2MjI0NDc4NzgsImV4cCI6MTYyMjQ1MTQ3OCwiaXNzIjoiaHR0cHM6Ly9mbXNpLWNjcWEua3Jvbm9zLmNvbS9JZGVudGl0eVNlcnZlci8iLCJhdWQiOiJDQ0FQSSIsImNsaWVudF9pZCI6IkNDLUZFLUFQUCIsImNsaWVudF9hdWRpZW5jZSI6IkNDIiwic3ViIjoiY2UyNTEyOGMtMjQwYS00YjJkLWFlZTAtYzhiNDhiMTcwZmNkIiwiYXV0aF90aW1lIjoxNjIyNDQ3ODUxLCJpZHAiOiJsb2NhbCIsInVzZXJfaWQiOiJjZTI1MTI4Yy0yNDBhLTRiMmQtYWVlMC1jOGI0OGIxNzBmY2QiLCJlbWFpbCI6ImNoYXRodXJhbmdhbmllcEB1a2cuY29tIiwidGVuYW50X2lkIjoiMSIsInNjb3BlIjpbIm9wZW5pZCIsImNjYXBpLmZ1bGxfYWNjZXNzIl0sImFtciI6WyJwd2QiXX0.a5E6O4YNWoSiEkY-OtqVJTkvbr9DEqJ2H-xkXrRIgarJif8iA_2X5VQsOp4T1ucN0fdiEUTFwhOpuWnv0W_p4N1szFW6a-UDKORiLsY5pHKY6FsX1Y0uDT3FAig35garEZ44SPu9KKH2piEGUD6CRUrfdHYG4M9W3ha6Mx5Iv5Ro0TaGwPRJ1QanmItnThafy2vbuDUtcWH-EqBm2MwWN9rI58pxN920rSP1zmi85kG_aEeH4LAniXpjkaHt4eFG6-gHvg3J-8LYn7nFfyA84d0-6qI0bSn7ew394Ilsm6Vhqje232qmK9dSfL7RiyBjeFAUUuNeF-MmjcfnppiK1w";
    public static final String REQ_METHOD_GET = "GET";
    public static final String REQ_METHOD_POST = "POST";
    public static final String REQ_METHOD_PUT = "PUT";
    public static final String REQ_METHOD_DELETE = "DELETE";




    //API status Codes
    public static final int STATUS_CODE_200 = 200;
    public static final int STATUS_CODE_417 = 417;





}
