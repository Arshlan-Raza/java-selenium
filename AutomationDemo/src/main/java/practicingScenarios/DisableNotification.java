package practicingScenarios;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DisableNotification {
    
    static {
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    }

    public static void main(String[] args) {
      ChromeOptions options = new ChromeOptions() ;
      options.addArguments("--disable-notifications");
      WebDriver driver = new ChromeDriver (options) ;
      driver.manage().deleteAllCookies();
      driver.get("http://www.yatra.com"); 
    }
}
