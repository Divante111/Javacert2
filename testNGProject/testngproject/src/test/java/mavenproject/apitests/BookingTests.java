package mavenproject.apitests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BookingTests extends BaseTest{
    @Test
    public void bookingTests(){

       // create body using pojo's
       Bookingdates bookingdates = new Bookingdates("2024-05-05", "2024-06-06");
       Booking booking = new Booking("Divante", "Parness", 222, true, "baby crib", bookingdates);

        Response responsePost = RestAssured.given().contentType(ContentType.JSON).body(booking).post("https://restful-booker.herokuapp.com/booking");
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
        softAssert.assertEquals(actualFirstName, "Divante", "firstname is not expected");
        softAssert.assertEquals(actualLastName, "Parness", "lastname is not expected");
        System.out.println("\n\n\n\n\n\n");
        softAssert.assertEquals(actualLastName, "Parness", "lastname tested a second time");

        
        int price = response.jsonPath().getInt("totalprice");
        softAssert.assertEquals(price, 222, "The price is not expected");

        boolean deposidPaid = response.jsonPath().getBoolean("depositpaid");
        softAssert.assertTrue(deposidPaid, "Deposit should be true but it's not");

        String actualCheckin = response.jsonPath().getString("bookingdates.checkin");
        softAssert.assertEquals(actualCheckin, "2024-05-05", "Checkin value was not what was expected");

        String actualCheckout = response.jsonPath().getString("bookingdates.checkout");
        softAssert.assertEquals(actualCheckout, "2024-06-06", "Checkout value was not what was expected");


        // softAssert.assertAll();
        System.out.println("Finished");
    }
    
}
