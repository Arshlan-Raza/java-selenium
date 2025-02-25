package practicingScenarios;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrivagoSuggestion {

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.trivago.in/");

        WebElement input = driver.findElement(By.xpath("//input[@class='BIGGQd eAHl1t SwVR4I']"));
        input.sendKeys("B");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='QogZbw SwVR4I']")));

        List<WebElement> allSuggestions = driver.findElements(By.xpath("//li[@class='_1dRr6B']"));
        
        System.out.println("Number of suggestions: " + allSuggestions.size());

        for (WebElement suggestion : allSuggestions) {
            System.out.println(suggestion.getText());
        }
        
        allSuggestions.get(0).click();

        

        
//        driver.quit();
    }
}
