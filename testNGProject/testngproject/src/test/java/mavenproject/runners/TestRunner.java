package mavenproject.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = "C:\\JavaProjects\\TestingProject\\secondTry\\testNGProject\\testngproject\\src\\main\\java\\mavenproject\\resources\\test.feature",
    glue = "mavenproject.steps",
    plugin = {"pretty", "html:target/cucumber-report.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
    
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
            return super.scenarios();
        }
}

