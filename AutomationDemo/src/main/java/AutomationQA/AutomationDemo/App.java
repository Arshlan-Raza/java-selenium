package AutomationQA.AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	
    public static void main( String[] args ){
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.gigacalculator.com/randomizers/random-date-generator.php");
        driver.findElement(By.xpath("//div[@class='col-6']//input[@class='form-control']")).click();

    }
}
