package taskOne;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomatingTaskOne {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	
	public static void myScenario(WebDriver driver) throws AWTException {
		
		driver.get("https://gfsstore.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		String currWindow = driver.getWindowHandle();
		
//		driver.switchTo().frame(0);
//		WebElement closeChatBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mat-mdc-button-touch-target']")));
//		closeChatBox.click();


		Robot rbt = new Robot();
		rbt.mouseMove(1460, 370);
		rbt.mousePress(InputEvent.BUTTON1_DOWN_MASK);	
		rbt.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
//		driver.switchTo().window(currWindow);
		
		WebElement signUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu-item-21']")));
		signUp.click();
		
		driver.switchTo().frame(0);
		
		WebElement createAccount = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Account")));
		
		createAccount.click();
		
		
	}
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver() ;
		AutomatingTaskOne t = new AutomatingTaskOne();
		t.myScenario(driver);
		
	}

}
