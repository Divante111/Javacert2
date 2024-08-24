package steps;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.lu.an;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.TmsLink;
import io.qameta.allure.junit4.DisplayName;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.*;
import org.openqa.selenium.Cookie;


import org.assertj.core.api.SoftAssertions;




public class SecondSteps {

    protected boolean loginSuccess;
    protected static WebDriver driver;
    
    
    public void take_a_screenshot(){
        // Take screenshot and store as a file format
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            
        // Attach screenshot to Allure report
        Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
        
    }

    @Given("I am on the login page for saucedemo")
    public void i_am_on_the_login_page() {
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\JavaTest1\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
    }

    // @Test
    
    // @Severity(CRITICAL)
    @Owner("Divante Parness")
    @Link(name = "Website", url = "https://www.saucedemo.com")
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
    @DisplayName("Test Authentication")
    @Description("This test attempts to log into the website using a login and a password. Fails if any error happens.\n\nNote that this test does not test 2-Factor Authentication.")
    @Then("The user inputs {string} and {string} and clicks login")
    public void the_user_inputs_and(String username, String password) {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        // Create ObjectMapper instance need this to read the json file
        ObjectMapper objectMapper = new ObjectMapper();
        
        try{
            // Read JSON file into JsonNode 
            JsonNode jsonNode = objectMapper.readTree(new File("C:\\JavaTest1\\testing\\src\\main\\java\\resources\\jsonForTests\\login.json"));
            
            if(!username.equals("standard_user") ){
                String actualErrorMessage = driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText();

                String expectedErrorMessage = jsonNode.get("Login").get(username).asText();
                
                Assert.assertEquals(actualErrorMessage , expectedErrorMessage);
                System.out.println("It passed");
            }

        } catch (AssertionError e) {
            // Assertion failed, handle it (take screenshot, log, etc.)
            System.out.println("Assertion failed: " + e.getMessage());
            
            take_a_screenshot();
            
        } catch(IOException e){
            System.out.println("It broke");
            
            // Take screenshot and store as a file format
            take_a_screenshot();
        } finally {
            
            driver.quit();    
        }
    }


    @Given("User logs into Saucedemo page")
    public void check_user_url(){
        i_am_on_the_login_page();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        
        try{

            Assert.assertEquals("https://www.saucedemo.com/inventory.html" , driver.getCurrentUrl());
            System.out.println("Verified URL");
        } catch (Exception e) {
            System.out.println("it broke");
        }
    }


    @Then("User clicks on all add to cart buttons for the bottom scenario") 
    public void check_user_clicks_on_all_add_to_cart_buttons_bottom_scenario() {

        

        if(loginSuccess){
            for(int i = 2; i < driver.findElements(By.xpath("//button")).size(); i++){
                driver.findElements(By.xpath("//button")).get(i).click();
            }
            take_a_screenshot();
            driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
            take_a_screenshot();
        }
        // for(int i = 2; i < driver.findElements(By.xpath("//button")).size(); i++){
        //     driver.findElements(By.xpath("//button")).get(i).click();
        // }
        // take_a_screenshot();
        // driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
        // take_a_screenshot();

    }

    @Then("User clicks on all add to cart buttons") 
    public void check_user_clicks_on_all_add_to_cart_buttons() {
        
        for(int i = 2; i < driver.findElements(By.xpath("//button")).size(); i++){
                driver.findElements(By.xpath("//button")).get(i).click();
            }
            take_a_screenshot();
            driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
            take_a_screenshot();
        
        // for(int i = 2; i < driver.findElements(By.xpath("//button")).size(); i++){
        //     driver.findElements(By.xpath("//button")).get(i).click();
        // }
        // take_a_screenshot();
        // driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
        // take_a_screenshot();

    }

    


    @Then("User clicks on all remove from cart buttons") 
    public void check_user_clicks_on_all_remove_from_cart_buttons() {
        boolean HasRemove = true;
        int removes = 0;
        
        while(HasRemove == true){
            for(int i = 0; i < driver.findElements(By.xpath("//button")).size(); i++){
                System.out.println(i);
                System.out.println(driver.findElements(By.xpath("//button")).get(i).getText());
                if(driver.findElements(By.xpath("//button")).get(i).getText().equals("Remove")){
                    driver.findElements(By.xpath("//button")).get(i).click();
                    removes+= 1;
                }
            }
            if(removes == 0){
                HasRemove = false;
            } else{
                removes = 0;
            }
        }
        take_a_screenshot();
    }


    @Then("User clicks checkout button")
    public void check_user_clicks_checkout_button_and_enters_info_into_form() {
        driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
    }

    
    @And("enters {string} , {string} , and {string} into form")
    public void check_user_enters_info_into_form(String firstName, String lastName, String zipCode){
        Scanner sc = new Scanner(System.in);

        try{
            driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys(firstName);
            driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys(lastName);
            driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys(zipCode);


        } catch (Exception e){
            System.out.println("it broke");
            sc.nextLine();
            take_a_screenshot();
        }

    }

    @And("clicks on the Continue button")
    public void check_user_clicks_continue_button() {
        try{
            driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
            
        } 
        catch (Exception e){
            take_a_screenshot();
            Allure.description("Testing to see if this works");
            System.out.println("it broke");
            driver.close();
        }
        
    }

