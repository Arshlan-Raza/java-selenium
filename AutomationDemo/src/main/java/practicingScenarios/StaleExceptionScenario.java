package practicingScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleExceptionScenario {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.actitime.com/free-online-trial");
		
		WebElement login = driver.findElement(By.id("FirstName"));
		WebElement pass = driver.findElement(By.id("LastName"));
		WebElement email = driver.findElement(By.id("Email"));
		
		login.sendKeys("hey");
		pass.sendKeys("123");
		email.sendKeys("fjd@jg.com");
		
		WebElement loginBtn = driver.findElement(By.id("confirm-button"));
		loginBtn.click();
		
		login.sendKeys("hey");
		pass.sendKeys("123");
		email.sendKeys("fjd@jg.com");
		loginBtn.click();
	}

}
