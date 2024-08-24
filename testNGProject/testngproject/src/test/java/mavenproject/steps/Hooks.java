package mavenproject.steps;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class Hooks {
    public static WebDriver chromedriver;
    public static WebDriver firefoxDriver;
    /**
     * @BeforeSuite: This method runs once before all test suites in your project are executed. 
     * Use it for global setup tasks, like database connections or initial configuration.
     */

    /**
     * @AfterSuite: This method runs once after all test suites have finished execution. 
     * Use it for global teardown tasks, like closing database connections or cleanup activities.
     */

     /**
      * @Before runs before every scenario
      */
    //   @Before
    //   public void setup(){
    //     System.setProperty(
    //         "webdriver.chrome.driver",
    //         "C:\\JavaTest1\\drivers\\chromedriver.exe");
    //         this.chromedriver = new ChromeDriver();
    //         chromedriver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    //         chromedriver.manage().window().maximize();
    //         chromedriver.get("https://www.saucedemo.com");

    //         System.setProperty(
    //         "webdriver.gecko.driver",
    //         "C:\\JavaTest1\\drivers\\geckodriver.exe");
    //         this.firefoxDriver = new FirefoxDriver();
    //         firefoxDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    //         firefoxDriver.manage().window().maximize();
    //         firefoxDriver.get("https://www.saucedemo.com");
    //   }

      /**
       * @AfterMethod: This method runs after each test method execution, regardless of pass/fail status. 
       * It's useful for per-test cleanup activities, like closing files.
       */
      @AfterMethod
      @After
        public void tearDown() {
            if (chromedriver != null) {
                chromedriver.quit(); // Quit WebDriver instance
            }
        }



}
