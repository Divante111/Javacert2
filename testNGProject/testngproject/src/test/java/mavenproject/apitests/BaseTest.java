package mavenproject.apitests;

import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class BaseTest {

    protected RequestSpecification spec;

    @BeforeMethod
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();
    }
    protected Response createBooking(){
        JSONObject body = new JSONObject();
        body.put("firstname" , "Divate");
        body.put("lastname" , "Parness");
        body.put("totalprice", 150);
        body.put("depositpaid", true);

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", "2024-08-23");
        bookingdates.put("checkout", "2024-08-30");


        body.put("bookingdates", bookingdates);

        Response response = RestAssured.given().contentType(ContentType.JSON).body(body.toString()).post("https://restful-booker.herokuapp.com/booking");

        // response.print();
        return response;
    }
}
