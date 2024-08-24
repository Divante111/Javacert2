package mavenproject.apitests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class GetBookingIdsTest extends BaseTest{
    
    @Test
    public void getBookingIDsWithoutFilterTest(){
        Response response = RestAssured.given(spec).get("/booking");
        response.print();

        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");

        List<Integer> bookingIds = response.jsonPath().getList("bookingid");
        // Assert.assertFalse(bookingIds.isEmpty(), "List of booking Ids is empty, but it shouldn't be");
    }

    @Test
    public void getBookingIdsWithFilterTest(){

        // JSONObject body = new JSONObject();
        // body.put("firstname" , "Divate");
        // body.put("lastname" , "Parness");
        // body.put("totalprice", 150);
        // body.put("depositpaid", true);

        // JSONObject bookingdates = new JSONObject();
        // bookingdates.put("checkin", "2024-08-23");
        // bookingdates.put("checkout", "2024-08-30");


        // body.put("bookingdates", bookingdates);

        // Response responsePost = RestAssured.given().contentType(ContentType.JSON).body(body.toString()).post("https://restful-booker.herokuapp.com/booking");

        // add query parameter
        spec.queryParam("firstname", "Susan");
        // Response response = RestAssured.given(spec).get("/booking?firstname=Susan");
        Response response = RestAssured.given(spec).get("/booking");
        response.print();

        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");

        List<Integer> bookingIds = response.jsonPath().getList("bookingid");
        // Assert.assertFalse(bookingIds.isEmpty(), "List of booking Ids is empty, but it shouldn't be");
    }

    @Test 
    public void tryingThis(){
        Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking/8");
        response.print();

    }

}
