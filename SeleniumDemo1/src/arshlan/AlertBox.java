package arshlan;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'prompt box')]/following::button[text()='Click Me'][1]")).click();
		
		Thread.sleep(3000);
		Alert alert = new WebDriverWait(driver,Duration.ofSeconds(8)).until(ExpectedConditions.alertIsPresent()) ;
		String getAlertMessage = alert.getText();
		alert.sendKeys("Arshlan");
		Thread.sleep(5000);
		
		System.out.println(getAlertMessage);
		alert.dismiss() ;
		Thread.sleep(10000);
		
		driver.close() ;
	}
		
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver() ;
		AlertBox.myTest(driver);
		
	}
	

}
