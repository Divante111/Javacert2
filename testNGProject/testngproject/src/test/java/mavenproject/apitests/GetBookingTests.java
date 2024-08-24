package mavenproject.apitests;
import java.util.List;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;




public class GetBookingTests extends BaseTest{

    @Test
    public void GetBookingIdsNoFilter(){
        
        JSONObject body = new JSONObject();
        body.put("firstname" , "Divate");
        body.put("lastname" , "Parness");
        body.put("totalprice", 150);
        body.put("depositpaid", true);

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", "2024-08-23");
        bookingdates.put("checkout", "2024-08-30");


        body.put("bookingdates", bookingdates);

        Response responsePost = RestAssured.given().contentType(ContentType.JSON).body(body.toString()).post("https://restful-booker.herokuapp.com/booking");
        int bookingid = responsePost.jsonPath().getInt("bookingid");
        System.out.println(spec);
        
        // the spec contains the url to the api we are trying to access
        // this path parameter allows us to access bookingId key and grab the value of 5 inside of the api
        spec.pathParam("bookingId", bookingid);
        // spec.pathParam("bookingId", 5);
        // Get response with booking ids
        Response response = RestAssured.given(spec).get("booking/{bookingId}");
        response.print();

        // verify response 200
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200, but it's not");

        // Verify at least 1 booking id in response
        List<Integer> bookingIds = response.jsonPath().getList("bookingid");
        // Assert.assertFalse(bookingIds.isEmpty(), "List of booking Ids is empty but it should not be");

        // verify all fields
        SoftAssert softAssert = new SoftAssert();

        String actualFirstName = response.jsonPath().getString("firstname");
        String actualLastName = response.jsonPath().getString("lastname");
        System.out.println(actualFirstName);
        System.out.println("\n\n\n\n\n\n");
        softAssert.assertEquals(actualFirstName, "Divate", "firstname is not expected");
        softAssert.assertEquals(actualLastName, "Parness", "lastname is not expected");
        System.out.println("\n\n\n\n\n\n");
        softAssert.assertEquals(actualLastName, "Parness", "lastname tested a second time");

        
        int price = response.jsonPath().getInt("totalprice");
        softAssert.assertEquals(price, 150, "The price is not expected");

        boolean deposidPaid = response.jsonPath().getBoolean("depositpaid");
        softAssert.assertTrue(deposidPaid, "Deposit should be true but it's not");

        String actualCheckin = response.jsonPath().getString("bookingdates.checkin");
        softAssert.assertEquals(actualCheckin, "2024-08-23", "Checkin value was not what was expected");

        String actualCheckout = response.jsonPath().getString("bookingdates.checkout");
        softAssert.assertEquals(actualCheckout, "2024-08-30", "Checkout value was not what was expected");


        // softAssert.assertAll();
        System.out.println("trying this");
        /*
         * {
         *      "firstname":"Mary",
         *      "lastname":"Brown",
         *      "totalprice":543,
         *      "depositpaid":true,
         *      "bookingdates":{
         *                  "checkin":"2022-08-24",
         *                  "checkout":"2023-10-09"
         *                  }
         * }
         * 
         * 
         */
    }
}
