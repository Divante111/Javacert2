package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




// @RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:/JavaTest1/myproject/src/test/java/resources/features",
    glue = "C:/JavaTest1/myproject/src/test/java/stepdefinitions",
    plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}, 
    // monochrome = true,
    dryRun=true
    // tags = "@SmokeTest"
)
    ///the extended class houses everything we need to run cucumber scenarios
public class testNGTestRunner extends AbstractTestNGCucumberTests{
    
}

    



