package arshlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveSendKeys {

	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void myTest(WebDriver driver) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement user = driver.findElement(By.xpath("//div[@class='orangehrm-login-layout']//input[@placeholder= 'Username']"));
		user.sendKeys("Admin");
		WebElement pass = driver.findElement(By.xpath("//div[@class='orangehrm-login-layout']//input[@placeholder= 'Password']"));
		pass.sendKeys("admin123");
		driver.findElement(By.xpath("//div[@class='orangehrm-login-layout']//button[text()=' Login ']")).click();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver() ;
		ActiveSendKeys.myTest(driver);
	}
}

