package mavenproject.steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps {

    WebDriver chromedriver = Hooks.chromedriver;
    WebDriver firefoxDriver = Hooks.firefoxDriver;
    

    @SuppressWarnings("deprecation")
    public void setRemoteBrowser() throws MalformedURLException{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.WINDOWS);
        // Add node-specific capabilities if required (e.g., platformName, browserVersion)
        this.chromedriver = new RemoteWebDriver(new URL("http://192.168.1.141:4444/"), caps);
        chromedriver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            chromedriver.manage().window().maximize();
            chromedriver.get("https://www.saucedemo.com");
    }


    public void setupCromeDriver(){
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\JavaTest1\\drivers\\chromedriver.exe");
            this.chromedriver = new ChromeDriver();
            chromedriver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            chromedriver.manage().window().maximize();
            chromedriver.get("https://www.saucedemo.com");
    }
    @When("I close the browser")
    public void tearDown() {
        if (chromedriver != null) {
            chromedriver.quit(); // Quit WebDriver instance
        }
    }

    @Given ("I am on the saucedemo login page")
    public void saucedemo_login() throws MalformedURLException{
        setRemoteBrowser();
        chromedriver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/";

        Assert.assertEquals(chromedriver.getCurrentUrl() , expectedURL);
    }

    @Then("I login with {string}> and {string}>")
    public void i_login_with_and(String string, String string2) {
        String username = "standard_user";
        String password = "secret_sauce";
        System.out.println("This ran");

         try{
            chromedriver.findElement(By.xpath( "//input[@placeholder='Username']")).sendKeys(username);
            chromedriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
            Thread.sleep(3000);
            chromedriver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
            Thread.sleep(3000);
        } catch (Exception e){
            ;
        }
    }
    @When("I check the url I am on {string}")
    public void i_check_the_url_i_am_on(String string) {
        Assert.assertEquals(chromedriver.getCurrentUrl(), string);
       
}

@Given("I try to turn on two browswers at the same time")
public void i_try_to_turn_on_two_browswers_at_the_same_time() {
    // Write code here that turns the phrase above into concrete actions
    try{
        
        setRemoteBrowser();

        
        for(int i = 0; i <= 5; i++){
            Thread.sleep(2000);
            System.out.println("first scenario:" + "iteration= " + i);
            
        }
    } catch (Exception e){
        ;
    }
  
}
@Given("The third test")
public void the_third_test() throws MalformedURLException {
    setRemoteBrowser();
    // Write code here that turns the phrase above into concrete actions
    try{
        for(int i = 0; i <= 5; i++){
            Thread.sleep(2000);
            System.out.println("second scenario:" + "iteration= " + i);
            
        }
    } catch (Exception e){
        ;
    }

}

@Given("I am testing this out")
public void i_am_testing_this_out() throws MalformedURLException {
    setRemoteBrowser();
    
    try{
        for(int i = 0; i <= 5; i++){
            Thread.sleep(2000);
            System.out.println("third scenario:" + "iteration= " + i);
            
        }
    } catch (Exception e){
        ;
    }
}

@Given("New feature file two")
public void new_feature_file_two() throws MalformedURLException {
    setRemoteBrowser();
    try{
        for(int i = 0; i <= 5; i++){
            Thread.sleep(2000);
            System.out.println("second scenario second feature file:" + "iteration= " + i);
            
        }
    } catch (Exception e){
        ;
    }
}
    
@Given("New feature file three")
public void new_feature_file_three() throws MalformedURLException {
    setRemoteBrowser();
    try{
        for(int i = 0; i <= 5; i++){
            Thread.sleep(2000);
            System.out.println("third scenario second feature file:" + "iteration= " + i);
            
        }
    } catch (Exception e){
        ;
    }
    
}

@Given("New feature file one")
public void new_feature_file_one() throws MalformedURLException {
    setRemoteBrowser();
    try{
        for(int i = 0; i <= 5; i++){
            Thread.sleep(2000);
            System.out.println("first scenario second feature file:" + "iteration= " + i);
            
        }
    } catch (Exception e){
        ;
    }
    
}
}
