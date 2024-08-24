package mavenproject.apitests;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class GetBookingXML extends BaseTest
{
    @Test
    public void xmlTest(){

        Header xml = new Header("Accept", "application/xml");
        
        Response response = RestAssured.given(spec).header(xml).
        log().all().
        get("/booking/5");
        response.print();
        String actualFirstName = response.xmlPath().getString("booking.firstname");
        System.out.println("================================");
        System.out.println(actualFirstName);
        String lastName = response.xmlPath().getString("booking.lastname");
        System.out.println("================================");
        System.out.println(lastName);
    }

    
}
