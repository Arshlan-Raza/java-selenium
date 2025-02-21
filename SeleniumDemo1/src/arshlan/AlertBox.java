package arshlan;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBox {
    
    static {
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    }
    
    public static void myTest(WebDriver driver) throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.manage().window().maximize();
        
        // Click on the button to open the prompt box
        driver.findElement(By.xpath("//*[contains(text(),'prompt box')]/following::button[text()='Click Me'][1]")).click();
        
        // Wait for the alert to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        
        // Debugging message
        System.out.println("Alert detected!");
        
        // Get alert message
        String getAlertMessage = alert.getText();
        System.out.println("Alert message: " + getAlertMessage);
        
        
        // Send text to the prompt box
        alert.sendKeys("Arshlan");
        Thread.sleep(4000);
        
        // Accept the alert
        alert.accept();
        Thread.sleep(4000);
        
        // Wait for 5 seconds
        Thread.sleep(5000);
        
        // Close the browser
        driver.quit();
    }
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        AlertBox.myTest(driver);
    }
}
