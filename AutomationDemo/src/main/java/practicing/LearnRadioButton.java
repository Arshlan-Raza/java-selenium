package practicing;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnRadioButton {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.singaporeair.com/en_UK/in/home?gclid=3bf0f7a69c2b1dca9b2b901b07e41046&gclsrc=3p.ds&&utm_source=Microsoft&utm_medium=cpc&utm_campaign=SG-HO_IN_SEM_SQ-BM_ACQ_BRANDPURE_B_EXT_09191223-EN&utm_term=singapore%20airlines&utm_content=singapore%20airlines&gclid=3bf0f7a69c2b1dca9b2b901b07e41046&gclsrc=3p.ds#/book/bookflight");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        js.executeScript("window.scrollBy(0,400)");

//        WebElement radio1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='bookFlights']")));
//        WebElement radio2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='redeemFlights']")));
        
        WebElement radio1 = driver.findElement(By.xpath("//input[@id='bookFlights']"));
        WebElement radio2 = driver.findElement(By.xpath("//input[@id='redeemFlights']"));

        radio2.click();
        System.out.println(radio2.isSelected());
    }
}
