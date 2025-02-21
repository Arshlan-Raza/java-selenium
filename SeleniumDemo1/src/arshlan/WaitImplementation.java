package arshlan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitImplementation {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void myTest(WebDriver driver) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		
		// instead of using this we will just see how the wait function works
		WebElement user = new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		WebElement pass = new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='password']"))));
		
		sendKeys(driver,user,30,"Admin");
		sendKeys(driver,pass,30,"admin123");
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		
	}
	
	public static void sendKeys(WebDriver driver1,WebElement element, int i,String value) {
		new WebDriverWait(driver1, Duration.ofSeconds(i)).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		WaitImplementation.myTest(driver);
		
	}
	

}
