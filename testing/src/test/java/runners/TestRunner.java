package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
// import io.cucumber.testng.AbstractTestNGCucumberTests;

// if you want to run specific tags you can add them to the tags attribute
// you can use and, or, and not -- may be more.
// plugin is what type of reports you want and whre they should be located after running
// steps are were cucumber commands are housed
// When dryRun is set to true, Cucumber performs a syntax check on the feature files to detect any errors or undefined steps in your step definitions.
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"C:\\JavaTest1\\testing\\src\\test\\java\\resources\\features\\testing.feature"},
    // dryRun = true,
    glue = "steps",
    plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, 
    monochrome = true
    // tags = "@test"
)
//extends AbstractTestNGCucumberTests
public class TestRunner  {
    public static void main(String[] args) {
 
    }
    

}

