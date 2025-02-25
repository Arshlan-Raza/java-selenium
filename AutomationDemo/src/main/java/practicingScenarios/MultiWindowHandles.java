package practicingScenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiWindowHandles {
    static {
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    }
    
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        
        String mainWindow = driver.getWindowHandle();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        WebElement btn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Open New Seperate Windows']")));
        WebElement btn2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@onclick='newwindow()']")));
        
        btn.click();
        btn2.click();
        
        Set<String> allWindowHandles = driver.getWindowHandles();
        
        for (String win : allWindowHandles) {
            if (!win.equals(mainWindow)) {
                driver.switchTo().window(win);
                System.out.println("Switched to New Window: " + driver.getTitle());
                driver.switchTo().window(mainWindow);
                btn.click();
                btn2.click();
                allWindowHandles = driver.getWindowHandles();
            }
        }
        
//        driver.quit();
    }
}
