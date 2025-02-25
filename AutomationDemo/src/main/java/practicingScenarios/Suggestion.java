package practicingScenarios;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suggestion {

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("http://www.google.com");

        WebElement input = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        input.sendKeys("how");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));

        List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='eIPGRd']"));
        
        System.out.println("Number of suggestions: " + allSuggestions.size());

        for (WebElement suggestion : allSuggestions) {
            System.out.println(suggestion.getText());
        }

        if (allSuggestions.size() > 1) {
            allSuggestions.get(0).click();
        }

        
//        driver.quit();
    }
}