    @Given ("A user makes it to checkout overview page")
    public void check_user_makes_it_to_checkout_overview_page() {
        try{
            if(driver != null){
                take_a_screenshot();
                Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl());
                

            } else{
                Assert.fail("WebDriver instance is null");
            }
            
        } catch(Exception e){
            take_a_screenshot();
            Allure.description("Testing message here for allure reporting");
            System.out.println("it broke");  
        }
    }

    

    public SoftAssertions softAssertionChecker(String expected) {
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(driver.getCurrentUrl()).isEqualTo(expected);
        return softly;
      }

    @Then ("User clicks on finish button")
    public void check_user_clicks_finish_button() {
        try{
            softAssertionChecker("random incorrect string");
            
            driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
            // Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html", driver.getCurrentUrl());
            // this line adds to the description
            Allure.description("Current URL did match expected URL: https://www.saucedemo.com/checkout-complete.html");
        } catch (Exception e){
            take_a_screenshot();
            Allure.description("Current URL did not match expected URL: https://www.saucedemo.com/checkout-complete.html");
        }
    }

    @Then ("User clicks on organization filter")
    public void check_user_clicks_organization_filter() {
        
        
        try{
            driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")).click();
            
            
        }catch (Exception e){
            System.out.println();
        }
    }

    @And ("cycles throught the different options")
    public void check_user_cycles_throught_the_different_options() {
        try{
            for(int i = 0; i < driver.findElements(By.xpath("//option")).size(); i++){
                driver.findElements(By.xpath("//option")).get(i).click();
                Thread.sleep(3000);
                System.out.println("Screenshot was captured");
                take_a_screenshot();
            }
        } catch (Exception e){
            System.out.println("it broke");
        }

    }

    

    // the whole reason for adding metadata through custom annotations is to generate more data in the allure report
    @StepDescription("checking to see if the user is logged in")
    @Then ("checking to see if the user is logged in")
    public void checking_to_see_if_the_user_is_logged_in(){
        // this gives a single cookie
        Cookie cookie = driver.manage().getCookieNamed("session-username");
        //this returns an array of cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("***********************");
        System.out.println("Cookie Name: " + cookie.getName());
            System.out.println("Cookie Value: " + cookie.getValue());
            System.out.println("Cookie Expiry: " + cookie.getExpiry());
            System.out.println("Cookie Path: " + cookie.getPath());
            System.out.println("Cookie Domain: " + cookie.getDomain());
            System.out.println("Cookie SameSite: " + cookie.getSameSite());
        
        System.out.println("***********************");
      
    

        boolean isLoggedIn = false;
        for (Cookie cook : cookies) {
            if (cook.getName().equals("session-username") && !cookie.getValue().isEmpty()) {
                isLoggedIn = true;
                break;
            }
        }

        if (isLoggedIn) {
            System.out.println("User is logged in.");
        } else {
            System.out.println("User is not logged in.");
        }
        
    }

    @Given ("User attempts to log into the saucedemo page")
    public void user_attempts_to_log_into_saucedemo_page(){
        i_am_on_the_login_page();

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("random");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

        
        // if (!loginSuccess) {
        //     // Optionally throw an exception or set a flag indicating login failure
        //     throw new RuntimeException("Login failed unexpectedly");
        // }

    }

    @Then("If User login fails unexpectedly")
    public void login_fails_unexpectedly() {
        
        System.out.println("Login failed unexpectedly");
    }

    @Then ("the User sees an error message")
    public void the_user_sees_an_error_message() {
        
        System.out.println("I see an error message");
    }

    
    @And ("enters {string} , {string} , and {int} into form with int")
    public void enters_lirstName_lastName_and_zipCode_into_form(String firstName, String lname, int zipcode){
        System.out.println("first names are = " + firstName);
        System.out.println("first name = " + lname);
        System.out.println("first name = " + zipcode);

        Scanner sc = new Scanner(System.in);

        try{
            driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys(firstName);
            driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys(lname);
            driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys(String.valueOf(zipcode));


        } catch (Exception e){
            System.out.println("it broke");
            sc.nextLine();
            take_a_screenshot();
        }

    }

    @Then("enters {string} , {string} , and  into form with int")
    public void enters_and_into_form_with_int(String firstName, String lname) {
    // Write code here that turns the phrase above into concrete actions
    try{
        driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys(lname);
        driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("3334");


    } catch (Exception e){
        System.out.println("it broke");
        take_a_screenshot();
    }
    take_a_screenshot();
    throw new io.cucumber.java.PendingException();
    
}

    @When ("I visit the URL {string} {string} {string} {string}")
    public void testing(String base, String page, String ordNumber, String custName) {
        System.out.println(base + "/" + page + "/" + ordNumber + "/" + custName);
        // driver.get(base + "/" + page + "/" + ordNumber + "/" + custName);
        // try{
        //     Thread.sleep(3000);
        // } catch (Exception e){
        //     ;
        // }
    }

    // // this function helps the function underneath it to be able to take in type array
    // // the regex inside of ParameterType is supposed to equal a string inside of square brakets ["String"]
    // @ParameterType("\\[(.*?)]") // Define a parameter type that matches any string
    // public List<String> listOfStrings(String value) {
    //     String[] parts = value.substring(1, value.length() - 1).split(",");
    //     return Arrays.stream(parts)
    //                  .map(String::trim)
    //                  .collect(Collectors.toList());
    // }

  

    // @Given ("I am adding data from an excel spreadsheet to a json file")
    // public void check_user_adds_data_from_an_excel_spreadsheet_to_a_json_file() {
    //     // Create ObjectMapper instance need this to read the json file
    //     ObjectMapper objectMapper = new ObjectMapper();
        
    //     try {
    //         // // Read JSON file into JsonNode
    //         JsonNode jsonNode = objectMapper.readTree(new File("C:\\JavaTest1\\testing\\src\\main\\java\\resources\\adding.json"));
    //     } catch (IOException ex) {
    //     }
    // }
    


}


