package mavenproject.apitests;

import org.json.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateBookingTests extends BaseTest{
    @Test
    public void createBookingTest(){
        Response responseCreate = createBooking();
        
        int bookingid = responseCreate.jsonPath().getInt("bookingid");
        System.out.println(bookingid +" is the booking id");

        JSONObject body = new JSONObject();
        body.put("firstname" , "Divate");
        body.put("lastname" , "Parness");
        body.put("totalprice", 150);
        body.put("depositpaid", true);

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", "2024-08-23");
        bookingdates.put("checkout", "2024-08-30");


        body.put("bookingdates", bookingdates);

        Response responseUpdate = RestAssured.given().contentType(ContentType.JSON).body(body.toString()).put("https://restful-booker.herokuapp.com/booking/" + bookingid);

        responseUpdate.print();
        // create json body

        //get response

        //Verifications


        /*{"firstname":"Jim",
        "lastname":"Wilson",
        "totalprice":723,
        "depositpaid":false,
        "bookingdates":{
                "checkin":"2021-10-24",
                "checkout":"2023-08-31"}}
         */
    }
}
