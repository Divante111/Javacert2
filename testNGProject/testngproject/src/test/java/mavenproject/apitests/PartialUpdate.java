package mavenproject.apitests;

import java.util.List;

import org.json.JSONObject;
import org.junit.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PartialUpdate {
    
    @Test
    public void createBookingTest(){

        // create json body
        JSONObject body = new JSONObject();
        body.put("firstname" , "Divante");
        body.put("lastname" , "Parness");
        body.put("totalprice", 150);
        body.put("depositpaid", true);

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", "2024-08-23");
        bookingdates.put("checkout", "2024-08-30");


        body.put("bookingdates", bookingdates);
        System.out.println(body);

        Response responseUpdated = RestAssured.given().contentType(ContentType.JSON).body(body.toString()).post("https://restful-booker.herokuapp.com/booking/");

        responseUpdated.print();
        System.out.println(responseUpdated.jsonPath().getString("bookingid"));
        int bookingId = responseUpdated.jsonPath().getInt("bookingid");


        ///////////////////////////////////
        Response responseVerify = RestAssured.given().contentType(ContentType.JSON).body(body.toString()).get("https://restful-booker.herokuapp.com/booking/" + bookingId);
        // verify response 200
        Assert.assertEquals(responseVerify.getStatusCode(), 200, "Status code should be 200, but it's not");

        Response responseList = RestAssured.given().contentType(ContentType.JSON).body(body.toString()).get("https://restful-booker.herokuapp.com/booking/");
        // Verify at least 1 booking id in response
        List<Integer> bookingIds = responseList.jsonPath().getList("bookingid");
        Assert.assertFalse(bookingIds.isEmpty(), "List of booking Ids is empty but it should not be");

        // verify all fields
        SoftAssert softAssert = new SoftAssert();

        
        String actualFirstName = responseVerify.jsonPath().getString("firstname");
        String actualLastName = responseVerify.jsonPath().getString("lastname");
        System.out.println(actualFirstName);
        System.out.println("\n\n\n\n\n\n");
        softAssert.assertEquals(actualFirstName, "Divante", "firstname is not expected");
        softAssert.assertEquals(actualLastName, "Parness", "lastname is not expected");
        System.out.println("\n\n\n\n\n\n");
        softAssert.assertEquals(actualLastName, "Parness", "lastname tested a second time");

        
        int price = responseVerify.jsonPath().getInt("totalprice");
        softAssert.assertEquals(price, 150, "The price is not expected");

        boolean deposidPaid = responseVerify.jsonPath().getBoolean("depositpaid");
        softAssert.assertTrue(deposidPaid, "Deposit should be true but it's not");

        String actualCheckin = responseVerify.jsonPath().getString("bookingdates.checkin");
        softAssert.assertEquals(actualCheckin, "2024-08-23", "Checkin value was not what was expected");

        String actualCheckout = responseVerify.jsonPath().getString("bookingdates.checkout");
        softAssert.assertEquals(actualCheckout, "2024-08-30", "Checkout value was not what was expected");


        
        System.out.println("trying this");
        


        body = new JSONObject();
        body.put("firstname" , "patched123");
        body.put("lastname" , "patched345");
        body.put("totalprice", 250);
        body .put("depositpaid", true);

        bookingdates = new JSONObject();
        // bookingdates.put("checkin", "2024-08-30");
        // bookingdates.put("checkout", "2024-09-30");


        // body.put("bookingdates", bookingdates);
        System.out.println(body);
        System.out.println(bookingId);
        Response responsePatch = RestAssured.given().auth().preemptive().basic("admin", "password123").contentType(ContentType.JSON).body(body.toString()).patch("https://restful-booker.herokuapp.com/booking/" + bookingId);// https://restful-booker.herokuapp.com/booking/1 


//      "username" : "admin",
//     "password" : "password123"

        Assert.assertEquals(responsePatch.getStatusCode(), 200, "Status code should be 200, but it's not");
        
        System.out.println("-----------------------------------------------");

        Response checkAfterPatch = RestAssured.given().contentType(ContentType.JSON).body(body.toString()).get("https://restful-booker.herokuapp.com/booking/" + bookingId);

        checkAfterPatch.print();
        softAssert.assertAll();
        Response responseVerify2 = RestAssured.given().contentType(ContentType.JSON).body(body.toString()).get("https://restful-booker.herokuapp.com/booking/" + bookingId);
        responseVerify2.print();
    }
}