package arshlan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class RobotClass {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.codehelp.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Articles"))).click();
		
		Robot rbt = new Robot() ;
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		driver.close();
		
	}

}
