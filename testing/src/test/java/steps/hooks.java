package steps;

import io.cucumber.java.After;

public class hooks {
    // allows you to execute methods before certain feature tags
    // @Before("@verifyCart")
    // public void netBankingSetup(){
    //     WebDriver driver = WebDriverManager.getDriver();
    //     driver.manage().window().maximize();
    //     driver.get("https://www.saucedemo.com");
    // }

    // @Before("@OtherTest")
    public void mortgateSetup(){
        System.out.println("**********************************");
        System.out.println("setup the entries in Mortgage database");
    }

    @After
    public void tearDown() {
        
        if (SecondSteps.driver != null) {
            SecondSteps.driver.quit(); // Quit WebDriver instance
        }
    }
    }

// order of execution in .feature files
// Before -> Background -> Scenario -> After
