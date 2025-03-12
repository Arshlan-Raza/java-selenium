package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningDropDown {
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    }
    
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/selectmenu/");

        driver.switchTo().frame(0);

        WebElement firstOption = driver.findElement(By.xpath("//span[@id='speed-button']"));
        firstOption.click();

        driver.findElement(By.xpath("//li[@class='ui-menu-item']//div[text()='Fast']")).click();

        driver.quit();
    }
}
