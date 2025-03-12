package practicingScenarios;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFile {
    
    static {
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    }

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/FileUpload.html");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
  
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text() = 'Browse …']")));
        
        // Now upload the file directly using the input field
        File resume = new File("D:\\Placement\\Resumes\\resumedummy_.pdf");
        String path = resume.getAbsolutePath();
        
        // Use the input element directly to send the file path
        driver.findElement(By.id("input-4")).sendKeys(path);
    }
    
}
