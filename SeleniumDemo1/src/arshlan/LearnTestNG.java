package arshlan;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnTestNG {

    static {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    }

    @Test
    public void testGoogleTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        String expectedTitle = "Googgle";
        String actualTitle = driver.getTitle();
        
        // Assertion to verify the title of the page
        Assert.assertEquals(actualTitle, expectedTitle);
        
        driver.quit();
    }
}
