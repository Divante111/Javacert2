package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager  {
    private static WebDriver driver;

    // Method to initialize the WebDriver instance
    public static WebDriver getDriver() {
        if (driver == null) {
            // Initialize your WebDriver instance here
            driver = new ChromeDriver(); // Example for ChromeDriver; use as per your setup
        }
        return driver;
    }

    // Method to quit the WebDriver instance
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
}
}
