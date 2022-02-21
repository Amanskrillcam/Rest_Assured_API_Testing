package requestDemo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.runner.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matcher.*;

public class GetData
{
    @Test
    public void GetRequest()
    {
        RestAssured.baseURI="https://api.stripe.com/";
        //request object
        RequestSpecification httprequest=RestAssured.given().auth().basic("sk_test_51KU6QDSEE2G3zko3Po5QWnOxWC8JtkmgdEftQGrsAEC2aLvLVYkbDwW2SQlz93MbpGQXtYBoR5KCw4wRLHi04DV5006erv09Cq","");

        //response object
        Response response=httprequest.request(Method.GET,"v1/customers");
        String responsebody=response.getBody().asString();

        //print response
        System.out.println("response body is:"+responsebody);

        //validate status code
        int statusCode=response.getStatusCode();
        System.out.println("status code is:"+statusCode);
        Assert.assertEquals(statusCode,200);

    }

}
