package mavenproject.apitests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HealthCheckTest extends BaseTest{
    
    @Test
    public void HealthCheckTest(){
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();

        given()
            .spec(spec).
        when().
            get("/ping").
            then().
            assertThat().
            statusCode(201);


    }

    @Test
    public void headersAndCookies(){
        Header header = new Header("some name", "some value");
        spec.header(header);

        Cookie someCookie = new Cookie.Builder("some cookie name", "some cookie value").build();
        spec.cookie(someCookie);
        // Response response = RestAssured.given(spec).get("/ping");
        Response response = RestAssured.given(spec).cookie("Test cookie name ", "Test cookie value").
        header("Testheader", "test header value").
        log().all().
        get("/ping");
        
        
        //get headers
        Headers headers = response.getHeaders();
        System.out.println("----------------------------------");
        System.out.println("Headers" + headers);
        System.out.println("----------------------------------");

        Header serverHeader1 = headers.get("Server");
        System.out.println(serverHeader1.getName() + ": " + serverHeader1.getValue());

        String serverHeader2 = response.getHeader("Server");

        System.out.println(serverHeader2);


        System.out.println("----------------------------------");
        Cookies cookies = response.getDetailedCookies();
        System.out.println("cookies = " + cookies);
        System.out.println("----------------------------------");



    }
}
